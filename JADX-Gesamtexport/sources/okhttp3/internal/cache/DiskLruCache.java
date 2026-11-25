package okhttp3.internal.cache;

import E4.g;
import E4.k;
import F4.a;
import M4.j;
import M4.l;
import M4.s;
import S1.h0;
import h5.AbstractC0724b;
import h5.C0729g;
import h5.F;
import h5.G;
import h5.InterfaceC0733k;
import h5.K;
import h5.M;
import h5.t;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache implements Closeable, Flushable, AutoCloseable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private InterfaceC0733k journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final j LEGAL_KEY_PATTERN = new j("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            k.f("this$0", diskLruCache);
            k.f("entry", entry);
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        public final void abort() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (k.a(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void commit() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (k.a(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void detach$okhttp() {
            if (k.a(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final K newSink(int i) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!k.a(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        return new C0729g();
                    }
                    if (!getEntry$okhttp().getReadable$okhttp()) {
                        boolean[] written$okhttp = getWritten$okhttp();
                        k.c(written$okhttp);
                        written$okhttp[i] = true;
                    }
                    try {
                        return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(getEntry$okhttp().getDirtyFiles$okhttp().get(i)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                    } catch (FileNotFoundException unused) {
                        return new C0729g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final M newSource(int i) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                M mSource = null;
                if (!getEntry$okhttp().getReadable$okhttp() || !k.a(getEntry$okhttp().getCurrentEditor$okhttp(), this) || getEntry$okhttp().getZombie$okhttp()) {
                    return null;
                }
                try {
                    mSource = diskLruCache.getFileSystem$okhttp().source(getEntry$okhttp().getCleanFiles$okhttp().get(i));
                } catch (FileNotFoundException unused) {
                }
                return mSource;
            }
        }
    }

    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            k.f("this$0", diskLruCache);
            k.f("key", str);
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException(k.l("unexpected journal line: ", list));
        }

        private final M newSource(int i) {
            final M mSource = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (this.this$0.civilizedFileSystem) {
                return mSource;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new t(diskLruCache, this) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;
                final /* synthetic */ DiskLruCache this$0;
                final /* synthetic */ DiskLruCache.Entry this$1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.$fileSource);
                    this.this$0 = diskLruCache;
                    this.this$1 = this;
                }

                @Override // h5.t, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    DiskLruCache diskLruCache2 = this.this$0;
                    DiskLruCache.Entry entry = this.this$1;
                    synchronized (diskLruCache2) {
                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                        if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                            diskLruCache2.removeEntry$okhttp(entry);
                        }
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
            k.f("strings", list);
            if (list.size() != this.this$0.getValueCount$okhttp()) {
                invalidLengths(list);
                throw new KotlinNothingValueException();
            }
            try {
                int size = list.size();
                int i = 0;
                while (i < size) {
                    int i3 = i + 1;
                    this.lengths[i] = Long.parseLong(list.get(i));
                    i = i3;
                }
            } catch (NumberFormatException unused) {
                invalidLengths(list);
                throw new KotlinNothingValueException();
            }
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z5) {
            this.readable = z5;
        }

        public final void setSequenceNumber$okhttp(long j4) {
            this.sequenceNumber = j4;
        }

        public final void setZombie$okhttp(boolean z5) {
            this.zombie = z5;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + diskLruCache);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            int i = 0;
            try {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i3 = 0; i3 < valueCount$okhttp; i3++) {
                    arrayList.add(newSource(i3));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Util.closeQuietly((M) obj);
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(InterfaceC0733k interfaceC0733k) {
            k.f("writer", interfaceC0733k);
            long[] jArr = this.lengths;
            int length = jArr.length;
            int i = 0;
            while (i < length) {
                long j4 = jArr[i];
                i++;
                interfaceC0733k.A(32).P(j4);
            }
        }
    }

    public final class Snapshot implements Closeable, AutoCloseable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<M> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j4, List<? extends M> list, long[] jArr) {
            k.f("this$0", diskLruCache);
            k.f("key", str);
            k.f("sources", list);
            k.f("lengths", jArr);
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j4;
            this.sources = list;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<M> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        public final Editor edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final M getSource(int i) {
            return this.sources.get(i);
        }

        public final String key() {
            return this.key;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<Snapshot>, a {
        private final Iterator<Entry> delegate;
        private Snapshot nextSnapshot;
        private Snapshot removeSnapshot;

        public AnonymousClass1() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            k.e("ArrayList(lruEntries.values).iterator()", it);
            this.delegate = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextSnapshot != null) {
                return true;
            }
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (diskLruCache.getClosed$okhttp()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    Entry next = this.delegate.next();
                    Snapshot snapshotSnapshot$okhttp = next == null ? null : next.snapshot$okhttp();
                    if (snapshotSnapshot$okhttp != null) {
                        this.nextSnapshot = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            Snapshot snapshot = this.removeSnapshot;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                DiskLruCache.this.remove(snapshot.key());
            } catch (IOException unused) {
            } finally {
                this.removeSnapshot = null;
            }
        }

        @Override // java.util.Iterator
        public Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            k.c(snapshot);
            return snapshot;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File file, int i, int i3, long j4, TaskRunner taskRunner) {
        k.f("fileSystem", fileSystem);
        k.f("directory", file);
        k.f("taskRunner", taskRunner);
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i3;
        this.maxSize = j4;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String strL = k.l(Util.okHttpName, " Cache");
        this.cleanupTask = new Task(strL) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                DiskLruCache diskLruCache = this.this$0;
                synchronized (diskLruCache) {
                    if (!diskLruCache.initialized || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        if (diskLruCache.journalRebuildRequired()) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = AbstractC0724b.b(new C0729g());
                    }
                    return -1L;
                }
            }
        };
        if (j4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
    }

    private final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j4, int i, Object obj) {
        if ((i & 2) != 0) {
            j4 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    private final InterfaceC0733k newJournalWriter() {
        return AbstractC0724b.b(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            k.e("i.next()", next);
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i3 = this.valueCount;
                while (i < i3) {
                    this.size += entry.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i6 = this.valueCount;
                while (i < i6) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() throws IllegalAccessException, IOException, InvocationTargetException {
        G gC = AbstractC0724b.c(this.fileSystem.source(this.journalFile));
        try {
            String strH = gC.H(Long.MAX_VALUE);
            String strH2 = gC.H(Long.MAX_VALUE);
            String strH3 = gC.H(Long.MAX_VALUE);
            String strH4 = gC.H(Long.MAX_VALUE);
            String strH5 = gC.H(Long.MAX_VALUE);
            if (!k.a(MAGIC, strH) || !k.a(VERSION_1, strH2) || !k.a(String.valueOf(this.appVersion), strH3) || !k.a(String.valueOf(getValueCount$okhttp()), strH4) || strH5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strH + ", " + strH2 + ", " + strH4 + ", " + strH5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(gC.H(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - getLruEntries$okhttp().size();
                    if (gC.z()) {
                        this.journalWriter = newJournalWriter();
                    } else {
                        rebuildJournal$okhttp();
                    }
                    gC.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(gC, th);
                throw th2;
            }
        }
    }

    private final void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iF0 = l.f0(str, ' ', 0, 6);
        if (iF0 == -1) {
            throw new IOException(k.l("unexpected journal line: ", str));
        }
        int i = iF0 + 1;
        int iF1 = l.f0(str, ' ', i, 4);
        if (iF1 == -1) {
            strSubstring = str.substring(i);
            k.e("this as java.lang.String).substring(startIndex)", strSubstring);
            String str2 = REMOVE;
            if (iF0 == str2.length() && s.W(str, str2, false)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iF1);
            k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iF1 != -1) {
            String str3 = CLEAN;
            if (iF0 == str3.length() && s.W(str, str3, false)) {
                String strSubstring2 = str.substring(iF1 + 1);
                k.e("this as java.lang.String).substring(startIndex)", strSubstring2);
                List<String> listU0 = l.u0(strSubstring2, new char[]{' '});
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listU0);
                return;
            }
        }
        if (iF1 == -1) {
            String str4 = DIRTY;
            if (iF0 == str4.length() && s.W(str, str4, false)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iF1 == -1) {
            String str5 = READ;
            if (iF0 == str5.length() && s.W(str, str5, false)) {
                return;
            }
        }
        throw new IOException(k.l("unexpected journal line: ", str));
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie$okhttp()) {
                removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        j jVar = LEGAL_KEY_PATTERN;
        jVar.getClass();
        k.f("input", str);
        if (jVar.f3545h.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor currentEditor$okhttp;
        try {
            if (this.initialized && !this.closed) {
                Collection<Entry> collectionValues = this.lruEntries.values();
                k.e("lruEntries.values", collectionValues);
                int i = 0;
                Object[] array = collectionValues.toArray(new Entry[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                Entry[] entryArr = (Entry[]) array;
                int length = entryArr.length;
                while (i < length) {
                    Entry entry = entryArr[i];
                    i++;
                    if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                InterfaceC0733k interfaceC0733k = this.journalWriter;
                k.c(interfaceC0733k);
                interfaceC0733k.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z5) {
        k.f("editor", editor);
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (!k.a(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        int i = 0;
        if (z5 && !entry$okhttp.getReadable$okhttp()) {
            int i3 = this.valueCount;
            int i6 = 0;
            while (i6 < i3) {
                int i7 = i6 + 1;
                boolean[] written$okhttp = editor.getWritten$okhttp();
                k.c(written$okhttp);
                if (!written$okhttp[i6]) {
                    editor.abort();
                    throw new IllegalStateException(k.l("Newly created entry didn't create value for index ", Integer.valueOf(i6)));
                }
                if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i6))) {
                    editor.abort();
                    return;
                }
                i6 = i7;
            }
        }
        int i8 = this.valueCount;
        while (i < i8) {
            int i9 = i + 1;
            File file = entry$okhttp.getDirtyFiles$okhttp().get(i);
            if (!z5 || entry$okhttp.getZombie$okhttp()) {
                this.fileSystem.delete(file);
            } else if (this.fileSystem.exists(file)) {
                File file2 = entry$okhttp.getCleanFiles$okhttp().get(i);
                this.fileSystem.rename(file, file2);
                long j4 = entry$okhttp.getLengths$okhttp()[i];
                long size = this.fileSystem.size(file2);
                entry$okhttp.getLengths$okhttp()[i] = size;
                this.size = (this.size - j4) + size;
            }
            i = i9;
        }
        entry$okhttp.setCurrentEditor$okhttp(null);
        if (entry$okhttp.getZombie$okhttp()) {
            removeEntry$okhttp(entry$okhttp);
            return;
        }
        this.redundantOpCount++;
        InterfaceC0733k interfaceC0733k = this.journalWriter;
        k.c(interfaceC0733k);
        if (entry$okhttp.getReadable$okhttp() || z5) {
            entry$okhttp.setReadable$okhttp(true);
            interfaceC0733k.O(CLEAN).A(32);
            interfaceC0733k.O(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(interfaceC0733k);
            interfaceC0733k.A(10);
            if (z5) {
                long j6 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j6;
                entry$okhttp.setSequenceNumber$okhttp(j6);
            }
        } else {
            getLruEntries$okhttp().remove(entry$okhttp.getKey$okhttp());
            interfaceC0733k.O(REMOVE).A(32);
            interfaceC0733k.O(entry$okhttp.getKey$okhttp());
            interfaceC0733k.A(10);
        }
        interfaceC0733k.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) {
        k.f("key", str);
        return edit$default(this, str, 0L, 2, null);
    }

    public final synchronized void evictAll() {
        try {
            initialize();
            Collection<Entry> collectionValues = this.lruEntries.values();
            k.e("lruEntries.values", collectionValues);
            Object[] array = collectionValues.toArray(new Entry[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Entry[] entryArr = (Entry[]) array;
            int length = entryArr.length;
            int i = 0;
            while (i < length) {
                Entry entry = entryArr[i];
                i++;
                k.e("entry", entry);
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            InterfaceC0733k interfaceC0733k = this.journalWriter;
            k.c(interfaceC0733k);
            interfaceC0733k.flush();
        }
    }

    public final synchronized Snapshot get(String str) {
        k.f("key", str);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
        if (snapshotSnapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        InterfaceC0733k interfaceC0733k = this.journalWriter;
        k.c(interfaceC0733k);
        interfaceC0733k.O(READ).A(32).O(str).A(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshotSnapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        try {
            if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e6) {
                    Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + ((Object) e6.getMessage()) + ", removing", 5, e6);
                    try {
                        delete();
                        this.closed = false;
                        rebuildJournal$okhttp();
                        this.initialized = true;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() {
        try {
            InterfaceC0733k interfaceC0733k = this.journalWriter;
            if (interfaceC0733k != null) {
                interfaceC0733k.close();
            }
            F fB = AbstractC0724b.b(this.fileSystem.sink(this.journalFileTmp));
            try {
                fB.O(MAGIC);
                fB.A(10);
                fB.O(VERSION_1);
                fB.A(10);
                fB.P(this.appVersion);
                fB.A(10);
                fB.P(getValueCount$okhttp());
                fB.A(10);
                fB.A(10);
                for (Entry entry : getLruEntries$okhttp().values()) {
                    if (entry.getCurrentEditor$okhttp() != null) {
                        fB.O(DIRTY);
                        fB.A(32);
                        fB.O(entry.getKey$okhttp());
                        fB.A(10);
                    } else {
                        fB.O(CLEAN);
                        fB.A(32);
                        fB.O(entry.getKey$okhttp());
                        entry.writeLengths$okhttp(fB);
                        fB.A(10);
                    }
                }
                fB.close();
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.rename(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.rename(this.journalFileTmp, this.journalFile);
                this.fileSystem.delete(this.journalFileBackup);
                this.journalWriter = newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    h0.i(fB, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized boolean remove(String str) {
        k.f("key", str);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        InterfaceC0733k interfaceC0733k;
        k.f("entry", entry);
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (interfaceC0733k = this.journalWriter) != null) {
                interfaceC0733k.O(DIRTY);
                interfaceC0733k.A(32);
                interfaceC0733k.O(entry.getKey$okhttp());
                interfaceC0733k.A(10);
                interfaceC0733k.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i3 = 0; i3 < i; i3++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i3));
            this.size -= entry.getLengths$okhttp()[i3];
            entry.getLengths$okhttp()[i3] = 0;
        }
        this.redundantOpCount++;
        InterfaceC0733k interfaceC0733k2 = this.journalWriter;
        if (interfaceC0733k2 != null) {
            interfaceC0733k2.O(REMOVE);
            interfaceC0733k2.A(32);
            interfaceC0733k2.O(entry.getKey$okhttp());
            interfaceC0733k2.A(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z5) {
        this.closed = z5;
    }

    public final synchronized void setMaxSize(long j4) {
        this.maxSize = j4;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new AnonymousClass1();
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final synchronized Editor edit(String str, long j4) {
        k.f("key", str);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j4 != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j4)) {
            return null;
        }
        if ((entry == null ? null : entry.getCurrentEditor$okhttp()) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            InterfaceC0733k interfaceC0733k = this.journalWriter;
            k.c(interfaceC0733k);
            interfaceC0733k.O(DIRTY).A(32).O(str).A(10);
            interfaceC0733k.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, str);
                this.lruEntries.put(str, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }
}
