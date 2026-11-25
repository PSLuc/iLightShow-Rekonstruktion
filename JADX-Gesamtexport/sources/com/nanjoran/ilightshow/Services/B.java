package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f8232a;
    private static final a5.g descriptor;

    static {
        B b6 = new B();
        f8232a = b6;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.EntitlementsConfig", b6, 3);
        c0480c0.m("modelVersion", true);
        c0480c0.m("quota", true);
        c0480c0.m("beta", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        return new Y4.a[]{AbstractC0599v0.B(c5.J.f7400a), AbstractC0599v0.B(C0699z.f8504a), AbstractC0599v0.B(C0694u.f8489a)};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        int i = 0;
        Integer num = null;
        EntitlementQuotaConfig entitlementQuotaConfig = null;
        BetaEntitlementConfig betaEntitlementConfig = null;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                num = (Integer) aVarA.j(gVar, 0, c5.J.f7400a, num);
                i |= 1;
            } else if (iK == 1) {
                entitlementQuotaConfig = (EntitlementQuotaConfig) aVarA.j(gVar, 1, C0699z.f8504a, entitlementQuotaConfig);
                i |= 2;
            } else {
                if (iK != 2) {
                    throw new UnknownFieldException(iK);
                }
                betaEntitlementConfig = (BetaEntitlementConfig) aVarA.j(gVar, 2, C0694u.f8489a, betaEntitlementConfig);
                i |= 4;
            }
        }
        aVarA.b(gVar);
        return new EntitlementsConfig(i, num, entitlementQuotaConfig, betaEntitlementConfig, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        EntitlementsConfig entitlementsConfig = (EntitlementsConfig) obj;
        E4.k.f("value", entitlementsConfig);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        EntitlementsConfig.write$Self$app_release(entitlementsConfig, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
