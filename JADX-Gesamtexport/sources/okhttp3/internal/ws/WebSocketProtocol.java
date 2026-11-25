package okhttp3.internal.ws;

import B.AbstractC0013g0;
import E4.k;
import Z2.f;
import h5.C0730h;
import h5.C0732j;
import h5.C0735m;

/* JADX INFO: loaded from: classes.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String str) {
        k.f("key", str);
        C0735m c0735m = C0735m.f9352k;
        return f.i(k.l(str, ACCEPT_MAGIC)).c("SHA-1").a();
    }

    public final String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            return k.l("Code must be in range [1000,5000): ", Integer.valueOf(i));
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return AbstractC0013g0.f(i, "Code ", " is reserved and may not be used.");
    }

    public final void toggleMask(C0730h c0730h, byte[] bArr) {
        long j4;
        k.f("cursor", c0730h);
        k.f("key", bArr);
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = c0730h.f9347l;
            int i3 = c0730h.f9348m;
            int i6 = c0730h.f9349n;
            if (bArr2 != null) {
                while (i3 < i6) {
                    int i7 = i % length;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i7]);
                    i3++;
                    i = i7 + 1;
                }
            }
            long j6 = c0730h.f9346k;
            C0732j c0732j = c0730h.f9344h;
            k.c(c0732j);
            if (j6 == c0732j.i) {
                throw new IllegalStateException("no more bytes");
            }
            j4 = c0730h.f9346k;
        } while (c0730h.c(j4 == -1 ? 0L : j4 + ((long) (c0730h.f9349n - c0730h.f9348m))) != -1);
    }

    public final void validateCloseCode(int i) {
        String strCloseCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (strCloseCodeExceptionMessage == null) {
            return;
        }
        k.c(strCloseCodeExceptionMessage);
        throw new IllegalArgumentException(strCloseCodeExceptionMessage.toString());
    }
}
