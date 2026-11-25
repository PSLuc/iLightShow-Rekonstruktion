package p112v;

import D4.e;
import L.C0185v1;
import S1.V;
import p084p4.x;
import p090r.C0870i;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class P extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12875m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K f12876n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T f12877o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(K k3, T t6, d dVar) {
        super(2, dVar);
        this.f12876n = k3;
        this.f12877o = t6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        P p6 = new P(this.f12876n, this.f12877o, dVar);
        p6.f12875m = obj;
        return p6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((P) b((C0185v1) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12874l;
        if (i == 0) {
            V.O(obj);
            C0870i c0870i = new C0870i((C0185v1) this.f12875m, 12, this.f12877o);
            this.f12874l = 1;
            if (this.f12876n.d(c0870i, this) == aVar) {
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
