package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.protocol.WampClient;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements S0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f7876j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Unsafe f7877k = AbstractC0550a1.h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f7878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f7879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0573i0 f7882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f7883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7885h;
    public final C0601w0 i;

    public M0(int[] iArr, Object[] objArr, int i, int i3, AbstractC0573i0 abstractC0573i0, int[] iArr2, int i6, int i7, C0601w0 c0601w0, C0601w0 c0601w1) {
        this.f7878a = iArr;
        this.f7879b = objArr;
        this.f7880c = i;
        this.f7881d = i3;
        this.f7883f = iArr2;
        this.f7884g = i6;
        this.f7885h = i7;
        this.i = c0601w0;
        this.f7882e = abstractC0573i0;
    }

    public static Field E(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e6) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbO = AbstractC0013g0.o("Field ", str, " for ", name, " not found. Known fields are ");
            sbO.append(string);
            throw new RuntimeException(sbO.toString(), e6);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0605y0) {
            return ((AbstractC0605y0) obj).f();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0271  */
    /* JADX WARN: Code duplicated, block: B:128:0x0277  */
    /* JADX WARN: Code duplicated, block: B:131:0x028f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0292  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a8  */
    public static M0 u(R0 r6, C0601w0 c0601w0, C0601w0 c0601w1) {
        int i;
        int iCharAt;
        int i3;
        int[] iArr;
        int i6;
        int i7;
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
        Object[] objArr;
        int i22;
        int i23;
        int i24;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        char c6;
        int i25;
        int i26;
        int i27;
        int i28;
        Field fieldE;
        int i29;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldE2;
        int i36;
        Object obj2;
        Field fieldE3;
        int i37;
        char cCharAt10;
        int i38;
        int i39;
        char cCharAt11;
        int i40;
        char cCharAt12;
        int i41;
        char cCharAt13;
        if (!(r6 instanceof R0)) {
            r6.getClass();
            throw new ClassCastException();
        }
        String str = r6.f7906b;
        int length = str.length();
        char c7 = 55296;
        if (str.charAt(0) >= 55296) {
            int i42 = 1;
            while (true) {
                i = i42 + 1;
                if (str.charAt(i42) < 55296) {
                    break;
                }
                i42 = i;
            }
        } else {
            i = 1;
        }
        int i43 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i44 = iCharAt2 & 8191;
            int i45 = 13;
            while (true) {
                i41 = i43 + 1;
                cCharAt13 = str.charAt(i43);
                if (cCharAt13 < 55296) {
                    break;
                }
                i44 |= (cCharAt13 & 8191) << i45;
                i45 += 13;
                i43 = i41;
            }
            iCharAt2 = i44 | (cCharAt13 << i45);
            i43 = i41;
        }
        if (iCharAt2 == 0) {
            i7 = 0;
            i9 = 0;
            iCharAt = 0;
            i6 = 0;
            i8 = 0;
            i10 = 0;
            iArr = f7876j;
            i3 = 0;
        } else {
            int i46 = i43 + 1;
            int iCharAt3 = str.charAt(i43);
            if (iCharAt3 >= 55296) {
                int i47 = iCharAt3 & 8191;
                int i48 = 13;
                while (true) {
                    i18 = i46 + 1;
                    cCharAt8 = str.charAt(i46);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i18;
                }
                iCharAt3 = i47 | (cCharAt8 << i48);
                i46 = i18;
            }
            int i49 = i46 + 1;
            int iCharAt4 = str.charAt(i46);
            if (iCharAt4 >= 55296) {
                int i50 = iCharAt4 & 8191;
                int i51 = 13;
                while (true) {
                    i17 = i49 + 1;
                    cCharAt7 = str.charAt(i49);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i17;
                }
                iCharAt4 = i50 | (cCharAt7 << i51);
                i49 = i17;
            }
            int i52 = i49 + 1;
            int iCharAt5 = str.charAt(i49);
            if (iCharAt5 >= 55296) {
                int i53 = iCharAt5 & 8191;
                int i54 = 13;
                while (true) {
                    i16 = i52 + 1;
                    cCharAt6 = str.charAt(i52);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i16;
                }
                iCharAt5 = i53 | (cCharAt6 << i54);
                i52 = i16;
            }
            int i55 = i52 + 1;
            int iCharAt6 = str.charAt(i52);
            if (iCharAt6 >= 55296) {
                int i56 = iCharAt6 & 8191;
                int i57 = 13;
                while (true) {
                    i15 = i55 + 1;
                    cCharAt5 = str.charAt(i55);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i15;
                }
                iCharAt6 = i56 | (cCharAt5 << i57);
                i55 = i15;
            }
            int i58 = i55 + 1;
            iCharAt = str.charAt(i55);
            if (iCharAt >= 55296) {
                int i59 = iCharAt & 8191;
                int i60 = 13;
                while (true) {
                    i14 = i58 + 1;
                    cCharAt4 = str.charAt(i58);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt4 & 8191) << i60;
                    i60 += 13;
                    i58 = i14;
                }
                iCharAt = i59 | (cCharAt4 << i60);
                i58 = i14;
            }
            int i61 = i58 + 1;
            int iCharAt7 = str.charAt(i58);
            if (iCharAt7 >= 55296) {
                int i62 = iCharAt7 & 8191;
                int i63 = 13;
                while (true) {
                    i13 = i61 + 1;
                    cCharAt3 = str.charAt(i61);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt3 & 8191) << i63;
                    i63 += 13;
                    i61 = i13;
                }
                iCharAt7 = i62 | (cCharAt3 << i63);
                i61 = i13;
            }
            int i64 = i61 + 1;
            int iCharAt8 = str.charAt(i61);
            if (iCharAt8 >= 55296) {
                int i65 = iCharAt8 & 8191;
                int i66 = 13;
                while (true) {
                    i12 = i64 + 1;
                    cCharAt2 = str.charAt(i64);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt2 & 8191) << i66;
                    i66 += 13;
                    i64 = i12;
                }
                iCharAt8 = i65 | (cCharAt2 << i66);
                i64 = i12;
            }
            int i67 = i64 + 1;
            int iCharAt9 = str.charAt(i64);
            if (iCharAt9 >= 55296) {
                int i68 = iCharAt9 & 8191;
                int i69 = 13;
                while (true) {
                    i11 = i67 + 1;
                    cCharAt = str.charAt(i67);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i68 |= (cCharAt & 8191) << i69;
                    i69 += 13;
                    i67 = i11;
                }
                iCharAt9 = i68 | (cCharAt << i69);
                i67 = i11;
            }
            int i70 = iCharAt3 + iCharAt3 + iCharAt4;
            i3 = iCharAt3;
            i43 = i67;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i71 = iCharAt7;
            i6 = iCharAt5;
            i7 = i71;
            i8 = iCharAt6;
            i9 = i70;
            i10 = iCharAt9;
        }
        Unsafe unsafe = f7877k;
        Class<?> cls = r6.f7905a.getClass();
        int i72 = i10 + i7;
        int i73 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[i73];
        int i74 = i72;
        int i75 = i10;
        int i76 = 0;
        int i77 = 0;
        while (i43 < length) {
            int i78 = i43 + 1;
            int iCharAt10 = str.charAt(i43);
            if (iCharAt10 >= c7) {
                int i79 = iCharAt10 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i40 = i80 + 1;
                    cCharAt12 = str.charAt(i80);
                    if (cCharAt12 < c7) {
                        break;
                    }
                    i79 |= (cCharAt12 & 8191) << i81;
                    i81 += 13;
                    i80 = i40;
                }
                iCharAt10 = i79 | (cCharAt12 << i81);
                i19 = i40;
            } else {
                i19 = i78;
            }
            int i82 = i19 + 1;
            int iCharAt11 = str.charAt(i19);
            if (iCharAt11 >= c7) {
                int i83 = iCharAt11 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i39 = i84 + 1;
                    cCharAt11 = str.charAt(i84);
                    i20 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i83 |= (cCharAt11 & 8191) << i85;
                    i85 += 13;
                    i84 = i39;
                    length = i20;
                }
                iCharAt11 = i83 | (cCharAt11 << i85);
                i21 = i39;
            } else {
                i20 = length;
                i21 = i82;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i86 = iCharAt11 & 255;
            int i87 = iCharAt10;
            int i88 = iCharAt11 & 2048;
            Object[] objArr3 = r6.f7907c;
            if (i86 >= 51) {
                int i89 = i21 + 1;
                int iCharAt12 = str.charAt(i21);
                if (iCharAt12 >= 55296) {
                    int i90 = iCharAt12 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i37 = i91 + 1;
                        cCharAt10 = str.charAt(i91);
                        i38 = i90;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i90 = i38 | ((cCharAt10 & 8191) << i92);
                        i92 += 13;
                        i91 = i37;
                    }
                    iCharAt12 = i38 | (cCharAt10 << i92);
                    i32 = i37;
                } else {
                    i32 = i89;
                }
                int i93 = iCharAt12;
                int i94 = i86 - 51;
                int i95 = i32;
                if (i94 == 9 || i94 == 17) {
                    i33 = i9 + 1;
                    int i96 = i77 / 3;
                    objArr2[i96 + i96 + 1] = objArr3[i9];
                } else {
                    if (i94 != 12) {
                        i34 = i88;
                    } else if (r6.a() == 1 || i88 != 0) {
                        i33 = i9 + 1;
                        int i97 = i77 / 3;
                        objArr2[i97 + i97 + 1] = objArr3[i9];
                    } else {
                        i34 = 0;
                    }
                    i35 = i93 + i93;
                    obj = objArr3[i35];
                    int i98 = i34;
                    if (obj instanceof Field) {
                        fieldE2 = (Field) obj;
                    } else {
                        fieldE2 = E((String) obj, cls);
                        objArr3[i35] = fieldE2;
                    }
                    int i99 = i3;
                    objArr = objArr2;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                    i36 = i35 + 1;
                    obj2 = objArr3[i36];
                    if (obj2 instanceof Field) {
                        fieldE3 = (Field) obj2;
                    } else {
                        fieldE3 = E((String) obj2, cls);
                        objArr3[i36] = fieldE3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldE3);
                    i22 = i99;
                    i24 = i98;
                    str = str;
                    i23 = i9;
                    i25 = i95;
                    i27 = 0;
                    c6 = 55296;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i28 = iObjectFieldOffset3;
                }
                i9 = i33;
                i34 = i88;
                i35 = i93 + i93;
                obj = objArr3[i35];
                int i910 = i34;
                if (obj instanceof Field) {
                    fieldE2 = (Field) obj;
                } else {
                    fieldE2 = E((String) obj, cls);
                    objArr3[i35] = fieldE2;
                }
                int i911 = i3;
                objArr = objArr2;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldE2);
                i36 = i35 + 1;
                obj2 = objArr3[i36];
                if (obj2 instanceof Field) {
                    fieldE3 = (Field) obj2;
                } else {
                    fieldE3 = E((String) obj2, cls);
                    objArr3[i36] = fieldE3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldE3);
                i22 = i911;
                i24 = i910;
                str = str;
                i23 = i9;
                i25 = i95;
                i27 = 0;
                c6 = 55296;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i28 = iObjectFieldOffset5;
            } else {
                int i100 = i3;
                objArr = objArr2;
                int i101 = i9 + 1;
                Field fieldE4 = E((String) objArr3[i9], cls);
                i22 = i100;
                if (i86 == 9 || i86 == 17) {
                    i23 = i101;
                    int i102 = i77 / 3;
                    objArr[i102 + i102 + 1] = fieldE4.getType();
                } else {
                    if (i86 != 27) {
                        if (i86 == 49) {
                            i31 = i9 + 2;
                            i30 = 1;
                        } else {
                            if (i86 == 12 || i86 == 30 || i86 == 44) {
                                i23 = i101;
                                if (r6.a() == 1 || i88 != 0) {
                                    i31 = i9 + 2;
                                    int i103 = i77 / 3;
                                    objArr[i103 + i103 + 1] = objArr3[i23];
                                    i23 = i31;
                                }
                            } else if (i86 == 50) {
                                int i104 = i9 + 2;
                                int i105 = i75 + 1;
                                iArr[i75] = i77;
                                int i106 = i77 / 3;
                                int i107 = i106 + i106;
                                objArr[i107] = objArr3[i101];
                                if (i88 != 0) {
                                    objArr[i107 + 1] = objArr3[i104];
                                    i24 = i88;
                                    i75 = i105;
                                    i23 = i9 + 3;
                                } else {
                                    i75 = i105;
                                    i23 = i104;
                                }
                            } else {
                                i23 = i101;
                            }
                            i24 = 0;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i86 > 17) {
                            c6 = 55296;
                            i25 = i21;
                            i26 = 0;
                        } else {
                            i25 = i21 + 1;
                            int iCharAt13 = str.charAt(i21);
                            if (iCharAt13 >= 55296) {
                                int i108 = iCharAt13 & 8191;
                                int i109 = 13;
                                while (true) {
                                    i29 = i25 + 1;
                                    cCharAt9 = str.charAt(i25);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i108 |= (cCharAt9 & 8191) << i109;
                                    i109 += 13;
                                    i25 = i29;
                                }
                                iCharAt13 = i108 | (cCharAt9 << i109);
                                i25 = i29;
                            }
                            int i110 = (iCharAt13 / 32) + i22 + i22;
                            Object obj3 = objArr3[i110];
                            if (obj3 instanceof Field) {
                                fieldE = (Field) obj3;
                            } else {
                                fieldE = E((String) obj3, cls);
                                objArr3[i110] = fieldE;
                            }
                            i26 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE);
                            c6 = 55296;
                        }
                        if (i86 >= 18 && i86 <= 49) {
                            iArr[i74] = iObjectFieldOffset;
                            i74++;
                        }
                        i27 = i26;
                        i28 = iObjectFieldOffset;
                    } else {
                        i30 = 1;
                        i31 = i9 + 2;
                    }
                    int i111 = i77 / 3;
                    objArr[i111 + i111 + i30] = objArr3[i101];
                    i23 = i31;
                }
                i24 = i88;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    c6 = 55296;
                    i25 = i21;
                    i26 = 0;
                } else {
                    c6 = 55296;
                    i25 = i21;
                    i26 = 0;
                }
                if (i86 >= 18) {
                    iArr[i74] = iObjectFieldOffset;
                    i74++;
                }
                i27 = i26;
                i28 = iObjectFieldOffset;
            }
            int i112 = i77 + 1;
            iArr2[i77] = i87;
            int i113 = i77 + 2;
            int i114 = i27;
            iArr2[i112] = ((iCharAt11 & HueLog.LogComponent.APPCORE) != 0 ? 536870912 : 0) | ((iCharAt11 & HueLog.LogComponent.STREAMDTLS) != 0 ? 268435456 : 0) | (i24 != 0 ? Integer.MIN_VALUE : 0) | (i86 << 20) | i28;
            i77 += 3;
            iArr2[i113] = (i114 << 20) | iObjectFieldOffset2;
            i43 = i25;
            c7 = c6;
            length = i20;
            i3 = i22;
            i9 = i23;
            str = str;
            objArr2 = objArr;
        }
        return new M0(iArr2, objArr2, i6, i8, r6.f7905a, iArr, i10, i72, c0601w0, c0601w1);
    }

    public static int v(long j4, Object obj) {
        return ((Integer) AbstractC0550a1.g(j4, obj)).intValue();
    }

    public static int x(int i) {
        return (i >>> 20) & 255;
    }

    public static long z(long j4, Object obj) {
        return ((Long) AbstractC0550a1.g(j4, obj)).longValue();
    }

    public final A0 A(int i) {
        int i3 = i / 3;
        return (A0) this.f7879b[i3 + i3 + 1];
    }

    public final S0 B(int i) {
        int i3 = i / 3;
        int i6 = i3 + i3;
        Object[] objArr = this.f7879b;
        S0 s1 = (S0) objArr[i6];
        if (s1 != null) {
            return s1;
        }
        S0 s0A = P0.f7899c.a((Class) objArr[i6 + 1]);
        objArr[i6] = s0A;
        return s0A;
    }

    public final Object C(int i, Object obj) {
        S0 s0B = B(i);
        int iY = y(i) & 1048575;
        if (!p(i, obj)) {
            return s0B.d();
        }
        Object object = f7877k.getObject(obj, iY);
        if (r(object)) {
            return object;
        }
        AbstractC0605y0 abstractC0605y0D = s0B.d();
        if (object != null) {
            s0B.b(abstractC0605y0D, object);
        }
        return abstractC0605y0D;
    }

    public final Object D(int i, int i3, Object obj) {
        S0 s0B = B(i3);
        if (!s(i, i3, obj)) {
            return s0B.d();
        }
        Object object = f7877k.getObject(obj, y(i3) & 1048575);
        if (r(object)) {
            return object;
        }
        AbstractC0605y0 abstractC0605y0D = s0B.d();
        if (object != null) {
            s0B.b(abstractC0605y0D, object);
        }
        return abstractC0605y0D;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.S0
    public final void a(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof AbstractC0605y0) {
            AbstractC0605y0 abstractC0605y0 = (AbstractC0605y0) obj;
            abstractC0605y0.e();
            abstractC0605y0.zza = 0;
            abstractC0605y0.m();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f7878a;
            if (i >= iArr.length) {
                this.i.getClass();
                V0 v6 = ((AbstractC0605y0) obj).zzc;
                if (v6.f7923e) {
                    v6.f7923e = false;
                    return;
                }
                return;
            }
            int iY = y(i);
            int i3 = 1048575 & iY;
            int iX = x(iY);
            long j4 = i3;
            if (iX != 9) {
                if (iX != 60 && iX != 68) {
                    switch (iX) {
                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                            if (p(i, obj)) {
                                B(i).a(f7877k.getObject(obj, j4));
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
                            AbstractC0576j0 abstractC0576j0 = (AbstractC0576j0) ((C0) AbstractC0550a1.g(j4, obj));
                            if (abstractC0576j0.f7953h) {
                                abstractC0576j0.f7953h = false;
                            }
                            break;
                        case WampClient.RequestType.RESULT /* 50 */:
                            Unsafe unsafe = f7877k;
                            Object object = unsafe.getObject(obj, j4);
                            if (object != null) {
                                ((I0) object).f7862h = false;
                                unsafe.putObject(obj, j4, object);
                            }
                            break;
                    }
                } else if (s(iArr[i], i, obj)) {
                    B(i).a(f7877k.getObject(obj, j4));
                }
            } else if (p(i, obj)) {
                B(i).a(f7877k.getObject(obj, j4));
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.play_billing.S0
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f7878a;
            if (i >= iArr.length) {
                T0.q(obj, obj2);
                return;
            }
            int iY = y(i);
            int i3 = iY & 1048575;
            int iX = x(iY);
            int i6 = iArr[i];
            long j4 = i3;
            switch (iX) {
                case 0:
                    if (!p(i, obj2)) {
                        obj3 = obj;
                    } else {
                        Z0 z5 = AbstractC0550a1.f7932c;
                        obj3 = obj;
                        z5.e(obj3, j4, z5.a(j4, obj2));
                        l(i, obj3);
                    }
                    break;
                case 1:
                    if (p(i, obj2)) {
                        Z0 z6 = AbstractC0550a1.f7932c;
                        z6.f(obj, j4, z6.b(j4, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i, obj2)) {
                        AbstractC0550a1.j(obj, j4, AbstractC0550a1.e(j4, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i, obj2)) {
                        AbstractC0550a1.j(obj, j4, AbstractC0550a1.e(j4, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i, obj2)) {
                        AbstractC0550a1.i(AbstractC0550a1.d(j4, obj2), j4, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i, obj2)) {
                        AbstractC0550a1.j(obj, j4, AbstractC0550a1.e(j4, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i, obj2)) {
                        AbstractC0550a1.i(AbstractC0550a1.d(j4, obj2), j4, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i, obj2)) {
                        Z0 z7 = AbstractC0550a1.f7932c;
                        z7.c(obj, j4, z7.g(j4, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i, obj2)) {
                        AbstractC0550a1.k(j4, obj, AbstractC0550a1.g(j4, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    j(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i, obj2)) {
                        AbstractC0550a1.k(j4, obj, AbstractC0550a1.g(j4, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i, obj2)) {
                        AbstractC0550a1.i(AbstractC0550a1.d(j4, obj2), j4, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i, obj2)) {
                        AbstractC0550a1.i(AbstractC0550a1.d(j4, obj2), j4, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i, obj2)) {
                        AbstractC0550a1.i(AbstractC0550a1.d(j4, obj2), j4, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i, obj2)) {
                        AbstractC0550a1.j(obj, j4, AbstractC0550a1.e(j4, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i, obj2)) {
                        AbstractC0550a1.i(AbstractC0550a1.d(j4, obj2), j4, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i, obj2)) {
                        AbstractC0550a1.j(obj, j4, AbstractC0550a1.e(j4, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    j(obj, i, obj2);
                    obj3 = obj;
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
                    C0 c0B = (C0) AbstractC0550a1.g(j4, obj);
                    C0 c6 = (C0) AbstractC0550a1.g(j4, obj2);
                    int size = c0B.size();
                    int size2 = c6.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC0576j0) c0B).f7953h) {
                            c0B = c0B.b(size2 + size);
                        }
                        c0B.addAll(c6);
                    }
                    if (size > 0) {
                        c6 = c0B;
                    }
                    AbstractC0550a1.k(j4, obj, c6);
                    obj3 = obj;
                    break;
                case WampClient.RequestType.RESULT /* 50 */:
                    C0601w0 c0601w0 = T0.f7910a;
                    AbstractC0550a1.k(j4, obj, C0601w0.c(AbstractC0550a1.g(j4, obj), AbstractC0550a1.g(j4, obj2)));
                    obj3 = obj;
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
                    if (s(i6, i, obj2)) {
                        AbstractC0550a1.k(j4, obj, AbstractC0550a1.g(j4, obj2));
                        AbstractC0550a1.i(i6, iArr[i + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    k(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i6, i, obj2)) {
                        AbstractC0550a1.k(j4, obj, AbstractC0550a1.g(j4, obj2));
                        AbstractC0550a1.i(i6, iArr[i + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    k(obj, i, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void c(Object obj, byte[] bArr, int i, int i3, C0580l0 c0580l0) {
        t(obj, bArr, i, i3, 0, c0580l0);
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final AbstractC0605y0 d() {
        return (AbstractC0605y0) ((AbstractC0605y0) this.f7882e).h(4);
    }

    /* JADX WARN: Code duplicated, block: B:142:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:186:0x04dd  */
    @Override // com.google.android.gms.internal.play_billing.S0
    public final int e(AbstractC0605y0 abstractC0605y0) {
        int i;
        int iH0;
        int iR;
        int i3;
        int i6;
        int iC;
        int iH1;
        int size;
        int iO;
        int iH2;
        int iH3;
        int iH4;
        int iC2;
        int iH5;
        int iR2;
        AbstractC0605y0 abstractC0605y1 = abstractC0605y0;
        Unsafe unsafe = f7877k;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int iJ = 0;
        while (true) {
            int[] iArr = this.f7878a;
            if (i8 >= iArr.length) {
                return abstractC0605y1.zzc.a() + iJ;
            }
            int iY = y(i8);
            int iX = x(iY);
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & 1048575;
            if (iX <= 17) {
                if (i12 != i7) {
                    i9 = i12 == 1048575 ? 0 : unsafe.getInt(abstractC0605y1, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = iY & 1048575;
            if (iX >= EnumC0595t0.i.f8003h) {
                EnumC0595t0.f8000j.getClass();
            }
            long j4 = i13;
            switch (iX) {
                case 0:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        iJ = p012c.k.j(i10 << 3, 8, iJ);
                    }
                    i8 += 3;
                    break;
                case 1:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        iJ = p012c.k.j(i10 << 3, 4, iJ);
                    }
                    abstractC0605y1 = abstractC0605y0;
                    i8 += 3;
                    break;
                case 2:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        long j6 = unsafe.getLong(abstractC0605y1, j4);
                        iH0 = C0590q0.h0(i10 << 3);
                        iR = C0590q0.R(j6);
                        i3 = iR + iH0;
                        iJ += i3;
                    }
                    i8 += 3;
                    break;
                case 3:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        long j7 = unsafe.getLong(abstractC0605y1, j4);
                        iH0 = C0590q0.h0(i10 << 3);
                        iR = C0590q0.R(j7);
                        i3 = iR + iH0;
                        iJ += i3;
                    }
                    i8 += 3;
                    break;
                case 4:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        long j8 = unsafe.getInt(abstractC0605y1, j4);
                        iH0 = C0590q0.h0(i10 << 3);
                        iR = C0590q0.R(j8);
                        i3 = iR + iH0;
                        iJ += i3;
                    }
                    i8 += 3;
                    break;
                case 5:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        iJ = p012c.k.j(i10 << 3, 8, iJ);
                    }
                    abstractC0605y1 = abstractC0605y0;
                    i8 += 3;
                    break;
                case 6:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        iJ = p012c.k.j(i10 << 3, 4, iJ);
                    }
                    abstractC0605y1 = abstractC0605y0;
                    i8 += 3;
                    break;
                case 7:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        iJ = p012c.k.j(i10 << 3, 1, iJ);
                    }
                    abstractC0605y1 = abstractC0605y0;
                    i8 += 3;
                    break;
                case 8:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(abstractC0605y1, j4);
                        if (object instanceof AbstractC0586o0) {
                            int iH6 = C0590q0.h0(i14);
                            int i15 = ((AbstractC0586o0) object).i();
                            iJ = p012c.k.k(i15, i15, iH6, iJ);
                        } else {
                            iH0 = C0590q0.h0(i14);
                            iR = C0590q0.g0((String) object);
                            i3 = iR + iH0;
                            iJ += i3;
                        }
                    }
                    i8 += 3;
                    break;
                case 9:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        Object object2 = unsafe.getObject(abstractC0605y1, j4);
                        S0 s0B = B(i8);
                        C0601w0 c0601w0 = T0.f7910a;
                        int iH7 = C0590q0.h0(i10 << 3);
                        int iC3 = ((AbstractC0573i0) object2).c(s0B);
                        iJ = p012c.k.k(iC3, iC3, iH7, iJ);
                    }
                    i8 += 3;
                    break;
                case 10:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        AbstractC0586o0 abstractC0586o0 = (AbstractC0586o0) unsafe.getObject(abstractC0605y1, j4);
                        int iH8 = C0590q0.h0(i10 << 3);
                        int i16 = abstractC0586o0.i();
                        iJ = p012c.k.k(i16, i16, iH8, iJ);
                    }
                    i8 += 3;
                    break;
                case 11:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        iJ = p012c.k.j(unsafe.getInt(abstractC0605y1, j4), C0590q0.h0(i10 << 3), iJ);
                    }
                    i8 += 3;
                    break;
                case 12:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        long j9 = unsafe.getInt(abstractC0605y1, j4);
                        iH0 = C0590q0.h0(i10 << 3);
                        iR = C0590q0.R(j9);
                        i3 = iR + iH0;
                        iJ += i3;
                    }
                    i8 += 3;
                    break;
                case 13:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        iJ = p012c.k.j(i10 << 3, 4, iJ);
                    }
                    abstractC0605y1 = abstractC0605y0;
                    i8 += 3;
                    break;
                case 14:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        iJ = p012c.k.j(i10 << 3, 8, iJ);
                    }
                    abstractC0605y1 = abstractC0605y0;
                    i8 += 3;
                    break;
                case 15:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        int i17 = unsafe.getInt(abstractC0605y1, j4);
                        iJ = p012c.k.j((i17 >> 31) ^ (i17 + i17), C0590q0.h0(i10 << 3), iJ);
                    }
                    i8 += 3;
                    break;
                case 16:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        long j10 = unsafe.getLong(abstractC0605y1, j4);
                        iH0 = C0590q0.h0(i10 << 3);
                        iR = C0590q0.R((j10 >> 63) ^ (j10 + j10));
                        i3 = iR + iH0;
                        iJ += i3;
                    }
                    i8 += 3;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    if (q(abstractC0605y1, i8, i7, i9, i)) {
                        AbstractC0573i0 abstractC0573i0 = (AbstractC0573i0) unsafe.getObject(abstractC0605y1, j4);
                        S0 s0B2 = B(i8);
                        C0601w0 c0601w1 = T0.f7910a;
                        int iH9 = C0590q0.h0(i10 << 3);
                        i6 = iH9 + iH9;
                        iC = abstractC0573i0.c(s0B2);
                        i3 = iC + i6;
                        iJ += i3;
                    }
                    i8 += 3;
                    break;
                case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                    i3 = T0.i(i10, (List) unsafe.getObject(abstractC0605y1, j4));
                    iJ += i3;
                    i8 += 3;
                    break;
                case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                    i3 = T0.h(i10, (List) unsafe.getObject(abstractC0605y1, j4));
                    iJ += i3;
                    i8 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w2 = T0.f7910a;
                    if (list.size() == 0) {
                        iH1 = 0;
                    } else {
                        iH1 = (C0590q0.h0(i10 << 3) * list.size()) + T0.k(list);
                    }
                    iJ += iH1;
                    i8 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w3 = T0.f7910a;
                    size = list2.size();
                    if (size == 0) {
                        iH3 = 0;
                    } else {
                        iO = T0.o(list2);
                        iH2 = C0590q0.h0(i10 << 3);
                        iH3 = (iH2 * size) + iO;
                    }
                    iJ += iH3;
                    i8 += 3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w4 = T0.f7910a;
                    size = list3.size();
                    if (size == 0) {
                        iH3 = 0;
                    } else {
                        iO = T0.j(list3);
                        iH2 = C0590q0.h0(i10 << 3);
                        iH3 = (iH2 * size) + iO;
                    }
                    iJ += iH3;
                    i8 += 3;
                    break;
                case 23:
                    i3 = T0.i(i10, (List) unsafe.getObject(abstractC0605y1, j4));
                    iJ += i3;
                    i8 += 3;
                    break;
                case 24:
                    i3 = T0.h(i10, (List) unsafe.getObject(abstractC0605y1, j4));
                    iJ += i3;
                    i8 += 3;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w5 = T0.f7910a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iH1 = 0;
                    } else {
                        iH1 = (C0590q0.h0(i10 << 3) + 1) * size2;
                    }
                    iJ += iH1;
                    i8 += 3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w6 = T0.f7910a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iH3 = 0;
                    } else {
                        iH3 = C0590q0.h0(i10 << 3) * size3;
                        for (int i18 = 0; i18 < size3; i18++) {
                            Object obj = list5.get(i18);
                            if (obj instanceof AbstractC0586o0) {
                                int i19 = ((AbstractC0586o0) obj).i();
                                iH3 = p012c.k.j(i19, i19, iH3);
                            } else {
                                iH3 = C0590q0.g0((String) obj) + iH3;
                            }
                        }
                    }
                    iJ += iH3;
                    i8 += 3;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC0605y1, j4);
                    S0 s0B3 = B(i8);
                    C0601w0 c0601w7 = T0.f7910a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iH4 = 0;
                    } else {
                        iH4 = C0590q0.h0(i10 << 3) * size4;
                        for (int i20 = 0; i20 < size4; i20++) {
                            int iC4 = ((AbstractC0573i0) list6.get(i20)).c(s0B3);
                            iH4 = p012c.k.j(iC4, iC4, iH4);
                        }
                    }
                    iJ += iH4;
                    i8 += 3;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w8 = T0.f7910a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iH3 = 0;
                    } else {
                        iH3 = C0590q0.h0(i10 << 3) * size5;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int i22 = ((AbstractC0586o0) list7.get(i21)).i();
                            iH3 = p012c.k.j(i22, i22, iH3);
                        }
                    }
                    iJ += iH3;
                    i8 += 3;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w9 = T0.f7910a;
                    size = list8.size();
                    if (size == 0) {
                        iH3 = 0;
                    } else {
                        iO = T0.n(list8);
                        iH2 = C0590q0.h0(i10 << 3);
                        iH3 = (iH2 * size) + iO;
                    }
                    iJ += iH3;
                    i8 += 3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w10 = T0.f7910a;
                    size = list9.size();
                    if (size == 0) {
                        iH3 = 0;
                    } else {
                        iO = T0.g(list9);
                        iH2 = C0590q0.h0(i10 << 3);
                        iH3 = (iH2 * size) + iO;
                    }
                    iJ += iH3;
                    i8 += 3;
                    break;
                case 31:
                    i3 = T0.h(i10, (List) unsafe.getObject(abstractC0605y1, j4));
                    iJ += i3;
                    i8 += 3;
                    break;
                case 32:
                    i3 = T0.i(i10, (List) unsafe.getObject(abstractC0605y1, j4));
                    iJ += i3;
                    i8 += 3;
                    break;
                case WampClient.RequestType.SUBSCRIBED /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w11 = T0.f7910a;
                    size = list10.size();
                    if (size == 0) {
                        iH3 = 0;
                    } else {
                        iO = T0.l(list10);
                        iH2 = C0590q0.h0(i10 << 3);
                        iH3 = (iH2 * size) + iO;
                    }
                    iJ += iH3;
                    i8 += 3;
                    break;
                case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w12 = T0.f7910a;
                    size = list11.size();
                    if (size == 0) {
                        iH3 = 0;
                    } else {
                        iO = T0.m(list11);
                        iH2 = C0590q0.h0(i10 << 3);
                        iH3 = (iH2 * size) + iO;
                    }
                    iJ += iH3;
                    i8 += 3;
                    break;
                case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w13 = T0.f7910a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iJ = p012c.k.k(size6, C0590q0.h0(i10 << 3), size6, iJ);
                    }
                    i8 += 3;
                    break;
                case WampClient.RequestType.EVENT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w14 = T0.f7910a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iJ = p012c.k.k(size7, C0590q0.h0(i10 << 3), size7, iJ);
                    }
                    i8 += 3;
                    break;
                case 37:
                    int iK = T0.k((List) unsafe.getObject(abstractC0605y1, j4));
                    if (iK > 0) {
                        iJ = p012c.k.k(iK, C0590q0.h0(i10 << 3), iK, iJ);
                    }
                    i8 += 3;
                    break;
                case 38:
                    int iO2 = T0.o((List) unsafe.getObject(abstractC0605y1, j4));
                    if (iO2 > 0) {
                        iJ = p012c.k.k(iO2, C0590q0.h0(i10 << 3), iO2, iJ);
                    }
                    i8 += 3;
                    break;
                case 39:
                    int iJ2 = T0.j((List) unsafe.getObject(abstractC0605y1, j4));
                    if (iJ2 > 0) {
                        iJ = p012c.k.k(iJ2, C0590q0.h0(i10 << 3), iJ2, iJ);
                    }
                    i8 += 3;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w15 = T0.f7910a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iJ = p012c.k.k(size8, C0590q0.h0(i10 << 3), size8, iJ);
                    }
                    i8 += 3;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w16 = T0.f7910a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iJ = p012c.k.k(size9, C0590q0.h0(i10 << 3), size9, iJ);
                    }
                    i8 += 3;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w17 = T0.f7910a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iJ = p012c.k.k(size10, C0590q0.h0(i10 << 3), size10, iJ);
                    }
                    i8 += 3;
                    break;
                case 43:
                    int iN = T0.n((List) unsafe.getObject(abstractC0605y1, j4));
                    if (iN > 0) {
                        iJ = p012c.k.k(iN, C0590q0.h0(i10 << 3), iN, iJ);
                    }
                    i8 += 3;
                    break;
                case 44:
                    int iG = T0.g((List) unsafe.getObject(abstractC0605y1, j4));
                    if (iG > 0) {
                        iJ = p012c.k.k(iG, C0590q0.h0(i10 << 3), iG, iJ);
                    }
                    i8 += 3;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w18 = T0.f7910a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iJ = p012c.k.k(size11, C0590q0.h0(i10 << 3), size11, iJ);
                    }
                    i8 += 3;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0605y1, j4);
                    C0601w0 c0601w19 = T0.f7910a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iJ = p012c.k.k(size12, C0590q0.h0(i10 << 3), size12, iJ);
                    }
                    i8 += 3;
                    break;
                case 47:
                    int iL = T0.l((List) unsafe.getObject(abstractC0605y1, j4));
                    if (iL > 0) {
                        iJ = p012c.k.k(iL, C0590q0.h0(i10 << 3), iL, iJ);
                    }
                    i8 += 3;
                    break;
                case WampClient.RequestType.CALL /* 48 */:
                    int iM = T0.m((List) unsafe.getObject(abstractC0605y1, j4));
                    if (iM > 0) {
                        iJ = p012c.k.k(iM, C0590q0.h0(i10 << 3), iM, iJ);
                    }
                    i8 += 3;
                    break;
                case WampClient.RequestType.CANCEL /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC0605y1, j4);
                    S0 s0B4 = B(i8);
                    C0601w0 c0601w20 = T0.f7910a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iC2 = 0;
                    } else {
                        iC2 = 0;
                        for (int i23 = 0; i23 < size13; i23++) {
                            AbstractC0573i0 abstractC0573i1 = (AbstractC0573i0) list19.get(i23);
                            int iH10 = C0590q0.h0(i10 << 3);
                            iC2 += abstractC0573i1.c(s0B4) + iH10 + iH10;
                        }
                    }
                    iJ += iC2;
                    i8 += 3;
                    break;
                case WampClient.RequestType.RESULT /* 50 */:
                    int i24 = i8 / 3;
                    I0 i25 = (I0) unsafe.getObject(abstractC0605y1, j4);
                    if (this.f7879b[i24 + i24] != null) {
                        throw new ClassCastException();
                    }
                    if (i25.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = i25.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i8 += 3;
                    break;
                case 51:
                    if (s(i10, i8, abstractC0605y1)) {
                        iJ = p012c.k.j(i10 << 3, 8, iJ);
                    }
                    i8 += 3;
                    break;
                case 52:
                    if (s(i10, i8, abstractC0605y1)) {
                        iJ = p012c.k.j(i10 << 3, 4, iJ);
                    }
                    i8 += 3;
                    break;
                case 53:
                    if (s(i10, i8, abstractC0605y1)) {
                        long jZ = z(j4, abstractC0605y1);
                        iH5 = C0590q0.h0(i10 << 3);
                        iR2 = C0590q0.R(jZ);
                        iJ += iR2 + iH5;
                    }
                    i8 += 3;
                    break;
                case 54:
                    if (s(i10, i8, abstractC0605y1)) {
                        long jZ2 = z(j4, abstractC0605y1);
                        iH5 = C0590q0.h0(i10 << 3);
                        iR2 = C0590q0.R(jZ2);
                        iJ += iR2 + iH5;
                    }
                    i8 += 3;
                    break;
                case 55:
                    if (s(i10, i8, abstractC0605y1)) {
                        long jV = v(j4, abstractC0605y1);
                        iH5 = C0590q0.h0(i10 << 3);
                        iR2 = C0590q0.R(jV);
                        iJ += iR2 + iH5;
                    }
                    i8 += 3;
                    break;
                case 56:
                    if (s(i10, i8, abstractC0605y1)) {
                        iJ = p012c.k.j(i10 << 3, 8, iJ);
                    }
                    i8 += 3;
                    break;
                case 57:
                    if (s(i10, i8, abstractC0605y1)) {
                        iJ = p012c.k.j(i10 << 3, 4, iJ);
                    }
                    i8 += 3;
                    break;
                case 58:
                    if (s(i10, i8, abstractC0605y1)) {
                        iJ = p012c.k.j(i10 << 3, 1, iJ);
                    }
                    i8 += 3;
                    break;
                case 59:
                    if (s(i10, i8, abstractC0605y1)) {
                        int i26 = i10 << 3;
                        Object object3 = unsafe.getObject(abstractC0605y1, j4);
                        if (object3 instanceof AbstractC0586o0) {
                            int iH11 = C0590q0.h0(i26);
                            int i27 = ((AbstractC0586o0) object3).i();
                            iJ = p012c.k.k(i27, i27, iH11, iJ);
                        } else {
                            iH5 = C0590q0.h0(i26);
                            iR2 = C0590q0.g0((String) object3);
                            iJ += iR2 + iH5;
                        }
                    }
                    i8 += 3;
                    break;
                case 60:
                    if (s(i10, i8, abstractC0605y1)) {
                        Object object4 = unsafe.getObject(abstractC0605y1, j4);
                        S0 s0B5 = B(i8);
                        C0601w0 c0601w21 = T0.f7910a;
                        int iH12 = C0590q0.h0(i10 << 3);
                        int iC5 = ((AbstractC0573i0) object4).c(s0B5);
                        iJ = p012c.k.k(iC5, iC5, iH12, iJ);
                    }
                    i8 += 3;
                    break;
                case 61:
                    if (s(i10, i8, abstractC0605y1)) {
                        AbstractC0586o0 abstractC0586o1 = (AbstractC0586o0) unsafe.getObject(abstractC0605y1, j4);
                        int iH13 = C0590q0.h0(i10 << 3);
                        int i28 = abstractC0586o1.i();
                        iJ = p012c.k.k(i28, i28, iH13, iJ);
                    }
                    i8 += 3;
                    break;
                case 62:
                    if (s(i10, i8, abstractC0605y1)) {
                        iJ = p012c.k.j(v(j4, abstractC0605y1), C0590q0.h0(i10 << 3), iJ);
                    }
                    i8 += 3;
                    break;
                case 63:
                    if (s(i10, i8, abstractC0605y1)) {
                        long jV2 = v(j4, abstractC0605y1);
                        iH5 = C0590q0.h0(i10 << 3);
                        iR2 = C0590q0.R(jV2);
                        iJ += iR2 + iH5;
                    }
                    i8 += 3;
                    break;
                case 64:
                    if (s(i10, i8, abstractC0605y1)) {
                        iJ = p012c.k.j(i10 << 3, 4, iJ);
                    }
                    i8 += 3;
                    break;
                case 65:
                    if (s(i10, i8, abstractC0605y1)) {
                        iJ = p012c.k.j(i10 << 3, 8, iJ);
                    }
                    i8 += 3;
                    break;
                case 66:
                    if (s(i10, i8, abstractC0605y1)) {
                        int iV = v(j4, abstractC0605y1);
                        iJ = p012c.k.j((iV >> 31) ^ (iV + iV), C0590q0.h0(i10 << 3), iJ);
                    }
                    i8 += 3;
                    break;
                case 67:
                    if (s(i10, i8, abstractC0605y1)) {
                        long jZ3 = z(j4, abstractC0605y1);
                        iH5 = C0590q0.h0(i10 << 3);
                        iR2 = C0590q0.R((jZ3 >> 63) ^ (jZ3 + jZ3));
                        iJ += iR2 + iH5;
                    }
                    i8 += 3;
                    break;
                case 68:
                    if (s(i10, i8, abstractC0605y1)) {
                        AbstractC0573i0 abstractC0573i2 = (AbstractC0573i0) unsafe.getObject(abstractC0605y1, j4);
                        S0 s0B6 = B(i8);
                        C0601w0 c0601w22 = T0.f7910a;
                        int iH14 = C0590q0.h0(i10 << 3);
                        i6 = iH14 + iH14;
                        iC = abstractC0573i2.c(s0B6);
                        i3 = iC + i6;
                        iJ += i3;
                    }
                    i8 += 3;
                    break;
                default:
                    i8 += 3;
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.S0
    public final void f(Object obj, H0 h1) throws zzel {
        int i;
        boolean z5;
        Unsafe unsafe = f7877k;
        int i3 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f7878a;
            if (i7 >= iArr.length) {
                ((AbstractC0605y0) obj).zzc.d(h1);
                return;
            }
            int iY = y(i7);
            int iX = x(iY);
            int i9 = iArr[i7];
            if (iX <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i3;
                if (i11 != i6) {
                    i8 = i11 == i3 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j4 = iY & i3;
            switch (iX) {
                case 0:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).W(i9, Double.doubleToRawLongBits(AbstractC0550a1.f7932c.a(j4, obj)));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).U(i9, Float.floatToRawIntBits(AbstractC0550a1.f7932c.b(j4, obj)));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).e0(i9, unsafe.getLong(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).e0(i9, unsafe.getLong(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).Y(i9, unsafe.getInt(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).W(i9, unsafe.getLong(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).U(i9, unsafe.getInt(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (q(obj, i7, i6, i8, i)) {
                        byte bG = AbstractC0550a1.f7932c.g(j4, obj);
                        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
                        c0590q0.d0(i9 << 3);
                        int i12 = c0590q0.f7988g;
                        try {
                            int i13 = i12 + 1;
                            try {
                                c0590q0.f7986e[i12] = bG;
                                c0590q0.f7988g = i13;
                            } catch (IndexOutOfBoundsException e6) {
                                e = e6;
                                i12 = i13;
                                throw new zzel(i12, c0590q0.f7987f, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e7) {
                            e = e7;
                        }
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (q(obj, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof String) {
                            ((C0590q0) h1.f7855a).a0(i9, (String) object);
                        } else {
                            ((C0590q0) h1.f7855a).T(i9, (AbstractC0586o0) object);
                        }
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (q(obj, i7, i6, i8, i)) {
                        h1.c(i9, unsafe.getObject(obj, j4), B(i7));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).T(i9, (AbstractC0586o0) unsafe.getObject(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).c0(i9, unsafe.getInt(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).Y(i9, unsafe.getInt(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).U(i9, unsafe.getInt(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (q(obj, i7, i6, i8, i)) {
                        ((C0590q0) h1.f7855a).W(i9, unsafe.getLong(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (q(obj, i7, i6, i8, i)) {
                        int i14 = unsafe.getInt(obj, j4);
                        ((C0590q0) h1.f7855a).c0(i9, (i14 >> 31) ^ (i14 + i14));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (q(obj, i7, i6, i8, i)) {
                        long j6 = unsafe.getLong(obj, j4);
                        ((C0590q0) h1.f7855a).e0(i9, (j6 >> 63) ^ (j6 + j6));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    if (q(obj, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        S0 s0B = B(i7);
                        h1.getClass();
                        C0590q0 c0590q1 = (C0590q0) h1.f7855a;
                        c0590q1.b0(i9, 3);
                        s0B.f((AbstractC0573i0) object2, h1);
                        c0590q1.b0(i9, 4);
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                    T0.s(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                    T0.w(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    T0.y(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    T0.e(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    T0.x(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    T0.v(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    T0.u(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    T0.r(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    int i15 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j4);
                    C0601w0 c0601w0 = T0.f7910a;
                    if (list != null && !list.isEmpty()) {
                        h1.getClass();
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            ((C0590q0) h1.f7855a).a0(i15, (String) list.get(i16));
                        }
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    int i17 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j4);
                    S0 s0B2 = B(i7);
                    C0601w0 c0601w1 = T0.f7910a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i18 = 0; i18 < list2.size(); i18++) {
                            h1.c(i17, list2.get(i18), s0B2);
                        }
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    int i19 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j4);
                    C0601w0 c0601w2 = T0.f7910a;
                    if (list3 != null && !list3.isEmpty()) {
                        h1.getClass();
                        for (int i20 = 0; i20 < list3.size(); i20++) {
                            ((C0590q0) h1.f7855a).T(i19, (AbstractC0586o0) list3.get(i20));
                        }
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    z5 = false;
                    T0.d(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    z5 = false;
                    T0.t(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    z5 = false;
                    T0.z(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    z5 = false;
                    T0.a(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case WampClient.RequestType.SUBSCRIBED /* 33 */:
                    z5 = false;
                    T0.b(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                    z5 = false;
                    T0.c(iArr[i7], (List) unsafe.getObject(obj, j4), h1, false);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                    T0.s(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case WampClient.RequestType.EVENT /* 36 */:
                    T0.w(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 37:
                    T0.y(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 38:
                    T0.e(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 39:
                    T0.x(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 40:
                    T0.v(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 41:
                    T0.u(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 42:
                    T0.r(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 43:
                    T0.d(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 44:
                    T0.t(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 45:
                    T0.z(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 46:
                    T0.a(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 47:
                    T0.b(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case WampClient.RequestType.CALL /* 48 */:
                    T0.c(iArr[i7], (List) unsafe.getObject(obj, j4), h1, true);
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case WampClient.RequestType.CANCEL /* 49 */:
                    int i21 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j4);
                    S0 s0B3 = B(i7);
                    C0601w0 c0601w3 = T0.f7910a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i22 = 0; i22 < list4.size(); i22++) {
                            Object obj2 = list4.get(i22);
                            h1.getClass();
                            C0590q0 c0590q2 = (C0590q0) h1.f7855a;
                            c0590q2.b0(i21, 3);
                            s0B3.f((AbstractC0573i0) obj2, h1);
                            c0590q2.b0(i21, 4);
                        }
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case WampClient.RequestType.RESULT /* 50 */:
                    if (unsafe.getObject(obj, j4) != null) {
                        int i23 = i7 / 3;
                        throw p012c.k.p(this.f7879b[i23 + i23]);
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 51:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).W(i9, Double.doubleToRawLongBits(((Double) AbstractC0550a1.g(j4, obj)).doubleValue()));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 52:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).U(i9, Float.floatToRawIntBits(((Float) AbstractC0550a1.g(j4, obj)).floatValue()));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 53:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).e0(i9, z(j4, obj));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 54:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).e0(i9, z(j4, obj));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 55:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).Y(i9, v(j4, obj));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 56:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).W(i9, z(j4, obj));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 57:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).U(i9, v(j4, obj));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 58:
                    if (s(i9, i7, obj)) {
                        byte bBooleanValue = ((Boolean) AbstractC0550a1.g(j4, obj)).booleanValue();
                        C0590q0 c0590q3 = (C0590q0) h1.f7855a;
                        c0590q3.d0(i9 << 3);
                        int i24 = c0590q3.f7988g;
                        try {
                            int i25 = i24 + 1;
                            try {
                                c0590q3.f7986e[i24] = bBooleanValue;
                                c0590q3.f7988g = i25;
                            } catch (IndexOutOfBoundsException e8) {
                                e = e8;
                                i24 = i25;
                                throw new zzel(i24, c0590q3.f7987f, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e9) {
                            e = e9;
                        }
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 59:
                    if (s(i9, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j4);
                        if (object3 instanceof String) {
                            ((C0590q0) h1.f7855a).a0(i9, (String) object3);
                        } else {
                            ((C0590q0) h1.f7855a).T(i9, (AbstractC0586o0) object3);
                        }
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 60:
                    if (s(i9, i7, obj)) {
                        h1.c(i9, unsafe.getObject(obj, j4), B(i7));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 61:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).T(i9, (AbstractC0586o0) unsafe.getObject(obj, j4));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 62:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).c0(i9, v(j4, obj));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 63:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).Y(i9, v(j4, obj));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 64:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).U(i9, v(j4, obj));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 65:
                    if (s(i9, i7, obj)) {
                        ((C0590q0) h1.f7855a).W(i9, z(j4, obj));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 66:
                    if (s(i9, i7, obj)) {
                        int iV = v(j4, obj);
                        ((C0590q0) h1.f7855a).c0(i9, (iV >> 31) ^ (iV + iV));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 67:
                    if (s(i9, i7, obj)) {
                        long jZ = z(j4, obj);
                        ((C0590q0) h1.f7855a).e0(i9, (jZ >> 63) ^ (jZ + jZ));
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                case 68:
                    if (s(i9, i7, obj)) {
                        Object object4 = unsafe.getObject(obj, j4);
                        S0 s0B4 = B(i7);
                        h1.getClass();
                        C0590q0 c0590q4 = (C0590q0) h1.f7855a;
                        c0590q4.b0(i9, 3);
                        s0B4.f((AbstractC0573i0) object4, h1);
                        c0590q4.b0(i9, 4);
                    }
                    i7 += 3;
                    i3 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i3 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.S0
    public final int g(AbstractC0605y0 abstractC0605y0) {
        int i;
        long jDoubleToLongBits;
        int i3;
        int iFloatToIntBits;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f7878a;
            if (i8 >= iArr.length) {
                return abstractC0605y0.zzc.hashCode() + (i9 * 53);
            }
            int iY = y(i8);
            int i10 = 1048575 & iY;
            int iX = x(iY);
            int i11 = iArr[i8];
            long j4 = i10;
            int i12 = 1237;
            int iHashCode = 37;
            switch (iX) {
                case 0:
                    i = i9 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(AbstractC0550a1.f7932c.a(j4, abstractC0605y0));
                    Charset charset = D0.f7817a;
                    i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i3 = i9 * 53;
                    iFloatToIntBits = Float.floatToIntBits(AbstractC0550a1.f7932c.b(j4, abstractC0605y0));
                    i9 = iFloatToIntBits + i3;
                    break;
                case 2:
                    i = i9 * 53;
                    jDoubleToLongBits = AbstractC0550a1.e(j4, abstractC0605y0);
                    Charset charset2 = D0.f7817a;
                    i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i9 * 53;
                    jDoubleToLongBits = AbstractC0550a1.e(j4, abstractC0605y0);
                    Charset charset3 = D0.f7817a;
                    i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i3 = i9 * 53;
                    iFloatToIntBits = AbstractC0550a1.d(j4, abstractC0605y0);
                    i9 = iFloatToIntBits + i3;
                    break;
                case 5:
                    i = i9 * 53;
                    jDoubleToLongBits = AbstractC0550a1.e(j4, abstractC0605y0);
                    Charset charset4 = D0.f7817a;
                    i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i3 = i9 * 53;
                    iFloatToIntBits = AbstractC0550a1.d(j4, abstractC0605y0);
                    i9 = iFloatToIntBits + i3;
                    break;
                case 7:
                    i6 = i9 * 53;
                    boolean zG = AbstractC0550a1.f7932c.g(j4, abstractC0605y0);
                    Charset charset5 = D0.f7817a;
                    if (zG) {
                        i12 = 1231;
                    }
                    i9 = i12 + i6;
                    break;
                case 8:
                    i3 = i9 * 53;
                    iFloatToIntBits = ((String) AbstractC0550a1.g(j4, abstractC0605y0)).hashCode();
                    i9 = iFloatToIntBits + i3;
                    break;
                case 9:
                    i7 = i9 * 53;
                    Object objG = AbstractC0550a1.g(j4, abstractC0605y0);
                    if (objG != null) {
                        iHashCode = objG.hashCode();
                    }
                    i9 = i7 + iHashCode;
                    break;
                case 10:
                    i3 = i9 * 53;
                    iFloatToIntBits = AbstractC0550a1.g(j4, abstractC0605y0).hashCode();
                    i9 = iFloatToIntBits + i3;
                    break;
                case 11:
                    i3 = i9 * 53;
                    iFloatToIntBits = AbstractC0550a1.d(j4, abstractC0605y0);
                    i9 = iFloatToIntBits + i3;
                    break;
                case 12:
                    i3 = i9 * 53;
                    iFloatToIntBits = AbstractC0550a1.d(j4, abstractC0605y0);
                    i9 = iFloatToIntBits + i3;
                    break;
                case 13:
                    i3 = i9 * 53;
                    iFloatToIntBits = AbstractC0550a1.d(j4, abstractC0605y0);
                    i9 = iFloatToIntBits + i3;
                    break;
                case 14:
                    i = i9 * 53;
                    jDoubleToLongBits = AbstractC0550a1.e(j4, abstractC0605y0);
                    Charset charset6 = D0.f7817a;
                    i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i3 = i9 * 53;
                    iFloatToIntBits = AbstractC0550a1.d(j4, abstractC0605y0);
                    i9 = iFloatToIntBits + i3;
                    break;
                case 16:
                    i = i9 * 53;
                    jDoubleToLongBits = AbstractC0550a1.e(j4, abstractC0605y0);
                    Charset charset7 = D0.f7817a;
                    i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    i7 = i9 * 53;
                    Object objG2 = AbstractC0550a1.g(j4, abstractC0605y0);
                    if (objG2 != null) {
                        iHashCode = objG2.hashCode();
                    }
                    i9 = i7 + iHashCode;
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
                    i3 = i9 * 53;
                    iFloatToIntBits = AbstractC0550a1.g(j4, abstractC0605y0).hashCode();
                    i9 = iFloatToIntBits + i3;
                    break;
                case WampClient.RequestType.RESULT /* 50 */:
                    i3 = i9 * 53;
                    iFloatToIntBits = AbstractC0550a1.g(j4, abstractC0605y0).hashCode();
                    i9 = iFloatToIntBits + i3;
                    break;
                case 51:
                    if (s(i11, i8, abstractC0605y0)) {
                        i = i9 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) AbstractC0550a1.g(j4, abstractC0605y0)).doubleValue());
                        Charset charset8 = D0.f7817a;
                        i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) AbstractC0550a1.g(j4, abstractC0605y0)).floatValue());
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
                case 53:
                    if (s(i11, i8, abstractC0605y0)) {
                        i = i9 * 53;
                        jDoubleToLongBits = z(j4, abstractC0605y0);
                        Charset charset9 = D0.f7817a;
                        i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (s(i11, i8, abstractC0605y0)) {
                        i = i9 * 53;
                        jDoubleToLongBits = z(j4, abstractC0605y0);
                        Charset charset10 = D0.f7817a;
                        i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = v(j4, abstractC0605y0);
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
                case 56:
                    if (s(i11, i8, abstractC0605y0)) {
                        i = i9 * 53;
                        jDoubleToLongBits = z(j4, abstractC0605y0);
                        Charset charset11 = D0.f7817a;
                        i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = v(j4, abstractC0605y0);
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
                case 58:
                    if (s(i11, i8, abstractC0605y0)) {
                        i6 = i9 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC0550a1.g(j4, abstractC0605y0)).booleanValue();
                        Charset charset12 = D0.f7817a;
                        if (zBooleanValue) {
                            i12 = 1231;
                        }
                        i9 = i12 + i6;
                    }
                    break;
                case 59:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = ((String) AbstractC0550a1.g(j4, abstractC0605y0)).hashCode();
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
                case 60:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = AbstractC0550a1.g(j4, abstractC0605y0).hashCode();
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
                case 61:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = AbstractC0550a1.g(j4, abstractC0605y0).hashCode();
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
                case 62:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = v(j4, abstractC0605y0);
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
                case 63:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = v(j4, abstractC0605y0);
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
                case 64:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = v(j4, abstractC0605y0);
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
                case 65:
                    if (s(i11, i8, abstractC0605y0)) {
                        i = i9 * 53;
                        jDoubleToLongBits = z(j4, abstractC0605y0);
                        Charset charset13 = D0.f7817a;
                        i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = v(j4, abstractC0605y0);
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
                case 67:
                    if (s(i11, i8, abstractC0605y0)) {
                        i = i9 * 53;
                        jDoubleToLongBits = z(j4, abstractC0605y0);
                        Charset charset14 = D0.f7817a;
                        i9 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (s(i11, i8, abstractC0605y0)) {
                        i3 = i9 * 53;
                        iFloatToIntBits = AbstractC0550a1.g(j4, abstractC0605y0).hashCode();
                        i9 = iFloatToIntBits + i3;
                    }
                    break;
            }
            i8 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final boolean h(Object obj) {
        int i;
        int i3;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i7 < this.f7884g) {
            int i9 = this.f7883f[i7];
            int[] iArr = this.f7878a;
            int i10 = iArr[i9];
            int iY = y(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i8) {
                if (i12 != 1048575) {
                    i6 = f7877k.getInt(obj, i12);
                }
                i3 = i6;
                i = i12;
            } else {
                int i14 = i6;
                i = i8;
                i3 = i14;
            }
            if ((268435456 & iY) == 0 || q(obj, i9, i, i3, i13)) {
                int iX = x(iY);
                if (iX != 9 && iX != 17) {
                    if (iX != 27) {
                        if (iX == 60 || iX == 68) {
                            if (!s(i10, i9, obj) || B(i9).h(AbstractC0550a1.g(iY & 1048575, obj))) {
                            }
                        } else if (iX != 49) {
                            if (iX == 50 && !((I0) AbstractC0550a1.g(iY & 1048575, obj)).isEmpty()) {
                                int i15 = i9 / 3;
                                throw p012c.k.p(this.f7879b[i15 + i15]);
                            }
                        }
                        i7++;
                        i8 = i;
                        i6 = i3;
                    }
                    List list = (List) AbstractC0550a1.g(iY & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        S0 s0B = B(i9);
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            if (s0B.h(list.get(i16))) {
                            }
                        }
                    }
                    i7++;
                    i8 = i;
                    i6 = i3;
                } else if (!q(obj, i9, i, i3, i13) || B(i9).h(AbstractC0550a1.g(iY & 1048575, obj))) {
                    i7++;
                    i8 = i;
                    i6 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final boolean i(AbstractC0605y0 abstractC0605y0, AbstractC0605y0 abstractC0605y1) {
        boolean zF;
        int i = 0;
        while (true) {
            int[] iArr = this.f7878a;
            if (i < iArr.length) {
                int iY = y(i);
                long j4 = iY & 1048575;
                switch (x(iY)) {
                    case 0:
                        if (o(abstractC0605y0, abstractC0605y1, i)) {
                            Z0 z5 = AbstractC0550a1.f7932c;
                            if (Double.doubleToLongBits(z5.a(j4, abstractC0605y0)) == Double.doubleToLongBits(z5.a(j4, abstractC0605y1))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (o(abstractC0605y0, abstractC0605y1, i)) {
                            Z0 z6 = AbstractC0550a1.f7932c;
                            if (Float.floatToIntBits(z6.b(j4, abstractC0605y0)) == Float.floatToIntBits(z6.b(j4, abstractC0605y1))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.e(j4, abstractC0605y0) == AbstractC0550a1.e(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.e(j4, abstractC0605y0) == AbstractC0550a1.e(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.d(j4, abstractC0605y0) == AbstractC0550a1.d(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.e(j4, abstractC0605y0) == AbstractC0550a1.e(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.d(j4, abstractC0605y0) == AbstractC0550a1.d(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (o(abstractC0605y0, abstractC0605y1, i)) {
                            Z0 z7 = AbstractC0550a1.f7932c;
                            if (z7.g(j4, abstractC0605y0) == z7.g(j4, abstractC0605y1)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (o(abstractC0605y0, abstractC0605y1, i) && T0.f(AbstractC0550a1.g(j4, abstractC0605y0), AbstractC0550a1.g(j4, abstractC0605y1))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (o(abstractC0605y0, abstractC0605y1, i) && T0.f(AbstractC0550a1.g(j4, abstractC0605y0), AbstractC0550a1.g(j4, abstractC0605y1))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (o(abstractC0605y0, abstractC0605y1, i) && T0.f(AbstractC0550a1.g(j4, abstractC0605y0), AbstractC0550a1.g(j4, abstractC0605y1))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.d(j4, abstractC0605y0) == AbstractC0550a1.d(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.d(j4, abstractC0605y0) == AbstractC0550a1.d(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.d(j4, abstractC0605y0) == AbstractC0550a1.d(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.e(j4, abstractC0605y0) == AbstractC0550a1.e(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.d(j4, abstractC0605y0) == AbstractC0550a1.d(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (o(abstractC0605y0, abstractC0605y1, i) && AbstractC0550a1.e(j4, abstractC0605y0) == AbstractC0550a1.e(j4, abstractC0605y1)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                        if (o(abstractC0605y0, abstractC0605y1, i) && T0.f(AbstractC0550a1.g(j4, abstractC0605y0), AbstractC0550a1.g(j4, abstractC0605y1))) {
                            continue;
                            i += 3;
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
                        zF = T0.f(AbstractC0550a1.g(j4, abstractC0605y0), AbstractC0550a1.g(j4, abstractC0605y1));
                        break;
                    case WampClient.RequestType.RESULT /* 50 */:
                        zF = T0.f(AbstractC0550a1.g(j4, abstractC0605y0), AbstractC0550a1.g(j4, abstractC0605y1));
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
                        if (AbstractC0550a1.d(j6, abstractC0605y0) == AbstractC0550a1.d(j6, abstractC0605y1) && T0.f(AbstractC0550a1.g(j4, abstractC0605y0), AbstractC0550a1.g(j4, abstractC0605y1))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zF) {
                    i += 3;
                }
            } else if (abstractC0605y0.zzc.equals(abstractC0605y1.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final void j(Object obj, int i, Object obj2) {
        if (p(i, obj2)) {
            int iY = y(i) & 1048575;
            Unsafe unsafe = f7877k;
            long j4 = iY;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f7878a[i] + " is present but null: " + obj2.toString());
            }
            S0 s0B = B(i);
            if (!p(i, obj)) {
                if (r(object)) {
                    AbstractC0605y0 abstractC0605y0D = s0B.d();
                    s0B.b(abstractC0605y0D, object);
                    unsafe.putObject(obj, j4, abstractC0605y0D);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                l(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!r(object2)) {
                AbstractC0605y0 abstractC0605y0D2 = s0B.d();
                s0B.b(abstractC0605y0D2, object2);
                unsafe.putObject(obj, j4, abstractC0605y0D2);
                object2 = abstractC0605y0D2;
            }
            s0B.b(object2, object);
        }
    }

    public final void k(Object obj, int i, Object obj2) {
        int[] iArr = this.f7878a;
        int i3 = iArr[i];
        if (s(i3, i, obj2)) {
            int iY = y(i) & 1048575;
            Unsafe unsafe = f7877k;
            long j4 = iY;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            S0 s0B = B(i);
            if (!s(i3, i, obj)) {
                if (r(object)) {
                    AbstractC0605y0 abstractC0605y0D = s0B.d();
                    s0B.b(abstractC0605y0D, object);
                    unsafe.putObject(obj, j4, abstractC0605y0D);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                AbstractC0550a1.i(i3, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!r(object2)) {
                AbstractC0605y0 abstractC0605y0D2 = s0B.d();
                s0B.b(abstractC0605y0D2, object2);
                unsafe.putObject(obj, j4, abstractC0605y0D2);
                object2 = abstractC0605y0D2;
            }
            s0B.b(object2, object);
        }
    }

    public final void l(int i, Object obj) {
        int i3 = this.f7878a[i + 2];
        long j4 = 1048575 & i3;
        if (j4 == 1048575) {
            return;
        }
        AbstractC0550a1.i((1 << (i3 >>> 20)) | AbstractC0550a1.d(j4, obj), j4, obj);
    }

    public final void m(Object obj, int i, Object obj2) {
        f7877k.putObject(obj, y(i) & 1048575, obj2);
        l(i, obj);
    }

    public final void n(int i, int i3, Object obj, Object obj2) {
        f7877k.putObject(obj, y(i3) & 1048575, obj2);
        AbstractC0550a1.i(i, this.f7878a[i3 + 2] & 1048575, obj);
    }

    public final boolean o(AbstractC0605y0 abstractC0605y0, AbstractC0605y0 abstractC0605y1, int i) {
        return p(i, abstractC0605y0) == p(i, abstractC0605y1);
    }

    public final boolean p(int i, Object obj) {
        int i3 = this.f7878a[i + 2];
        long j4 = i3 & 1048575;
        if (j4 == 1048575) {
            int iY = y(i);
            long j6 = iY & 1048575;
            switch (x(iY)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC0550a1.f7932c.a(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC0550a1.f7932c.b(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC0550a1.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC0550a1.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC0550a1.d(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC0550a1.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC0550a1.d(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC0550a1.f7932c.g(j6, obj);
                case 8:
                    Object objG = AbstractC0550a1.g(j6, obj);
                    if (objG instanceof String) {
                        if (((String) objG).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objG instanceof AbstractC0586o0)) {
                            throw new IllegalArgumentException();
                        }
                        if (AbstractC0586o0.i.equals(objG)) {
                            return false;
                        }
                    }
                case 9:
                    if (AbstractC0550a1.g(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (AbstractC0586o0.i.equals(AbstractC0550a1.g(j6, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (AbstractC0550a1.d(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC0550a1.d(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC0550a1.d(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC0550a1.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC0550a1.d(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC0550a1.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    if (AbstractC0550a1.g(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i3 >>> 20)) & AbstractC0550a1.d(j4, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i, int i3, int i6, int i7) {
        if (i3 == 1048575) {
            return p(i, obj);
        }
        return (i6 & i7) != 0;
    }

    public final boolean s(int i, int i3, Object obj) {
        return AbstractC0550a1.d((long) (this.f7878a[i3 + 2] & 1048575), obj) == i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41501. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int t(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.play_billing.C0580l0 r43) {
        /*
            Method dump skipped, instruction units count: 4150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.M0.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.l0):int");
    }

    public final int w(int i, int i3) {
        int[] iArr = this.f7878a;
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

    public final int y(int i) {
        return this.f7878a[i + 1];
    }
}
