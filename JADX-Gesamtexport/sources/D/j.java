package D;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ LineBreakConfig.Builder c() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout g(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f6, float f7, BoringLayout.Metrics metrics, boolean z5, boolean z6, TextUtils.TruncateAt truncateAt, int i3) {
        return new BoringLayout(charSequence, textPaint, i, alignment, f6, f7, metrics, z5, truncateAt, i3, z6);
    }

    public static /* synthetic */ EditorBoundsInfo.Builder j() {
        return new EditorBoundsInfo.Builder();
    }
}
