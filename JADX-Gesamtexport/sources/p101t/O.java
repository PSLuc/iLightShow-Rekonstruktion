package p101t;

import android.content.Context;
import android.widget.EdgeEffect;
import p027e3.a;

/* JADX INFO: loaded from: classes.dex */
public final class O extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12260b;

    public O(Context context) {
        super(context);
        this.f12259a = a.F(context).f4885h * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f12260b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6, float f7) {
        this.f12260b = 0.0f;
        super.onPull(f6, f7);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f12260b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6) {
        this.f12260b = 0.0f;
        super.onPull(f6);
    }
}
