package okhttp3;

import B.AbstractC0013g0;
import E4.k;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.Util;
import p084p4.c;

/* JADX INFO: loaded from: classes.dex */
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        k.f("uriHost", str);
        k.f("dns", dns);
        k.f("socketFactory", socketFactory);
        k.f("proxyAuthenticator", authenticator);
        k.f("protocols", list);
        k.f("connectionSpecs", list2);
        k.f("proxySelector", proxySelector);
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
        this.protocols = Util.toImmutableList(list);
        this.connectionSpecs = Util.toImmutableList(list2);
    }

    @c
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m11deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m12deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m13deprecated_dns() {
        return this.dns;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m14deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m15deprecated_protocols() {
        return this.protocols;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m16deprecated_proxy() {
        return this.proxy;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m17deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m18deprecated_proxySelector() {
        return this.proxySelector;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m19deprecated_socketFactory() {
        return this.socketFactory;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m20deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m21deprecated_url() {
        return this.url;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return k.a(this.url, address.url) && equalsNonHost$okhttp(address);
    }

    public final boolean equalsNonHost$okhttp(Address address) {
        k.f("that", address);
        return k.a(this.dns, address.dns) && k.a(this.proxyAuthenticator, address.proxyAuthenticator) && k.a(this.protocols, address.protocols) && k.a(this.connectionSpecs, address.connectionSpecs) && k.a(this.proxySelector, address.proxySelector) && k.a(this.proxy, address.proxy) && k.a(this.sslSocketFactory, address.sslSocketFactory) && k.a(this.hostnameVerifier, address.hostnameVerifier) && k.a(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port();
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + ((this.connectionSpecs.hashCode() + ((this.protocols.hashCode() + ((this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.url.host());
        sb.append(':');
        sb.append(this.url.port());
        sb.append(", ");
        Proxy proxy = this.proxy;
        return AbstractC0013g0.m(sb, proxy != null ? k.l("proxy=", proxy) : k.l("proxySelector=", this.proxySelector), '}');
    }

    public final HttpUrl url() {
        return this.url;
    }
}
