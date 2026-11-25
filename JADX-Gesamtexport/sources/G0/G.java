package G0;

import android.graphics.RectF;
import android.text.Layout;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.text.BreakIterator;
import java.util.ArrayList;
import p015c2.AbstractC0473d;
import p035g0.C0706g;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f1458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f1459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1463f;

    public G(F f6, n nVar, long j4) {
        this.f1458a = f6;
        this.f1459b = nVar;
        this.f1460c = j4;
        ArrayList arrayList = nVar.f1520h;
        float fD = 0.0f;
        this.f1461d = arrayList.isEmpty() ? 0.0f : ((q) arrayList.get(0)).f1527a.f1480d.d(0);
        if (!arrayList.isEmpty()) {
            q qVar = (q) p089q4.l.f0(arrayList);
            H0.y yVar = qVar.f1527a.f1480d;
            fD = yVar.d(yVar.f1735f - 1) + qVar.f1532f;
        }
        this.f1462e = fD;
        this.f1463f = nVar.f1519g;
    }

    public final R0.h a(int i) {
        n nVar = this.f1459b;
        nVar.j(i);
        int length = ((C0110f) nVar.f1513a.f1523j).f1494h.length();
        ArrayList arrayList = nVar.f1520h;
        q qVar = (q) arrayList.get(i == length ? p089q4.m.L(arrayList) : AbstractC0473d.s(i, arrayList));
        return qVar.f1527a.f1480d.f1734e.isRtlCharAt(qVar.b(i)) ? R0.h.i : R0.h.f4743h;
    }

    public final p030f0.d b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        n nVar = this.f1459b;
        nVar.i(i);
        ArrayList arrayList = nVar.f1520h;
        q qVar = (q) arrayList.get(AbstractC0473d.s(i, arrayList));
        C0105a c0105a = qVar.f1527a;
        int iB = qVar.b(i);
        CharSequence charSequence = c0105a.f1481e;
        if (iB < 0 || iB >= charSequence.length()) {
            StringBuilder sbV = p012c.k.v(iB, "offset(", ") is out of bounds [0,");
            sbV.append(charSequence.length());
            sbV.append(')');
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        H0.y yVar = c0105a.f1480d;
        Layout layout = yVar.f1734e;
        int lineForOffset = layout.getLineForOffset(iB);
        float fG = yVar.g(lineForOffset);
        float fE = yVar.e(lineForOffset);
        boolean z5 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iB);
        if (!z5 || zIsRtlCharAt) {
            if (z5 && zIsRtlCharAt) {
                fH = yVar.i(iB, false);
                fH2 = yVar.i(iB + 1, true);
            } else if (zIsRtlCharAt) {
                fH = yVar.h(iB, false);
                fH2 = yVar.h(iB + 1, true);
            } else {
                fI = yVar.i(iB, false);
                fI2 = yVar.i(iB + 1, true);
            }
            float f6 = fH;
            fI = fH2;
            fI2 = f6;
        } else {
            fI = yVar.h(iB, false);
            fI2 = yVar.h(iB + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        float f7 = rectF.left;
        float f8 = rectF.top;
        float f9 = rectF.right;
        float f10 = rectF.bottom;
        long jY = p081p0.c.y(0.0f, qVar.f1532f);
        return new p030f0.d(p030f0.c.d(jY) + f7, p030f0.c.e(jY) + f8, p030f0.c.d(jY) + f9, p030f0.c.e(jY) + f10);
    }

    public final p030f0.d c(int i) {
        n nVar = this.f1459b;
        nVar.j(i);
        int length = ((C0110f) nVar.f1513a.f1523j).f1494h.length();
        ArrayList arrayList = nVar.f1520h;
        q qVar = (q) arrayList.get(i == length ? p089q4.m.L(arrayList) : AbstractC0473d.s(i, arrayList));
        C0105a c0105a = qVar.f1527a;
        int iB = qVar.b(i);
        CharSequence charSequence = c0105a.f1481e;
        if (iB < 0 || iB > charSequence.length()) {
            StringBuilder sbV = p012c.k.v(iB, "offset(", ") is out of bounds [0,");
            sbV.append(charSequence.length());
            sbV.append(']');
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        H0.y yVar = c0105a.f1480d;
        float fH = yVar.h(iB, false);
        int lineForOffset = yVar.f1734e.getLineForOffset(iB);
        float fG = yVar.g(lineForOffset);
        float fE = yVar.e(lineForOffset);
        long jY = p081p0.c.y(0.0f, qVar.f1532f);
        return new p030f0.d(p030f0.c.d(jY) + fH, p030f0.c.e(jY) + fG, p030f0.c.d(jY) + fH, p030f0.c.e(jY) + fE);
    }

    public final int d(int i, boolean z5) {
        int iF;
        n nVar = this.f1459b;
        nVar.k(i);
        ArrayList arrayList = nVar.f1520h;
        q qVar = (q) arrayList.get(AbstractC0473d.t(i, arrayList));
        C0105a c0105a = qVar.f1527a;
        int i3 = i - qVar.f1530d;
        H0.y yVar = c0105a.f1480d;
        if (z5) {
            Layout layout = yVar.f1734e;
            if (layout.getEllipsisStart(i3) == 0) {
                p pVarC = yVar.c();
                Layout layout2 = (Layout) pVarC.f1523j;
                iF = pVarC.o(layout2.getLineEnd(i3), layout2.getLineStart(i3));
            } else {
                iF = layout.getEllipsisStart(i3) + layout.getLineStart(i3);
            }
        } else {
            iF = yVar.f(i3);
        }
        return iF + qVar.f1528b;
    }

    public final int e(int i) {
        int iS;
        n nVar = this.f1459b;
        int length = ((C0110f) nVar.f1513a.f1523j).f1494h.length();
        ArrayList arrayList = nVar.f1520h;
        if (i >= length) {
            iS = p089q4.m.L(arrayList);
        } else {
            iS = i < 0 ? 0 : AbstractC0473d.s(i, arrayList);
        }
        q qVar = (q) arrayList.get(iS);
        return qVar.f1527a.f1480d.f1734e.getLineForOffset(qVar.b(i)) + qVar.f1530d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g6 = (G) obj;
        return E4.k.a(this.f1458a, g6.f1458a) && this.f1459b.equals(g6.f1459b) && S0.j.a(this.f1460c, g6.f1460c) && this.f1461d == g6.f1461d && this.f1462e == g6.f1462e && E4.k.a(this.f1463f, g6.f1463f);
    }

    public final float f(int i) {
        n nVar = this.f1459b;
        nVar.k(i);
        ArrayList arrayList = nVar.f1520h;
        q qVar = (q) arrayList.get(AbstractC0473d.t(i, arrayList));
        C0105a c0105a = qVar.f1527a;
        int i3 = i - qVar.f1530d;
        H0.y yVar = c0105a.f1480d;
        return yVar.f1734e.getLineLeft(i3) + (i3 == yVar.f1735f + (-1) ? yVar.i : 0.0f);
    }

    public final float g(int i) {
        n nVar = this.f1459b;
        nVar.k(i);
        ArrayList arrayList = nVar.f1520h;
        q qVar = (q) arrayList.get(AbstractC0473d.t(i, arrayList));
        C0105a c0105a = qVar.f1527a;
        int i3 = i - qVar.f1530d;
        H0.y yVar = c0105a.f1480d;
        return yVar.f1734e.getLineRight(i3) + (i3 == yVar.f1735f + (-1) ? yVar.f1738j : 0.0f);
    }

    public final int h(int i) {
        n nVar = this.f1459b;
        nVar.k(i);
        ArrayList arrayList = nVar.f1520h;
        q qVar = (q) arrayList.get(AbstractC0473d.t(i, arrayList));
        C0105a c0105a = qVar.f1527a;
        return c0105a.f1480d.f1734e.getLineStart(i - qVar.f1530d) + qVar.f1528b;
    }

    public final int hashCode() {
        return this.f1463f.hashCode() + p012c.k.i(this.f1462e, p012c.k.i(this.f1461d, p012c.k.l((this.f1459b.hashCode() + (this.f1458a.hashCode() * 31)) * 31, 31, this.f1460c), 31), 31);
    }

    public final R0.h i(int i) {
        n nVar = this.f1459b;
        nVar.j(i);
        int length = ((C0110f) nVar.f1513a.f1523j).f1494h.length();
        ArrayList arrayList = nVar.f1520h;
        q qVar = (q) arrayList.get(i == length ? p089q4.m.L(arrayList) : AbstractC0473d.s(i, arrayList));
        C0105a c0105a = qVar.f1527a;
        int iB = qVar.b(i);
        H0.y yVar = c0105a.f1480d;
        return yVar.f1734e.getParagraphDirection(yVar.f1734e.getLineForOffset(iB)) == 1 ? R0.h.f4743h : R0.h.i;
    }

    public final C0706g j(int i, int i3) {
        n nVar = this.f1459b;
        C0110f c0110f = (C0110f) nVar.f1513a.f1523j;
        if (i >= 0 && i <= i3 && i3 <= c0110f.f1494h.length()) {
            if (i == i3) {
                return p035g0.H.h();
            }
            C0706g c0706gH = p035g0.H.h();
            AbstractC0473d.v(nVar.f1520h, AbstractC0599v0.d(i, i3), new C.c(c0706gH, i, i3, 4));
            return c0706gH;
        }
        throw new IllegalArgumentException(("Start(" + i + ") or End(" + i3 + ") is out of range [0.." + c0110f.f1494h.length() + "), or start > end!").toString());
    }

    public final long k(int i) {
        int iPreceding;
        int iFollowing;
        int iFollowing2;
        n nVar = this.f1459b;
        nVar.j(i);
        int length = ((C0110f) nVar.f1513a.f1523j).f1494h.length();
        ArrayList arrayList = nVar.f1520h;
        q qVar = (q) arrayList.get(i == length ? p089q4.m.L(arrayList) : AbstractC0473d.s(i, arrayList));
        C0105a c0105a = qVar.f1527a;
        int iB = qVar.b(i);
        I0.d dVarJ = c0105a.f1480d.j();
        dVarJ.b(iB);
        BreakIterator breakIterator = (BreakIterator) dVarJ.f1809e;
        if (dVarJ.g(breakIterator.preceding(iB))) {
            dVarJ.b(iB);
            iPreceding = iB;
            while (iPreceding != -1 && (!dVarJ.g(iPreceding) || dVarJ.e(iPreceding))) {
                dVarJ.b(iPreceding);
                iPreceding = breakIterator.preceding(iPreceding);
            }
        } else {
            dVarJ.b(iB);
            if (dVarJ.f(iB)) {
                iPreceding = (!breakIterator.isBoundary(iB) || dVarJ.d(iB)) ? breakIterator.preceding(iB) : iB;
            } else {
                iPreceding = dVarJ.d(iB) ? breakIterator.preceding(iB) : -1;
            }
        }
        if (iPreceding == -1) {
            iPreceding = iB;
        }
        dVarJ.b(iB);
        if (dVarJ.e(breakIterator.following(iB))) {
            dVarJ.b(iB);
            iFollowing = iB;
            while (iFollowing != -1 && (dVarJ.g(iFollowing) || !dVarJ.e(iFollowing))) {
                dVarJ.b(iFollowing);
                iFollowing = breakIterator.following(iFollowing);
            }
        } else {
            dVarJ.b(iB);
            if (dVarJ.d(iB)) {
                if (!breakIterator.isBoundary(iB) || dVarJ.f(iB)) {
                    iFollowing2 = breakIterator.following(iB);
                    iFollowing = iFollowing2;
                } else {
                    iFollowing = iB;
                }
            } else if (dVarJ.f(iB)) {
                iFollowing2 = breakIterator.following(iB);
                iFollowing = iFollowing2;
            } else {
                iFollowing = -1;
            }
        }
        if (iFollowing != -1) {
            iB = iFollowing;
        }
        return qVar.a(AbstractC0599v0.d(iPreceding, iB), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f1458a + ", multiParagraph=" + this.f1459b + ", size=" + ((Object) S0.j.b(this.f1460c)) + ", firstBaseline=" + this.f1461d + ", lastBaseline=" + this.f1462e + ", placeholderRects=" + this.f1463f + ')';
    }
}
