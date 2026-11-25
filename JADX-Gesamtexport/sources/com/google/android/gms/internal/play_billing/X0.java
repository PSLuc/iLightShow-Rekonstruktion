package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends Z0 {
    @Override // com.google.android.gms.internal.play_billing.Z0
    public final double a(long j4, Object obj) {
        return Double.longBitsToDouble(this.f7928a.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.play_billing.Z0
    public final float b(long j4, Object obj) {
        return Float.intBitsToFloat(this.f7928a.getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.play_billing.Z0
    public final void c(Object obj, long j4, boolean z5) {
        if (AbstractC0550a1.f7936g) {
            AbstractC0550a1.b(obj, j4, z5 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC0550a1.c(obj, j4, z5 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Z0
    public final void d(Object obj, long j4, byte b6) {
        if (AbstractC0550a1.f7936g) {
            AbstractC0550a1.b(obj, j4, b6);
        } else {
            AbstractC0550a1.c(obj, j4, b6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Z0
    public final void e(Object obj, long j4, double d6) {
        this.f7928a.putLong(obj, j4, Double.doubleToLongBits(d6));
    }

    @Override // com.google.android.gms.internal.play_billing.Z0
    public final void f(Object obj, long j4, float f6) {
        this.f7928a.putInt(obj, j4, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.play_billing.Z0
    public final boolean g(long j4, Object obj) {
        return AbstractC0550a1.f7936g ? AbstractC0550a1.l(j4, obj) : AbstractC0550a1.m(j4, obj);
    }
}
