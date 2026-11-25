package m5;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f10494c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f10492a = Pattern.compile("^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10493b = System.getProperty("line.separator");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f10495d = "0123456789ABCDEF".toCharArray();

    static {
        boolean z5 = false;
        try {
            if (InetSocketAddress.class.getMethod("getHostString", null) != null) {
                z5 = true;
            }
        } catch (NoSuchMethodException unused) {
        }
        f10494c = z5;
        s.class.getPackage().getImplementationVersion();
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? "" : b(0, bArr);
    }

    public static String b(int i, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "--";
        }
        if (i == 0 || i > bArr.length) {
            i = bArr.length;
        }
        StringBuilder sb = new StringBuilder(i * 2);
        for (int i3 = 0; i3 < i; i3++) {
            byte b6 = bArr[i3];
            char[] cArr = f10495d;
            sb.append(cArr[(b6 & 255) >>> 4]);
            sb.append(cArr[b6 & 15]);
        }
        return sb.toString();
    }

    public static String c(String str) {
        if (str == null) {
            return "";
        }
        return (str.isEmpty() || str.endsWith(" ")) ? str : str.concat(" ");
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        String hostAddress;
        if (inetSocketAddress == null) {
            return null;
        }
        if (f10494c) {
            hostAddress = inetSocketAddress.getHostString();
        } else {
            InetAddress address = inetSocketAddress.getAddress();
            hostAddress = address != null ? address.getHostAddress() : "<unresolved>";
        }
        if (inetSocketAddress.getAddress() instanceof Inet6Address) {
            StringBuilder sbW = p012c.k.w("[", hostAddress, "]:");
            sbW.append(inetSocketAddress.getPort());
            return sbW.toString();
        }
        return hostAddress + ":" + inetSocketAddress.getPort();
    }
}
