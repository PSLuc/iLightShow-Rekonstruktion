package okhttp3.internal.ws;

import E4.g;
import E4.k;
import M4.l;
import M4.s;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00b9 A[PHI: r7 r9 r11
  0x00b9: PHI (r7v5 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v9 java.lang.Integer) binds: [B:51:0x00e0, B:33:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r9v8 java.lang.Integer) = (r9v6 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:51:0x00e0, B:33:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r11v16 boolean) = (r11v10 boolean), (r11v19 boolean) binds: [B:51:0x00e0, B:33:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
        public final WebSocketExtensions parse(Headers headers) {
            String strTrimSubstring;
            k.f("responseHeaders", headers);
            int size = headers.size();
            int i = 0;
            boolean z5 = false;
            Integer numX = null;
            boolean z6 = false;
            Integer numX2 = null;
            boolean z7 = false;
            boolean z8 = false;
            while (i < size) {
                int i3 = i + 1;
                if (s.Q(headers.name(i), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true)) {
                    String strValue = headers.value(i);
                    int i6 = 0;
                    while (i6 < strValue.length()) {
                        int i7 = i6;
                        int iDelimiterOffset$default = Util.delimiterOffset$default(strValue, ',', i7, 0, 4, (Object) null);
                        char c6 = ';';
                        int iDelimiterOffset = Util.delimiterOffset(strValue, ';', i7, iDelimiterOffset$default);
                        String strTrimSubstring2 = Util.trimSubstring(strValue, i7, iDelimiterOffset);
                        int i8 = iDelimiterOffset + 1;
                        if (s.Q(strTrimSubstring2, "permessage-deflate", true)) {
                            if (z5) {
                                z8 = true;
                            }
                            while (i8 < iDelimiterOffset$default) {
                                int iDelimiterOffset2 = Util.delimiterOffset(strValue, c6, i8, iDelimiterOffset$default);
                                int iDelimiterOffset3 = Util.delimiterOffset(strValue, '=', i8, iDelimiterOffset2);
                                String strTrimSubstring3 = Util.trimSubstring(strValue, i8, iDelimiterOffset3);
                                if (iDelimiterOffset3 < iDelimiterOffset2) {
                                    strTrimSubstring = Util.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2);
                                    k.f("<this>", strTrimSubstring);
                                    if (strTrimSubstring.length() >= 2 && s.W(strTrimSubstring, "\"", false) && l.c0(strTrimSubstring, "\"")) {
                                        strTrimSubstring = strTrimSubstring.substring(1, strTrimSubstring.length() - 1);
                                        k.e("substring(...)", strTrimSubstring);
                                    }
                                } else {
                                    strTrimSubstring = null;
                                }
                                i8 = iDelimiterOffset2 + 1;
                                if (s.Q(strTrimSubstring3, "client_max_window_bits", true)) {
                                    if (numX != null) {
                                        z8 = true;
                                    }
                                    numX = strTrimSubstring == null ? null : s.X(strTrimSubstring);
                                    if (numX == null) {
                                        z8 = true;
                                    }
                                } else if (s.Q(strTrimSubstring3, "client_no_context_takeover", true)) {
                                    if (z6) {
                                        z8 = true;
                                    }
                                    if (strTrimSubstring != null) {
                                        z8 = true;
                                    }
                                    z6 = true;
                                } else {
                                    if (s.Q(strTrimSubstring3, "server_max_window_bits", true)) {
                                        if (numX2 != null) {
                                            z8 = true;
                                        }
                                        numX2 = strTrimSubstring == null ? null : s.X(strTrimSubstring);
                                        if (numX2 == null) {
                                        }
                                    } else if (s.Q(strTrimSubstring3, "server_no_context_takeover", true)) {
                                        if (z7) {
                                            z8 = true;
                                        }
                                        if (strTrimSubstring != null) {
                                            z8 = true;
                                        }
                                        z7 = true;
                                    }
                                    z8 = true;
                                }
                                c6 = ';';
                            }
                            i6 = i8;
                            z5 = true;
                        } else {
                            i6 = i8;
                            z8 = true;
                        }
                    }
                }
                i = i3;
            }
            return new WebSocketExtensions(z5, numX, z6, numX2, z7, z8);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z5, Integer num, boolean z6, Integer num2, boolean z7, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = webSocketExtensions.perMessageDeflate;
        }
        if ((i & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i & 4) != 0) {
            z6 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i & 16) != 0) {
            z7 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i & 32) != 0) {
            z8 = webSocketExtensions.unknownValues;
        }
        boolean z9 = z7;
        boolean z10 = z8;
        return webSocketExtensions.copy(z5, num, z6, num2, z9, z10);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z5, Integer num, boolean z6, Integer num2, boolean z7, boolean z8) {
        return new WebSocketExtensions(z5, num, z6, num2, z7, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && k.a(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && k.a(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z5 = this.perMessageDeflate;
        ?? r6 = z5;
        if (z5) {
            r6 = 1;
        }
        int i = r6 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z6 = this.clientNoContextTakeover;
        ?? r7 = z6;
        if (z6) {
            r7 = 1;
        }
        int i3 = (iHashCode + r7) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z7 = this.serverNoContextTakeover;
        ?? r8 = z7;
        if (z7) {
            r8 = 1;
        }
        int i6 = (iHashCode2 + r8) * 31;
        boolean z8 = this.unknownValues;
        return i6 + (z8 ? 1 : z8);
    }

    public final boolean noContextTakeover(boolean z5) {
        return z5 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    public WebSocketExtensions(boolean z5, Integer num, boolean z6, Integer num2, boolean z7, boolean z8) {
        this.perMessageDeflate = z5;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z6;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z7;
        this.unknownValues = z8;
    }

    public /* synthetic */ WebSocketExtensions(boolean z5, Integer num, boolean z6, Integer num2, boolean z7, boolean z8, int i, g gVar) {
        this((i & 1) != 0 ? false : z5, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z6, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? false : z7, (i & 32) != 0 ? false : z8);
    }
}
