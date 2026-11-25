package O1;

import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.EnumC0579l;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4495c;

    public static C0313f a() {
        C0313f c0313f = new C0313f();
        c0313f.f4491b = 0;
        c0313f.f4492c = "";
        return c0313f;
    }

    public final String toString() {
        int i = this.f4493a;
        int i3 = AbstractC0602x.f8015a;
        com.google.android.gms.internal.play_billing.C c6 = EnumC0579l.f7961j;
        Integer numValueOf = Integer.valueOf(i);
        return p012c.k.s("Response Code: ", (!c6.containsKey(numValueOf) ? EnumC0579l.RESPONSE_CODE_UNSPECIFIED : (EnumC0579l) c6.get(numValueOf)).toString(), ", Debug Message: ", this.f4495c);
    }
}
