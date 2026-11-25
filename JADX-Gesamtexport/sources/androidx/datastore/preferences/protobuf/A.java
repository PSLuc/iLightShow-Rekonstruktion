package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class A {
    public static InterfaceC0437w a(long j4, Object obj) {
        InterfaceC0437w interfaceC0437w = (InterfaceC0437w) i0.f6876c.h(j4, obj);
        if (((AbstractC0417b) interfaceC0437w).f6841h) {
            return interfaceC0437w;
        }
        T t6 = (T) interfaceC0437w;
        int i = t6.f6822j;
        T tG = t6.g(i == 0 ? 10 : i * 2);
        i0.o(j4, obj, tG);
        return tG;
    }
}
