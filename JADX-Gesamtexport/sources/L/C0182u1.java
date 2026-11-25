package L;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: renamed from: L.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0182u1 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0188w1 f2929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p112v.P f2930n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0182u1(C0188w1 c0188w1, p112v.P p6, p111u4.d dVar) {
        super(2, dVar);
        this.f2929m = c0188w1;
        this.f2930n = p6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0182u1(this.f2929m, this.f2930n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0182u1) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2928l;
        C0188w1 c0188w1 = this.f2929m;
        if (i == 0) {
            S1.V.O(obj);
            c0188w1.f2961j.setValue(Boolean.TRUE);
            this.f2928l = 1;
            p112v.P p6 = this.f2930n;
            p101t.i0 i0Var = c0188w1.f2966o;
            i0Var.getClass();
            if (AbstractC0336x.d(new p101t.h0(2, i0Var, p6, c0188w1.f2965n, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        c0188w1.f2961j.setValue(Boolean.FALSE);
        return p084p4.x.f10867a;
    }
}
