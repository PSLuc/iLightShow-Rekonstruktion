package H0;

import B.C0003b0;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f1712a = new p();

    public static final Rect a(TextPaint textPaint, CharSequence charSequence, int i, int i3) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i3) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    o.a(textPaint2, charSequence, i, iNextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        o.a(textPaint, charSequence, i, i3, rect3);
        return rect3;
    }

    public static final float b(int i, int i3, float[] fArr) {
        return fArr[((i - i3) * 2) + 1];
    }

    public static final int c(Layout layout, int i, boolean z5) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z5) {
                    return lineForOffset - 1;
                }
            } else if (!z5) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0262 A[EDGE_INSN: B:143:0x0262->B:170:0x02be BREAK  A[LOOP:5: B:153:0x027e->B:207:0x027e]] */
    public static final int d(y yVar, Layout layout, G0.p pVar, int i, RectF rectF, I0.c cVar, C0003b0 c0003b0, boolean z5) {
        m[] mVarArr;
        int i3;
        m[] mVarArr2;
        int i6;
        int iB;
        int i7;
        int i8;
        int iA;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i9 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i9];
        Layout layout2 = yVar.f1734e;
        int lineStart2 = layout2.getLineStart(i);
        int iF = yVar.f(i);
        if (i9 < (iF - lineStart2) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        D0.j jVar = new D0.j(yVar);
        boolean z6 = false;
        boolean z7 = layout2.getParagraphDirection(i) == 1;
        int i10 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z7 && !zIsRtlCharAt) {
                fA = jVar.a(lineStart2, z6, z6, true);
                fA3 = jVar.a(lineStart2 + 1, true, true, true);
            } else if (z7 && zIsRtlCharAt) {
                fA3 = jVar.a(lineStart2, false, false, false);
                fA = jVar.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = jVar.a(lineStart2, false, false, true);
                    fA = jVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = jVar.a(lineStart2, false, false, false);
                    fA2 = jVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i10] = fA;
            fArr[i10 + 1] = fA3;
            i10 += 2;
            lineStart2++;
            z7 = z7;
            z6 = false;
        }
        Layout layout3 = (Layout) pVar.f1523j;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iK = pVar.k(lineStart3, false);
        int iL = pVar.l(iK);
        int i11 = lineStart3 - iL;
        int i12 = lineEnd2 - iL;
        Bidi bidiF = pVar.f(iK);
        if (bidiF == null || (bidiCreateLineBidi = bidiF.createLineBidi(i11, i12)) == null) {
            mVarArr = new m[]{new m(layout3.isRtlCharAt(lineStart3), lineStart3, lineEnd2)};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            mVarArr = new m[runCount];
            int i13 = 0;
            while (i13 < runCount) {
                int i14 = runCount;
                mVarArr[i13] = new m(bidiCreateLineBidi.getRunLevel(i13) % 2 == 1, bidiCreateLineBidi.getRunStart(i13) + lineStart3, bidiCreateLineBidi.getRunLimit(i13) + lineStart3);
                i13++;
                runCount = i14;
            }
        }
        J4.b dVar = z5 ? new J4.d(0, mVarArr.length - 1, 1) : new J4.b(mVarArr.length - 1, 0, -1);
        int i15 = dVar.f1941h;
        int i16 = dVar.i;
        int i17 = dVar.f1942j;
        if ((i17 <= 0 || i15 > i16) && (i17 >= 0 || i16 > i15)) {
            return -1;
        }
        while (true) {
            m mVar = mVarArr[i15];
            boolean z8 = mVar.f1704c;
            int iF2 = mVar.f1702a;
            int iG = mVar.f1703b;
            float f6 = z8 ? fArr[((iG - 1) - lineStart) * 2] : fArr[(iF2 - lineStart) * 2];
            float fB = z8 ? b(iF2, lineStart, fArr) : b(iG - 1, lineStart, fArr);
            boolean z9 = mVar.f1704c;
            if (z5) {
                float f7 = rectF.left;
                if (fB >= f7) {
                    i3 = i17;
                    float f8 = rectF.right;
                    if (f6 <= f8) {
                        if ((z9 || f7 > f6) && (!z9 || f8 < fB)) {
                            int i18 = iF2;
                            int i19 = iG;
                            while (true) {
                                i7 = i19;
                                if (i19 - i18 <= 1) {
                                    break;
                                }
                                int i20 = (i7 + i18) / 2;
                                float f9 = fArr[(i20 - lineStart) * 2];
                                if ((z9 || f9 <= rectF.left) && (!z9 || f9 >= rectF.right)) {
                                    i19 = i7;
                                    i18 = i20;
                                } else {
                                    i19 = i20;
                                }
                            }
                            i8 = z9 ? i7 : i18;
                        } else {
                            i8 = iF2;
                        }
                        int iB2 = cVar.b(i8);
                        if (iB2 != -1 && (iA = cVar.a(iB2)) < iG) {
                            if (iA >= iF2) {
                                iF2 = iA;
                            }
                            if (iB2 > iG) {
                                iB2 = iG;
                            }
                            mVarArr2 = mVarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iB3 = iB2;
                            while (true) {
                                rectF2.left = z9 ? fArr[((iB3 - 1) - lineStart) * 2] : fArr[(iF2 - lineStart) * 2];
                                rectF2.right = z9 ? b(iF2, lineStart, fArr) : b(iB3 - 1, lineStart, fArr);
                                if (((Boolean) c0003b0.d(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iF2 = cVar.f(iF2);
                                if (iF2 != -1 && iF2 < iG) {
                                    iB3 = cVar.b(iF2);
                                    if (iB3 > iG) {
                                        iB3 = iG;
                                    }
                                }
                            }
                        }
                        iF2 = -1;
                        break;
                    }
                } else {
                    i3 = i17;
                }
                mVarArr2 = mVarArr;
                iF2 = -1;
                break;
            } else {
                i3 = i17;
                mVarArr2 = mVarArr;
                float f10 = rectF.left;
                if (fB < f10) {
                    iG = -1;
                    break;
                }
                float f11 = rectF.right;
                if (f6 <= f11) {
                    if ((z9 || f11 < fB) && (!z9 || f10 > f6)) {
                        int i21 = iF2;
                        int i22 = iG;
                        while (i22 - i21 > 1) {
                            int i23 = (i22 + i21) / 2;
                            float f12 = fArr[(i23 - lineStart) * 2];
                            int i24 = i22;
                            if ((z9 || f12 <= rectF.right) && (!z9 || f12 >= rectF.left)) {
                                i22 = i24;
                                i21 = i23;
                            } else {
                                i22 = i23;
                            }
                        }
                        i6 = z9 ? i22 : i21;
                    } else {
                        i6 = iG - 1;
                    }
                    int iA2 = cVar.a(i6 + 1);
                    if (iA2 == -1 || (iB = cVar.b(iA2)) <= iF2) {
                        iG = -1;
                        break;
                    }
                    if (iA2 < iF2) {
                        iA2 = iF2;
                    }
                    if (iB <= iG) {
                        iG = iB;
                    }
                    RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iA3 = iA2;
                    while (true) {
                        rectF3.left = z9 ? fArr[((iG - 1) - lineStart) * 2] : fArr[(iA3 - lineStart) * 2];
                        rectF3.right = z9 ? b(iA3, lineStart, fArr) : b(iG - 1, lineStart, fArr);
                        if (((Boolean) c0003b0.d(rectF3, rectF)).booleanValue()) {
                            break;
                        }
                        iG = cVar.g(iG);
                        if (iG == -1 || iG <= iF2) {
                            iG = -1;
                            break;
                        }
                        iA3 = cVar.a(iG);
                        if (iA3 < iF2) {
                            iA3 = iF2;
                        }
                    }
                } else {
                    iG = -1;
                    break;
                }
                iF2 = iG;
            }
            if (iF2 >= 0) {
                return iF2;
            }
            if (i15 == i16) {
                return -1;
            }
            i15 += i3;
            i17 = i3;
            mVarArr = mVarArr2;
        }
    }
}
