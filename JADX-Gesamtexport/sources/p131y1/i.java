package p131y1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p057l.AbstractC0801m;
import p119w1.h;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC0801m f14589h;
    public h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14590j = true;

    public i(AbstractC0801m abstractC0801m) {
        this.f14589h = abstractC0801m;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            h hVarA = h.a();
            if (editableText == null) {
                length = 0;
            } else {
                hVarA.getClass();
                length = editableText.length();
            }
            hVarA.f(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i3, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i3, int i6) throws Throwable {
        AbstractC0801m abstractC0801m = this.f14589h;
        if (!abstractC0801m.isInEditMode() && this.f14590j && h.c() && i3 <= i6 && (charSequence instanceof Spannable)) {
            int iB = h.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    h.a().f(i, i6 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            h hVarA = h.a();
            if (this.i == null) {
                this.i = new h(abstractC0801m);
            }
            hVarA.g(this.i);
        }
    }
}
