package D;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.SelectGesture;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s {
    public static /* synthetic */ GraphemeClusterSegmentFinder g(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder h(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture i(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture j(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj) {
        return obj instanceof SelectGesture;
    }
}
