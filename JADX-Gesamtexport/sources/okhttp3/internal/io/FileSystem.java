package okhttp3.internal.io;

import E4.k;
import h5.A;
import h5.AbstractC0724b;
import h5.C0726d;
import h5.K;
import h5.M;
import h5.P;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public K appendingSink(File file) {
                int i = 1;
                k.f("file", file);
                try {
                    Logger logger = A.f9308a;
                    return new C0726d(new FileOutputStream(file, true), i, new P());
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    Logger logger2 = A.f9308a;
                    return new C0726d(new FileOutputStream(file, true), i, new P());
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                k.f("file", file);
                if (!file.delete() && file.exists()) {
                    throw new IOException(k.l("failed to delete ", file));
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
                k.f("directory", file);
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(k.l("not a readable directory: ", file));
                }
                int length = fileArrListFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = fileArrListFiles[i];
                    i++;
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException(k.l("failed to delete ", file2));
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                k.f("file", file);
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
                k.f("from", file);
                k.f("to", file2);
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public K sink(File file) {
                int i = 1;
                k.f("file", file);
                try {
                    Logger logger = A.f9308a;
                    return new C0726d(new FileOutputStream(file, false), i, new P());
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    Logger logger2 = A.f9308a;
                    return new C0726d(new FileOutputStream(file, false), i, new P());
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                k.f("file", file);
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public M source(File file) {
                k.f("file", file);
                return AbstractC0724b.i(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    K appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    K sink(File file);

    long size(File file);

    M source(File file);
}
