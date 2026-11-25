package H0;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f1696a = new g();

    public final void a(Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public final void c(Canvas canvas, long j4) {
        canvas.drawColor(j4);
    }

    public final void d(Canvas canvas, long j4, BlendMode blendMode) {
        canvas.drawColor(j4, blendMode);
    }

    public final void e(Canvas canvas, RectF rectF, float f6, float f7, RectF rectF2, float f8, float f9, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f6, f7, rectF2, f8, f9, paint);
    }

    public final void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(Canvas canvas, MeasuredText measuredText, int i, int i3, int i6, int i7, float f6, float f7, boolean z5, Paint paint) {
        canvas.drawTextRun(measuredText, i, i3, i6, i7, f6, f7, z5, paint);
    }

    public final void i(Canvas canvas) {
        canvas.enableZ();
    }
}
