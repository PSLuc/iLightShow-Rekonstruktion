package p116v3;

import i5.f;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f13278p = new f(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Comparator f13279h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f13280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f13283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f13284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f13285o;

    public l(boolean z5) {
        f fVar = f13278p;
        this.f13281k = 0;
        this.f13282l = 0;
        this.f13279h = fVar;
        this.i = z5;
        this.f13283m = new k(z5);
    }

    public final k a(Object obj, boolean z5) {
        int iCompareTo;
        k kVar;
        k kVar2 = this.f13280j;
        f fVar = f13278p;
        Comparator comparator = this.f13279h;
        if (kVar2 != null) {
            Comparable comparable = comparator == fVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = kVar2.f13274m;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return kVar2;
                }
                k kVar3 = iCompareTo < 0 ? kVar2.i : kVar2.f13271j;
                if (kVar3 == null) {
                    break;
                }
                kVar2 = kVar3;
            }
        } else {
            iCompareTo = 0;
        }
        k kVar4 = kVar2;
        if (!z5) {
            return null;
        }
        k kVar5 = this.f13283m;
        if (kVar4 != null) {
            kVar = new k(this.i, kVar4, obj, kVar5, kVar5.f13273l);
            if (iCompareTo < 0) {
                kVar4.i = kVar;
            } else {
                kVar4.f13271j = kVar;
            }
            b(kVar4, true);
        } else {
            if (comparator == fVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            kVar = new k(this.i, kVar4, obj, kVar5, kVar5.f13273l);
            this.f13280j = kVar;
        }
        this.f13281k++;
        this.f13282l++;
        return kVar;
    }

    public final void b(k kVar, boolean z5) {
        while (kVar != null) {
            k kVar2 = kVar.i;
            k kVar3 = kVar.f13271j;
            int i = kVar2 != null ? kVar2.f13277p : 0;
            int i3 = kVar3 != null ? kVar3.f13277p : 0;
            int i6 = i - i3;
            if (i6 == -2) {
                k kVar4 = kVar3.i;
                k kVar5 = kVar3.f13271j;
                int i7 = (kVar4 != null ? kVar4.f13277p : 0) - (kVar5 != null ? kVar5.f13277p : 0);
                if (i7 == -1 || (i7 == 0 && !z5)) {
                    f(kVar);
                } else {
                    g(kVar3);
                    f(kVar);
                }
                if (z5) {
                    return;
                }
            } else if (i6 == 2) {
                k kVar6 = kVar2.i;
                k kVar7 = kVar2.f13271j;
                int i8 = (kVar6 != null ? kVar6.f13277p : 0) - (kVar7 != null ? kVar7.f13277p : 0);
                if (i8 == 1 || (i8 == 0 && !z5)) {
                    g(kVar);
                } else {
                    f(kVar2);
                    g(kVar);
                }
                if (z5) {
                    return;
                }
            } else if (i6 == 0) {
                kVar.f13277p = i + 1;
                if (z5) {
                    return;
                }
            } else {
                kVar.f13277p = Math.max(i, i3) + 1;
                if (!z5) {
                    return;
                }
            }
            kVar = kVar.f13270h;
        }
    }

    public final void c(k kVar, boolean z5) {
        k kVar2;
        k kVar3;
        int i;
        if (z5) {
            k kVar4 = kVar.f13273l;
            kVar4.f13272k = kVar.f13272k;
            kVar.f13272k.f13273l = kVar4;
        }
        k kVar5 = kVar.i;
        k kVar6 = kVar.f13271j;
        k kVar7 = kVar.f13270h;
        int i3 = 0;
        if (kVar5 == null || kVar6 == null) {
            if (kVar5 != null) {
                e(kVar, kVar5);
                kVar.i = null;
            } else if (kVar6 != null) {
                e(kVar, kVar6);
                kVar.f13271j = null;
            } else {
                e(kVar, null);
            }
            b(kVar7, false);
            this.f13281k--;
            this.f13282l++;
            return;
        }
        if (kVar5.f13277p > kVar6.f13277p) {
            k kVar8 = kVar5.f13271j;
            while (true) {
                k kVar9 = kVar8;
                kVar3 = kVar5;
                kVar5 = kVar9;
                if (kVar5 == null) {
                    break;
                } else {
                    kVar8 = kVar5.f13271j;
                }
            }
        } else {
            k kVar10 = kVar6.i;
            while (true) {
                kVar2 = kVar6;
                kVar6 = kVar10;
                if (kVar6 == null) {
                    break;
                } else {
                    kVar10 = kVar6.i;
                }
            }
            kVar3 = kVar2;
        }
        c(kVar3, false);
        k kVar11 = kVar.i;
        if (kVar11 != null) {
            i = kVar11.f13277p;
            kVar3.i = kVar11;
            kVar11.f13270h = kVar3;
            kVar.i = null;
        } else {
            i = 0;
        }
        k kVar12 = kVar.f13271j;
        if (kVar12 != null) {
            i3 = kVar12.f13277p;
            kVar3.f13271j = kVar12;
            kVar12.f13270h = kVar3;
            kVar.f13271j = null;
        }
        kVar3.f13277p = Math.max(i, i3) + 1;
        e(kVar, kVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f13280j = null;
        this.f13281k = 0;
        this.f13282l++;
        k kVar = this.f13283m;
        kVar.f13273l = kVar;
        kVar.f13272k = kVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        k kVarA = null;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return kVarA != null;
    }

    public final void e(k kVar, k kVar2) {
        k kVar3 = kVar.f13270h;
        kVar.f13270h = null;
        if (kVar2 != null) {
            kVar2.f13270h = kVar3;
        }
        if (kVar3 == null) {
            this.f13280j = kVar2;
        } else if (kVar3.i == kVar) {
            kVar3.i = kVar2;
        } else {
            kVar3.f13271j = kVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j jVar = this.f13284n;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 0);
        this.f13284n = jVar2;
        return jVar2;
    }

    public final void f(k kVar) {
        k kVar2 = kVar.i;
        k kVar3 = kVar.f13271j;
        k kVar4 = kVar3.i;
        k kVar5 = kVar3.f13271j;
        kVar.f13271j = kVar4;
        if (kVar4 != null) {
            kVar4.f13270h = kVar;
        }
        e(kVar, kVar3);
        kVar3.i = kVar;
        kVar.f13270h = kVar3;
        int iMax = Math.max(kVar2 != null ? kVar2.f13277p : 0, kVar4 != null ? kVar4.f13277p : 0) + 1;
        kVar.f13277p = iMax;
        kVar3.f13277p = Math.max(iMax, kVar5 != null ? kVar5.f13277p : 0) + 1;
    }

    public final void g(k kVar) {
        k kVar2 = kVar.i;
        k kVar3 = kVar.f13271j;
        k kVar4 = kVar2.i;
        k kVar5 = kVar2.f13271j;
        kVar.i = kVar5;
        if (kVar5 != null) {
            kVar5.f13270h = kVar;
        }
        e(kVar, kVar2);
        kVar2.f13271j = kVar;
        kVar.f13270h = kVar2;
        int iMax = Math.max(kVar3 != null ? kVar3.f13277p : 0, kVar5 != null ? kVar5.f13277p : 0) + 1;
        kVar.f13277p = iMax;
        kVar2.f13277p = Math.max(iMax, kVar4 != null ? kVar4.f13277p : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        k kVarA;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
                kVarA = null;
            }
        } else {
            kVarA = null;
        }
        if (kVarA != null) {
            return kVarA.f13276o;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        j jVar = this.f13285o;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f13285o = jVar2;
        return jVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.i) {
            throw new NullPointerException("value == null");
        }
        k kVarA = a(obj, true);
        Object obj3 = kVarA.f13276o;
        kVarA.f13276o = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        k kVarA;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
                kVarA = null;
            }
        } else {
            kVarA = null;
        }
        if (kVarA != null) {
            c(kVarA, true);
        }
        if (kVarA != null) {
            return kVarA.f13276o;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13281k;
    }
}
