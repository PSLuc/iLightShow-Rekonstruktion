package com.nanjoran.ilightshow.Services;

import B.C0025m0;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class O implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0025m0 f8351a;

    public O(C0025m0 c0025m0) {
        this.f8351a = c0025m0;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509Certificate x509Certificate;
        if (x509CertificateArr == null || (x509Certificate = x509CertificateArr[0]) == null) {
            throw new CertificateException("No server certificate");
        }
        String strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(x509Certificate.getPublicKey().getEncoded()), 2);
        this.f8351a.getClass();
        if (!E4.k.a(strEncodeToString, "pSNTuBv1VqH04VMsFvQBRh1q1FCTNsJnjKRMqq5FANk=")) {
            throw new CertificateException("Public key pinning failed");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
