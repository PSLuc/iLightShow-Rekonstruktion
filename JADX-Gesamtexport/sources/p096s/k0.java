package p096s;

/* JADX INFO: loaded from: classes.dex */
public interface k0 {
    default boolean a(Enum r6, Enum r7) {
        return r6.equals(b()) && r7.equals(c());
    }

    Object b();

    Object c();
}
