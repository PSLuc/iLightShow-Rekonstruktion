package B;

import N.C0208d;
import N.C0230o;
import android.content.res.TypedArray;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: B.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0013g0 {
    public static final boolean a(int i, int i3) {
        return (b(i) & i3) != 0;
    }

    public static final int b(int i) {
        return 1 << AbstractC0916i.d(i);
    }

    public static int c(int i, String str, int i3) {
        return (str.hashCode() + i) * i3;
    }

    public static Object d(int i, C0230o c0230o, boolean z5) {
        c0230o.p(z5);
        c0230o.V(i);
        return c0230o.K();
    }

    public static Object e(Bundle bundle, String str, String str2, String str3, String str4) {
        E4.k.f(str, bundle);
        E4.k.f(str3, str2);
        return bundle.get(str4);
    }

    public static String f(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String g(String str, int i, int i3, String str2) {
        return str + i + str2 + i3;
    }

    public static String h(String str, long j4) {
        return str + j4;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String k(StringBuilder sb, int i, char c6) {
        sb.append(i);
        sb.append(c6);
        return sb.toString();
    }

    public static String l(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, char c6) {
        sb.append(str);
        sb.append(c6);
        return sb.toString();
    }

    public static StringBuilder n(String str, String str2) {
        E4.k.e(str2, str);
        return new StringBuilder();
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void p(int i, V.a aVar, N.C0 c6, C0230o c0230o, int i3) {
        aVar.c(c6, c0230o, Integer.valueOf(i));
        c0230o.W(i3);
    }

    public static void q(C0230o c0230o, boolean z5, boolean z6, boolean z7, boolean z8) {
        c0230o.p(z5);
        c0230o.p(z6);
        c0230o.p(z7);
        c0230o.p(z8);
    }

    public static /* synthetic */ void r(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (!(autoCloseable instanceof TypedArray)) {
                throw new IllegalArgumentException();
            }
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z5 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z5) {
                    executorService.shutdownNow();
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    public static void s(StringBuilder sb, int i, String str, String str2, String str3) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void t(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void u(StringBuilder sb, int i, String str, String str2, String str3) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        C0208d.T(sb.toString());
        throw null;
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "SUSPEND";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DROP_LATEST";
        }
        return "DROP_OLDEST";
    }
}
