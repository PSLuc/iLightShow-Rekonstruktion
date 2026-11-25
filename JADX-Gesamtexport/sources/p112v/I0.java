package p112v;

import D4.c;
import D4.e;
import D4.f;
import E4.l;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p091r0.A;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A f12833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f12834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f12835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0968a0 f12836q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I0(A a6, f fVar, c cVar, C0968a0 c0968a0, d dVar) {
        super(2, dVar);
        this.f12833n = a6;
        this.f12834o = (i) fVar;
        this.f12835p = (l) cVar;
        this.f12836q = c0968a0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [D4.f, w4.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [D4.c, E4.l] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        ?? r6 = this.f12835p;
        C0968a0 c0968a0 = this.f12836q;
        I0 i3 = new I0(this.f12833n, this.f12834o, r6, c0968a0, dVar);
        i3.f12832m = obj;
        return i3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((I0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [D4.f, w4.i] */
    /* JADX WARN: Type inference failed for: r6v0, types: [D4.c, E4.l] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12831l;
        if (i == 0) {
            V.O(obj);
            H0 h1 = new H0((InterfaceC0335w) this.f12832m, this.f12834o, this.f12835p, this.f12836q, null);
            this.f12831l = 1;
            if (p006b.a.n(this.f12833n, h1, this) == aVar) {
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
