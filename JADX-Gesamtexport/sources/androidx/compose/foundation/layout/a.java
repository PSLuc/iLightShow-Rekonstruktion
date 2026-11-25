package androidx.compose.foundation.layout;

import Z.o;
import p123x.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final O a(float f6, float f7, float f8, float f9) {
        return new O(f6, f7, f8, f9);
    }

    public static O b(float f6) {
        return new O(0, 0, 0, f6);
    }

    public static o c(o oVar, float f6) {
        return oVar.k(new AspectRatioElement(f6));
    }

    public static final o d(o oVar, D4.c cVar) {
        return oVar.k(new OffsetPxElement(cVar));
    }

    public static final o e(o oVar, float f6, float f7) {
        return oVar.k(new OffsetElement(f6, f7));
    }

    public static final o f(o oVar, O o6) {
        return oVar.k(new PaddingValuesElement(o6));
    }

    public static final o g(o oVar, float f6) {
        return oVar.k(new PaddingElement(f6, f6, f6, f6));
    }

    public static final o h(o oVar, float f6, float f7) {
        return oVar.k(new PaddingElement(f6, f7, f6, f7));
    }

    public static o i(o oVar, float f6, float f7, int i) {
        if ((i & 1) != 0) {
            f6 = 0;
        }
        if ((i & 2) != 0) {
            f7 = 0;
        }
        return h(oVar, f6, f7);
    }

    public static final o j(o oVar, float f6, float f7, float f8, float f9) {
        return oVar.k(new PaddingElement(f6, f7, f8, f9));
    }

    public static o k(o oVar, float f6, float f7, float f8, float f9, int i) {
        if ((i & 1) != 0) {
            f6 = 0;
        }
        if ((i & 2) != 0) {
            f7 = 0;
        }
        if ((i & 4) != 0) {
            f8 = 0;
        }
        if ((i & 8) != 0) {
            f9 = 0;
        }
        return j(oVar, f6, f7, f8, f9);
    }

    public static final o l(o oVar) {
        return oVar.k(new IntrinsicWidthElement());
    }
}
