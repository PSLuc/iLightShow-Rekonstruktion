package J0;

import H0.x;
import H0.z;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i3, int i6, int i7, int i8, CharSequence charSequence, int i9, int i10, boolean z5, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i9)) != layout.getLineCount() - 1) {
            return;
        }
        x xVar = z.f1745a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fZ = AbstractC0599v0.z(layout, lineForOffset, paint) + AbstractC0599v0.y(layout, lineForOffset, paint);
            if (fZ == 0.0f) {
                return;
            }
            E4.k.c(canvas);
            canvas.translate(fZ, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z5) {
        return 0;
    }
}
