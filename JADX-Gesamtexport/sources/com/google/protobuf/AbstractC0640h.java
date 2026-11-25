package com.google.protobuf;

import B.AbstractC0013g0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0640h implements Iterable, Serializable {
    public static final C0639g i = new C0639g(AbstractC0652u.f8225b);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0637e f8214j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8215h;

    static {
        f8214j = AbstractC0635c.a() ? new C0637e(1) : new C0637e(0);
    }

    public static int d(int i3, int i6, int i7) {
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

    public static C0639g g(byte[] bArr, int i3, int i6) {
        byte[] bArrCopyOfRange;
        d(i3, i3 + i6, bArr.length);
        switch (f8214j.f8201a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, i6 + i3);
                break;
            default:
                bArrCopyOfRange = new byte[i6];
                System.arraycopy(bArr, i3, bArrCopyOfRange, 0, i6);
                break;
        }
        return new C0639g(bArrCopyOfRange);
    }

    public abstract byte c(int i3);

    public final int hashCode() {
        int i3 = this.f8215h;
        if (i3 != 0) {
            return i3;
        }
        int size = size();
        C0639g c0639g = (C0639g) this;
        int iJ = c0639g.j();
        int i6 = size;
        for (int i7 = iJ; i7 < iJ + size; i7++) {
            i6 = (i6 * 31) + c0639g.f8212k[i7];
        }
        if (i6 == 0) {
            i6 = 1;
        }
        this.f8215h = i6;
        return i6;
    }

    public abstract void i(int i3, byte[] bArr);

    public abstract int size();

    public final String toString() {
        C0639g c0638f;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = p027e3.a.Z(this);
        } else {
            StringBuilder sb = new StringBuilder();
            C0639g c0639g = (C0639g) this;
            int iD = d(0, 47, c0639g.size());
            if (iD == 0) {
                c0638f = i;
            } else {
                c0638f = new C0638f(c0639g.f8212k, c0639g.j(), iD);
            }
            sb.append(p027e3.a.Z(c0638f));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return p012c.k.u(sb2, string, "\">");
    }
}
