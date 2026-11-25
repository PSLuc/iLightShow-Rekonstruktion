package com.nanjoran.ilightshow.Services;

import B.C0025m0;
import P4.AbstractC0336x;
import android.content.Context;
import android.util.Base64;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.JSON.UsageJSON;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.regex.Pattern;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.NoWhenBranchMatchedException;
import p130y0.C1136i0;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final P0 f8357e = new P0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d5.n f8358a = S1.V.f(new defpackage.d(26));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p120w2.a f8359b = p120w2.a.f13456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f8360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p126x2.r f8361d;

    public P0() throws InvalidKeySpecException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        p126x2.r rVar = new p126x2.r();
        C0025m0 c0025m0 = new C0025m0(25);
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        String strU = M4.s.U(M4.s.U("-----BEGIN CERTIFICATE-----\nMIIDXDCCAkSgAwIBAgIUXX9rwaPRQQj8JlM1/U8KLoR23e4wDQYJKoZIhvcNAQEL\nBQAwRTELMAkGA1UEBhMCRlIxEzARBgNVBAgMClNvbWUtU3RhdGUxITAfBgNVBAoM\nGEludGVybmV0IFdpZGdpdHMgUHR5IEx0ZDAgFw0yNDEyMDMwODA1MjFaGA8yMDUy\nMDQyMDA4MDUyMVowRTELMAkGA1UEBhMCQVUxEzARBgNVBAgMClNvbWUtU3RhdGUx\nITAfBgNVBAoMGEludGVybmV0IFdpZGdpdHMgUHR5IEx0ZDCCASIwDQYJKoZIhvcN\nAQEBBQADggEPADCCAQoCggEBAMdA5dnT+A0a1s6IP7Ui5LcAogLrdGM/DXadX+30\n9z03zqKPEPzB/D3jQ6IHWoRPMhnqxulmnkWtMxbQ8MajmW6C6bioqi11JcoICDoC\nVnNowbAFAB0hO1EO95tP0J8q7b4DKXBnhNxUjt6akeUE77VrcoLlQ7Z8fchm7c/s\n7qRsQ5RwTifHJbk1RhR+Hlb3V8XetWg3o1OZtRq29gZYGIO37vqqTUG6k7pRbm3V\nANt2nEaDikXQc/WfP8yt9AmE6akYtsU5c1VczcXisX2oc0EE1xqWkEPgULshcg25\nv2eThQM5r2uE8Txa9ntZ5H/T/ppoZ/S40VXFR3+vArVBK3MCAwEAAaNCMEAwHQYD\nVR0OBBYEFCCEjJ27PZERCKV7vro4pfMgGzwbMB8GA1UdIwQYMBaAFOZ1RGBSuoLv\nxKHRD9YLxZZ7Zf8aMA0GCSqGSIb3DQEBCwUAA4IBAQBzFRTgItIs7GrYMDdXUXHE\nyRJcfYklr32rRMvWWjxjihii4xUJcWJEtxnsy6Gkhoec9ng6yZyRa3XsDFu3zBiE\nnQGAs8CYp/lU95cqx5SqKxZRDD57S6icdwRZKmJhh2q6R0JqAftQtZAF30QBE/zs\ngG2+1o8G5KO2fx/eJaInl4losJ9F2ivL0q4B/5eT4jQxMa359JIcZ7tbVy2pqK0m\nNwVnIETVZuBH5jq1bvuWdxDQlrElS7Dkz6VoTT/2FFQOBhMTvVpJJpoiE0Cj3dEk\natycoA4SE/YAwtwdq6cFMveQnIGgsL80SI4YUawgNcPoA5maw9UYxcabraQjH1Wk\n-----END CERTIFICATE-----", "-----BEGIN CERTIFICATE-----", ""), "-----END CERTIFICATE-----", "");
        Pattern patternCompile = Pattern.compile("\\s+");
        E4.k.e("compile(...)", patternCompile);
        String strReplaceAll = patternCompile.matcher(strU).replaceAll("");
        E4.k.e("replaceAll(...)", strReplaceAll);
        Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(Base64.decode(strReplaceAll, 0)));
        E4.k.d("null cannot be cast to non-null type java.security.cert.X509Certificate", certificateGenerateCertificate);
        String strU2 = M4.s.U(M4.s.U(new String(AbstractC0698y.e((byte[]) c0025m0.i), M4.a.f3520a), "-----BEGIN PRIVATE KEY-----", ""), "-----END PRIVATE KEY-----", "");
        Pattern patternCompile2 = Pattern.compile("\\s+");
        E4.k.e("compile(...)", patternCompile2);
        String strReplaceAll2 = patternCompile2.matcher(strU2).replaceAll("");
        E4.k.e("replaceAll(...)", strReplaceAll2);
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(strReplaceAll2, 0)));
        E4.k.e("generatePrivate(...)", privateKeyGeneratePrivate);
        keyStore.setKeyEntry("client-key", privateKeyGeneratePrivate, null, new X509Certificate[]{(X509Certificate) certificateGenerateCertificate});
        O o6 = new O(c0025m0);
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, null);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(keyManagerFactory.getKeyManagers(), new O[]{o6}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        E4.k.f("<set-?>", socketFactory);
        K4.e[] eVarArr = p126x2.r.f14093n;
        K4.e eVar = eVarArr[1];
        D.x xVar = rVar.f14103h;
        xVar.getClass();
        E4.k.f("property", eVar);
        xVar.f707j = socketFactory;
        G0 g6 = new G0(0);
        K4.e eVar2 = eVarArr[2];
        D.x xVar2 = rVar.i;
        xVar2.getClass();
        E4.k.f("property", eVar2);
        xVar2.f707j = g6;
        this.f8361d = rVar;
    }

    public static void a(String str, String str2, String str3, defpackage.c cVar, B3.f fVar) {
        String strK;
        if (str == null) {
            str = str2 == null ? fVar.f565k : str2;
        }
        fVar.f565k = str;
        String str4 = null;
        if (str3 == null || M4.l.i0(str3) || str3.equals("UNKN00000000")) {
            str3 = null;
        }
        if (str3 != null) {
            fVar.f567m = str3;
        }
        if (cVar != null && (strK = cVar.k()) != null && !M4.l.i0(strK) && !strK.equals("UNKN00000000")) {
            str4 = strK;
        }
        if (str4 != null) {
            String str5 = fVar.f567m;
            if (str5 == null || M4.l.i0(str5) || E4.k.a(fVar.f567m, "UNKN00000000")) {
                fVar.f567m = str4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01ff A[Catch: Exception -> 0x0206, all -> 0x0278, TRY_ENTER, TryCatch #1 {all -> 0x0278, blocks: (B:16:0x0045, B:96:0x0268, B:23:0x005b, B:90:0x024a, B:26:0x0068, B:68:0x01dd, B:71:0x01ff, B:78:0x0212, B:79:0x0218, B:81:0x022f, B:83:0x0233, B:86:0x0239, B:93:0x025a, B:29:0x007e, B:41:0x00b5, B:43:0x00bd, B:46:0x00c8, B:48:0x00ee, B:55:0x016e, B:57:0x0184, B:58:0x0187, B:60:0x01ab, B:63:0x01b1, B:64:0x01b7, B:50:0x010f, B:52:0x0134, B:54:0x0147, B:37:0x009a), top: B:102:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0209  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0257, code lost:
    
        if (r0.b(r1, true, r8) == r9) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(B3.f r18, boolean r19, p122w4.c r20) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nanjoran.ilightshow.Services.P0.b(B3.f, boolean, w4.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0215, code lost:
    
        if (r2 == r5) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(B3.f r19, p122w4.c r20) {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nanjoran.ilightshow.Services.P0.c(B3.f, w4.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(p122w4.c cVar) throws Throwable {
        M0 m6;
        if (cVar instanceof M0) {
            m6 = (M0) cVar;
            int i = m6.f8343n;
            if ((i & Integer.MIN_VALUE) != 0) {
                m6.f8343n = i - Integer.MIN_VALUE;
            } else {
                m6 = new M0(this, cVar);
            }
        } else {
            m6 = new M0(this, cVar);
        }
        Object objV = m6.f8341l;
        v4.a aVar = v4.a.f13292h;
        int i3 = m6.f8343n;
        try {
            if (i3 == 0) {
                S1.V.O(objV);
                Context context = this.f8360c;
                if (context == null) {
                    return new AppConfigWrapper((News) null, (AppConfig) null, 3, (E4.g) null);
                }
                p126x2.w wVarS = this.f8361d.b(p126x2.u.GET, "https://api.ilightshow.app:55443/ils/config/android", null).s(new p084p4.h("Authorization", "Bearer ".concat(AbstractC0698y.f(context))), new p084p4.h("Content-Type", "application/json"));
                Charset charset = M4.a.f3520a;
                W4.c cVar2 = P4.D.f4606c;
                L0 l6 = new L0(wVarS, new C1136i0(charset), null);
                m6.f8340k = this;
                m6.f8343n = 1;
                objV = AbstractC0336x.v(cVar2, l6, m6);
                if (objV == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = m6.f8340k;
                S1.V.O(objV);
            }
            p084p4.n nVar = (p084p4.n) objV;
            F2.c cVar3 = (F2.c) nVar.f10857j;
            if (!(cVar3 instanceof F2.b)) {
                if (cVar3 instanceof F2.a) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            d5.n nVar2 = this.f8358a;
            String str = (String) ((F2.b) cVar3).f1404a;
            nVar2.getClass();
            return (AppConfigWrapper) nVar2.a(AbstractC0599v0.B(AppConfigWrapper.Companion.serializer()), str);
        } catch (Exception e6) {
            e6.toString();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(UsageJSON usageJSON, p122w4.c cVar) {
        O0 o6;
        if (cVar instanceof O0) {
            o6 = (O0) cVar;
            int i = o6.f8355n;
            if ((i & Integer.MIN_VALUE) != 0) {
                o6.f8355n = i - Integer.MIN_VALUE;
            } else {
                o6 = new O0(this, cVar);
            }
        } else {
            o6 = new O0(this, cVar);
        }
        Object objV = o6.f8353l;
        v4.a aVar = v4.a.f13292h;
        int i3 = o6.f8355n;
        try {
            if (i3 == 0) {
                S1.V.O(objV);
                Context context = this.f8360c;
                if (context != null) {
                    String strF = AbstractC0698y.f(context);
                    d5.b bVar = d5.c.f8594d;
                    bVar.getClass();
                    String strB = bVar.b(UsageJSON.Companion.serializer(), usageJSON);
                    p126x2.w wVarS = this.f8361d.b(p126x2.u.PUT, "https://api.ilightshow.app:55443/ils/usage", null).s(new p084p4.h("Authorization", "Bearer ".concat(strF)), new p084p4.h("Content-Type", "application/json"));
                    Charset charset = M4.a.f3520a;
                    p126x2.w wVarH = wVarS.h(strB, charset);
                    W4.c cVar2 = P4.D.f4606c;
                    N0 n6 = new N0(wVarH, new C1136i0(charset), null);
                    o6.f8352k = this;
                    o6.f8355n = 1;
                    objV = AbstractC0336x.v(cVar2, n6, o6);
                    if (objV == aVar) {
                        return aVar;
                    }
                }
                return null;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = o6.f8352k;
            S1.V.O(objV);
            p084p4.n nVar = (p084p4.n) objV;
            F2.c cVar3 = (F2.c) nVar.f10857j;
            if (!(cVar3 instanceof F2.b)) {
                if (cVar3 instanceof F2.a) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            d5.n nVar2 = this.f8358a;
            String str = (String) ((F2.b) cVar3).f1404a;
            nVar2.getClass();
            return (UsageJSON) nVar2.a(AbstractC0599v0.B(UsageJSON.Companion.serializer()), str);
        } catch (Exception e6) {
            e6.toString();
        }
    }
}
