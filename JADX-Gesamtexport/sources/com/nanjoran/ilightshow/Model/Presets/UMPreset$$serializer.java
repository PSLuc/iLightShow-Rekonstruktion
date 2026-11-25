package com.nanjoran.ilightshow.Model.Presets;

import E4.k;
import Y4.a;
import a5.g;
import b5.d;
import c5.AbstractC0476a0;
import c5.C;
import c5.C0480c0;
import c5.C0485f;
import c5.J;
import c5.p0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.protocol.types.MotionState;
import defpackage.b;
import kotlinx.serialization.UnknownFieldException;
import okhttp3.internal.http2.Http2;
import p084p4.c;

/* JADX INFO: loaded from: classes.dex */
@c
public /* synthetic */ class UMPreset$$serializer implements C {
    public static final int $stable;
    public static final UMPreset$$serializer INSTANCE;
    private static final g descriptor;

    static {
        UMPreset$$serializer uMPreset$$serializer = new UMPreset$$serializer();
        INSTANCE = uMPreset$$serializer;
        $stable = 8;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Model.Presets.UMPreset", uMPreset$$serializer, 20);
        c0480c0.m("name", true);
        c0480c0.m("brightnessMin", true);
        c0480c0.m("brightnessMax", true);
        c0480c0.m("saturationMin", true);
        c0480c0.m("saturationMax", true);
        c0480c0.m("ambientBrightness", true);
        c0480c0.m("paletteId", true);
        c0480c0.m("useArtworkColors", true);
        c0480c0.m("strobeDrops", true);
        c0480c0.m("strobeDropsWhite", true);
        c0480c0.m("flashMode", true);
        c0480c0.m("fxSize", true);
        c0480c0.m("engineMode", true);
        c0480c0.m("standardStrobe", true);
        c0480c0.m("standardHighFlash", true);
        c0480c0.m("enablePulses", true);
        c0480c0.m("colorFades", true);
        c0480c0.m("intensityMode", true);
        c0480c0.m("smartMode", true);
        c0480c0.m("whiteFlash", true);
        descriptor = c0480c0;
    }

    private UMPreset$$serializer() {
    }

    @Override // c5.C
    public final a[] childSerializers() {
        p0 p0Var = p0.f7477a;
        a aVarB = AbstractC0599v0.B(p0Var);
        J j4 = J.f7400a;
        C0485f c0485f = C0485f.f7447a;
        return new a[]{p0Var, j4, j4, j4, j4, j4, aVarB, c0485f, c0485f, c0485f, p0Var, p0Var, p0Var, c0485f, c0485f, c0485f, c0485f, p0Var, c0485f, c0485f};
    }

    @Override // Y4.a
    public final UMPreset deserialize(b5.c cVar) {
        int i;
        k.f("decoder", cVar);
        g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        String strM = null;
        String str = null;
        String strM2 = null;
        String strM3 = null;
        String strM4 = null;
        String strM5 = null;
        int i3 = 0;
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        int iN5 = 0;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        boolean zU4 = false;
        boolean zU5 = false;
        boolean zU6 = false;
        boolean zU7 = false;
        boolean zU8 = false;
        boolean zU9 = false;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            switch (iK) {
                case MotionState.UNKNOWN /* -1 */:
                    z5 = false;
                    continue;
                case 0:
                    strM = aVarA.m(gVar, 0);
                    i3 |= 1;
                    continue;
                case 1:
                    iN = aVarA.n(gVar, 1);
                    i3 |= 2;
                    continue;
                case 2:
                    iN2 = aVarA.n(gVar, 2);
                    i3 |= 4;
                    continue;
                case 3:
                    iN3 = aVarA.n(gVar, 3);
                    i3 |= 8;
                    continue;
                case 4:
                    iN4 = aVarA.n(gVar, 4);
                    i3 |= 16;
                    continue;
                case 5:
                    iN5 = aVarA.n(gVar, 5);
                    i3 |= 32;
                    continue;
                case 6:
                    str = (String) aVarA.j(gVar, 6, p0.f7477a, str);
                    i3 |= 64;
                    continue;
                case 7:
                    zU = aVarA.u(gVar, 7);
                    i3 |= 128;
                    continue;
                case 8:
                    zU2 = aVarA.u(gVar, 8);
                    i3 |= HueLog.LogComponent.STREAMDTLS;
                    continue;
                case 9:
                    zU3 = aVarA.u(gVar, 9);
                    i3 |= HueLog.LogComponent.APPCORE;
                    continue;
                case 10:
                    strM2 = aVarA.m(gVar, 10);
                    i3 |= 1024;
                    continue;
                case 11:
                    strM3 = aVarA.m(gVar, 11);
                    i3 |= 2048;
                    continue;
                case 12:
                    strM4 = aVarA.m(gVar, 12);
                    i3 |= 4096;
                    continue;
                case 13:
                    zU4 = aVarA.u(gVar, 13);
                    i3 |= 8192;
                    continue;
                case 14:
                    zU5 = aVarA.u(gVar, 14);
                    i3 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    continue;
                case 15:
                    zU6 = aVarA.u(gVar, 15);
                    i = 32768;
                    break;
                case 16:
                    zU7 = aVarA.u(gVar, 16);
                    i = 65536;
                    break;
                case b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    strM5 = aVarA.m(gVar, 17);
                    i = 131072;
                    break;
                case b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                    zU8 = aVarA.u(gVar, 18);
                    i = 262144;
                    break;
                case b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                    zU9 = aVarA.u(gVar, 19);
                    i = 524288;
                    break;
                default:
                    throw new UnknownFieldException(iK);
            }
            i3 |= i;
        }
        aVarA.b(gVar);
        return new UMPreset(i3, strM, iN, iN2, iN3, iN4, iN5, str, zU, zU2, zU3, strM2, strM3, strM4, zU4, zU5, zU6, zU7, strM5, zU8, zU9, null);
    }

    @Override // Y4.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(d dVar, UMPreset uMPreset) {
        k.f("encoder", dVar);
        k.f("value", uMPreset);
        g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        UMPreset.write$Self$app_release(uMPreset, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
