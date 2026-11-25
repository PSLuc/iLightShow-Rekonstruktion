package e5;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f8757a = new char[117];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f8758b = new byte[WebSocketProtocol.PAYLOAD_SHORT];

    static {
        int i = 0;
        for (int i3 = 0; i3 < 32; i3++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = f8758b;
            if (i >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i] = 127;
            i++;
        }
    }

    public static void a(char c6, int i) {
        if (c6 != 'u') {
            f8757a[c6] = (char) i;
        }
    }
}
