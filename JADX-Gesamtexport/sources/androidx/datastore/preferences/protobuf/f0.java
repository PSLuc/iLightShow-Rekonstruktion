package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6856b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Unsafe unsafe, int i) {
        super(unsafe);
        this.f6856b = i;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean c(long j4, Object obj) {
        switch (this.f6856b) {
            case 0:
                return i0.f6880g ? i0.b(j4, obj) : i0.c(j4, obj);
            default:
                return i0.f6880g ? i0.b(j4, obj) : i0.c(j4, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final double d(long j4, Object obj) {
        switch (this.f6856b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(g(j4, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final float e(long j4, Object obj) {
        switch (this.f6856b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(f(j4, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj, long j4, boolean z5) {
        switch (this.f6856b) {
            case 0:
                if (!i0.f6880g) {
                    i0.l(obj, j4, z5 ? (byte) 1 : (byte) 0);
                } else {
                    i0.k(obj, j4, z5 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!i0.f6880g) {
                    i0.l(obj, j4, z5 ? (byte) 1 : (byte) 0);
                } else {
                    i0.k(obj, j4, z5 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void k(Object obj, long j4, byte b6) {
        switch (this.f6856b) {
            case 0:
                if (!i0.f6880g) {
                    i0.l(obj, j4, b6);
                } else {
                    i0.k(obj, j4, b6);
                }
                break;
            default:
                if (!i0.f6880g) {
                    i0.l(obj, j4, b6);
                } else {
                    i0.k(obj, j4, b6);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void l(Object obj, long j4, double d6) {
        switch (this.f6856b) {
            case 0:
                o(obj, j4, Double.doubleToLongBits(d6));
                break;
            default:
                o(obj, j4, Double.doubleToLongBits(d6));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void m(Object obj, long j4, float f6) {
        switch (this.f6856b) {
            case 0:
                n(Float.floatToIntBits(f6), j4, obj);
                break;
            default:
                n(Float.floatToIntBits(f6), j4, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean r() {
        switch (this.f6856b) {
        }
        return false;
    }
}
