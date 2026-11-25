package D;

import B.C0025m0;
import B.C0036s0;
import B.C0043w;
import F.P;
import G0.I;
import S1.h0;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2;
import p130y0.G0;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f646b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0036s0 f649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public P f650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public G0 f651g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A f656m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E4.l f647c = C0051a.f668j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E4.l f648d = C0051a.f669k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public M0.w f652h = new M0.w(4, "", I.f1468b);
    public M0.m i = M0.m.f3430f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f653j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f654k = G4.a.y(p084p4.g.i, new C0043w(7, this));

    public D(View view, C0054d c0054d, x xVar) {
        this.f645a = view;
        this.f646b = xVar;
        this.f656m = new A(c0054d, xVar);
    }

    public final F a(EditorInfo editorInfo) {
        int i;
        int i3;
        int i6 = 2;
        M0.w wVar = this.f652h;
        String str = wVar.f3453a.f1494h;
        M0.m mVar = this.i;
        int i7 = mVar.f3434d;
        if (i7 == 1) {
            i = 0;
        } else if (i7 == 0) {
            i = 1;
        } else if (i7 == 2) {
            i = 2;
        } else if (i7 == 6) {
            i = 5;
        } else if (i7 == 5) {
            i = 7;
        } else if (i7 == 3) {
            i = 3;
        } else if (i7 == 4) {
            i = 4;
        } else {
            if (i7 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        E.f657a.a(editorInfo, mVar.f3435e);
        int i8 = mVar.f3433c;
        if (i8 == 1) {
            i3 = 1;
        } else if (i8 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i3 = 1;
        } else if (i8 == 3) {
            i3 = 2;
        } else if (i8 == 4) {
            i3 = 3;
        } else if (i8 == 5) {
            i3 = 17;
        } else if (i8 == 6) {
            i3 = 33;
        } else if (i8 == 7) {
            i3 = 129;
        } else if (i8 == 8) {
            i3 = 18;
        } else {
            if (i8 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i3 = 8194;
        }
        editorInfo.inputType = i3;
        if ((i3 & 1) == 1) {
            editorInfo.inputType = i3 | 131072;
            if (mVar.f3434d == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i9 = editorInfo.inputType;
        if ((i9 & 1) == 1) {
            int i10 = mVar.f3431a;
            if (i10 == 1) {
                editorInfo.inputType = i9 | 4096;
            } else if (i10 == 2) {
                editorInfo.inputType = i9 | 8192;
            } else if (i10 == 3) {
                editorInfo.inputType = i9 | Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (mVar.f3432b) {
                editorInfo.inputType |= 32768;
            }
        }
        int i11 = I.f1469c;
        long j4 = wVar.f3454b;
        editorInfo.initialSelStart = (int) (j4 >> 32);
        editorInfo.initialSelEnd = (int) (j4 & 4294967295L);
        h0.x(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!C.e.f596a || i8 == 7 || i8 == 8) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            r.f701a.a(editorInfo);
        }
        B b6 = C.f644a;
        if (p119w1.h.c()) {
            p119w1.h.a().h(editorInfo);
        }
        F f6 = new F(this.f652h, new C0025m0(i6, this), this.i.f3432b, this.f649e, this.f650f, this.f651g);
        this.f653j.add(new WeakReference(f6));
        return f6;
    }
}
