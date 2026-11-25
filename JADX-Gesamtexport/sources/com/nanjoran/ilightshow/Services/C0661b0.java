package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0661b0 implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0661b0 f8378a;
    private static final a5.g descriptor;

    static {
        C0661b0 c0661b0 = new C0661b0();
        f8378a = c0661b0;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.PaletteSaturationRange", c0661b0, 2);
        c0480c0.m("min", true);
        c0480c0.m("max", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        c5.J j4 = c5.J.f7400a;
        return new Y4.a[]{j4, j4};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        boolean z5 = true;
        int i = 0;
        int iN = 0;
        int iN2 = 0;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                iN = aVarA.n(gVar, 0);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new UnknownFieldException(iK);
                }
                iN2 = aVarA.n(gVar, 1);
                i |= 2;
            }
        }
        aVarA.b(gVar);
        return new PaletteSaturationRange(i, iN, iN2, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        PaletteSaturationRange paletteSaturationRange = (PaletteSaturationRange) obj;
        E4.k.f("value", paletteSaturationRange);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        PaletteSaturationRange.write$Self$app_release(paletteSaturationRange, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
