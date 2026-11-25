package p5;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends m5.d {
    /* JADX WARN: Illegal instructions before constructor call */
    public f0() {
        byte[] bArr = new byte[32];
        ((SecureRandom) q5.m.f11314b.get()).nextBytes(bArr);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        bArr[0] = (byte) (iCurrentTimeMillis >> 24);
        bArr[1] = (byte) (iCurrentTimeMillis >> 16);
        bArr[2] = (byte) (iCurrentTimeMillis >> 8);
        bArr[3] = (byte) iCurrentTimeMillis;
        this(bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\t\t\tGMT Unix Time: ");
        byte[] bArr = this.f10440a;
        sb.append(new Date(((long) (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255))) * 1000));
        String str = m5.s.f10493b;
        sb.append(str);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 4, 32);
        sb.append("\t\t\tRandom Bytes: ");
        sb.append(m5.s.a(bArrCopyOfRange));
        sb.append(str);
        return sb.toString();
    }

    public f0(byte[] bArr) {
        super(bArr, 255);
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Random bytes array's length must be 32");
        }
    }
}
