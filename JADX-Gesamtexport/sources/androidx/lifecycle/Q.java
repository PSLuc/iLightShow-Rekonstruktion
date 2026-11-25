package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface Q {
    default O a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default O b(E4.f fVar, C1.c cVar) {
        return c(p020d2.n.s(fVar), cVar);
    }

    default O c(Class cls, C1.c cVar) {
        return a(cls);
    }
}
