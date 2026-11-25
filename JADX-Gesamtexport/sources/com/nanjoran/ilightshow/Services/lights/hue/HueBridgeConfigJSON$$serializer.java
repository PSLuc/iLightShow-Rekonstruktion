package com.nanjoran.ilightshow.Services.lights.hue;

import E4.k;
import a5.g;
import b5.b;
import b5.d;
import c5.AbstractC0476a0;
import c5.C;
import c5.C0480c0;
import c5.p0;
import kotlinx.serialization.UnknownFieldException;
import p084p4.c;

/* JADX INFO: loaded from: classes.dex */
@c
public /* synthetic */ class HueBridgeConfigJSON$$serializer implements C {
    public static final int $stable;
    public static final HueBridgeConfigJSON$$serializer INSTANCE;
    private static final g descriptor;

    static {
        HueBridgeConfigJSON$$serializer hueBridgeConfigJSON$$serializer = new HueBridgeConfigJSON$$serializer();
        INSTANCE = hueBridgeConfigJSON$$serializer;
        $stable = 8;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.lights.hue.HueBridgeConfigJSON", hueBridgeConfigJSON$$serializer, 3);
        c0480c0.m("name", false);
        c0480c0.m("bridgeid", false);
        c0480c0.m("mac", false);
        descriptor = c0480c0;
    }

    private HueBridgeConfigJSON$$serializer() {
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        p0 p0Var = p0.f7477a;
        return new Y4.a[]{p0Var, p0Var, p0Var};
    }

    @Override // Y4.a
    public final HueBridgeConfigJSON deserialize(b5.c cVar) {
        k.f("decoder", cVar);
        g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        int i = 0;
        String strM = null;
        String strM2 = null;
        String strM3 = null;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                strM = aVarA.m(gVar, 0);
                i |= 1;
            } else if (iK == 1) {
                strM2 = aVarA.m(gVar, 1);
                i |= 2;
            } else {
                if (iK != 2) {
                    throw new UnknownFieldException(iK);
                }
                strM3 = aVarA.m(gVar, 2);
                i |= 4;
            }
        }
        aVarA.b(gVar);
        return new HueBridgeConfigJSON(i, strM, strM2, strM3, null);
    }

    @Override // Y4.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(d dVar, HueBridgeConfigJSON hueBridgeConfigJSON) {
        k.f("encoder", dVar);
        k.f("value", hueBridgeConfigJSON);
        g gVar = descriptor;
        b bVarA = dVar.a(gVar);
        HueBridgeConfigJSON.write$Self$app_release(hueBridgeConfigJSON, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
