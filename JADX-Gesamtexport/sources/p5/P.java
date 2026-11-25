package p5;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public enum P {
    HELLO_REQUEST(0),
    CLIENT_HELLO(1),
    SERVER_HELLO(2),
    HELLO_VERIFY_REQUEST(3),
    CERTIFICATE(11),
    SERVER_KEY_EXCHANGE(12),
    CERTIFICATE_REQUEST(13),
    SERVER_HELLO_DONE(14),
    CERTIFICATE_VERIFY(15),
    CLIENT_KEY_EXCHANGE(16),
    FINISHED(20);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10946h;

    P(int i) {
        this.f10946h = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder(name());
        sb.append(" (");
        return AbstractC0013g0.l(sb, this.f10946h, ")");
    }
}
