package okhttp3.internal.http2;

import E4.k;
import M4.s;
import Z2.f;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import h5.C0735m;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final C0735m CONNECTION_PREFACE;
    private static final String[] FLAGS;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final String[] FRAME_NAMES;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final Http2 INSTANCE = new Http2();
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        C0735m c0735m = C0735m.f9352k;
        CONNECTION_PREFACE = f.i("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        FRAME_NAMES = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        FLAGS = new String[64];
        String[] strArr = new String[HueLog.LogComponent.STREAMDTLS];
        int i = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            String binaryString = Integer.toBinaryString(i3);
            k.e("toBinaryString(it)", binaryString);
            String str = Util.format("%8s", binaryString);
            k.f("<this>", str);
            String strReplace = str.replace(' ', '0');
            k.e("replace(...)", strReplace);
            strArr[i3] = strReplace;
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i6 = iArr[0];
        strArr2[i6 | 8] = k.l(strArr2[i6], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i7 = 0;
        while (i7 < 3) {
            int i8 = iArr2[i7];
            i7++;
            int i9 = iArr[0];
            String[] strArr3 = FLAGS;
            int i10 = i9 | i8;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i9]);
            sb.append('|');
            sb.append((Object) strArr3[i8]);
            strArr3[i10] = sb.toString();
            strArr3[i10 | 8] = ((Object) strArr3[i9]) + '|' + ((Object) strArr3[i8]) + "|PADDED";
        }
        int length = FLAGS.length;
        while (i < length) {
            int i11 = i + 1;
            String[] strArr4 = FLAGS;
            if (strArr4[i] == null) {
                strArr4[i] = BINARY[i];
            }
            i = i11;
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i, int i3) {
        String str;
        if (i3 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i3 == 1 ? "ACK" : BINARY[i3];
            }
            if (i != 7 && i != 8) {
                String[] strArr = FLAGS;
                if (i3 < strArr.length) {
                    str = strArr[i3];
                    k.c(str);
                } else {
                    str = BINARY[i3];
                }
                if (i != 5 || (i3 & 4) == 0) {
                    return (i != 0 || (i3 & 32) == 0) ? str : s.U(str, "PRIORITY", "COMPRESSED");
                }
                return s.U(str, "HEADERS", "PUSH_PROMISE");
            }
        }
        return BINARY[i3];
    }

    public final String formattedType$okhttp(int i) {
        String[] strArr = FRAME_NAMES;
        return i < strArr.length ? strArr[i] : Util.format("0x%02x", Integer.valueOf(i));
    }

    public final String frameLog(boolean z5, int i, int i3, int i6, int i7) {
        return Util.format("%s 0x%08x %5d %-13s %s", z5 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i3), formattedType$okhttp(i6), formatFlags(i6, i7));
    }
}
