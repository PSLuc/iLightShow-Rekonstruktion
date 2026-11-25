package p112v;

import D4.e;
import D4.f;
import P4.InterfaceC0335w;
import S0.o;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class S extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T f12891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f12892o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t6, long j4, d dVar) {
        super(2, dVar);
        this.f12891n = t6;
        this.f12892o = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        S s6 = new S(this.f12891n, this.f12892o, dVar);
        s6.f12890m = obj;
        return s6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((S) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12889l;
        if (i == 0) {
            V.O(obj);
            InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f12890m;
            T t6 = this.f12891n;
            f fVar = t6.I;
            boolean z5 = t6.J;
            long jF = o.f(z5 ? -1.0f : 1.0f, this.f12892o);
            W w6 = t6.f12895F;
            N n6 = O.f12871a;
            Float f6 = new Float(w6 == W.f12920h ? o.c(jF) : o.b(jF));
            this.f12889l = 1;
            if (fVar.c(interfaceC0335w, f6, this) == aVar) {
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
