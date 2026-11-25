package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d0 {
    @Override // com.google.protobuf.d0
    public final boolean c(long j4, Object obj) {
        return this.f8200a.getBoolean(obj, j4);
    }

    @Override // com.google.protobuf.d0
    public final byte d(long j4, Object obj) {
        return this.f8200a.getByte(obj, j4);
    }

    @Override // com.google.protobuf.d0
    public final double e(long j4, Object obj) {
        return this.f8200a.getDouble(obj, j4);
    }

    @Override // com.google.protobuf.d0
    public final float f(long j4, Object obj) {
        return this.f8200a.getFloat(obj, j4);
    }

    @Override // com.google.protobuf.d0
    public final void k(Object obj, long j4, boolean z5) {
        this.f8200a.putBoolean(obj, j4, z5);
    }

    @Override // com.google.protobuf.d0
    public final void l(Object obj, long j4, double d6) {
        this.f8200a.putDouble(obj, j4, d6);
    }

    @Override // com.google.protobuf.d0
    public final void m(Object obj, long j4, float f6) {
        this.f8200a.putFloat(obj, j4, f6);
    }

    @Override // com.google.protobuf.d0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f8200a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            e0.a(th);
            return false;
        }
    }

    @Override // com.google.protobuf.d0
    public final boolean r() {
        Unsafe unsafe = this.f8200a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (e0.e() != null) {
                    try {
                        Class<?> cls3 = this.f8200a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        e0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                e0.a(th2);
            }
        }
        return false;
    }
}
