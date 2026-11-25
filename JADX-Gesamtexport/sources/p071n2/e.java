package p071n2;

import S1.T;
import T1.k;
import p003a2.a;
import p009b2.o;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public abstract e a(InterfaceC0472c interfaceC0472c);

    public abstract String b();

    public abstract T c();

    public final a d(k kVar, Object obj) {
        a aVar = new a(kVar, obj);
        int iOrdinal = c().ordinal();
        if (iOrdinal == 0) {
            aVar.f6161e = 3;
            aVar.f6160d = b();
            return aVar;
        }
        if (iOrdinal == 1) {
            aVar.f6161e = 2;
            return aVar;
        }
        if (iOrdinal == 2) {
            aVar.f6161e = 1;
            return aVar;
        }
        if (iOrdinal == 3) {
            aVar.f6161e = 5;
            aVar.f6160d = b();
            return aVar;
        }
        if (iOrdinal != 4) {
            o.a();
            throw null;
        }
        aVar.f6161e = 4;
        aVar.f6160d = b();
        return aVar;
    }

    public abstract a e(T1.e eVar, a aVar);

    public abstract a f(T1.e eVar, a aVar);
}
