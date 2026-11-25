package p130y0;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f14381a = new c1();

    public final void a(r rVar) {
        ViewParent parent = rVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(rVar, rVar);
        }
    }
}
