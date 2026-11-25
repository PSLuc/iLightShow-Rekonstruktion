package B;

import G0.C0110f;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ M0.q f209h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M0.w f210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F.P f211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0036s0 f212l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(M0.q qVar, boolean z5, M0.w wVar, F.P p6, C0036s0 c0036s0) {
        super(3);
        this.f209h = qVar;
        this.i = z5;
        this.f210j = wVar;
        this.f211k = p6;
        this.f212l = c0036s0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        M0.q qVar = this.f209h;
        if (!zBooleanValue) {
            iIntValue = qVar.a(iIntValue);
        }
        if (!zBooleanValue) {
            iIntValue2 = qVar.a(iIntValue2);
        }
        boolean z5 = false;
        if (this.i) {
            M0.w wVar = this.f210j;
            int i = G0.I.f1469c;
            long j4 = wVar.f3454b;
            if (iIntValue != ((int) (j4 >> 32)) || iIntValue2 != ((int) (j4 & 4294967295L))) {
                int iMin = Math.min(iIntValue, iIntValue2);
                F.P p6 = this.f211k;
                EnumC0011f0 enumC0011f0 = EnumC0011f0.f312h;
                if (iMin >= 0) {
                    int iMax = Math.max(iIntValue, iIntValue2);
                    C0110f c0110f = wVar.f3453a;
                    if (iMax <= c0110f.f1494h.length()) {
                        if (zBooleanValue || iIntValue == iIntValue2) {
                            p6.p(false);
                            p6.n(enumC0011f0);
                        } else {
                            p6.f(true);
                        }
                        this.f212l.f434t.invoke(new M0.w(c0110f, AbstractC0599v0.d(iIntValue, iIntValue2), (G0.I) null));
                        z5 = true;
                    } else {
                        p6.p(false);
                        p6.n(enumC0011f0);
                    }
                } else {
                    p6.p(false);
                    p6.n(enumC0011f0);
                }
            }
        }
        return Boolean.valueOf(z5);
    }
}
