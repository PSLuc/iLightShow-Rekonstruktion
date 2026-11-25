package com.google.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.protocol.WampClient;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import p096s.AbstractC0916i;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class I implements S {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f8158m = new int[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Unsafe f8159n = e0.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f8160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f8161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f8164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f8165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8167h;
    public final K i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC0657z f8168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final U f8169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E f8170l;

    public I(int[] iArr, Object[] objArr, int i, int i3, r rVar, int[] iArr2, int i6, int i7, K k3, AbstractC0657z abstractC0657z, U u6, C0644l c0644l, E e6) {
        this.f8160a = iArr;
        this.f8161b = objArr;
        this.f8162c = i;
        this.f8163d = i3;
        this.f8165f = iArr2;
        this.f8166g = i6;
        this.f8167h = i7;
        this.i = k3;
        this.f8168j = abstractC0657z;
        this.f8169k = u6;
        this.f8164e = rVar;
        this.f8170l = e6;
    }

    public static Field A(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbW = p012c.k.w("Field ", str, " for ");
            sbW.append(cls.getName());
            sbW.append(" not found. Known fields are ");
            sbW.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbW.toString());
        }
    }

    public static int F(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof r) {
            return ((r) obj).e();
        }
        return true;
    }

    public static I s(Q q6, K k3, AbstractC0657z abstractC0657z, U u6, C0644l c0644l, E e6) {
        if (q6 instanceof Q) {
            return t(q6, k3, abstractC0657z, u6, c0644l, e6);
        }
        q6.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0267  */
    /* JADX WARN: Code duplicated, block: B:124:0x026e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0284  */
    /* JADX WARN: Code duplicated, block: B:128:0x0287  */
    /* JADX WARN: Code duplicated, block: B:181:0x0384  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a0  */
    public static I t(Q q6, K k3, AbstractC0657z abstractC0657z, U u6, C0644l c0644l, E e6) {
        int i;
        int iCharAt;
        int i3;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        char cCharAt;
        int i12;
        char cCharAt2;
        int i13;
        char cCharAt3;
        int i14;
        char cCharAt4;
        int i15;
        char cCharAt5;
        int i16;
        char cCharAt6;
        int i17;
        char cCharAt7;
        int i18;
        char cCharAt8;
        int i19;
        int i20;
        int i21;
        int i22;
        int[] iArr2;
        int i23;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i24;
        int i25;
        int iObjectFieldOffset3;
        int i26;
        int iObjectFieldOffset4;
        Field fieldA;
        char cCharAt9;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field fieldA2;
        int i30;
        Object obj2;
        Field fieldA3;
        int i31;
        char cCharAt10;
        int i32;
        int i33;
        char cCharAt11;
        int i34;
        char cCharAt12;
        int i35;
        char cCharAt13;
        String str = q6.f8182b;
        int length = str.length();
        char c6 = 55296;
        if (str.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i = i36 + 1;
                if (str.charAt(i36) < 55296) {
                    break;
                }
                i36 = i;
            }
        } else {
            i = 1;
        }
        int i37 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i38 = iCharAt2 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                cCharAt13 = str.charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            iCharAt2 = i38 | (cCharAt13 << i39);
            i37 = i35;
        }
        if (iCharAt2 == 0) {
            i6 = 0;
            i9 = 0;
            iCharAt = 0;
            i3 = 0;
            i8 = 0;
            i10 = 0;
            iArr = f8158m;
            i7 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt3 = str.charAt(i37);
            if (iCharAt3 >= 55296) {
                int i41 = iCharAt3 & 8191;
                int i42 = 13;
                while (true) {
                    i18 = i40 + 1;
                    cCharAt8 = str.charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i18;
                }
                iCharAt3 = i41 | (cCharAt8 << i42);
                i40 = i18;
            }
            int i43 = i40 + 1;
            int iCharAt4 = str.charAt(i40);
            if (iCharAt4 >= 55296) {
                int i44 = iCharAt4 & 8191;
                int i45 = 13;
                while (true) {
                    i17 = i43 + 1;
                    cCharAt7 = str.charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i17;
                }
                iCharAt4 = i44 | (cCharAt7 << i45);
                i43 = i17;
            }
            int i46 = i43 + 1;
            int iCharAt5 = str.charAt(i43);
            if (iCharAt5 >= 55296) {
                int i47 = iCharAt5 & 8191;
                int i48 = 13;
                while (true) {
                    i16 = i46 + 1;
                    cCharAt6 = str.charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i16;
                }
                iCharAt5 = i47 | (cCharAt6 << i48);
                i46 = i16;
            }
            int i49 = i46 + 1;
            int iCharAt6 = str.charAt(i46);
            if (iCharAt6 >= 55296) {
                int i50 = iCharAt6 & 8191;
                int i51 = 13;
                while (true) {
                    i15 = i49 + 1;
                    cCharAt5 = str.charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i15;
                }
                iCharAt6 = i50 | (cCharAt5 << i51);
                i49 = i15;
            }
            int i52 = i49 + 1;
            iCharAt = str.charAt(i49);
            if (iCharAt >= 55296) {
                int i53 = iCharAt & 8191;
                int i54 = 13;
                while (true) {
                    i14 = i52 + 1;
                    cCharAt4 = str.charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i14;
                }
                iCharAt = i53 | (cCharAt4 << i54);
                i52 = i14;
            }
            int i55 = i52 + 1;
            int iCharAt7 = str.charAt(i52);
            if (iCharAt7 >= 55296) {
                int i56 = iCharAt7 & 8191;
                int i57 = 13;
                while (true) {
                    i13 = i55 + 1;
                    cCharAt3 = str.charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i13;
                }
                iCharAt7 = i56 | (cCharAt3 << i57);
                i55 = i13;
            }
            int i58 = i55 + 1;
            int iCharAt8 = str.charAt(i55);
            if (iCharAt8 >= 55296) {
                int i59 = iCharAt8 & 8191;
                int i60 = 13;
                while (true) {
                    i12 = i58 + 1;
                    cCharAt2 = str.charAt(i58);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i12;
                }
                iCharAt8 = i59 | (cCharAt2 << i60);
                i58 = i12;
            }
            int i61 = i58 + 1;
            int iCharAt9 = str.charAt(i58);
            if (iCharAt9 >= 55296) {
                int i62 = iCharAt9 & 8191;
                int i63 = 13;
                while (true) {
                    i11 = i61 + 1;
                    cCharAt = str.charAt(i61);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i62 |= (cCharAt & 8191) << i63;
                    i63 += 13;
                    i61 = i11;
                }
                iCharAt9 = i62 | (cCharAt << i63);
                i61 = i11;
            }
            int[] iArr3 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i64 = (iCharAt3 * 2) + iCharAt4;
            int i65 = iCharAt7;
            i3 = iCharAt5;
            i6 = i65;
            i7 = iCharAt3;
            i37 = i61;
            iArr = iArr3;
            i8 = iCharAt6;
            i9 = i64;
            i10 = iCharAt9;
        }
        Unsafe unsafe = f8159n;
        Class<?> cls = q6.f8181a.getClass();
        int[] iArr4 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i66 = i10 + i6;
        int i67 = i66;
        int i68 = i10;
        int i69 = 0;
        int i70 = 0;
        while (i37 < length) {
            int i71 = i37 + 1;
            int iCharAt10 = str.charAt(i37);
            if (iCharAt10 >= c6) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i34 = i73 + 1;
                    cCharAt12 = str.charAt(i73);
                    if (cCharAt12 < c6) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i34;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i19 = i34;
            } else {
                i19 = i71;
            }
            int i75 = i19 + 1;
            int iCharAt11 = str.charAt(i19);
            if (iCharAt11 >= c6) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i33 = i77 + 1;
                    cCharAt11 = str.charAt(i77);
                    i20 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i33;
                    length = i20;
                }
                iCharAt11 = i76 | (cCharAt11 << i78);
                i21 = i33;
            } else {
                i20 = length;
                i21 = i75;
            }
            int i79 = iCharAt11 & 255;
            int i80 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            Object[] objArr2 = q6.f8183c;
            if (i79 >= 51) {
                int i81 = i21 + 1;
                int iCharAt12 = str.charAt(i21);
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i31 = i83 + 1;
                        cCharAt10 = str.charAt(i83);
                        i32 = i82;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i82 = i32 | ((cCharAt10 & 8191) << i84);
                        i84 += 13;
                        i83 = i31;
                    }
                    iCharAt12 = i32 | (cCharAt10 << i84);
                    i27 = i31;
                } else {
                    i27 = i81;
                }
                int i85 = iCharAt12;
                int i86 = i79 - 51;
                int i87 = i27;
                if (i86 == 9 || i86 == 17) {
                    i28 = i9 + 1;
                    objArr[((i70 / 3) * 2) + 1] = objArr2[i9];
                } else {
                    if (i86 == 12 && (AbstractC0916i.b(q6.a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i28 = i9 + 1;
                        objArr[((i70 / 3) * 2) + 1] = objArr2[i9];
                    }
                    i29 = i85 * 2;
                    obj = objArr2[i29];
                    if (obj instanceof Field) {
                        fieldA2 = (Field) obj;
                    } else {
                        fieldA2 = A((String) obj, cls);
                        objArr2[i29] = fieldA2;
                    }
                    i22 = i7;
                    iArr2 = iArr4;
                    iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldA2);
                    i30 = i29 + 1;
                    obj2 = objArr2[i30];
                    if (obj2 instanceof Field) {
                        fieldA3 = (Field) obj2;
                    } else {
                        fieldA3 = A((String) obj2, cls);
                        objArr2[i30] = fieldA3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldA3);
                    i24 = i87;
                    str = str;
                    i26 = 0;
                }
                i9 = i28;
                i29 = i85 * 2;
                obj = objArr2[i29];
                if (obj instanceof Field) {
                    fieldA2 = (Field) obj;
                } else {
                    fieldA2 = A((String) obj, cls);
                    objArr2[i29] = fieldA2;
                }
                i22 = i7;
                iArr2 = iArr4;
                iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldA2);
                i30 = i29 + 1;
                obj2 = objArr2[i30];
                if (obj2 instanceof Field) {
                    fieldA3 = (Field) obj2;
                } else {
                    fieldA3 = A((String) obj2, cls);
                    objArr2[i30] = fieldA3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldA3);
                i24 = i87;
                str = str;
                i26 = 0;
            } else {
                i22 = i7;
                iArr2 = iArr4;
                int i88 = i9 + 1;
                Field fieldA4 = A((String) objArr2[i9], cls);
                if (i79 == 9 || i79 == 17) {
                    i23 = i88;
                    objArr[((i70 / 3) * 2) + 1] = fieldA4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i9 += 2;
                        objArr[((i70 / 3) * 2) + 1] = objArr2[i88];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i23 = i88;
                        if (q6.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i9 += 2;
                            objArr[((i70 / 3) * 2) + 1] = objArr2[i23];
                        }
                    } else if (i79 == 50) {
                        i68++;
                        iArr[i68] = i70;
                        int i89 = (i70 / 3) * 2;
                        int i90 = i9 + 2;
                        objArr[i89] = objArr2[i88];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i89 + 1] = objArr2[i90];
                            i9 += 3;
                        } else {
                            i9 = i90;
                        }
                    } else {
                        i23 = i88;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                    if ((iCharAt11 & 4096) != 0 || i79 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i24 = i21;
                        i25 = 0;
                    } else {
                        int i91 = i21 + 1;
                        int iCharAt13 = str.charAt(i21);
                        if (iCharAt13 >= 55296) {
                            int i92 = iCharAt13 & 8191;
                            int i93 = 13;
                            while (true) {
                                i24 = i91 + 1;
                                cCharAt9 = str.charAt(i91);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i92 |= (cCharAt9 & 8191) << i93;
                                i93 += 13;
                                i91 = i24;
                            }
                            iCharAt13 = i92 | (cCharAt9 << i93);
                        } else {
                            i24 = i91;
                        }
                        int i94 = (iCharAt13 / 32) + (i22 * 2);
                        Object obj3 = objArr2[i94];
                        if (obj3 instanceof Field) {
                            fieldA = (Field) obj3;
                        } else {
                            fieldA = A((String) obj3, cls);
                            objArr2[i94] = fieldA;
                        }
                        int i95 = iCharAt13;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA);
                        i25 = i95 % 32;
                    }
                    if (i79 >= 18 || i79 > 49) {
                        iObjectFieldOffset3 = iObjectFieldOffset2;
                        i26 = i25;
                        iObjectFieldOffset4 = iObjectFieldOffset;
                    } else {
                        iArr[i67] = iObjectFieldOffset;
                        iObjectFieldOffset3 = iObjectFieldOffset2;
                        i26 = i25;
                        iObjectFieldOffset4 = iObjectFieldOffset;
                        i67++;
                    }
                }
                i9 = i23;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i24 = i21;
                    i25 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i24 = i21;
                    i25 = 0;
                }
                if (i79 >= 18) {
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    i26 = i25;
                    iObjectFieldOffset4 = iObjectFieldOffset;
                } else {
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    i26 = i25;
                    iObjectFieldOffset4 = iObjectFieldOffset;
                }
            }
            int i96 = i70 + 1;
            iArr2[i70] = i80;
            int i97 = i70 + 2;
            int i98 = i26;
            iArr2[i96] = ((iCharAt11 & HueLog.LogComponent.APPCORE) != 0 ? 536870912 : 0) | ((iCharAt11 & HueLog.LogComponent.STREAMDTLS) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i79 << 20) | iObjectFieldOffset4;
            i70 += 3;
            iArr2[i97] = (i98 << 20) | iObjectFieldOffset3;
            str = str;
            length = i20;
            i37 = i24;
            i7 = i22;
            iArr4 = iArr2;
            c6 = 55296;
        }
        return new I(iArr4, objArr, i3, i8, q6.f8181a, iArr, i10, i66, k3, abstractC0657z, u6, c0644l, e6);
    }

    public static int u(long j4, Object obj) {
        return ((Integer) e0.f8204c.i(j4, obj)).intValue();
    }

    public static long v(long j4, Object obj) {
        return ((Long) e0.f8204c.i(j4, obj)).longValue();
    }

    public final void B(int i, Object obj) {
        int i3 = this.f8160a[i + 2];
        long j4 = 1048575 & i3;
        if (j4 == 1048575) {
            return;
        }
        e0.m((1 << (i3 >>> 20)) | e0.f8204c.g(j4, obj), j4, obj);
    }

    public final int C(int i, int i3) {
        int[] iArr = this.f8160a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i6 = (length + i3) >>> 1;
            int i7 = i6 * 3;
            int i8 = iArr[i7];
            if (i == i8) {
                return i7;
            }
            if (i < i8) {
                length = i6 - 1;
            } else {
                i3 = i6 + 1;
            }
        }
        return -1;
    }

    public final void D(Object obj, int i, Object obj2) {
        f8159n.putObject(obj, G(i) & 1048575, obj2);
        B(i, obj);
    }

    public final void E(int i, int i3, Object obj, Object obj2) {
        f8159n.putObject(obj, G(i3) & 1048575, obj2);
        e0.m(i, this.f8160a[i3 + 2] & 1048575, obj);
    }

    public final int G(int i) {
        return this.f8160a[i + 1];
    }

    @Override // com.google.protobuf.S
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!m(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f8160a;
            if (i >= iArr.length) {
                T.a(this.f8169k, obj, obj2);
                return;
            }
            int iG = G(i);
            long j4 = iG & 1048575;
            int i3 = iArr[i];
            switch (F(iG)) {
                case 0:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        d0 d0Var = e0.f8204c;
                        d0Var.l(obj3, j4, d0Var.e(j4, obj2));
                        B(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        d0 d0Var2 = e0.f8204c;
                        d0Var2.m(obj3, j4, d0Var2.f(j4, obj2));
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        d0 d0Var3 = e0.f8204c;
                        d0Var3.o(obj3, j4, d0Var3.h(j4, obj2));
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        d0 d0Var4 = e0.f8204c;
                        d0Var4.o(obj3, j4, d0Var4.h(j4, obj2));
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        e0.m(e0.f8204c.g(j4, obj2), j4, obj3);
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        d0 d0Var5 = e0.f8204c;
                        d0Var5.o(obj3, j4, d0Var5.h(j4, obj2));
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        e0.m(e0.f8204c.g(j4, obj2), j4, obj3);
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        d0 d0Var6 = e0.f8204c;
                        d0Var6.k(obj3, j4, d0Var6.c(j4, obj2));
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        e0.n(j4, obj3, e0.f8204c.i(j4, obj2));
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    o(obj3, i, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        e0.n(j4, obj3, e0.f8204c.i(j4, obj2));
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        e0.m(e0.f8204c.g(j4, obj2), j4, obj3);
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        e0.m(e0.f8204c.g(j4, obj2), j4, obj3);
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        e0.m(e0.f8204c.g(j4, obj2), j4, obj3);
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        d0 d0Var7 = e0.f8204c;
                        d0Var7.o(obj3, j4, d0Var7.h(j4, obj2));
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        e0.m(e0.f8204c.g(j4, obj2), j4, obj3);
                        B(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (k(i, obj2)) {
                        d0 d0Var8 = e0.f8204c;
                        obj3 = obj;
                        d0Var8.o(obj3, j4, d0Var8.h(j4, obj2));
                        B(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    o(obj, i, obj2);
                    break;
                case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case WampClient.RequestType.SUBSCRIBED /* 33 */:
                case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                case WampClient.RequestType.EVENT /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case WampClient.RequestType.CALL /* 48 */:
                case WampClient.RequestType.CANCEL /* 49 */:
                    this.f8168j.b(j4, obj, obj2);
                    break;
                case WampClient.RequestType.RESULT /* 50 */:
                    Class cls = T.f8185a;
                    d0 d0Var9 = e0.f8204c;
                    Object objI = d0Var9.i(j4, obj);
                    Object objI2 = d0Var9.i(j4, obj2);
                    this.f8170l.getClass();
                    e0.n(j4, obj, E.a(objI, objI2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (n(i3, i, obj2)) {
                        e0.n(j4, obj, e0.f8204c.i(j4, obj2));
                        e0.m(i3, iArr[i + 2] & 1048575, obj);
                    }
                    break;
                case 60:
                    p(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (n(i3, i, obj2)) {
                        e0.n(j4, obj, e0.f8204c.i(j4, obj2));
                        e0.m(i3, iArr[i + 2] & 1048575, obj);
                    }
                    break;
                case 68:
                    p(obj, i, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[SYNTHETIC] */
    @Override // com.google.protobuf.S
    public final void b(Object obj) {
        if (m(obj)) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                rVar.j(Integer.MAX_VALUE);
                rVar.memoizedHashCode = 0;
                rVar.f();
            }
            int[] iArr = this.f8160a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iG = G(i);
                long j4 = 1048575 & iG;
                int iF = F(iG);
                if (iF != 9) {
                    if (iF != 60 && iF != 68) {
                        switch (iF) {
                            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                if (k(i, obj)) {
                                    j(i).b(f8159n.getObject(obj, j4));
                                }
                                break;
                            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case WampClient.RequestType.SUBSCRIBED /* 33 */:
                            case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                            case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                            case WampClient.RequestType.EVENT /* 36 */:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case WampClient.RequestType.CALL /* 48 */:
                            case WampClient.RequestType.CANCEL /* 49 */:
                                this.f8168j.a(j4, obj);
                                break;
                            case WampClient.RequestType.RESULT /* 50 */:
                                Unsafe unsafe = f8159n;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    this.f8170l.getClass();
                                    ((D) object).f8154h = false;
                                    unsafe.putObject(obj, j4, object);
                                }
                                break;
                        }
                    } else if (n(iArr[i], i, obj)) {
                        j(i).b(f8159n.getObject(obj, j4));
                    }
                } else if (k(i, obj)) {
                    j(i).b(f8159n.getObject(obj, j4));
                }
            }
            ((W) this.f8169k).getClass();
            V v6 = ((r) obj).unknownFields;
            if (v6.f8192d) {
                v6.f8192d = false;
            }
        }
    }

    @Override // com.google.protobuf.S
    public final boolean c(Object obj) {
        int i;
        int i3;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f8166g) {
            int i9 = this.f8165f[i8];
            int[] iArr = this.f8160a;
            int i10 = iArr[i9];
            int iG = G(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f8159n.getInt(obj, i12);
                }
                i3 = i7;
                i = i12;
            } else {
                int i14 = i7;
                i = i6;
                i3 = i14;
            }
            if ((268435456 & iG) == 0 || l(obj, i9, i, i3, i13)) {
                int iF = F(iG);
                if (iF == 9 || iF == 17) {
                    if (l(obj, i9, i, i3, i13)) {
                        if (!j(i9).c(e0.f8204c.i(iG & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i8++;
                    i6 = i;
                    i7 = i3;
                } else {
                    if (iF != 27) {
                        if (iF == 60 || iF == 68) {
                            if (n(i10, i9, obj)) {
                                if (!j(i9).c(e0.f8204c.i(iG & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iF != 49) {
                            if (iF != 50) {
                                continue;
                            } else {
                                Object objI = e0.f8204c.i(iG & 1048575, obj);
                                this.f8170l.getClass();
                                if (!((D) objI).isEmpty()) {
                                    p012c.k.A(this.f8161b[(i9 / 3) * 2]);
                                    throw null;
                                }
                            }
                        }
                        i8++;
                        i6 = i;
                        i7 = i3;
                    }
                    List list = (List) e0.f8204c.i(iG & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        S sJ = j(i9);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            if (sJ.c(list.get(i15))) {
                            }
                        }
                    }
                    i8++;
                    i6 = i;
                    i7 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.S
    public final r d() {
        this.i.getClass();
        return this.f8164e.g();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.protobuf.S
    public final boolean e(r rVar, r rVar2) {
        int[] iArr = this.f8160a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zB = true;
            if (i < length) {
                int iG = G(i);
                long j4 = iG & 1048575;
                switch (F(iG)) {
                    case 0:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var = e0.f8204c;
                            if (Double.doubleToLongBits(d0Var.e(j4, rVar)) != Double.doubleToLongBits(d0Var.e(j4, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case 1:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var2 = e0.f8204c;
                            if (Float.floatToIntBits(d0Var2.f(j4, rVar)) != Float.floatToIntBits(d0Var2.f(j4, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case 2:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var3 = e0.f8204c;
                            if (d0Var3.h(j4, rVar) != d0Var3.h(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 3:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var4 = e0.f8204c;
                            if (d0Var4.h(j4, rVar) != d0Var4.h(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 4:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var5 = e0.f8204c;
                            if (d0Var5.g(j4, rVar) != d0Var5.g(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 5:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var6 = e0.f8204c;
                            if (d0Var6.h(j4, rVar) != d0Var6.h(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 6:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var7 = e0.f8204c;
                            if (d0Var7.g(j4, rVar) != d0Var7.g(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 7:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var8 = e0.f8204c;
                            if (d0Var8.c(j4, rVar) != d0Var8.c(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 8:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var9 = e0.f8204c;
                            if (!T.b(d0Var9.i(j4, rVar), d0Var9.i(j4, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case 9:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var10 = e0.f8204c;
                            if (!T.b(d0Var10.i(j4, rVar), d0Var10.i(j4, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case 10:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var11 = e0.f8204c;
                            if (!T.b(d0Var11.i(j4, rVar), d0Var11.i(j4, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case 11:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var12 = e0.f8204c;
                            if (d0Var12.g(j4, rVar) != d0Var12.g(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 12:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var13 = e0.f8204c;
                            if (d0Var13.g(j4, rVar) != d0Var13.g(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 13:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var14 = e0.f8204c;
                            if (d0Var14.g(j4, rVar) != d0Var14.g(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 14:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var15 = e0.f8204c;
                            if (d0Var15.h(j4, rVar) != d0Var15.h(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 15:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var16 = e0.f8204c;
                            if (d0Var16.g(j4, rVar) != d0Var16.g(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 16:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var17 = e0.f8204c;
                            if (d0Var17.h(j4, rVar) != d0Var17.h(j4, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                        if (!h(rVar, rVar2, i)) {
                            zB = false;
                        } else {
                            d0 d0Var18 = e0.f8204c;
                            if (!T.b(d0Var18.i(j4, rVar), d0Var18.i(j4, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                    case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case WampClient.RequestType.SUBSCRIBED /* 33 */:
                    case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                    case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                    case WampClient.RequestType.EVENT /* 36 */:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case WampClient.RequestType.CALL /* 48 */:
                    case WampClient.RequestType.CANCEL /* 49 */:
                        d0 d0Var19 = e0.f8204c;
                        zB = T.b(d0Var19.i(j4, rVar), d0Var19.i(j4, rVar2));
                        break;
                    case WampClient.RequestType.RESULT /* 50 */:
                        d0 d0Var20 = e0.f8204c;
                        zB = T.b(d0Var20.i(j4, rVar), d0Var20.i(j4, rVar2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j6 = iArr[i + 2] & 1048575;
                        d0 d0Var21 = e0.f8204c;
                        if (d0Var21.g(j6, rVar) != d0Var21.g(j6, rVar2) || !T.b(d0Var21.i(j4, rVar), d0Var21.i(j4, rVar2))) {
                            zB = false;
                        }
                        break;
                }
                if (zB) {
                    i += 3;
                }
            } else {
                W w6 = (W) this.f8169k;
                w6.getClass();
                V v6 = rVar.unknownFields;
                w6.getClass();
                if (v6.equals(rVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.protobuf.S
    public final void f(Object obj, byte[] bArr, int i, int i3, J2.c cVar) throws InvalidProtocolBufferException {
        x(obj, bArr, i, i3, 0, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.S
    public final int g(r rVar) {
        int i;
        int iA;
        int i3;
        int[] iArr = this.f8160a;
        int length = iArr.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iG = G(i7);
            int i8 = iArr[i7];
            long j4 = 1048575 & iG;
            int i9 = 1237;
            int iHashCode = 37;
            switch (F(iG)) {
                case 0:
                    i = i6 * 53;
                    iA = AbstractC0652u.a(Double.doubleToLongBits(e0.f8204c.e(j4, rVar)));
                    i6 = iA + i;
                    break;
                case 1:
                    i = i6 * 53;
                    iA = Float.floatToIntBits(e0.f8204c.f(j4, rVar));
                    i6 = iA + i;
                    break;
                case 2:
                    i = i6 * 53;
                    iA = AbstractC0652u.a(e0.f8204c.h(j4, rVar));
                    i6 = iA + i;
                    break;
                case 3:
                    i = i6 * 53;
                    iA = AbstractC0652u.a(e0.f8204c.h(j4, rVar));
                    i6 = iA + i;
                    break;
                case 4:
                    i = i6 * 53;
                    iA = e0.f8204c.g(j4, rVar);
                    i6 = iA + i;
                    break;
                case 5:
                    i = i6 * 53;
                    iA = AbstractC0652u.a(e0.f8204c.h(j4, rVar));
                    i6 = iA + i;
                    break;
                case 6:
                    i = i6 * 53;
                    iA = e0.f8204c.g(j4, rVar);
                    i6 = iA + i;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zC = e0.f8204c.c(j4, rVar);
                    Charset charset = AbstractC0652u.f8224a;
                    if (zC) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i = i6 * 53;
                    iA = ((String) e0.f8204c.i(j4, rVar)).hashCode();
                    i6 = iA + i;
                    break;
                case 9:
                    Object objI = e0.f8204c.i(j4, rVar);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
                    break;
                case 10:
                    i = i6 * 53;
                    iA = e0.f8204c.i(j4, rVar).hashCode();
                    i6 = iA + i;
                    break;
                case 11:
                    i = i6 * 53;
                    iA = e0.f8204c.g(j4, rVar);
                    i6 = iA + i;
                    break;
                case 12:
                    i = i6 * 53;
                    iA = e0.f8204c.g(j4, rVar);
                    i6 = iA + i;
                    break;
                case 13:
                    i = i6 * 53;
                    iA = e0.f8204c.g(j4, rVar);
                    i6 = iA + i;
                    break;
                case 14:
                    i = i6 * 53;
                    iA = AbstractC0652u.a(e0.f8204c.h(j4, rVar));
                    i6 = iA + i;
                    break;
                case 15:
                    i = i6 * 53;
                    iA = e0.f8204c.g(j4, rVar);
                    i6 = iA + i;
                    break;
                case 16:
                    i = i6 * 53;
                    iA = AbstractC0652u.a(e0.f8204c.h(j4, rVar));
                    i6 = iA + i;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    Object objI2 = e0.f8204c.i(j4, rVar);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
                    break;
                case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case WampClient.RequestType.SUBSCRIBED /* 33 */:
                case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                case WampClient.RequestType.EVENT /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case WampClient.RequestType.CALL /* 48 */:
                case WampClient.RequestType.CANCEL /* 49 */:
                    i = i6 * 53;
                    iA = e0.f8204c.i(j4, rVar).hashCode();
                    i6 = iA + i;
                    break;
                case WampClient.RequestType.RESULT /* 50 */:
                    i = i6 * 53;
                    iA = e0.f8204c.i(j4, rVar).hashCode();
                    i6 = iA + i;
                    break;
                case 51:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = AbstractC0652u.a(Double.doubleToLongBits(((Double) e0.f8204c.i(j4, rVar)).doubleValue()));
                        i6 = iA + i;
                    }
                    break;
                case 52:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = Float.floatToIntBits(((Float) e0.f8204c.i(j4, rVar)).floatValue());
                        i6 = iA + i;
                    }
                    break;
                case 53:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = AbstractC0652u.a(v(j4, rVar));
                        i6 = iA + i;
                    }
                    break;
                case 54:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = AbstractC0652u.a(v(j4, rVar));
                        i6 = iA + i;
                    }
                    break;
                case 55:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = u(j4, rVar);
                        i6 = iA + i;
                    }
                    break;
                case 56:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = AbstractC0652u.a(v(j4, rVar));
                        i6 = iA + i;
                    }
                    break;
                case 57:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = u(j4, rVar);
                        i6 = iA + i;
                    }
                    break;
                case 58:
                    if (n(i8, i7, rVar)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) e0.f8204c.i(j4, rVar)).booleanValue();
                        Charset charset2 = AbstractC0652u.f8224a;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = ((String) e0.f8204c.i(j4, rVar)).hashCode();
                        i6 = iA + i;
                    }
                    break;
                case 60:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = e0.f8204c.i(j4, rVar).hashCode();
                        i6 = iA + i;
                    }
                    break;
                case 61:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = e0.f8204c.i(j4, rVar).hashCode();
                        i6 = iA + i;
                    }
                    break;
                case 62:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = u(j4, rVar);
                        i6 = iA + i;
                    }
                    break;
                case 63:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = u(j4, rVar);
                        i6 = iA + i;
                    }
                    break;
                case 64:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = u(j4, rVar);
                        i6 = iA + i;
                    }
                    break;
                case 65:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = AbstractC0652u.a(v(j4, rVar));
                        i6 = iA + i;
                    }
                    break;
                case 66:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = u(j4, rVar);
                        i6 = iA + i;
                    }
                    break;
                case 67:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = AbstractC0652u.a(v(j4, rVar));
                        i6 = iA + i;
                    }
                    break;
                case 68:
                    if (n(i8, i7, rVar)) {
                        i = i6 * 53;
                        iA = e0.f8204c.i(j4, rVar).hashCode();
                        i6 = iA + i;
                    }
                    break;
            }
        }
        ((W) this.f8169k).getClass();
        return rVar.unknownFields.hashCode() + (i6 * 53);
    }

    public final boolean h(r rVar, r rVar2, int i) {
        return k(i, rVar) == k(i, rVar2);
    }

    public final void i(int i) {
        if (this.f8161b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final S j(int i) {
        int i3 = (i / 3) * 2;
        Object[] objArr = this.f8161b;
        S s6 = (S) objArr[i3];
        if (s6 != null) {
            return s6;
        }
        S sA = O.f8176c.a((Class) objArr[i3 + 1]);
        objArr[i3] = sA;
        return sA;
    }

    public final boolean k(int i, Object obj) {
        int i3 = this.f8160a[i + 2];
        long j4 = i3 & 1048575;
        if (j4 == 1048575) {
            int iG = G(i);
            long j6 = iG & 1048575;
            switch (F(iG)) {
                case 0:
                    if (Double.doubleToRawLongBits(e0.f8204c.e(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(e0.f8204c.f(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (e0.f8204c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (e0.f8204c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (e0.f8204c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (e0.f8204c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (e0.f8204c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return e0.f8204c.c(j6, obj);
                case 8:
                    Object objI = e0.f8204c.i(j6, obj);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof AbstractC0640h) {
                        return !AbstractC0640h.i.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (e0.f8204c.i(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC0640h.i.equals(e0.f8204c.i(j6, obj));
                case 11:
                    if (e0.f8204c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (e0.f8204c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (e0.f8204c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (e0.f8204c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (e0.f8204c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (e0.f8204c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    if (e0.f8204c.i(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i3 >>> 20)) & e0.f8204c.g(j4, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean l(Object obj, int i, int i3, int i6, int i7) {
        if (i3 == 1048575) {
            return k(i, obj);
        }
        return (i6 & i7) != 0;
    }

    public final boolean n(int i, int i3, Object obj) {
        return e0.f8204c.g((long) (this.f8160a[i3 + 2] & 1048575), obj) == i;
    }

    public final void o(Object obj, int i, Object obj2) {
        if (k(i, obj2)) {
            long jG = G(i) & 1048575;
            Unsafe unsafe = f8159n;
            Object object = unsafe.getObject(obj2, jG);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f8160a[i] + " is present but null: " + obj2);
            }
            S sJ = j(i);
            if (!k(i, obj)) {
                if (m(object)) {
                    r rVarD = sJ.d();
                    sJ.a(rVarD, object);
                    unsafe.putObject(obj, jG, rVarD);
                } else {
                    unsafe.putObject(obj, jG, object);
                }
                B(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jG);
            if (!m(object2)) {
                r rVarD2 = sJ.d();
                sJ.a(rVarD2, object2);
                unsafe.putObject(obj, jG, rVarD2);
                object2 = rVarD2;
            }
            sJ.a(object2, object);
        }
    }

    public final void p(Object obj, int i, Object obj2) {
        int[] iArr = this.f8160a;
        int i3 = iArr[i];
        if (n(i3, i, obj2)) {
            long jG = G(i) & 1048575;
            Unsafe unsafe = f8159n;
            Object object = unsafe.getObject(obj2, jG);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            S sJ = j(i);
            if (!n(i3, i, obj)) {
                if (m(object)) {
                    r rVarD = sJ.d();
                    sJ.a(rVarD, object);
                    unsafe.putObject(obj, jG, rVarD);
                } else {
                    unsafe.putObject(obj, jG, object);
                }
                e0.m(i3, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jG);
            if (!m(object2)) {
                r rVarD2 = sJ.d();
                sJ.a(rVarD2, object2);
                unsafe.putObject(obj, jG, rVarD2);
                object2 = rVarD2;
            }
            sJ.a(object2, object);
        }
    }

    public final Object q(int i, Object obj) {
        S sJ = j(i);
        long jG = G(i) & 1048575;
        if (!k(i, obj)) {
            return sJ.d();
        }
        Object object = f8159n.getObject(obj, jG);
        if (m(object)) {
            return object;
        }
        r rVarD = sJ.d();
        if (object != null) {
            sJ.a(rVarD, object);
        }
        return rVarD;
    }

    public final Object r(int i, int i3, Object obj) {
        S sJ = j(i3);
        if (!n(i, i3, obj)) {
            return sJ.d();
        }
        Object object = f8159n.getObject(obj, G(i3) & 1048575);
        if (m(object)) {
            return object;
        }
        r rVarD = sJ.d();
        if (object != null) {
            sJ.a(rVarD, object);
        }
        return rVarD;
    }

    public final void w(int i, long j4, Object obj) {
        D d6;
        Unsafe unsafe = f8159n;
        Object obj2 = this.f8161b[(i / 3) * 2];
        Object object = unsafe.getObject(obj, j4);
        this.f8170l.getClass();
        if (!((D) object).f8154h) {
            D d7 = D.i;
            if (d7.isEmpty()) {
                d6 = new D();
            } else {
                D d8 = new D(d7);
                d8.f8154h = true;
                d6 = d8;
            }
            E.a(d6, object);
            unsafe.putObject(obj, j4, d6);
        }
        p012c.k.A(obj2);
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13361. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int x(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, J2.c r33) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.I.x(java.lang.Object, byte[], int, int, int, J2.c):int");
    }

    public final int y(Object obj, byte[] bArr, int i, int i3, int i6, int i7, int i8, int i9, int i10, long j4, int i11, J2.c cVar) throws InvalidProtocolBufferException {
        int i12;
        Unsafe unsafe = f8159n;
        long j6 = this.f8160a[i11 + 2] & 1048575;
        switch (i10) {
            case 51:
                if (i8 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(AbstractC0599v0.l(i, bArr))));
                int i13 = i + 8;
                unsafe.putInt(obj, j6, i7);
                return i13;
            case 52:
                if (i8 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(AbstractC0599v0.k(i, bArr))));
                int i14 = i + 4;
                unsafe.putInt(obj, j6, i7);
                return i14;
            case 53:
            case 54:
                if (i8 != 0) {
                    return i;
                }
                int iS = AbstractC0599v0.s(bArr, i, cVar);
                unsafe.putObject(obj, j4, Long.valueOf(cVar.f1913b));
                unsafe.putInt(obj, j6, i7);
                return iS;
            case 55:
            case 62:
                if (i8 != 0) {
                    return i;
                }
                int iQ = AbstractC0599v0.q(bArr, i, cVar);
                unsafe.putObject(obj, j4, Integer.valueOf(cVar.f1912a));
                unsafe.putInt(obj, j6, i7);
                return iQ;
            case 56:
            case 65:
                if (i8 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Long.valueOf(AbstractC0599v0.l(i, bArr)));
                int i15 = i + 8;
                unsafe.putInt(obj, j6, i7);
                return i15;
            case 57:
            case 64:
                if (i8 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(AbstractC0599v0.k(i, bArr)));
                int i16 = i + 4;
                unsafe.putInt(obj, j6, i7);
                return i16;
            case 58:
                if (i8 != 0) {
                    return i;
                }
                int iS2 = AbstractC0599v0.s(bArr, i, cVar);
                unsafe.putObject(obj, j4, Boolean.valueOf(cVar.f1913b != 0));
                unsafe.putInt(obj, j6, i7);
                return iS2;
            case 59:
                if (i8 != 2) {
                    return i;
                }
                int iQ2 = AbstractC0599v0.q(bArr, i, cVar);
                int i17 = cVar.f1912a;
                if (i17 == 0) {
                    unsafe.putObject(obj, j4, "");
                } else {
                    if ((i9 & 536870912) != 0) {
                        if (!g0.f8213a.x(bArr, iQ2, iQ2 + i17)) {
                            throw InvalidProtocolBufferException.a();
                        }
                    }
                    unsafe.putObject(obj, j4, new String(bArr, iQ2, i17, AbstractC0652u.f8224a));
                    iQ2 += i17;
                }
                unsafe.putInt(obj, j6, i7);
                return iQ2;
            case 60:
                i12 = i;
                if (i8 == 2) {
                    Object objR = r(i7, i11, obj);
                    int iF = AbstractC0599v0.F(objR, j(i11), bArr, i12, i3, cVar);
                    E(i7, i11, obj, objR);
                    return iF;
                }
                return i12;
            case 61:
                i12 = i;
                if (i8 == 2) {
                    int iJ = AbstractC0599v0.j(bArr, i12, cVar);
                    unsafe.putObject(obj, j4, cVar.f1914c);
                    unsafe.putInt(obj, j6, i7);
                    return iJ;
                }
                return i12;
            case 63:
                i12 = i;
                if (i8 == 0) {
                    int iQ3 = AbstractC0599v0.q(bArr, i12, cVar);
                    int i18 = cVar.f1912a;
                    i(i11);
                    unsafe.putObject(obj, j4, Integer.valueOf(i18));
                    unsafe.putInt(obj, j6, i7);
                    return iQ3;
                }
                return i12;
            case 66:
                i12 = i;
                if (i8 == 0) {
                    int iQ4 = AbstractC0599v0.q(bArr, i12, cVar);
                    unsafe.putObject(obj, j4, Integer.valueOf(p020d2.n.n(cVar.f1912a)));
                    unsafe.putInt(obj, j6, i7);
                    return iQ4;
                }
                return i12;
            case 67:
                i12 = i;
                if (i8 == 0) {
                    int iS3 = AbstractC0599v0.s(bArr, i12, cVar);
                    unsafe.putObject(obj, j4, Long.valueOf(p020d2.n.o(cVar.f1913b)));
                    unsafe.putInt(obj, j6, i7);
                    return iS3;
                }
                return i12;
            case 68:
                if (i8 == 3) {
                    Object objR2 = r(i7, i11, obj);
                    int iX = ((I) j(i11)).x(objR2, bArr, i, i3, (i6 & (-8)) | 4, cVar);
                    cVar.f1914c = objR2;
                    E(i7, i11, obj, objR2);
                    return iX;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int z(Object obj, byte[] bArr, int i, int i3, int i6, int i7, int i8, long j4, int i9, long j6, J2.c cVar) throws InvalidProtocolBufferException {
        int iR;
        Unsafe unsafe = f8159n;
        InterfaceC0651t interfaceC0651tE = (InterfaceC0651t) unsafe.getObject(obj, j6);
        if (!((AbstractC0634b) interfaceC0651tE).f8196h) {
            int size = interfaceC0651tE.size();
            interfaceC0651tE = interfaceC0651tE.e(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j6, interfaceC0651tE);
        }
        InterfaceC0651t interfaceC0651t = interfaceC0651tE;
        switch (i9) {
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
            case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                if (i7 == 2) {
                    AbstractC0641i abstractC0641i = (AbstractC0641i) interfaceC0651t;
                    int iQ = AbstractC0599v0.q(bArr, i, cVar);
                    int i10 = cVar.f1912a + iQ;
                    while (iQ < i10) {
                        abstractC0641i.d(Double.longBitsToDouble(AbstractC0599v0.l(iQ, bArr)));
                        iQ += 8;
                    }
                    if (iQ == i10) {
                        return iQ;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                if (i7 == 1) {
                    AbstractC0641i abstractC0641i2 = (AbstractC0641i) interfaceC0651t;
                    abstractC0641i2.d(Double.longBitsToDouble(AbstractC0599v0.l(i, bArr)));
                    i += 8;
                    while (i < i3) {
                        int iQ2 = AbstractC0599v0.q(bArr, i, cVar);
                        if (i6 == cVar.f1912a) {
                            abstractC0641i2.d(Double.longBitsToDouble(AbstractC0599v0.l(iQ2, bArr)));
                            i = iQ2 + 8;
                        }
                    }
                }
                return i;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
            case WampClient.RequestType.EVENT /* 36 */:
                if (i7 == 2) {
                    AbstractC0646n abstractC0646n = (AbstractC0646n) interfaceC0651t;
                    int iQ3 = AbstractC0599v0.q(bArr, i, cVar);
                    int i11 = cVar.f1912a + iQ3;
                    while (iQ3 < i11) {
                        abstractC0646n.d(Float.intBitsToFloat(AbstractC0599v0.k(iQ3, bArr)));
                        iQ3 += 4;
                    }
                    if (iQ3 == i11) {
                        return iQ3;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                if (i7 == 5) {
                    AbstractC0646n abstractC0646n2 = (AbstractC0646n) interfaceC0651t;
                    abstractC0646n2.d(Float.intBitsToFloat(AbstractC0599v0.k(i, bArr)));
                    int i12 = i + 4;
                    while (i12 < i3) {
                        int iQ4 = AbstractC0599v0.q(bArr, i12, cVar);
                        if (i6 != cVar.f1912a) {
                            return i12;
                        }
                        abstractC0646n2.d(Float.intBitsToFloat(AbstractC0599v0.k(iQ4, bArr)));
                        i12 = iQ4 + 4;
                    }
                    return i12;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i7 == 2) {
                    A a6 = (A) interfaceC0651t;
                    int iQ5 = AbstractC0599v0.q(bArr, i, cVar);
                    int i13 = cVar.f1912a + iQ5;
                    while (iQ5 < i13) {
                        iQ5 = AbstractC0599v0.s(bArr, iQ5, cVar);
                        a6.d(cVar.f1913b);
                    }
                    if (iQ5 == i13) {
                        return iQ5;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                if (i7 == 0) {
                    A a7 = (A) interfaceC0651t;
                    int iS = AbstractC0599v0.s(bArr, i, cVar);
                    a7.d(cVar.f1913b);
                    while (iS < i3) {
                        int iQ6 = AbstractC0599v0.q(bArr, iS, cVar);
                        if (i6 != cVar.f1912a) {
                            return iS;
                        }
                        iS = AbstractC0599v0.s(bArr, iQ6, cVar);
                        a7.d(cVar.f1913b);
                    }
                    return iS;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i7 != 2) {
                    if (i7 == 0) {
                        return AbstractC0599v0.r(i6, bArr, i, i3, interfaceC0651t, cVar);
                    }
                    return i;
                }
                AbstractC0650s abstractC0650s = (AbstractC0650s) interfaceC0651t;
                int iQ7 = AbstractC0599v0.q(bArr, i, cVar);
                int i14 = cVar.f1912a + iQ7;
                while (iQ7 < i14) {
                    iQ7 = AbstractC0599v0.q(bArr, iQ7, cVar);
                    abstractC0650s.d(cVar.f1912a);
                }
                if (iQ7 == i14) {
                    return iQ7;
                }
                throw InvalidProtocolBufferException.d();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i7 == 2) {
                    A a8 = (A) interfaceC0651t;
                    int iQ8 = AbstractC0599v0.q(bArr, i, cVar);
                    int i15 = cVar.f1912a + iQ8;
                    while (iQ8 < i15) {
                        a8.d(AbstractC0599v0.l(iQ8, bArr));
                        iQ8 += 8;
                    }
                    if (iQ8 == i15) {
                        return iQ8;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                if (i7 == 1) {
                    A a9 = (A) interfaceC0651t;
                    a9.d(AbstractC0599v0.l(i, bArr));
                    int i16 = i + 8;
                    while (i16 < i3) {
                        int iQ9 = AbstractC0599v0.q(bArr, i16, cVar);
                        if (i6 != cVar.f1912a) {
                            return i16;
                        }
                        a9.d(AbstractC0599v0.l(iQ9, bArr));
                        i16 = iQ9 + 8;
                    }
                    return i16;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i7 == 2) {
                    AbstractC0650s abstractC0650s2 = (AbstractC0650s) interfaceC0651t;
                    int iQ10 = AbstractC0599v0.q(bArr, i, cVar);
                    int i17 = cVar.f1912a + iQ10;
                    while (iQ10 < i17) {
                        abstractC0650s2.d(AbstractC0599v0.k(iQ10, bArr));
                        iQ10 += 4;
                    }
                    if (iQ10 == i17) {
                        return iQ10;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                if (i7 == 5) {
                    AbstractC0650s abstractC0650s3 = (AbstractC0650s) interfaceC0651t;
                    abstractC0650s3.d(AbstractC0599v0.k(i, bArr));
                    int i18 = i + 4;
                    while (i18 < i3) {
                        int iQ11 = AbstractC0599v0.q(bArr, i18, cVar);
                        if (i6 != cVar.f1912a) {
                            return i18;
                        }
                        abstractC0650s3.d(AbstractC0599v0.k(iQ11, bArr));
                        i18 = iQ11 + 4;
                    }
                    return i18;
                }
                return i;
            case 25:
            case 42:
                if (i7 == 2) {
                    AbstractC0636d abstractC0636d = (AbstractC0636d) interfaceC0651t;
                    int iQ12 = AbstractC0599v0.q(bArr, i, cVar);
                    int i19 = cVar.f1912a + iQ12;
                    while (iQ12 < i19) {
                        iQ12 = AbstractC0599v0.s(bArr, iQ12, cVar);
                        abstractC0636d.d(cVar.f1913b != 0);
                    }
                    if (iQ12 == i19) {
                        return iQ12;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                if (i7 == 0) {
                    AbstractC0636d abstractC0636d2 = (AbstractC0636d) interfaceC0651t;
                    int iS2 = AbstractC0599v0.s(bArr, i, cVar);
                    abstractC0636d2.d(cVar.f1913b != 0);
                    while (iS2 < i3) {
                        int iQ13 = AbstractC0599v0.q(bArr, iS2, cVar);
                        if (i6 != cVar.f1912a) {
                            return iS2;
                        }
                        iS2 = AbstractC0599v0.s(bArr, iQ13, cVar);
                        abstractC0636d2.d(cVar.f1913b != 0);
                    }
                    return iS2;
                }
                return i;
            case 26:
                if (i7 == 2) {
                    if ((j4 & 536870912) == 0) {
                        int iQ14 = AbstractC0599v0.q(bArr, i, cVar);
                        int i20 = cVar.f1912a;
                        if (i20 < 0) {
                            throw InvalidProtocolBufferException.b();
                        }
                        if (i20 == 0) {
                            interfaceC0651t.add("");
                        } else {
                            interfaceC0651t.add(new String(bArr, iQ14, i20, AbstractC0652u.f8224a));
                            iQ14 += i20;
                        }
                        while (iQ14 < i3) {
                            int iQ15 = AbstractC0599v0.q(bArr, iQ14, cVar);
                            if (i6 != cVar.f1912a) {
                                return iQ14;
                            }
                            iQ14 = AbstractC0599v0.q(bArr, iQ15, cVar);
                            int i21 = cVar.f1912a;
                            if (i21 < 0) {
                                throw InvalidProtocolBufferException.b();
                            }
                            if (i21 == 0) {
                                interfaceC0651t.add("");
                            } else {
                                interfaceC0651t.add(new String(bArr, iQ14, i21, AbstractC0652u.f8224a));
                                iQ14 += i21;
                            }
                        }
                        return iQ14;
                    }
                    int iQ16 = AbstractC0599v0.q(bArr, i, cVar);
                    int i22 = cVar.f1912a;
                    if (i22 < 0) {
                        throw InvalidProtocolBufferException.b();
                    }
                    if (i22 == 0) {
                        interfaceC0651t.add("");
                    } else {
                        int i23 = iQ16 + i22;
                        if (!g0.f8213a.x(bArr, iQ16, i23)) {
                            throw InvalidProtocolBufferException.a();
                        }
                        interfaceC0651t.add(new String(bArr, iQ16, i22, AbstractC0652u.f8224a));
                        iQ16 = i23;
                    }
                    while (iQ16 < i3) {
                        int iQ17 = AbstractC0599v0.q(bArr, iQ16, cVar);
                        if (i6 != cVar.f1912a) {
                            return iQ16;
                        }
                        iQ16 = AbstractC0599v0.q(bArr, iQ17, cVar);
                        int i24 = cVar.f1912a;
                        if (i24 < 0) {
                            throw InvalidProtocolBufferException.b();
                        }
                        if (i24 == 0) {
                            interfaceC0651t.add("");
                        } else {
                            int i25 = iQ16 + i24;
                            if (!g0.f8213a.x(bArr, iQ16, i25)) {
                                throw InvalidProtocolBufferException.a();
                            }
                            interfaceC0651t.add(new String(bArr, iQ16, i24, AbstractC0652u.f8224a));
                            iQ16 = i25;
                        }
                    }
                    return iQ16;
                }
                return i;
            case 27:
                if (i7 == 2) {
                    return AbstractC0599v0.m(j(i8), i6, bArr, i, i3, interfaceC0651t, cVar);
                }
                return i;
            case 28:
                if (i7 == 2) {
                    int iQ18 = AbstractC0599v0.q(bArr, i, cVar);
                    int i26 = cVar.f1912a;
                    if (i26 < 0) {
                        throw InvalidProtocolBufferException.b();
                    }
                    if (i26 > bArr.length - iQ18) {
                        throw InvalidProtocolBufferException.d();
                    }
                    if (i26 == 0) {
                        interfaceC0651t.add(AbstractC0640h.i);
                    } else {
                        interfaceC0651t.add(AbstractC0640h.g(bArr, iQ18, i26));
                        iQ18 += i26;
                    }
                    while (iQ18 < i3) {
                        int iQ19 = AbstractC0599v0.q(bArr, iQ18, cVar);
                        if (i6 != cVar.f1912a) {
                            return iQ18;
                        }
                        iQ18 = AbstractC0599v0.q(bArr, iQ19, cVar);
                        int i27 = cVar.f1912a;
                        if (i27 < 0) {
                            throw InvalidProtocolBufferException.b();
                        }
                        if (i27 > bArr.length - iQ18) {
                            throw InvalidProtocolBufferException.d();
                        }
                        if (i27 == 0) {
                            interfaceC0651t.add(AbstractC0640h.i);
                        } else {
                            interfaceC0651t.add(AbstractC0640h.g(bArr, iQ18, i27));
                            iQ18 += i27;
                        }
                    }
                    return iQ18;
                }
                return i;
            case 30:
            case 44:
                if (i7 != 2) {
                    if (i7 == 0) {
                        iR = AbstractC0599v0.r(i6, bArr, i, i3, interfaceC0651t, cVar);
                    }
                    return i;
                }
                AbstractC0650s abstractC0650s4 = (AbstractC0650s) interfaceC0651t;
                iR = AbstractC0599v0.q(bArr, i, cVar);
                int i28 = cVar.f1912a + iR;
                while (iR < i28) {
                    iR = AbstractC0599v0.q(bArr, iR, cVar);
                    abstractC0650s4.d(cVar.f1912a);
                }
                if (iR != i28) {
                    throw InvalidProtocolBufferException.d();
                }
                i(i8);
                Class cls = T.f8185a;
                return iR;
            case WampClient.RequestType.SUBSCRIBED /* 33 */:
            case 47:
                if (i7 == 2) {
                    AbstractC0650s abstractC0650s5 = (AbstractC0650s) interfaceC0651t;
                    int iQ20 = AbstractC0599v0.q(bArr, i, cVar);
                    int i29 = cVar.f1912a + iQ20;
                    while (iQ20 < i29) {
                        iQ20 = AbstractC0599v0.q(bArr, iQ20, cVar);
                        abstractC0650s5.d(p020d2.n.n(cVar.f1912a));
                    }
                    if (iQ20 == i29) {
                        return iQ20;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                if (i7 == 0) {
                    AbstractC0650s abstractC0650s6 = (AbstractC0650s) interfaceC0651t;
                    int iQ21 = AbstractC0599v0.q(bArr, i, cVar);
                    abstractC0650s6.d(p020d2.n.n(cVar.f1912a));
                    while (iQ21 < i3) {
                        int iQ22 = AbstractC0599v0.q(bArr, iQ21, cVar);
                        if (i6 != cVar.f1912a) {
                            return iQ21;
                        }
                        iQ21 = AbstractC0599v0.q(bArr, iQ22, cVar);
                        abstractC0650s6.d(p020d2.n.n(cVar.f1912a));
                    }
                    return iQ21;
                }
                return i;
            case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
            case WampClient.RequestType.CALL /* 48 */:
                if (i7 == 2) {
                    A a10 = (A) interfaceC0651t;
                    int iQ23 = AbstractC0599v0.q(bArr, i, cVar);
                    int i30 = cVar.f1912a + iQ23;
                    while (iQ23 < i30) {
                        iQ23 = AbstractC0599v0.s(bArr, iQ23, cVar);
                        a10.d(p020d2.n.o(cVar.f1913b));
                    }
                    if (iQ23 == i30) {
                        return iQ23;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                if (i7 == 0) {
                    A a11 = (A) interfaceC0651t;
                    int iS3 = AbstractC0599v0.s(bArr, i, cVar);
                    a11.d(p020d2.n.o(cVar.f1913b));
                    while (iS3 < i3) {
                        int iQ24 = AbstractC0599v0.q(bArr, iS3, cVar);
                        if (i6 != cVar.f1912a) {
                            return iS3;
                        }
                        iS3 = AbstractC0599v0.s(bArr, iQ24, cVar);
                        a11.d(p020d2.n.o(cVar.f1913b));
                    }
                    return iS3;
                }
                return i;
            case WampClient.RequestType.CANCEL /* 49 */:
                if (i7 == 3) {
                    S sJ = j(i8);
                    int i31 = (i6 & (-8)) | 4;
                    r rVarD = sJ.d();
                    I i32 = (I) sJ;
                    int iX = i32.x(rVarD, bArr, i, i3, i31, cVar);
                    I i33 = i32;
                    int i34 = i3;
                    int i35 = i31;
                    J2.c cVar2 = cVar;
                    cVar2.f1914c = rVarD;
                    sJ.b(rVarD);
                    cVar2.f1914c = rVarD;
                    interfaceC0651t.add(rVarD);
                    while (iX < i34) {
                        int iQ25 = AbstractC0599v0.q(bArr, iX, cVar2);
                        if (i6 != cVar2.f1912a) {
                            return iX;
                        }
                        r rVarD2 = sJ.d();
                        int i36 = i35;
                        int i37 = i34;
                        J2.c cVar3 = cVar2;
                        I i38 = i33;
                        iX = i38.x(rVarD2, bArr, iQ25, i37, i36, cVar3);
                        i33 = i38;
                        i34 = i37;
                        i35 = i36;
                        cVar2 = cVar3;
                        cVar2.f1914c = rVarD2;
                        sJ.b(rVarD2);
                        cVar2.f1914c = rVarD2;
                        interfaceC0651t.add(rVarD2);
                    }
                    return iX;
                }
                return i;
            default:
                return i;
        }
    }
}
