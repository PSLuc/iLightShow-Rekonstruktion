package C3;

import E4.k;
import a5.g;
import c5.AbstractC0476a0;
import c5.C;
import c5.C0480c0;
import c5.J;
import c5.O;
import c5.k0;
import com.nanjoran.ilightshow.Model.JSON.UsageJSON;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f626a;
    private static final g descriptor;

    static {
        e eVar = new e();
        f626a = eVar;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Model.JSON.UsageJSON", eVar, 3);
        c0480c0.m("standard", false);
        c0480c0.m("advanced", false);
        c0480c0.m("overwrite", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        O o6 = O.f7407a;
        return new Y4.a[]{o6, o6, J.f7400a};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        int i = 0;
        int iN = 0;
        long jE = 0;
        long jE2 = 0;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                jE = aVarA.e(gVar, 0);
                i |= 1;
            } else if (iK == 1) {
                jE2 = aVarA.e(gVar, 1);
                i |= 2;
            } else {
                if (iK != 2) {
                    throw new UnknownFieldException(iK);
                }
                iN = aVarA.n(gVar, 2);
                i |= 4;
            }
        }
        aVarA.b(gVar);
        return new UsageJSON(i, jE, jE2, iN, (k0) null);
    }

    @Override // Y4.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        UsageJSON usageJSON = (UsageJSON) obj;
        k.f("value", usageJSON);
        g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        UsageJSON.write$Self$app_release(usageJSON, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
