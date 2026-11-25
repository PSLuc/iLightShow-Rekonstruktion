package androidx.compose.foundation.selection;

import B.V0;
import D4.c;
import E0.e;
import Z.l;
import Z.o;
import androidx.compose.foundation.d;
import p101t.D;
import p101t.X;
import p117w.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final o a(boolean z5, m mVar, X x6, boolean z6, e eVar, D4.a aVar) {
        if (x6 instanceof D) {
            return new SelectableElement(z5, mVar, (D) x6, z6, eVar, aVar);
        }
        if (x6 == null) {
            return new SelectableElement(z5, mVar, null, z6, eVar, aVar);
        }
        l lVar = l.f5957a;
        return mVar != null ? d.a(lVar, mVar, x6).k(new SelectableElement(z5, mVar, null, z6, eVar, aVar)) : Z.a.a(lVar, new a(x6, z5, z6, eVar, aVar));
    }

    public static o b(o oVar, boolean z5, e eVar, D4.a aVar) {
        return Z.a.a(oVar, new V0(z5, eVar, aVar, 4));
    }

    public static final o c(boolean z5, m mVar, boolean z6, e eVar, c cVar) {
        return new ToggleableElement(z5, mVar, z6, eVar, cVar);
    }
}
