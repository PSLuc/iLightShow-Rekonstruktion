package B;

import N.C0230o;
import android.R;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: renamed from: B.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0045x extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f467h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045x(int i) {
        super(2);
        this.f467h = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        int i;
        C0230o c0230o = (C0230o) obj;
        ((Number) obj2).intValue();
        c0230o.V(-1451087197);
        int i3 = this.f467h;
        if (i3 == 1) {
            i = R.string.cut;
        } else if (i3 == 2) {
            i = R.string.copy;
        } else if (i3 == 3) {
            i = R.string.paste;
        } else {
            if (i3 != 4) {
                throw null;
            }
            i = R.string.selectAll;
        }
        String strK = AbstractC0599v0.K(i, c0230o);
        c0230o.p(false);
        return strK;
    }
}
