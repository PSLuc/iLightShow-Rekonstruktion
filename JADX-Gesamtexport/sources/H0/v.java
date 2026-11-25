package H0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f1713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextPaint f1715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextDirectionHeuristic f1717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Layout.Alignment f1718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextUtils.TruncateAt f1720h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1726o;

    public v(CharSequence charSequence, int i, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i6, TextUtils.TruncateAt truncateAt, int i7, int i8, boolean z5, int i9, int i10, int i11, int i12) {
        this.f1713a = charSequence;
        this.f1714b = i;
        this.f1715c = textPaint;
        this.f1716d = i3;
        this.f1717e = textDirectionHeuristic;
        this.f1718f = alignment;
        this.f1719g = i6;
        this.f1720h = truncateAt;
        this.i = i7;
        this.f1721j = i8;
        this.f1722k = z5;
        this.f1723l = i9;
        this.f1724m = i10;
        this.f1725n = i11;
        this.f1726o = i12;
        if (i < 0) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
    }
}
