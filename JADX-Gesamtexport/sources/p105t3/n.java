package p105t3;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.AbstractC0610c;
import com.google.gson.internal.bind.C0609b;
import com.google.gson.internal.bind.C0625s;
import com.google.gson.internal.bind.Z;
import com.google.gson.internal.sql.c;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import p132y3.a;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Excluder f12577a = Excluder.f8026k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12578b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0958a f12579c = h.f12559h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f12580d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f12581e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f12582f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12584h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f12585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f12586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f12587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y f12588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f12589n;

    public n() {
        i iVar = m.f12567h;
        this.f12583g = 2;
        this.f12584h = 2;
        this.i = true;
        this.f12585j = m.f12567h;
        this.f12586k = true;
        this.f12587l = m.f12568j;
        this.f12588m = m.f12569k;
        this.f12589n = new ArrayDeque();
    }

    public final m a() {
        D dA;
        D dA2;
        ArrayList arrayList = this.f12581e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f12582f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z5 = c.f8145a;
        C0609b c0609b = AbstractC0610c.f8083b;
        int i = this.f12583g;
        int i3 = this.f12584h;
        if (i != 2 || i3 != 2) {
            D dA3 = c0609b.a(i, i3);
            if (z5) {
                dA = c.f8147c.a(i, i3);
                dA2 = c.f8146b.a(i, i3);
            } else {
                dA = null;
                dA2 = null;
            }
            arrayList3.add(dA3);
            if (z5) {
                arrayList3.add(dA);
                arrayList3.add(dA2);
            }
        }
        Excluder excluder = this.f12577a;
        C0958a c0958a = this.f12579c;
        HashMap map = new HashMap(this.f12580d);
        int i6 = this.f12578b;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new m(excluder, c0958a, map, this.i, this.f12585j, this.f12586k, i6, arrayList3, this.f12587l, this.f12588m, new ArrayList(this.f12589n));
    }

    public final void b(Class cls, Object obj) {
        if (cls == Object.class || r.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + cls);
        }
        ArrayList arrayList = this.f12581e;
        arrayList.add(C0625s.d(a.get((Type) cls), obj));
        if (obj instanceof C) {
            arrayList.add(Z.c(a.get((Type) cls), (C) obj));
        }
    }
}
