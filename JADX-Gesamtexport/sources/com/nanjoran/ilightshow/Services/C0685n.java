package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import c5.C0485f;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0685n implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0685n f8438a;
    private static final a5.g descriptor;

    static {
        C0685n c0685n = new C0685n();
        f8438a = c0685n;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.AppPresetMicrophoneV1", c0685n, 2);
        c0480c0.m("enabled", false);
        c0480c0.m("autoCalibration", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        C0485f c0485f = C0485f.f7447a;
        return new Y4.a[]{c0485f, AbstractC0599v0.B(c0485f)};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        c5.k0 k0Var = null;
        boolean z5 = true;
        int i = 0;
        boolean zU = false;
        Boolean bool = null;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                zU = aVarA.u(gVar, 0);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new UnknownFieldException(iK);
                }
                bool = (Boolean) aVarA.j(gVar, 1, C0485f.f7447a, bool);
                i |= 2;
            }
        }
        aVarA.b(gVar);
        return new AppPresetMicrophoneV1(i, zU, bool, k0Var);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        AppPresetMicrophoneV1 appPresetMicrophoneV1 = (AppPresetMicrophoneV1) obj;
        E4.k.f("value", appPresetMicrophoneV1);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        AppPresetMicrophoneV1.write$Self$app_release(appPresetMicrophoneV1, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
