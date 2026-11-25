package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import c5.C0485f;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.spotify.protocol.types.MotionState;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0694u implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0694u f8489a;
    private static final a5.g descriptor;

    static {
        C0694u c0694u = new C0694u();
        f8489a = c0694u;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.BetaEntitlementConfig", c0694u, 6);
        c0480c0.m("enabled", true);
        c0480c0.m("grant", true);
        c0480c0.m("platforms", true);
        c0480c0.m("buildChannels", true);
        c0480c0.m("diagnosticLabel", true);
        c0480c0.m("reason", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        Y4.a[] aVarArr = BetaEntitlementConfig.$childSerializers;
        Y4.a aVarB = AbstractC0599v0.B(C0485f.f7447a);
        c5.p0 p0Var = c5.p0.f7477a;
        return new Y4.a[]{aVarB, AbstractC0599v0.B(p0Var), AbstractC0599v0.B(aVarArr[2]), AbstractC0599v0.B(aVarArr[3]), AbstractC0599v0.B(p0Var), AbstractC0599v0.B(p0Var)};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        Y4.a[] aVarArr = BetaEntitlementConfig.$childSerializers;
        int i = 0;
        Boolean bool = null;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            switch (iK) {
                case MotionState.UNKNOWN /* -1 */:
                    z5 = false;
                    break;
                case 0:
                    bool = (Boolean) aVarA.j(gVar, 0, C0485f.f7447a, bool);
                    i |= 1;
                    break;
                case 1:
                    str = (String) aVarA.j(gVar, 1, c5.p0.f7477a, str);
                    i |= 2;
                    break;
                case 2:
                    list = (List) aVarA.j(gVar, 2, aVarArr[2], list);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) aVarA.j(gVar, 3, aVarArr[3], list2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) aVarA.j(gVar, 4, c5.p0.f7477a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) aVarA.j(gVar, 5, c5.p0.f7477a, str3);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iK);
            }
        }
        aVarA.b(gVar);
        return new BetaEntitlementConfig(i, bool, str, list, list2, str2, str3, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        BetaEntitlementConfig betaEntitlementConfig = (BetaEntitlementConfig) obj;
        E4.k.f("value", betaEntitlementConfig);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        BetaEntitlementConfig.write$Self$app_release(betaEntitlementConfig, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
