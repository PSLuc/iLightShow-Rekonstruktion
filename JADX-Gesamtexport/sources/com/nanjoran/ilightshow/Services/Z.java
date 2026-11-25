package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z f8376a;
    private static final a5.g descriptor;

    static {
        Z z5 = new Z();
        f8376a = z5;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.PaletteColorSource", z5, 5);
        c0480c0.m("type", true);
        c0480c0.m("paletteId", true);
        c0480c0.m("saturationRange", true);
        c0480c0.m("autoBehavior", true);
        c0480c0.m("displayOrder", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        c5.p0 p0Var = c5.p0.f7477a;
        return new Y4.a[]{p0Var, AbstractC0599v0.B(p0Var), AbstractC0599v0.B(C0661b0.f8378a), AbstractC0599v0.B(p0Var), AbstractC0599v0.B(p0Var)};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        int i = 0;
        String strM = null;
        String str = null;
        PaletteSaturationRange paletteSaturationRange = null;
        String str2 = null;
        String str3 = null;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                strM = aVarA.m(gVar, 0);
                i |= 1;
            } else if (iK == 1) {
                str = (String) aVarA.j(gVar, 1, c5.p0.f7477a, str);
                i |= 2;
            } else if (iK == 2) {
                paletteSaturationRange = (PaletteSaturationRange) aVarA.j(gVar, 2, C0661b0.f8378a, paletteSaturationRange);
                i |= 4;
            } else if (iK == 3) {
                str2 = (String) aVarA.j(gVar, 3, c5.p0.f7477a, str2);
                i |= 8;
            } else {
                if (iK != 4) {
                    throw new UnknownFieldException(iK);
                }
                str3 = (String) aVarA.j(gVar, 4, c5.p0.f7477a, str3);
                i |= 16;
            }
        }
        aVarA.b(gVar);
        return new PaletteColorSource(i, strM, str, paletteSaturationRange, str2, str3, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        PaletteColorSource paletteColorSource = (PaletteColorSource) obj;
        E4.k.f("value", paletteColorSource);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        PaletteColorSource.write$Self$app_release(paletteColorSource, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
