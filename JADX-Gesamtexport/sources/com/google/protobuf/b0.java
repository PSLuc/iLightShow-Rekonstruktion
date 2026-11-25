package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Unsafe unsafe, int i) {
        super(unsafe);
        this.f8197b = i;
    }

    @Override // com.google.protobuf.d0
    public final boolean c(long j4, Object obj) {
        switch (this.f8197b) {
            case 0:
                if (e0.f8208g) {
                    if (e0.h(j4, obj) == 0) {
                        return false;
                    }
                } else if (e0.i(j4, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (e0.f8208g) {
                    if (e0.h(j4, obj) == 0) {
                        return false;
                    }
                } else if (e0.i(j4, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.d0
    public final byte d(long j4, Object obj) {
        switch (this.f8197b) {
            case 0:
                return e0.f8208g ? e0.h(j4, obj) : e0.i(j4, obj);
            default:
                return e0.f8208g ? e0.h(j4, obj) : e0.i(j4, obj);
        }
    }

    @Override // com.google.protobuf.d0
    public final double e(long j4, Object obj) {
        switch (this.f8197b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(j4, obj));
    }

    @Override // com.google.protobuf.d0
    public final float f(long j4, Object obj) {
        switch (this.f8197b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(j4, obj));
    }

    @Override // com.google.protobuf.d0
    public final void k(Object obj, long j4, boolean z5) {
        switch (this.f8197b) {
            case 0:
                if (!e0.f8208g) {
                    e0.l(obj, j4, z5 ? (byte) 1 : (byte) 0);
                } else {
                    e0.k(obj, j4, z5 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!e0.f8208g) {
                    e0.l(obj, j4, z5 ? (byte) 1 : (byte) 0);
                } else {
                    e0.k(obj, j4, z5 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.d0
    public final void l(Object obj, long j4, double d6) {
        switch (this.f8197b) {
            case 0:
                o(obj, j4, Double.doubleToLongBits(d6));
                break;
            default:
                o(obj, j4, Double.doubleToLongBits(d6));
                break;
        }
    }

    @Override // com.google.protobuf.d0
    public final void m(Object obj, long j4, float f6) {
        switch (this.f8197b) {
            case 0:
                n(Float.floatToIntBits(f6), j4, obj);
                break;
            default:
                n(Float.floatToIntBits(f6), j4, obj);
                break;
        }
    }

    @Override // com.google.protobuf.d0
    public final boolean r() {
        switch (this.f8197b) {
        }
        return false;
    }
}
