package androidx.datastore.preferences.protobuf;

import B.AbstractC0013g0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0422g implements Iterable, Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0422g f6857j = new C0422g(AbstractC0438x.f6927b);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0420e f6858k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6859h = 0;
    public final byte[] i;

    static {
        f6858k = AbstractC0418c.a() ? new C0420e(1) : new C0420e(0);
    }

    public C0422g(byte[] bArr) {
        bArr.getClass();
        this.i = bArr;
    }

    public static int d(int i, int i3, int i6) {
        int i7 = i3 - i;
        if ((i | i3 | i7 | (i6 - i3)) >= 0) {
            return i7;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.f(i, "Beginning index: ", " < 0"));
        }
        if (i3 < i) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("Beginning index larger than ending index: ", i, i3, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0013g0.g("End index: ", i3, i6, " >= "));
    }

    public static C0422g g(byte[] bArr, int i, int i3) {
        byte[] bArrCopyOfRange;
        d(i, i + i3, bArr.length);
        switch (f6858k.f6853a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i3 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i3];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i3);
                break;
        }
        return new C0422g(bArrCopyOfRange);
    }

    public byte c(int i) {
        return this.i[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0422g) || size() != ((C0422g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0422g)) {
            return obj.equals(this);
        }
        C0422g c0422g = (C0422g) obj;
        int i = this.f6859h;
        int i3 = c0422g.f6859h;
        if (i != 0 && i3 != 0 && i != i3) {
            return false;
        }
        int size = size();
        if (size > c0422g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0422g.size()) {
            StringBuilder sbV = p012c.k.v(size, "Ran off end of other: 0, ", ", ");
            sbV.append(c0422g.size());
            throw new IllegalArgumentException(sbV.toString());
        }
        int iJ = j() + size;
        int iJ2 = j();
        int iJ3 = c0422g.j();
        while (iJ2 < iJ) {
            if (this.i[iJ2] != c0422g.i[iJ3]) {
                return false;
            }
            iJ2++;
            iJ3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f6859h;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iJ = j();
        int i3 = size;
        for (int i6 = iJ; i6 < iJ + size; i6++) {
            i3 = (i3 * 31) + this.i[i6];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.f6859h = i3;
        return i3;
    }

    public void i(int i, byte[] bArr) {
        System.arraycopy(this.i, 0, bArr, 0, i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0419d(this);
    }

    public int j() {
        return 0;
    }

    public byte k(int i) {
        return this.i[i];
    }

    public int size() {
        return this.i.length;
    }

    public final String toString() {
        C0422g c0421f;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC0473d.r(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iD = d(0, 47, size());
            if (iD == 0) {
                c0421f = f6857j;
            } else {
                c0421f = new C0421f(this.i, j(), iD);
            }
            sb.append(AbstractC0473d.r(c0421f));
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
