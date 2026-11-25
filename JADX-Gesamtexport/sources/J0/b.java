package J0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1870b;

    public /* synthetic */ b(int i, Object obj) {
        this.f1869a = i;
        this.f1870b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f1869a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f1870b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f1870b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f1869a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f1870b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f1870b);
                break;
        }
    }
}
