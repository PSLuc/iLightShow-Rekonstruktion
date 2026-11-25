package J0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1894b;

    public k(boolean z5, boolean z6) {
        this.f1893a = z5;
        this.f1894b = z6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f1893a);
        textPaint.setStrikeThruText(this.f1894b);
    }
}
