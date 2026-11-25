package B;

import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.C0710k;

/* JADX INFO: renamed from: B.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0008e extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f306h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0008e(int i, long j4) {
        super(1);
        this.f306h = i;
        this.i = j4;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f306h) {
            case 0:
                p019d0.c cVar = (p019d0.c) obj;
                float fD = p030f0.f.d(cVar.f8571h.f()) / 2.0f;
                C0704e c0704eW = S1.V.w(cVar, fD);
                C0710k c0710k = C0710k.f9071a;
                long j4 = this.i;
                return cVar.b(new C0006d(fD, c0704eW, new C0709j(j4, 5, c0710k.a(j4, 5))));
            default:
                ((E0.h) obj).i(F.B.f1082c, new F.A(EnumC0009e0.f307h, this.i, 2, true));
                return p084p4.x.f10867a;
        }
    }
}
