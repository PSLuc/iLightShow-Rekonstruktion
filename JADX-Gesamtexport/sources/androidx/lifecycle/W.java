package androidx.lifecycle;

import android.view.View;
import com.nanjoran.ilightshow.R;

/* JADX INFO: loaded from: classes.dex */
public final class W extends E4.l implements D4.c {
    public static final W i = new W(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final W f6978j = new W(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final W f6979k = new W(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final W f6980l = new W(1, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6981h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i3, int i6) {
        super(i3);
        this.f6981h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f6981h) {
            case 0:
                View view = (View) obj;
                E4.k.f("currentView", view);
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                View view2 = (View) obj;
                E4.k.f("viewParent", view2);
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof InterfaceC0458s) {
                    return (InterfaceC0458s) tag;
                }
                return null;
            case 2:
                View view3 = (View) obj;
                E4.k.f("view", view3);
                Object parent2 = view3.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            default:
                View view4 = (View) obj;
                E4.k.f("view", view4);
                Object tag2 = view4.getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof V) {
                    return (V) tag2;
                }
                return null;
        }
    }
}
