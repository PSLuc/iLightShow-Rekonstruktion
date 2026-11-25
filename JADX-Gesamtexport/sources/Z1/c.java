package Z1;

import B.AbstractC0013g0;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
import p009b2.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f5986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f5987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f5991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a[] f5992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5993h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BitSet f5997m;

    public c(int i) {
        this.f5986a = null;
        this.f5988c = i;
        this.f5990e = true;
        this.f5989d = -1;
        this.f5996l = false;
        this.f5995k = 0;
        this.f5987b = new AtomicReference(new b(new String[64], new a[32]));
    }

    public final int a(int i) {
        int i3 = i + (i >>> 15);
        int i6 = i3 ^ (i3 << 7);
        return this.f5994j & (i6 + (i6 >>> 3));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01da  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:114:0x0203  */
    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:117:0x020e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0223  */
    /* JADX WARN: Code duplicated, block: B:122:0x023b  */
    public final String b(int i, int i3, int i6, char[] cArr) {
        int i7;
        String str;
        int i8;
        int i9;
        String[] strArr;
        int i10;
        a aVar;
        a[] aVarArr;
        int i11;
        BitSet bitSet;
        String str2;
        int i12 = 1;
        if (i3 < 1) {
            return "";
        }
        if (!this.f5990e) {
            return new String(cArr, i, i3);
        }
        int iA = a(i6);
        String str3 = this.f5991f[iA];
        int i13 = 0;
        if (str3 != null) {
            if (str3.length() == i3) {
                int i14 = 0;
                while (str3.charAt(i14) == cArr[i + i14]) {
                    i14++;
                    if (i14 == i3) {
                        return str3;
                    }
                }
            }
            a aVar2 = this.f5992g[iA >> 1];
            if (aVar2 != null) {
                String str4 = aVar2.f5979a;
                if (str4.length() != i3) {
                    str4 = null;
                    break;
                }
                int i15 = 0;
                do {
                    if (str4.charAt(i15) != cArr[i + i15]) {
                        str4 = null;
                        break;
                    }
                    i15++;
                } while (i15 < i3);
                if (str4 != null) {
                    return str4;
                }
                a aVar3 = aVar2.f5980b;
                while (true) {
                    if (aVar3 == null) {
                        str2 = null;
                        break;
                    }
                    str2 = aVar3.f5979a;
                    if (str2.length() != i3) {
                        str2 = null;
                        break;
                    }
                    int i16 = 0;
                    do {
                        if (str2.charAt(i16) != cArr[i + i16]) {
                            str2 = null;
                            break;
                        }
                        i16++;
                    } while (i16 < i3);
                    if (str2 != null) {
                        break;
                    }
                    aVar3 = aVar3.f5980b;
                }
                if (str2 != null) {
                    return str2;
                }
            }
        }
        if (!this.f5996l) {
            if (this.f5993h >= this.i) {
                String[] strArr2 = this.f5991f;
                int length = strArr2.length;
                int i17 = length + length;
                int i18 = this.f5988c;
                if (i17 > 65536) {
                    this.f5993h = 0;
                    this.f5990e = false;
                    this.f5991f = new String[64];
                    this.f5992g = new a[32];
                    this.f5994j = 63;
                    this.f5996l = false;
                    i7 = 1;
                } else {
                    a[] aVarArr2 = this.f5992g;
                    this.f5991f = new String[i17];
                    this.f5992g = new a[i17 >> 1];
                    this.f5994j = i17 - 1;
                    this.i = i17 - (i17 >> 2);
                    int i19 = 0;
                    int i20 = 0;
                    int iMax = 0;
                    while (i19 < length) {
                        String str5 = strArr2[i19];
                        if (str5 != null) {
                            i20++;
                            int length2 = str5.length();
                            int iCharAt = i18;
                            while (i13 < length2) {
                                iCharAt = str5.charAt(i13) + (iCharAt * 33);
                                i13++;
                            }
                            int iA2 = a(iCharAt == 0 ? i12 : iCharAt);
                            String[] strArr3 = this.f5991f;
                            if (strArr3[iA2] == null) {
                                strArr3[iA2] = str5;
                            } else {
                                int i21 = iA2 >> 1;
                                a[] aVarArr3 = this.f5992g;
                                a aVar4 = new a(str5, aVarArr3[i21]);
                                aVarArr3[i21] = aVar4;
                                iMax = Math.max(iMax, aVar4.f5981c);
                            }
                        }
                        i19++;
                        i12 = i12;
                        i13 = 0;
                    }
                    i7 = i12;
                    int i22 = length >> 1;
                    for (int i23 = 0; i23 < i22; i23++) {
                        for (a aVar5 = aVarArr2[i23]; aVar5 != null; aVar5 = aVar5.f5980b) {
                            i20++;
                            String str6 = aVar5.f5979a;
                            int length3 = str6.length();
                            int iCharAt2 = i18;
                            for (int i24 = 0; i24 < length3; i24++) {
                                iCharAt2 = (iCharAt2 * 33) + str6.charAt(i24);
                            }
                            if (iCharAt2 == 0) {
                                iCharAt2 = i7;
                            }
                            int iA3 = a(iCharAt2);
                            String[] strArr4 = this.f5991f;
                            if (strArr4[iA3] == null) {
                                strArr4[iA3] = str6;
                            } else {
                                int i25 = iA3 >> 1;
                                a[] aVarArr4 = this.f5992g;
                                a aVar6 = new a(str6, aVarArr4[i25]);
                                aVarArr4[i25] = aVar6;
                                iMax = Math.max(iMax, aVar6.f5981c);
                            }
                        }
                    }
                    this.f5995k = iMax;
                    this.f5997m = null;
                    if (i20 != this.f5993h) {
                        throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.f5993h), Integer.valueOf(i20)));
                    }
                }
                int i26 = i + i3;
                for (int i27 = i; i27 < i26; i27++) {
                    i18 = (i18 * 33) + cArr[i27];
                }
                if (i18 == 0) {
                    i18 = i7;
                }
                iA = a(i18);
            }
            str = new String(cArr, i, i3);
            i8 = this.f5989d;
            i9 = i7;
            if (AbstractC0013g0.a(i9, i8)) {
                str = h.i.a(str);
            }
            this.f5993h += i9;
            strArr = this.f5991f;
            if (strArr[iA] == null) {
                strArr[iA] = str;
                return str;
            }
            i10 = iA >> 1;
            aVarArr = this.f5992g;
            aVar = new a(str, aVarArr[i10]);
            i11 = aVar.f5981c;
            if (i11 > 150) {
                aVarArr[i10] = aVar;
                this.f5995k = Math.max(i11, this.f5995k);
                return str;
            }
            bitSet = this.f5997m;
            if (bitSet == null) {
                BitSet bitSet2 = new BitSet();
                this.f5997m = bitSet2;
                bitSet2.set(i10);
            } else if (bitSet.get(i10)) {
                this.f5997m.set(i10);
            } else {
                if (!AbstractC0013g0.a(3, i8)) {
                    throw new IllegalStateException(AbstractC0013g0.l(new StringBuilder("Longest collision chain in symbol table (of size "), this.f5993h, ") now exceeds maximum, 150 -- suspect a DoS attack based on hash collisions"));
                }
                this.f5990e = false;
            }
            this.f5991f[iA] = str;
            this.f5992g[i10] = null;
            this.f5993h -= i11;
            this.f5995k = -1;
            return str;
        }
        String[] strArr5 = this.f5991f;
        this.f5991f = (String[]) Arrays.copyOf(strArr5, strArr5.length);
        a[] aVarArr5 = this.f5992g;
        this.f5992g = (a[]) Arrays.copyOf(aVarArr5, aVarArr5.length);
        this.f5996l = false;
        i7 = 1;
        str = new String(cArr, i, i3);
        i8 = this.f5989d;
        i9 = i7;
        if (AbstractC0013g0.a(i9, i8)) {
            str = h.i.a(str);
        }
        this.f5993h += i9;
        strArr = this.f5991f;
        if (strArr[iA] == null) {
            strArr[iA] = str;
            return str;
        }
        i10 = iA >> 1;
        aVarArr = this.f5992g;
        aVar = new a(str, aVarArr[i10]);
        i11 = aVar.f5981c;
        if (i11 > 150) {
            aVarArr[i10] = aVar;
            this.f5995k = Math.max(i11, this.f5995k);
            return str;
        }
        bitSet = this.f5997m;
        if (bitSet == null) {
            BitSet bitSet3 = new BitSet();
            this.f5997m = bitSet3;
            bitSet3.set(i10);
        } else if (bitSet.get(i10)) {
            this.f5997m.set(i10);
        } else {
            if (!AbstractC0013g0.a(3, i8)) {
                throw new IllegalStateException(AbstractC0013g0.l(new StringBuilder("Longest collision chain in symbol table (of size "), this.f5993h, ") now exceeds maximum, 150 -- suspect a DoS attack based on hash collisions"));
            }
            this.f5990e = false;
        }
        this.f5991f[iA] = str;
        this.f5992g[i10] = null;
        this.f5993h -= i11;
        this.f5995k = -1;
        return str;
    }

    public c(c cVar, int i, int i3, b bVar) {
        this.f5986a = cVar;
        this.f5988c = i3;
        this.f5987b = null;
        this.f5989d = i;
        this.f5990e = AbstractC0013g0.a(2, i);
        String[] strArr = bVar.f5984c;
        this.f5991f = strArr;
        this.f5992g = bVar.f5985d;
        this.f5993h = bVar.f5982a;
        this.f5995k = bVar.f5983b;
        int length = strArr.length;
        this.i = length - (length >> 2);
        this.f5994j = length - 1;
        this.f5996l = true;
    }
}
