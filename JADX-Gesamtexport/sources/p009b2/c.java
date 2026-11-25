package p009b2;

import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f7060l = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f7061h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f7062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7063k;

    public c() {
        this(500);
    }

    public final void b() {
        int length = this.i + this.f7062j.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.i = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.f7061h.add(this.f7062j);
        this.f7062j = new byte[iMax];
        this.f7063k = 0;
    }

    public final void c(int i) {
        if (this.f7063k >= this.f7062j.length) {
            b();
        }
        byte[] bArr = this.f7062j;
        int i3 = this.f7063k;
        this.f7063k = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final void k(int i) {
        int i3 = this.f7063k;
        int i6 = i3 + 2;
        byte[] bArr = this.f7062j;
        if (i6 >= bArr.length) {
            c(i >> 16);
            c(i >> 8);
            c(i);
            return;
        }
        int i7 = i3 + 1;
        this.f7063k = i7;
        bArr[i3] = (byte) (i >> 16);
        this.f7063k = i6;
        bArr[i7] = (byte) (i >> 8);
        this.f7063k = i3 + 3;
        bArr[i6] = (byte) i;
    }

    public final void o(int i) {
        int i3 = this.f7063k;
        int i6 = i3 + 1;
        byte[] bArr = this.f7062j;
        if (i6 >= bArr.length) {
            c(i >> 8);
            c(i);
        } else {
            this.f7063k = i6;
            bArr[i3] = (byte) (i >> 8);
            this.f7063k = i3 + 2;
            bArr[i6] = (byte) i;
        }
    }

    public final void s() {
        this.i = 0;
        this.f7063k = 0;
        LinkedList linkedList = this.f7061h;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.clear();
    }

    public final byte[] v() {
        int i = this.i + this.f7063k;
        if (i == 0) {
            return f7060l;
        }
        byte[] bArr = new byte[i];
        LinkedList<byte[]> linkedList = this.f7061h;
        int i3 = 0;
        for (byte[] bArr2 : linkedList) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i3, length);
            i3 += length;
        }
        System.arraycopy(this.f7062j, 0, bArr, i3, this.f7063k);
        int i6 = i3 + this.f7063k;
        if (i6 == i) {
            if (!linkedList.isEmpty()) {
                s();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i6 + " bytes");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public c(int i) {
        this.f7061h = new LinkedList();
        this.f7062j = new byte[i > 131072 ? 131072 : i];
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i3) {
        while (true) {
            int iMin = Math.min(this.f7062j.length - this.f7063k, i3);
            if (iMin > 0) {
                System.arraycopy(bArr, i, this.f7062j, this.f7063k, iMin);
                i += iMin;
                this.f7063k += iMin;
                i3 -= iMin;
            }
            if (i3 <= 0) {
                return;
            } else {
                b();
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        c(i);
    }
}
