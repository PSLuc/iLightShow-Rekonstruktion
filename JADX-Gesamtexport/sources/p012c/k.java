package p012c;

import N.C0230o;
import com.google.android.gms.internal.play_billing.C0590q0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import com.spotify.protocol.WampClient;
import defpackage.b;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import okhttp3.internal.ws.WebSocketProtocol;
import p020d2.n;
import p035g0.r;
import p109u2.C0965d;
import p124x0.C1100h;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ void A(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void B(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "server_name";
            case 2:
                return "max_fragment_length";
            case 3:
                return "client_certificate_url";
            case 4:
                return "trusted_ca_keys";
            case 5:
                return "truncated_hmac";
            case 6:
                return "status_request";
            case 7:
                return "user_mapping";
            case 8:
                return "client_authz";
            case 9:
                return "server_authz";
            case 10:
                return "cert_type";
            case 11:
                return "elliptic_curves";
            case 12:
                return "ec_point_formats";
            case 13:
                return "srp";
            case 14:
                return "signature_algorithms";
            case 15:
                return "use_srtp";
            case 16:
                return "heartbeat";
            case b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return "application_layer_protocol_negotiation";
            case b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return "status_request_v2";
            case b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                return "signed_certificate_timestamp";
            case 20:
                return "client_certificate_type";
            case 21:
                return "server_certificate_type";
            case 22:
                return "encrypt_then_mac";
            case 23:
                return "SessionTicket TLS";
            case 24:
                return "Connection ID";
            case 25:
                return "renegotiation_info";
            case 26:
                return "record_size_limit";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "MD5";
            case 3:
                return "SHA1";
            case 4:
                return "SHA224";
            case 5:
                return "SHA256";
            case 6:
                return "SHA384";
            case 7:
                return "SHA512";
            case 8:
                return "INTRINSIC";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String E(int i) {
        switch (i) {
            case 1:
                return "ANONYMOUS";
            case 2:
                return "RSA";
            case 3:
                return "DSA";
            case 4:
                return "ECDSA";
            case 5:
                return "ED25519";
            case 6:
                return "ED448";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String F(int i) {
        if (i == 1) {
            return "Measuring";
        }
        if (i == 2) {
            return "LookaheadMeasuring";
        }
        if (i == 3) {
            return "LayingOut";
        }
        if (i != 4) {
            return i != 5 ? "null" : "Idle";
        }
        return "LookaheadLayingOut";
    }

    public static int a(int i) {
        if (i == 90) {
            return 81;
        }
        if (i == 91) {
            return 82;
        }
        if (i == 93) {
            return 84;
        }
        if (i == 94) {
            return 85;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return 18;
            case b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return 19;
            case b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case WampClient.RequestType.SUBSCRIBED /* 33 */:
                return 34;
            case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                return 35;
            case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                return 36;
            case WampClient.RequestType.EVENT /* 36 */:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case WampClient.RequestType.CALL /* 48 */:
                return 49;
            case WampClient.RequestType.CANCEL /* 49 */:
                return 50;
            case WampClient.RequestType.RESULT /* 50 */:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 87;
                    case 97:
                        return 88;
                    case 98:
                        return 89;
                    case 99:
                        return 90;
                    case 100:
                        return 91;
                    case 101:
                        return 92;
                    case 102:
                        return 83;
                    case 103:
                        return 86;
                    case 104:
                        return 93;
                    case 105:
                        return 94;
                    case 106:
                        return 95;
                    case 107:
                        return 96;
                    case 108:
                        return 97;
                    case 109:
                        return 98;
                    case 110:
                        return 99;
                    case 111:
                        return 100;
                    case 112:
                        return 101;
                    case 113:
                        return 102;
                    case 114:
                        return 103;
                    case 115:
                        return 104;
                    case 116:
                        return 105;
                    case 117:
                        return 106;
                    case 118:
                        return 107;
                    case 119:
                        return 108;
                    case 120:
                        return 109;
                    case 121:
                        return 110;
                    case 122:
                        return 111;
                    case 123:
                        return 112;
                    case RecurringDays.RECURRING_WEEKDAYS /* 124 */:
                        return 113;
                    case 125:
                        return 114;
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                        return 117;
                    case 127:
                        return 119;
                    case 128:
                        return 120;
                    case 129:
                        return 121;
                    case 130:
                        return 122;
                    case 131:
                        return 123;
                    case 132:
                        return RecurringDays.RECURRING_WEEKDAYS;
                    case 133:
                        return 125;
                    case 134:
                        return WebSocketProtocol.PAYLOAD_SHORT;
                    case 135:
                        return 127;
                    case 136:
                        return 128;
                    case 137:
                        return 129;
                    case 138:
                        return 130;
                    case 139:
                        return 131;
                    case 140:
                        return 132;
                    case 141:
                        return 133;
                    case 142:
                        return 134;
                    case 143:
                        return 135;
                    case 144:
                        return 136;
                    case 145:
                        return 115;
                    case 146:
                        return 116;
                    case 147:
                        return 118;
                    case 148:
                        return 137;
                    case 149:
                        return 138;
                    case 150:
                        return 139;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ byte b(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) -1;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i) {
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i3;
    }

    public static /* synthetic */ int d(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 8;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int e(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 8;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int f(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return 16;
            case b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return 17;
            case b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 22;
            case 23:
                return 35;
            case 24:
                return 53;
            case 25:
                return 65281;
            case 26:
                return 28;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int g(int i) {
        if (i == 1) {
            return HueLog.LogComponent.APPCORE;
        }
        if (i == 2) {
            return 1024;
        }
        if (i == 3) {
            return 2048;
        }
        if (i == 4) {
            return 4096;
        }
        throw null;
    }

    public static /* synthetic */ int h(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return 16;
            case b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return 17;
            case b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case WampClient.RequestType.SUBSCRIBED /* 33 */:
                return 32;
            case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                return 33;
            case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                return 34;
            case WampClient.RequestType.EVENT /* 36 */:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case WampClient.RequestType.CALL /* 48 */:
                return 47;
            case WampClient.RequestType.CANCEL /* 49 */:
                return 48;
            case WampClient.RequestType.RESULT /* 50 */:
                return 49;
            case 51:
                return 50;
            case 52:
                return 51;
            case 53:
                return 52;
            case 54:
                return 53;
            case 55:
                return 54;
            case 56:
                return 55;
            case 57:
                return 56;
            case 58:
                return 57;
            case 59:
                return 58;
            case 60:
                return 59;
            case 61:
                return 60;
            case 62:
                return 61;
            case 63:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case 66:
                return 65;
            case 67:
                return 66;
            case 68:
                return 67;
            case 69:
                return 68;
            case 70:
                return 69;
            case 71:
                return 70;
            case 72:
                return 71;
            case 73:
                return 72;
            case 74:
                return 73;
            case 75:
                return 74;
            case 76:
                return 75;
            case 77:
                return 76;
            case 78:
                return 77;
            case 79:
                return 78;
            case 80:
                return 79;
            case 81:
                return 90;
            case 82:
                return 91;
            case 83:
                return 102;
            case 84:
                return 93;
            case 85:
                return 94;
            case 86:
                return 103;
            case 87:
                return 96;
            case 88:
                return 97;
            case 89:
                return 98;
            case 90:
                return 99;
            case 91:
                return 100;
            case 92:
                return 101;
            case 93:
                return 104;
            case 94:
                return 105;
            case 95:
                return 106;
            case 96:
                return 107;
            case 97:
                return 108;
            case 98:
                return 109;
            case 99:
                return 110;
            case 100:
                return 111;
            case 101:
                return 112;
            case 102:
                return 113;
            case 103:
                return 114;
            case 104:
                return 115;
            case 105:
                return 116;
            case 106:
                return 117;
            case 107:
                return 118;
            case 108:
                return 119;
            case 109:
                return 120;
            case 110:
                return 121;
            case 111:
                return 122;
            case 112:
                return 123;
            case 113:
                return RecurringDays.RECURRING_WEEKDAYS;
            case 114:
                return 125;
            case 115:
                return 145;
            case 116:
                return 146;
            case 117:
                return WebSocketProtocol.PAYLOAD_SHORT;
            case 118:
                return 147;
            case 119:
                return 127;
            case 120:
                return 128;
            case 121:
                return 129;
            case 122:
                return 130;
            case 123:
                return 131;
            case RecurringDays.RECURRING_WEEKDAYS /* 124 */:
                return 132;
            case 125:
                return 133;
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                return 134;
            case 127:
                return 135;
            case 128:
                return 136;
            case 129:
                return 137;
            case 130:
                return 138;
            case 131:
                return 139;
            case 132:
                return 140;
            case 133:
                return 141;
            case 134:
                return 142;
            case 135:
                return 143;
            case 136:
                return 144;
            case 137:
                return 148;
            case 138:
                return 149;
            case 139:
                return 150;
            default:
                throw null;
        }
    }

    public static int i(float f6, int i, int i3) {
        return (Float.hashCode(f6) + i) * i3;
    }

    public static int j(int i, int i3, int i6) {
        return C0590q0.h0(i) + i3 + i6;
    }

    public static int k(int i, int i3, int i6, int i7) {
        return C0590q0.h0(i) + i3 + i6 + i7;
    }

    public static int l(int i, int i3, long j4) {
        return (Long.hashCode(j4) + i) * i3;
    }

    public static int m(boolean z5, int i, int i3) {
        return (Boolean.hashCode(z5) + i) * i3;
    }

    public static int n(byte[] bArr, int i, int i3) {
        return (Arrays.hashCode(bArr) + i) * i3;
    }

    public static long o() {
        return new Date().getTime();
    }

    public static ClassCastException p(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException q(C0965d c0965d) {
        c0965d.next().getClass();
        return new ClassCastException();
    }

    public static String r(int i, String str) {
        return str + i;
    }

    public static String s(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String t(StringBuilder sb, float f6, char c6) {
        sb.append(f6);
        sb.append(c6);
        return sb.toString();
    }

    public static String u(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder v(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder w(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void x(int i, int i3, int i6, int i7, int i8) {
        n.b(i);
        n.b(i3);
        n.b(i6);
        n.b(i7);
        n.b(i8);
    }

    public static void y(int i, C0230o c0230o, int i3, C1100h c1100h) {
        c0230o.f0(Integer.valueOf(i));
        c0230o.b(Integer.valueOf(i3), c1100h);
    }

    public static void z(long j4, StringBuilder sb, String str) {
        sb.append((Object) r.i(j4));
        sb.append(str);
    }
}
