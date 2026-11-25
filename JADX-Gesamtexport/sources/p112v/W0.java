package p112v;

import D4.c;
import D4.e;
import D4.f;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p091r0.A;
import p101t.AbstractC0957z;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A f12924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f12925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f12926p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(A a6, f fVar, AbstractC0957z abstractC0957z, AbstractC0957z abstractC0957z2, c cVar, d dVar) {
        super(2, dVar);
        this.f12924n = a6;
        this.f12925o = fVar;
        this.f12926p = cVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        W0 w6 = new W0(this.f12924n, this.f12925o, null, null, this.f12926p, dVar);
        w6.f12923m = obj;
        return w6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((W0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12922l;
        if (i == 0) {
            V.O(obj);
            InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f12923m;
            A a6 = this.f12924n;
            V0 v6 = new V0(interfaceC0335w, this.f12925o, null, null, this.f12926p, new C0968a0(a6), null);
            this.f12922l = 1;
            if (p006b.a.n(a6, v6, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return x.f10867a;
    }
}
