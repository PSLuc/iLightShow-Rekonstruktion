package p116v3;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Map.Entry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f13270h;
    public k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f13271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f13272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f13273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f13274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f13275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f13276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13277p;

    public k(boolean z5) {
        this.f13274m = null;
        this.f13275n = z5;
        this.f13273l = this;
        this.f13272k = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f13274m;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f13276o;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13274m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13276o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f13274m;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f13276o;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f13275n) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f13276o;
        this.f13276o = obj;
        return obj2;
    }

    public final String toString() {
        return this.f13274m + "=" + this.f13276o;
    }

    public k(boolean z5, k kVar, Object obj, k kVar2, k kVar3) {
        this.f13270h = kVar;
        this.f13274m = obj;
        this.f13275n = z5;
        this.f13277p = 1;
        this.f13272k = kVar2;
        this.f13273l = kVar3;
        kVar3.f13272k = this;
        kVar2.f13273l = this;
    }
}
