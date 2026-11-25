package p112v;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T f12881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f12882o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(T t6, long j4, d dVar) {
        super(2, dVar);
        this.f12881n = t6;
        this.f12882o = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        Q q6 = new Q(this.f12881n, this.f12882o, dVar);
        q6.f12880m = obj;
        return q6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((Q) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12879l;
        x xVar = x.f10867a;
        if (i == 0) {
            V.O(obj);
            N n6 = this.f12881n.H;
            this.f12879l = 1;
            n6.getClass();
            new N(3, this, 0).o(xVar);
            if (xVar == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return xVar;
    }
}
