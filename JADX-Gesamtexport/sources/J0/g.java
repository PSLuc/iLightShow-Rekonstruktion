package J0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class g implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1874a;

    public g(float f6) {
        this.f1874a = f6;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i3, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
        int i8 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i8 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f1874a);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i8)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
