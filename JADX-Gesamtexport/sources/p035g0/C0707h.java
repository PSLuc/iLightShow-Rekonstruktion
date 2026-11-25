package p035g0;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: g0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0707h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f9067a;

    public C0707h(PathMeasure pathMeasure) {
        this.f9067a = pathMeasure;
    }

    public final void a(float f6, float f7, C0706g c0706g) {
        if (c0706g == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f9067a.getSegment(f6, f7, c0706g.f9063a, true);
    }
}
