package p035g0;

import E4.k;
import O1.u;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import p030f0.c;
import p030f0.d;

/* JADX INFO: renamed from: g0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0701b implements InterfaceC0714o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f9056a = AbstractC0702c.f9059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f9057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f9058c;

    @Override // p035g0.InterfaceC0714o
    public final void a(float f6, float f7) {
        this.f9056a.scale(f6, f7);
    }

    @Override // p035g0.InterfaceC0714o
    public final void b(float f6, long j4, u uVar) {
        this.f9056a.drawCircle(c.d(j4), c.e(j4), f6, (Paint) uVar.f4534b);
    }

    @Override // p035g0.InterfaceC0714o
    public final void c(F f6) {
        Canvas canvas = this.f9056a;
        if (!(f6 instanceof C0706g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C0706g) f6).f9063a, Region.Op.INTERSECT);
    }

    @Override // p035g0.InterfaceC0714o
    public final void d(float f6, float f7, float f8, float f9, u uVar) {
        this.f9056a.drawRect(f6, f7, f8, f9, (Paint) uVar.f4534b);
    }

    @Override // p035g0.InterfaceC0714o
    public final void e(float f6, float f7, float f8, float f9, float f10, float f11, u uVar) {
        this.f9056a.drawArc(f6, f7, f8, f9, f10, f11, false, (Paint) uVar.f4534b);
    }

    @Override // p035g0.InterfaceC0714o
    public final void f(float f6, float f7, float f8, float f9, int i) {
        this.f9056a.clipRect(f6, f7, f8, f9, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p035g0.InterfaceC0714o
    public final void g(float f6, float f7) {
        this.f9056a.translate(f6, f7);
    }

    @Override // p035g0.InterfaceC0714o
    public final void h() {
        this.f9056a.rotate(45.0f);
    }

    @Override // p035g0.InterfaceC0714o
    public final void i() {
        this.f9056a.restore();
    }

    @Override // p035g0.InterfaceC0714o
    public final void j(float f6, float f7, float f8, float f9, float f10, float f11, u uVar) {
        this.f9056a.drawRoundRect(f6, f7, f8, f9, f10, f11, (Paint) uVar.f4534b);
    }

    @Override // p035g0.InterfaceC0714o
    public final void k(F f6, u uVar) {
        Canvas canvas = this.f9056a;
        if (!(f6 instanceof C0706g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C0706g) f6).f9063a, (Paint) uVar.f4534b);
    }

    @Override // p035g0.InterfaceC0714o
    public final void l() {
        this.f9056a.save();
    }

    @Override // p035g0.InterfaceC0714o
    public final void m(long j4, long j6, u uVar) {
        this.f9056a.drawLine(c.d(j4), c.e(j4), c.d(j6), c.e(j6), (Paint) uVar.f4534b);
    }

    @Override // p035g0.InterfaceC0714o
    public final void n() {
        C0716q.f9075a.a(this.f9056a, false);
    }

    @Override // p035g0.InterfaceC0714o
    public final void o(C0704e c0704e, long j4, long j6, long j7, long j8, u uVar) {
        if (this.f9057b == null) {
            this.f9057b = new Rect();
            this.f9058c = new Rect();
        }
        Canvas canvas = this.f9056a;
        Bitmap bitmapK = H.k(c0704e);
        Rect rect = this.f9057b;
        k.c(rect);
        int i = (int) (j4 >> 32);
        rect.left = i;
        int i3 = (int) (j4 & 4294967295L);
        rect.top = i3;
        rect.right = i + ((int) (j6 >> 32));
        rect.bottom = i3 + ((int) (j6 & 4294967295L));
        Rect rect2 = this.f9058c;
        k.c(rect2);
        int i6 = (int) (j7 >> 32);
        rect2.left = i6;
        int i7 = (int) (j7 & 4294967295L);
        rect2.top = i7;
        rect2.right = i6 + ((int) (j8 >> 32));
        rect2.bottom = i7 + ((int) (j8 & 4294967295L));
        canvas.drawBitmap(bitmapK, rect, rect2, (Paint) uVar.f4534b);
    }

    @Override // p035g0.InterfaceC0714o
    public final void p(C0704e c0704e, u uVar) {
        this.f9056a.drawBitmap(H.k(c0704e), c.d(0L), c.e(0L), (Paint) uVar.f4534b);
    }

    @Override // p035g0.InterfaceC0714o
    public final void q(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i3 = 0;
            while (i3 < 4) {
                if (fArr[(i * 4) + i3] != (i == i3 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    H.o(matrix, fArr);
                    this.f9056a.concat(matrix);
                    return;
                }
                i3++;
            }
            i++;
        }
    }

    @Override // p035g0.InterfaceC0714o
    public final void r() {
        C0716q.f9075a.a(this.f9056a, true);
    }

    @Override // p035g0.InterfaceC0714o
    public final void s(d dVar, u uVar) {
        Canvas canvas = this.f9056a;
        Paint paint = (Paint) uVar.f4534b;
        canvas.saveLayer(dVar.f8839a, dVar.f8840b, dVar.f8841c, dVar.f8842d, paint, 31);
    }
}
