package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.philips.lighting.hue.sdk.wrapper.domain.ClipAttribute;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f8263a;
    private static final a5.g descriptor;

    static {
        G g6 = new G();
        f8263a = g6;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.LegacyPaletteColor", g6, 2);
        c0480c0.m(ClipAttribute.Light.State.Hue, true);
        c0480c0.m("saturation", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        c5.B b6 = c5.B.f7379a;
        return new Y4.a[]{b6, b6};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        float fH = 0.0f;
        boolean z5 = true;
        int i = 0;
        float fH2 = 0.0f;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                fH = aVarA.h(gVar, 0);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new UnknownFieldException(iK);
                }
                fH2 = aVarA.h(gVar, 1);
                i |= 2;
            }
        }
        aVarA.b(gVar);
        return new LegacyPaletteColor(i, fH, fH2, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        LegacyPaletteColor legacyPaletteColor = (LegacyPaletteColor) obj;
        E4.k.f("value", legacyPaletteColor);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        LegacyPaletteColor.write$Self$app_release(legacyPaletteColor, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
