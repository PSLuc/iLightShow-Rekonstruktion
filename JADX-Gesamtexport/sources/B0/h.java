package B0;

import android.os.Bundle;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static Bundle a(ViewStructure viewStructure) {
        return viewStructure.getExtras();
    }

    public static void b(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public static void c(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public static void d(ViewStructure viewStructure, int i, int i3, int i6, int i7, int i8, int i9) {
        viewStructure.setDimens(i, i3, i6, i7, i8, i9);
    }

    public static void e(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void f(ViewStructure viewStructure, float f6, int i, int i3, int i6) {
        viewStructure.setTextStyle(f6, i, i3, i6);
    }
}
