package L0;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3015h;

    public a(int i) {
        this.f3015h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3015h == ((a) obj).f3015h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3015h);
    }

    public final String toString() {
        return AbstractC0013g0.k(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f3015h, ')');
    }
}
