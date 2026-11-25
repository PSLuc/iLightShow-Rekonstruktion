package Q0;

import E4.k;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p044i0.e;
import p044i0.g;
import p044i0.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4686a;

    public a(e eVar) {
        this.f4686a = eVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            g gVar = g.f9389a;
            e eVar = this.f4686a;
            if (k.a(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (eVar instanceof h) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((h) eVar).f9390a);
                textPaint.setStrokeMiter(((h) eVar).f9391b);
                int i = ((h) eVar).f9393d;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else {
                    join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i3 = ((h) eVar).f9392c;
                if (i3 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i3 == 1) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = i3 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                ((h) eVar).getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
