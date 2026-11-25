package q5;

import B.AbstractC0013g0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.KeyAgreement;
import javax.security.auth.Destroyable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Destroyable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f11331k = LoggerFactory.getLogger((Class<?>) x.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o f11332l = new o("EC", 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o f11333m = new o("XDH", 3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f11334n = new s("EC");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f11335o = new s("XDH");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final o f11336p = new o("ECDH", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o f11337q = new o("XDH", 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Class f11338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Method f11339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Method f11340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Method f11341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Constructor f11342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final HashMap f11343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashMap f11344x;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f11345h;
    public PrivateKey i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f11346j;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<?> cls;
        Constructor<?> constructor;
        Object method;
        Object method2;
        Method method3;
        Method method4;
        Method method5 = null;
        try {
            cls = Class.forName("java.security.spec.XECPublicKeySpec");
            try {
                constructor = cls.getConstructor(AlgorithmParameterSpec.class, BigInteger.class);
                try {
                    cls = Class.forName("java.security.spec.NamedParameterSpec");
                    method = cls.getMethod("getName", null);
                    try {
                        cls = Class.forName("java.security.interfaces.XECPublicKey");
                        method2 = cls.getMethod("getU", null);
                        try {
                            method5 = cls.getMethod("getParams", null);
                            method4 = method;
                            method3 = method2;
                        } catch (Throwable unused) {
                            f11331k.info("X25519/X448 not supported!");
                            method4 = method;
                            method3 = method2;
                        }
                    } catch (Throwable unused2) {
                        method2 = null;
                    }
                } catch (Throwable unused3) {
                    method = null;
                    method2 = method;
                    f11331k.info("X25519/X448 not supported!");
                    method4 = method;
                    method3 = method2;
                    f11338r = cls;
                    f11339s = method3;
                    f11340t = method5;
                    f11341u = method4;
                    f11342v = constructor;
                    f11343w = new HashMap();
                    f11344x = new HashMap();
                }
            } catch (Throwable unused4) {
                constructor = null;
                method = constructor;
                method2 = method;
                f11331k.info("X25519/X448 not supported!");
                method4 = method;
                method3 = method2;
                f11338r = cls;
                f11339s = method3;
                f11340t = method5;
                f11341u = method4;
                f11342v = constructor;
                f11343w = new HashMap();
                f11344x = new HashMap();
            }
        } catch (Throwable unused5) {
            cls = null;
            constructor = null;
        }
        f11338r = cls;
        f11339s = method3;
        f11340t = method5;
        f11341u = method4;
        f11342v = constructor;
        f11343w = new HashMap();
        f11344x = new HashMap();
    }

    public x(w wVar) throws GeneralSecurityException {
        KeyPair keyPairGenerateKeyPair;
        boolean zEquals = wVar.i.equals("EC");
        String str = wVar.i;
        if (zEquals) {
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) f11332l.b();
            keyPairGenerator.initialize(new ECGenParameterSpec(wVar.name()), (SecureRandom) m.f11314b.get());
            keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        } else {
            if (!str.equals("XDH")) {
                throw new GeneralSecurityException(wVar.name() + " not supported by KeyPairGenerator!");
            }
            KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) f11333m.b();
            keyPairGenerator2.initialize(new ECGenParameterSpec(wVar.name()), (SecureRandom) m.f11314b.get());
            keyPairGenerateKeyPair = keyPairGenerator2.generateKeyPair();
        }
        this.i = keyPairGenerateKeyPair.getPrivate();
        keyPairGenerateKeyPair.getPublic();
        this.f11345h = wVar;
        PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
        try {
            boolean zEquals2 = str.equals("EC");
            int i = wVar.f11328j;
            byte[] bArrB = zEquals2 ? b(((ECPublicKey) publicKey).getW(), i) : str.equals("XDH") ? e(i, d(publicKey).toByteArray()) : null;
            if (bArrB != null) {
                a("OUT: ", publicKey, bArrB);
                this.f11346j = bArrB;
            } else {
                throw new GeneralSecurityException("DHE: failed to encoded point! " + wVar.name());
            }
        } catch (RuntimeException e6) {
            throw new GeneralSecurityException("DHE: failed to encoded point! " + wVar.name(), e6);
        }
    }

    public static byte[] b(ECPoint eCPoint, int i) {
        byte[] byteArray = eCPoint.getAffineX().toByteArray();
        byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
        int i3 = 0;
        while (i3 < byteArray.length && byteArray[i3] == 0) {
            i3++;
        }
        int length = byteArray.length - i3;
        int i6 = 0;
        while (i6 < byteArray2.length && byteArray2[i6] == 0) {
            i6++;
        }
        int length2 = byteArray2.length - i6;
        if (length <= i && length2 <= i) {
            int i7 = (i * 2) + 1;
            byte[] bArr = new byte[i7];
            bArr[0] = 4;
            System.arraycopy(byteArray, i3, bArr, (i + 1) - length, length);
            System.arraycopy(byteArray2, i6, bArr, i7 - length2, length2);
            return bArr;
        }
        throw new IllegalArgumentException("ec point exceeds size! " + length + "," + length2 + " > " + i);
    }

    public static byte[] e(int i, byte[] bArr) {
        int i3 = 0;
        while (i3 < bArr.length && bArr[i3] == 0) {
            i3++;
        }
        int length = bArr.length - i3;
        if (length > i) {
            throw new IllegalArgumentException(AbstractC0013g0.g("big integer array exceeds size! ", length, i, " > "));
        }
        byte[] bArr2 = new byte[i];
        for (int i6 = 0; i6 < length; i6++) {
            bArr2[(length - 1) - i6] = bArr[i6 + i3];
        }
        return bArr2;
    }

    public final void a(String str, PublicKey publicKey, byte[] bArr) throws GeneralSecurityException {
        Logger logger = f11331k;
        if (logger.isDebugEnabled()) {
            byte[] encoded = publicKey.getEncoded();
            String strA = m5.s.a(encoded);
            String strA2 = m5.s.a(bArr);
            if (strA2.length() < strA.length()) {
                strA2 = String.format("%" + strA.length() + "s", strA2);
            }
            logger.debug("{}ASN1 encoded '{}'", str, strA);
            logger.debug("{}DHE  encoded '{}'", str, strA2);
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[(bArr.length - i) - 1] != encoded[(encoded.length - i) - 1]) {
                    throw new GeneralSecurityException("DHE: failed to encoded point! " + this.f11345h.name() + ", position: " + i);
                }
            }
        }
    }

    public final t5.b c(byte[] bArr) throws GeneralSecurityException {
        PublicKey publicKeyGeneratePublic;
        KeyAgreement keyAgreement;
        if (bArr == null) {
            throw new NullPointerException("encoded point must not be null!");
        }
        w wVar = this.f11345h;
        int i = wVar.f11328j;
        String str = wVar.i;
        if (str.equals("EC")) {
            int length = bArr.length - 1;
            if (bArr[0] != 4 || length % 2 != 0 || length / 2 != i) {
                throw new GeneralSecurityException("DHE: failed to decoded point! " + wVar.name());
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 1, bArr2, 0, i);
            BigInteger bigInteger = new BigInteger(1, bArr2);
            System.arraycopy(bArr, i + 1, bArr2, 0, i);
            publicKeyGeneratePublic = ((KeyFactory) f11334n.b()).generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, new BigInteger(1, bArr2)), ((ECPrivateKey) this.i).getParams()));
        } else {
            BigInteger bigInteger2 = new BigInteger(1, e(i, bArr));
            String strName = wVar.name();
            Constructor constructor = f11342v;
            if (constructor == null) {
                throw new GeneralSecurityException(wVar.name() + " not supported by JRE!");
            }
            try {
                publicKeyGeneratePublic = ((KeyFactory) f11335o.b()).generatePublic((KeySpec) constructor.newInstance(new ECGenParameterSpec(strName), bigInteger2));
            } catch (Exception e6) {
                throw new GeneralSecurityException(wVar.name() + " not supported by JRE!", e6);
            }
        }
        a("IN: ", publicKeyGeneratePublic, bArr);
        if (str.equals("EC")) {
            keyAgreement = (KeyAgreement) f11336p.b();
        } else {
            keyAgreement = str.equals("XDH") ? (KeyAgreement) f11337q.b() : null;
        }
        keyAgreement.init(this.i);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        byte[] bArrGenerateSecret = keyAgreement.generateSecret();
        Logger logger = t5.c.f12598a;
        t5.b bVar = new t5.b(0, bArrGenerateSecret == null ? 0 : bArrGenerateSecret.length, "TlsPremasterSecret", bArrGenerateSecret);
        Arrays.fill(bArrGenerateSecret, (byte) 0);
        return bVar;
    }

    public final BigInteger d(PublicKey publicKey) throws GeneralSecurityException {
        w wVar = this.f11345h;
        Method method = f11339s;
        if (method == null) {
            throw new GeneralSecurityException(wVar.name() + " not supported by JRE!");
        }
        try {
            return (BigInteger) method.invoke(publicKey, null);
        } catch (Exception e6) {
            throw new GeneralSecurityException(wVar.name() + " not supported by JRE!", e6);
        }
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.i = null;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.i == null;
    }
}
