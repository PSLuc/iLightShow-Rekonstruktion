package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import c5.C0485f;
import c5.C0499u;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Model.Presets.UMPreset$$serializer;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.protocol.types.MotionState;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0676j implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0676j f8414a;
    private static final a5.g descriptor;

    static {
        C0676j c0676j = new C0676j();
        f8414a = c0676j;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.AppPreset", c0676j, 14);
        c0480c0.m("localId", true);
        c0480c0.m("cloudId", true);
        c0480c0.m("revision", true);
        c0480c0.m("createdAt", true);
        c0480c0.m("updatedAt", true);
        c0480c0.m("sortKey", true);
        c0480c0.m("name", true);
        c0480c0.m("effectsPreset", true);
        c0480c0.m("musicService", true);
        c0480c0.m("selectedLightsIds", true);
        c0480c0.m("backgroundMode", true);
        c0480c0.m("micEnabled", true);
        c0480c0.m("manualDelay", true);
        c0480c0.m("autoCalibration", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        Y4.a[] aVarArr = AppPreset.$childSerializers;
        c5.p0 p0Var = c5.p0.f7477a;
        Y4.a aVarB = AbstractC0599v0.B(p0Var);
        Y4.a aVarB2 = AbstractC0599v0.B(p0Var);
        Y4.a aVarB3 = AbstractC0599v0.B(p0Var);
        Y4.a aVarB4 = AbstractC0599v0.B(p0Var);
        Y4.a aVarB5 = AbstractC0599v0.B(p0Var);
        Y4.a aVarB6 = AbstractC0599v0.B(p0Var);
        Y4.a aVarB7 = AbstractC0599v0.B(UMPreset$$serializer.INSTANCE);
        Y4.a aVarB8 = AbstractC0599v0.B(aVarArr[8]);
        Y4.a aVarB9 = AbstractC0599v0.B(aVarArr[9]);
        C0485f c0485f = C0485f.f7447a;
        return new Y4.a[]{aVarB, aVarB2, aVarB3, aVarB4, aVarB5, aVarB6, p0Var, aVarB7, aVarB8, aVarB9, c0485f, c0485f, C0499u.f7492a, AbstractC0599v0.B(c0485f)};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        Y4.a[] aVarArr;
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        Y4.a[] aVarArr2 = AppPreset.$childSerializers;
        UMPreset uMPreset = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String strM = null;
        double dO = 0.0d;
        int i = 0;
        boolean z5 = true;
        boolean zU = false;
        boolean zU2 = false;
        MusicServiceType musicServiceType = null;
        List list = null;
        while (z5) {
            int iK = aVarA.k(gVar);
            switch (iK) {
                case MotionState.UNKNOWN /* -1 */:
                    z5 = false;
                    continue;
                case 0:
                    aVarArr = aVarArr2;
                    str = (String) aVarA.j(gVar, 0, c5.p0.f7477a, str);
                    i |= 1;
                    break;
                case 1:
                    aVarArr = aVarArr2;
                    str2 = (String) aVarA.j(gVar, 1, c5.p0.f7477a, str2);
                    i |= 2;
                    break;
                case 2:
                    aVarArr = aVarArr2;
                    str3 = (String) aVarA.j(gVar, 2, c5.p0.f7477a, str3);
                    i |= 4;
                    break;
                case 3:
                    aVarArr = aVarArr2;
                    str4 = (String) aVarA.j(gVar, 3, c5.p0.f7477a, str4);
                    i |= 8;
                    break;
                case 4:
                    aVarArr = aVarArr2;
                    str5 = (String) aVarA.j(gVar, 4, c5.p0.f7477a, str5);
                    i |= 16;
                    break;
                case 5:
                    aVarArr = aVarArr2;
                    str6 = (String) aVarA.j(gVar, 5, c5.p0.f7477a, str6);
                    i |= 32;
                    break;
                case 6:
                    aVarArr = aVarArr2;
                    strM = aVarA.m(gVar, 6);
                    i |= 64;
                    break;
                case 7:
                    aVarArr = aVarArr2;
                    uMPreset = (UMPreset) aVarA.j(gVar, 7, UMPreset$$serializer.INSTANCE, uMPreset);
                    i |= 128;
                    break;
                case 8:
                    aVarArr = aVarArr2;
                    musicServiceType = (MusicServiceType) aVarA.j(gVar, 8, aVarArr[8], musicServiceType);
                    i |= HueLog.LogComponent.STREAMDTLS;
                    break;
                case 9:
                    aVarArr = aVarArr2;
                    list = (List) aVarA.j(gVar, 9, aVarArr[9], list);
                    i |= HueLog.LogComponent.APPCORE;
                    break;
                case 10:
                    aVarArr = aVarArr2;
                    zU = aVarA.u(gVar, 10);
                    i |= 1024;
                    break;
                case 11:
                    aVarArr = aVarArr2;
                    zU2 = aVarA.u(gVar, 11);
                    i |= 2048;
                    break;
                case 12:
                    aVarArr = aVarArr2;
                    dO = aVarA.o(gVar, 12);
                    i |= 4096;
                    break;
                case 13:
                    aVarArr = aVarArr2;
                    bool = (Boolean) aVarA.j(gVar, 13, C0485f.f7447a, bool);
                    i |= 8192;
                    break;
                default:
                    throw new UnknownFieldException(iK);
            }
            aVarArr2 = aVarArr;
        }
        aVarA.b(gVar);
        return new AppPreset(i, str, str2, str3, str4, str5, str6, strM, uMPreset, musicServiceType, list, zU, zU2, dO, bool, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        AppPreset appPreset = (AppPreset) obj;
        E4.k.f("value", appPreset);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        AppPreset.write$Self$app_release(appPreset, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
