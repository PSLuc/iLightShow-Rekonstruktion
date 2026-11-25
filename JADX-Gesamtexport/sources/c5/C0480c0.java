package c5;

import N3.M0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: c5.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0480c0 implements a5.g, InterfaceC0490k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f7434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7436d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f7437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f7438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f7439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f7440h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f7441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f7442k;

    public C0480c0(String str, C c6, int i) {
        this.f7433a = str;
        this.f7434b = c6;
        this.f7435c = i;
        String[] strArr = new String[i];
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.f7437e = strArr;
        int i6 = this.f7435c;
        this.f7438f = new List[i6];
        this.f7439g = new boolean[i6];
        this.f7440h = p089q4.v.f11238h;
        p084p4.g gVar = p084p4.g.f10847h;
        final int i7 = 0;
        this.i = G4.a.y(gVar, new D4.a(this) { // from class: c5.b0
            public final /* synthetic */ C0480c0 i;

            {
                this.i = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, p4.f] */
            @Override // D4.a
            public final Object invoke() {
                Y4.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                Y4.a[] aVarArrTypeParametersSerializers;
                switch (i7) {
                    case 0:
                        C c7 = this.i.f7434b;
                        return (c7 == null || (aVarArrChildSerializers = c7.childSerializers()) == null) ? AbstractC0476a0.f7427b : aVarArrChildSerializers;
                    case 1:
                        C c8 = this.i.f7434b;
                        if (c8 == null || (aVarArrTypeParametersSerializers = c8.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (Y4.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return AbstractC0476a0.c(arrayList);
                    default:
                        C0480c0 c0480c0 = this.i;
                        return Integer.valueOf(AbstractC0476a0.e(c0480c0, (a5.g[]) c0480c0.f7441j.getValue()));
                }
            }
        });
        final int i8 = 1;
        this.f7441j = G4.a.y(gVar, new D4.a(this) { // from class: c5.b0
            public final /* synthetic */ C0480c0 i;

            {
                this.i = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, p4.f] */
            @Override // D4.a
            public final Object invoke() {
                Y4.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                Y4.a[] aVarArrTypeParametersSerializers;
                switch (i8) {
                    case 0:
                        C c7 = this.i.f7434b;
                        return (c7 == null || (aVarArrChildSerializers = c7.childSerializers()) == null) ? AbstractC0476a0.f7427b : aVarArrChildSerializers;
                    case 1:
                        C c8 = this.i.f7434b;
                        if (c8 == null || (aVarArrTypeParametersSerializers = c8.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (Y4.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return AbstractC0476a0.c(arrayList);
                    default:
                        C0480c0 c0480c0 = this.i;
                        return Integer.valueOf(AbstractC0476a0.e(c0480c0, (a5.g[]) c0480c0.f7441j.getValue()));
                }
            }
        });
        final int i9 = 2;
        this.f7442k = G4.a.y(gVar, new D4.a(this) { // from class: c5.b0
            public final /* synthetic */ C0480c0 i;

            {
                this.i = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, p4.f] */
            @Override // D4.a
            public final Object invoke() {
                Y4.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                Y4.a[] aVarArrTypeParametersSerializers;
                switch (i9) {
                    case 0:
                        C c7 = this.i.f7434b;
                        return (c7 == null || (aVarArrChildSerializers = c7.childSerializers()) == null) ? AbstractC0476a0.f7427b : aVarArrChildSerializers;
                    case 1:
                        C c8 = this.i.f7434b;
                        if (c8 == null || (aVarArrTypeParametersSerializers = c8.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (Y4.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return AbstractC0476a0.c(arrayList);
                    default:
                        C0480c0 c0480c0 = this.i;
                        return Integer.valueOf(AbstractC0476a0.e(c0480c0, (a5.g[]) c0480c0.f7441j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // a5.g
    public final int a(String str) {
        E4.k.f("name", str);
        Integer num = (Integer) this.f7440h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // a5.g
    public final String b() {
        return this.f7433a;
    }

    @Override // a5.g
    public S1.h0 c() {
        return a5.j.f6374j;
    }

    @Override // a5.g
    public final List d() {
        return p089q4.u.f11237h;
    }

    @Override // a5.g
    public final int e() {
        return this.f7435c;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, p4.f] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0480c0) {
            a5.g gVar = (a5.g) obj;
            if (this.f7433a.equals(gVar.b()) && Arrays.equals((a5.g[]) this.f7441j.getValue(), (a5.g[]) ((C0480c0) obj).f7441j.getValue())) {
                int iE = gVar.e();
                int i = this.f7435c;
                if (i == iE) {
                    for (int i3 = 0; i3 < i; i3++) {
                        if (E4.k.a(k(i3).b(), gVar.k(i3).b()) && E4.k.a(k(i3).c(), gVar.k(i3).c())) {
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
        return this.f7437e[i];
    }

    @Override // a5.g
    public boolean g() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // c5.InterfaceC0490k
    public final Set h() {
        return this.f7440h.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p4.f] */
    public int hashCode() {
        return ((Number) this.f7442k.getValue()).intValue();
    }

    @Override // a5.g
    public final boolean i() {
        return false;
    }

    @Override // a5.g
    public final List j(int i) {
        List list = this.f7438f[i];
        return list == null ? p089q4.u.f11237h : list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p4.f] */
    @Override // a5.g
    public a5.g k(int i) {
        return ((Y4.a[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // a5.g
    public final boolean l(int i) {
        return this.f7439g[i];
    }

    public final void m(String str, boolean z5) {
        E4.k.f("name", str);
        int i = this.f7436d + 1;
        this.f7436d = i;
        String[] strArr = this.f7437e;
        strArr[i] = str;
        this.f7439g[i] = z5;
        this.f7438f[i] = null;
        if (i == this.f7435c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                map.put(strArr[i3], Integer.valueOf(i3));
            }
            this.f7440h = map;
        }
    }

    public String toString() {
        return p089q4.l.e0(p081p0.c.D0(0, this.f7435c), ", ", this.f7433a.concat("("), ")", new M0(6, this), 24);
    }
}
