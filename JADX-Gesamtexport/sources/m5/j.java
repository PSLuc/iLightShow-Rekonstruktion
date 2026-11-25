package m5;

import java.io.ByteArrayOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f10451d = LoggerFactory.getLogger((Class<?>) j.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f10452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f10453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10454c;

    public j(boolean z5) {
        this.f10452a = z5 ? new i() : new ByteArrayOutputStream();
        this.f10453b = (byte) 0;
        this.f10454c = 7;
    }

    public final byte[] a() {
        d();
        ByteArrayOutputStream byteArrayOutputStream = this.f10452a;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        return byteArray;
    }

    public final void b(int i, int i3) {
        if (i3 < 32 && i >= (1 << i3)) {
            throw new IllegalArgumentException(String.format("Truncating value %d to %d-bit integer", Integer.valueOf(i), Integer.valueOf(i3)));
        }
        if (this.f10454c >= 7) {
            for (int i6 = i3 - 8; i6 >= 0; i6 -= 8) {
                this.f10452a.write((byte) (i >> i6));
            }
            return;
        }
        for (int i7 = i3 - 1; i7 >= 0; i7--) {
            if (((i >> i7) & 1) != 0) {
                this.f10453b = (byte) (this.f10453b | (1 << this.f10454c));
            }
            int i8 = this.f10454c - 1;
            this.f10454c = i8;
            if (i8 < 0) {
                d();
            }
        }
    }

    public final void c(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (!(this.f10454c < 7)) {
            this.f10452a.write(bArr, 0, bArr.length);
            return;
        }
        for (byte b6 : bArr) {
            b(b6, 8);
        }
    }

    public final void d() {
        if (this.f10454c < 7) {
            this.f10452a.write(this.f10453b);
            this.f10453b = (byte) 0;
            this.f10454c = 7;
        }
    }

    public final void e(long j4) {
        if (j4 >= 281474976710656L) {
            throw new IllegalArgumentException(String.format("Truncating value %d to %d-bit integer", Long.valueOf(j4), 48));
        }
        if (this.f10454c >= 7) {
            for (int i = 40; i >= 0; i -= 8) {
                this.f10452a.write((byte) (j4 >> i));
            }
            return;
        }
        for (int i3 = 47; i3 >= 0; i3--) {
            if (((j4 >> i3) & 1) != 0) {
                this.f10453b = (byte) (this.f10453b | (1 << this.f10454c));
            }
            int i6 = this.f10454c - 1;
            this.f10454c = i6;
            if (i6 < 0) {
                d();
            }
        }
    }

    public final String toString() {
        byte[] byteArray = this.f10452a.toByteArray();
        if (byteArray == null || byteArray.length == 0) {
            return "--";
        }
        StringBuilder sb = new StringBuilder(byteArray.length * 3);
        for (int i = 0; i < byteArray.length; i++) {
            sb.append(String.format("%02X", Integer.valueOf(byteArray[i] & 255)));
            if (i < byteArray.length - 1) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public j(int i) {
        this.f10452a = new ByteArrayOutputStream(i);
        this.f10453b = (byte) 0;
        this.f10454c = 7;
    }
}
