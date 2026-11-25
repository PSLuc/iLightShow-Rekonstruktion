package androidx.compose.ui.layout;

import D4.c;
import D4.f;
import Z.o;
import p113v0.C1034q;
import p113v0.E;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(E e6) {
        Object objI = e6.i();
        C1034q c1034q = objI instanceof C1034q ? (C1034q) objI : null;
        if (c1034q != null) {
            return c1034q.f13178u;
        }
        return null;
    }

    public static final o b(f fVar) {
        return new LayoutElement(fVar);
    }

    public static final o c(o oVar, Object obj) {
        return oVar.k(new LayoutIdElement(obj));
    }

    public static final o d(o oVar, c cVar) {
        return oVar.k(new OnGloballyPositionedElement(cVar));
    }

    public static final o e(o oVar, c cVar) {
        return oVar.k(new OnSizeChangedModifier(cVar));
    }
}
