package p096s;

import D4.c;
import E4.l;
import G4.a;
import J4.d;
import p080p.w;
import p084p4.x;
import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class P extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11874h;
    public final /* synthetic */ Z i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(Z z5, int i) {
        super(1);
        this.f11874h = i;
        this.i = z5;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f11874h) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                Z z5 = this.i;
                long j4 = jLongValue - z5.f11926s;
                z5.f11926s = jLongValue;
                long jE = a.E(j4 / ((double) z5.f11930w));
                w wVar = z5.f11927t;
                int i = wVar.f10795b;
                int i3 = 0;
                if (i != 0) {
                    Object[] objArr = wVar.f10794a;
                    for (int i6 = 0; i6 < i; i6++) {
                        O o6 = (O) objArr[i6];
                        Z.q(z5, o6, jE);
                        o6.f11868c = true;
                    }
                    o0 o0Var = z5.f11919l;
                    if (o0Var != null) {
                        o0Var.p();
                    }
                    int i7 = wVar.f10795b;
                    Object[] objArr2 = wVar.f10794a;
                    d dVarD0 = p081p0.c.D0(0, i7);
                    int i8 = dVarD0.f1941h;
                    int i9 = dVarD0.i;
                    if (i8 <= i9) {
                        while (true) {
                            objArr2[i8 - i3] = objArr2[i8];
                            if (((O) objArr2[i8]).f11868c) {
                                i3++;
                            }
                            if (i8 != i9) {
                                i8++;
                            }
                        }
                    }
                    k.j0(i7 - i3, i7, objArr2);
                    wVar.f10795b -= i3;
                }
                O o7 = z5.f11928u;
                if (o7 != null) {
                    o7.f11872g = z5.f11920m;
                    Z.q(z5, o7, jE);
                    z5.y(o7.f11869d);
                    if (o7.f11869d == 1.0f) {
                        z5.f11928u = null;
                    }
                    z5.x();
                }
                break;
            default:
                this.i.f11926s = ((Number) obj).longValue();
                break;
        }
        return x.f10867a;
    }
}
