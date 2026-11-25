package p057l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0814w {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i, int i3, int i6, int i7) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i3, i6, i7);
    }

    public static void c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
