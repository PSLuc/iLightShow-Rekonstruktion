package G2;

import E4.k;
import androidx.lifecycle.AbstractC0446f;
import androidx.lifecycle.C0442b;
import androidx.lifecycle.C0444d;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.InterfaceC0445e;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;
import androidx.lifecycle.r;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC0457q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1684h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f1685j;

    public /* synthetic */ f(Object obj, int i, Object obj2) {
        this.f1684h = i;
        this.i = obj;
        this.f1685j = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0457q
    public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
        switch (this.f1684h) {
            case 0:
                if (enumC0453m == ((EnumC0453m) this.i)) {
                    a aVar = (a) this.f1685j;
                    if (k.a((e) aVar.f1680c.getValue(), d.f1683a)) {
                        return;
                    }
                    aVar.f1680c.setValue(aVar.a());
                    return;
                }
                return;
            case 1:
                int i = AbstractC0446f.f6989a[enumC0453m.ordinal()];
                InterfaceC0445e interfaceC0445e = (InterfaceC0445e) this.i;
                switch (i) {
                    case 1:
                        interfaceC0445e.getClass();
                        break;
                    case 2:
                        interfaceC0445e.k(interfaceC0458s);
                        break;
                    case 3:
                        interfaceC0445e.b(interfaceC0458s);
                        break;
                    case 4:
                        interfaceC0445e.getClass();
                        break;
                    case 5:
                        interfaceC0445e.o(interfaceC0458s);
                        break;
                    case 6:
                        interfaceC0445e.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0457q interfaceC0457q = (InterfaceC0457q) this.f1685j;
                if (interfaceC0457q != null) {
                    interfaceC0457q.c(interfaceC0458s, enumC0453m);
                    return;
                }
                return;
            case 2:
                if (enumC0453m == EnumC0453m.ON_START) {
                    ((C0460u) this.i).f(this);
                    ((J1.e) this.f1685j).e();
                    return;
                }
                return;
            default:
                HashMap map = ((C0442b) this.f1685j).f6982a;
                List list = (List) map.get(enumC0453m);
                r rVar = (r) this.i;
                C0442b.a(list, interfaceC0458s, enumC0453m, rVar);
                C0442b.a((List) map.get(EnumC0453m.ON_ANY), interfaceC0458s, enumC0453m, rVar);
                return;
        }
    }

    public f(InterfaceC0445e interfaceC0445e, InterfaceC0457q interfaceC0457q) {
        this.f1684h = 1;
        k.f("defaultLifecycleObserver", interfaceC0445e);
        this.i = interfaceC0445e;
        this.f1685j = interfaceC0457q;
    }

    public f(r rVar) {
        this.f1684h = 3;
        this.i = rVar;
        C0444d c0444d = C0444d.f6986c;
        Class<?> cls = rVar.getClass();
        C0442b c0442b = (C0442b) c0444d.f6987a.get(cls);
        this.f1685j = c0442b == null ? c0444d.a(cls, null) : c0442b;
    }
}
