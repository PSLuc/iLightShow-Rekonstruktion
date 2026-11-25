package okhttp3;

import E4.k;
import java.net.InetSocketAddress;
import java.net.Proxy;
import p084p4.c;

/* JADX INFO: loaded from: classes.dex */
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        k.f("address", address);
        k.f("proxy", proxy);
        k.f("socketAddress", inetSocketAddress);
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_address, reason: not valid java name */
    public final Address m141deprecated_address() {
        return this.address;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m142deprecated_proxy() {
        return this.proxy;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m143deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return k.a(route.address, this.address) && k.a(route.proxy, this.proxy) && k.a(route.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31);
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
