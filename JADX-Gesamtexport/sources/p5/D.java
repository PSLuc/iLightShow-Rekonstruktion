package p5;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.GCMParameterSpec;
import org.eclipse.californium.scandium.dtls.cipher.InvalidMacException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0859y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f10912m = LoggerFactory.getLogger((Class<?>) D.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t5.b f10913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t5.a f10914l;

    public D(q5.i iVar, EnumC0852q enumC0852q, t5.b bVar, t5.a aVar) {
        super(iVar, enumC0852q);
        if (bVar == null) {
            throw new NullPointerException("Encryption key must not be null!");
        }
        if (aVar == null) {
            throw new NullPointerException("IV must not be null!");
        }
        this.f10913k = t5.c.a(bVar);
        if (aVar.i) {
            throw new IllegalStateException("secret destroyed!");
        }
        byte[] bArr = aVar.f12595h;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        t5.a aVar2 = new t5.a(bArrCopyOf, 0, bArrCopyOf.length);
        Arrays.fill(bArrCopyOf, (byte) 0);
        this.f10914l = aVar2;
    }

    @Override // p5.AbstractC0859y
    public final byte[] b(i0 i0Var, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrDoFinal;
        if (bArr == null) {
            throw new NullPointerException("Ciphertext must not be null");
        }
        int length = bArr.length;
        q5.i iVar = this.f11175h;
        if (length < iVar.b() + iVar.f11291j.f11262l) {
            throw new GeneralSecurityException("Ciphertext too short!");
        }
        int length2 = bArr.length;
        q5.e eVar = iVar.f11291j;
        int iB = (length2 - eVar.f11262l) - iVar.b();
        byte[] bArrB = i0Var.b(iB);
        byte[] bArrA = this.f10914l.a(eVar.f11262l, bArr);
        Logger logger = f10912m;
        int i = 0;
        if (logger.isTraceEnabled()) {
            logger.trace("decrypt: {} bytes", Integer.valueOf(iB));
            logger.trace("nonce: {}", m5.s.b(0, bArrA));
            logger.trace("adata: {}", m5.s.b(0, bArrB));
        }
        if (logger.isDebugEnabled() && "AES/CCM".equals(eVar.f11259h)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, eVar.f11262l);
            m5.j jVar = new m5.j(false);
            jVar.b(i0Var.f11075c, 16);
            jVar.e(i0Var.f11076d);
            byte[] bArrA2 = jVar.a();
            if (!Arrays.equals(bArrA2, bArrCopyOf)) {
                StringBuilder sb = new StringBuilder("The explicit nonce used by the sender does not match the values provided in the DTLS record");
                String str = m5.s.f10493b;
                sb.append(str);
                sb.append("Used    : ");
                sb.append(m5.s.b(0, bArrCopyOf));
                sb.append(str);
                sb.append("Expected: ");
                sb.append(m5.s.b(0, bArrA2));
                logger.debug(sb.toString());
            }
        }
        int i3 = eVar.f11262l;
        int length3 = bArr.length - i3;
        boolean zEquals = "AES/CCM".equals(eVar.f11259h);
        t5.b bVar = this.f10913k;
        if (zEquals) {
            int iB2 = iVar.b();
            Cipher cipher = (Cipher) q5.c.f11247a.a();
            int i6 = 1;
            cipher.init(1, bVar);
            int i7 = length3 - iB2;
            int blockSize = cipher.getBlockSize();
            bArrDoFinal = new byte[i7];
            byte[] bArr2 = new byte[iB2];
            q5.a aVar = new q5.a(cipher, bArrA);
            byte[] bArrZ = q5.a.z(aVar, 0);
            int i8 = i3 + i7;
            int i9 = 0;
            while (i9 < iB2) {
                bArr2[i9] = (byte) (bArr[i8 + i9] ^ bArrZ[i9]);
                i9++;
                i6 = i6;
            }
            int i10 = i6;
            int i11 = 0;
            while (i11 < i7) {
                int i12 = i10 + 1;
                byte[] bArrZ2 = q5.a.z(aVar, i10);
                int i13 = i11 + blockSize;
                if (i13 > i7) {
                    i13 = i7;
                }
                int i14 = i;
                while (i11 < i13) {
                    bArrDoFinal[i11] = (byte) (bArr[i3 + i11] ^ bArrZ2[i14]);
                    i11++;
                    i14++;
                    i = 0;
                }
                i10 = i12;
            }
            byte[] bArr3 = new q5.b(cipher, bArrA, bArrB, bArrDoFinal, iB2).f11246d;
            if (!MessageDigest.isEqual(bArr2, bArr3)) {
                InvalidMacException invalidMacException = new InvalidMacException("MAC validation failed");
                Arrays.copyOf(bArr3, bArr3.length);
                Arrays.copyOf(bArr2, iB2);
                throw invalidMacException;
            }
        } else {
            Cipher cipherC = iVar.c();
            cipherC.init(2, bVar, new GCMParameterSpec(iVar.b() * 8, bArrA));
            cipherC.updateAAD(bArrB);
            bArrDoFinal = cipherC.doFinal(bArr, i3, length3);
        }
        Arrays.fill(bArrA, (byte) 0);
        return bArrDoFinal;
    }

    @Override // p5.AbstractC0859y
    public final byte[] c(i0 i0Var, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, ShortBufferException, InvalidAlgorithmParameterException {
        byte[] bArr2;
        byte[] bArr3;
        i0Var.getClass();
        m5.j jVar = new m5.j(false);
        jVar.b(i0Var.f11075c, 16);
        jVar.e(i0Var.f11076d);
        byte[] bArrA = jVar.a();
        t5.a aVar = this.f10914l;
        aVar.getClass();
        byte[] bArrA2 = aVar.a(bArrA.length, bArrA);
        byte[] bArrB = i0Var.b(bArr.length);
        Logger logger = f10912m;
        if (logger.isTraceEnabled()) {
            logger.trace("encrypt: {} bytes", Integer.valueOf(bArr.length));
            logger.trace("nonce: {}", m5.s.b(0, bArrA2));
            logger.trace("adata: {}", m5.s.b(0, bArrB));
        }
        int length = bArrA.length;
        q5.i iVar = this.f11175h;
        boolean zEquals = "AES/CCM".equals(iVar.f11291j.f11259h);
        boolean z5 = true;
        t5.b bVar = this.f10913k;
        if (zEquals) {
            int iB = iVar.b();
            Cipher cipher = (Cipher) q5.c.f11247a.a();
            cipher.init(1, bVar);
            int blockSize = cipher.getBlockSize();
            int length2 = bArr.length;
            q5.b bVar2 = new q5.b(cipher, bArrA2, bArrB, bArr, iB);
            bArr2 = bArrA2;
            int i = length + length2;
            bArr3 = new byte[i + iB];
            q5.a aVar2 = new q5.a(cipher, bArr2);
            byte[] bArrZ = q5.a.z(aVar2, 0);
            for (int i3 = 0; i3 < iB; i3++) {
                bArr3[i3 + i] = (byte) (bVar2.f11246d[i3] ^ bArrZ[i3]);
            }
            int i6 = 1;
            int i7 = 0;
            while (i7 < length2) {
                int i8 = i6 + 1;
                byte[] bArrZ2 = q5.a.z(aVar2, i6);
                int i9 = i7 + blockSize;
                if (i9 > length2) {
                    i9 = length2;
                }
                int i10 = 0;
                while (i7 < i9) {
                    bArr3[i7 + length] = (byte) (bArr[i7] ^ bArrZ2[i10]);
                    i7++;
                    i10++;
                    z5 = z5;
                }
                i6 = i8;
            }
        } else {
            bArr2 = bArrA2;
            Cipher cipherC = iVar.c();
            cipherC.init(1, bVar, new GCMParameterSpec(iVar.b() * 8, bArr2));
            cipherC.updateAAD(bArrB);
            byte[] bArr4 = new byte[cipherC.getOutputSize(bArr.length) + length];
            cipherC.doFinal(bArr, 0, bArr.length, bArr4, length);
            bArr3 = bArr4;
        }
        Arrays.fill(bArr2, (byte) 0);
        System.arraycopy(bArrA, 0, bArr3, 0, bArrA.length);
        logger.trace("==> {} bytes", Integer.valueOf(bArr3.length));
        return bArr3;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        t5.c.b(this.f10913k);
        t5.c.c(this.f10914l);
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        Logger logger = t5.c.f12598a;
        t5.a aVar = this.f10914l;
        if (aVar != null && !aVar.isDestroyed()) {
            return false;
        }
        t5.b bVar = this.f10913k;
        return bVar != null ? bVar.isDestroyed() : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DtlsAeadConnectionState:");
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\tCipher suite: ");
        sb.append(this.f11175h);
        sb.append(str);
        sb.append("\tCompression method: ");
        sb.append(this.i);
        sb.append(str);
        sb.append("\tIV: ");
        sb.append(this.f10914l == null ? "null" : "not null");
        sb.append(str);
        sb.append("\tEncryption key: ");
        sb.append(this.f10913k == null ? "null" : "not null");
        return sb.toString();
    }
}
