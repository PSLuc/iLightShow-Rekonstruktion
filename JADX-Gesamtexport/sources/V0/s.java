package V0;

import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5447a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5448b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5449c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5450d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5451e = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f5447a == sVar.f5447a && this.f5448b == sVar.f5448b && this.f5449c == sVar.f5449c && this.f5450d == sVar.f5450d && this.f5451e == sVar.f5451e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5451e) + p012c.k.m(this.f5450d, (AbstractC0916i.d(this.f5449c) + p012c.k.m(this.f5448b, Boolean.hashCode(this.f5447a) * 31, 31)) * 31, 31);
    }
}
