package B;

import F1.C0096m;
import N.C0208d;
import N.C0230o;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import p112v.C1011w0;
import p112v.C1017z0;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public final class U extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f239h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f241k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(Object obj, Object obj2, V.a aVar, int i, int i3) {
        super(2);
        this.f239h = i3;
        this.f240j = obj;
        this.f241k = obj2;
        this.i = aVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f239h) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0208d.V(385);
                AbstractC0029o0.e((Z.o) this.f240j, (F.P) this.f241k, (V.a) this.i, (C0230o) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0208d.V(385);
                p081p0.c.w((C0096m) this.f240j, (W.g) this.f241k, (V.a) this.i, (C0230o) obj, iV2);
                break;
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                AbstractC0336x.o((InterfaceC0335w) this.f240j, null, new G1.v(fFloatValue, (p096s.Z) this.f241k, (C0096m) this.i, null), 3);
                break;
            case 3:
                float fFloatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                E4.t tVar = (E4.t) this.f240j;
                float f6 = fFloatValue2 - tVar.f1071h;
                C1017z0 c1017z0 = (C1017z0) this.f241k;
                long jG = c1017z0.g(c1017z0.c(f6));
                C1017z0 c1017z1 = ((C1011w0) this.i).f13086a;
                tVar.f1071h += c1017z0.c(c1017z0.f(C1017z0.a(c1017z1, c1017z1.f13111h, jG, 1)));
                break;
            case 4:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    AbstractC1124c0.a((p130y0.r) this.f240j, (p130y0.T) this.f241k, (V.a) this.i, c0230o, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC1124c0.a((p124x0.f0) this.f240j, (p130y0.T) this.f241k, (V.a) this.i, (C0230o) obj, C0208d.V(1));
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.f239h = i;
        this.f240j = obj;
        this.f241k = obj2;
        this.i = obj3;
    }
}
