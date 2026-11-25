package p101t;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: t.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0947o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0947o f12387a = new C0947o();

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f6, float f7) {
        try {
            return edgeEffect.onPullDistance(f6, f7);
        } catch (Throwable unused) {
            edgeEffect.onPull(f6, f7);
            return 0.0f;
        }
    }
}
