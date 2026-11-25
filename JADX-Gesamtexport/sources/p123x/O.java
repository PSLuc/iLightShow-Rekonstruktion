package p123x;

import S0.e;
import S0.k;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13711d;

    public O(float f6, float f7, float f8, float f9) {
        this.f13708a = f6;
        this.f13709b = f7;
        this.f13710c = f8;
        this.f13711d = f9;
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f8 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f9 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    public final float a() {
        return this.f13711d;
    }

    public final float b(k kVar) {
        return kVar == k.f4897h ? this.f13708a : this.f13710c;
    }

    public final float c(k kVar) {
        return kVar == k.f4897h ? this.f13710c : this.f13708a;
    }

    public final float d() {
        return this.f13709b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o6 = (O) obj;
        return e.a(this.f13708a, o6.f13708a) && e.a(this.f13709b, o6.f13709b) && e.a(this.f13710c, o6.f13710c) && e.a(this.f13711d, o6.f13711d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13711d) + p012c.k.i(this.f13710c, p012c.k.i(this.f13709b, Float.hashCode(this.f13708a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) e.b(this.f13708a)) + ", top=" + ((Object) e.b(this.f13709b)) + ", end=" + ((Object) e.b(this.f13710c)) + ", bottom=" + ((Object) e.b(this.f13711d)) + ')';
    }
}
