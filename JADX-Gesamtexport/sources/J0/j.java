package J0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1892d;

    public j(int i, float f6, float f7, float f8) {
        this.f1889a = i;
        this.f1890b = f6;
        this.f1891c = f7;
        this.f1892d = f8;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f1892d, this.f1890b, this.f1891c, this.f1889a);
    }
}
