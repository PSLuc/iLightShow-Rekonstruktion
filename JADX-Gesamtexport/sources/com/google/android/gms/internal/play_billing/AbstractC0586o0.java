package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;
import androidx.datastore.preferences.protobuf.C0419d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0586o0 implements Iterable, Serializable {
    public static final C0588p0 i = new C0588p0(D0.f7818b);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7981h = 0;

    static {
        int i3 = AbstractC0578k0.f7955a;
    }

    public static int m(int i3, int i6, int i7) {
        int i8 = i6 - i3;
        if ((i3 | i6 | i8 | (i7 - i6)) >= 0) {
            return i8;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.f(i3, "Beginning index: ", " < 0"));
        }
        if (i6 < i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("Beginning index larger than ending index: ", i3, i6, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0013g0.g("End index: ", i6, i7, " >= "));
    }

    public static C0588p0 n(byte[] bArr, int i3, int i6) {
        try {
            m(i3, i3 + i6, bArr.length);
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            return new C0588p0(bArr2);
        } catch (zzfo e6) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e6);
        }
    }

    public static /* bridge */ /* synthetic */ boolean o(int i3, int i6, int i7, byte[] bArr, byte[] bArr2) {
        int i8 = i3 + i7;
        m(i3, i8, bArr.length);
        m(i6, i7 + i6, bArr2.length);
        while (i3 < i8) {
            if (bArr[i3] != bArr2[i6]) {
                return false;
            }
            i3++;
            i6++;
        }
        return true;
    }

    public abstract byte c(int i3);

    public abstract byte d(int i3);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0586o0)) {
            return false;
        }
        AbstractC0586o0 abstractC0586o0 = (AbstractC0586o0) obj;
        int i3 = i();
        if (i3 != abstractC0586o0.i()) {
            return false;
        }
        if (i3 == 0) {
            return true;
        }
        int i6 = this.f7981h;
        int i7 = abstractC0586o0.f7981h;
        if (i6 == 0 || i7 == 0 || i6 == i7) {
            return l(abstractC0586o0);
        }
        return false;
    }

    public abstract int g(int i3, int i6);

    public final int hashCode() {
        int iG = this.f7981h;
        if (iG == 0) {
            int i3 = i();
            iG = g(i3, i3);
            if (iG == 0) {
                iG = 1;
            }
            this.f7981h = iG;
        }
        return iG;
    }

    public abstract int i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0419d(this);
    }

    public abstract AbstractC0586o0 j(int i3, int i6);

    public abstract void k(C0590q0 c0590q0);

    public abstract boolean l(AbstractC0586o0 abstractC0586o0);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i3 = i();
        String strB = i() <= 50 ? S1.h0.B(this) : S1.h0.B(j(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(i3);
        sb.append(" contents=\"");
        return p012c.k.u(sb, strB, "\">");
    }
}
