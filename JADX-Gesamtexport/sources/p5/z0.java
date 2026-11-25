package p5;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public enum z0 {
    UNCOMPRESSED(0),
    ANSIX962_COMPRESSED_PRIME(1),
    ANSIX962_COMPRESSED_CHAR2(2);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11182h;

    z0(int i) {
        this.f11182h = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i = this.f11182h;
        if (i == 0) {
            return AbstractC0013g0.f(i, "uncompressed (", ")");
        }
        if (i != 1) {
            return i != 2 ? "" : AbstractC0013g0.f(i, "ansiX962_compressed_char2 (", ")");
        }
        return AbstractC0013g0.f(i, "ansiX962_compressed_prime (", ")");
    }
}
