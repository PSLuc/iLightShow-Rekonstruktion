package p119w1;

import G4.a;
import Y2.g;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import c5.C0495p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p080p.C0834f;
import p085q.b;
import p091r0.d;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f13415j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile h f13416k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f13417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0834f f13418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f13419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f13420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f13421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f13422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f13423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13424h;
    public final c i;

    public h(o oVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f13417a = reentrantReadWriteLock;
        this.f13419c = 3;
        g gVar = oVar.f13439a;
        this.f13422f = gVar;
        int i = oVar.f13440b;
        this.f13424h = i;
        this.i = oVar.f13441c;
        this.f13420d = new Handler(Looper.getMainLooper());
        this.f13418b = new C0834f(null);
        this.f13423g = new b(8);
        e eVar = new e(this);
        this.f13421e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f13419c = 0;
            } catch (Throwable th) {
                this.f13417a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new d(eVar));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static h a() {
        h hVar;
        synchronized (f13415j) {
            try {
                hVar = f13416k;
                if (!(hVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static boolean c() {
        return f13416k != null;
    }

    public final int b() {
        this.f13417a.readLock().lock();
        try {
            return this.f13419c;
        } finally {
            this.f13417a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f13424h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f13417a.writeLock().lock();
        try {
            if (this.f13419c == 0) {
                this.f13417a.writeLock().unlock();
                return;
            }
            this.f13419c = 0;
            this.f13417a.writeLock().unlock();
            e eVar = this.f13421e;
            h hVar = eVar.f13412a;
            try {
                hVar.f13422f.a(new d(eVar));
            } catch (Throwable th) {
                hVar.e(th);
            }
        } catch (Throwable th2) {
            this.f13417a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f13417a.writeLock().lock();
        try {
            this.f13419c = 2;
            arrayList.addAll(this.f13418b);
            this.f13418b.clear();
            this.f13417a.writeLock().unlock();
            this.f13420d.post(new g(arrayList, this.f13419c, th));
        } catch (Throwable th2) {
            this.f13417a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:105:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:105:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    public final CharSequence f(int i, int i3, int i6, CharSequence charSequence) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i7;
        int i8;
        t[] tVarArr;
        int spanStart;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i <= i3)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        u uVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i3 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i == i3) {
            return charSequence;
        }
        boolean z5 = i6 == 1;
        d dVar = this.f13421e.f13413b;
        dVar.getClass();
        boolean z6 = charSequence instanceof r;
        if (z6) {
            ((r) charSequence).a();
        }
        if (z6) {
            uVar = new u((Spannable) charSequence);
            if (uVar != null) {
                for (t tVar : tVarArr) {
                    spanStart = uVar.i.getSpanStart(tVar);
                    int spanEnd = uVar.i.getSpanEnd(tVar);
                    if (spanStart != i3) {
                        uVar.removeSpan(tVar);
                    }
                    i = Math.min(spanStart, i);
                    i3 = Math.max(spanEnd, i3);
                }
            }
            i7 = i;
            i8 = i3;
            if (i7 != i8) {
                charSequence2 = charSequence;
                if (!z6) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z6) {
                    return charSequence2;
                }
            }
            ((r) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    uVar = new u((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z6) {
                        throw th;
                    }
                    ((r) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i3 + 1, t.class) <= i3) {
                uVar = new u();
                uVar.f13455h = false;
                uVar.i = new SpannableString(charSequence);
            }
            if (uVar != null && (tVarArr = (t[]) uVar.i.getSpans(i, i3, t.class)) != null && tVarArr.length > 0) {
                while (i < r2) {
                    spanStart = uVar.i.getSpanStart(tVar);
                    int spanEnd2 = uVar.i.getSpanEnd(tVar);
                    if (spanStart != i3) {
                        uVar.removeSpan(tVar);
                    }
                    i = Math.min(spanStart, i);
                    i3 = Math.max(spanEnd2, i3);
                }
            }
            i7 = i;
            i8 = i3;
            if (i7 != i8 || i7 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z6) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    u uVar2 = (u) dVar.k(charSequence2, i7, i8, Integer.MAX_VALUE, z5, new C0495p(uVar, 25, (b) dVar.f11476b));
                    if (uVar2 != null) {
                        Spannable spannable = uVar2.i;
                        if (z6) {
                            ((r) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z6) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z6) {
                        throw th;
                    }
                    ((r) charSequence2).b();
                    throw th;
                }
            }
            ((r) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z6) {
            throw th;
        }
        ((r) charSequence2).b();
        throw th;
    }

    public final void g(f fVar) {
        a.n("initCallback cannot be null", fVar);
        this.f13417a.writeLock().lock();
        try {
            if (this.f13419c == 1 || this.f13419c == 2) {
                this.f13420d.post(new g(Arrays.asList(fVar), this.f13419c, null));
            } else {
                this.f13418b.add(fVar);
            }
        } finally {
            this.f13417a.writeLock().unlock();
        }
    }

    public final void h(EditorInfo editorInfo) {
        if (b() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        e eVar = this.f13421e;
        eVar.getClass();
        Bundle bundle = editorInfo.extras;
        p125x1.b bVar = (p125x1.b) eVar.f13414c.i;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f11788k).getInt(iA + bVar.f11786h) : 0);
        Bundle bundle2 = editorInfo.extras;
        eVar.f13412a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
