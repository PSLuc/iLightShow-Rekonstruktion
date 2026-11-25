package N3;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.nanjoran.ilightshow.Views.LightDetailsRoute;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: N3.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0287r0 implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0287r0 f4259a;
    private static final a5.g descriptor;

    static {
        C0287r0 c0287r0 = new C0287r0();
        f4259a = c0287r0;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Views.LightDetailsRoute", c0287r0, 1);
        c0480c0.m("lightId", false);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        return new Y4.a[]{c5.p0.f7477a};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        c5.k0 k0Var = null;
        boolean z5 = true;
        int i = 0;
        String strM = null;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else {
                if (iK != 0) {
                    throw new UnknownFieldException(iK);
                }
                strM = aVarA.m(gVar, 0);
                i = 1;
            }
        }
        aVarA.b(gVar);
        return new LightDetailsRoute(i, strM, k0Var);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        LightDetailsRoute lightDetailsRoute = (LightDetailsRoute) obj;
        E4.k.f("value", lightDetailsRoute);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        ((p081p0.c) bVarA).g0(gVar, 0, lightDetailsRoute.lightId);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
