package Z;

/* JADX INFO: loaded from: classes.dex */
public interface o {
    Object a(Object obj, D4.e eVar);

    boolean f(D4.c cVar);

    default o k(o oVar) {
        return oVar == l.f5957a ? this : new i(this, oVar);
    }
}
