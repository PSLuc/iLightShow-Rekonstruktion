package h5;

import B.AbstractC0013g0;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: renamed from: h5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0730h implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0732j f9344h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H f9345j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f9347l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9346k = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9348m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9349n = -1;

    public final void b(long j4) {
        C0732j c0732j = this.f9344h;
        if (c0732j == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.i) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j6 = c0732j.i;
        if (j4 <= j6) {
            if (j4 < 0) {
                throw new IllegalArgumentException(AbstractC0013g0.h("newSize < 0: ", j4).toString());
            }
            long j7 = j6 - j4;
            while (j7 > 0) {
                H h6 = c0732j.f9351h;
                E4.k.c(h6);
                H h7 = h6.f9327g;
                E4.k.c(h7);
                int i = h7.f9323c;
                long j8 = i - h7.f9322b;
                if (j8 > j7) {
                    h7.f9323c = i - ((int) j7);
                    break;
                } else {
                    c0732j.f9351h = h7.a();
                    I.a(h7);
                    j7 -= j8;
                }
            }
            this.f9345j = null;
            this.f9346k = j4;
            this.f9347l = null;
            this.f9348m = -1;
            this.f9349n = -1;
        } else if (j4 > j6) {
            long j9 = j4 - j6;
            int i3 = 1;
            boolean z5 = true;
            for (long j10 = 0; j9 > j10; j10 = 0) {
                H hT = c0732j.T(i3);
                int iMin = (int) Math.min(j9, 8192 - hT.f9323c);
                int i6 = hT.f9323c + iMin;
                hT.f9323c = i6;
                j9 -= (long) iMin;
                if (z5) {
                    this.f9345j = hT;
                    this.f9346k = j6;
                    this.f9347l = hT.f9321a;
                    this.f9348m = i6 - iMin;
                    this.f9349n = i6;
                    z5 = false;
                }
                i3 = 1;
            }
        }
        c0732j.i = j4;
    }

    public final int c(long j4) {
        C0732j c0732j = this.f9344h;
        if (c0732j == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j4 >= -1) {
            long j6 = c0732j.i;
            if (j4 <= j6) {
                if (j4 == -1 || j4 == j6) {
                    this.f9345j = null;
                    this.f9346k = j4;
                    this.f9347l = null;
                    this.f9348m = -1;
                    this.f9349n = -1;
                    return -1;
                }
                H h6 = c0732j.f9351h;
                H h7 = this.f9345j;
                long j7 = 0;
                if (h7 != null) {
                    long j8 = this.f9346k - ((long) (this.f9348m - h7.f9322b));
                    if (j8 > j4) {
                        h7 = h6;
                        h6 = h7;
                        j6 = j8;
                    } else {
                        j7 = j8;
                    }
                } else {
                    h7 = h6;
                }
                if (j6 - j4 > j4 - j7) {
                    while (true) {
                        E4.k.c(h7);
                        long j9 = ((long) (h7.f9323c - h7.f9322b)) + j7;
                        if (j4 < j9) {
                            break;
                        }
                        h7 = h7.f9326f;
                        j7 = j9;
                    }
                } else {
                    while (j6 > j4) {
                        E4.k.c(h6);
                        h6 = h6.f9327g;
                        E4.k.c(h6);
                        j6 -= (long) (h6.f9323c - h6.f9322b);
                    }
                    h7 = h6;
                    j7 = j6;
                }
                if (this.i) {
                    E4.k.c(h7);
                    if (h7.f9324d) {
                        byte[] bArr = h7.f9321a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        E4.k.e("copyOf(this, size)", bArrCopyOf);
                        H h8 = new H(bArrCopyOf, h7.f9322b, h7.f9323c, false, true);
                        if (c0732j.f9351h == h7) {
                            c0732j.f9351h = h8;
                        }
                        h7.b(h8);
                        H h9 = h8.f9327g;
                        E4.k.c(h9);
                        h9.a();
                        h7 = h8;
                    }
                }
                this.f9345j = h7;
                this.f9346k = j4;
                E4.k.c(h7);
                this.f9347l = h7.f9321a;
                int i = h7.f9322b + ((int) (j4 - j7));
                this.f9348m = i;
                int i3 = h7.f9323c;
                this.f9349n = i3;
                return i3 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j4 + " > size=" + c0732j.i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9344h == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f9344h = null;
        this.f9345j = null;
        this.f9346k = -1L;
        this.f9347l = null;
        this.f9348m = -1;
        this.f9349n = -1;
    }
}
