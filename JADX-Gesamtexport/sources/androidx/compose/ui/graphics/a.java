package androidx.compose.ui.graphics;

import D4.c;
import Z.o;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p035g0.H;
import p035g0.M;
import p035g0.P;
import p035g0.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final o a(c cVar) {
        return new BlockGraphicsLayerElement(cVar);
    }

    public static o b(o oVar, float f6, float f7, float f8, float f9, float f10, M m6, boolean z5, int i) {
        float f11 = (i & 1) != 0 ? 1.0f : f6;
        float f12 = (i & 2) != 0 ? 1.0f : f7;
        float f13 = (i & 4) != 0 ? 1.0f : f8;
        float f14 = (i & 32) != 0 ? 0.0f : f9;
        float f15 = (i & HueLog.LogComponent.STREAMDTLS) != 0 ? 0.0f : f10;
        long j4 = P.f9051b;
        M m7 = (i & 2048) != 0 ? H.f9016a : m6;
        boolean z6 = (i & 4096) != 0 ? false : z5;
        long j6 = x.f9092a;
        return oVar.k(new GraphicsLayerElement(f11, f12, f13, f14, f15, j4, m7, z6, j6, j6));
    }
}
