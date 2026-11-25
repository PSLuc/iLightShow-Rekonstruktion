package p112v;

import B.C0026n;
import B.c1;
import D4.e;
import P4.T;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0983i extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b1 f12987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0987k f12988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973d f12989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ T f12990q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0983i(b1 b1Var, C0987k c0987k, InterfaceC0973d interfaceC0973d, T t6, d dVar) {
        super(2, dVar);
        this.f12987n = b1Var;
        this.f12988o = c0987k;
        this.f12989p = interfaceC0973d;
        this.f12990q = t6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0983i c0983i = new C0983i(this.f12987n, this.f12988o, this.f12989p, this.f12990q, dVar);
        c0983i.f12986m = obj;
        return c0983i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0983i) b((C1011w0) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12985l;
        if (i == 0) {
            V.O(obj);
            C1011w0 c1011w0 = (C1011w0) this.f12986m;
            InterfaceC0973d interfaceC0973d = this.f12989p;
            C0987k c0987k = this.f12988o;
            float fY0 = C0987k.y0(c0987k, interfaceC0973d);
            b1 b1Var = this.f12987n;
            b1Var.f12961e = fY0;
            C0026n c0026n = new C0026n(c0987k, this.f12990q, c1011w0, 13);
            c1 c1Var = new c1(c0987k, b1Var, interfaceC0973d, 2);
            this.f12985l = 1;
            if (b1Var.a(c0026n, c1Var, this) == aVar) {
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
