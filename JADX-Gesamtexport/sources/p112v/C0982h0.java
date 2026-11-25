package p112v;

import B.U;
import D4.e;
import E4.t;
import S1.V;
import p084p4.x;
import p096s.AbstractC0909d;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0982h0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1017z0 f12982n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f12983o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f12984p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0982h0(C1017z0 c1017z0, long j4, t tVar, d dVar) {
        super(2, dVar);
        this.f12982n = c1017z0;
        this.f12983o = j4;
        this.f12984p = tVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0982h0 c0982h0 = new C0982h0(this.f12982n, this.f12983o, this.f12984p, dVar);
        c0982h0.f12981m = obj;
        return c0982h0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0982h0) b((C1011w0) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12980l;
        if (i == 0) {
            V.O(obj);
            C1011w0 c1011w0 = (C1011w0) this.f12981m;
            C1017z0 c1017z0 = this.f12982n;
            float f6 = c1017z0.f(this.f12983o);
            U u6 = new U(this.f12984p, c1017z0, c1011w0, 3);
            this.f12980l = 1;
            if (AbstractC0909d.c(0.0f, f6, null, u6, this, 12) == aVar) {
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
