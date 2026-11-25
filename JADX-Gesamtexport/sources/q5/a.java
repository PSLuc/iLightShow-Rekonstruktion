package q5;

import B.AbstractC0013g0;
import androidx.datastore.preferences.protobuf.AbstractC0425j;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0425j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cipher f11242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11244e;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Cipher cipher, byte[] bArr) {
        int blockSize = cipher.getBlockSize();
        super(blockSize);
        this.f11242c = cipher;
        int length = bArr.length;
        this.f11244e = length;
        int i = (blockSize - 1) - length;
        if (i >= 2 && i <= 8) {
            this.f11243d = new byte[blockSize];
            byte[] bArr2 = (byte[]) this.f6882b;
            bArr2[0] = (byte) (i - 1);
            System.arraycopy(bArr, 0, bArr2, 1, length);
            return;
        }
        StringBuilder sb = new StringBuilder("Nonce length ");
        sb.append(length);
        sb.append(" invalid for blocksize ");
        sb.append(blockSize);
        sb.append(" (valid length [");
        sb.append(blockSize - 9);
        sb.append("-");
        throw new IllegalArgumentException(AbstractC0013g0.l(sb, blockSize - 3, "])"));
    }

    public static byte[] z(a aVar, int i) throws ShortBufferException {
        byte[] bArr;
        int i3 = aVar.f11244e;
        int i6 = i3 + 1;
        int i7 = aVar.f6881a;
        int i8 = i;
        int i9 = i7;
        while (true) {
            bArr = (byte[]) aVar.f6882b;
            if (i9 <= i6) {
                break;
            }
            i9--;
            bArr[i9] = (byte) i8;
            i8 >>>= 8;
        }
        if (i8 == 0) {
            Cipher cipher = aVar.f11242c;
            byte[] bArr2 = aVar.f11243d;
            cipher.update(bArr, 0, i7, bArr2);
            return bArr2;
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" too large for nonce ");
        sb.append(i3);
        sb.append(" and blocksize ");
        throw new IllegalArgumentException(AbstractC0013g0.l(sb, i7, " bytes."));
    }
}
