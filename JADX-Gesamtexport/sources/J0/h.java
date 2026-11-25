package J0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1880f = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1881g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1882h = Integer.MIN_VALUE;
    public int i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1884k;

    public h(float f6, int i, boolean z5, boolean z6, float f7) {
        this.f1875a = f6;
        this.f1876b = i;
        this.f1877c = z5;
        this.f1878d = z6;
        this.f1879e = f7;
        if ((0.0f > f7 || f7 > 1.0f) && f7 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i3, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
        int i8 = fontMetricsInt.descent;
        int i9 = fontMetricsInt.ascent;
        if (i8 - i9 <= 0) {
            return;
        }
        boolean z5 = i == 0;
        boolean z6 = i3 == this.f1876b;
        boolean z7 = this.f1878d;
        boolean z8 = this.f1877c;
        if (z5 && z6 && z8 && z7) {
            return;
        }
        if (this.f1880f == Integer.MIN_VALUE) {
            int i10 = i8 - i9;
            int iCeil = (int) Math.ceil(this.f1875a);
            int i11 = iCeil - i10;
            float fAbs = this.f1879e;
            if (fAbs == -1.0f) {
                fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int iCeil2 = (int) (i11 <= 0 ? Math.ceil(i11 * fAbs) : Math.ceil((1.0f - fAbs) * i11));
            int i12 = fontMetricsInt.descent;
            int i13 = iCeil2 + i12;
            this.f1882h = i13;
            int i14 = i13 - iCeil;
            this.f1881g = i14;
            if (z8) {
                i14 = fontMetricsInt.ascent;
            }
            this.f1880f = i14;
            if (z7) {
                i13 = i12;
            }
            this.i = i13;
            this.f1883j = fontMetricsInt.ascent - i14;
            this.f1884k = i13 - i12;
        }
        fontMetricsInt.ascent = z5 ? this.f1880f : this.f1881g;
        fontMetricsInt.descent = z6 ? this.i : this.f1882h;
    }
}
