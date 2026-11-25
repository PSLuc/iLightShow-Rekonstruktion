package q5;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes.dex */
public enum w {
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe6144(1, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_char2_curves(2, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect193r1(3, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect193r1(4, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect193r2(5, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect233k1(6, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect233r1(7, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect239k1(8, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect283k1(9, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect283r1(10, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect409k1(11, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect409r1(12, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect571k1(13, false),
    /* JADX INFO: Fake field, exist only in values array */
    sect571r1(14, false),
    /* JADX INFO: Fake field, exist only in values array */
    secp160k1(15, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_char2_curves(16, false),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe6144(17, false),
    /* JADX INFO: Fake field, exist only in values array */
    secp224r1(18, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_char2_curves(19, false),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe6144(20, false),
    /* JADX INFO: Fake field, exist only in values array */
    secp224r1(21, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_char2_curves(22, false),
    secp256r1(23, true),
    secp384r1(24, true),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_char2_curves(25, false),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe6144(26, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_prime_curves(27, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_char2_curves(28, false),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe6144(HueLog.LogComponent.STREAMDTLS, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_char2_curves(257, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_prime_curves(258, false),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe6144(259, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_char2_curves(260, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_prime_curves(65281, false),
    /* JADX INFO: Fake field, exist only in values array */
    arbitrary_explicit_char2_curves(65282, false),
    X25519(29, 32),
    X448(30, 56);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11327h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f11329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f11330l;

    w(int i, boolean z5) {
        int fieldSize;
        EllipticCurve curve;
        this.f11327h = i;
        this.i = "EC";
        this.f11330l = z5;
        try {
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) x.f11332l.b();
            keyPairGenerator.initialize(new ECGenParameterSpec(name()));
            curve = ((ECPublicKey) keyPairGenerator.generateKeyPair().getPublic()).getParams().getCurve();
            fieldSize = (curve.getField().getFieldSize() + 7) / 8;
            try {
                x.f11344x.put(curve, this);
            } catch (Throwable th) {
                th = th;
                x.f11331k.trace("Group [{}] is not supported by JRE! {}", name(), th.getMessage());
                curve = null;
            }
        } catch (Throwable th2) {
            th = th2;
            fieldSize = 0;
        }
        this.f11328j = fieldSize;
        this.f11329k = curve != null;
        x.f11343w.put(Integer.valueOf(i), this);
    }

    public static w a(PublicKey publicKey) {
        Method method;
        if (publicKey != null) {
            if (publicKey instanceof ECPublicKey) {
                return (w) x.f11344x.get(((ECPublicKey) publicKey).getParams().getCurve());
            }
            Class cls = x.f11338r;
            if (cls == null || !cls.isInstance(publicKey)) {
                String strA = m5.b.a(publicKey.getAlgorithm(), null);
                if ("OID.1.3.101.112".equals(strA) || "EdDSA".equalsIgnoreCase(strA)) {
                    return X25519;
                }
                if ("OID.1.3.101.113".equals(strA)) {
                    return X448;
                }
                x.f11331k.warn("No supported curve {}/{}", publicKey.getAlgorithm(), strA);
                return null;
            }
            try {
                Method method2 = x.f11340t;
                if (method2 == null || (method = x.f11341u) == null) {
                    throw new GeneralSecurityException("X25519/X448 not supported by JRE!");
                }
                try {
                    return valueOf((String) method.invoke(method2.invoke(publicKey, null), null));
                } catch (Exception unused) {
                    throw new GeneralSecurityException("X25519/X448 not supported by JRE!");
                }
            } catch (GeneralSecurityException unused2) {
            }
        }
        return null;
    }

    w(int i, int i3) {
        this.f11327h = i;
        this.i = "XDH";
        this.f11328j = i3;
        boolean z5 = true;
        this.f11330l = true;
        try {
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) x.f11333m.b();
            keyPairGenerator.initialize(new ECGenParameterSpec(name()));
            keyPairGenerator.generateKeyPair();
        } catch (Throwable th) {
            x.f11331k.trace("Group [{}] is not supported by JRE! {}", name(), th.getMessage());
            z5 = false;
        }
        this.f11329k = z5;
        x.f11343w.put(Integer.valueOf(i), this);
    }
}
