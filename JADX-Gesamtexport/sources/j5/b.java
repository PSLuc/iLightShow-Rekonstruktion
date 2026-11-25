package j5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.http2.Http2;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f9726h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f9728k;

    public b(ByteArrayInputStream byteArrayInputStream) throws IOException {
        f fVar = new f();
        this.f9728k = fVar;
        this.f9726h = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        this.i = 0;
        this.f9727j = 0;
        try {
            f.a(fVar, byteArrayInputStream);
        } catch (c e6) {
            throw new IOException("Brotli decoder initialization failed", e6);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        f fVar = this.f9728k;
        int i = fVar.f9768a;
        if (i == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i == 11) {
            return;
        }
        fVar.f9768a = 11;
        a aVar = fVar.f9770c;
        ByteArrayInputStream byteArrayInputStream = aVar.f9721d;
        aVar.f9721d = null;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f9727j;
        int i3 = this.i;
        byte[] bArr = this.f9726h;
        if (i >= i3) {
            int i6 = read(bArr, 0, bArr.length);
            this.i = i6;
            this.f9727j = 0;
            if (i6 == -1) {
                return -1;
            }
        }
        int i7 = this.f9727j;
        this.f9727j = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) throws IOException {
        f fVar = this.f9728k;
        if (i < 0) {
            throw new IllegalArgumentException(k.r(i, "Bad offset: "));
        }
        if (i3 >= 0) {
            int i6 = i + i3;
            if (i6 > bArr.length) {
                StringBuilder sbV = k.v(i6, "Buffer overflow: ", " > ");
                sbV.append(bArr.length);
                throw new IllegalArgumentException(sbV.toString());
            }
            if (i3 == 0) {
                return 0;
            }
            int iMax = Math.max(this.i - this.f9727j, 0);
            if (iMax != 0) {
                iMax = Math.min(iMax, i3);
                System.arraycopy(this.f9726h, this.f9727j, bArr, i, iMax);
                this.f9727j += iMax;
                i += iMax;
                i3 -= iMax;
                if (i3 == 0) {
                    return iMax;
                }
            }
            try {
                fVar.f9767Y = bArr;
                fVar.f9762T = i;
                fVar.f9763U = i3;
                fVar.f9764V = 0;
                d.e(fVar);
                int i7 = fVar.f9764V;
                if (i7 == 0) {
                    return -1;
                }
                return i7 + iMax;
            } catch (c e6) {
                throw new IOException("Brotli stream decoding failed", e6);
            }
        }
        throw new IllegalArgumentException(k.r(i3, "Bad length: "));
    }
}
