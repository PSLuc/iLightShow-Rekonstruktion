package Q3;

import E4.k;
import a5.g;
import b5.c;
import b5.d;
import c5.AbstractC0476a0;
import c5.C;
import c5.C0480c0;
import c5.C0499u;
import c5.O;
import com.nanjoran.libaudiomatch.MatchResult;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4700a;
    private static final g descriptor;

    static {
        a aVar = new a();
        f4700a = aVar;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.libaudiomatch.MatchResult", aVar, 3);
        c0480c0.m("time", false);
        c0480c0.m("count", false);
        c0480c0.m("score", false);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        O o6 = O.f7407a;
        return new Y4.a[]{C0499u.f7492a, o6, o6};
    }

    @Override // Y4.a
    public final Object deserialize(c cVar) {
        g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        int i = 0;
        double dO = 0.0d;
        long jE = 0;
        long jE2 = 0;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                dO = aVarA.o(gVar, 0);
                i |= 1;
            } else if (iK == 1) {
                jE = aVarA.e(gVar, 1);
                i |= 2;
            } else {
                if (iK != 2) {
                    throw new UnknownFieldException(iK);
                }
                jE2 = aVarA.e(gVar, 2);
                i |= 4;
            }
        }
        aVarA.b(gVar);
        return new MatchResult(i, dO, jE, jE2, null);
    }

    @Override // Y4.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(d dVar, Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        k.f("value", matchResult);
        g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        MatchResult.write$Self$app_release(matchResult, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
