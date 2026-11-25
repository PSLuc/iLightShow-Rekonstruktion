package m5;

import B.AbstractC0013g0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f10439d = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10442c;

    public d(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("bytes must not be null");
        }
        if (bArr.length > i) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i, "bytes length must be between 0 and ", " inclusive"));
        }
        this.f10440a = bArr;
        this.f10441b = Arrays.hashCode(bArr);
    }

    public final String a() {
        if (this.f10442c == null) {
            this.f10442c = s.a(this.f10440a);
        }
        return this.f10442c;
    }

    public final boolean b() {
        return this.f10440a.length == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f10441b != dVar.f10441b) {
            return false;
        }
        return Arrays.equals(this.f10440a, dVar.f10440a);
    }

    public final int hashCode() {
        return this.f10441b;
    }
}
