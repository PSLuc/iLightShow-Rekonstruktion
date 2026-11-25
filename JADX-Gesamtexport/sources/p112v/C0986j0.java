package p112v;

import D4.e;
import S1.V;
import p084p4.x;
import p090r.C0870i;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0986j0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K f13002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1017z0 f13003o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0986j0(K k3, C1017z0 c1017z0, d dVar) {
        super(2, dVar);
        this.f13002n = k3;
        this.f13003o = c1017z0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0986j0 c0986j0 = new C0986j0(this.f13002n, this.f13003o, dVar);
        c0986j0.f13001m = obj;
        return c0986j0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0986j0) b((C1011w0) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f13000l;
        if (i == 0) {
            V.O(obj);
            C0870i c0870i = new C0870i((C1011w0) this.f13001m, 13, this.f13003o);
            this.f13000l = 1;
            if (this.f13002n.d(c0870i, this) == aVar) {
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
