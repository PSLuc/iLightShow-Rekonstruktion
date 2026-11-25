package q5;

import B.AbstractC0013g0;
import androidx.datastore.preferences.protobuf.AbstractC0425j;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0425j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cipher f11245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11246d;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Cipher cipher, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws ShortBufferException {
        int blockSize = cipher.getBlockSize();
        super(blockSize);
        this.f11245c = cipher;
        int length = bArr3.length;
        int length2 = bArr2.length;
        int length3 = bArr.length;
        int i3 = (blockSize - 1) - length3;
        int i6 = 2;
        if (i3 < 2 || i3 > 8) {
            StringBuilder sb = new StringBuilder("Nonce length ");
            sb.append(length3);
            sb.append(" invalid for blocksize ");
            sb.append(blockSize);
            sb.append(" (valid length [");
            sb.append(blockSize - 9);
            sb.append("-");
            throw new IllegalArgumentException(AbstractC0013g0.l(sb, blockSize - 3, "])"));
        }
        int i7 = length2 > 0 ? 1 : 0;
        byte[] bArr4 = (byte[]) this.f6882b;
        bArr4[0] = (byte) ((((i - 2) / 2) * 8) + (i7 * 64) + (i3 - 1));
        System.arraycopy(bArr, 0, bArr4, 1, length3);
        int i8 = length3 + 1;
        int i9 = blockSize;
        int i10 = length;
        while (i9 > i8) {
            i9--;
            ((byte[]) this.f6882b)[i9] = (byte) i10;
            i10 >>>= 8;
        }
        if (i10 != 0) {
            StringBuilder sb2 = new StringBuilder("Length ");
            sb2.append(length);
            sb2.append(" too large for nonce ");
            sb2.append(length3);
            sb2.append(" and blocksize ");
            throw new IllegalArgumentException(AbstractC0013g0.l(sb2, blockSize, " bytes."));
        }
        byte[] bArr5 = (byte[]) this.f6882b;
        cipher.update(bArr5, 0, blockSize, bArr5);
        if (length2 > 0) {
            if (length2 <= 0 || length2 >= 65280) {
                A(0, 2, 65534);
                A(2, 6, length2);
                i6 = 6;
            } else {
                A(0, 2, length2);
            }
            z(i6, bArr2);
        }
        z(0, bArr3);
        this.f11246d = Arrays.copyOf((byte[]) this.f6882b, i);
    }

    public final void A(int i, int i3, int i6) {
        while (i3 > i) {
            i3--;
            byte[] bArr = (byte[]) this.f6882b;
            bArr[i3] = (byte) (bArr[i3] ^ ((byte) i6));
            i6 >>>= 8;
        }
    }

    public final void z(int i, byte[] bArr) throws ShortBufferException {
        byte[] bArr2;
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i6 = this.f6881a;
            int i7 = (i3 + i6) - i;
            if (i7 > length) {
                i7 = length;
            }
            while (true) {
                bArr2 = (byte[]) this.f6882b;
                if (i3 < i7) {
                    bArr2[i] = (byte) (bArr2[i] ^ bArr[i3]);
                    i3++;
                    i++;
                }
            }
            this.f11245c.update(bArr2, 0, i6, bArr2);
            i = 0;
        }
    }
}
