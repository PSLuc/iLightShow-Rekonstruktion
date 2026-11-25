package p048j0;

import android.graphics.Outline;
import p035g0.C0706g;
import p035g0.F;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f9695a = new d();

    public final void a(Outline outline, F f6) {
        if (!(f6 instanceof C0706g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C0706g) f6).f9063a);
    }
}
