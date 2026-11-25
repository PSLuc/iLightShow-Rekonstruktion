package p112v;

import D4.e;
import D4.f;
import P4.InterfaceC0335w;
import S1.V;
import p030f0.c;
import p084p4.x;
import p091r0.q;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f12806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0968a0 f12807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f12808o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E0(f fVar, C0968a0 c0968a0, q qVar, d dVar) {
        super(2, dVar);
        this.f12806m = (i) fVar;
        this.f12807n = c0968a0;
        this.f12808o = qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D4.f, w4.i] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new E0(this.f12806m, this.f12807n, this.f12808o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((E0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [D4.f, w4.i] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12805l;
        if (i == 0) {
            V.O(obj);
            c cVar = new c(this.f12808o.f11510c);
            this.f12805l = 1;
            if (this.f12806m.c(this.f12807n, cVar, this) == aVar) {
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
