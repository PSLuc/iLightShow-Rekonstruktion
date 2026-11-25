package p012c;

import D4.c;
import E4.k;
import E4.l;
import android.content.res.Resources;
import android.view.View;
import com.nanjoran.ilightshow.R;

/* JADX INFO: loaded from: classes.dex */
public final class F extends l implements c {
    public static final F i = new F(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final F f7127j = new F(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final F f7128k = new F(1, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7129h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i3, int i6) {
        super(i3);
        this.f7129h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f7129h) {
            case 0:
                Resources resources = (Resources) obj;
                k.f("resources", resources);
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                View view = (View) obj;
                k.f("it", view);
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                k.f("it", view2);
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof E) {
                    return (E) tag;
                }
                return null;
        }
    }
}
