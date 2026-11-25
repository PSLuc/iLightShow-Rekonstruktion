package p131y1;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import p119w1.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f14578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p085q.b f14579b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        p085q.b bVar = new p085q.b(12);
        super(inputConnection, false);
        this.f14578a = editText;
        this.f14579b = bVar;
        if (h.c()) {
            h.a().h(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i3) {
        Editable editableText = this.f14578a.getEditableText();
        this.f14579b.getClass();
        return p085q.b.b(this, editableText, i, i3, false) || super.deleteSurroundingText(i, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i3) {
        Editable editableText = this.f14578a.getEditableText();
        this.f14579b.getClass();
        return p085q.b.b(this, editableText, i, i3, true) || super.deleteSurroundingTextInCodePoints(i, i3);
    }
}
