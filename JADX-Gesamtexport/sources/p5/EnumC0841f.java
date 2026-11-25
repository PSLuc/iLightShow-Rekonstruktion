package p5;

/* JADX INFO: renamed from: p5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0841f {
    /* JADX INFO: Fake field, exist only in values array */
    RSA_SIGN(1, true, "RSA"),
    /* JADX INFO: Fake field, exist only in values array */
    DSS_SIGN(2, true, "DSA"),
    /* JADX INFO: Fake field, exist only in values array */
    RSA_FIXED_DH(3, false, "DH"),
    /* JADX INFO: Fake field, exist only in values array */
    DSS_FIXED_DH(4, false, "DH"),
    /* JADX INFO: Fake field, exist only in values array */
    RSA_EPHEMERAL_DH_RESERVED(5, false, "DH"),
    /* JADX INFO: Fake field, exist only in values array */
    DSS_EPHEMERAL_DH_RESERVED(6, false, "DH"),
    /* JADX INFO: Fake field, exist only in values array */
    FORTEZZA_DMS_RESERVED(20, false, "UNKNOWN"),
    ECDSA_SIGN(64, true, "EC", "EdDSA", "OID.1.3.101.112", "OID.1.3.101.113"),
    /* JADX INFO: Fake field, exist only in values array */
    RSA_FIXED_ECDH(65, false, "DH"),
    /* JADX INFO: Fake field, exist only in values array */
    ECDSA_FIXED_ECDH(66, false, "DH");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11052h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String[] f11053j;

    EnumC0841f(int i, boolean z5, String... strArr) {
        this.f11052h = i;
        this.f11053j = strArr;
        this.i = z5;
    }
}
