package p018d;

import E4.k;
import L4.l;
import N.C0230o;
import N.C0247x;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p012c.E;
import p012c.F;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0247x f8556a = new C0247x(b.f8551k);

    public static E a(C0230o c0230o) {
        c0230o.W(-2068013981);
        E e6 = (E) c0230o.k(f8556a);
        c0230o.W(1680121597);
        if (e6 == null) {
            View view = (View) c0230o.k(AndroidCompositionLocals_androidKt.f6734f);
            k.f("<this>", view);
            e6 = (E) l.O(l.Q(l.P(view, F.f7127j), F.f7128k));
        }
        c0230o.p(false);
        if (e6 == null) {
            Object baseContext = (Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof E) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            e6 = (E) baseContext;
        }
        c0230o.p(false);
        return e6;
    }
}
