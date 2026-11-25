package com.nanjoran.ilightshow.Services.lights.hue;

import D.x;
import E4.k;
import K4.e;
import com.nanjoran.ilightshow.Services.G0;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p126x2.r;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceHueBridgeKt {
    private static final r unsafeFuel;

    static {
        r rVar = new r();
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridgeKt$unsafeFuel$1$trustAllCerts$1
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                k.f("chain", x509CertificateArr);
                k.f("authType", str);
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                k.f("chain", x509CertificateArr);
                k.f("authType", str);
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        }};
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        k.f("<set-?>", socketFactory);
        e[] eVarArr = r.f14093n;
        e eVar = eVarArr[1];
        x xVar = rVar.f14103h;
        xVar.getClass();
        k.f("property", eVar);
        xVar.f707j = socketFactory;
        G0 g6 = new G0(1);
        e eVar2 = eVarArr[2];
        x xVar2 = rVar.i;
        xVar2.getClass();
        k.f("property", eVar2);
        xVar2.f707j = g6;
        unsafeFuel = rVar;
    }

    public static final r getUnsafeFuel() {
        return unsafeFuel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean unsafeFuel$lambda$2$lambda$1(String str, SSLSession sSLSession) {
        return true;
    }
}
