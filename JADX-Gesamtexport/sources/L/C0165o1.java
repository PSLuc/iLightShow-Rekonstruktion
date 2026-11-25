package L;

import N.C0209d0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: L.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0165o1 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2862h;
    public final /* synthetic */ C0188w1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0165o1(C0188w1 c0188w1, int i) {
        super(1);
        this.f2862h = i;
        this.i = c0188w1;
    }

    @Override // D4.c
    public final Object invoke(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        int i;
        switch (this.f2862h) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                C0188w1 c0188w1 = this.i;
                J4.a aVar = c0188w1.f2955c;
                float f6 = aVar.f1939a;
                float f7 = aVar.f1940b;
                float fN = p081p0.c.N(fFloatValue, f6, f7);
                boolean z5 = true;
                int i3 = c0188w1.f2953a;
                if (i3 > 0 && (i = i3 + 1) >= 0) {
                    float fAbs = fN;
                    float f8 = fAbs;
                    int i6 = 0;
                    while (true) {
                        float fG = S1.V.G(aVar.f1939a, f7, i6 / i);
                        float f9 = fG - fN;
                        if (Math.abs(f9) <= fAbs) {
                            fAbs = Math.abs(f9);
                            f8 = fG;
                        }
                        if (i6 != i) {
                            i6++;
                        } else {
                            fN = f8;
                        }
                    }
                }
                C0209d0 c0209d0 = c0188w1.f2956d;
                if (fN == c0209d0.h()) {
                    z5 = false;
                } else {
                    if (fN != c0209d0.h()) {
                        D4.c cVar = c0188w1.f2957e;
                        if (cVar != null) {
                            cVar.invoke(Float.valueOf(fN));
                        } else {
                            c0188w1.c(fN);
                        }
                    }
                    c0188w1.f2954b.invoke();
                }
                return Boolean.valueOf(z5);
            default:
                long j4 = ((p030f0.c) obj).f8837a;
                C0188w1 c0188w2 = this.i;
                c0188w2.a(0.0f);
                c0188w2.f2962k.invoke();
                return p084p4.x.f10867a;
        }
    }
}
