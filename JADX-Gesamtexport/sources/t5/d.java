package t5;

import java.nio.charset.Charset;
import java.util.Arrays;
import m5.r;
import m5.s;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f12599d = r.f10491b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f12601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12602c;

    public d(int i, byte[] bArr) {
        if (i == 0) {
            throw new NullPointerException("Name type must be provided!");
        }
        this.f12600a = i;
        this.f12601b = bArr;
        this.f12602c = AbstractC0916i.d(i) + (Arrays.hashCode(bArr) * 31);
    }

    public static d a(int i, byte[] bArr) {
        if (i == 0) {
            throw new NullPointerException("type must not be null");
        }
        if (bArr == null) {
            throw new NullPointerException("name must not be null");
        }
        if (i != 1) {
            return new d(i, bArr);
        }
        Charset charset = f12599d;
        String str = new String(bArr, charset);
        if (s.f10492a.matcher(str).matches()) {
            return new d(1, str.toLowerCase().getBytes(charset));
        }
        throw new IllegalArgumentException("not a valid host name");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Arrays.equals(this.f12601b, dVar.f12601b) && this.f12600a == dVar.f12600a;
    }

    public final int hashCode() {
        return this.f12602c;
    }
}
