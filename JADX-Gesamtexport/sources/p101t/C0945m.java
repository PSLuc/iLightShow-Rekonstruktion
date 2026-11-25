package p101t;

import D4.e;
import S1.V;
import p084p4.x;
import p091r0.A;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: t.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0945m extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0946n f12377n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0945m(C0946n c0946n, d dVar) {
        super(2, dVar);
        this.f12377n = c0946n;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0945m c0945m = new C0945m(this.f12377n, dVar);
        c0945m.f12376m = obj;
        return c0945m;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0945m) b((A) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12375l;
        if (i == 0) {
            V.O(obj);
            A a6 = (A) this.f12376m;
            C0944l c0944l = new C0944l(this.f12377n, null);
            this.f12375l = 1;
            if (p006b.a.n(a6, c0944l, this) == aVar) {
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
