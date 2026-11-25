package L;

import p096s.C0907c;

/* JADX INFO: renamed from: L.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0125b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0907c f2625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p117w.l f2626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p117w.l f2627g;

    public C0125b0(float f6, float f7, float f8, float f9) {
        this.f2621a = f6;
        this.f2622b = f7;
        this.f2623c = f8;
        this.f2624d = f9;
        this.f2625e = new C0907c(new S0.e(f6), p096s.x0.f12140c, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, p4.x] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final Object a(p117w.l lVar, p122w4.c cVar) {
        Z z5;
        float f6;
        ?? r6;
        C0907c c0907c = this.f2625e;
        if (cVar instanceof Z) {
            z5 = (Z) cVar;
            int i = z5.f2590o;
            if ((i & Integer.MIN_VALUE) != 0) {
                z5.f2590o = i - Integer.MIN_VALUE;
            } else {
                z5 = new Z(this, cVar);
            }
        } else {
            z5 = new Z(this, cVar);
        }
        Object obj = z5.f2588m;
        v4.a aVar = v4.a.f13292h;
        int i3 = z5.f2590o;
        try {
            if (i3 == 0) {
                S1.V.O(obj);
                if (lVar instanceof p117w.o) {
                    f6 = this.f2622b;
                } else if (lVar instanceof p117w.i) {
                    f6 = this.f2623c;
                } else {
                    f6 = lVar instanceof p117w.e ? this.f2624d : this.f2621a;
                }
                this.f2627g = lVar;
                this = this;
                if (!S0.e.a(((S0.e) c0907c.f11955e.getValue()).f4887h, f6)) {
                    p117w.l lVar2 = this.f2626f;
                    z5.f2586k = this;
                    z5.f2587l = lVar;
                    z5.f2590o = 1;
                    this = this;
                    if (S.a(c0907c, f6, lVar2, lVar, z5) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = z5.f2587l;
                C0125b0 c0125b0 = z5.f2586k;
                S1.V.O(obj);
                r6 = c0125b0;
            }
            r6.f2626f = lVar;
            this = p084p4.x.f10867a;
            return this;
        } catch (Throwable th) {
            this.f2626f = lVar;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(p122w4.c cVar) {
        C0122a0 c0122a0;
        float f6;
        if (cVar instanceof C0122a0) {
            c0122a0 = (C0122a0) cVar;
            int i = c0122a0.f2610n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0122a0.f2610n = i - Integer.MIN_VALUE;
            } else {
                c0122a0 = new C0122a0(this, cVar);
            }
        } else {
            c0122a0 = new C0122a0(this, cVar);
        }
        Object obj = c0122a0.f2608l;
        v4.a aVar = v4.a.f13292h;
        int i3 = c0122a0.f2610n;
        try {
            if (i3 == 0) {
                S1.V.O(obj);
                p117w.l lVar = this.f2627g;
                if (lVar instanceof p117w.o) {
                    f6 = this.f2622b;
                } else if (lVar instanceof p117w.i) {
                    f6 = this.f2623c;
                } else {
                    f6 = lVar instanceof p117w.e ? this.f2624d : this.f2621a;
                }
                C0907c c0907c = this.f2625e;
                if (!S0.e.a(((S0.e) c0907c.f11955e.getValue()).f4887h, f6)) {
                    S0.e eVar = new S0.e(f6);
                    c0122a0.f2607k = this;
                    c0122a0.f2610n = 1;
                    if (c0907c.d(eVar, c0122a0) == aVar) {
                        return aVar;
                    }
                }
                return p084p4.x.f10867a;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = c0122a0.f2607k;
            S1.V.O(obj);
            this.f2626f = this.f2627g;
            return p084p4.x.f10867a;
        } catch (Throwable th) {
            this.f2626f = this.f2627g;
            throw th;
        }
    }
}
