package G0;

import B.C0003b0;
import F.C0074p;
import S1.h0;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import p035g0.AbstractC0702c;
import p035g0.AbstractC0712m;
import p035g0.InterfaceC0714o;

/* JADX INFO: renamed from: G0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0105a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0.d f1477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H0.y f1480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f1481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1482f;

    /* JADX WARN: Code duplicated, block: B:104:0x0154  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    public C0105a(O0.d dVar, int i, boolean z5, long j4) {
        int i3;
        Q0.b[] bVarArr;
        Object obj;
        p030f0.d dVar2;
        float fH;
        this.f1477a = dVar;
        this.f1478b = i;
        this.f1479c = j4;
        if (S0.a.i(j4) != 0 || S0.a.j(j4) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        J j6 = dVar.i;
        CharSequence charSequence = dVar.f4398o;
        CharSequence charSequence2 = charSequence;
        if (z5) {
            charSequence2 = charSequence;
            if (!S0.m.a(j6.f1472a.f1435h, d0.q(0))) {
                charSequence2 = charSequence;
                if (!S0.m.a(j6.f1472a.f1435h, S0.m.f4901c)) {
                    int i6 = j6.f1473b.f1537a;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    if (i6 != Integer.MIN_VALUE && i6 != 5 && i6 != 4) {
                        int length = charSequence.length();
                        charSequence2 = charSequence;
                        if (length != 0) {
                            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                            spannableString.setSpan(new J0.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                            charSequence2 = spannableString;
                        }
                    }
                }
            }
        }
        this.f1481e = charSequence2;
        t tVar = j6.f1473b;
        int i7 = tVar.f1537a;
        int i8 = 3;
        int i9 = i7 == 1 ? 3 : i7 == 2 ? 4 : i7 == 3 ? 2 : (i7 != 5 && i7 == 6) ? 1 : 0;
        int i10 = i7 == 4 ? 1 : 0;
        int i11 = tVar.f1544h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : 0;
        int i12 = tVar.f1543g;
        int i13 = i12 & 255;
        if (i13 == 1) {
            i3 = 0;
        } else if (i13 == 2) {
            i3 = 1;
        } else if (i13 == 3) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        int i14 = (i12 >> 8) & 255;
        if (i14 == 1) {
            i8 = 0;
        } else if (i14 == 2) {
            i8 = 1;
        } else if (i14 == 3) {
            i8 = 2;
        } else if (i14 != 4) {
            i8 = 0;
        }
        int i15 = (i12 >> 16) & 255;
        int i16 = (i15 != 1 && i15 == 2) ? 1 : 0;
        TextUtils.TruncateAt truncateAt = z5 ? TextUtils.TruncateAt.END : null;
        int i17 = i8;
        int i18 = i3;
        H0.y yVarA = a(i9, i10, truncateAt, i, i11, i18, i17, i16);
        if (!z5 || yVarA.a() <= S0.a.g(j4) || i <= 1) {
            this.f1480d = yVarA;
        } else {
            int iG = S0.a.g(j4);
            int i19 = 0;
            while (true) {
                int i20 = yVarA.f1735f;
                if (i19 >= i20) {
                    i19 = i20;
                    break;
                } else if (yVarA.e(i19) > iG) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 >= 0 && i19 != this.f1478b) {
                yVarA = a(i9, i10, truncateAt, i19 < 1 ? 1 : i19, i11, i18, i17, i16);
            }
            this.f1480d = yVarA;
        }
        O0.d dVar3 = this.f1477a;
        C c6 = j6.f1472a;
        dVar3.f4397n.c(c6.f1428a.b(), h0.f(d(), b()), c6.f1428a.c());
        H0.y yVar = this.f1480d;
        if (yVar.f1734e.getText() instanceof Spanned) {
            Layout layout = yVar.f1734e;
            CharSequence text = layout.getText();
            E4.k.d("null cannot be cast to non-null type android.text.Spanned", text);
            Spanned spanned = (Spanned) text;
            if (spanned.nextSpanTransition(-1, spanned.length(), Q0.b.class) != spanned.length()) {
                CharSequence text2 = layout.getText();
                E4.k.d("null cannot be cast to non-null type android.text.Spanned", text2);
                bVarArr = (Q0.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), Q0.b.class);
            } else {
                bVarArr = null;
            }
        } else {
            bVarArr = null;
        }
        if (bVarArr != null) {
            E4.b bVarJ = E4.k.j(bVarArr);
            while (bVarJ.hasNext()) {
                ((Q0.b) bVarJ.next()).f4689c.setValue(new p030f0.f(h0.f(d(), b())));
            }
        }
        CharSequence charSequence3 = this.f1481e;
        if (charSequence3 instanceof Spanned) {
            Spanned spanned2 = (Spanned) charSequence3;
            Object[] spans = spanned2.getSpans(0, charSequence3.length(), J0.i.class);
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj2 : spans) {
                J0.i iVar = (J0.i) obj2;
                int spanStart = spanned2.getSpanStart(iVar);
                int spanEnd = spanned2.getSpanEnd(iVar);
                int lineForOffset = this.f1480d.f1734e.getLineForOffset(spanStart);
                boolean z6 = lineForOffset >= this.f1478b;
                boolean z7 = this.f1480d.f1734e.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.f1480d.f1734e.getEllipsisStart(lineForOffset);
                boolean z8 = spanEnd > this.f1480d.f(lineForOffset);
                if (z7 || z8 || z6) {
                    dVar2 = null;
                } else {
                    int iOrdinal = (this.f1480d.f1734e.isRtlCharAt(spanStart) ? R0.h.i : R0.h.f4743h).ordinal();
                    if (iOrdinal == 0) {
                        fH = this.f1480d.h(spanStart, false);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        float fH2 = this.f1480d.h(spanStart, false);
                        if (!iVar.f1888d) {
                            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                        }
                        fH = fH2 - iVar.f1886b;
                    }
                    if (!iVar.f1888d) {
                        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                    }
                    float f6 = iVar.f1886b + fH;
                    float fD = this.f1480d.d(lineForOffset) - iVar.b();
                    dVar2 = new p030f0.d(fH, fD, f6, iVar.b() + fD);
                }
                arrayList.add(dVar2);
            }
            obj = arrayList;
        } else {
            obj = p089q4.u.f11237h;
        }
        this.f1482f = obj;
    }

    public final H0.y a(int i, int i3, TextUtils.TruncateAt truncateAt, int i6, int i7, int i8, int i9, int i10) {
        v vVar;
        float fD = d();
        O0.d dVar = this.f1477a;
        O0.a aVar = O0.b.f4390a;
        x xVar = dVar.i.f1474c;
        return new H0.y(this.f1481e, fD, dVar.f4397n, i, truncateAt, dVar.f4402s, (xVar == null || (vVar = xVar.f1551b) == null) ? false : vVar.f1548a, i6, i8, i9, i10, i7, i3, dVar.f4399p);
    }

    public final float b() {
        return this.f1480d.a();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    public final long c(p030f0.d dVar, int i, C0074p c0074p) {
        int i3;
        int[] iArrA;
        RectF rectFU = p035g0.H.u(dVar);
        int i6 = (i != 0 && i == 1) ? 1 : 0;
        C0003b0 c0003b0 = new C0003b0(3, c0074p);
        int i7 = Build.VERSION.SDK_INT;
        H0.y yVar = this.f1480d;
        if (i7 >= 34) {
            yVar.getClass();
            iArrA = H0.b.f1693a.a(yVar, rectFU, i6, c0003b0);
        } else {
            p pVarC = yVar.c();
            Layout layout = yVar.f1734e;
            D.x xVar = i6 == 1 ? new D.x(layout.getText(), 5, yVar.j()) : new D.x(layout.getText(), 4, yVar.f1730a);
            int lineForVertical = layout.getLineForVertical((int) rectFU.top);
            if (rectFU.top <= yVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < yVar.f1735f) {
                int i8 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFU.bottom);
                if (lineForVertical2 != 0 || rectFU.bottom >= yVar.g(0)) {
                    int iD = H0.t.d(yVar, layout, pVarC, i8, rectFU, xVar, c0003b0, true);
                    while (true) {
                        i3 = i8;
                        if (iD != -1 || i3 >= lineForVertical2) {
                            break;
                        }
                        i8 = i3 + 1;
                        iD = H0.t.d(yVar, layout, pVarC, i8, rectFU, xVar, c0003b0, true);
                    }
                    if (iD == -1) {
                        iArrA = null;
                    } else {
                        int i9 = lineForVertical2;
                        int iD2 = H0.t.d(yVar, layout, pVarC, i9, rectFU, xVar, c0003b0, false);
                        while (iD2 == -1 && i3 < i9) {
                            i9--;
                            iD2 = H0.t.d(yVar, layout, pVarC, i9, rectFU, xVar, c0003b0, false);
                        }
                        if (iD2 == -1) {
                            iArrA = null;
                        } else {
                            iArrA = new int[]{xVar.a(iD + 1), xVar.b(iD2 - 1)};
                        }
                    }
                } else {
                    iArrA = null;
                }
            } else {
                iArrA = null;
            }
        }
        return iArrA == null ? I.f1468b : AbstractC0599v0.d(iArrA[0], iArrA[1]);
    }

    public final float d() {
        return S0.a.h(this.f1479c);
    }

    public final void e(InterfaceC0714o interfaceC0714o) {
        Canvas canvasA = AbstractC0702c.a(interfaceC0714o);
        H0.y yVar = this.f1480d;
        if (yVar.f1732c) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        if (canvasA.getClipBounds(yVar.f1743o)) {
            int i = yVar.f1736g;
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            H0.x xVar = H0.z.f1745a;
            xVar.f1729a = canvasA;
            yVar.f1734e.draw(xVar);
            if (i != 0) {
                canvasA.translate(0.0f, (-1) * i);
            }
        }
        if (yVar.f1732c) {
            canvasA.restore();
        }
    }

    public final void f(InterfaceC0714o interfaceC0714o, long j4, p035g0.L l6, R0.j jVar, p044i0.e eVar) {
        O0.f fVar = this.f1477a.f4397n;
        int i = fVar.f4407c;
        fVar.d(j4);
        fVar.f(l6);
        fVar.g(jVar);
        fVar.e(eVar);
        fVar.b(3);
        e(interfaceC0714o);
        fVar.b(i);
    }

    public final void g(InterfaceC0714o interfaceC0714o, AbstractC0712m abstractC0712m, float f6, p035g0.L l6, R0.j jVar, p044i0.e eVar) {
        O0.f fVar = this.f1477a.f4397n;
        int i = fVar.f4407c;
        fVar.c(abstractC0712m, h0.f(d(), b()), f6);
        fVar.f(l6);
        fVar.g(jVar);
        fVar.e(eVar);
        fVar.b(3);
        e(interfaceC0714o);
        fVar.b(i);
    }
}
