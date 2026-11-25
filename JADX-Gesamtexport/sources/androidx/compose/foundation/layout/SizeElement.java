package androidx.compose.foundation.layout;

import S0.e;
import Z.n;
import p012c.k;
import p123x.W;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f6625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6627e;

    public SizeElement(float f6, float f7, float f8, float f9, boolean z5) {
        this.f6623a = f6;
        this.f6624b = f7;
        this.f6625c = f8;
        this.f6626d = f9;
        this.f6627e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return e.a(this.f6623a, sizeElement.f6623a) && e.a(this.f6624b, sizeElement.f6624b) && e.a(this.f6625c, sizeElement.f6625c) && e.a(this.f6626d, sizeElement.f6626d) && this.f6627e == sizeElement.f6627e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6627e) + k.i(this.f6626d, k.i(this.f6625c, k.i(this.f6624b, Float.hashCode(this.f6623a) * 31, 31), 31), 31);
    }

    @Override // p124x0.Q
    public final n l() {
        W w6 = new W();
        w6.f13720u = this.f6623a;
        w6.f13721v = this.f6624b;
        w6.f13722w = this.f6625c;
        w6.f13723x = this.f6626d;
        w6.f13724y = this.f6627e;
        return w6;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        W w6 = (W) nVar;
        w6.f13720u = this.f6623a;
        w6.f13721v = this.f6624b;
        w6.f13722w = this.f6625c;
        w6.f13723x = this.f6626d;
        w6.f13724y = this.f6627e;
    }

    public /* synthetic */ SizeElement(float f6, float f7, float f8, float f9, int i) {
        this((i & 1) != 0 ? Float.NaN : f6, (i & 2) != 0 ? Float.NaN : f7, (i & 4) != 0 ? Float.NaN : f8, (i & 8) != 0 ? Float.NaN : f9, true);
    }
}
