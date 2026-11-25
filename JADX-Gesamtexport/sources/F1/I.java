package F1;

import B.C0043w;
import B.F0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0454n;
import androidx.lifecycle.InterfaceC0458s;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1267A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f1268B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final S4.E f1269C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f1271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f1272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f1273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Parcelable[] f1274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p089q4.j f1276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S4.P f1277h;
    public final S4.P i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final S4.z f1278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f1279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f1280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f1281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f1282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC0458s f1283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0103u f1284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f1285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EnumC0454n f1286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0099p f1287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0101s f1288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f1289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final V f1290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f1291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public E4.l f1292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public B.N f1293y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f1294z;

    public I(Context context) {
        E4.k.f("context", context);
        this.f1270a = context;
        for (Object obj : L4.l.P(context, C0085b.f1331j)) {
            if (((Context) obj) instanceof Activity) {
                this.f1271b = (Activity) obj;
                this.f1276g = new p089q4.j();
                p089q4.u uVar = p089q4.u.f11237h;
                this.f1277h = S4.F.b(uVar);
                S4.P pB = S4.F.b(uVar);
                this.i = pB;
                this.f1278j = new S4.z(pB);
                this.f1279k = new LinkedHashMap();
                this.f1280l = new LinkedHashMap();
                this.f1281m = new LinkedHashMap();
                this.f1282n = new LinkedHashMap();
                this.f1285q = new CopyOnWriteArrayList();
                this.f1286r = EnumC0454n.i;
                this.f1287s = new C0099p(0, this);
                this.f1288t = new C0101s(0, this);
                this.f1289u = true;
                V v6 = new V();
                this.f1290v = v6;
                this.f1291w = new LinkedHashMap();
                this.f1294z = new LinkedHashMap();
                v6.a(new H(v6));
                v6.a(new C0086c(this.f1270a));
                this.f1268B = new ArrayList();
                G4.a.z(new C0043w(13, this));
                this.f1269C = S4.F.a(2, 2);
            }
        }
        obj = null;
        this.f1271b = (Activity) obj;
        this.f1276g = new p089q4.j();
        p089q4.u uVar2 = p089q4.u.f11237h;
        this.f1277h = S4.F.b(uVar2);
        S4.P pB2 = S4.F.b(uVar2);
        this.i = pB2;
        this.f1278j = new S4.z(pB2);
        this.f1279k = new LinkedHashMap();
        this.f1280l = new LinkedHashMap();
        this.f1281m = new LinkedHashMap();
        this.f1282n = new LinkedHashMap();
        this.f1285q = new CopyOnWriteArrayList();
        this.f1286r = EnumC0454n.i;
        this.f1287s = new C0099p(0, this);
        this.f1288t = new C0101s(0, this);
        this.f1289u = true;
        V v7 = new V();
        this.f1290v = v7;
        this.f1291w = new LinkedHashMap();
        this.f1294z = new LinkedHashMap();
        v7.a(new H(v7));
        v7.a(new C0086c(this.f1270a));
        this.f1268B = new ArrayList();
        G4.a.z(new C0043w(13, this));
        this.f1269C = S4.F.a(2, 2);
    }

    public static B d(B b6, int i, boolean z5) {
        E e6;
        if (b6.f1247m == i) {
            return b6;
        }
        if (b6 instanceof E) {
            e6 = (E) b6;
        } else {
            e6 = b6.i;
            E4.k.c(e6);
        }
        return e6.k(i, e6, z5);
    }

    public static void k(I i, Object obj) {
        i.getClass();
        E4.k.f("route", obj);
        i.getClass();
        B bD = d(i.f(), H1.c.c(p006b.a.B(E4.x.a(obj.getClass()))), true);
        if (bD == null) {
            throw new IllegalArgumentException(("Destination with route " + E4.x.a(obj.getClass()).b() + " cannot be found in navigation graph " + i.f1272c).toString());
        }
        Map mapX = p089q4.z.X(bD.f1246l);
        LinkedHashMap linkedHashMap = new LinkedHashMap(p089q4.z.S(mapX.size()));
        for (Map.Entry entry : mapX.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C0091h) entry.getValue()).f1344a);
        }
        String strD = H1.c.d(obj, linkedHashMap);
        E4.k.f("route", strD);
        if (i.f1272c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + strD + ". Navigation graph has not been set for NavController " + i + '.').toString());
        }
        E eH = i.h(i.f1276g);
        z zVarM = eH.m(strD, true, eH);
        if (zVarM == null) {
            StringBuilder sbW = p012c.k.w("Navigation destination that matches route ", strD, " cannot be found in the navigation graph ");
            sbW.append(i.f1272c);
            throw new IllegalArgumentException(sbW.toString());
        }
        Bundle bundle = zVarM.i;
        B b6 = zVarM.f1399h;
        Bundle bundleC = b6.c(bundle);
        if (bundleC == null) {
            bundleC = new Bundle();
        }
        Intent intent = new Intent();
        int i3 = B.f1242p;
        String str = b6.f1248n;
        Uri uri = Uri.parse(str != null ? "android-app://androidx.navigation/".concat(str) : "");
        E4.k.b(uri);
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleC.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        i.j(b6, bundleC, null);
    }

    public static /* synthetic */ void o(I i, C0096m c0096m) {
        i.n(c0096m, false, new p089q4.j());
    }

    public final void a(B b6, Bundle bundle, C0096m c0096m, List list) {
        Object objPrevious;
        Object objPrevious2;
        B b7 = c0096m.i;
        boolean z5 = b7 instanceof InterfaceC0088e;
        p089q4.j jVar = this.f1276g;
        if (!z5) {
            while (!jVar.isEmpty() && (((C0096m) jVar.last()).i instanceof InterfaceC0088e) && m(((C0096m) jVar.last()).i.f1247m, true, false)) {
            }
        }
        p089q4.j<C0096m> jVar2 = new p089q4.j();
        boolean z6 = b6 instanceof E;
        Context context = this.f1270a;
        Object obj = null;
        if (z6) {
            B b8 = b7;
            do {
                E4.k.c(b8);
                b8 = b8.i;
                if (b8 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!E4.k.a(((C0096m) objPrevious2).i, b8));
                    C0096m c0096mH = (C0096m) objPrevious2;
                    if (c0096mH == null) {
                        c0096mH = W2.g.h(context, b8, bundle, g(), this.f1284p);
                    }
                    jVar2.addFirst(c0096mH);
                    if (!jVar.isEmpty() && ((C0096m) jVar.last()).i == b8) {
                        o(this, (C0096m) jVar.last());
                    }
                }
                if (b8 == null) {
                    break;
                }
            } while (b8 != b6);
        }
        B b9 = jVar2.isEmpty() ? b7 : ((C0096m) jVar2.first()).i;
        while (b9 != null && c(b9.f1247m) != b9) {
            b9 = b9.i;
            if (b9 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!E4.k.a(((C0096m) objPrevious).i, b9));
                C0096m c0096mH2 = (C0096m) objPrevious;
                if (c0096mH2 == null) {
                    c0096mH2 = W2.g.h(context, b9, b9.c(bundle2), g(), this.f1284p);
                }
                jVar2.addFirst(c0096mH2);
            }
        }
        if (!jVar2.isEmpty()) {
            b7 = ((C0096m) jVar2.first()).i;
        }
        while (!jVar.isEmpty() && (((C0096m) jVar.last()).i instanceof E)) {
            B b10 = ((C0096m) jVar.last()).i;
            E4.k.d("null cannot be cast to non-null type androidx.navigation.NavGraph", b10);
            if (((E) b10).f1259q.c(b7.f1247m) != null) {
                break;
            } else {
                o(this, (C0096m) jVar.last());
            }
        }
        C0096m c0096m2 = (C0096m) (jVar.isEmpty() ? null : jVar.i[jVar.f11233h]);
        if (c0096m2 == null) {
            c0096m2 = (C0096m) (jVar2.isEmpty() ? null : jVar2.i[jVar2.f11233h]);
        }
        if (!E4.k.a(c0096m2 != null ? c0096m2.i : null, this.f1272c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                B b11 = ((C0096m) objPrevious3).i;
                E e6 = this.f1272c;
                E4.k.c(e6);
                if (E4.k.a(b11, e6)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C0096m c0096mH3 = (C0096m) obj;
            if (c0096mH3 == null) {
                E e7 = this.f1272c;
                E4.k.c(e7);
                E e8 = this.f1272c;
                E4.k.c(e8);
                c0096mH3 = W2.g.h(context, e7, e8.c(bundle), g(), this.f1284p);
            }
            jVar2.addFirst(c0096mH3);
        }
        for (C0096m c0096m3 : jVar2) {
            Object obj2 = this.f1291w.get(this.f1290v.b(c0096m3.i.f1243h));
            if (obj2 == null) {
                throw new IllegalStateException(p012c.k.u(new StringBuilder("NavigatorBackStack for "), b6.f1243h, " should already be created").toString());
            }
            ((C0100q) obj2).a(c0096m3);
        }
        jVar.addAll(jVar2);
        jVar.addLast(c0096m);
        ArrayList arrayListK0 = p089q4.l.k0(jVar2, c0096m);
        int size = arrayListK0.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayListK0.get(i);
            i++;
            C0096m c0096m4 = (C0096m) obj3;
            E e9 = c0096m4.i.i;
            if (e9 != null) {
                i(c0096m4, e(e9.f1247m));
            }
        }
    }

    public final boolean b() {
        p089q4.j jVar;
        while (true) {
            jVar = this.f1276g;
            if (jVar.isEmpty() || !(((C0096m) jVar.last()).i instanceof E)) {
                break;
            }
            o(this, (C0096m) jVar.last());
        }
        C0096m c0096m = (C0096m) jVar.l();
        ArrayList arrayList = this.f1268B;
        if (c0096m != null) {
            arrayList.add(c0096m);
        }
        this.f1267A++;
        s();
        int i = this.f1267A - 1;
        this.f1267A = i;
        if (i == 0) {
            ArrayList arrayListU0 = p089q4.l.u0(arrayList);
            arrayList.clear();
            int size = arrayListU0.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListU0.get(i3);
                i3++;
                C0096m c0096m2 = (C0096m) obj;
                Iterator it = this.f1285q.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    B b6 = c0096m2.i;
                    c0096m2.g();
                    throw null;
                }
                this.f1269C.q(c0096m2);
            }
            ArrayList arrayListU1 = p089q4.l.u0(jVar);
            S4.P p6 = this.f1277h;
            p6.getClass();
            p6.i(null, arrayListU1);
            ArrayList arrayListP = p();
            S4.P p7 = this.i;
            p7.getClass();
            p7.i(null, arrayListP);
        }
        return c0096m != null;
    }

    public final B c(int i) {
        B b6;
        E e6 = this.f1272c;
        if (e6 == null) {
            return null;
        }
        if (e6.f1247m == i) {
            return e6;
        }
        C0096m c0096m = (C0096m) this.f1276g.l();
        if (c0096m == null || (b6 = c0096m.i) == null) {
            b6 = this.f1272c;
            E4.k.c(b6);
        }
        return d(b6, i, false);
    }

    public final C0096m e(int i) {
        Object objPrevious;
        p089q4.j jVar = this.f1276g;
        ListIterator listIterator = jVar.listIterator(jVar.c());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((C0096m) objPrevious).i.f1247m != i);
        C0096m c0096m = (C0096m) objPrevious;
        if (c0096m != null) {
            return c0096m;
        }
        StringBuilder sbV = p012c.k.v(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        C0096m c0096m2 = (C0096m) jVar.l();
        sbV.append(c0096m2 != null ? c0096m2.i : null);
        throw new IllegalArgumentException(sbV.toString().toString());
    }

    public final E f() {
        E e6 = this.f1272c;
        if (e6 == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        E4.k.d("null cannot be cast to non-null type androidx.navigation.NavGraph", e6);
        return e6;
    }

    public final EnumC0454n g() {
        return this.f1283o == null ? EnumC0454n.f6992j : this.f1286r;
    }

    public final E h(p089q4.j jVar) {
        B b6;
        C0096m c0096m = (C0096m) jVar.l();
        if (c0096m == null || (b6 = c0096m.i) == null) {
            b6 = this.f1272c;
            E4.k.c(b6);
        }
        if (b6 instanceof E) {
            return (E) b6;
        }
        E e6 = b6.i;
        E4.k.c(e6);
        return e6;
    }

    public final void i(C0096m c0096m, C0096m c0096m2) {
        this.f1279k.put(c0096m, c0096m2);
        LinkedHashMap linkedHashMap = this.f1280l;
        if (linkedHashMap.get(c0096m2) == null) {
            linkedHashMap.put(c0096m2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c0096m2);
        E4.k.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[LOOP:7: B:71:0x01b5->B:121:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100 A[LOOP:4: B:50:0x00fa->B:52:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x014e  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:66:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:70:0x019d, B:71:0x01b5, B:73:0x01bb, B:75:0x01cb, B:79:0x01d3), top: B:101:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    public final void j(B b6, Bundle bundle, K k3) {
        E4.s sVar;
        boolean z5;
        int iNextIndex;
        B b7;
        p089q4.j<C0096m> jVar;
        U uB;
        B b8;
        ReentrantLock reentrantLock;
        ListIterator listIterator;
        int iNextIndex2;
        E e6;
        int i;
        LinkedHashMap linkedHashMap = this.f1291w;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C0100q) it.next()).f1372d = true;
        }
        E4.s sVar2 = new E4.s();
        boolean zM = (k3 == null || (i = k3.f1297c) == -1) ? false : m(i, k3.f1298d, k3.f1299e);
        Bundle bundleC = b6.c(bundle);
        if (k3 != null && k3.f1296b && this.f1281m.containsKey(Integer.valueOf(b6.f1247m))) {
            sVar2.f1070h = q(b6.f1247m, bundleC, k3);
            z5 = false;
        } else {
            V v6 = this.f1290v;
            if (k3 == null || !k3.f1295a) {
                sVar = sVar2;
                z5 = false;
            } else {
                p089q4.j jVar2 = this.f1276g;
                C0096m c0096m = (C0096m) jVar2.l();
                ListIterator listIterator2 = jVar2.listIterator(jVar2.c());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        if (((C0096m) listIterator2.previous()).i == b6) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    sVar = sVar2;
                    z5 = false;
                } else if (b6 instanceof E) {
                    int i3 = E.f1258u;
                    List listR = L4.l.R(new L4.i(L4.l.P((E) b6, C0085b.f1336o), C0085b.f1334m, 2));
                    if (jVar2.f11234j - iNextIndex == listR.size()) {
                        List listSubList = jVar2.subList(iNextIndex, jVar2.f11234j);
                        ArrayList arrayList = new ArrayList(p089q4.n.P(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((C0096m) it2.next()).i.f1247m));
                        }
                        if (arrayList.equals(listR)) {
                            jVar = new p089q4.j();
                            while (p089q4.m.L(jVar2) >= iNextIndex) {
                                C0096m c0096m2 = (C0096m) p089q4.r.U(jVar2);
                                r(c0096m2);
                                C0096m c0096m3 = new C0096m(c0096m2.f1353h, c0096m2.i, c0096m2.i.c(bundle), c0096m2.f1355k, c0096m2.f1356l, c0096m2.f1357m, c0096m2.f1358n);
                                c0096m3.f1355k = c0096m2.f1355k;
                                c0096m3.h(c0096m2.f1362r);
                                jVar.addFirst(c0096m3);
                                sVar2 = sVar2;
                            }
                            sVar = sVar2;
                            for (C0096m c0096m4 : jVar) {
                                e6 = c0096m4.i.i;
                                if (e6 != null) {
                                    i(c0096m4, e(e6.f1247m));
                                }
                                jVar2.addLast(c0096m4);
                            }
                            for (C0096m c0096m5 : jVar) {
                                uB = v6.b(c0096m5.i.f1243h);
                                b8 = c0096m5.i;
                                if (b8 == null) {
                                    b8 = null;
                                }
                                if (b8 == null) {
                                    new L().f1303b = true;
                                    uB.c(b8);
                                    C0100q c0100qB = uB.b();
                                    reentrantLock = c0100qB.f1369a;
                                    reentrantLock.lock();
                                    try {
                                        ArrayList arrayListU0 = p089q4.l.u0((Collection) ((S4.P) c0100qB.f1373e.f5139h).getValue());
                                        listIterator = arrayListU0.listIterator(arrayListU0.size());
                                        while (true) {
                                            if (listIterator.hasPrevious()) {
                                                if (E4.k.a(((C0096m) listIterator.previous()).f1357m, c0096m5.f1357m)) {
                                                    iNextIndex2 = listIterator.nextIndex();
                                                    break;
                                                }
                                            } else {
                                                iNextIndex2 = -1;
                                                break;
                                            }
                                        }
                                        arrayListU0.set(iNextIndex2, c0096m5);
                                        S4.P p6 = c0100qB.f1370b;
                                        p6.getClass();
                                        p6.i(null, arrayListU0);
                                        reentrantLock.unlock();
                                    } catch (Throwable th) {
                                        reentrantLock.unlock();
                                        throw th;
                                    }
                                }
                            }
                            z5 = true;
                        }
                    }
                    sVar = sVar2;
                    z5 = false;
                } else if (c0096m == null || (b7 = c0096m.i) == null || b6.f1247m != b7.f1247m) {
                    sVar = sVar2;
                    z5 = false;
                } else {
                    jVar = new p089q4.j();
                    while (p089q4.m.L(jVar2) >= iNextIndex) {
                        C0096m c0096m6 = (C0096m) p089q4.r.U(jVar2);
                        r(c0096m6);
                        C0096m c0096m7 = new C0096m(c0096m6.f1353h, c0096m6.i, c0096m6.i.c(bundle), c0096m6.f1355k, c0096m6.f1356l, c0096m6.f1357m, c0096m6.f1358n);
                        c0096m7.f1355k = c0096m6.f1355k;
                        c0096m7.h(c0096m6.f1362r);
                        jVar.addFirst(c0096m7);
                        sVar2 = sVar2;
                    }
                    sVar = sVar2;
                    while (r1.hasNext()) {
                        e6 = c0096m4.i.i;
                        if (e6 != null) {
                            i(c0096m4, e(e6.f1247m));
                        }
                        jVar2.addLast(c0096m4);
                    }
                    while (r0.hasNext()) {
                        uB = v6.b(c0096m5.i.f1243h);
                        b8 = c0096m5.i;
                        if (b8 == null) {
                            b8 = null;
                        }
                        if (b8 == null) {
                            new L().f1303b = true;
                            uB.c(b8);
                            C0100q c0100qB2 = uB.b();
                            reentrantLock = c0100qB2.f1369a;
                            reentrantLock.lock();
                            ArrayList arrayListU1 = p089q4.l.u0((Collection) ((S4.P) c0100qB2.f1373e.f5139h).getValue());
                            listIterator = arrayListU1.listIterator(arrayListU1.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (E4.k.a(((C0096m) listIterator.previous()).f1357m, c0096m5.f1357m)) {
                                        iNextIndex2 = listIterator.nextIndex();
                                        break;
                                    }
                                } else {
                                    iNextIndex2 = -1;
                                    break;
                                }
                            }
                            arrayListU1.set(iNextIndex2, c0096m5);
                            S4.P p7 = c0100qB2.f1370b;
                            p7.getClass();
                            p7.i(null, arrayListU1);
                            reentrantLock.unlock();
                        }
                    }
                    z5 = true;
                }
            }
            if (z5) {
                sVar2 = sVar;
            } else {
                C0096m c0096mH = W2.g.h(this.f1270a, b6, bundleC, g(), this.f1284p);
                U uB2 = v6.b(b6.f1243h);
                List listV = d0.v(c0096mH);
                sVar2 = sVar;
                this.f1292x = new B.D(sVar2, this, b6, bundleC, 3);
                uB2.d(listV, k3);
                this.f1292x = null;
            }
        }
        t();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((C0100q) it3.next()).f1372d = false;
        }
        if (zM || sVar2.f1070h || z5) {
            b();
        } else {
            s();
        }
    }

    public final void l() {
        p089q4.j jVar = this.f1276g;
        if (jVar.isEmpty()) {
            return;
        }
        C0096m c0096m = (C0096m) jVar.l();
        B b6 = c0096m != null ? c0096m.i : null;
        E4.k.c(b6);
        if (m(b6.f1247m, true, false)) {
            b();
        }
    }

    public final boolean m(int i, boolean z5, boolean z6) {
        B b6;
        boolean z7;
        String str;
        p089q4.j jVar = this.f1276g;
        if (jVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = p089q4.l.m0(jVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                b6 = null;
                break;
            }
            B b7 = ((C0096m) it.next()).i;
            U uB = this.f1290v.b(b7.f1243h);
            if (z5 || b7.f1247m != i) {
                arrayList.add(uB);
            }
            if (b7.f1247m == i) {
                b6 = b7;
                break;
            }
        }
        if (b6 == null) {
            int i3 = B.f1242p;
            G4.a.v(this.f1270a, i);
            return false;
        }
        E4.s sVar = new E4.s();
        p089q4.j jVar2 = new p089q4.j();
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                z7 = z6;
                break;
            }
            int i7 = i6 + 1;
            U u6 = (U) arrayList.get(i6);
            E4.s sVar2 = new E4.s();
            C0096m c0096m = (C0096m) jVar.last();
            z7 = z6;
            this.f1293y = new B.N(sVar2, sVar, this, z7, jVar2);
            u6.e(c0096m, z7);
            this.f1293y = null;
            if (!sVar2.f1070h) {
                break;
            }
            i6 = i7;
        }
        if (z7) {
            LinkedHashMap linkedHashMap = this.f1281m;
            if (!z5) {
                L4.g gVar = new L4.g(new L4.i(L4.l.P(b6, C0085b.f1332k), new r(this, 0), 1));
                while (gVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((B) gVar.next()).f1247m);
                    C0098o c0098o = (C0098o) (jVar2.isEmpty() ? null : jVar2.i[jVar2.f11233h]);
                    linkedHashMap.put(numValueOf, c0098o != null ? c0098o.f1365h : null);
                }
            }
            if (!jVar2.isEmpty()) {
                C0098o c0098o2 = (C0098o) jVar2.first();
                L4.g gVar2 = new L4.g(new L4.i(L4.l.P(c(c0098o2.i), C0085b.f1333l), new r(this, 1), 1));
                while (true) {
                    boolean zHasNext = gVar2.hasNext();
                    str = c0098o2.f1365h;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((B) gVar2.next()).f1247m), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.f1282n.put(str, jVar2);
                }
            }
        }
        t();
        return sVar.f1070h;
    }

    public final void n(C0096m c0096m, boolean z5, p089q4.j jVar) {
        C0103u c0103u;
        S4.z zVar;
        Set set;
        p089q4.j jVar2 = this.f1276g;
        C0096m c0096m2 = (C0096m) jVar2.last();
        if (!E4.k.a(c0096m2, c0096m)) {
            throw new IllegalStateException(("Attempted to pop " + c0096m.i + ", which is not the top of the back stack (" + c0096m2.i + ')').toString());
        }
        p089q4.r.U(jVar2);
        C0100q c0100q = (C0100q) this.f1291w.get(this.f1290v.b(c0096m2.i.f1243h));
        boolean z6 = true;
        if ((c0100q == null || (zVar = c0100q.f1374f) == null || (set = (Set) ((S4.P) zVar.f5139h).getValue()) == null || !set.contains(c0096m2)) && !this.f1280l.containsKey(c0096m2)) {
            z6 = false;
        }
        EnumC0454n enumC0454n = c0096m2.f1359o.f7001c;
        EnumC0454n enumC0454n2 = EnumC0454n.f6992j;
        if (enumC0454n.compareTo(enumC0454n2) >= 0) {
            if (z5) {
                c0096m2.h(enumC0454n2);
                jVar.addFirst(new C0098o(c0096m2));
            }
            if (z6) {
                c0096m2.h(enumC0454n2);
            } else {
                c0096m2.h(EnumC0454n.f6991h);
                r(c0096m2);
            }
        }
        if (z5 || z6 || (c0103u = this.f1284p) == null) {
            return;
        }
        String str = c0096m2.f1357m;
        E4.k.f("backStackEntryId", str);
        androidx.lifecycle.U u6 = (androidx.lifecycle.U) c0103u.f1381b.remove(str);
        if (u6 != null) {
            u6.a();
        }
    }

    public final ArrayList p() {
        EnumC0454n enumC0454n;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1291w.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0454n = EnumC0454n.f6993k;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((S4.P) ((C0100q) it.next()).f1374f.f5139h).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0096m c0096m = (C0096m) obj;
                if (!arrayList.contains(c0096m) && c0096m.f1362r.compareTo(enumC0454n) < 0) {
                    arrayList2.add(obj);
                }
            }
            p089q4.r.R(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f1276g) {
            C0096m c0096m2 = (C0096m) obj2;
            if (!arrayList.contains(c0096m2) && c0096m2.f1362r.compareTo(enumC0454n) >= 0) {
                arrayList3.add(obj2);
            }
        }
        p089q4.r.R(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (!(((C0096m) obj3).i instanceof E)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, Bundle bundle, K k3) {
        B bF;
        C0096m c0096m;
        B b6;
        LinkedHashMap linkedHashMap = this.f1281m;
        int i3 = 0;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        p089q4.r.S(linkedHashMap.values(), new E0.j(str, 1));
        p089q4.j<C0098o> jVar = (p089q4.j) E4.z.c(this.f1282n).remove(str);
        ArrayList arrayList = new ArrayList();
        C0096m c0096m2 = (C0096m) this.f1276g.l();
        if (c0096m2 == null || (bF = c0096m2.i) == null) {
            bF = f();
        }
        if (jVar != null) {
            for (C0098o c0098o : jVar) {
                B bD = d(bF, c0098o.i, true);
                Context context = this.f1270a;
                if (bD == null) {
                    int i6 = B.f1242p;
                    throw new IllegalStateException(("Restore State failed: destination " + G4.a.v(context, c0098o.i) + " cannot be found from the current destination " + bF).toString());
                }
                arrayList.add(c0098o.a(context, bD, g(), this.f1284p));
                bF = bD;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (!(((C0096m) obj).i instanceof E)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i8 = 0;
        while (true) {
            String str2 = null;
            if (i8 >= size2) {
                break;
            }
            Object obj2 = arrayList3.get(i8);
            i8++;
            C0096m c0096m3 = (C0096m) obj2;
            List list = (List) p089q4.l.h0(arrayList2);
            if (list != null && (c0096m = (C0096m) p089q4.l.f0(list)) != null && (b6 = c0096m.i) != null) {
                str2 = b6.f1243h;
            }
            if (E4.k.a(str2, c0096m3.i.f1243h)) {
                list.add(c0096m3);
            } else {
                arrayList2.add(p089q4.m.N(c0096m3));
            }
        }
        E4.s sVar = new E4.s();
        int size3 = arrayList2.size();
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            List list2 = (List) obj3;
            U uB = this.f1290v.b(((C0096m) p089q4.l.X(list2)).i.f1243h);
            this.f1292x = new F0(sVar, arrayList, new E4.u(), this, bundle, 3);
            uB.d(list2, k3);
            this.f1292x = null;
        }
        return sVar.f1070h;
    }

    public final void r(C0096m c0096m) {
        E4.k.f("child", c0096m);
        C0096m c0096m2 = (C0096m) this.f1279k.remove(c0096m);
        if (c0096m2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f1280l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c0096m2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C0100q c0100q = (C0100q) this.f1291w.get(this.f1290v.b(c0096m2.i.f1243h));
            if (c0100q != null) {
                c0100q.b(c0096m2);
            }
            linkedHashMap.remove(c0096m2);
        }
    }

    public final void s() {
        AtomicInteger atomicInteger;
        S4.z zVar;
        Set set;
        ArrayList arrayListU0 = p089q4.l.u0(this.f1276g);
        if (arrayListU0.isEmpty()) {
            return;
        }
        B b6 = ((C0096m) p089q4.l.f0(arrayListU0)).i;
        ArrayList arrayList = new ArrayList();
        if (b6 instanceof InterfaceC0088e) {
            Iterator it = p089q4.l.m0(arrayListU0).iterator();
            while (it.hasNext()) {
                B b7 = ((C0096m) it.next()).i;
                arrayList.add(b7);
                if (!(b7 instanceof InterfaceC0088e) && !(b7 instanceof E)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C0096m c0096m : p089q4.l.m0(arrayListU0)) {
            EnumC0454n enumC0454n = c0096m.f1362r;
            B b8 = c0096m.i;
            EnumC0454n enumC0454n2 = EnumC0454n.f6994l;
            EnumC0454n enumC0454n3 = EnumC0454n.f6993k;
            if (b6 != null && b8.f1247m == b6.f1247m) {
                if (enumC0454n != enumC0454n2) {
                    C0100q c0100q = (C0100q) this.f1291w.get(this.f1290v.b(b8.f1243h));
                    if (E4.k.a((c0100q == null || (zVar = c0100q.f1374f) == null || (set = (Set) ((S4.P) zVar.f5139h).getValue()) == null) ? null : Boolean.valueOf(set.contains(c0096m)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f1280l.get(c0096m)) != null && atomicInteger.get() == 0)) {
                        map.put(c0096m, enumC0454n3);
                    } else {
                        map.put(c0096m, enumC0454n2);
                    }
                }
                B b9 = (B) p089q4.l.Z(arrayList);
                if (b9 != null && b9.f1247m == b8.f1247m) {
                    p089q4.r.T(arrayList);
                }
                b6 = b6.i;
            } else if (arrayList.isEmpty() || b8.f1247m != ((B) p089q4.l.X(arrayList)).f1247m) {
                c0096m.h(EnumC0454n.f6992j);
            } else {
                B b10 = (B) p089q4.r.T(arrayList);
                if (enumC0454n == enumC0454n2) {
                    c0096m.h(enumC0454n3);
                } else if (enumC0454n != enumC0454n3) {
                    map.put(c0096m, enumC0454n3);
                }
                E e6 = b10.i;
                if (e6 != null && !arrayList.contains(e6)) {
                    arrayList.add(e6);
                }
            }
        }
        int size = arrayListU0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListU0.get(i);
            i++;
            C0096m c0096m2 = (C0096m) obj;
            EnumC0454n enumC0454n4 = (EnumC0454n) map.get(c0096m2);
            if (enumC0454n4 != null) {
                c0096m2.h(enumC0454n4);
            } else {
                c0096m2.i();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [D4.a, E4.i] */
    public final void t() {
        int i;
        boolean z5 = false;
        if (this.f1289u) {
            p089q4.j jVar = this.f1276g;
            if (jVar == null || !jVar.isEmpty()) {
                Iterator it = jVar.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(((C0096m) it.next()).i instanceof E) && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i = 0;
            }
            if (i > 1) {
                z5 = true;
            }
        }
        C0101s c0101s = this.f1288t;
        c0101s.f7179a = z5;
        ?? r6 = c0101s.f7181c;
        if (r6 != 0) {
            r6.invoke();
        }
    }
}
