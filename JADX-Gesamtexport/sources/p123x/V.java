package p123x;

import Z.o;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f13719a = new V();

    public static o a(o oVar, float f6) {
        if (f6 > 0.0d) {
            if (f6 > Float.MAX_VALUE) {
                f6 = Float.MAX_VALUE;
            }
            return oVar.k(new LayoutWeightElement(f6, true));
        }
        throw new IllegalArgumentException(("invalid weight " + f6 + "; must be greater than zero").toString());
    }
}
