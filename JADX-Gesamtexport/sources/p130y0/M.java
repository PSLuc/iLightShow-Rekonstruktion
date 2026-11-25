package p130y0;

import D4.e;
import M0.B;
import M0.r;
import P4.C0319f;
import S1.V;
import kotlin.KotlinNothingValueException;
import p015c2.AbstractC0473d;
import p084p4.x;
import p090r.C0870i;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class M extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f14273n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n6, d dVar) {
        super(2, dVar);
        this.f14273n = n6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        M m6 = new M(this.f14273n, dVar);
        m6.f14272m = obj;
        return m6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((M) b((C1146n0) obj, (d) obj2)).o(x.f10867a);
        return a.f13292h;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f14271l;
        if (i == 0) {
            V.O(obj);
            C1146n0 c1146n0 = (C1146n0) this.f14272m;
            this.f14272m = c1146n0;
            N n6 = this.f14273n;
            this.f14271l = 1;
            C0319f c0319f = new C0319f(1, AbstractC0473d.F(this));
            c0319f.u();
            M0.x xVar = n6.i;
            r rVar = xVar.f3456a;
            rVar.a();
            xVar.f3457b.set(new B(xVar, rVar));
            c0319f.w(new C0870i(c1146n0, 19, n6));
            if (c0319f.t() == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        throw new KotlinNothingValueException();
    }
}
