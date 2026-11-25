package p101t;

import D4.e;
import S1.V;
import p084p4.x;
import p091r0.A;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: t.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0941i extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0942j f12344n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0941i(AbstractC0942j abstractC0942j, d dVar) {
        super(2, dVar);
        this.f12344n = abstractC0942j;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0941i c0941i = new C0941i(this.f12344n, dVar);
        c0941i.f12343m = obj;
        return c0941i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0941i) b((A) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12342l;
        if (i == 0) {
            V.O(obj);
            A a6 = (A) this.f12343m;
            this.f12342l = 1;
            if (this.f12344n.C0(a6, this) == aVar) {
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
