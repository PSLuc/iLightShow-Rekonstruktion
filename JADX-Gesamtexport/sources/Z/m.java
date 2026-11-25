package Z;

/* JADX INFO: loaded from: classes.dex */
public interface m extends o {
    @Override // Z.o
    default Object a(Object obj, D4.e eVar) {
        return eVar.d(obj, this);
    }

    @Override // Z.o
    default boolean f(D4.c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }
}
