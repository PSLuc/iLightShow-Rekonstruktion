package B;

import G0.C0110f;
import M0.C0198a;
import N.C0235q0;
import N.C0239t;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.List;
import p113v0.InterfaceC1033p;
import p130y0.C1126d0;

/* JADX INFO: loaded from: classes.dex */
public final class J extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f144h;
    public final /* synthetic */ C0036s0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(C0036s0 c0036s0, int i) {
        super(1);
        this.f144h = i;
        this.i = c0036s0;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        p130y0.C0 c6;
        boolean z5 = false;
        p084p4.x xVar = null;
        p084p4.x xVar2 = p084p4.x.f10867a;
        C0036s0 c0036s0 = this.i;
        switch (this.f144h) {
            case 0:
                InterfaceC1033p interfaceC1033p = (InterfaceC1033p) obj;
                a1 a1VarD = c0036s0.d();
                if (a1VarD != null) {
                    a1VarD.f283c = interfaceC1033p;
                }
                return xVar2;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                c0036s0.f431q.setValue(bool);
                return xVar2;
            case 2:
                List list = (List) obj;
                if (c0036s0.d() != null) {
                    a1 a1VarD2 = c0036s0.d();
                    E4.k.c(a1VarD2);
                    list.add(a1VarD2.f281a);
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 3:
                C0110f c0110f = (C0110f) obj;
                M0.B b6 = c0036s0.f420e;
                J j4 = c0036s0.f434t;
                if (b6 != null) {
                    M0.w wVarJ = c0036s0.f419d.j(p089q4.m.M(new M0.f(), new C0198a(c0110f, 1)));
                    b6.a(null, wVarJ);
                    j4.invoke(wVarJ);
                    xVar = xVar2;
                }
                if (xVar == null) {
                    String str = c0110f.f1494h;
                    int length = str.length();
                    j4.invoke(new M0.w(4, str, AbstractC0599v0.d(length, length)));
                }
                return Boolean.TRUE;
            case 4:
                int i = ((M0.l) obj).f3429a;
                C0031p0 c0031p0 = c0036s0.f432r;
                c0031p0.getClass();
                if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
                    c0031p0.j();
                } else if (i != 1 && i != 0) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                if (i == 6) {
                    p024e0.g gVar = (p024e0.g) c0031p0.f395k;
                    if (gVar == null) {
                        E4.k.m("focusManager");
                        throw null;
                    }
                    ((androidx.compose.ui.focus.b) gVar).d(1);
                } else if (i == 5) {
                    p024e0.g gVar2 = (p024e0.g) c0031p0.f395k;
                    if (gVar2 == null) {
                        E4.k.m("focusManager");
                        throw null;
                    }
                    ((androidx.compose.ui.focus.b) gVar2).d(2);
                } else if (i == 7 && (c6 = (p130y0.C0) c0031p0.i) != null) {
                    ((C1126d0) c6).a();
                }
                return xVar2;
            default:
                M0.w wVar = (M0.w) obj;
                String str2 = wVar.f3453a.f1494h;
                C0110f c0110f2 = c0036s0.f424j;
                if (!E4.k.a(str2, c0110f2 != null ? c0110f2.f1494h : null)) {
                    c0036s0.f425k.setValue(EnumC0011f0.f312h);
                }
                long j6 = G0.I.f1468b;
                c0036s0.f(j6);
                c0036s0.e(j6);
                c0036s0.f433s.invoke(wVar);
                C0235q0 c0235q0 = c0036s0.f417b;
                C0239t c0239t = c0235q0.f3778b;
                if (c0239t != null) {
                    c0239t.p(c0235q0, null);
                }
                return xVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C0036s0 c0036s0, E0.h hVar) {
        super(1);
        this.f144h = 3;
        this.i = c0036s0;
    }
}
