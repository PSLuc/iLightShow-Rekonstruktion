package D;

import B.C0036s0;
import F.P;
import G0.I;
import P4.i0;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f703b;

    public /* synthetic */ t(int i, Object obj) {
        this.f702a = i;
        this.f703b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f702a) {
            case 0:
                P p6 = (P) this.f703b;
                if (p6 != null) {
                    C0036s0 c0036s0 = p6.f1123d;
                    if (c0036s0 != null) {
                        c0036s0.e(I.f1468b);
                    }
                    C0036s0 c0036s1 = p6.f1123d;
                    if (c0036s1 != null) {
                        c0036s1.f(I.f1468b);
                        break;
                    }
                }
                break;
            default:
                ((i0) this.f703b).c(null);
                break;
        }
    }
}
