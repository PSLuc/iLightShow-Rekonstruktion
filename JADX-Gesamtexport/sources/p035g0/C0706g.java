package p035g0;

import E4.k;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import p030f0.d;

/* JADX INFO: renamed from: g0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0706g implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f9063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f9064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f9065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f9066d;

    public C0706g(Path path) {
        this.f9063a = path;
    }

    public final d c() {
        if (this.f9064b == null) {
            this.f9064b = new RectF();
        }
        RectF rectF = this.f9064b;
        k.c(rectF);
        this.f9063a.computeBounds(rectF, true);
        return new d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(F f6, F f7, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(f6 instanceof C0706g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C0706g) f6).f9063a;
        if (f7 instanceof C0706g) {
            return this.f9063a.op(path, ((C0706g) f7).f9063a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void e() {
        this.f9063a.reset();
    }
}
