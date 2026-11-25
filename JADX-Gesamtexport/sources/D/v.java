package D;

import B.C0005c0;
import B.C0036s0;
import B.EnumC0011f0;
import B.a1;
import F.P;
import G0.C0110f;
import G0.I;
import M0.C0198a;
import android.graphics.PointF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p113v0.InterfaceC1033p;
import p130y0.G0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f704a = new v();

    private final void C(C0036s0 c0036s0, SelectGesture selectGesture, P p6) {
        if (p6 != null) {
            long jH0 = p027e3.a.h0(c0036s0, p035g0.H.x(selectGesture.getSelectionArea()), G(selectGesture.getGranularity()));
            C0036s0 c0036s1 = p6.f1123d;
            if (c0036s1 != null) {
                c0036s1.f(jH0);
            }
            C0036s0 c0036s2 = p6.f1123d;
            if (c0036s2 != null) {
                c0036s2.e(I.f1468b);
            }
            if (I.b(jH0)) {
                return;
            }
            p6.p(false);
            p6.n(EnumC0011f0.f312h);
        }
    }

    private final void D(H h6, SelectGesture selectGesture, G g6) {
        p035g0.H.x(selectGesture.getSelectionArea());
        G(selectGesture.getGranularity());
        throw null;
    }

    private final void E(C0036s0 c0036s0, SelectRangeGesture selectRangeGesture, P p6) {
        if (p6 != null) {
            long jM = p027e3.a.M(c0036s0, p035g0.H.x(selectRangeGesture.getSelectionStartArea()), p035g0.H.x(selectRangeGesture.getSelectionEndArea()), G(selectRangeGesture.getGranularity()));
            C0036s0 c0036s1 = p6.f1123d;
            if (c0036s1 != null) {
                c0036s1.f(jM);
            }
            C0036s0 c0036s2 = p6.f1123d;
            if (c0036s2 != null) {
                c0036s2.e(I.f1468b);
            }
            if (I.b(jM)) {
                return;
            }
            p6.p(false);
            p6.n(EnumC0011f0.f312h);
        }
    }

    private final void F(H h6, SelectRangeGesture selectRangeGesture, G g6) {
        p035g0.H.x(selectRangeGesture.getSelectionStartArea());
        p035g0.H.x(selectRangeGesture.getSelectionEndArea());
        G(selectRangeGesture.getGranularity());
        throw null;
    }

    private final int G(int i) {
        return i != 1 ? 0 : 1;
    }

    private final int a(H h6, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture, D4.c cVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cVar.invoke(new C0198a(fallbackText, 1));
        return 5;
    }

    private final int c(C0036s0 c0036s0, DeleteGesture deleteGesture, C0110f c0110f, D4.c cVar) {
        int iG = G(deleteGesture.getGranularity());
        long jH0 = p027e3.a.h0(c0036s0, p035g0.H.x(deleteGesture.getDeletionArea()), iG);
        if (I.b(jH0)) {
            return f704a.b(s.i(deleteGesture), cVar);
        }
        h(jH0, c0110f, iG == 1, cVar);
        return 1;
    }

    private final int d(H h6, DeleteGesture deleteGesture, G g6) {
        G(deleteGesture.getGranularity());
        p035g0.H.x(deleteGesture.getDeletionArea());
        throw null;
    }

    private final int e(C0036s0 c0036s0, DeleteRangeGesture deleteRangeGesture, C0110f c0110f, D4.c cVar) {
        int iG = G(deleteRangeGesture.getGranularity());
        long jM = p027e3.a.M(c0036s0, p035g0.H.x(deleteRangeGesture.getDeletionStartArea()), p035g0.H.x(deleteRangeGesture.getDeletionEndArea()), iG);
        if (I.b(jM)) {
            return f704a.b(s.i(deleteRangeGesture), cVar);
        }
        h(jM, c0110f, iG == 1, cVar);
        return 1;
    }

    private final int f(H h6, DeleteRangeGesture deleteRangeGesture, G g6) {
        G(deleteRangeGesture.getGranularity());
        p035g0.H.x(deleteRangeGesture.getDeletionStartArea());
        p035g0.H.x(deleteRangeGesture.getDeletionEndArea());
        throw null;
    }

    private final void g(H h6, long j4, boolean z5) {
        if (!z5) {
            throw null;
        }
        throw null;
    }

    private final void h(long j4, C0110f c0110f, boolean z5, D4.c cVar) {
        if (z5) {
            int i = I.f1469c;
            int iCharCount = (int) (j4 >> 32);
            int iCharCount2 = (int) (j4 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c0110f, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c0110f.f1494h.length() ? Character.codePointAt(c0110f, iCharCount2) : 10;
            if (p027e3.a.o0(iCodePointBefore) && (p027e3.a.n0(iCodePointAt) || p027e3.a.j0(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c0110f, iCharCount);
                    }
                } while (p027e3.a.o0(iCodePointBefore));
                j4 = AbstractC0599v0.d(iCharCount, iCharCount2);
            } else if (p027e3.a.o0(iCodePointAt) && (p027e3.a.n0(iCodePointBefore) || p027e3.a.j0(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c0110f.f1494h.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c0110f, iCharCount2);
                    }
                } while (p027e3.a.o0(iCodePointAt));
                j4 = AbstractC0599v0.d(iCharCount, iCharCount2);
            }
        }
        int i3 = (int) (4294967295L & j4);
        cVar.invoke(new w(new M0.i[]{new M0.v(i3, i3), new M0.g(I.c(j4), 0)}));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    private final int k(C0036s0 c0036s0, InsertGesture insertGesture, G0 g6, D4.c cVar) {
        int iE;
        a1 a1VarD;
        long J;
        int iF0;
        if (g6 == null) {
            return b(s.i(insertGesture), cVar);
        }
        PointF insertionPoint = insertGesture.getInsertionPoint();
        long jY = p081p0.c.y(insertionPoint.x, insertionPoint.y);
        a1 a1VarD2 = c0036s0.d();
        if (a1VarD2 != null) {
            G0.n nVar = a1VarD2.f281a.f1459b;
            InterfaceC1033p interfaceC1033pC = c0036s0.c();
            if (interfaceC1033pC == null || (iF0 = p027e3.a.f0(nVar, (J = interfaceC1033pC.J(jY)), g6)) == -1) {
                iE = -1;
            } else {
                iE = nVar.e(p030f0.c.a(J, (nVar.b(iF0) + nVar.d(iF0)) / 2.0f, 1));
            }
        } else {
            iE = -1;
        }
        if (iE == -1 || ((a1VarD = c0036s0.d()) != null && p027e3.a.N(a1VarD.f281a, iE))) {
            return b(s.i(insertGesture), cVar);
        }
        m(iE, insertGesture.getTextToInsert(), cVar);
        return 1;
    }

    private final int l(H h6, InsertGesture insertGesture, G g6, G0 g7) {
        PointF insertionPoint = insertGesture.getInsertionPoint();
        p081p0.c.y(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final void m(int i, String str, D4.c cVar) {
        cVar.invoke(new w(new M0.i[]{new M0.v(i, i), new C0198a(str, 1)}));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    private final int n(C0036s0 c0036s0, JoinOrSplitGesture joinOrSplitGesture, C0110f c0110f, G0 g6, D4.c cVar) {
        int iCharCount;
        a1 a1VarD;
        long J;
        int iF0;
        if (g6 == null) {
            return b(s.i(joinOrSplitGesture), cVar);
        }
        PointF joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long jY = p081p0.c.y(joinOrSplitPoint.x, joinOrSplitPoint.y);
        a1 a1VarD2 = c0036s0.d();
        if (a1VarD2 != null) {
            G0.n nVar = a1VarD2.f281a.f1459b;
            InterfaceC1033p interfaceC1033pC = c0036s0.c();
            if (interfaceC1033pC == null || (iF0 = p027e3.a.f0(nVar, (J = interfaceC1033pC.J(jY)), g6)) == -1) {
                iCharCount = -1;
            } else {
                iCharCount = nVar.e(p030f0.c.a(J, (nVar.b(iF0) + nVar.d(iF0)) / 2.0f, 1));
            }
        } else {
            iCharCount = -1;
        }
        if (iCharCount == -1 || ((a1VarD = c0036s0.d()) != null && p027e3.a.N(a1VarD.f281a, iCharCount))) {
            return b(s.i(joinOrSplitGesture), cVar);
        }
        int iCharCount2 = iCharCount;
        while (iCharCount2 > 0) {
            int iCodePointBefore = Character.codePointBefore(c0110f, iCharCount2);
            if (!p027e3.a.n0(iCodePointBefore)) {
                break;
            }
            iCharCount2 -= Character.charCount(iCodePointBefore);
        }
        while (iCharCount < c0110f.f1494h.length()) {
            int iCodePointAt = Character.codePointAt(c0110f, iCharCount);
            if (!p027e3.a.n0(iCodePointAt)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        long jD = AbstractC0599v0.d(iCharCount2, iCharCount);
        if (I.b(jD)) {
            m((int) (jD >> 32), " ", cVar);
            return 1;
        }
        h(jD, c0110f, false, cVar);
        return 1;
    }

    private final int o(H h6, JoinOrSplitGesture joinOrSplitGesture, G g6, G0 g7) {
        throw null;
    }

    private final int p(C0036s0 c0036s0, RemoveSpaceGesture removeSpaceGesture, C0110f c0110f, G0 g6, D4.c cVar) {
        long jF;
        char c6;
        String string;
        int i;
        int i3 = 1;
        int i6 = 0;
        a1 a1VarD = c0036s0.d();
        G0.G g7 = a1VarD != null ? a1VarD.f281a : null;
        PointF startPoint = removeSpaceGesture.getStartPoint();
        long jY = p081p0.c.y(startPoint.x, startPoint.y);
        PointF endPoint = removeSpaceGesture.getEndPoint();
        long jY2 = p081p0.c.y(endPoint.x, endPoint.y);
        InterfaceC1033p interfaceC1033pC = c0036s0.c();
        if (g7 == null || interfaceC1033pC == null) {
            jF = I.f1468b;
        } else {
            long J = interfaceC1033pC.J(jY);
            long J5 = interfaceC1033pC.J(jY2);
            G0.n nVar = g7.f1459b;
            int iF0 = p027e3.a.f0(nVar, J, g6);
            int iF1 = p027e3.a.f0(nVar, J5, g6);
            if (iF0 != -1) {
                if (iF1 != -1) {
                    iF0 = Math.min(iF0, iF1);
                }
                iF1 = iF0;
            } else if (iF1 == -1) {
                jF = I.f1468b;
            }
            float fB = (nVar.b(iF1) + nVar.d(iF1)) / 2;
            jF = nVar.f(new p030f0.d(Math.min(p030f0.c.d(J), p030f0.c.d(J5)), fB - 0.1f, Math.max(p030f0.c.d(J), p030f0.c.d(J5)), fB + 0.1f), 0, G0.E.f1447a);
        }
        if (I.b(jF)) {
            return f704a.b(s.i(removeSpaceGesture), cVar);
        }
        E4.u uVar = new E4.u();
        uVar.f1072h = -1;
        E4.u uVar2 = new E4.u();
        uVar2.f1072h = -1;
        C0110f c0110fSubSequence = c0110f.subSequence(I.e(jF), I.d(jF));
        Pattern patternCompile = Pattern.compile("\\s+");
        E4.k.e("compile(...)", patternCompile);
        C0005c0 c0005c0 = new C0005c0(uVar, 6, uVar2);
        String str = c0110fSubSequence.f1494h;
        E4.k.f("input", str);
        Matcher matcher = patternCompile.matcher(str);
        E4.k.e("matcher(...)", matcher);
        M4.i iVar = !matcher.find(0) ? null : new M4.i(matcher, str);
        if (iVar == null) {
            string = str.toString();
            c6 = 0;
        } else {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            c6 = 0;
            while (true) {
                sb.append((CharSequence) str, i6, iVar.a().f1941h);
                c0005c0.invoke(iVar);
                sb.append((CharSequence) "");
                i6 = iVar.a().i + i3;
                Matcher matcher2 = iVar.f3542a;
                int iEnd = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : 0);
                String str2 = iVar.f3543b;
                if (iEnd <= str2.length()) {
                    Matcher matcher3 = matcher2.pattern().matcher(str2);
                    E4.k.e("matcher(...)", matcher3);
                    iVar = !matcher3.find(iEnd) ? null : new M4.i(matcher3, str2);
                } else {
                    iVar = null;
                }
                if (i6 >= length || iVar == null) {
                    break;
                }
                i3 = 1;
            }
            if (i6 < length) {
                sb.append((CharSequence) str, i6, length);
            }
            string = sb.toString();
            E4.k.e("toString(...)", string);
        }
        int i7 = uVar.f1072h;
        if (i7 == -1 || (i = uVar2.f1072h) == -1) {
            return b(s.i(removeSpaceGesture), cVar);
        }
        int i8 = (int) (jF >> 32);
        String strSubstring = string.substring(i7, string.length() - (I.c(jF) - uVar2.f1072h));
        E4.k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        M0.v vVar = new M0.v(i8 + i7, i8 + i);
        C0198a c0198a = new C0198a(strSubstring, 1);
        M0.i[] iVarArr = new M0.i[2];
        iVarArr[c6] = vVar;
        iVarArr[1] = c0198a;
        cVar.invoke(new w(iVarArr));
        return 1;
    }

    private final int q(H h6, RemoveSpaceGesture removeSpaceGesture, G g6, G0 g7) {
        throw null;
    }

    private final int r(C0036s0 c0036s0, SelectGesture selectGesture, P p6, D4.c cVar) {
        long jH0 = p027e3.a.h0(c0036s0, p035g0.H.x(selectGesture.getSelectionArea()), G(selectGesture.getGranularity()));
        if (I.b(jH0)) {
            return f704a.b(s.i(selectGesture), cVar);
        }
        v(jH0, p6, cVar);
        return 1;
    }

    private final int s(H h6, SelectGesture selectGesture, G g6) {
        p035g0.H.x(selectGesture.getSelectionArea());
        G(selectGesture.getGranularity());
        throw null;
    }

    private final int t(C0036s0 c0036s0, SelectRangeGesture selectRangeGesture, P p6, D4.c cVar) {
        long jM = p027e3.a.M(c0036s0, p035g0.H.x(selectRangeGesture.getSelectionStartArea()), p035g0.H.x(selectRangeGesture.getSelectionEndArea()), G(selectRangeGesture.getGranularity()));
        if (I.b(jM)) {
            return f704a.b(s.i(selectRangeGesture), cVar);
        }
        v(jM, p6, cVar);
        return 1;
    }

    private final int u(H h6, SelectRangeGesture selectRangeGesture, G g6) {
        p035g0.H.x(selectRangeGesture.getSelectionStartArea());
        p035g0.H.x(selectRangeGesture.getSelectionEndArea());
        G(selectRangeGesture.getGranularity());
        throw null;
    }

    private final void v(long j4, P p6, D4.c cVar) {
        int i = I.f1469c;
        cVar.invoke(new M0.v((int) (j4 >> 32), (int) (j4 & 4294967295L)));
        if (p6 != null) {
            p6.f(true);
        }
    }

    private final void w(C0036s0 c0036s0, DeleteGesture deleteGesture, P p6) {
        if (p6 != null) {
            long jH0 = p027e3.a.h0(c0036s0, p035g0.H.x(deleteGesture.getDeletionArea()), G(deleteGesture.getGranularity()));
            C0036s0 c0036s1 = p6.f1123d;
            if (c0036s1 != null) {
                c0036s1.e(jH0);
            }
            C0036s0 c0036s2 = p6.f1123d;
            if (c0036s2 != null) {
                c0036s2.f(I.f1468b);
            }
            if (I.b(jH0)) {
                return;
            }
            p6.p(false);
            p6.n(EnumC0011f0.f312h);
        }
    }

    private final void x(H h6, DeleteGesture deleteGesture, G g6) {
        p035g0.H.x(deleteGesture.getDeletionArea());
        G(deleteGesture.getGranularity());
        throw null;
    }

    private final void y(C0036s0 c0036s0, DeleteRangeGesture deleteRangeGesture, P p6) {
        if (p6 != null) {
            long jM = p027e3.a.M(c0036s0, p035g0.H.x(deleteRangeGesture.getDeletionStartArea()), p035g0.H.x(deleteRangeGesture.getDeletionEndArea()), G(deleteRangeGesture.getGranularity()));
            C0036s0 c0036s1 = p6.f1123d;
            if (c0036s1 != null) {
                c0036s1.e(jM);
            }
            C0036s0 c0036s2 = p6.f1123d;
            if (c0036s2 != null) {
                c0036s2.f(I.f1468b);
            }
            if (I.b(jM)) {
                return;
            }
            p6.p(false);
            p6.n(EnumC0011f0.f312h);
        }
    }

    private final void z(H h6, DeleteRangeGesture deleteRangeGesture, G g6) {
        p035g0.H.x(deleteRangeGesture.getDeletionStartArea());
        p035g0.H.x(deleteRangeGesture.getDeletionEndArea());
        G(deleteRangeGesture.getGranularity());
        throw null;
    }

    public final boolean A(C0036s0 c0036s0, PreviewableHandwritingGesture previewableHandwritingGesture, P p6, CancellationSignal cancellationSignal) {
        G0.F f6;
        C0110f c0110f = c0036s0.f424j;
        if (c0110f == null) {
            return false;
        }
        a1 a1VarD = c0036s0.d();
        if (!c0110f.equals((a1VarD == null || (f6 = a1VarD.f281a.f1458a) == null) ? null : f6.f1449a)) {
            return false;
        }
        if (s.n(previewableHandwritingGesture)) {
            C(c0036s0, s.j(previewableHandwritingGesture), p6);
        } else if (m.r(previewableHandwritingGesture)) {
            w(c0036s0, m.g(previewableHandwritingGesture), p6);
        } else if (m.u(previewableHandwritingGesture)) {
            E(c0036s0, m.l(previewableHandwritingGesture), p6);
        } else {
            if (!m.w(previewableHandwritingGesture)) {
                return false;
            }
            y(c0036s0, m.h(previewableHandwritingGesture), p6);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new t(0, p6));
        return true;
    }

    public final boolean B(H h6, PreviewableHandwritingGesture previewableHandwritingGesture, G g6, CancellationSignal cancellationSignal) {
        if (s.n(previewableHandwritingGesture)) {
            D(h6, s.j(previewableHandwritingGesture), g6);
        } else if (m.r(previewableHandwritingGesture)) {
            x(h6, m.g(previewableHandwritingGesture), g6);
        } else if (m.u(previewableHandwritingGesture)) {
            F(h6, m.l(previewableHandwritingGesture), g6);
        } else {
            if (!m.w(previewableHandwritingGesture)) {
                return false;
            }
            z(h6, m.h(previewableHandwritingGesture), g6);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new u());
        return true;
    }

    public final int i(C0036s0 c0036s0, HandwritingGesture handwritingGesture, P p6, G0 g6, D4.c cVar) {
        G0.F f6;
        C0110f c0110f = c0036s0.f424j;
        if (c0110f == null) {
            return 3;
        }
        a1 a1VarD = c0036s0.d();
        if (!c0110f.equals((a1VarD == null || (f6 = a1VarD.f281a.f1458a) == null) ? null : f6.f1449a)) {
            return 3;
        }
        if (s.n(handwritingGesture)) {
            return r(c0036s0, s.j(handwritingGesture), p6, cVar);
        }
        if (m.r(handwritingGesture)) {
            return c(c0036s0, m.g(handwritingGesture), c0110f, cVar);
        }
        if (m.u(handwritingGesture)) {
            return t(c0036s0, m.l(handwritingGesture), p6, cVar);
        }
        if (m.w(handwritingGesture)) {
            return e(c0036s0, m.h(handwritingGesture), c0110f, cVar);
        }
        if (m.C(handwritingGesture)) {
            return n(c0036s0, m.j(handwritingGesture), c0110f, g6, cVar);
        }
        if (m.y(handwritingGesture)) {
            return k(c0036s0, m.i(handwritingGesture), g6, cVar);
        }
        if (m.A(handwritingGesture)) {
            return p(c0036s0, m.k(handwritingGesture), c0110f, g6, cVar);
        }
        return 2;
    }

    public final int j(H h6, HandwritingGesture handwritingGesture, G g6, G0 g7) {
        if (s.n(handwritingGesture)) {
            return s(h6, s.j(handwritingGesture), g6);
        }
        if (m.r(handwritingGesture)) {
            return d(h6, m.g(handwritingGesture), g6);
        }
        if (m.u(handwritingGesture)) {
            return u(h6, m.l(handwritingGesture), g6);
        }
        if (m.w(handwritingGesture)) {
            return f(h6, m.h(handwritingGesture), g6);
        }
        if (m.C(handwritingGesture)) {
            return o(h6, m.j(handwritingGesture), g6, g7);
        }
        if (m.y(handwritingGesture)) {
            return l(h6, m.i(handwritingGesture), g6, g7);
        }
        if (m.A(handwritingGesture)) {
            return q(h6, m.k(handwritingGesture), g6, g7);
        }
        return 2;
    }
}
