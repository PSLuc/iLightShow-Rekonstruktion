package p112v;

import p096s.InterfaceC0918k;

/* JADX INFO: renamed from: v.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0973d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0971c f12967a = C0971c.f12962a;

    default float a(float f6, float f7, float f8) {
        f12967a.getClass();
        float f9 = f7 + f6;
        if ((f6 >= 0.0f && f9 <= f8) || (f6 < 0.0f && f9 > f8)) {
            return 0.0f;
        }
        float f10 = f9 - f8;
        return Math.abs(f6) < Math.abs(f10) ? f6 : f10;
    }

    default InterfaceC0918k b() {
        f12967a.getClass();
        return C0971c.f12963b;
    }
}
