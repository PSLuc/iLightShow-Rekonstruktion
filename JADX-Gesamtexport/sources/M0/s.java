package M0;

import B.C0025m0;
import G0.I;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0025m0 f3439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f3442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f3445g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3446h = true;

    public s(w wVar, C0025m0 c0025m0, boolean z5) {
        this.f3439a = c0025m0;
        this.f3440b = z5;
        this.f3442d = wVar;
    }

    public final void a(i iVar) {
        this.f3441c++;
        try {
            this.f3445g.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [D4.c, E4.l] */
    public final boolean b() {
        int i = this.f3441c - 1;
        this.f3441c = i;
        if (i == 0) {
            ArrayList arrayList = this.f3445g;
            if (!arrayList.isEmpty()) {
                ((z) this.f3439a.i).f3466e.invoke(p089q4.l.u0(arrayList));
                arrayList.clear();
            }
        }
        return this.f3441c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z5 = this.f3446h;
        if (!z5) {
            return z5;
        }
        this.f3441c++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z5 = this.f3446h;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f3445g.clear();
        this.f3441c = 0;
        this.f3446h = false;
        z zVar = (z) this.f3439a.i;
        int size = zVar.i.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = zVar.i;
            if (E4.k.a(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z5 = this.f3446h;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z5 = this.f3446h;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z5 = this.f3446h;
        return z5 ? this.f3440b : z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z5 = this.f3446h;
        if (z5) {
            a(new C0198a(String.valueOf(charSequence), i));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i3) {
        boolean z5 = this.f3446h;
        if (!z5) {
            return z5;
        }
        a(new g(i, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i3) {
        boolean z5 = this.f3446h;
        if (!z5) {
            return z5;
        }
        a(new h(i, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z5 = this.f3446h;
        if (!z5) {
            return z5;
        }
        a(new k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        w wVar = this.f3442d;
        return TextUtils.getCapsMode(wVar.f3453a.f1494h, I.e(wVar.f3454b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z5 = (i & 1) != 0;
        this.f3444f = z5;
        if (z5) {
            this.f3443e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC0599v0.N(this.f3442d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (I.b(this.f3442d.f3454b)) {
            return null;
        }
        return p081p0.c.l0(this.f3442d).f1494h;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i3) {
        return p081p0.c.m0(this.f3442d, i).f1494h;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i3) {
        return p081p0.c.n0(this.f3442d, i).f1494h;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z5 = this.f3446h;
        if (z5) {
            z5 = false;
            switch (i) {
                case R.id.selectAll:
                    a(new v(0, this.f3442d.f3453a.f1494h.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000a  */
    /* JADX WARN: Type inference failed for: r2v4, types: [D4.c, E4.l] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i3;
        boolean z5 = this.f3446h;
        if (z5) {
            z5 = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i3 = 2;
                        break;
                    case 3:
                        i3 = 3;
                        break;
                    case 4:
                        i3 = 4;
                        break;
                    case 5:
                        i3 = 6;
                        break;
                    case 6:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 5;
                        break;
                    default:
                        i3 = 1;
                        break;
                }
            } else {
                i3 = 1;
            }
            ((z) this.f3439a.i).f3467f.invoke(new l(i3));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z5 = this.f3446h;
        if (z5) {
            return true;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z5) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8 = this.f3446h;
        if (!z8) {
            return z8;
        }
        boolean z9 = false;
        boolean z10 = (i & 1) != 0;
        boolean z11 = (i & 2) != 0;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            z5 = (i & 16) != 0;
            z6 = (i & 8) != 0;
            boolean z12 = (i & 4) != 0;
            if (i3 >= 34 && (i & 32) != 0) {
                z9 = true;
            }
            if (z5 || z6 || z12 || z9) {
                z7 = z9;
                z9 = z12;
            } else if (i3 >= 34) {
                z7 = true;
                z9 = true;
                z5 = true;
                z6 = true;
            } else {
                z5 = true;
                z6 = true;
                z7 = z9;
                z9 = true;
            }
        } else {
            z5 = true;
            z6 = true;
            z7 = false;
        }
        e eVar = ((z) this.f3439a.i).f3472l;
        synchronized (eVar.f3405c) {
            try {
                eVar.f3408f = z5;
                eVar.f3409g = z6;
                eVar.f3410h = z9;
                eVar.i = z7;
                if (z10) {
                    eVar.f3407e = true;
                    if (eVar.f3411j != null) {
                        eVar.a();
                    }
                }
                eVar.f3406d = z11;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, p4.f] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z5 = this.f3446h;
        if (!z5) {
            return z5;
        }
        ((BaseInputConnection) ((z) this.f3439a.i).f3470j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i3) {
        boolean z5 = this.f3446h;
        if (z5) {
            a(new t(i, i3));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z5 = this.f3446h;
        if (z5) {
            a(new u(String.valueOf(charSequence), i));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i3) {
        boolean z5 = this.f3446h;
        if (!z5) {
            return z5;
        }
        a(new v(i, i3));
        return true;
    }
}
