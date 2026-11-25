package p030f0;

import p027e3.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f8833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8836d;

    public final void a(float f6, float f7, float f8, float f9) {
        this.f8833a = Math.max(f6, this.f8833a);
        this.f8834b = Math.max(f7, this.f8834b);
        this.f8835c = Math.min(f8, this.f8835c);
        this.f8836d = Math.min(f9, this.f8836d);
    }

    public final boolean b() {
        return this.f8833a >= this.f8835c || this.f8834b >= this.f8836d;
    }

    public final String toString() {
        return "MutableRect(" + a.B0(this.f8833a) + ", " + a.B0(this.f8834b) + ", " + a.B0(this.f8835c) + ", " + a.B0(this.f8836d) + ')';
    }
}
