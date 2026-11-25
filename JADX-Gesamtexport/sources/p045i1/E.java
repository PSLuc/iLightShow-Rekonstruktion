package p045i1;

import D4.c;
import E4.i;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E extends i implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final E f9395p = new E(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // D4.c
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
