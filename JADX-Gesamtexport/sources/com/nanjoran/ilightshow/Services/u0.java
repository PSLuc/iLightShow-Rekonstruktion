package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import c5.C0485f;
import c5.C0499u;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Model.Presets.UMPreset$$serializer;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.protocol.types.MotionState;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f8490a;
    private static final a5.g descriptor;

    static {
        u0 u0Var = new u0();
        f8490a = u0Var;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.SharedAppPresetRecordV1", u0Var, 13);
        c0480c0.m("localId", false);
        c0480c0.m("cloudId", true);
        c0480c0.m("revision", true);
        c0480c0.m("createdAt", true);
        c0480c0.m("updatedAt", true);
        c0480c0.m("name", false);
        c0480c0.m("sortKey", false);
        c0480c0.m("effects", true);
        c0480c0.m("musicService", true);
        c0480c0.m("selectedLightIds", true);
        c0480c0.m("backgroundMode", false);
        c0480c0.m("microphone", false);
        c0480c0.m("manualDelaySeconds", false);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        Y4.a[] aVarArr = SharedAppPresetRecordV1.$childSerializers;
        c5.p0 p0Var = c5.p0.f7477a;
        return new Y4.a[]{p0Var, AbstractC0599v0.B(p0Var), AbstractC0599v0.B(p0Var), AbstractC0599v0.B(p0Var), AbstractC0599v0.B(p0Var), p0Var, p0Var, AbstractC0599v0.B(UMPreset$$serializer.INSTANCE), AbstractC0599v0.B(p0Var), aVarArr[9], C0485f.f7447a, C0685n.f8438a, C0499u.f7492a};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        Y4.a[] aVarArr;
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        Y4.a[] aVarArr2 = SharedAppPresetRecordV1.$childSerializers;
        UMPreset uMPreset = null;
        AppPresetMicrophoneV1 appPresetMicrophoneV1 = null;
        String strM = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String strM2 = null;
        String strM3 = null;
        double dO = 0.0d;
        int i = 0;
        boolean z5 = true;
        boolean zU = false;
        String str5 = null;
        List list = null;
        while (z5) {
            int iK = aVarA.k(gVar);
            switch (iK) {
                case MotionState.UNKNOWN /* -1 */:
                    aVarArr = aVarArr2;
                    z5 = false;
                    break;
                case 0:
                    aVarArr = aVarArr2;
                    strM = aVarA.m(gVar, 0);
                    i |= 1;
                    break;
                case 1:
                    aVarArr = aVarArr2;
                    str = (String) aVarA.j(gVar, 1, c5.p0.f7477a, str);
                    i |= 2;
                    break;
                case 2:
                    aVarArr = aVarArr2;
                    str2 = (String) aVarA.j(gVar, 2, c5.p0.f7477a, str2);
                    i |= 4;
                    break;
                case 3:
                    aVarArr = aVarArr2;
                    str3 = (String) aVarA.j(gVar, 3, c5.p0.f7477a, str3);
                    i |= 8;
                    break;
                case 4:
                    aVarArr = aVarArr2;
                    str4 = (String) aVarA.j(gVar, 4, c5.p0.f7477a, str4);
                    i |= 16;
                    break;
                case 5:
                    aVarArr = aVarArr2;
                    strM2 = aVarA.m(gVar, 5);
                    i |= 32;
                    break;
                case 6:
                    aVarArr = aVarArr2;
                    strM3 = aVarA.m(gVar, 6);
                    i |= 64;
                    break;
                case 7:
                    aVarArr = aVarArr2;
                    uMPreset = (UMPreset) aVarA.j(gVar, 7, UMPreset$$serializer.INSTANCE, uMPreset);
                    i |= 128;
                    break;
                case 8:
                    aVarArr = aVarArr2;
                    str5 = (String) aVarA.j(gVar, 8, c5.p0.f7477a, str5);
                    i |= HueLog.LogComponent.STREAMDTLS;
                    break;
                case 9:
                    aVarArr = aVarArr2;
                    list = (List) aVarA.B(gVar, 9, aVarArr[9], list);
                    i |= HueLog.LogComponent.APPCORE;
                    break;
                case 10:
                    aVarArr = aVarArr2;
                    zU = aVarA.u(gVar, 10);
                    i |= 1024;
                    break;
                case 11:
                    aVarArr = aVarArr2;
                    appPresetMicrophoneV1 = (AppPresetMicrophoneV1) aVarA.B(gVar, 11, C0685n.f8438a, appPresetMicrophoneV1);
                    i |= 2048;
                    break;
                case 12:
                    dO = aVarA.o(gVar, 12);
                    i |= 4096;
                    continue;
                default:
                    throw new UnknownFieldException(iK);
            }
            aVarArr2 = aVarArr;
        }
        aVarA.b(gVar);
        return new SharedAppPresetRecordV1(i, strM, str, str2, str3, str4, strM2, strM3, uMPreset, str5, list, zU, appPresetMicrophoneV1, dO, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        SharedAppPresetRecordV1 sharedAppPresetRecordV1 = (SharedAppPresetRecordV1) obj;
        E4.k.f("value", sharedAppPresetRecordV1);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        SharedAppPresetRecordV1.write$Self$app_release(sharedAppPresetRecordV1, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
