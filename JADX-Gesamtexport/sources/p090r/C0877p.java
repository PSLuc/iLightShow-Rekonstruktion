package p090r;

import D4.e;
import L.W;
import N.C0229n0;
import N.InterfaceC0203a0;
import N.T0;
import S1.V;
import S4.A;
import p084p4.x;
import p096s.o0;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: r.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0877p extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o0 f11429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f11430o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0877p(o0 o0Var, InterfaceC0203a0 interfaceC0203a0, d dVar) {
        super(2, dVar);
        this.f11429n = o0Var;
        this.f11430o = interfaceC0203a0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0877p c0877p = new C0877p(this.f11429n, this.f11430o, dVar);
        c0877p.f11428m = obj;
        return c0877p;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0877p) b((C0229n0) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11427l;
        if (i == 0) {
            V.O(obj);
            C0229n0 c0229n0 = (C0229n0) this.f11428m;
            o0 o0Var = this.f11429n;
            A a6 = new A(new T0(new C0876o(o0Var, 0), null));
            W w6 = new W(c0229n0, o0Var, this.f11430o, 4);
            this.f11427l = 1;
            if (a6.a(w6, this) == aVar) {
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
