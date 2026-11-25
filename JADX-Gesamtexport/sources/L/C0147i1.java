package L;

import N.C0209d0;

/* JADX INFO: renamed from: L.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0147i1 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2796h;
    public final /* synthetic */ J4.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A0 f2797j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0147i1(J4.a aVar, A0 a6, int i) {
        super(1);
        this.f2796h = i;
        this.i = aVar;
        this.f2797j = a6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        int iC;
        int iD;
        boolean z5 = false;
        A0 a6 = this.f2797j;
        J4.a aVar = this.i;
        switch (this.f2796h) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                float f6 = aVar.f1939a;
                float f7 = aVar.f1940b;
                float fN = p081p0.c.N(fFloatValue, f6, f7);
                if (a6.c() > 0 && (iC = a6.c() + 1) >= 0) {
                    float fAbs = fN;
                    float f8 = fAbs;
                    int i = 0;
                    while (true) {
                        float fG = S1.V.G(f6, f7, i / (a6.c() + 1));
                        float f9 = fG - fN;
                        if (Math.abs(f9) <= fAbs) {
                            fAbs = Math.abs(f9);
                            f8 = fG;
                        }
                        if (i != iC) {
                            i++;
                        } else {
                            fN = f8;
                        }
                    }
                }
                C0209d0 c0209d0 = a6.f2148e;
                if (fN != c0209d0.h()) {
                    C0209d0 c0209d1 = a6.f2147d;
                    long jI = AbstractC0176s1.i(c0209d1.h(), fN);
                    long jI2 = AbstractC0176s1.i(c0209d1.h(), c0209d0.h());
                    int i3 = C0179t1.f2919c;
                    if (jI != jI2) {
                        D4.c cVar = a6.f2149f;
                        if (cVar != null) {
                            cVar.invoke(new C0179t1(jI));
                        } else {
                            a6.h(C0179t1.b(jI));
                            a6.g(C0179t1.a(jI));
                        }
                    }
                    a6.f2145b.invoke();
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                float f10 = aVar.f1939a;
                float f11 = aVar.f1940b;
                float fN2 = p081p0.c.N(fFloatValue2, f10, f11);
                if (a6.d() > 0 && (iD = a6.d() + 1) >= 0) {
                    float fAbs2 = fN2;
                    float f12 = fAbs2;
                    int i6 = 0;
                    while (true) {
                        float fG2 = S1.V.G(f10, f11, i6 / (a6.d() + 1));
                        float f13 = fG2 - fN2;
                        if (Math.abs(f13) <= fAbs2) {
                            fAbs2 = Math.abs(f13);
                            f12 = fG2;
                        }
                        if (i6 != iD) {
                            i6++;
                        } else {
                            fN2 = f12;
                        }
                    }
                }
                C0209d0 c0209d2 = a6.f2147d;
                if (fN2 != c0209d2.h()) {
                    C0209d0 c0209d3 = a6.f2148e;
                    long jI3 = AbstractC0176s1.i(fN2, c0209d3.h());
                    long jI4 = AbstractC0176s1.i(c0209d2.h(), c0209d3.h());
                    int i7 = C0179t1.f2919c;
                    if (jI3 != jI4) {
                        D4.c cVar2 = a6.f2149f;
                        if (cVar2 != null) {
                            cVar2.invoke(new C0179t1(jI3));
                        } else {
                            a6.h(C0179t1.b(jI3));
                            a6.g(C0179t1.a(jI3));
                        }
                    }
                    a6.f2145b.invoke();
                    z5 = true;
                }
                return Boolean.valueOf(z5);
        }
    }
}
