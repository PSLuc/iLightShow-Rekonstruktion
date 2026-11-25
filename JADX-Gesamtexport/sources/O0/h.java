package O0;

import B.C0025m0;
import N.C0217h0;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p057l.A;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p119w1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4414a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4416c;

    public h(C0217h0 c0217h0, C0025m0 c0025m0) {
        this.f4415b = c0217h0;
        this.f4416c = c0025m0;
    }

    @Override // p119w1.f
    public void a() {
        switch (this.f4414a) {
            case 0:
                ((C0025m0) this.f4416c).i = k.f4419a;
                break;
        }
    }

    @Override // p119w1.f
    public final void b() throws Throwable {
        InputFilter[] filters;
        int length;
        switch (this.f4414a) {
            case 0:
                ((C0217h0) this.f4415b).setValue(Boolean.TRUE);
                ((C0025m0) this.f4416c).i = new l(true);
                break;
            default:
                TextView textView = (TextView) ((WeakReference) this.f4415b).get();
                InputFilter inputFilter = (InputFilter) ((WeakReference) this.f4416c).get();
                if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                    for (InputFilter inputFilter2 : filters) {
                        if (inputFilter2 == inputFilter) {
                            if (textView.isAttachedToWindow()) {
                                CharSequence text = textView.getText();
                                p119w1.h hVarA = p119w1.h.a();
                                if (text == null) {
                                    length = 0;
                                } else {
                                    hVarA.getClass();
                                    length = text.length();
                                }
                                CharSequence charSequenceF = hVarA.f(0, length, 0, text);
                                if (text != charSequenceF) {
                                    int selectionStart = Selection.getSelectionStart(charSequenceF);
                                    int selectionEnd = Selection.getSelectionEnd(charSequenceF);
                                    textView.setText(charSequenceF);
                                    if (charSequenceF instanceof Spannable) {
                                        Spannable spannable = (Spannable) charSequenceF;
                                        if (selectionStart >= 0 && selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                                        } else if (selectionStart >= 0) {
                                            Selection.setSelection(spannable, selectionStart);
                                        } else if (selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionEnd);
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }

    public h(A a6, p131y1.c cVar) {
        this.f4415b = new WeakReference(a6);
        this.f4416c = new WeakReference(cVar);
    }
}
