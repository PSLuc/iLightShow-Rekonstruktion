package h5;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Comparable {
    public static final String i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0735m f9310h;

    static {
        String str = File.separator;
        E4.k.e("separator", str);
        i = str;
    }

    public C(C0735m c0735m) {
        E4.k.f("bytes", c0735m);
        this.f9310h = c0735m;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = i5.c.a(this);
        C0735m c0735m = this.f9310h;
        if (iA == -1) {
            iA = 0;
        } else if (iA < c0735m.d() && c0735m.i(iA) == 92) {
            iA++;
        }
        int iD = c0735m.d();
        int i3 = iA;
        while (iA < iD) {
            if (c0735m.i(iA) == 47 || c0735m.i(iA) == 92) {
                arrayList.add(c0735m.n(i3, iA));
                i3 = iA + 1;
            }
            iA++;
        }
        if (i3 < c0735m.d()) {
            arrayList.add(c0735m.n(i3, c0735m.d()));
        }
        return arrayList;
    }

    public final String b() {
        C0735m c0735m = i5.c.f9595a;
        C0735m c0735m2 = i5.c.f9595a;
        C0735m c0735mO = this.f9310h;
        int iK = C0735m.k(c0735mO, c0735m2);
        if (iK == -1) {
            iK = C0735m.k(c0735mO, i5.c.f9596b);
        }
        if (iK != -1) {
            c0735mO = C0735m.o(c0735mO, iK + 1, 0, 2);
        } else if (g() != null && c0735mO.d() == 2) {
            c0735mO = C0735m.f9352k;
        }
        return c0735mO.q();
    }

    public final C c() {
        C0735m c0735m = i5.c.f9598d;
        C0735m c0735m2 = this.f9310h;
        if (E4.k.a(c0735m2, c0735m)) {
            return null;
        }
        C0735m c0735m3 = i5.c.f9595a;
        if (E4.k.a(c0735m2, c0735m3)) {
            return null;
        }
        C0735m c0735m4 = i5.c.f9596b;
        if (E4.k.a(c0735m2, c0735m4)) {
            return null;
        }
        C0735m c0735m5 = i5.c.f9599e;
        c0735m2.getClass();
        E4.k.f("suffix", c0735m5);
        int iD = c0735m2.d();
        byte[] bArr = c0735m5.f9353h;
        if (c0735m2.l(iD - bArr.length, c0735m5, bArr.length) && (c0735m2.d() == 2 || c0735m2.l(c0735m2.d() - 3, c0735m3, 1) || c0735m2.l(c0735m2.d() - 3, c0735m4, 1))) {
            return null;
        }
        int iK = C0735m.k(c0735m2, c0735m3);
        if (iK == -1) {
            iK = C0735m.k(c0735m2, c0735m4);
        }
        if (iK == 2 && g() != null) {
            if (c0735m2.d() == 3) {
                return null;
            }
            return new C(C0735m.o(c0735m2, 0, 3, 1));
        }
        if (iK == 1) {
            E4.k.f("prefix", c0735m4);
            if (c0735m2.l(0, c0735m4, c0735m4.d())) {
                return null;
            }
        }
        if (iK != -1 || g() == null) {
            if (iK == -1) {
                return new C(c0735m);
            }
            return iK == 0 ? new C(C0735m.o(c0735m2, 0, 1, 1)) : new C(C0735m.o(c0735m2, 0, iK, 1));
        }
        if (c0735m2.d() == 2) {
            return null;
        }
        return new C(C0735m.o(c0735m2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C c6 = (C) obj;
        E4.k.f("other", c6);
        return this.f9310h.compareTo(c6.f9310h);
    }

    public final C d(String str) {
        E4.k.f("child", str);
        C0732j c0732j = new C0732j();
        c0732j.h0(str);
        return i5.c.b(this, i5.c.d(c0732j, false), false);
    }

    public final File e() {
        return new File(this.f9310h.q());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C) && E4.k.a(((C) obj).f9310h, this.f9310h);
    }

    public final Path f() {
        Path path = Paths.get(this.f9310h.q(), new String[0]);
        E4.k.e("get(toString())", path);
        return path;
    }

    public final Character g() {
        C0735m c0735m = i5.c.f9595a;
        C0735m c0735m2 = this.f9310h;
        if (C0735m.g(c0735m2, c0735m) != -1 || c0735m2.d() < 2 || c0735m2.i(1) != 58) {
            return null;
        }
        char cI = (char) c0735m2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.f9310h.hashCode();
    }

    public final String toString() {
        return this.f9310h.q();
    }
}
