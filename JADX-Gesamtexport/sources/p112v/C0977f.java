package p112v;

import p096s.AbstractC0909d;
import p096s.C0927u;
import p096s.InterfaceC0918k;
import p096s.v0;

/* JADX INFO: renamed from: v.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0977f implements InterfaceC0973d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f12971b = AbstractC0909d.k(125, 2, new C0927u(0.25f, 0.1f, 0.25f, 1.0f));

    @Override // p112v.InterfaceC0973d
    public final float a(float f6, float f7, float f8) {
        float fAbs = Math.abs((f7 + f6) - f6);
        float f9 = (0.3f * f8) - (0.0f * fAbs);
        float f10 = f8 - f9;
        if ((fAbs <= f8) && f10 < fAbs) {
            f9 = f8 - fAbs;
        }
        return f6 - f9;
    }

    @Override // p112v.InterfaceC0973d
    public final InterfaceC0918k b() {
        return this.f12971b;
    }
}
