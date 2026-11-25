package p130y0;

import D4.e;
import E4.l;
import android.graphics.Matrix;
import p035g0.A;
import p035g0.H;

/* JADX INFO: renamed from: y0.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1150p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f14439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matrix f14440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Matrix f14441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f14442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f14443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14444f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14445g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14446h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C1150p0(e eVar) {
        this.f14439a = (l) eVar;
    }

    public final float[] a(Object obj) {
        float[] fArrA = this.f14443e;
        if (fArrA == null) {
            fArrA = A.a();
            this.f14443e = fArrA;
        }
        if (this.f14445g) {
            this.f14446h = H.s(b(obj), fArrA);
            this.f14445g = false;
        }
        if (this.f14446h) {
            return fArrA;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [D4.e, E4.l] */
    public final float[] b(Object obj) {
        float[] fArrA = this.f14442d;
        if (fArrA == null) {
            fArrA = A.a();
            this.f14442d = fArrA;
        }
        if (!this.f14444f) {
            return fArrA;
        }
        Matrix matrix = this.f14440b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f14440b = matrix;
        }
        this.f14439a.d(obj, matrix);
        Matrix matrix2 = this.f14441c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            H.p(matrix, fArrA);
            this.f14440b = matrix2;
            this.f14441c = matrix;
        }
        this.f14444f = false;
        return fArrA;
    }

    public final void c() {
        this.f14444f = true;
        this.f14445g = true;
    }
}
