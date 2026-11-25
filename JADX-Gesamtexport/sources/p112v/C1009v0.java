package p112v;

import D4.e;
import E4.v;
import P4.AbstractC0336x;
import S0.o;
import S1.V;
import c5.C0495p;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1009v0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1017z0 f13074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v f13075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f13076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f13078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1017z0 f13079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f13080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f13081s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1009v0(C1017z0 c1017z0, v vVar, long j4, d dVar) {
        super(2, dVar);
        this.f13079q = c1017z0;
        this.f13080r = vVar;
        this.f13081s = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C1009v0 c1009v0 = new C1009v0(this.f13079q, this.f13080r, this.f13081s, dVar);
        c1009v0.f13078p = obj;
        return c1009v0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C1009v0) b((C1011w0) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        C1017z0 c1017z0;
        v vVar;
        C1017z0 c1017z1;
        long j4;
        a aVar = a.f13292h;
        int i = this.f13077o;
        W w6 = W.i;
        if (i == 0) {
            V.O(obj);
            C1011w0 c1011w0 = (C1011w0) this.f13078p;
            c1017z0 = this.f13079q;
            C1007u0 c1007u0 = new C1007u0(c1017z0, c1011w0);
            C0495p c0495p = c1017z0.f13106c;
            vVar = this.f13080r;
            long j6 = vVar.f1073h;
            W w7 = c1017z0.f13107d;
            long j7 = this.f13081s;
            float fC = c1017z0.c(w7 == w6 ? o.b(j7) : o.c(j7));
            this.f13078p = c1017z0;
            this.f13074l = c1017z0;
            this.f13075m = vVar;
            this.f13076n = j6;
            this.f13077o = 1;
            c0495p.getClass();
            obj = AbstractC0336x.v((C0974d0) c0495p.f7476j, new C0989l(fC, c0495p, c1007u0, null), this);
            if (obj == aVar) {
                return aVar;
            }
            c1017z1 = c1017z0;
            j4 = j6;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j4 = this.f13076n;
            vVar = this.f13075m;
            c1017z0 = this.f13074l;
            c1017z1 = (C1017z0) this.f13078p;
            V.O(obj);
        }
        float fC2 = c1017z1.c(((Number) obj).floatValue());
        vVar.f1073h = c1017z0.f13107d == w6 ? o.a(j4, fC2, 0.0f, 2) : o.a(j4, 0.0f, fC2, 1);
        return x.f10867a;
    }
}
