package B;

import N.InterfaceC0203a0;
import P4.AbstractC0336x;
import p112v.C0968a0;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U4.d f221n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f222o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p117w.m f223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f224q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(U4.d dVar, InterfaceC0203a0 interfaceC0203a0, p117w.m mVar, InterfaceC0203a0 interfaceC0203a1, p111u4.d dVar2) {
        super(2, dVar2);
        this.f221n = dVar;
        this.f222o = interfaceC0203a0;
        this.f223p = mVar;
        this.f224q = interfaceC0203a1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        R0 r6 = new R0(this.f221n, this.f222o, this.f223p, this.f224q, dVar);
        r6.f220m = obj;
        return r6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((R0) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        v4.a aVar = v4.a.f13292h;
        int i = this.f219l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i == 0) {
            S1.V.O(obj);
            p091r0.A a6 = (p091r0.A) this.f220m;
            Q0 q6 = new Q0(this.f221n, this.f222o, this.f223p, null);
            r rVar = new r(2, this.f224q);
            this.f219l = 1;
            p112v.N n6 = p112v.Y0.f12938a;
            Object objD = AbstractC0336x.d(new p112v.I0(a6, q6, rVar, new C0968a0(a6), null), this);
            if (objD != aVar) {
                objD = xVar;
            }
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        return xVar;
    }
}
