package F1;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0100q f1327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1328b;

    public abstract B a();

    public final C0100q b() {
        C0100q c0100q = this.f1327a;
        if (c0100q != null) {
            return c0100q;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public B c(B b6) {
        return b6;
    }

    public void d(List list, K k3) {
        L4.g gVar = new L4.g(new B4.b(1, new L4.i(new B4.b(4, list), new A2.e(this, 9, k3), 2)));
        while (gVar.hasNext()) {
            b().f((C0096m) gVar.next());
        }
    }

    public void e(C0096m c0096m, boolean z5) {
        E4.k.f("popUpTo", c0096m);
        List list = (List) ((S4.P) b().f1373e.f5139h).getValue();
        if (!list.contains(c0096m)) {
            throw new IllegalStateException(("popBackStack was called with " + c0096m + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0096m c0096m2 = null;
        while (f()) {
            c0096m2 = (C0096m) listIterator.previous();
            if (E4.k.a(c0096m2, c0096m)) {
                break;
            }
        }
        if (c0096m2 != null) {
            b().c(c0096m2, z5);
        }
    }

    public boolean f() {
        return true;
    }
}
