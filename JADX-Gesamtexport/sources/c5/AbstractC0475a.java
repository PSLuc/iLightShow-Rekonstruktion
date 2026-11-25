package c5;

import java.util.Iterator;

/* JADX INFO: renamed from: c5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0475a implements Y4.a {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // Y4.a
    public Object deserialize(b5.c cVar) {
        return e(cVar);
    }

    public final Object e(b5.c cVar) {
        Object objA = a();
        int iB = b(objA);
        b5.a aVarA = cVar.a(getDescriptor());
        while (true) {
            int iK = aVarA.k(getDescriptor());
            if (iK == -1) {
                aVarA.b(getDescriptor());
                return h(objA);
            }
            f(aVarA, iK + iB, objA);
        }
    }

    public abstract void f(b5.a aVar, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
