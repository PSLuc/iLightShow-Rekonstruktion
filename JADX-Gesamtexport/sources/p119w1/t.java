package p119w1;

import G4.a;
import H1.d;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class t extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f13451b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextPaint f13454e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f13450a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f13452c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13453d = 1.0f;

    public t(s sVar) {
        a.n("rasterizer cannot be null", sVar);
        this.f13451b = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i3, float f6, int i6, int i7, int i8, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i3, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f13454e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f13454e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f6, i6, f6 + this.f13452c, i8, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        h.a().getClass();
        float f7 = i7;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        s sVar = this.f13451b;
        d dVar = sVar.f13448b;
        Typeface typeface = (Typeface) dVar.f1759k;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) dVar.f1757h, sVar.f13447a * 2, 2, f6, f7, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f13450a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        s sVar = this.f13451b;
        p125x1.a aVarB = sVar.b();
        int iA = aVarB.a(14);
        this.f13453d = fAbs / (iA != 0 ? ((ByteBuffer) aVarB.f11788k).getShort(iA + aVarB.f11786h) : (short) 0);
        p125x1.a aVarB2 = sVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarB2.f11788k).getShort(iA2 + aVarB2.f11786h);
        }
        p125x1.a aVarB3 = sVar.b();
        int iA3 = aVarB3.a(12);
        short s6 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarB3.f11788k).getShort(iA3 + aVarB3.f11786h) : (short) 0) * this.f13453d);
        this.f13452c = s6;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s6;
    }
}
