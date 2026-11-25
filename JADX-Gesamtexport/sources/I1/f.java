package I1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.protocol.WampClient;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z2.f f1829a = new Z2.f(2, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f1830b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f1831c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f1832d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f1833e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f1834f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f1835g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f1836h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f1837j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f1827g * 2) + 7) & (-8)) / 8) + (cVar.f1825e * 2) + d(cVar.f1821a, cVar.f1822b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f1826f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f1834f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f1821a, cVar2.f1822b, bArr));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f1828h;
                int length2 = iArr.length;
                int i3 = 0;
                int i6 = 0;
                while (i3 < length2) {
                    int i7 = iArr[i3];
                    u(byteArrayOutputStream, i7 - i6);
                    i3++;
                    i6 = i7;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f1821a, cVar3.f1822b, bArr));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.f1828h;
                int length3 = iArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length3) {
                    int i10 = iArr2[i8];
                    u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                q(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z5 = true;
        for (File file2 : fileArrListFiles) {
            z5 = c(file2) && z5;
        }
        return z5;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f1836h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1835g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return p012c.k.u(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        int i6 = 0;
        while (i6 < i3) {
            int i7 = inputStream.read(bArr, i6, i3 - i6);
            if (i7 < 0) {
                throw new IllegalStateException(p012c.k.r(i3, "Not enough bytes to read: "));
            }
            i6 += i7;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int iM = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i6] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i3, int i6) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i6];
            byte[] bArr2 = new byte[2048];
            int i7 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i7 < i3) {
                int i8 = fileInputStream.read(bArr2);
                if (i8 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, i8);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i6 - iInflate);
                    i7 += i8;
                } catch (DataFormatException e6) {
                    throw new IllegalStateException(e6.getMessage());
                }
            }
            if (i7 == i3) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i7);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f1837j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                c[] cVarArrK = k(byteArrayInputStream, bArr2, iM, cVarArr);
                byteArrayInputStream.close();
                return cVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f1832d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            c[] cVarArrJ = j(byteArrayInputStream2, iM2, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i3, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i6] = (int) m(byteArrayInputStream, 2);
            strArr[i6] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i7 = 0; i7 < i3; i7++) {
            c cVar = cVarArr[i7];
            if (!cVar.f1822b.equals(strArr[i7])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i8 = iArr[i7];
            cVar.f1825e = i8;
            cVar.f1828h = g(byteArrayInputStream, i8);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i6 = 0; i6 < i3; i6++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i7 = 0; i7 < cVarArr.length; i7++) {
                    if (cVarArr[i7].f1822b.equals(strSubstring)) {
                        cVar = cVarArr[i7];
                        break;
                    }
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f1824d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f1836h)) {
                cVar.f1825e = iM;
                cVar.f1828h = iArrG;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f1833e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            c[] cVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return cVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i3) throws IOException {
        byte[] bArrF = f(inputStream, i3);
        long j4 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            j4 += ((long) (bArrF[i6] & 255)) << (i6 * 8);
        }
        return j4;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            cVarArr[i6] = new c(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i7 = 0; i7 < i3; i7++) {
            c cVar = cVarArr[i7];
            int iAvailable = byteArrayInputStream.available() - cVar.f1826f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = cVar.i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f1828h = g(byteArrayInputStream, cVar.f1825e);
            int i8 = cVar.f1827g;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = bitSetValueOf.get(i9) ? 2 : 0;
                if (bitSetValueOf.get(i9 + i8)) {
                    i10 |= 4;
                }
                if (i10 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i9));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i9), Integer.valueOf(i10 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) throws IOException {
        long j4;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f1832d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f1833e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(cVarArr, bArr3);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                t(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f1835g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.i.size() * 4;
                    String strD = d(cVar.f1821a, cVar.f1822b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, strD.getBytes(charset).length);
                    u(byteArrayOutputStream, cVar.f1828h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, cVar.f1823c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = cVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i6 : cVar.f1828h) {
                        u(byteArrayOutputStream, i6);
                    }
                }
                return true;
            }
            byte[] bArr5 = f1834f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(cVarArr, bArr5);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                t(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f1836h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String strD2 = d(cVar2.f1821a, cVar2.f1822b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = cVar2.i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, cVar2.f1828h.length);
                t(byteArrayOutputStream, cVar2.f1823c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i7 : cVar2.f1828h) {
                    u(byteArrayOutputStream, i7);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, cVarArr.length);
            int i8 = 2;
            int i9 = 2;
            for (c cVar3 : cVarArr) {
                t(byteArrayOutputStream2, cVar3.f1823c, 4);
                t(byteArrayOutputStream2, cVar3.f1824d, 4);
                t(byteArrayOutputStream2, cVar3.f1827g, 4);
                String strD3 = d(cVar3.f1821a, cVar3.f1822b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i9 = i9 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i9 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            }
            o oVar = new o(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(oVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i10];
                    u(byteArrayOutputStream3, i10);
                    u(byteArrayOutputStream3, cVar4.f1825e);
                    i11 = i11 + 4 + (cVar4.f1825e * i8);
                    int[] iArr = cVar4.f1828h;
                    int length3 = iArr.length;
                    int i12 = i3;
                    int i13 = i8;
                    int i14 = i12;
                    while (i14 < length3) {
                        int i15 = iArr[i14];
                        u(byteArrayOutputStream3, i15 - i12);
                        i14++;
                        i12 = i15;
                    }
                    i10++;
                    i8 = i13;
                    i3 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
            }
            o oVar2 = new o(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(oVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i16 = 0;
            int i17 = 0;
            while (i16 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i16];
                    Iterator it3 = cVar5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream5, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream6, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            u(byteArrayOutputStream4, i16);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i18 = i17 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream4, length4, 4);
                            u(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i17 = i18 + length4;
                            i16++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i17 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
            }
            o oVar3 = new o(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(oVar3);
            long j6 = 4;
            long size2 = j6 + j6 + 4 + ((long) (arrayList2.size() * 16));
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i19 = 0;
            while (i19 < arrayList2.size()) {
                o oVar4 = (o) arrayList2.get(i19);
                int i20 = oVar4.f1849a;
                if (i20 == 1) {
                    j4 = 0;
                } else if (i20 == 2) {
                    j4 = 1;
                } else if (i20 == 3) {
                    j4 = 2;
                } else if (i20 == 4) {
                    j4 = 3;
                } else {
                    if (i20 != 5) {
                        throw null;
                    }
                    j4 = 4;
                }
                t(byteArrayOutputStream, j4, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = oVar4.f1850b;
                if (oVar4.f1851c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    t(byteArrayOutputStream, bArrA3.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i19++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i21));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.f1825e);
        t(byteArrayOutputStream, cVar.f1826f, 4);
        t(byteArrayOutputStream, cVar.f1823c, 4);
        t(byteArrayOutputStream, cVar.f1827g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        byte[] bArr = new byte[(((cVar.f1827g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i3 = iIntValue / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + cVar.f1827g;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int i3 = 0;
        for (Map.Entry entry : cVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, iIntValue - i3);
                u(byteArrayOutputStream, 0);
                i3 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x01ad A[Catch: all -> 0x01bb, TRY_LEAVE, TryCatch #19 {all -> 0x01bb, blocks: (B:125:0x01a1, B:127:0x01ad, B:136:0x01be), top: B:238:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x01be A[Catch: all -> 0x01bb, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x01bb, blocks: (B:125:0x01a1, B:127:0x01ad, B:136:0x01be), top: B:238:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:160:0x0207 A[Catch: all -> 0x0229, TRY_LEAVE, TryCatch #8 {all -> 0x0229, blocks: (B:157:0x01ff, B:158:0x0201, B:160:0x0207), top: B:221:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:201:0x0256  */
    /* JADX WARN: Code duplicated, block: B:205:0x0260  */
    /* JADX WARN: Code duplicated, block: B:210:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x0271  */
    /* JADX WARN: Code duplicated, block: B:252:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x020c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    public static void s(Context context, Executor executor, e eVar, boolean z5) {
        boolean z6;
        ?? r7;
        FileInputStream fileInputStreamA;
        c[] cVarArrL;
        e eVar2;
        c[] cVarArr;
        byte[] bArr;
        ?? r8;
        boolean z7;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr2;
        int i3;
        ?? r9;
        boolean z8;
        byte[] bArr3;
        ?? byteArrayOutputStream;
        int i6;
        b bVar;
        ?? r10;
        ?? r11;
        boolean z9;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z5) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j4 = dataInputStream.readLong();
                            dataInputStream.close();
                            z9 = j4 == packageInfo.lastUpdateTime;
                            if (z9) {
                                eVar.b(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                if (z9) {
                    context.getPackageName();
                    n.c(context, false);
                    return;
                }
            }
            context.getPackageName();
            int i7 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, eVar, name, file2);
            byte[] bArr4 = bVar2.f1814b;
            if (bArr4 != null) {
                try {
                    try {
                        try {
                            if (file2.exists()) {
                                if (!file2.canWrite()) {
                                    bVar2.c(4, null);
                                }
                                if (z8 || !z5) {
                                    r11 = 0;
                                } else {
                                    r11 = r10;
                                }
                                n.c(context, r11);
                            }
                            try {
                                file2.createNewFile();
                            } catch (IOException unused2) {
                                z6 = true;
                                bVar2.c(4, null);
                                z8 = false;
                                r10 = z6;
                            }
                            if (fileInputStreamA != null) {
                                try {
                                    if (!Arrays.equals((byte[]) r7, f(fileInputStreamA, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    cVarArrL = l(fileInputStreamA, f(fileInputStreamA, 4), (String) bVar2.f1819g);
                                    try {
                                        fileInputStreamA.close();
                                    } catch (IOException e6) {
                                        eVar.b(7, e6);
                                    }
                                    bVar2.f1820h = cVarArrL;
                                } catch (IOException e7) {
                                    eVar.b(7, e7);
                                    fileInputStreamA.close();
                                    cVarArrL = null;
                                } catch (IllegalStateException e8) {
                                    eVar.b(8, e8);
                                    fileInputStreamA.close();
                                    cVarArrL = null;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                fileInputStreamA.close();
                                throw th4;
                            } catch (IOException e9) {
                                eVar.b(7, e9);
                                throw th4;
                            }
                        }
                    } catch (IOException e10) {
                        eVar.b(7, e10);
                    }
                    fileInputStreamA = bVar2.a(assets, "dexopt/baseline.prof");
                } catch (FileNotFoundException e11) {
                    eVar.b(6, e11);
                    fileInputStreamA = null;
                } catch (IOException e12) {
                    eVar.b(7, e12);
                    fileInputStreamA = null;
                }
                bVar2.f1813a = true;
                r7 = f1830b;
                c[] cVarArr2 = (c[]) bVar2.f1820h;
                if (cVarArr2 != null && (i6 = Build.VERSION.SDK_INT) <= 34) {
                    switch (i6) {
                        case 31:
                        case 32:
                        case WampClient.RequestType.SUBSCRIBED /* 33 */:
                        case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                            try {
                                FileInputStream fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 != null) {
                                    try {
                                        if (!Arrays.equals(f1831c, f(fileInputStreamA2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        bVar2.f1820h = i(fileInputStreamA2, f(fileInputStreamA2, 4), bArr4, cVarArr2);
                                        fileInputStreamA2.close();
                                        bVar = bVar2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamA2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    bVar = null;
                                }
                            } catch (FileNotFoundException e13) {
                                eVar.b(9, e13);
                            } catch (IOException e14) {
                                eVar.b(7, e14);
                            } catch (IllegalStateException e15) {
                                bVar2.f1820h = null;
                                eVar.b(8, e15);
                            }
                            if (bVar != null) {
                                bVar2 = bVar;
                                break;
                            }
                        default:
                            eVar2 = (e) bVar2.f1816d;
                            cVarArr = (c[]) bVar2.f1820h;
                            if (cVarArr != null && (bArr3 = bVar2.f1814b) != null) {
                                if (bVar2.f1813a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    try {
                                        byteArrayOutputStream.write(r7);
                                        byteArrayOutputStream.write(bArr3);
                                        if (o(byteArrayOutputStream, bArr3, cVarArr)) {
                                            bVar2.f1817e = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            bVar2.f1820h = null;
                                        } else {
                                            eVar2.b(5, null);
                                            bVar2.f1820h = null;
                                            byteArrayOutputStream.close();
                                        }
                                    } catch (Throwable th7) {
                                        try {
                                            byteArrayOutputStream.close();
                                            throw th7;
                                        } catch (Throwable th8) {
                                            th7.addSuppressed(th8);
                                            throw th7;
                                        }
                                    }
                                } catch (IOException e16) {
                                    eVar2.b(7, e16);
                                } catch (IllegalStateException e17) {
                                    eVar2.b(8, e17);
                                }
                            }
                            bArr = (byte[]) bVar2.f1817e;
                            if (bArr != null) {
                                z7 = false;
                                r9 = 1;
                            } else {
                                try {
                                    if (bVar2.f1813a) {
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        try {
                                            byteArrayInputStream = new ByteArrayInputStream(bArr);
                                            try {
                                                fileOutputStream = new FileOutputStream((File) bVar2.f1818f);
                                                try {
                                                    try {
                                                        bArr2 = new byte[HueLog.LogComponent.APPCORE];
                                                        while (true) {
                                                            i3 = byteArrayInputStream.read(bArr2);
                                                            if (i3 > 0) {
                                                                fileOutputStream.write(bArr2, 0, i3);
                                                            } else {
                                                                r9 = 1;
                                                                try {
                                                                    bVar2.c(1, null);
                                                                    fileOutputStream.close();
                                                                    byteArrayInputStream.close();
                                                                    bVar2.f1817e = null;
                                                                    bVar2.f1820h = null;
                                                                    z7 = true;
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                }
                                                            }
                                                            th = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th;
                                                            } catch (Throwable th10) {
                                                                th.addSuppressed(th10);
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    Throwable th13 = th;
                                                    try {
                                                        byteArrayInputStream.close();
                                                        throw th13;
                                                    } catch (Throwable th14) {
                                                        th13.addSuppressed(th14);
                                                        throw th13;
                                                    }
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                            }
                                        } catch (FileNotFoundException e18) {
                                            e = e18;
                                            r7 = 1;
                                            bVar2.c(6, e);
                                            r8 = r7;
                                            bVar2.f1817e = null;
                                            bVar2.f1820h = null;
                                            z7 = false;
                                            r9 = r8;
                                        } catch (IOException e19) {
                                            e = e19;
                                            r7 = 1;
                                            bVar2.c(7, e);
                                            r8 = r7;
                                            bVar2.f1817e = null;
                                            bVar2.f1820h = null;
                                            z7 = false;
                                            r9 = r8;
                                        }
                                    } catch (FileNotFoundException e20) {
                                        e = e20;
                                        bVar2.c(6, e);
                                        r8 = r7;
                                        bVar2.f1817e = null;
                                        bVar2.f1820h = null;
                                        z7 = false;
                                        r9 = r8;
                                    } catch (IOException e21) {
                                        e = e21;
                                        bVar2.c(7, e);
                                        r8 = r7;
                                        bVar2.f1817e = null;
                                        bVar2.f1820h = null;
                                        z7 = false;
                                        r9 = r8;
                                    }
                                } catch (Throwable th16) {
                                    bVar2.f1817e = null;
                                    bVar2.f1820h = null;
                                    throw th16;
                                }
                            }
                            if (z7) {
                                e(packageInfo, filesDir);
                            }
                            z8 = z7;
                            r10 = r9;
                            if (z8) {
                                r11 = 0;
                            } else {
                                r11 = 0;
                            }
                            n.c(context, r11);
                    }
                }
                eVar2 = (e) bVar2.f1816d;
                cVarArr = (c[]) bVar2.f1820h;
                if (cVarArr != null) {
                    if (bVar2.f1813a) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(r7);
                    byteArrayOutputStream.write(bArr3);
                    if (o(byteArrayOutputStream, bArr3, cVarArr)) {
                        eVar2.b(5, null);
                        bVar2.f1820h = null;
                        byteArrayOutputStream.close();
                    } else {
                        bVar2.f1817e = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        bVar2.f1820h = null;
                    }
                }
                bArr = (byte[]) bVar2.f1817e;
                if (bArr != null) {
                    if (bVar2.f1813a) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    fileOutputStream = new FileOutputStream((File) bVar2.f1818f);
                    bArr2 = new byte[HueLog.LogComponent.APPCORE];
                    while (true) {
                        i3 = byteArrayInputStream.read(bArr2);
                        if (i3 > 0) {
                            fileOutputStream.write(bArr2, 0, i3);
                        } else {
                            r9 = 1;
                            bVar2.c(1, null);
                            fileOutputStream.close();
                            byteArrayInputStream.close();
                            bVar2.f1817e = null;
                            bVar2.f1820h = null;
                            z7 = true;
                        }
                        th = th;
                        fileOutputStream.close();
                        throw th;
                    }
                }
                z7 = false;
                r9 = 1;
                if (z7) {
                    e(packageInfo, filesDir);
                }
                z8 = z7;
                r10 = r9;
                if (z8) {
                    r11 = 0;
                } else {
                    r11 = 0;
                }
                n.c(context, r11);
            }
            bVar2.c(3, Integer.valueOf(i7));
            z6 = true;
            z8 = false;
            r10 = z6;
            if (z8) {
                r11 = 0;
            } else {
                r11 = 0;
            }
            n.c(context, r11);
        } catch (PackageManager.NameNotFoundException e22) {
            eVar.b(7, e22);
            n.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j4, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            bArr[i6] = (byte) ((j4 >> (i6 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i3) throws IOException {
        t(byteArrayOutputStream, i3, 2);
    }
}
