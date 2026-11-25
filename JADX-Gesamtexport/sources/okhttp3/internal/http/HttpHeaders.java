package okhttp3.internal.http;

import E4.k;
import M4.a;
import M4.s;
import Z2.f;
import com.spotify.sdk.android.auth.LoginActivity;
import h5.C0732j;
import h5.C0735m;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p084p4.c;
import p089q4.v;

/* JADX INFO: loaded from: classes.dex */
public final class HttpHeaders {
    private static final C0735m QUOTED_STRING_DELIMITERS;
    private static final C0735m TOKEN_DELIMITERS;

    static {
        C0735m c0735m = C0735m.f9352k;
        QUOTED_STRING_DELIMITERS = f.i("\"\\");
        TOKEN_DELIMITERS = f.i("\t ,=");
    }

    @c
    public static final boolean hasBody(Response response) {
        k.f(LoginActivity.RESPONSE_KEY, response);
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        k.f("<this>", headers);
        k.f("headerName", str);
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i = 0;
        while (i < size) {
            int i3 = i + 1;
            if (str.equalsIgnoreCase(headers.name(i))) {
                C0732j c0732j = new C0732j();
                c0732j.h0(headers.value(i));
                try {
                    readChallengeHeader(c0732j, arrayList);
                } catch (EOFException e6) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e6);
                }
            }
            i = i3;
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        k.f("<this>", response);
        if (k.a(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x007a A[EDGE_INSN: B:59:0x007a->B:28:0x007a BREAK  A[LOOP:2: B:22:0x0066->B:49:0x00ba], SYNTHETIC] */
    private static final void readChallengeHeader(C0732j c0732j, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(c0732j);
                    token2 = readToken(c0732j);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(c0732j);
                String token3 = readToken(c0732j);
                if (token3 == null) {
                    if (c0732j.z()) {
                        list.add(new Challenge(token2, v.f11238h));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(c0732j, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(c0732j);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || c0732j.z())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = Util.skipAll(c0732j, (byte) 61) + iSkipAll;
                    while (true) {
                        if (token3 == null) {
                            token3 = readToken(c0732j);
                            if (skipCommasAndWhitespace(c0732j)) {
                                break;
                            }
                            iSkipAll2 = Util.skipAll(c0732j, (byte) 61);
                            if (iSkipAll2 == 0) {
                                break;
                            }
                            if (iSkipAll2 <= 1 || skipCommasAndWhitespace(c0732j)) {
                                return;
                            }
                            if (startsWith(c0732j, (byte) 34)) {
                                token = readQuotedString(c0732j);
                            } else {
                                token = readToken(c0732j);
                            }
                            if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(c0732j) && !c0732j.z()) {
                                return;
                            } else {
                                token3 = null;
                            }
                        } else {
                            if (iSkipAll2 == 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(c0732j, (byte) 34)) {
                                token = readQuotedString(c0732j);
                            } else {
                                token = readToken(c0732j);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(c0732j)) {
                            }
                            token3 = null;
                        }
                    }
                    list.add(new Challenge(token2, linkedHashMap));
                    token2 = token3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, k.l(token3, s.T(iSkipAll, "=")));
                    k.e("singletonMap<String, Str…ek + \"=\".repeat(eqCount))", mapSingletonMap);
                    list.add(new Challenge(token2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final String readQuotedString(C0732j c0732j) throws EOFException {
        if (c0732j.W() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0732j c0732j2 = new C0732j();
        while (true) {
            long jV = c0732j.v(QUOTED_STRING_DELIMITERS);
            if (jV == -1) {
                return null;
            }
            if (c0732j.o(jV) == 34) {
                c0732j2.write(c0732j, jV);
                c0732j.W();
                return c0732j2.M();
            }
            if (c0732j.i == jV + 1) {
                return null;
            }
            c0732j2.write(c0732j, jV);
            c0732j.W();
            c0732j2.write(c0732j, 1L);
        }
    }

    private static final String readToken(C0732j c0732j) {
        long jV = c0732j.v(TOKEN_DELIMITERS);
        if (jV == -1) {
            jV = c0732j.i;
        }
        if (jV != 0) {
            return c0732j.L(jV, a.f3520a);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        k.f("<this>", cookieJar);
        k.f("url", httpUrl);
        k.f("headers", headers);
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.Companion.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }

    private static final boolean skipCommasAndWhitespace(C0732j c0732j) throws EOFException {
        boolean z5 = false;
        while (!c0732j.z()) {
            byte bO = c0732j.o(0L);
            if (bO == 44) {
                c0732j.W();
                z5 = true;
            } else {
                if (bO != 32 && bO != 9) {
                    break;
                }
                c0732j.W();
            }
        }
        return z5;
    }

    private static final boolean startsWith(C0732j c0732j, byte b6) {
        return !c0732j.z() && c0732j.o(0L) == b6;
    }
}
