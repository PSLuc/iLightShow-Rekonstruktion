package p123x;

import E4.k;
import N.C0222k;
import N.C0230o;
import Z.b;
import Z.e;

/* JADX INFO: renamed from: x.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1088v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1090x f13811a = new C1090x(AbstractC1078k.f13779c, b.f5943s);

    public static final C1090x a(InterfaceC1076i interfaceC1076i, e eVar, C0230o c0230o, int i) {
        if (k.a(interfaceC1076i, AbstractC1078k.f13779c) && eVar.equals(b.f5943s)) {
            c0230o.V(345962472);
            c0230o.p(false);
            return f13811a;
        }
        c0230o.V(346016319);
        boolean z5 = true;
        boolean z6 = (((i & 14) ^ 6) > 4 && c0230o.f(interfaceC1076i)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c0230o.f(eVar)) && (i & 48) != 32) {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        Object objK = c0230o.K();
        if (z7 || objK == C0222k.f3714a) {
            objK = new C1090x(interfaceC1076i, eVar);
            c0230o.f0(objK);
        }
        C1090x c1090x = (C1090x) objK;
        c0230o.p(false);
        return c1090x;
    }
}
