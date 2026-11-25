package D3;

import B.AbstractC0013g0;
import S1.h0;
import X.AbstractC0391h;
import X.C0387d;
import X.o;
import X.s;
import X.y;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p089q4.q;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f813d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f818j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f822n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p084p4.h f823o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f824p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f810a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f811b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f812c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f814e = new s();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f815f = new s();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f816g = new s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f817h = new s();
    public final s i = new s();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f819k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f820l = new s();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f821m = new ArrayList();

    public static Integer c(l lVar, d dVar, Integer num, boolean z5, int i) {
        if ((i & 4) != 0) {
            z5 = false;
        }
        E4.k.f("command", dVar);
        ListIterator listIterator = lVar.i.listIterator();
        while (true) {
            y yVar = (y) listIterator;
            if (!yVar.hasNext()) {
                break;
            }
            ((j) yVar.next()).f(dVar);
        }
        s sVar = lVar.f820l;
        if (sVar.isEmpty()) {
            return null;
        }
        if (!z5) {
            if (sVar.isEmpty()) {
                return null;
            }
            if (num != null && num.intValue() >= sVar.size()) {
                return null;
            }
            if (num == null) {
                int size = (lVar.f818j + 1) % sVar.size();
                lVar.f818j = size;
                num = Integer.valueOf(size);
            }
            try {
                Iterator it = ((Iterable) sVar.get(num.intValue())).iterator();
                while (it.hasNext()) {
                    ((j) it.next()).f(dVar);
                }
            } catch (Exception unused) {
            }
            return Integer.valueOf(lVar.f818j);
        }
        ListIterator listIterator2 = lVar.f815f.listIterator();
        while (true) {
            y yVar2 = (y) listIterator2;
            if (!yVar2.hasNext()) {
                return null;
            }
            ((j) yVar2.next()).f(dVar);
        }
    }

    public static void d(l lVar, d dVar) {
        lVar.getClass();
        ListIterator listIterator = lVar.f816g.listIterator();
        while (true) {
            y yVar = (y) listIterator;
            if (!yVar.hasNext()) {
                return;
            } else {
                ((j) yVar.next()).f(dVar);
            }
        }
    }

    public final void a(j jVar) {
        String str;
        s sVar = this.f814e;
        ListIterator listIterator = sVar.listIterator();
        boolean z5 = false;
        while (true) {
            y yVar = (y) listIterator;
            if (!yVar.hasNext()) {
                break;
            }
            String str2 = ((j) yVar.next()).f799a;
            if (str2 != null && (str = jVar.f799a) != null && str2.equals(str)) {
                z5 = true;
            }
        }
        if (z5) {
            return;
        }
        sVar.add(jVar);
    }

    public final synchronized void b(ArrayList arrayList, List list, List list2, boolean z5) {
        C0387d c0387dB;
        try {
            E4.k.f("newStreamingLights", arrayList);
            E4.k.f("backlights", list);
            E4.k.f("whiteLights", list2);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            List list3 = arrayList;
            if (this.f813d) {
                list3 = this.f814e;
            }
            ListIterator listIterator = this.f814e.listIterator();
            while (true) {
                y yVar = (y) listIterator;
                if (!yVar.hasNext()) {
                    break;
                }
                j jVar = (j) yVar.next();
                if (list3.contains(jVar)) {
                    jVar.e();
                    if ((jVar instanceof M3.h) || (jVar instanceof f)) {
                        arrayList3.add(jVar);
                    } else {
                        arrayList4.add(jVar);
                    }
                }
            }
            if (arrayList4.isEmpty()) {
                arrayList3.isEmpty();
            }
            int size = arrayList4.size() > 3 ? arrayList4.size() / 2 : arrayList4.size();
            int iMax = 1;
            if (!z5) {
                iMax = Math.max(arrayList4.size() / 2, 1);
            }
            int iC = iMax + G4.a.C(Math.random() * ((double) (size - iMax)));
            this.f819k = iC;
            int i = 0;
            for (int i3 = 0; i3 < iC; i3++) {
                arrayList2.add(new ArrayList());
            }
            ArrayList arrayList5 = (ArrayList) d0.C(arrayList4);
            int size2 = arrayList5.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj = arrayList5.get(i6);
                i6++;
                ((ArrayList) arrayList2.get(i % this.f819k)).add((j) obj);
                i++;
            }
            List listS0 = p089q4.l.s0(list2);
            ArrayList arrayList6 = new ArrayList(p089q4.l.j0(arrayList4, arrayList3));
            ArrayList arrayList7 = new ArrayList();
            for (Object obj2 : list) {
                if (this.f814e.contains((j) obj2)) {
                    arrayList7.add(obj2);
                }
            }
            ArrayList arrayList8 = new ArrayList(arrayList7);
            AbstractC0391h abstractC0391hK = o.k();
            C0387d c0387d = abstractC0391hK instanceof C0387d ? (C0387d) abstractC0391hK : null;
            if (c0387d == null || (c0387dB = c0387d.B(null, null)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0391h abstractC0391hJ = c0387dB.j();
                try {
                    h0.h(this.f817h, listS0);
                    h0.h(this.i, arrayList3);
                    h0.h(this.f820l, arrayList2);
                    h0.h(this.f815f, arrayList4);
                    h0.h(this.f810a, arrayList6);
                    h0.h(this.f816g, arrayList8);
                    AbstractC0391h.p(abstractC0391hJ);
                    c0387dB.v().c();
                    c0387dB.c();
                } catch (Throwable th) {
                    AbstractC0391h.p(abstractC0391hJ);
                    throw th;
                }
            } catch (Throwable th2) {
                c0387dB.c();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void e(List list) {
        E4.k.f("availableLights", list);
        ArrayList arrayList = new ArrayList();
        s sVar = this.f814e;
        ListIterator listIterator = sVar.listIterator();
        while (true) {
            y yVar = (y) listIterator;
            if (!yVar.hasNext()) {
                sVar.removeAll(arrayList);
                q.Q(sVar, new k(0));
                return;
            }
            j jVar = (j) yVar.next();
            Iterator it = list.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                if (E4.k.a(jVar.f799a, ((j) it.next()).f799a)) {
                    z5 = true;
                }
            }
            if (!z5) {
                arrayList.add(jVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sbO = AbstractC0013g0.o("UMLightRoom{id='", this.f811b, "', name='", this.f812c, "', lights=");
        sbO.append(this.f814e);
        sbO.append("}");
        return sbO.toString();
    }
}
