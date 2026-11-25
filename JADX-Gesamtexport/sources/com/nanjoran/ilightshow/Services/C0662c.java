package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0662c implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0662c f8379a;
    private static final a5.g descriptor;

    static {
        C0662c c0662c = new C0662c();
        f8379a = c0662c;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.AppConfigWrapper", c0662c, 2);
        c0480c0.m("news", true);
        c0480c0.m("config", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        return new Y4.a[]{AbstractC0599v0.B(P.f8356a), AbstractC0599v0.B(C0658a.f8377a)};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        c5.k0 k0Var = null;
        boolean z5 = true;
        int i = 0;
        News news = null;
        AppConfig appConfig = null;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                news = (News) aVarA.j(gVar, 0, P.f8356a, news);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new UnknownFieldException(iK);
                }
                appConfig = (AppConfig) aVarA.j(gVar, 1, C0658a.f8377a, appConfig);
                i |= 2;
            }
        }
        aVarA.b(gVar);
        return new AppConfigWrapper(i, news, appConfig, k0Var);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        AppConfigWrapper appConfigWrapper = (AppConfigWrapper) obj;
        E4.k.f("value", appConfigWrapper);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        AppConfigWrapper.write$Self$app_release(appConfigWrapper, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
