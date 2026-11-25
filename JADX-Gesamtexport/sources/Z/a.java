package Z;

import B.C0003b0;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f5930a = new d(-1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f5931b = new d(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f5932c = new StackTraceElement[0];

    public static final o a(o oVar, D4.f fVar) {
        return oVar.k(new j(fVar));
    }

    public static final o b(C0230o c0230o, o oVar) {
        if (oVar.f(k.f5956h)) {
            return oVar;
        }
        c0230o.W(1219399079);
        o oVar2 = (o) oVar.a(l.f5957a, new C0003b0(16, c0230o));
        c0230o.p(false);
        return oVar2;
    }

    public static final o c(C0230o c0230o, o oVar) {
        c0230o.V(439770924);
        o oVarB = b(c0230o, oVar);
        c0230o.p(false);
        return oVarB;
    }
}
