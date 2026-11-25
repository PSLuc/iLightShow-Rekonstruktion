package F1;

import B.AbstractC0013g0;
import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: F1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T("activity")
public class C0086c extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f1338c;

    public C0086c(Context context) {
        E4.k.f("context", context);
        for (Object obj : L4.l.P(context, C0085b.i)) {
            if (((Context) obj) instanceof Activity) {
                this.f1338c = (Activity) obj;
            }
        }
        obj = null;
        this.f1338c = (Activity) obj;
    }

    @Override // F1.U
    public final B a() {
        return new C0084a(this);
    }

    @Override // F1.U
    public final B c(B b6) {
        throw new IllegalStateException(AbstractC0013g0.l(new StringBuilder("Destination "), ((C0084a) b6).f1247m, " does not have an Intent set.").toString());
    }

    @Override // F1.U
    public final boolean f() {
        Activity activity = this.f1338c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
