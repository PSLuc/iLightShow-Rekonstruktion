package i5;

import E4.k;
import h5.C;
import h5.C0732j;
import h5.C0735m;
import java.io.EOFException;
import java.util.ArrayList;
import p089q4.l;
import p089q4.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0735m f9595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0735m f9596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0735m f9597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0735m f9598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0735m f9599e;

    static {
        C0735m c0735m = C0735m.f9352k;
        f9595a = Z2.f.i("/");
        f9596b = Z2.f.i("\\");
        f9597c = Z2.f.i("/\\");
        f9598d = Z2.f.i(".");
        f9599e = Z2.f.i("..");
    }

    public static final int a(C c6) {
        if (c6.f9310h.d() != 0) {
            C0735m c0735m = c6.f9310h;
            if (c0735m.i(0) != 47) {
                if (c0735m.i(0) == 92) {
                    if (c0735m.d() > 2 && c0735m.i(1) == 92) {
                        C0735m c0735m2 = f9596b;
                        k.f("other", c0735m2);
                        int iF = c0735m.f(2, c0735m2.f9353h);
                        return iF == -1 ? c0735m.d() : iF;
                    }
                } else if (c0735m.d() > 2 && c0735m.i(1) == 58 && c0735m.i(2) == 92) {
                    char cI = (char) c0735m.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final C b(C c6, C c7, boolean z5) {
        k.f("<this>", c6);
        k.f("child", c7);
        if (a(c7) != -1 || c7.g() != null) {
            return c7;
        }
        C0735m c0735mC = c(c6);
        if (c0735mC == null && (c0735mC = c(c7)) == null) {
            c0735mC = f(C.i);
        }
        C0732j c0732j = new C0732j();
        c0732j.V(c6.f9310h);
        if (c0732j.i > 0) {
            c0732j.V(c0735mC);
        }
        c0732j.V(c7.f9310h);
        return d(c0732j, z5);
    }

    public static final C0735m c(C c6) {
        C0735m c0735m = c6.f9310h;
        C0735m c0735m2 = f9595a;
        if (C0735m.g(c0735m, c0735m2) != -1) {
            return c0735m2;
        }
        C0735m c0735m3 = f9596b;
        if (C0735m.g(c6.f9310h, c0735m3) != -1) {
            return c0735m3;
        }
        return null;
    }

    public static final C d(C0732j c0732j, boolean z5) throws EOFException {
        long j4;
        C0735m c0735m;
        C0735m c0735m2;
        char cO;
        C0735m c0735m3;
        C0735m c0735mJ;
        C0732j c0732j2 = new C0732j();
        C0735m c0735mE = null;
        int i = 0;
        while (true) {
            j4 = 0;
            if (!c0732j.f(0L, f9595a)) {
                c0735m = f9596b;
                if (!c0732j.f(0L, c0735m)) {
                    break;
                }
            }
            byte bW = c0732j.W();
            if (c0735mE == null) {
                c0735mE = e(bW);
            }
            i++;
        }
        boolean z6 = i >= 2 && k.a(c0735mE, c0735m);
        C0735m c0735m4 = f9597c;
        if (z6) {
            k.c(c0735mE);
            c0732j2.V(c0735mE);
            c0732j2.V(c0735mE);
        } else if (i > 0) {
            k.c(c0735mE);
            c0732j2.V(c0735mE);
        } else {
            long jV = c0732j.v(c0735m4);
            if (c0735mE == null) {
                c0735mE = jV == -1 ? f(C.i) : e(c0732j.o(jV));
            }
            if (k.a(c0735mE, c0735m)) {
                c0735m2 = c0735mE;
                if (c0732j.i >= 2 && c0732j.o(1L) == 58 && (('a' <= (cO = (char) c0732j.o(0L)) && cO < '{') || ('A' <= cO && cO < '['))) {
                    if (jV == 2) {
                        c0732j2.write(c0732j, 3L);
                    } else {
                        c0732j2.write(c0732j, 2L);
                    }
                }
            } else {
                c0735m2 = c0735mE;
            }
            c0735mE = c0735m2;
        }
        boolean z7 = c0732j2.i > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean z8 = c0732j.z();
            c0735m3 = f9598d;
            if (z8) {
                break;
            }
            long j6 = j4;
            long jV2 = c0732j.v(c0735m4);
            if (jV2 == -1) {
                c0735mJ = c0732j.j(c0732j.i);
            } else {
                c0735mJ = c0732j.j(jV2);
                c0732j.W();
            }
            C0735m c0735m5 = f9599e;
            if (k.a(c0735mJ, c0735m5)) {
                if (!z7 || !arrayList.isEmpty()) {
                    if (!z5 || (!z7 && (arrayList.isEmpty() || k.a(l.f0(arrayList), c0735m5)))) {
                        arrayList.add(c0735mJ);
                    } else if ((!z6 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(m.L(arrayList));
                    }
                }
            } else if (!k.a(c0735mJ, c0735m3) && !k.a(c0735mJ, C0735m.f9352k)) {
                arrayList.add(c0735mJ);
            }
            j4 = j6;
        }
        long j7 = j4;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 > 0) {
                c0732j2.V(c0735mE);
            }
            c0732j2.V((C0735m) arrayList.get(i3));
        }
        if (c0732j2.i == j7) {
            c0732j2.V(c0735m3);
        }
        return new C(c0732j2.j(c0732j2.i));
    }

    public static final C0735m e(byte b6) {
        if (b6 == 47) {
            return f9595a;
        }
        if (b6 == 92) {
            return f9596b;
        }
        throw new IllegalArgumentException(p012c.k.r(b6, "not a directory separator: "));
    }

    public static final C0735m f(String str) {
        if (k.a(str, "/")) {
            return f9595a;
        }
        if (k.a(str, "\\")) {
            return f9596b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
