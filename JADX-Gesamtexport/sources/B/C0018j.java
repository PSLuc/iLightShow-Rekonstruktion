package B;

import G0.C0110f;
import N.C0208d;
import N.C0230o;
import N.C0233p0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: B.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0018j extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f337h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f339k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0018j(int i, int i3, Object obj, Object obj2) {
        super(2);
        this.f337h = i3;
        this.f338j = obj;
        this.f339k = obj2;
        this.i = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) throws Throwable {
        switch (this.f337h) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0208d.V(this.i | 1);
                AbstractC0020k.a((C0110f) this.f338j, (List) this.f339k, (C0230o) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0208d.V(this.i | 1);
                AbstractC0029o0.c((F.P) this.f338j, (V.a) this.f339k, (C0230o) obj, iV2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV3 = C0208d.V(this.i | 1);
                V.a aVar = (V.a) this.f339k;
                p081p0.c.z((W.g) this.f338j, aVar, (C0230o) obj, iV3);
                break;
            case 3:
                ((Number) obj2).intValue();
                C0233p0[] c0233p0Arr = (C0233p0[]) this.f338j;
                C0233p0[] c0233p0Arr2 = (C0233p0[]) Arrays.copyOf(c0233p0Arr, c0233p0Arr.length);
                int iV4 = C0208d.V(this.i | 1);
                C0208d.b(c0233p0Arr2, (D4.e) this.f339k, (C0230o) obj, iV4);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iV5 = C0208d.V(this.i | 1);
                C0208d.a((C0233p0) this.f338j, (D4.e) this.f339k, (C0230o) obj, iV5);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iV6 = C0208d.V(this.i) | 1;
                ((V.a) this.f338j).b(this.f339k, (C0230o) obj, iV6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iV7 = C0208d.V(this.i | 1);
                V.a aVar2 = (V.a) this.f339k;
                p006b.a.h((Z.o) this.f338j, aVar2, (C0230o) obj, iV7);
                break;
            case 7:
                ((Number) obj2).intValue();
                int iV8 = C0208d.V(this.i | 1);
                ((p096s.o0) this.f338j).a(this.f339k, (C0230o) obj, iV8);
                break;
            default:
                ((Number) obj2).intValue();
                int iV9 = C0208d.V(this.i | 1);
                G4.a.a((Z.o) this.f338j, (D4.c) this.f339k, (C0230o) obj, iV9);
                break;
        }
        return p084p4.x.f10867a;
    }
}
