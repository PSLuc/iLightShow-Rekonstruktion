package I1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0.h f1846a = new W0.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f1847b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static W2.g f1848c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? l.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static W2.g b() {
        W2.g gVar = new W2.g(4);
        f1848c = gVar;
        W0.h hVar = f1846a;
        hVar.getClass();
        if (W0.g.f5553f.H(hVar, null, gVar)) {
            W0.g.b(hVar);
        }
        return f1848c;
    }

    public static void c(Context context, boolean z5) {
        m mVarA;
        int i;
        if (z5 || f1848c == null) {
            synchronized (f1847b) {
                if (!z5) {
                    try {
                        if (f1848c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (Build.VERSION.SDK_INT == 30) {
                    b();
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                int i3 = 0;
                boolean z6 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z7 = file2.exists() && length2 > 0;
                try {
                    long jA = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            mVarA = m.a(file3);
                        } catch (IOException unused) {
                            b();
                            return;
                        }
                    } else {
                        mVarA = null;
                    }
                    if (mVarA != null && mVarA.f1844c == jA && (i = mVarA.f1843b) != 2) {
                        i3 = i;
                    } else if (z6) {
                        i3 = 1;
                    } else if (z7) {
                        i3 = 2;
                    }
                    if (z5 && z7 && i3 != 1) {
                        i3 = 2;
                    }
                    if (mVarA != null && mVarA.f1843b == 2 && i3 == 1 && length < mVarA.f1845d) {
                        i3 = 3;
                    }
                    m mVar = new m(1, i3, jA, length2);
                    if (mVarA == null || !mVarA.equals(mVar)) {
                        try {
                            mVar.b(file3);
                        } catch (IOException unused2) {
                        }
                    }
                    b();
                } catch (PackageManager.NameNotFoundException unused3) {
                    b();
                }
            }
        }
    }
}
