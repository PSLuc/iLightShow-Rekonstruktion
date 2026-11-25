package N3;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Views.PaletteEditorRoute;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V0 implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V0 f4132a;
    private static final a5.g descriptor;

    static {
        V0 v6 = new V0();
        f4132a = v6;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Views.PaletteEditorRoute", v6, 1);
        c0480c0.m("paletteId", false);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        return new Y4.a[]{AbstractC0599v0.B(c5.p0.f7477a)};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        c5.k0 k0Var = null;
        boolean z5 = true;
        int i = 0;
        String str = null;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else {
                if (iK != 0) {
                    throw new UnknownFieldException(iK);
                }
                str = (String) aVarA.j(gVar, 0, c5.p0.f7477a, str);
                i = 1;
            }
        }
        aVarA.b(gVar);
        return new PaletteEditorRoute(i, str, k0Var);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        PaletteEditorRoute paletteEditorRoute = (PaletteEditorRoute) obj;
        E4.k.f("value", paletteEditorRoute);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        bVarA.n(gVar, 0, c5.p0.f7477a, paletteEditorRoute.paletteId);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
