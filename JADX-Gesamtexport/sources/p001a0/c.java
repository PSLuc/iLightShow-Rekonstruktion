package p001a0;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6114a = new c();

    public final int a(ViewStructure viewStructure, int i) {
        return viewStructure.addChildCount(i);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }

    public final void c(ViewStructure viewStructure, int i, int i3, int i6, int i7, int i8, int i9) {
        viewStructure.setDimens(i, i3, i6, i7, i8, i9);
    }

    public final void d(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        viewStructure.setId(i, str, str2, str3);
    }
}
