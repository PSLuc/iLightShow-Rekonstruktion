package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends AbstractC0525v {
    public static final int[] i;

    static {
        int[] iArr = new int[127];
        i = iArr;
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < 10; i3++) {
            i[i3 + 48] = i3;
        }
        for (int i6 = 0; i6 < 6; i6++) {
            int[] iArr2 = i;
            int i7 = i6 + 10;
            iArr2[i6 + 97] = i7;
            iArr2[i6 + 65] = i7;
        }
    }

    public static int j(int i3, byte[] bArr) {
        return (bArr[i3 + 3] & 255) | (bArr[i3] << 24) | ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0525v
    public final Object d(p015c2.f fVar, String str) throws InvalidFormatException {
        if (str.length() != 36) {
            if (str.length() != 24) {
                fVar.w0(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
                throw null;
            }
            T1.a aVar = T1.b.f5157a;
            aVar.getClass();
            p009b2.c cVar = new p009b2.c();
            aVar.b(str, cVar);
            return i(cVar.v(), fVar);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            fVar.w0(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
            throw null;
        }
        return new UUID((((long) l(str, 0, fVar)) << 32) + ((((long) m(str, 9, fVar)) << 16) | ((long) m(str, 14, fVar))), ((((long) l(str, 28, fVar)) << 32) >>> 32) | (((long) ((m(str, 19, fVar) << 16) | m(str, 24, fVar))) << 32));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0525v
    public final Object e(p015c2.f fVar, Object obj) throws MismatchedInputException {
        if (obj instanceof byte[]) {
            return i((byte[]) obj, fVar);
        }
        super.e(fVar, obj);
        throw null;
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return new UUID(0L, 0L);
    }

    public final UUID i(byte[] bArr, p015c2.f fVar) throws InvalidFormatException {
        if (bArr.length == 16) {
            return new UUID((((long) j(0, bArr)) << 32) | ((((long) j(4, bArr)) << 32) >>> 32), ((((long) j(12, bArr)) << 32) >>> 32) | (((long) j(8, bArr)) << 32));
        }
        U1.c cVar = fVar.f7252o;
        String str = "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes";
        handledType();
        throw new InvalidFormatException(cVar, str, bArr);
    }

    public final int k(String str, int i3, p015c2.f fVar) throws InvalidFormatException {
        int i6;
        char cCharAt = str.charAt(i3);
        char cCharAt2 = str.charAt(i3 + 1);
        int[] iArr = i;
        if (cCharAt <= 127 && cCharAt2 <= 127 && (i6 = (iArr[cCharAt] << 4) | iArr[cCharAt2]) >= 0) {
            return i6;
        }
        if (cCharAt > 127 || iArr[cCharAt] < 0) {
            throw fVar.N0(handledType(), str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(cCharAt), Integer.toHexString(cCharAt)));
        }
        throw fVar.N0(handledType(), str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(cCharAt2), Integer.toHexString(cCharAt2)));
    }

    public final int l(String str, int i3, p015c2.f fVar) {
        return k(str, i3 + 6, fVar) + (k(str, i3, fVar) << 24) + (k(str, i3 + 2, fVar) << 16) + (k(str, i3 + 4, fVar) << 8);
    }

    public final int m(String str, int i3, p015c2.f fVar) {
        return k(str, i3 + 2, fVar) + (k(str, i3, fVar) << 8);
    }
}
