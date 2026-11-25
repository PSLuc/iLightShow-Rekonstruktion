package androidx.compose.foundation;

import B.V0;
import Z.l;
import Z.o;
import p035g0.H;
import p035g0.M;
import p035g0.z;
import p101t.D;
import p101t.X;
import p117w.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static o a(z zVar) {
        return new BackgroundElement(0L, zVar, H.f9016a, 1);
    }

    public static final o b(o oVar, long j4, M m6) {
        return oVar.k(new BackgroundElement(j4, null, m6, 2));
    }

    public static final o d(o oVar, m mVar, X x6, boolean z5, String str, E0.e eVar, D4.a aVar) {
        o oVarK;
        if (x6 instanceof D) {
            oVarK = new ClickableElement(mVar, (D) x6, z5, str, eVar, aVar);
        } else if (x6 == null) {
            oVarK = new ClickableElement(mVar, null, z5, str, eVar, aVar);
        } else {
            l lVar = l.f5957a;
            oVarK = mVar != null ? d.a(lVar, mVar, x6).k(new ClickableElement(mVar, null, z5, str, eVar, aVar)) : Z.a.a(lVar, new b(x6, z5, str, eVar, aVar));
        }
        return oVar.k(oVarK);
    }

    public static /* synthetic */ o e(o oVar, m mVar, K.e eVar, boolean z5, E0.e eVar2, D4.a aVar, int i) {
        if ((i & 16) != 0) {
            eVar2 = null;
        }
        return d(oVar, mVar, eVar, z5, null, eVar2, aVar);
    }

    public static o f(o oVar, boolean z5, String str, D4.a aVar, int i) {
        if ((i & 1) != 0) {
            z5 = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return Z.a.a(oVar, new V0(z5, str, aVar, 2));
    }

    public static o g(o oVar, m mVar, D4.a aVar) {
        return oVar.k(new CombinedClickableElement(mVar, aVar));
    }

    public static o h(o oVar, m mVar) {
        return oVar.k(new HoverableElement(mVar));
    }
}
