package F1;

import B.C0024m;
import androidx.lifecycle.EnumC0454n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: F1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0100q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f1369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S4.P f1370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S4.P f1371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S4.z f1373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S4.z f1374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U f1375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ I f1376h;

    public C0100q(I i, U u6) {
        E4.k.f("navigator", u6);
        this.f1376h = i;
        this.f1369a = new ReentrantLock(true);
        S4.P pB = S4.F.b(p089q4.u.f11237h);
        this.f1370b = pB;
        S4.P pB2 = S4.F.b(p089q4.w.f11239h);
        this.f1371c = pB2;
        this.f1373e = new S4.z(pB);
        this.f1374f = new S4.z(pB2);
        this.f1375g = u6;
    }

    public final void a(C0096m c0096m) {
        E4.k.f("backStackEntry", c0096m);
        ReentrantLock reentrantLock = this.f1369a;
        reentrantLock.lock();
        try {
            S4.P p6 = this.f1370b;
            ArrayList arrayListK0 = p089q4.l.k0((Collection) p6.getValue(), c0096m);
            p6.getClass();
            p6.i(null, arrayListK0);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    public final void b(C0096m c0096m) {
        C0103u c0103u;
        androidx.lifecycle.U u6;
        E4.k.f("entry", c0096m);
        I i = this.f1376h;
        boolean zA = E4.k.a(i.f1294z.get(c0096m), Boolean.TRUE);
        S4.P p6 = this.f1371c;
        p6.i(null, p089q4.A.V((Set) p6.getValue(), c0096m));
        i.f1294z.remove(c0096m);
        p089q4.j jVar = i.f1276g;
        boolean zContains = jVar.contains(c0096m);
        S4.P p7 = i.i;
        if (zContains) {
            if (this.f1372d) {
                return;
            }
            i.s();
            ArrayList arrayListU0 = p089q4.l.u0(jVar);
            S4.P p8 = i.f1277h;
            p8.getClass();
            p8.i(null, arrayListU0);
            ArrayList arrayListP = i.p();
            p7.getClass();
            p7.i(null, arrayListP);
            return;
        }
        i.r(c0096m);
        if (c0096m.f1359o.f7001c.compareTo(EnumC0454n.f6992j) >= 0) {
            c0096m.h(EnumC0454n.f6991h);
        }
        String str = c0096m.f1357m;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (it.hasNext()) {
                if (E4.k.a(((C0096m) it.next()).f1357m, str)) {
                }
            }
            if (!zA && (c0103u = i.f1284p) != null) {
                E4.k.f("backStackEntryId", str);
                u6 = (androidx.lifecycle.U) c0103u.f1381b.remove(str);
                if (u6 != null) {
                    u6.a();
                }
            }
        } else if (!zA) {
            E4.k.f("backStackEntryId", str);
            u6 = (androidx.lifecycle.U) c0103u.f1381b.remove(str);
            if (u6 != null) {
                u6.a();
            }
        }
        i.s();
        ArrayList arrayListP2 = i.p();
        p7.getClass();
        p7.i(null, arrayListP2);
    }

    public final void c(C0096m c0096m, boolean z5) {
        E4.k.f("popUpTo", c0096m);
        I i = this.f1376h;
        U uB = i.f1290v.b(c0096m.i.f1243h);
        i.f1294z.put(c0096m, Boolean.valueOf(z5));
        if (!uB.equals(this.f1375g)) {
            Object obj = i.f1291w.get(uB);
            E4.k.c(obj);
            ((C0100q) obj).c(c0096m, z5);
            return;
        }
        B.N n6 = i.f1293y;
        if (n6 != null) {
            n6.invoke(c0096m);
            d(c0096m);
            return;
        }
        C0024m c0024m = new C0024m(this, c0096m, z5);
        p089q4.j jVar = i.f1276g;
        int iIndexOf = jVar.indexOf(c0096m);
        if (iIndexOf < 0) {
            c0096m.toString();
            return;
        }
        int i3 = iIndexOf + 1;
        if (i3 != jVar.f11234j) {
            i.m(((C0096m) jVar.get(i3)).i.f1247m, true, false);
        }
        I.o(i, c0096m);
        c0024m.invoke();
        i.t();
        i.b();
    }

    public final void d(C0096m c0096m) {
        E4.k.f("popUpTo", c0096m);
        ReentrantLock reentrantLock = this.f1369a;
        reentrantLock.lock();
        try {
            S4.P p6 = this.f1370b;
            Iterable iterable = (Iterable) p6.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (E4.k.a((C0096m) obj, c0096m)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            p6.getClass();
            p6.i(null, arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(C0096m c0096m, boolean z5) {
        Object objPrevious;
        E4.k.f("popUpTo", c0096m);
        S4.P p6 = this.f1371c;
        Iterable iterable = (Iterable) p6.getValue();
        boolean z6 = iterable instanceof Collection;
        S4.z zVar = this.f1373e;
        if (!z6 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C0096m) it.next()) == c0096m) {
                    Iterable iterable2 = (Iterable) ((S4.P) zVar.f5139h).getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C0096m) it2.next()) == c0096m) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        p6.i(null, p089q4.A.W((Set) p6.getValue(), c0096m));
        List list = (List) ((S4.P) zVar.f5139h).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C0096m c0096m2 = (C0096m) objPrevious;
            if (!E4.k.a(c0096m2, c0096m)) {
                S4.y yVar = zVar.f5139h;
                if (((List) ((S4.P) yVar).getValue()).lastIndexOf(c0096m2) < ((List) ((S4.P) yVar).getValue()).lastIndexOf(c0096m)) {
                    break;
                }
            }
        }
        C0096m c0096m3 = (C0096m) objPrevious;
        if (c0096m3 != null) {
            p6.i(null, p089q4.A.W((Set) p6.getValue(), c0096m3));
        }
        c(c0096m, z5);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [D4.c, E4.l] */
    public final void f(C0096m c0096m) {
        E4.k.f("backStackEntry", c0096m);
        I i = this.f1376h;
        U uB = i.f1290v.b(c0096m.i.f1243h);
        if (!uB.equals(this.f1375g)) {
            Object obj = i.f1291w.get(uB);
            if (obj == null) {
                throw new IllegalStateException(p012c.k.u(new StringBuilder("NavigatorBackStack for "), c0096m.i.f1243h, " should already be created").toString());
            }
            ((C0100q) obj).f(c0096m);
            return;
        }
        ?? r6 = i.f1292x;
        if (r6 == 0) {
            Objects.toString(c0096m.i);
        } else {
            r6.invoke(c0096m);
            a(c0096m);
        }
    }
}
