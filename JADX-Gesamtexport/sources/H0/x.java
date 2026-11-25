package H0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* JADX INFO: loaded from: classes.dex */
public final class x extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f1729a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        f fVar = f.f1695a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return fVar.a(canvas, path);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        f fVar = f.f1695a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return fVar.e(canvas, rectF);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        g gVar = g.f1696a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            gVar.a(canvas);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i3, int i6, int i7) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawARGB(i, i3, i6, i7);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f6, float f7, boolean z5, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawArc(rectF, f6, f7, z5, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f6, float f7, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f6, f7, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i3, float[] fArr, int i6, int[] iArr, int i7, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i, i3, fArr, i6, iArr, i7, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f6, float f7, float f8, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawCircle(f6, f7, f8, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawColor(i);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f6, float f7, RectF rectF2, float f8, float f9, Paint paint) {
        g gVar = g.f1696a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            gVar.e(canvas, rectF, f6, f7, rectF2, f8, f9, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i3, int i6, Font font, Paint paint) {
        j jVar = j.f1698a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            jVar.a(canvas, iArr, i, fArr, i3, i6, font, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f6, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawLine(f6, f7, f8, f9, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i3, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawLines(fArr, i, i3, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        j jVar = j.f1698a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            jVar.b(canvas, ninePatch, rect, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f6, float f7, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawPoint(f6, f7, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i3, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i, i3, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i3, float[] fArr, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i, i3, fArr, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i3, int i6) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawRGB(i, i3, i6);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        g gVar = g.f1696a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            gVar.g(canvas, renderNode);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f6, float f7, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f6, f7, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i3, float f6, float f7, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawText(cArr, i, i3, f6, f7, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i3, Path path, float f6, float f7, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i, i3, path, f6, f7, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i3, int i6, int i7, float f6, float f7, boolean z5, Paint paint) {
        e eVar = e.f1694a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            eVar.b(canvas, cArr, i, i3, i6, i7, f6, f7, z5, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i3, float[] fArr2, int i6, int[] iArr, int i7, short[] sArr, int i8, int i9, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i, fArr, i3, fArr2, i6, iArr, i7, sArr, i8, i9, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        g gVar = g.f1696a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            gVar.i(canvas);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f1729a;
        if (canvas == null) {
            E4.k.m("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.restore();
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.restoreToCount(i);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f6) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.rotate(f6);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.save();
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i3) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i3);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f6, float f7) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.scale(f6, f7);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.setDensity(i);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f6, float f7) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.skew(f6, f7);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f6, float f7) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.translate(f6, f7);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        f fVar = f.f1695a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return fVar.d(canvas, rect);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f6, float f7, float f8, float f9, float f10, float f11, boolean z5, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawArc(f6, f7, f8, f9, f10, f11, z5, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j4) {
        g gVar = g.f1696a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            gVar.c(canvas, j4);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f6, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawOval(f6, f7, f8, f9, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        j jVar = j.f1698a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            jVar.c(canvas, ninePatch, rectF, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f6, float f7, float f8, float f9, float f10, float f11, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawRoundRect(f6, f7, f8, f9, f10, f11, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f6, float f7, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawText(str, f6, f7, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f6, float f7, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f6, f7, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        i iVar = i.f1697a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return iVar.c(canvas, rectF);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f6, float f7, float f8, float f9) {
        f fVar = f.f1695a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return fVar.b(canvas, f6, f7, f8, f9);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawColor(i, mode);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f6, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawRect(f6, f7, f8, f9, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i3, float f6, float f7, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawText(str, i, i3, f6, f7, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f7, float f8, float f9, Paint paint, int i) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.saveLayer(f6, f7, f8, f9, paint, i);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f7, float f8, float f9, int i, int i3) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f6, f7, f8, f9, i, i3);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i3, int i6, int i7) {
        f fVar = f.f1695a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return fVar.c(canvas, i, i3, i6, i7);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i3, float f6, float f7, int i6, int i7, boolean z5, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i3, f6, f7, i6, i7, z5, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        g gVar = g.f1696a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            gVar.b(canvas, i, blendMode);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i3, float f6, float f7, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawText(charSequence, i, i3, f6, f7, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        i iVar = i.f1697a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return iVar.b(canvas, path);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.saveLayer(f6, f7, f8, f9, paint);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f7, float f8, float f9, int i) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f6, f7, f8, f9, i);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f7, float f8, float f9, Region.Op op) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.clipRect(f6, f7, f8, f9, op);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i3, int i6, int i7, int i8, int i9, boolean z5, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i3, i6, i7, i8, i9, z5, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j4, BlendMode blendMode) {
        g gVar = g.f1696a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            gVar.d(canvas, j4, blendMode);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        g gVar = g.f1696a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            gVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i3, int i6, int i7, float f6, float f7, boolean z5, Paint paint) {
        e eVar = e.f1694a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            eVar.a(canvas, charSequence, i, i3, i6, i7, f6, f7, z5, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f7, float f8, float f9, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.quickReject(f6, f7, f8, f9, edgeType);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f7, float f8, float f9) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.clipRect(f6, f7, f8, f9);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f7, float f8, float f9) {
        i iVar = i.f1697a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return iVar.a(canvas, f6, f7, f8, f9);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i3, int i6, int i7) {
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            return canvas.clipRect(i, i3, i6, i7);
        }
        E4.k.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i3, int i6, int i7, float f6, float f7, boolean z5, Paint paint) {
        g gVar = g.f1696a;
        Canvas canvas = this.f1729a;
        if (canvas != null) {
            gVar.h(canvas, measuredText, i, i3, i6, i7, f6, f7, z5, paint);
        } else {
            E4.k.m("nativeCanvas");
            throw null;
        }
    }
}
