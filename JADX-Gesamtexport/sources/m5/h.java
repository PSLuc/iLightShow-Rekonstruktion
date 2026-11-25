package m5;

import B.AbstractC0013g0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f10448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f10449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10450c;

    public h(byte[] bArr, boolean z5) {
        this.f10448a = new g(z5 ? Arrays.copyOf(bArr, bArr.length) : bArr);
        this.f10449b = (byte) 0;
        this.f10450c = -1;
    }

    public final int a() {
        return this.f10450c + 1 + (this.f10448a.available() * 8);
    }

    public final boolean b() {
        return this.f10448a.available() > 0;
    }

    public final g c(int i) {
        if (this.f10450c > 0) {
            throw new IllegalStateException(AbstractC0013g0.l(new StringBuilder(), this.f10450c, " bits unread!"));
        }
        g gVar = this.f10448a;
        int iAvailable = gVar.available();
        if (iAvailable >= i) {
            return g.b(gVar, i);
        }
        throw new IllegalArgumentException("requested " + i + " bytes exceeds available " + iAvailable + " bytes.");
    }

    public final h d(int i) {
        return new h(c(i));
    }

    public final int e(int i) {
        if (i < 0 || i > 32) {
            throw new IllegalArgumentException("bits must be in range 0 ... 32!");
        }
        int i3 = this.f10450c;
        g gVar = this.f10448a;
        int i6 = 0;
        if (i3 < 0) {
            int i7 = 0;
            while (i6 < i) {
                int i8 = i7 << 8;
                int i9 = gVar.read();
                if (i9 < 0) {
                    throw new IllegalArgumentException("requested byte exceeds available bytes!");
                }
                i7 = i8 | i9;
                i6 += 8;
            }
            return i7;
        }
        for (int i10 = i - 1; i10 >= 0; i10--) {
            if (this.f10450c < 0) {
                int i11 = gVar.read();
                if (i11 < 0) {
                    throw new IllegalArgumentException("requested byte exceeds available bytes!");
                }
                this.f10449b = (byte) i11;
                this.f10450c = 7;
            }
            byte b6 = this.f10449b;
            int i12 = this.f10450c;
            if (((b6 >> i12) & 1) != 0) {
                i6 |= 1 << i10;
            }
            this.f10450c = i12 - 1;
        }
        return i6;
    }

    public final byte[] f(int i) {
        g gVar = this.f10448a;
        int iAvailable = gVar.available();
        if (i < 0) {
            i = iAvailable;
        } else if (i > iAvailable) {
            throw new IllegalArgumentException("requested " + i + " bytes exceeds available " + iAvailable + " bytes.");
        }
        byte[] bArr = new byte[i];
        if (this.f10450c < 0) {
            gVar.read(bArr, 0, i);
            return bArr;
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) e(8);
        }
        return bArr;
    }

    public h(byte[] bArr, int i, int i3) {
        this.f10448a = new g(bArr, i, i3);
        this.f10449b = (byte) 0;
        this.f10450c = -1;
    }

    public h(g gVar) {
        this.f10448a = gVar;
        this.f10449b = (byte) 0;
        this.f10450c = -1;
    }
}
