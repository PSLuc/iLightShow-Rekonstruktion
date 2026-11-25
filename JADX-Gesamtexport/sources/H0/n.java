package H0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f1705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f1706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1708d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1709e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f1710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1711g;

    public n(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f1705a = charSequence;
        this.f1706b = textPaint;
        this.f1707c = i;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f1711g) {
            TextDirectionHeuristic textDirectionHeuristicA = z.a(this.f1707c);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f1705a;
            TextPaint textPaint = this.f1706b;
            this.f1710f = i >= 33 ? c.b(charSequence, textPaint, textDirectionHeuristicA) : d.b(charSequence, textPaint, textDirectionHeuristicA);
            this.f1711g = true;
        }
        return this.f1710f;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    public final float b() {
        if (!Float.isNaN(this.f1708d)) {
            return this.f1708d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        TextPaint textPaint = this.f1706b;
        CharSequence charSequence = this.f1705a;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint));
        }
        if (fCeil != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (spanned.nextSpanTransition(-1, spanned.length(), J0.f.class) != spanned.length() || spanned.nextSpanTransition(-1, spanned.length(), J0.e.class) != spanned.length()) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f1708d = fCeil;
        return fCeil;
    }
}
