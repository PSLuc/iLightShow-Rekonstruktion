package okhttp3.internal.http;

import E4.g;
import E4.k;
import M4.s;
import com.spotify.sdk.android.auth.LoginActivity;
import java.net.ProtocolException;
import okhttp3.Protocol;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final StatusLine get(Response response) {
            k.f(LoginActivity.RESPONSE_KEY, response);
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String str) throws ProtocolException {
            Protocol protocol;
            int i;
            String strSubstring;
            k.f("statusLine", str);
            if (s.W(str, "HTTP/1.", false)) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(k.l("Unexpected status line: ", str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(k.l("Unexpected status line: ", str));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!s.W(str, "ICY ", false)) {
                    throw new ProtocolException(k.l("Unexpected status line: ", str));
                }
                protocol = Protocol.HTTP_1_0;
                i = 4;
            }
            int i3 = i + 3;
            if (str.length() < i3) {
                throw new ProtocolException(k.l("Unexpected status line: ", str));
            }
            try {
                String strSubstring2 = str.substring(i, i3);
                k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring2);
                int i6 = Integer.parseInt(strSubstring2);
                if (str.length() <= i3) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i3) != ' ') {
                        throw new ProtocolException(k.l("Unexpected status line: ", str));
                    }
                    strSubstring = str.substring(i + 4);
                    k.e("this as java.lang.String).substring(startIndex)", strSubstring);
                }
                return new StatusLine(protocol, i6, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(k.l("Unexpected status line: ", str));
            }
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i, String str) {
        k.f("protocol", protocol);
        k.f("message", str);
        this.protocol = protocol;
        this.code = i;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String string = sb.toString();
        k.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
