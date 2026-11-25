package L2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I2.b f3074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3075b;

    public l(I2.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f3074a = bVar;
        this.f3075b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f3074a.equals(lVar.f3074a)) {
            return Arrays.equals(this.f3075b, lVar.f3075b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3075b) ^ ((this.f3074a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f3074a + ", bytes=[...]}";
    }
}
