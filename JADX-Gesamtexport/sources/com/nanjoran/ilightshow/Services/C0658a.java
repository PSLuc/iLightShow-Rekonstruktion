package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import c5.C0485f;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0658a implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0658a f8377a;
    private static final a5.g descriptor;

    static {
        C0658a c0658a = new C0658a();
        f8377a = c0658a;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.AppConfig", c0658a, 2);
        c0480c0.m("freeBeta", true);
        c0480c0.m("entitlements", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        return new Y4.a[]{AbstractC0599v0.B(C0485f.f7447a), AbstractC0599v0.B(B.f8232a)};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        c5.k0 k0Var = null;
        boolean z5 = true;
        int i = 0;
        Boolean bool = null;
        EntitlementsConfig entitlementsConfig = null;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                bool = (Boolean) aVarA.j(gVar, 0, C0485f.f7447a, bool);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new UnknownFieldException(iK);
                }
                entitlementsConfig = (EntitlementsConfig) aVarA.j(gVar, 1, B.f8232a, entitlementsConfig);
                i |= 2;
            }
        }
        aVarA.b(gVar);
        return new AppConfig(i, bool, entitlementsConfig, k0Var);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        AppConfig appConfig = (AppConfig) obj;
        E4.k.f("value", appConfig);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        AppConfig.write$Self$app_release(appConfig, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
