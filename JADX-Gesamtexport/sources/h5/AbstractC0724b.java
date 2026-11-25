package h5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

/* JADX INFO: renamed from: h5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0724b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0730h f9339a = new C0730h();

    public static final boolean a(int i, int i3, int i6, byte[] bArr, byte[] bArr2) {
        E4.k.f("a", bArr);
        E4.k.f("b", bArr2);
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i] != bArr2[i7 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final F b(K k3) {
        E4.k.f("<this>", k3);
        return new F(k3);
    }

    public static final G c(M m6) {
        E4.k.f("<this>", m6);
        return new G(m6);
    }

    public static void d(long j4, C0732j c0732j, int i, ArrayList arrayList, int i3, int i6, ArrayList arrayList2) {
        int i7;
        int i8;
        ArrayList arrayList3;
        long j6;
        int i9;
        int i10 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i6) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i11 = i3; i11 < i6; i11++) {
            if (((C0735m) arrayList4.get(i11)).d() < i10) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0735m c0735m = (C0735m) arrayList.get(i3);
        C0735m c0735m2 = (C0735m) arrayList4.get(i6 - 1);
        if (i10 == c0735m.d()) {
            int iIntValue = ((Number) arrayList5.get(i3)).intValue();
            int i12 = i3 + 1;
            C0735m c0735m3 = (C0735m) arrayList4.get(i12);
            i7 = i12;
            i8 = iIntValue;
            c0735m = c0735m3;
        } else {
            i7 = i3;
            i8 = -1;
        }
        if (c0735m.i(i10) == c0735m2.i(i10)) {
            int iMin = Math.min(c0735m.d(), c0735m2.d());
            int i13 = 0;
            for (int i14 = i10; i14 < iMin && c0735m.i(i14) == c0735m2.i(i14); i14++) {
                i13++;
            }
            long j7 = 4;
            long j8 = (c0732j.i / j7) + j4 + ((long) 2) + ((long) i13) + 1;
            c0732j.c0(-i13);
            c0732j.c0(i8);
            int i15 = i10 + i13;
            while (i10 < i15) {
                c0732j.c0(c0735m.i(i10) & 255);
                i10++;
            }
            if (i7 + 1 == i6) {
                if (i15 != ((C0735m) arrayList4.get(i7)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0732j.c0(((Number) arrayList5.get(i7)).intValue());
                return;
            } else {
                C0732j c0732j2 = new C0732j();
                c0732j.c0(((int) ((c0732j2.i / j7) + j8)) * (-1));
                d(j8, c0732j2, i15, arrayList4, i7, i6, arrayList5);
                c0732j.r(c0732j2);
                return;
            }
        }
        int i16 = 1;
        for (int i17 = i7 + 1; i17 < i6; i17++) {
            if (((C0735m) arrayList4.get(i17 - 1)).i(i10) != ((C0735m) arrayList4.get(i17)).i(i10)) {
                i16++;
            }
        }
        long j9 = 4;
        long j10 = (c0732j.i / j9) + j4 + ((long) 2) + ((long) (i16 * 2));
        c0732j.c0(i16);
        c0732j.c0(i8);
        for (int i18 = i7; i18 < i6; i18++) {
            int i19 = ((C0735m) arrayList4.get(i18)).i(i10);
            if (i18 == i7 || i19 != ((C0735m) arrayList4.get(i18 - 1)).i(i10)) {
                c0732j.c0(i19 & 255);
            }
        }
        C0732j c0732j3 = new C0732j();
        int i20 = i7;
        while (i20 < i6) {
            byte bI = ((C0735m) arrayList4.get(i20)).i(i10);
            int i21 = i20 + 1;
            int i22 = i21;
            while (true) {
                if (i22 >= i6) {
                    i22 = i6;
                    break;
                } else if (bI != ((C0735m) arrayList4.get(i22)).i(i10)) {
                    break;
                } else {
                    i22++;
                }
            }
            if (i21 == i22 && i10 + 1 == ((C0735m) arrayList4.get(i20)).d()) {
                c0732j.c0(((Number) arrayList5.get(i20)).intValue());
                arrayList3 = arrayList5;
                j6 = j10;
                i9 = i22;
            } else {
                c0732j.c0(((int) ((c0732j3.i / j9) + j10)) * (-1));
                arrayList3 = arrayList5;
                j6 = j10;
                i9 = i22;
                d(j6, c0732j3, i10 + 1, arrayList, i20, i9, arrayList3);
                arrayList4 = arrayList;
            }
            j10 = j6;
            i20 = i9;
            arrayList5 = arrayList3;
        }
        c0732j.r(c0732j3);
    }

    public static final void e(long j4, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j4 || j4 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j6 + " byteCount=" + j7);
        }
    }

    public static final boolean f(AssertionError assertionError) {
        Logger logger = A.f9308a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? M4.l.a0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static B g(C0735m... c0735mArr) {
        int i = 0;
        if (c0735mArr.length == 0) {
            return new B(new C0735m[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new p089q4.i(c0735mArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(c0735mArr.length);
        for (C0735m c0735m : c0735mArr) {
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList arrayListN = p089q4.m.N(Arrays.copyOf(numArr, numArr.length));
        int length = c0735mArr.length;
        int i3 = 0;
        int i6 = 0;
        while (i3 < length) {
            arrayListN.set(p089q4.m.K(arrayList, c0735mArr[i3]), Integer.valueOf(i6));
            i3++;
            i6++;
        }
        if (((C0735m) arrayList.get(0)).d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            C0735m c0735m2 = (C0735m) arrayList.get(i7);
            int i8 = i7 + 1;
            int i9 = i8;
            while (i9 < arrayList.size()) {
                C0735m c0735m3 = (C0735m) arrayList.get(i9);
                c0735m3.getClass();
                E4.k.f("prefix", c0735m2);
                if (!c0735m3.l(0, c0735m2, c0735m2.d())) {
                    break;
                }
                if (c0735m3.d() == c0735m2.d()) {
                    throw new IllegalArgumentException(("duplicate option: " + c0735m3).toString());
                }
                if (((Number) arrayListN.get(i9)).intValue() > ((Number) arrayListN.get(i7)).intValue()) {
                    arrayList.remove(i9);
                    arrayListN.remove(i9);
                } else {
                    i9++;
                }
            }
            i7 = i8;
        }
        C0732j c0732j = new C0732j();
        d(0L, c0732j, 0, arrayList, 0, arrayList.size(), arrayListN);
        int[] iArr = new int[(int) (c0732j.i / ((long) 4))];
        while (!c0732j.z()) {
            iArr[i] = c0732j.p();
            i++;
        }
        Object[] objArrCopyOf = Arrays.copyOf(c0735mArr, c0735mArr.length);
        E4.k.e("copyOf(this, size)", objArrCopyOf);
        return new B((C0735m[]) objArrCopyOf, iArr);
    }

    public static final K h(Socket socket) throws IOException {
        Logger logger = A.f9308a;
        E4.k.f("<this>", socket);
        L l6 = new L(socket);
        OutputStream outputStream = socket.getOutputStream();
        E4.k.e("getOutputStream()", outputStream);
        return l6.sink(new C0726d(outputStream, 1, l6));
    }

    public static final C0727e i(File file) {
        Logger logger = A.f9308a;
        E4.k.f("<this>", file);
        return new C0727e(new FileInputStream(file), P.NONE);
    }

    public static final M j(Socket socket) throws IOException {
        Logger logger = A.f9308a;
        E4.k.f("<this>", socket);
        L l6 = new L(socket);
        InputStream inputStream = socket.getInputStream();
        E4.k.e("getInputStream()", inputStream);
        return l6.source(new C0727e(inputStream, l6));
    }
}
