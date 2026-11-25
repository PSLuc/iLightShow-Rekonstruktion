package N3;

import L.e2;
import N.C0230o;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;

/* JADX INFO: loaded from: classes.dex */
public final class O implements D4.f {
    public static final O i = new O(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final O f4064j = new O(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final O f4065k = new O(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final O f4066l = new O(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final O f4067m = new O(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final O f4068n = new O(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4069h;

    public /* synthetic */ O(int i3) {
        this.f4069h = i3;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f4069h) {
            case 0:
                C0230o c0230o = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                E4.k.f("$this$Button", (p123x.V) obj);
                if ((iIntValue & 81) == 16 && c0230o.B()) {
                    c0230o.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.action_enable, c0230o), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o, 0, 0, 131070);
                }
                break;
            case 1:
                C0230o c0230o2 = (C0230o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                E4.k.f("$this$TextButton", (p123x.V) obj);
                if ((iIntValue2 & 81) == 16 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.action_dismiss, c0230o2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 0, 0, 131070);
                }
                break;
            case 2:
                C0230o c0230o3 = (C0230o) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                E4.k.f("$this$Button", (p123x.V) obj);
                if ((iIntValue3 & 81) == 16 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.action_create, c0230o3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o3, 0, 0, 131070);
                }
                break;
            case 3:
                C0230o c0230o4 = (C0230o) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                E4.k.f("$this$TextButton", (p123x.V) obj);
                if ((iIntValue4 & 81) == 16 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.action_cancel, c0230o4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 0, 0, 131070);
                }
                break;
            case 4:
                C0230o c0230o5 = (C0230o) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                E4.k.f("$this$Button", (p123x.V) obj);
                if ((iIntValue5 & 81) == 16 && c0230o5.B()) {
                    c0230o5.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.settings_enable_legacy_mode, c0230o5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 0, 0, 131070);
                }
                break;
            default:
                C0230o c0230o6 = (C0230o) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                E4.k.f("$this$TextButton", (p123x.V) obj);
                if ((iIntValue6 & 81) == 16 && c0230o6.B()) {
                    c0230o6.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.action_cancel, c0230o6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o6, 0, 0, 131070);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
