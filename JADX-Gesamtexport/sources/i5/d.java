package i5;

import B.C0043w;
import E4.k;
import h5.C;
import h5.C0732j;
import h5.C0735m;
import h5.C0739q;
import h5.r;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import p084p4.m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f9600c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f9601b;

    static {
        String str = C.i;
        f9600c = W2.g.k("/", false);
    }

    public d(ClassLoader classLoader) {
        this.f9601b = G4.a.z(new C0043w(29, classLoader));
    }

    @Override // h5.r
    public final C0739q b(C c6) throws EOFException {
        C cD;
        k.f("path", c6);
        if (Z2.f.a(c6)) {
            C c7 = f9600c;
            c7.getClass();
            k.f("child", c6);
            C cB = c.b(c7, c6, true);
            int iA = c.a(cB);
            C0735m c0735m = cB.f9310h;
            C c8 = iA == -1 ? null : new C(c0735m.n(0, iA));
            int iA2 = c.a(c7);
            C0735m c0735m2 = c7.f9310h;
            if (!k.a(c8, iA2 == -1 ? null : new C(c0735m2.n(0, iA2)))) {
                throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + cB + " and " + c7).toString());
            }
            ArrayList arrayListA = cB.a();
            ArrayList arrayListA2 = c7.a();
            int iMin = Math.min(arrayListA.size(), arrayListA2.size());
            int i = 0;
            while (i < iMin && k.a(arrayListA.get(i), arrayListA2.get(i))) {
                i++;
            }
            if (i == iMin && c0735m.d() == c0735m2.d()) {
                String str = C.i;
                cD = W2.g.k(".", false);
            } else {
                if (arrayListA2.subList(i, arrayListA2.size()).indexOf(c.f9599e) != -1) {
                    throw new IllegalArgumentException(("Impossible relative path to resolve: " + cB + " and " + c7).toString());
                }
                C0732j c0732j = new C0732j();
                C0735m c0735mC = c.c(c7);
                if (c0735mC == null && (c0735mC = c.c(cB)) == null) {
                    c0735mC = c.f(C.i);
                }
                int size = arrayListA2.size();
                for (int i3 = i; i3 < size; i3++) {
                    c0732j.V(c.f9599e);
                    c0732j.V(c0735mC);
                }
                int size2 = arrayListA.size();
                while (i < size2) {
                    c0732j.V((C0735m) arrayListA.get(i));
                    c0732j.V(c0735mC);
                    i++;
                }
                cD = c.d(c0732j, false);
            }
            String strQ = cD.f9310h.q();
            for (p084p4.h hVar : (List) this.f9601b.getValue()) {
                C0739q c0739qB = ((r) hVar.f10849h).b(((C) hVar.i).d(strQ));
                if (c0739qB != null) {
                    return c0739qB;
                }
            }
        }
        return null;
    }
}
