package p123x;

import E4.k;
import N.C0222k;
import N.C0230o;
import Z.b;
import Z.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f13716a = new U(AbstractC1078k.f13777a, b.f5941q);

    public static final U a(InterfaceC1073f interfaceC1073f, f fVar, C0230o c0230o, int i) {
        if (k.a(interfaceC1073f, AbstractC1078k.f13777a) && k.a(fVar, b.f5941q)) {
            c0230o.V(-849081669);
            c0230o.p(false);
            return f13716a;
        }
        c0230o.V(-849030798);
        boolean z5 = true;
        boolean z6 = (((i & 14) ^ 6) > 4 && c0230o.f(interfaceC1073f)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c0230o.f(fVar)) && (i & 48) != 32) {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        Object objK = c0230o.K();
        if (z7 || objK == C0222k.f3714a) {
            objK = new U(interfaceC1073f, fVar);
            c0230o.f0(objK);
        }
        U u6 = (U) objK;
        c0230o.p(false);
        return u6;
    }
}
