package J1;

import E4.k;
import E4.l;
import android.view.View;
import com.nanjoran.ilightshow.R;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l implements D4.c {
    public static final g i = new g(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f1904j = new g(1, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1905h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, int i6) {
        super(i3);
        this.f1905h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f1905h) {
            case 0:
                View view = (View) obj;
                k.f("view", view);
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                k.f("view", view2);
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof f) {
                    return (f) tag;
                }
                return null;
        }
    }
}
