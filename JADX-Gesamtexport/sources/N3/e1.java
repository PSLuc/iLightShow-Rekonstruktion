package N3;

import c5.AbstractC0476a0;
import c5.C0480c0;
import c5.C0485f;
import com.nanjoran.ilightshow.Views.PaywallViewRoute;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f4170a;
    private static final a5.g descriptor;

    static {
        e1 e1Var = new e1();
        f4170a = e1Var;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Views.PaywallViewRoute", e1Var, 2);
        c0480c0.m("welcomeMode", true);
        c0480c0.m("showQuotasReached", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        C0485f c0485f = C0485f.f7447a;
        return new Y4.a[]{c0485f, c0485f};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        boolean z5 = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
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
                zU2 = aVarA.u(gVar, 1);
                i |= 2;
            }
        }
        aVarA.b(gVar);
        return new PaywallViewRoute(i, zU, zU2, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        PaywallViewRoute paywallViewRoute = (PaywallViewRoute) obj;
        E4.k.f("value", paywallViewRoute);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        PaywallViewRoute.write$Self$app_release(paywallViewRoute, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
