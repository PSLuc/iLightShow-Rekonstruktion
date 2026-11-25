package M0;

import D.F;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class n implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p090r.v f3436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f3437b;

    public n(F f6, p090r.v vVar) {
        this.f3436a = vVar;
        this.f3437b = f6;
    }

    public final void a(F f6) {
        f6.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() throws IllegalAccessException, InvocationTargetException {
        F f6 = this.f3437b;
        if (f6 != null) {
            if (f6 != null) {
                a(f6);
                this.f3437b = null;
            }
            this.f3436a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i3) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.deleteSurroundingText(i, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i3) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.deleteSurroundingTextInCodePoints(i, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        F f6 = this.f3437b;
        return f6 != null ? f6.getExtractedText(extractedTextRequest, i) : new ExtractedText();
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        CharSequence selectedText;
        F f6 = this.f3437b;
        return (f6 == null || (selectedText = f6.getSelectedText(i)) == null) ? "" : selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i3) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.getTextAfterCursor(i, i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i3) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.getTextBeforeCursor(i, i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z5) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i3) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.setComposingRegion(i, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i3) {
        F f6 = this.f3437b;
        if (f6 != null) {
            return f6.setSelection(i, i3);
        }
        return false;
    }
}
