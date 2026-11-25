package O1;

import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.C0559d1;
import com.google.android.gms.internal.play_billing.C0562e1;
import com.google.android.gms.internal.play_billing.C0565f1;
import com.google.android.gms.internal.play_billing.C0568g1;
import com.google.android.gms.internal.play_billing.C0571h1;
import com.google.android.gms.internal.play_billing.C0574i1;
import com.google.android.gms.internal.play_billing.k1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4542a = 0;

    static {
        int i = z.f4543b;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = AbstractC0602x.f8015a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingLogger");
            return null;
        }
    }

    public static C0562e1 b(int i, int i3, g gVar, String str, k1 k1Var) {
        try {
            C0571h1 c0571h1Q = C0574i1.q();
            int i6 = gVar.f4493a;
            c0571h1Q.c();
            C0574i1.p((C0574i1) c0571h1Q.i, i6);
            String str2 = gVar.f4495c;
            c0571h1Q.c();
            C0574i1.s((C0574i1) c0571h1Q.i, str2);
            int i7 = gVar.f4494b;
            if (i7 != 0) {
                c0571h1Q.c();
                C0574i1.t((C0574i1) c0571h1Q.i, i7);
            }
            if (i != 0) {
                c0571h1Q.c();
                C0574i1.o((C0574i1) c0571h1Q.i, i);
            }
            if (str != null) {
                c0571h1Q.c();
                C0574i1.r((C0574i1) c0571h1Q.i, str);
            }
            C0559d1 c0559d1S = C0562e1.s();
            c0559d1S.d(c0571h1Q);
            c0559d1S.c();
            C0562e1.r((C0562e1) c0559d1S.i, i3);
            if (!k1Var.equals(k1.BROADCAST_ACTION_UNSPECIFIED)) {
                c0559d1S.c();
                C0562e1.v((C0562e1) c0559d1S.i, k1Var);
            }
            return (C0562e1) c0559d1S.a();
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingLogger");
            return null;
        }
    }

    public static C0568g1 c(int i, k1 k1Var) {
        try {
            C0565f1 c0565f1R = C0568g1.r();
            c0565f1R.c();
            C0568g1.q((C0568g1) c0565f1R.i, i);
            if (!k1Var.equals(k1.BROADCAST_ACTION_UNSPECIFIED)) {
                c0565f1R.c();
                C0568g1.t((C0568g1) c0565f1R.i, k1Var);
            }
            return (C0568g1) c0565f1R.a();
        } catch (Exception unused) {
            AbstractC0602x.h("BillingLogger");
            return null;
        }
    }
}
