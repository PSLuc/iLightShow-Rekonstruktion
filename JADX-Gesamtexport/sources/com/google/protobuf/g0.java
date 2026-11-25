package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G4.a f8213a;

    static {
        f8213a = (e0.f8206e && e0.f8205d && !AbstractC0635c.a()) ? new f0(1) : new f0(0);
    }

    public static int a(byte[] bArr, int i, int i3) {
        byte b6 = bArr[i - 1];
        int i6 = i3 - i;
        if (i6 == 0) {
            if (b6 > -12) {
                return -1;
            }
            return b6;
        }
        if (i6 == 1) {
            return b(b6, bArr[i]);
        }
        if (i6 == 2) {
            return c(b6, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int b(int i, int i3) {
        if (i > -12 || i3 > -65) {
            return -1;
        }
        return i ^ (i3 << 8);
    }

    public static int c(int i, int i3, int i6) {
        if (i > -12 || i3 > -65 || i6 > -65) {
            return -1;
        }
        return (i ^ (i3 << 8)) ^ (i6 << 16);
    }
}
