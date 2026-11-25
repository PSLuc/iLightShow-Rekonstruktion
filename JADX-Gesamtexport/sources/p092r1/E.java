package p092r1;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class E extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f11574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0881b f11575n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E(e eVar, C0881b c0881b, d dVar) {
        super(2, dVar);
        this.f11574m = (i) eVar;
        this.f11575n = c0881b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new E(this.f11574m, this.f11575n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((E) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11573l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return obj;
        }
        V.O(obj);
        Object obj2 = this.f11575n.f11636b;
        this.f11573l = 1;
        Object objD = this.f11574m.d(obj2, this);
        return objD == aVar ? aVar : objD;
    }
}
