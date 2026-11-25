package p130y0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import p035g0.H;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f14328a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f14329b = new int[2];

    public void a(View view, float[] fArr) {
        Matrix matrix = this.f14328a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f14329b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i3 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i3);
        H.p(matrix, fArr);
    }
}
