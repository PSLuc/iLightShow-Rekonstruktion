package H0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f1730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I0.d f1733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Layout f1734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1737h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f1738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f1740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final J0.h[] f1742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f1743o = new Rect();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public G0.p f1744p;

    /* JADX WARN: Code duplicated, block: B:100:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:102:0x0204  */
    /* JADX WARN: Code duplicated, block: B:105:0x0210  */
    /* JADX WARN: Code duplicated, block: B:108:0x021d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0222  */
    /* JADX WARN: Code duplicated, block: B:111:0x0229  */
    /* JADX WARN: Code duplicated, block: B:114:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0268  */
    /* JADX WARN: Code duplicated, block: B:122:0x0270  */
    /* JADX WARN: Code duplicated, block: B:125:0x0276  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:140:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v19 */
    public y(CharSequence charSequence, float f6, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i3, boolean z5, int i6, int i7, int i8, int i9, int i10, int i11, n nVar) {
        Layout.Alignment alignment;
        int i12;
        p pVar;
        Layout layoutA;
        y yVar;
        int i13;
        int i14;
        long j4;
        Paint.FontMetricsInt fontMetricsInt;
        Spanned spanned;
        long j6;
        int i15;
        J0.h[] hVarArr;
        long j7;
        TextPaint textPaint2;
        J0.h[] hVarArr2;
        int i16;
        Layout layout;
        int iE;
        SpannableString spannableString;
        J0.h hVar;
        ?? r6;
        int length;
        int iMax;
        int iMax2;
        int i17;
        int i18;
        boolean zA;
        this.f1730a = textPaint;
        this.f1731b = z5;
        int length2 = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicA = z.a(i3);
        Layout.Alignment alignment2 = w.f1727a;
        if (i == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3) {
            alignment = i != 4 ? Layout.Alignment.ALIGN_NORMAL : w.f1728b;
        } else {
            alignment = w.f1727a;
        }
        Layout.Alignment alignment3 = alignment;
        boolean z6 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length2, J0.a.class) < length2;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = nVar.a();
            double d6 = f6;
            int iCeil = (int) Math.ceil(d6);
            p pVar2 = t.f1712a;
            boolean z7 = z6;
            boolean z8 = true;
            if (metricsA == null || nVar.b() > f6 || z7) {
                z8 = true;
                this.f1739k = false;
                i12 = i6;
                pVar = pVar2;
                v vVar = new v(charSequence, charSequence.length(), textPaint, iCeil, textDirectionHeuristicA, alignment3, i12, truncateAt, (int) Math.ceil(d6), i11, z5, i7, i8, i9, i10);
                textDirectionHeuristicA = textDirectionHeuristicA;
                layoutA = pVar.a(vVar);
                yVar = this;
            } else {
                this.f1739k = true;
                if (iCeil < 0) {
                    throw new IllegalArgumentException("negative width");
                }
                if (iCeil < 0) {
                    throw new IllegalArgumentException("negative ellipsized width");
                }
                layoutA = Build.VERSION.SDK_INT >= 33 ? c.a(charSequence, textPaint, iCeil, alignment3, 1.0f, 0.0f, metricsA, z5, true, truncateAt, iCeil) : d.a(charSequence, textPaint, iCeil, alignment3, 1.0f, 0.0f, metricsA, z5, truncateAt, iCeil);
                i12 = i6;
                yVar = this;
                pVar = pVar2;
            }
            yVar.f1734e = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i12);
            yVar.f1735f = iMin;
            int i19 = iMin - 1;
            yVar.f1732c = iMin >= i12 && (layoutA.getEllipsisCount(i19) > 0 || layoutA.getLineEnd(i19) != charSequence.length());
            if (!z5) {
                if (yVar.f1739k) {
                    i13 = 33;
                    zA = Build.VERSION.SDK_INT >= 33 ? c.c((BoringLayout) layoutA) : false;
                } else {
                    i13 = 33;
                    zA = Build.VERSION.SDK_INT >= 33 ? s.a((StaticLayout) layoutA) : z8;
                }
                if (!zA) {
                    TextPaint paint = layoutA.getPaint();
                    CharSequence text = layoutA.getText();
                    i14 = 0;
                    Rect rectA = t.a(paint, text, layoutA.getLineStart(0), layoutA.getLineEnd(0));
                    int lineAscent = layoutA.getLineAscent(0);
                    int i20 = rectA.top;
                    int topPadding = i20 < lineAscent ? lineAscent - i20 : layoutA.getTopPadding();
                    rectA = iMin != 1 ? t.a(paint, text, layoutA.getLineStart(i19), layoutA.getLineEnd(i19)) : rectA;
                    int lineDescent = layoutA.getLineDescent(i19);
                    int i21 = rectA.bottom;
                    int bottomPadding = i21 > lineDescent ? i21 - lineDescent : layoutA.getBottomPadding();
                    j4 = (topPadding == 0 && bottomPadding == 0) ? j4 : (((long) bottomPadding) & 4294967295L) | (((long) topPadding) << 32);
                    fontMetricsInt = null;
                    if (layoutA.getText() instanceof Spanned) {
                        CharSequence text2 = layoutA.getText();
                        E4.k.d("null cannot be cast to non-null type android.text.Spanned", text2);
                        spanned = (Spanned) text2;
                        j6 = 4294967295L;
                        if (spanned.nextSpanTransition(-1, spanned.length(), J0.h.class) != spanned.length()) {
                            i15 = 1;
                        } else {
                            i15 = i14;
                        }
                        if (i15 == 0 || layoutA.getText().length() <= 0) {
                            CharSequence text3 = layoutA.getText();
                            E4.k.d("null cannot be cast to non-null type android.text.Spanned", text3);
                            hVarArr = (J0.h[]) ((Spanned) text3).getSpans(i14, layoutA.getText().length(), J0.h.class);
                        }
                        yVar.f1742n = hVarArr;
                        if (hVarArr != null) {
                            length = hVarArr.length;
                            iMax = i14;
                            iMax2 = iMax;
                            for (i17 = iMax2; i17 < length; i17++) {
                                J0.h hVar2 = hVarArr[i17];
                                int i22 = hVar2.f1883j;
                                iMax = i22 < 0 ? Math.max(iMax, Math.abs(i22)) : iMax;
                                i18 = hVar2.f1884k;
                                if (i18 < 0) {
                                    iMax2 = Math.max(iMax, Math.abs(i18));
                                }
                            }
                            if (iMax == 0 || iMax2 != 0) {
                                j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                            } else {
                                j7 = z.f1746b;
                            }
                        } else {
                            j7 = z.f1746b;
                        }
                        yVar.f1736g = Math.max((int) (j4 >> 32), (int) (j7 >> 32));
                        yVar.f1737h = Math.max((int) (j4 & j6), (int) (j7 & j6));
                        textPaint2 = yVar.f1730a;
                        hVarArr2 = yVar.f1742n;
                        i16 = yVar.f1735f - 1;
                        layout = yVar.f1734e;
                        if (layout.getLineStart(i16) == layout.getLineEnd(i16) && hVarArr2 != null && hVarArr2.length != 0) {
                            spannableString = new SpannableString("\u200b");
                            if (hVarArr2.length != 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            hVar = hVarArr2[i14];
                            int length3 = spannableString.length();
                            if (i16 == 0 && hVar.f1878d) {
                                r6 = i14;
                            } else {
                                r6 = hVar.f1878d;
                            }
                            spannableString.setSpan(new J0.h(hVar.f1875a, length3, r6, hVar.f1878d, hVar.f1879e), i14, spannableString.length(), i13);
                            StaticLayout staticLayoutA = pVar.a(new v(spannableString, spannableString.length(), textPaint2, Integer.MAX_VALUE, textDirectionHeuristicA, l.f1701a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, yVar.f1731b, 0, 0, 0, 0));
                            fontMetricsInt = new Paint.FontMetricsInt();
                            fontMetricsInt.ascent = staticLayoutA.getLineAscent(i14);
                            fontMetricsInt.descent = staticLayoutA.getLineDescent(i14);
                            fontMetricsInt.top = staticLayoutA.getLineTop(i14);
                            fontMetricsInt.bottom = staticLayoutA.getLineBottom(i14);
                        }
                        if (fontMetricsInt != null) {
                            iE = fontMetricsInt.bottom - ((int) (yVar.e(i19) - yVar.g(i19)));
                        } else {
                            iE = i14;
                        }
                        yVar.f1741m = iE;
                        yVar.f1740l = fontMetricsInt;
                        Layout layout2 = yVar.f1734e;
                        yVar.i = AbstractC0599v0.y(layout2, i19, layout2.getPaint());
                        Layout layout3 = yVar.f1734e;
                        yVar.f1738j = AbstractC0599v0.z(layout3, i19, layout3.getPaint());
                    }
                    j6 = 4294967295L;
                    hVarArr = null;
                    yVar.f1742n = hVarArr;
                    if (hVarArr != null) {
                        length = hVarArr.length;
                        iMax = i14;
                        iMax2 = iMax;
                        while (i17 < length) {
                            J0.h hVar3 = hVarArr[i17];
                            int i23 = hVar3.f1883j;
                            if (i23 < 0) {
                            }
                            i18 = hVar3.f1884k;
                            if (i18 < 0) {
                                iMax2 = Math.max(iMax, Math.abs(i18));
                            }
                        }
                        if (iMax == 0) {
                            j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                        } else {
                            j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                        }
                    } else {
                        j7 = z.f1746b;
                    }
                    yVar.f1736g = Math.max((int) (j4 >> 32), (int) (j7 >> 32));
                    yVar.f1737h = Math.max((int) (j4 & j6), (int) (j7 & j6));
                    textPaint2 = yVar.f1730a;
                    hVarArr2 = yVar.f1742n;
                    i16 = yVar.f1735f - 1;
                    layout = yVar.f1734e;
                    if (layout.getLineStart(i16) == layout.getLineEnd(i16)) {
                        spannableString = new SpannableString("\u200b");
                        if (hVarArr2.length != 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        hVar = hVarArr2[i14];
                        int length4 = spannableString.length();
                        if (i16 == 0) {
                            r6 = hVar.f1878d;
                        } else {
                            r6 = hVar.f1878d;
                        }
                        spannableString.setSpan(new J0.h(hVar.f1875a, length4, r6, hVar.f1878d, hVar.f1879e), i14, spannableString.length(), i13);
                        StaticLayout staticLayoutA2 = pVar.a(new v(spannableString, spannableString.length(), textPaint2, Integer.MAX_VALUE, textDirectionHeuristicA, l.f1701a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, yVar.f1731b, 0, 0, 0, 0));
                        fontMetricsInt = new Paint.FontMetricsInt();
                        fontMetricsInt.ascent = staticLayoutA2.getLineAscent(i14);
                        fontMetricsInt.descent = staticLayoutA2.getLineDescent(i14);
                        fontMetricsInt.top = staticLayoutA2.getLineTop(i14);
                        fontMetricsInt.bottom = staticLayoutA2.getLineBottom(i14);
                    }
                    if (fontMetricsInt != null) {
                        iE = fontMetricsInt.bottom - ((int) (yVar.e(i19) - yVar.g(i19)));
                    } else {
                        iE = i14;
                    }
                    yVar.f1741m = iE;
                    yVar.f1740l = fontMetricsInt;
                    Layout layout4 = yVar.f1734e;
                    yVar.i = AbstractC0599v0.y(layout4, i19, layout4.getPaint());
                    Layout layout5 = yVar.f1734e;
                    yVar.f1738j = AbstractC0599v0.z(layout5, i19, layout5.getPaint());
                }
                j4 = z.f1746b;
                fontMetricsInt = null;
                if (layoutA.getText() instanceof Spanned) {
                    CharSequence text4 = layoutA.getText();
                    E4.k.d("null cannot be cast to non-null type android.text.Spanned", text4);
                    spanned = (Spanned) text4;
                    j6 = 4294967295L;
                    if (spanned.nextSpanTransition(-1, spanned.length(), J0.h.class) != spanned.length()) {
                        i15 = 1;
                    } else {
                        i15 = i14;
                    }
                    if (i15 == 0) {
                    }
                    CharSequence text5 = layoutA.getText();
                    E4.k.d("null cannot be cast to non-null type android.text.Spanned", text5);
                    hVarArr = (J0.h[]) ((Spanned) text5).getSpans(i14, layoutA.getText().length(), J0.h.class);
                    yVar.f1742n = hVarArr;
                    if (hVarArr != null) {
                        length = hVarArr.length;
                        iMax = i14;
                        iMax2 = iMax;
                        while (i17 < length) {
                            J0.h hVar4 = hVarArr[i17];
                            int i24 = hVar4.f1883j;
                            if (i24 < 0) {
                            }
                            i18 = hVar4.f1884k;
                            if (i18 < 0) {
                                iMax2 = Math.max(iMax, Math.abs(i18));
                            }
                        }
                        if (iMax == 0) {
                            j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                        } else {
                            j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                        }
                    } else {
                        j7 = z.f1746b;
                    }
                    yVar.f1736g = Math.max((int) (j4 >> 32), (int) (j7 >> 32));
                    yVar.f1737h = Math.max((int) (j4 & j6), (int) (j7 & j6));
                    textPaint2 = yVar.f1730a;
                    hVarArr2 = yVar.f1742n;
                    i16 = yVar.f1735f - 1;
                    layout = yVar.f1734e;
                    if (layout.getLineStart(i16) == layout.getLineEnd(i16)) {
                        spannableString = new SpannableString("\u200b");
                        if (hVarArr2.length != 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        hVar = hVarArr2[i14];
                        int length5 = spannableString.length();
                        if (i16 == 0) {
                            r6 = hVar.f1878d;
                        } else {
                            r6 = hVar.f1878d;
                        }
                        spannableString.setSpan(new J0.h(hVar.f1875a, length5, r6, hVar.f1878d, hVar.f1879e), i14, spannableString.length(), i13);
                        StaticLayout staticLayoutA3 = pVar.a(new v(spannableString, spannableString.length(), textPaint2, Integer.MAX_VALUE, textDirectionHeuristicA, l.f1701a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, yVar.f1731b, 0, 0, 0, 0));
                        fontMetricsInt = new Paint.FontMetricsInt();
                        fontMetricsInt.ascent = staticLayoutA3.getLineAscent(i14);
                        fontMetricsInt.descent = staticLayoutA3.getLineDescent(i14);
                        fontMetricsInt.top = staticLayoutA3.getLineTop(i14);
                        fontMetricsInt.bottom = staticLayoutA3.getLineBottom(i14);
                    }
                    if (fontMetricsInt != null) {
                        iE = fontMetricsInt.bottom - ((int) (yVar.e(i19) - yVar.g(i19)));
                    } else {
                        iE = i14;
                    }
                    yVar.f1741m = iE;
                    yVar.f1740l = fontMetricsInt;
                    Layout layout6 = yVar.f1734e;
                    yVar.i = AbstractC0599v0.y(layout6, i19, layout6.getPaint());
                    Layout layout7 = yVar.f1734e;
                    yVar.f1738j = AbstractC0599v0.z(layout7, i19, layout7.getPaint());
                }
                j6 = 4294967295L;
                hVarArr = null;
                yVar.f1742n = hVarArr;
                if (hVarArr != null) {
                    length = hVarArr.length;
                    iMax = i14;
                    iMax2 = iMax;
                    while (i17 < length) {
                        J0.h hVar5 = hVarArr[i17];
                        int i25 = hVar5.f1883j;
                        if (i25 < 0) {
                        }
                        i18 = hVar5.f1884k;
                        if (i18 < 0) {
                            iMax2 = Math.max(iMax, Math.abs(i18));
                        }
                    }
                    if (iMax == 0) {
                        j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                    } else {
                        j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                    }
                } else {
                    j7 = z.f1746b;
                }
                yVar.f1736g = Math.max((int) (j4 >> 32), (int) (j7 >> 32));
                yVar.f1737h = Math.max((int) (j4 & j6), (int) (j7 & j6));
                textPaint2 = yVar.f1730a;
                hVarArr2 = yVar.f1742n;
                i16 = yVar.f1735f - 1;
                layout = yVar.f1734e;
                if (layout.getLineStart(i16) == layout.getLineEnd(i16)) {
                    spannableString = new SpannableString("\u200b");
                    if (hVarArr2.length != 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    hVar = hVarArr2[i14];
                    int length6 = spannableString.length();
                    if (i16 == 0) {
                        r6 = hVar.f1878d;
                    } else {
                        r6 = hVar.f1878d;
                    }
                    spannableString.setSpan(new J0.h(hVar.f1875a, length6, r6, hVar.f1878d, hVar.f1879e), i14, spannableString.length(), i13);
                    StaticLayout staticLayoutA4 = pVar.a(new v(spannableString, spannableString.length(), textPaint2, Integer.MAX_VALUE, textDirectionHeuristicA, l.f1701a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, yVar.f1731b, 0, 0, 0, 0));
                    fontMetricsInt = new Paint.FontMetricsInt();
                    fontMetricsInt.ascent = staticLayoutA4.getLineAscent(i14);
                    fontMetricsInt.descent = staticLayoutA4.getLineDescent(i14);
                    fontMetricsInt.top = staticLayoutA4.getLineTop(i14);
                    fontMetricsInt.bottom = staticLayoutA4.getLineBottom(i14);
                }
                if (fontMetricsInt != null) {
                    iE = fontMetricsInt.bottom - ((int) (yVar.e(i19) - yVar.g(i19)));
                } else {
                    iE = i14;
                }
                yVar.f1741m = iE;
                yVar.f1740l = fontMetricsInt;
                Layout layout8 = yVar.f1734e;
                yVar.i = AbstractC0599v0.y(layout8, i19, layout8.getPaint());
                Layout layout9 = yVar.f1734e;
                yVar.f1738j = AbstractC0599v0.z(layout9, i19, layout9.getPaint());
            }
            i13 = 33;
            i14 = 0;
            j4 = z.f1746b;
            fontMetricsInt = null;
            if (layoutA.getText() instanceof Spanned) {
                CharSequence text6 = layoutA.getText();
                E4.k.d("null cannot be cast to non-null type android.text.Spanned", text6);
                spanned = (Spanned) text6;
                j6 = 4294967295L;
                if (spanned.nextSpanTransition(-1, spanned.length(), J0.h.class) != spanned.length()) {
                    i15 = 1;
                } else {
                    i15 = i14;
                }
                if (i15 == 0) {
                }
                CharSequence text7 = layoutA.getText();
                E4.k.d("null cannot be cast to non-null type android.text.Spanned", text7);
                hVarArr = (J0.h[]) ((Spanned) text7).getSpans(i14, layoutA.getText().length(), J0.h.class);
                yVar.f1742n = hVarArr;
                if (hVarArr != null) {
                    length = hVarArr.length;
                    iMax = i14;
                    iMax2 = iMax;
                    while (i17 < length) {
                        J0.h hVar6 = hVarArr[i17];
                        int i26 = hVar6.f1883j;
                        if (i26 < 0) {
                        }
                        i18 = hVar6.f1884k;
                        if (i18 < 0) {
                            iMax2 = Math.max(iMax, Math.abs(i18));
                        }
                    }
                    if (iMax == 0) {
                        j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                    } else {
                        j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                    }
                } else {
                    j7 = z.f1746b;
                }
                yVar.f1736g = Math.max((int) (j4 >> 32), (int) (j7 >> 32));
                yVar.f1737h = Math.max((int) (j4 & j6), (int) (j7 & j6));
                textPaint2 = yVar.f1730a;
                hVarArr2 = yVar.f1742n;
                i16 = yVar.f1735f - 1;
                layout = yVar.f1734e;
                if (layout.getLineStart(i16) == layout.getLineEnd(i16)) {
                    spannableString = new SpannableString("\u200b");
                    if (hVarArr2.length != 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    hVar = hVarArr2[i14];
                    int length7 = spannableString.length();
                    if (i16 == 0) {
                        r6 = hVar.f1878d;
                    } else {
                        r6 = hVar.f1878d;
                    }
                    spannableString.setSpan(new J0.h(hVar.f1875a, length7, r6, hVar.f1878d, hVar.f1879e), i14, spannableString.length(), i13);
                    StaticLayout staticLayoutA5 = pVar.a(new v(spannableString, spannableString.length(), textPaint2, Integer.MAX_VALUE, textDirectionHeuristicA, l.f1701a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, yVar.f1731b, 0, 0, 0, 0));
                    fontMetricsInt = new Paint.FontMetricsInt();
                    fontMetricsInt.ascent = staticLayoutA5.getLineAscent(i14);
                    fontMetricsInt.descent = staticLayoutA5.getLineDescent(i14);
                    fontMetricsInt.top = staticLayoutA5.getLineTop(i14);
                    fontMetricsInt.bottom = staticLayoutA5.getLineBottom(i14);
                }
                if (fontMetricsInt != null) {
                    iE = fontMetricsInt.bottom - ((int) (yVar.e(i19) - yVar.g(i19)));
                } else {
                    iE = i14;
                }
                yVar.f1741m = iE;
                yVar.f1740l = fontMetricsInt;
                Layout layout10 = yVar.f1734e;
                yVar.i = AbstractC0599v0.y(layout10, i19, layout10.getPaint());
                Layout layout11 = yVar.f1734e;
                yVar.f1738j = AbstractC0599v0.z(layout11, i19, layout11.getPaint());
            }
            j6 = 4294967295L;
            hVarArr = null;
            yVar.f1742n = hVarArr;
            if (hVarArr != null) {
                length = hVarArr.length;
                iMax = i14;
                iMax2 = iMax;
                while (i17 < length) {
                    J0.h hVar7 = hVarArr[i17];
                    int i27 = hVar7.f1883j;
                    if (i27 < 0) {
                    }
                    i18 = hVar7.f1884k;
                    if (i18 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i18));
                    }
                }
                if (iMax == 0) {
                    j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                } else {
                    j7 = (((long) iMax) << 32) | (((long) iMax2) & j6);
                }
            } else {
                j7 = z.f1746b;
            }
            yVar.f1736g = Math.max((int) (j4 >> 32), (int) (j7 >> 32));
            yVar.f1737h = Math.max((int) (j4 & j6), (int) (j7 & j6));
            textPaint2 = yVar.f1730a;
            hVarArr2 = yVar.f1742n;
            i16 = yVar.f1735f - 1;
            layout = yVar.f1734e;
            if (layout.getLineStart(i16) == layout.getLineEnd(i16)) {
                spannableString = new SpannableString("\u200b");
                if (hVarArr2.length != 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                hVar = hVarArr2[i14];
                int length8 = spannableString.length();
                if (i16 == 0) {
                    r6 = hVar.f1878d;
                } else {
                    r6 = hVar.f1878d;
                }
                spannableString.setSpan(new J0.h(hVar.f1875a, length8, r6, hVar.f1878d, hVar.f1879e), i14, spannableString.length(), i13);
                StaticLayout staticLayoutA6 = pVar.a(new v(spannableString, spannableString.length(), textPaint2, Integer.MAX_VALUE, textDirectionHeuristicA, l.f1701a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, yVar.f1731b, 0, 0, 0, 0));
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutA6.getLineAscent(i14);
                fontMetricsInt.descent = staticLayoutA6.getLineDescent(i14);
                fontMetricsInt.top = staticLayoutA6.getLineTop(i14);
                fontMetricsInt.bottom = staticLayoutA6.getLineBottom(i14);
            }
            if (fontMetricsInt != null) {
                iE = fontMetricsInt.bottom - ((int) (yVar.e(i19) - yVar.g(i19)));
            } else {
                iE = i14;
            }
            yVar.f1741m = iE;
            yVar.f1740l = fontMetricsInt;
            Layout layout12 = yVar.f1734e;
            yVar.i = AbstractC0599v0.y(layout12, i19, layout12.getPaint());
            Layout layout13 = yVar.f1734e;
            yVar.f1738j = AbstractC0599v0.z(layout13, i19, layout13.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z5 = this.f1732c;
        Layout layout = this.f1734e;
        return (z5 ? layout.getLineBottom(this.f1735f - 1) : layout.getHeight()) + this.f1736g + this.f1737h + this.f1741m;
    }

    public final float b(int i) {
        if (i == this.f1735f - 1) {
            return this.i + this.f1738j;
        }
        return 0.0f;
    }

    public final G0.p c() {
        G0.p pVar = this.f1744p;
        if (pVar != null) {
            return pVar;
        }
        G0.p pVar2 = new G0.p(this.f1734e);
        this.f1744p = pVar2;
        return pVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f1736g + ((i != this.f1735f + (-1) || (fontMetricsInt = this.f1740l) == null) ? this.f1734e.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.f1735f;
        int i6 = i3 - 1;
        Layout layout = this.f1734e;
        if (i != i6 || (fontMetricsInt = this.f1740l) == null) {
            return this.f1736g + layout.getLineBottom(i) + (i == i3 + (-1) ? this.f1737h : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        Layout layout = this.f1734e;
        return layout.getEllipsisStart(i) == 0 ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f1734e.getLineTop(i) + (i == 0 ? 0 : this.f1736g);
    }

    public final float h(int i, boolean z5) {
        return b(this.f1734e.getLineForOffset(i)) + c().j(i, true, z5);
    }

    public final float i(int i, boolean z5) {
        return b(this.f1734e.getLineForOffset(i)) + c().j(i, false, z5);
    }

    public final I0.d j() {
        I0.d dVar = this.f1733d;
        if (dVar != null) {
            return dVar;
        }
        Layout layout = this.f1734e;
        I0.d dVar2 = new I0.d(layout.getText(), layout.getText().length(), this.f1730a.getTextLocale());
        this.f1733d = dVar2;
        return dVar2;
    }
}
