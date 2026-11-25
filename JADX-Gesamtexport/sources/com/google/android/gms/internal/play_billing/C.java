package com.google.android.gms.internal.play_billing;

import F.C0068j;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Map, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C f7810n = new C(0, null, new Object[0]);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient C0606z f7811h;
    public transient A i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient B f7812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient Object f7813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient Object[] f7814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f7815m;

    public C(int i, Object obj, Object[] objArr) {
        this.f7813k = obj;
        this.f7814l = objArr;
        this.f7815m = i;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static C a(int i, Object[] objArr, C0068j c0068j) {
        int iHighestOneBit;
        int i3;
        boolean z5;
        char c6;
        ?? r6;
        char c7;
        short[] sArr;
        int i6;
        boolean z6;
        ?? r17;
        boolean z7;
        ?? r7;
        Object[] objArr2;
        C0596u c0596u;
        boolean z8;
        int i7 = i;
        Object[] objArrCopyOf = objArr;
        if (i7 == 0) {
            return f7810n;
        }
        int i8 = 1;
        C0596u c0596u2 = null;
        ?? r8 = 0;
        C0596u c0596u3 = null;
        C0596u c0596u4 = null;
        boolean z9 = false;
        if (i7 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new C(1, null, objArrCopyOf);
        }
        S1.h0.D(i7, objArrCopyOf.length >> 1);
        char c8 = 2;
        int iMax = Math.max(i7, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i7 != 1) {
            int i9 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i10 = 0;
                int i11 = 0;
                while (i10 < i7) {
                    int i12 = i11 + i11;
                    int i13 = i10 + i10;
                    Object obj = objArrCopyOf[i13];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i13 ^ i8];
                    Objects.requireNonNull(obj2);
                    int iH = com.fasterxml.jackson.databind.deser.std.d0.H(obj.hashCode());
                    while (true) {
                        int i14 = iH & i9;
                        i6 = i8;
                        z6 = z9;
                        int i15 = bArr[i14] & 255;
                        if (i15 == 255) {
                            bArr[i14] = (byte) i12;
                            if (i11 < i10) {
                                objArrCopyOf[i12] = obj;
                                objArrCopyOf[i12 ^ 1] = obj2;
                            }
                            i11++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i15 == true ? 1 : 0])) {
                            int i16 = ~i15;
                            Object obj3 = objArrCopyOf[i16 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            c0596u3 = new C0596u(obj, obj2, obj3);
                            objArrCopyOf[i16 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iH = i14 + 1;
                        i8 = i6;
                        z9 = z6;
                    }
                    i10++;
                    i8 = i6;
                    z9 = z6;
                }
                i3 = i8;
                z5 = z9;
                if (i11 == i7) {
                    c6 = 2;
                    r6 = bArr;
                    r17 = z5;
                } else {
                    sArr = new Object[3];
                    sArr[z5 ? 1 : 0] = bArr;
                    sArr[i3] = Integer.valueOf(i11);
                    sArr[2] = c0596u3;
                    r8 = sArr;
                    z8 = z5;
                }
            } else {
                i3 = 1;
                z5 = false;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i17 = 0;
                    for (int i18 = 0; i18 < i7; i18++) {
                        int i19 = i17 + i17;
                        int i20 = i18 + i18;
                        Object obj4 = objArrCopyOf[i20];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i20 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iH2 = com.fasterxml.jackson.databind.deser.std.d0.H(obj4.hashCode());
                        while (true) {
                            int i21 = iH2 & i9;
                            char c9 = (char) sArr[i21];
                            if (c9 == 65535) {
                                sArr[i21] = (short) i19;
                                if (i17 < i18) {
                                    objArrCopyOf[i19] = obj4;
                                    objArrCopyOf[i19 ^ 1] = obj5;
                                }
                                i17++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c9])) {
                                int i22 = c9 ^ 1;
                                Object obj6 = objArrCopyOf[i22 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                C0596u c0596u5 = new C0596u(obj4, obj5, obj6);
                                objArrCopyOf[i22 == true ? 1 : 0] = obj5;
                                c0596u4 = c0596u5;
                                break;
                            }
                            iH2 = i21 + 1;
                        }
                    }
                    if (i17 == i7) {
                        r8 = sArr;
                        z8 = z5;
                    } else {
                        r8 = new Object[]{sArr, Integer.valueOf(i17), c0596u4};
                        z8 = z5;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < i7) {
                        int i25 = i24 + i24;
                        int i26 = i23 + i23;
                        Object obj7 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iH3 = com.fasterxml.jackson.databind.deser.std.d0.H(obj7.hashCode());
                        while (true) {
                            int i27 = iH3 & i9;
                            int i28 = iArr[i27];
                            if (i28 == -1) {
                                iArr[i27] = i25;
                                if (i24 < i23) {
                                    objArrCopyOf[i25] = obj7;
                                    objArrCopyOf[i25 ^ 1] = obj8;
                                }
                                i24++;
                                c7 = c8;
                                break;
                            }
                            c7 = c8;
                            if (obj7.equals(objArrCopyOf[i28])) {
                                int i29 = i28 ^ 1;
                                Object obj9 = objArrCopyOf[i29];
                                Objects.requireNonNull(obj9);
                                C0596u c0596u6 = new C0596u(obj7, obj8, obj9);
                                objArrCopyOf[i29] = obj8;
                                c0596u2 = c0596u6;
                                break;
                            }
                            iH3 = i27 + 1;
                            c8 = c7;
                        }
                        i23++;
                        c8 = c7;
                    }
                    c6 = c8;
                    if (i24 == i7) {
                        r6 = iArr;
                        r17 = z5;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i24);
                        objArr3[c6] = c0596u2;
                        r6 = objArr3;
                        r17 = z5;
                    }
                }
            }
            z7 = r6 instanceof Object[];
            r7 = r6;
            if (z7) {
                objArr2 = (Object[]) r6;
                c0596u = (C0596u) objArr2[c6];
                if (c0068j != null) {
                    throw c0596u.a();
                }
                c0068j.f1184d = c0596u;
                Object obj10 = objArr2[r17];
                int iIntValue = ((Integer) objArr2[i3]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r7 = obj10;
                i7 = iIntValue;
            }
            return new C(i7, r7, objArrCopyOf);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        i7 = 1;
        i3 = 1;
        z8 = false;
        c6 = 2;
        r6 = r8;
        r17 = z8;
        z7 = r6 instanceof Object[];
        r7 = r6;
        if (z7) {
            objArr2 = (Object[]) r6;
            c0596u = (C0596u) objArr2[c6];
            if (c0068j != null) {
                throw c0596u.a();
            }
            c0068j.f1184d = c0596u;
            Object obj11 = objArr2[r17];
            int iIntValue2 = ((Integer) objArr2[i3]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r7 = obj11;
            i7 = iIntValue2;
        }
        return new C(i7, r7, objArrCopyOf);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        B b6 = this.f7812j;
        if (b6 == null) {
            b6 = new B(1, this.f7815m, this.f7814l);
            this.f7812j = b6;
        }
        return b6.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0606z c0606z = this.f7811h;
        if (c0606z != null) {
            return c0606z;
        }
        C0606z c0606z2 = new C0606z(this, this.f7814l, this.f7815m);
        this.f7811h = c0606z2;
        return c0606z2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.f7815m;
            Object[] objArr = this.f7814l;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f7813k;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iH = com.fasterxml.jackson.databind.deser.std.d0.H(obj.hashCode());
                    while (true) {
                        int i3 = iH & length;
                        int i6 = bArr[i3] & 255;
                        if (i6 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iH = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iH2 = com.fasterxml.jackson.databind.deser.std.d0.H(obj.hashCode());
                    while (true) {
                        int i7 = iH2 & length2;
                        char c6 = (char) sArr[i7];
                        if (c6 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c6])) {
                            obj2 = objArr[c6 ^ 1];
                        } else {
                            iH2 = i7 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iH3 = com.fasterxml.jackson.databind.deser.std.d0.H(obj.hashCode());
                    while (true) {
                        int i8 = iH3 & length3;
                        int i9 = iArr[i8];
                        if (i9 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i9])) {
                            obj2 = objArr[i9 ^ 1];
                        } else {
                            iH3 = i8 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0606z c0606z = this.f7811h;
        if (c0606z == null) {
            c0606z = new C0606z(this, this.f7814l, this.f7815m);
            this.f7811h = c0606z;
        }
        Iterator it = c0606z.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        A a6 = this.i;
        if (a6 != null) {
            return a6;
        }
        A a7 = new A(this, new B(0, this.f7815m, this.f7814l));
        this.i = a7;
        return a7;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7815m;
    }

    public final String toString() {
        int i = this.f7815m;
        if (i < 0) {
            throw new IllegalArgumentException(p012c.k.r(i, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        boolean z5 = true;
        for (Map.Entry entry : (C0606z) entrySet()) {
            if (!z5) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z5 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        B b6 = this.f7812j;
        if (b6 != null) {
            return b6;
        }
        B b7 = new B(1, this.f7815m, this.f7814l);
        this.f7812j = b7;
        return b7;
    }
}
