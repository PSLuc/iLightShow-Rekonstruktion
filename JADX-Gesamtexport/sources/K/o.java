package K;

import N.C0208d;
import N.C0217h0;
import N.U;
import P4.AbstractC0336x;
import P4.C0325l;
import S1.V;
import p096s.AbstractC0909d;
import p096s.C0907c;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p030f0.c f1996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f1999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Float f2000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p030f0.c f2001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0907c f2002g = AbstractC0909d.a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0907c f2003h = AbstractC0909d.a(0.0f);
    public final C0907c i = AbstractC0909d.a(0.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0325l f2004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0217h0 f2005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0217h0 f2006l;

    public o(p030f0.c cVar, float f6, boolean z5) {
        this.f1996a = cVar;
        this.f1997b = f6;
        this.f1998c = z5;
        C0325l c0325l = new C0325l(true);
        c0325l.O(null);
        this.f2004j = c0325l;
        Boolean bool = Boolean.FALSE;
        U u6 = U.f3673m;
        this.f2005k = C0208d.K(bool, u6);
        this.f2006l = C0208d.K(bool, u6);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(p122w4.c cVar) throws Throwable {
        h hVar;
        Object objD;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i = hVar.f1983n;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.f1983n = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f1981l;
        v4.a aVar = v4.a.f13292h;
        int i3 = hVar.f1983n;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i3 == 0) {
            V.O(obj);
            hVar.f1980k = this;
            hVar.f1983n = 1;
            Object objD2 = AbstractC0336x.d(new l(this, null), hVar);
            if (objD2 != aVar) {
                objD2 = xVar;
            }
            if (objD2 != aVar) {
            }
            return aVar;
        }
        if (i3 == 1) {
            this = hVar.f1980k;
            V.O(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V.O(obj);
                return xVar;
            }
            this = hVar.f1980k;
            V.O(obj);
        }
        hVar.f1980k = null;
        hVar.f1983n = 3;
        this.getClass();
        objD = AbstractC0336x.d(new n(this, null), hVar);
        if (objD != aVar) {
            objD = xVar;
        }
        if (objD != aVar) {
            return aVar;
        }
        return xVar;
        this.f2005k.setValue(Boolean.TRUE);
        hVar.f1980k = this;
        hVar.f1983n = 2;
        if (this.f2004j.d0(hVar) != aVar) {
            hVar.f1980k = null;
            hVar.f1983n = 3;
            this.getClass();
            objD = AbstractC0336x.d(new n(this, null), hVar);
            if (objD != aVar) {
                objD = xVar;
            }
            if (objD != aVar) {
                return xVar;
            }
        }
        return aVar;
    }
}
