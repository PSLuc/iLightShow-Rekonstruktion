package D;

import B.C0025m0;
import B.C0036s0;
import F.P;
import G0.I;
import M0.C0198a;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p130y0.G0;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0025m0 f658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0036s0 f660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P f661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G0 f662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public M0.w f664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f665h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f666j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f667k = true;

    public F(M0.w wVar, C0025m0 c0025m0, boolean z5, C0036s0 c0036s0, P p6, G0 g6) {
        this.f658a = c0025m0;
        this.f659b = z5;
        this.f660c = c0036s0;
        this.f661d = p6;
        this.f662e = g6;
        this.f664g = wVar;
    }

    public final void a(M0.i iVar) {
        this.f663f++;
        try {
            this.f666j.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [D4.c, E4.l] */
    public final boolean b() {
        int i = this.f663f - 1;
        this.f663f = i;
        if (i == 0) {
            ArrayList arrayList = this.f666j;
            if (!arrayList.isEmpty()) {
                ((D) this.f658a.i).f647c.invoke(p089q4.l.u0(arrayList));
                arrayList.clear();
            }
        }
        return this.f663f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z5 = this.f667k;
        if (!z5) {
            return z5;
        }
        this.f663f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z5 = this.f667k;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f666j.clear();
        this.f663f = 0;
        this.f667k = false;
        D d6 = (D) this.f658a.i;
        int size = d6.f653j.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = d6.f653j;
            if (E4.k.a(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z5 = this.f667k;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z5 = this.f667k;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z5 = this.f667k;
        return z5 ? this.f659b : z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z5 = this.f667k;
        if (z5) {
            a(new C0198a(String.valueOf(charSequence), i));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i3) {
        boolean z5 = this.f667k;
        if (!z5) {
            return z5;
        }
        a(new M0.g(i, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i3) {
        boolean z5 = this.f667k;
        if (!z5) {
            return z5;
        }
        a(new M0.h(i, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z5 = this.f667k;
        if (!z5) {
            return z5;
        }
        a(new M0.k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        M0.w wVar = this.f664g;
        return TextUtils.getCapsMode(wVar.f3453a.f1494h, I.e(wVar.f3454b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z5 = (i & 1) != 0;
        this.i = z5;
        if (z5) {
            this.f665h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return G4.a.j(this.f664g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (I.b(this.f664g.f3454b)) {
            return null;
        }
        return p081p0.c.l0(this.f664g).f1494h;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i3) {
        return p081p0.c.m0(this.f664g, i).f1494h;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i3) {
        return p081p0.c.n0(this.f664g, i).f1494h;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z5 = this.f667k;
        if (z5) {
            z5 = false;
            switch (i) {
                case R.id.selectAll:
                    a(new M0.v(0, this.f664g.f3453a.f1494h.length()));
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
        boolean z5 = this.f667k;
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
            ((D) this.f658a.i).f648d.invoke(new M0.l(i3));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            i iVar = i.f692a;
            A2.e eVar = new A2.e(5, this);
            iVar.a(this.f660c, this.f661d, handwritingGesture, this.f662e, executor, intConsumer, eVar);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z5 = this.f667k;
        if (z5) {
            return true;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return i.f692a.b(this.f660c, this.f661d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
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
        boolean z8 = this.f667k;
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
        A a6 = ((D) this.f658a.i).f656m;
        synchronized (a6.f629c) {
            try {
                a6.f632f = z5;
                a6.f633g = z6;
                a6.f634h = z9;
                a6.i = z7;
                if (z10) {
                    a6.f631e = true;
                    if (a6.f635j != null) {
                        a6.a();
                    }
                }
                a6.f630d = z11;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, p4.f] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z5 = this.f667k;
        if (!z5) {
            return z5;
        }
        ((BaseInputConnection) ((D) this.f658a.i).f654k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i3) {
        boolean z5 = this.f667k;
        if (z5) {
            a(new M0.t(i, i3));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z5 = this.f667k;
        if (z5) {
            a(new M0.u(String.valueOf(charSequence), i));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i3) {
        boolean z5 = this.f667k;
        if (!z5) {
            return z5;
        }
        a(new M0.v(i, i3));
        return true;
    }
}
