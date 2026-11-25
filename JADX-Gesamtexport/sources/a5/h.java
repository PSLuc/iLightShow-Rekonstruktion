package a5;

import B.AbstractC0013g0;
import L4.o;
import N3.M0;
import N3.R0;
import S1.h0;
import c5.AbstractC0476a0;
import c5.InterfaceC0490k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p058l0.I;
import p084p4.m;
import p089q4.l;
import p089q4.n;
import p089q4.x;
import p089q4.z;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g, InterfaceC0490k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f6362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f6365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f6366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g[] f6367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List[] f6368h;
    public final boolean[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f6369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g[] f6370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f6371l;

    public h(String str, h0 h0Var, int i, List list, a aVar) {
        E4.k.f("serialName", str);
        this.f6361a = str;
        this.f6362b = h0Var;
        this.f6363c = i;
        this.f6364d = aVar.f6341b;
        ArrayList arrayList = aVar.f6342c;
        E4.k.f("<this>", arrayList);
        HashSet hashSet = new HashSet(z.S(n.P(arrayList, 12)));
        l.q0(arrayList, hashSet);
        this.f6365e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f6366f = strArr;
        this.f6367g = AbstractC0476a0.c(aVar.f6344e);
        this.f6368h = (List[]) aVar.f6345f.toArray(new List[0]);
        this.i = l.p0(aVar.f6346g);
        E4.k.f("<this>", strArr);
        o oVar = new o(2, new I(3, strArr));
        ArrayList arrayList2 = new ArrayList(n.P(oVar, 10));
        Iterator it = oVar.iterator();
        while (true) {
            L4.c cVar = (L4.c) it;
            if (!cVar.i.hasNext()) {
                this.f6369j = z.W(arrayList2);
                this.f6370k = AbstractC0476a0.c(list);
                this.f6371l = G4.a.z(new R0(4, this));
                return;
            }
            x xVar = (x) cVar.next();
            arrayList2.add(new p084p4.h(xVar.f11241b, Integer.valueOf(xVar.f11240a)));
        }
    }

    @Override // a5.g
    public final int a(String str) {
        E4.k.f("name", str);
        Integer num = (Integer) this.f6369j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // a5.g
    public final String b() {
        return this.f6361a;
    }

    @Override // a5.g
    public final h0 c() {
        return this.f6362b;
    }

    @Override // a5.g
    public final List d() {
        return this.f6364d;
    }

    @Override // a5.g
    public final int e() {
        return this.f6363c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            g gVar = (g) obj;
            if (E4.k.a(this.f6361a, gVar.b()) && Arrays.equals(this.f6370k, ((h) obj).f6370k)) {
                int iE = gVar.e();
                int i = this.f6363c;
                if (i == iE) {
                    for (int i3 = 0; i3 < i; i3++) {
                        g[] gVarArr = this.f6367g;
                        if (E4.k.a(gVarArr[i3].b(), gVar.k(i3).b()) && E4.k.a(gVarArr[i3].c(), gVar.k(i3).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a5.g
    public final String f(int i) {
        return this.f6366f[i];
    }

    @Override // a5.g
    public final boolean g() {
        return false;
    }

    @Override // c5.InterfaceC0490k
    public final Set h() {
        return this.f6365e;
    }

    public final int hashCode() {
        return ((Number) this.f6371l.getValue()).intValue();
    }

    @Override // a5.g
    public final boolean i() {
        return false;
    }

    @Override // a5.g
    public final List j(int i) {
        return this.f6368h[i];
    }

    @Override // a5.g
    public final g k(int i) {
        return this.f6367g[i];
    }

    @Override // a5.g
    public final boolean l(int i) {
        return this.i[i];
    }

    public final String toString() {
        return l.e0(p081p0.c.D0(0, this.f6363c), ", ", AbstractC0013g0.m(new StringBuilder(), this.f6361a, '('), ")", new M0(4, this), 24);
    }
}
