package p119w1;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class q implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13444h;
    public final AtomicInteger i = new AtomicInteger(0);

    public q(Object obj) {
        this.f13444h = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f13444h).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i3, int i6) {
        ((TextWatcher) this.f13444h).beforeTextChanged(charSequence, i, i3, i6);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i3) {
        if (this.i.get() <= 0 || !(obj instanceof t)) {
            ((SpanWatcher) this.f13444h).onSpanAdded(spannable, obj, i, i3);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i3, int i6, int i7) {
        if (this.i.get() <= 0 || !(obj instanceof t)) {
            ((SpanWatcher) this.f13444h).onSpanChanged(spannable, obj, i, i3, i6, i7);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i3) {
        if (this.i.get() <= 0 || !(obj instanceof t)) {
            ((SpanWatcher) this.f13444h).onSpanRemoved(spannable, obj, i, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i3, int i6) {
        ((TextWatcher) this.f13444h).onTextChanged(charSequence, i, i3, i6);
    }
}
