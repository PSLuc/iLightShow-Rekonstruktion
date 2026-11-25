package okhttp3;

import E4.k;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Dns {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Companion.DnsSystem();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String str) throws UnknownHostException {
                k.f("hostname", str);
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    k.e("getAllByName(hostname)", allByName);
                    return p089q4.k.t0(allByName);
                } catch (NullPointerException e6) {
                    UnknownHostException unknownHostException = new UnknownHostException(k.l("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e6);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    List<InetAddress> lookup(String str);
}
