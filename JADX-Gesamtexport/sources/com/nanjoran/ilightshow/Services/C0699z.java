package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0699z implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0699z f8504a;
    private static final a5.g descriptor;

    static {
        C0699z c0699z = new C0699z();
        f8504a = c0699z;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.EntitlementQuotaConfig", c0699z, 4);
        c0480c0.m("advancedSecondsPerPeriod", true);
        c0480c0.m("standardSecondsPerPeriod", true);
        c0480c0.m("periodSeconds", true);
        c0480c0.m("usageSyncDeltaSeconds", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        c5.J j4 = c5.J.f7400a;
        return new Y4.a[]{AbstractC0599v0.B(j4), AbstractC0599v0.B(j4), AbstractC0599v0.B(j4), AbstractC0599v0.B(j4)};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                num = (Integer) aVarA.j(gVar, 0, c5.J.f7400a, num);
                i |= 1;
            } else if (iK == 1) {
                num2 = (Integer) aVarA.j(gVar, 1, c5.J.f7400a, num2);
                i |= 2;
            } else if (iK == 2) {
                num3 = (Integer) aVarA.j(gVar, 2, c5.J.f7400a, num3);
                i |= 4;
            } else {
                if (iK != 3) {
                    throw new UnknownFieldException(iK);
                }
                num4 = (Integer) aVarA.j(gVar, 3, c5.J.f7400a, num4);
                i |= 8;
            }
        }
        aVarA.b(gVar);
        return new EntitlementQuotaConfig(i, num, num2, num3, num4, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        EntitlementQuotaConfig entitlementQuotaConfig = (EntitlementQuotaConfig) obj;
        E4.k.f("value", entitlementQuotaConfig);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        EntitlementQuotaConfig.write$Self$app_release(entitlementQuotaConfig, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
