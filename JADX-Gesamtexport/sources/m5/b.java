package m5;

import O1.C0313f;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f10426a = {42, -122, 72, -122, -9, 13, 1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f10427b = {42, -122, 72, -122, -9, 13, 1, 3, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f10428c = {42, -122, 72, -50, 56, 4, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f10429d = {42, -122, 72, -50, 61, 2, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f10430e = {43, 101, 112};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f10431f = {43, 101, 113};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0313f f10432g = new C0313f(48, "SEQUENCE", 65536);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f10433h = new a(6, "OID", 32);
    public static final Logger i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Provider f10434j;

    static {
        Provider provider;
        Logger logger = LoggerFactory.getLogger((Class<?>) b.class);
        i = logger;
        Object e6 = null;
        try {
            provider = KeyFactory.getInstance("EdDSA").getProvider();
            try {
                logger.trace("EdDSA from jvm {}", provider.getName());
            } catch (NoSuchAlgorithmException e7) {
                e = e7;
                String str = "net.i2p.crypto.eddsa".replace('.', '_') + "_disable";
                Pattern pattern = s.f10492a;
                String property = System.getenv(str);
                if (property == null || property.isEmpty()) {
                    property = System.getProperty(str);
                }
                if (Boolean.parseBoolean(property)) {
                    i.trace("EdDSA not available from jvm!", (Throwable) e);
                } else {
                    try {
                        Provider provider2 = (Provider) Class.forName("net.i2p.crypto.eddsa.EdDSASecurityProvider").newInstance();
                        try {
                            i.trace("EdDSA from {}", "net.i2p.crypto.eddsa");
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
                            e6 = e8;
                        }
                        provider = provider2;
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e9) {
                        e6 = e9;
                    }
                    if (provider == null) {
                        i.trace("{} is not available!", "net.i2p.crypto.eddsa", e6);
                    }
                }
            }
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            provider = null;
        }
        f10434j = provider;
    }

    public static String a(String str, String str2) {
        String str3 = "OID.1.3.101.112";
        if (!str.equalsIgnoreCase("ED25519") && !str.equalsIgnoreCase("1.3.101.112") && !str.equalsIgnoreCase("OID.1.3.101.112")) {
            str3 = "OID.1.3.101.113";
            if (!str.equalsIgnoreCase("ED448") && !str.equalsIgnoreCase("1.3.101.113") && !str.equalsIgnoreCase("OID.1.3.101.113")) {
                return str.equalsIgnoreCase("EdDSA") ? "EdDSA" : str2;
            }
        }
        return str3;
    }

    public static String b(byte[] bArr) {
        h hVar = new h(bArr, false);
        C0313f c0313f = f10432g;
        h hVarD = hVar.d(c0313f.b(hVar));
        h hVarD2 = hVarD.d(c0313f.b(hVarD));
        byte[] bArrF = hVarD2.f(f10433h.b(hVarD2));
        if (Arrays.equals(bArrF, f10429d)) {
            return "EC";
        }
        if (Arrays.equals(bArrF, f10426a)) {
            return "RSA";
        }
        if (Arrays.equals(bArrF, f10428c)) {
            return "DSA";
        }
        if (Arrays.equals(bArrF, f10427b)) {
            return "DH";
        }
        if (Arrays.equals(bArrF, f10430e)) {
            return "ED25519";
        }
        if (Arrays.equals(bArrF, f10431f)) {
            return "ED448";
        }
        return null;
    }
}
