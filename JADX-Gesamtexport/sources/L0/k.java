package L0;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {
    public static final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f3025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f3026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k f3027l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3028h;

    static {
        k kVar = new k(100);
        k kVar2 = new k(200);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        i = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f3025j = kVar4;
        f3026k = kVar5;
        f3027l = kVar7;
        p089q4.m.M(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i3) {
        this.f3028h = i3;
        if (1 > i3 || i3 >= 1001) {
            throw new IllegalArgumentException(p012c.k.r(i3, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return E4.k.h(this.f3028h, ((k) obj).f3028h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f3028h == ((k) obj).f3028h;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3028h;
    }

    public final String toString() {
        return AbstractC0013g0.k(new StringBuilder("FontWeight(weight="), this.f3028h, ')');
    }
}
