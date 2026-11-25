package p5;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import org.eclipse.californium.scandium.dtls.cipher.InvalidMacException;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0859y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t5.b f10915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t5.b f10916l;

    public E(q5.i iVar, EnumC0852q enumC0852q, t5.b bVar, t5.b bVar2) {
        super(iVar, enumC0852q);
        if (bVar == null) {
            throw new NullPointerException("Encryption key must not be null!");
        }
        if (bVar2 == null) {
            throw new NullPointerException("MAC key must not be null!");
        }
        this.f10915k = t5.c.a(bVar);
        this.f10916l = t5.c.a(bVar2);
    }

    @Override // p5.AbstractC0859y
    public final byte[] b(i0 i0Var, byte[] bArr) throws GeneralSecurityException {
        MessageDigest messageDigest;
        char c6 = 2;
        if (bArr == null) {
            throw new NullPointerException("Ciphertext must not be null");
        }
        int length = bArr.length;
        q5.i iVar = this.f11175h;
        int i = iVar.f11291j.f11262l;
        if (length % i != 0) {
            throw new GeneralSecurityException("Ciphertext doesn't fit block size!");
        }
        if (bArr.length < iVar.b() + i + 1) {
            throw new GeneralSecurityException("Ciphertext too short!");
        }
        byte[] bArrB = i0Var.b(0);
        byte[] bArr2 = q5.d.f11248a;
        int length2 = bArr.length;
        q5.g gVar = iVar.f11292k;
        int iMax = Math.max(gVar.f11277k, HueLog.LogComponent.STREAMDTLS) + length2;
        byte[] bArr3 = new byte[iMax];
        int i3 = iVar.f11291j.f11262l;
        Cipher cipherC = iVar.c();
        cipherC.init(2, this.f10915k, new IvParameterSpec(bArr, 0, i3));
        int iDoFinal = cipherC.doFinal(bArr, i3, bArr.length - i3, bArr3);
        System.arraycopy(q5.d.f11248a, 0, bArr3, iDoFinal, gVar.f11277k);
        int iB = iVar.b();
        int i6 = bArr3[iDoFinal - 1] & 255;
        int i7 = (iDoFinal - iB) - 1;
        int i8 = i7 - i6;
        if (i8 < 0) {
            i8 = i7;
            i6 = 0;
        }
        int i9 = i8 + iB;
        if (iMax < i9 + 257) {
            throw new IllegalArgumentException("data must contain 257 bytes from offset on!");
        }
        byte b6 = (byte) i6;
        byte b7 = 0;
        for (int i10 = 0; i10 <= i6; i10++) {
            b7 = (byte) (b7 | (b6 ^ bArr3[i9 + i10]));
        }
        int i11 = i6 + 1;
        byte b8 = 0;
        while (i11 < 256) {
            char c7 = c6;
            byte b9 = (byte) (b8 | (b6 ^ bArr3[i9 + i11]));
            i11++;
            b8 = b9;
            c6 = c7;
        }
        int i12 = iMax - 1;
        bArr3[i12] = (byte) (bArr3[i12] ^ b8);
        if (b7 == 0) {
            i7 = i8;
        } else {
            i6 = 0;
        }
        int length3 = bArrB.length;
        bArrB[length3 - 2] = (byte) ((i7 >> 8) & 255);
        bArrB[length3 - 1] = (byte) (i7 & 255);
        q5.o oVar = gVar.f11280n;
        if (oVar != null) {
            messageDigest = (MessageDigest) oVar.a();
            messageDigest.reset();
        } else {
            messageDigest = null;
        }
        messageDigest.reset();
        Mac macA = gVar.a();
        macA.init(this.f10916l);
        macA.update(bArrB);
        macA.update(bArr3, 0, i7);
        byte[] bArrDoFinal = macA.doFinal();
        macA.reset();
        int length4 = bArrB.length + i7 + gVar.f11276j;
        int i13 = gVar.f11277k;
        messageDigest.update(bArr3, i7, ((((i6 + length4) / i13) - (length4 / i13)) * i13) + 1);
        messageDigest.reset();
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, i7, iB + i7);
        boolean zIsEqual = MessageDigest.isEqual(bArrCopyOfRange, bArrDoFinal);
        Arrays.fill(bArrDoFinal, (byte) 0);
        Arrays.fill(bArrCopyOfRange, (byte) 0);
        byte[] bArrCopyOf = zIsEqual ? Arrays.copyOf(bArr3, i7) : null;
        Arrays.fill(bArr3, (byte) 0);
        if (zIsEqual) {
            return bArrCopyOf;
        }
        throw new InvalidMacException();
    }

    @Override // p5.AbstractC0859y
    public final byte[] c(i0 i0Var, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, ShortBufferException {
        byte[] bArrB = i0Var.b(bArr.length);
        byte[] bArr2 = q5.d.f11248a;
        m5.j jVar = new m5.j(true);
        jVar.c(bArr);
        q5.i iVar = this.f11175h;
        Mac macA = iVar.f11292k.a();
        int length = bArr.length;
        macA.init(this.f10916l);
        macA.update(bArrB);
        macA.update(bArr, 0, length);
        byte[] bArrDoFinal = macA.doFinal();
        macA.reset();
        jVar.c(bArrDoFinal);
        Arrays.fill(bArrDoFinal, (byte) 0);
        int iB = iVar.b() + bArr.length + 1;
        int i = iVar.f11291j.f11262l;
        int i3 = iB % i;
        int i6 = i3 > 0 ? i - i3 : 0;
        byte[] bArr3 = new byte[i6 + 1];
        Arrays.fill(bArr3, (byte) i6);
        jVar.c(bArr3);
        Arrays.fill(bArr3, (byte) 0);
        Cipher cipherC = iVar.c();
        cipherC.init(1, this.f10915k);
        byte[] iv = cipherC.getIV();
        byte[] bArrA = jVar.a();
        ByteArrayOutputStream byteArrayOutputStream = jVar.f10452a;
        try {
            byteArrayOutputStream.close();
        } catch (IOException e6) {
            m5.j.f10451d.warn("{}.close() failed!", byteArrayOutputStream.getClass(), e6);
        }
        byte[] bArrCopyOf = Arrays.copyOf(iv, iv.length + bArrA.length);
        cipherC.doFinal(bArrA, 0, bArrA.length, bArrCopyOf, iv.length);
        return bArrCopyOf;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        t5.c.b(this.f10915k);
        t5.c.b(this.f10916l);
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        Logger logger = t5.c.f12598a;
        t5.b bVar = this.f10916l;
        if (!(bVar != null ? bVar.isDestroyed() : true)) {
            return false;
        }
        t5.b bVar2 = this.f10915k;
        return bVar2 != null ? bVar2.isDestroyed() : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DtlsBlockConnectionState:");
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\tCipher suite: ");
        sb.append(this.f11175h);
        sb.append(str);
        sb.append("\tCompression method: ");
        sb.append(this.i);
        sb.append(str);
        sb.append("\tMAC key: ");
        sb.append(this.f10916l == null ? "null" : "not null");
        sb.append(str);
        sb.append("\tEncryption key: ");
        sb.append(this.f10915k == null ? "null" : "not null");
        return sb.toString();
    }
}
