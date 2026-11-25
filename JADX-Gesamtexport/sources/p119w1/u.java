package p119w1;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Spannable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13455h = false;
    public Spannable i;

    public u(Spannable spannable) {
        this.i = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.i.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.i.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.i.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.i.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.i.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.i.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i3, Class cls) {
        return this.i.getSpans(i, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.i.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i3, Class cls) {
        return this.i.nextSpanTransition(i, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.i;
        if (!this.f13455h && (spannable instanceof PrecomputedText)) {
            this.i = new SpannableString(spannable);
        }
        this.f13455h = true;
        this.i.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i3, int i6) {
        Spannable spannable = this.i;
        if (!this.f13455h && (spannable instanceof PrecomputedText)) {
            this.i = new SpannableString(spannable);
        }
        this.f13455h = true;
        this.i.setSpan(obj, i, i3, i6);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i3) {
        return this.i.subSequence(i, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.i.toString();
    }
}
