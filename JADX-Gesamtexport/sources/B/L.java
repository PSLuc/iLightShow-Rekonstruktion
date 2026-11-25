package B;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class L extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0036s0 f165h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M0.x f166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M0.w f167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M0.m f168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M0.q f169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F.P f170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0335w f171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p129y.c f172p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C0036s0 c0036s0, boolean z5, M0.x xVar, M0.w wVar, M0.m mVar, M0.q qVar, F.P p6, InterfaceC0335w interfaceC0335w, p129y.c cVar) {
        super(1);
        this.f165h = c0036s0;
        this.i = z5;
        this.f166j = xVar;
        this.f167k = wVar;
        this.f168l = mVar;
        this.f169m = qVar;
        this.f170n = p6;
        this.f171o = interfaceC0335w;
        this.f172p = cVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        a1 a1VarD;
        p024e0.q qVar = (p024e0.q) obj;
        C0036s0 c0036s0 = this.f165h;
        if (c0036s0.b() != qVar.a()) {
            c0036s0.f421f.setValue(Boolean.valueOf(qVar.a()));
            boolean zB = c0036s0.b();
            M0.q qVar2 = this.f169m;
            M0.w wVar = this.f167k;
            if (zB && this.i) {
                AbstractC0029o0.m(this.f166j, c0036s0, wVar, this.f168l, qVar2);
            } else {
                AbstractC0029o0.i(c0036s0);
            }
            if (qVar.a() && (a1VarD = c0036s0.d()) != null) {
                AbstractC0336x.o(this.f171o, null, new K(this.f172p, wVar, c0036s0, a1VarD, qVar2, null), 3);
            }
            if (!qVar.a()) {
                this.f170n.e(null);
            }
        }
        return p084p4.x.f10867a;
    }
}
