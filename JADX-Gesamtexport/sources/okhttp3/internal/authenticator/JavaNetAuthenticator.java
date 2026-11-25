package okhttp3.internal.authenticator;

import E4.g;
import E4.k;
import com.spotify.sdk.android.auth.LoginActivity;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import p089q4.l;

/* JADX INFO: loaded from: classes.dex */
public final class JavaNetAuthenticator implements Authenticator {
    private final Dns defaultDns;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final InetAddress connectToInetAddress(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
            return (InetAddress) l.X(dns.lookup(httpUrl.host()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        k.e("address() as InetSocketAddress).address", address);
        return address;
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) {
        Address address;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        k.f(LoginActivity.RESPONSE_KEY, response);
        List<Challenge> listChallenges = response.challenges();
        Request request = response.request();
        HttpUrl httpUrlUrl = request.url();
        boolean z5 = response.code() == 407;
        Proxy proxy = route == null ? null : route.proxy();
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : listChallenges) {
            if ("Basic".equalsIgnoreCase(challenge.scheme())) {
                Dns dns = (route == null || (address = route.address()) == null) ? null : address.dns();
                if (dns == null) {
                    dns = this.defaultDns;
                }
                if (z5) {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), connectToInetAddress(proxy, httpUrlUrl, dns), inetSocketAddress.getPort(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    String strHost = httpUrlUrl.host();
                    k.e("proxy", proxy);
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(strHost, connectToInetAddress(proxy, httpUrlUrl, dns), httpUrlUrl.port(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), java.net.Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z5 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    k.e("auth.userName", userName);
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    k.e("auth.password", password);
                    return request.newBuilder().header(str, Credentials.basic(userName, new String(password), challenge.charset())).build();
                }
            }
        }
        return null;
    }

    public JavaNetAuthenticator(Dns dns) {
        k.f("defaultDns", dns);
        this.defaultDns = dns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i, g gVar) {
        this((i & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
