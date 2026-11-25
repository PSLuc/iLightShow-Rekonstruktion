package p129y;

import B.c1;
import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import p124x0.AbstractC1098f;
import p124x0.Y;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f14164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c1 f14165n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, c1 c1Var, d dVar) {
        super(2, dVar);
        this.f14164m = iVar;
        this.f14165n = c1Var;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new g(this.f14164m, this.f14165n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((g) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a jVar;
        a aVar = a.f13292h;
        int i = this.f14163l;
        if (i == 0) {
            V.O(obj);
            i iVar = this.f14164m;
            if (iVar.f5969t) {
                if (iVar.f5958h.f5969t) {
                    jVar = (a) AbstractC1098f.i(iVar, i.f14171w);
                    if (jVar == null) {
                        jVar = new j(iVar);
                    }
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    Y yR = AbstractC1098f.r(iVar);
                    this.f14163l = 1;
                    if (jVar.M(yR, this.f14165n, this) == aVar) {
                        return aVar;
                    }
                }
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
