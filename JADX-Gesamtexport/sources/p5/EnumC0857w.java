package p5;

/* JADX INFO: renamed from: p5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0857w {
    CHANGE_CIPHER_SPEC(20),
    ALERT(21),
    HANDSHAKE(22),
    APPLICATION_DATA(23),
    TLS12_CID(25);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11165h;

    EnumC0857w(int i) {
        this.f11165h = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (this.f11165h) {
            case 20:
                return "Change Cipher Spec (20)";
            case 21:
                return "Alert (21)";
            case 22:
                return "Handshake (22)";
            case 23:
                return "Application Data (23)";
            case 24:
            default:
                return "Unknown Content Type";
            case 25:
                return "TLS CID (25)";
        }
    }
}
