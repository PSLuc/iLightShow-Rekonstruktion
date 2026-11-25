package m5;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f10475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f10476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f10477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Inet4Address f10478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Inet4Address f10479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Inet6Address f10480g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f10474a = LoggerFactory.getLogger((Class<?>) p.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashSet f10481h = new HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized void a() {
        int iMin;
        int i;
        int i3;
        Inet4Address inet4Address;
        Iterator<InterfaceAddress> it;
        int i6 = -1;
        synchronized (p.class) {
            if (f10475b == 0) {
                f10481h.clear();
                Inet4Address inet4Address2 = null;
                f10478e = null;
                f10479f = null;
                f10480g = null;
                Pattern pattern = s.f10492a;
                String property = System.getenv("COAP_NETWORK_INTERFACES");
                if (property == null || property.isEmpty()) {
                    property = System.getProperty("COAP_NETWORK_INTERFACES");
                }
                Pattern patternCompile = (property == null || property.isEmpty()) ? null : Pattern.compile(property);
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    iMin = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    i = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    i3 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    while (networkInterfaces.hasMoreElements()) {
                        try {
                            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                            if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback() && (patternCompile == null || patternCompile.matcher(networkInterfaceNextElement.getName()).matches())) {
                                int mtu = networkInterfaceNextElement.getMTU();
                                if (mtu > 0 && mtu < iMin) {
                                    iMin = mtu;
                                }
                                if (networkInterfaceNextElement.supportsMulticast() && ((inet4Address = f10479f) == null || f10480g == null || f10478e == null)) {
                                    int i7 = f10478e != null ? i6 : 0;
                                    if (inet4Address != null) {
                                        i7 += i6;
                                    }
                                    if (f10480g != null) {
                                        i7 += i6;
                                    }
                                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                                    Inet4Address inet4Address3 = inet4Address2;
                                    Inet4Address inet4Address4 = inet4Address3;
                                    InetAddress inetAddress = inet4Address4;
                                    InetAddress inetAddress2 = inetAddress;
                                    InetAddress inetAddress3 = inetAddress;
                                    while (inetAddresses.hasMoreElements()) {
                                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                                        if (inetAddressNextElement instanceof Inet4Address) {
                                            if (mtu > 0 && mtu < i) {
                                                i = mtu;
                                            }
                                            if (inet4Address3 == null) {
                                                if (inetAddressNextElement.isSiteLocalAddress()) {
                                                    inet4Address3 = (Inet4Address) inetAddressNextElement;
                                                } else if (inet4Address4 == null && inetAddressNextElement.isLinkLocalAddress()) {
                                                    inet4Address4 = (Inet4Address) inetAddressNextElement;
                                                }
                                            }
                                        } else if (inetAddressNextElement instanceof Inet6Address) {
                                            if (mtu > 0 && mtu < i3) {
                                                i3 = mtu;
                                            }
                                            if (inetAddress2 == null) {
                                                if (inetAddressNextElement.isSiteLocalAddress()) {
                                                    inetAddress2 = (Inet6Address) inetAddressNextElement;
                                                } else if (inet4Address4 == null && inetAddressNextElement.isLinkLocalAddress()) {
                                                    inetAddress3 = (Inet6Address) inetAddressNextElement;
                                                }
                                            }
                                        }
                                        inetAddress3 = inetAddress3;
                                        inetAddress2 = inetAddress2;
                                    }
                                    Iterator<InterfaceAddress> it2 = networkInterfaceNextElement.getInterfaceAddresses().iterator();
                                    Inet4Address inet4Address5 = null;
                                    while (it2.hasNext()) {
                                        InetAddress broadcast = it2.next().getBroadcast();
                                        if (broadcast == null || broadcast.isAnyLocalAddress()) {
                                            it = it2;
                                        } else {
                                            f10481h.add(broadcast);
                                            it = it2;
                                            f10474a.debug("Found broadcast address {} - {}.", broadcast, networkInterfaceNextElement.getName());
                                            if (inet4Address5 == null) {
                                                inet4Address5 = (Inet4Address) broadcast;
                                                i7++;
                                            }
                                        }
                                        it2 = it;
                                    }
                                    if (inet4Address4 != null || inet4Address3 != null) {
                                        i7++;
                                    }
                                    if (inetAddress3 != null || inetAddress2 != null) {
                                        i7++;
                                    }
                                    if (i7 > 0) {
                                        f10478e = inet4Address5;
                                        if (inet4Address3 == null) {
                                            inet4Address3 = inet4Address4;
                                        }
                                        f10479f = inet4Address3;
                                        f10480g = inetAddress2 == null ? inetAddress3 : inetAddress2;
                                    }
                                } else {
                                    Enumeration<InetAddress> inetAddresses2 = networkInterfaceNextElement.getInetAddresses();
                                    while (inetAddresses2.hasMoreElements()) {
                                        InetAddress inetAddressNextElement2 = inetAddresses2.nextElement();
                                        if (inetAddressNextElement2 instanceof Inet4Address) {
                                            if (mtu > 0 && mtu < i) {
                                                i = mtu;
                                            }
                                        } else if ((inetAddressNextElement2 instanceof Inet6Address) && mtu > 0 && mtu < i3) {
                                            i3 = mtu;
                                        }
                                    }
                                }
                            }
                            i6 = -1;
                            inet4Address2 = null;
                        } catch (SocketException e6) {
                            e = e6;
                            f10474a.warn("discover the <any> interface failed!", (Throwable) e);
                        }
                    }
                } catch (SocketException e7) {
                    e = e7;
                    iMin = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    i = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    i3 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                }
                if (f10481h.isEmpty()) {
                    f10474a.info("no broadcast address found!");
                }
                if (i == 65535) {
                    i = 576;
                }
                if (i3 == 65535) {
                    i3 = 1280;
                }
                if (iMin == 65535) {
                    iMin = Math.min(i, i3);
                }
                f10476c = i;
                f10477d = i3;
                f10475b = iMin;
            }
        }
    }
}
