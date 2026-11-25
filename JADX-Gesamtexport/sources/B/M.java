package B;

import N.C0217h0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import p113v0.InterfaceC1033p;

/* JADX INFO: loaded from: classes.dex */
public final class M extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0036s0 f174h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p130y0.M0 f175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F.P f176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M0.w f177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M0.q f178m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C0036s0 c0036s0, boolean z5, p130y0.M0 m6, F.P p6, M0.w wVar, M0.q qVar) {
        super(1);
        this.f174h = c0036s0;
        this.i = z5;
        this.f175j = m6;
        this.f176k = p6;
        this.f177l = wVar;
        this.f178m = qVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        M0.B b6;
        InterfaceC1033p interfaceC1033p;
        InterfaceC1033p interfaceC1033p2;
        InterfaceC1033p interfaceC1033p3 = (InterfaceC1033p) obj;
        C0036s0 c0036s0 = this.f174h;
        c0036s0.f423h = interfaceC1033p3;
        a1 a1VarD = c0036s0.d();
        if (a1VarD != null) {
            a1VarD.f282b = interfaceC1033p3;
        }
        if (this.i) {
            EnumC0011f0 enumC0011f0A = c0036s0.a();
            EnumC0011f0 enumC0011f0 = EnumC0011f0.i;
            M0.w wVar = this.f177l;
            F.P p6 = this.f176k;
            C0217h0 c0217h0 = c0036s0.f429o;
            if (enumC0011f0A == enumC0011f0) {
                if (((Boolean) c0036s0.f426l.getValue()).booleanValue() && ((p130y0.N0) this.f175j).a()) {
                    p6.o();
                } else {
                    p6.k();
                }
                c0036s0.f427m.setValue(Boolean.valueOf(p027e3.a.l0(p6, true)));
                c0036s0.f428n.setValue(Boolean.valueOf(p027e3.a.l0(p6, false)));
                c0217h0.setValue(Boolean.valueOf(G0.I.b(wVar.f3454b)));
            } else if (c0036s0.a() == EnumC0011f0.f313j) {
                c0217h0.setValue(Boolean.valueOf(p027e3.a.l0(p6, true)));
            }
            M0.q qVar = this.f178m;
            AbstractC0029o0.t(c0036s0, wVar, qVar);
            a1 a1VarD2 = c0036s0.d();
            if (a1VarD2 != null && (b6 = c0036s0.f420e) != null && c0036s0.b() && (interfaceC1033p = a1VarD2.f282b) != null && interfaceC1033p.K() && (interfaceC1033p2 = a1VarD2.f283c) != null) {
                A2.e eVar = new A2.e(3, interfaceC1033p);
                p030f0.d dVarO = AbstractC0599v0.O(interfaceC1033p);
                p030f0.d dVarO2 = interfaceC1033p.o(interfaceC1033p2, false);
                if (E4.k.a((M0.B) b6.f3390a.f3457b.get(), b6)) {
                    b6.f3391b.c(wVar, qVar, a1VarD2.f281a, eVar, dVarO, dVarO2);
                }
            }
        }
        return p084p4.x.f10867a;
    }
}
