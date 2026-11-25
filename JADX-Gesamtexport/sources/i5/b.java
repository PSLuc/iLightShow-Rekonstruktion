package i5;

import E4.k;
import E4.s;
import E4.v;
import S1.V;
import h5.C;
import h5.C0732j;
import h5.G;
import h5.J;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import okhttp3.internal.ws.WebSocketProtocol;
import p089q4.l;
import p089q4.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f9594a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('a' <= c6 && c6 < 'g') {
            return c6 - 'W';
        }
        if ('A' <= c6 && c6 < 'G') {
            return c6 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c6);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = C.i;
        C cK = W2.g.k("/", false);
        p084p4.h[] hVarArr = {new p084p4.h(cK, new e(cK))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.S(1));
        z.V(linkedHashMap, hVarArr);
        for (e eVar : l.n0(arrayList, new f(0))) {
            if (((e) linkedHashMap.put(eVar.f9602a, eVar)) == null) {
                while (true) {
                    C c6 = eVar.f9602a;
                    C c7 = c6.c();
                    if (c7 == null) {
                        break;
                    }
                    e eVar2 = (e) linkedHashMap.get(c7);
                    if (eVar2 != null) {
                        eVar2.f9607f.add(c6);
                        break;
                    }
                    e eVar3 = new e(c7);
                    linkedHashMap.put(c7, eVar3);
                    eVar3.f9607f.add(c6);
                    eVar = eVar3;
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i) {
        V.t(16);
        String string = Integer.toString(i, 16);
        k.e("toString(this, checkRadix(radix))", string);
        return "0x".concat(string);
    }

    public static final e d(G g6) throws IOException {
        Long lValueOf;
        int iC = g6.c();
        if (iC != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iC));
        }
        g6.l(4L);
        short sO = g6.o();
        int i = sO & 65535;
        if ((sO & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        int iO = g6.o() & 65535;
        short sO2 = g6.o();
        int i3 = sO2 & 65535;
        short sO3 = g6.o();
        int i6 = sO3 & 65535;
        if (i3 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i6 >> 9) & 127) + 1980, ((i6 >> 5) & 15) - 1, sO3 & 31, (i3 >> 11) & 31, (i3 >> 5) & 63, (sO2 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l6 = lValueOf;
        g6.c();
        v vVar = new v();
        vVar.f1073h = ((long) g6.c()) & 4294967295L;
        v vVar2 = new v();
        vVar2.f1073h = ((long) g6.c()) & 4294967295L;
        int iO2 = g6.o() & 65535;
        int iO3 = g6.o() & 65535;
        int iO4 = g6.o() & 65535;
        g6.l(8L);
        v vVar3 = new v();
        vVar3.f1073h = ((long) g6.c()) & 4294967295L;
        String strS = g6.s(iO2);
        if (M4.l.Z(strS, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j4 = vVar2.f1073h == 4294967295L ? 8 : 0L;
        if (vVar.f1073h == 4294967295L) {
            j4 += (long) 8;
        }
        if (vVar3.f1073h == 4294967295L) {
            j4 += (long) 8;
        }
        s sVar = new s();
        e(g6, iO3, new g(sVar, j4, vVar2, g6, vVar, vVar3));
        if (j4 > 0 && !sVar.f1070h) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strS2 = g6.s(iO4);
        String str = C.i;
        return new e(W2.g.k("/", false).d(strS), M4.s.P(strS, "/", false), strS2, vVar.f1073h, vVar2.f1073h, iO, l6, vVar3.f1073h);
    }

    public static final void e(G g6, int i, D4.e eVar) throws IOException {
        long j4 = i;
        while (j4 != 0) {
            if (j4 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iO = g6.o() & 65535;
            long jO = ((long) g6.o()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j6 = j4 - ((long) 4);
            if (j6 < jO) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            g6.N(jO);
            C0732j c0732j = g6.i;
            long j7 = c0732j.i;
            eVar.d(Integer.valueOf(iO), Long.valueOf(jO));
            long j8 = (c0732j.i + jO) - j7;
            if (j8 < 0) {
                throw new IOException(p012c.k.r(iO, "unsupported zip: too many bytes processed for "));
            }
            if (j8 > 0) {
                c0732j.l(j8);
            }
            j4 = j6 - jO;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public static final int f(J j4, int i) {
        int i3;
        k.f("<this>", j4);
        int i6 = i + 1;
        int length = j4.f9331l.length;
        int[] iArr = j4.f9332m;
        k.f("<this>", iArr);
        int i7 = length - 1;
        int i8 = 0;
        while (i8 <= i7) {
            i3 = (i8 + i7) >>> 1;
            int i9 = iArr[i3];
            if (i9 < i6) {
                i8 = i3 + 1;
            } else {
                if (i9 <= i6) {
                    if (i3 >= 0) {
                        return i3;
                    }
                    return ~i3;
                }
                i7 = i3 - 1;
            }
        }
        i3 = (-i8) - 1;
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }
}
