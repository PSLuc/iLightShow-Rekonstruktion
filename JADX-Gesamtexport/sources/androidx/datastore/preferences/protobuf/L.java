package androidx.datastore.preferences.protobuf;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.protocol.WampClient;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p096s.AbstractC0916i;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class L implements V {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f6799n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f6800o = i0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f6802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0436v f6805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f6807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6808h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final N f6809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A f6810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0 f6811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final H f6812m;

    public L(int[] iArr, Object[] objArr, int i, int i3, AbstractC0436v abstractC0436v, int[] iArr2, int i6, int i7, N n6, A a6, b0 b0Var, C0430o c0430o, H h6) {
        this.f6801a = iArr;
        this.f6802b = objArr;
        this.f6803c = i;
        this.f6804d = i3;
        this.f6806f = Objects.nonNull(abstractC0436v);
        this.f6807g = iArr2;
        this.f6808h = i6;
        this.i = i7;
        this.f6809j = n6;
        this.f6810k = a6;
        this.f6811l = b0Var;
        this.f6805e = abstractC0436v;
        this.f6812m = h6;
    }

    public static long A(long j4, Object obj) {
        return ((Long) i0.f6876c.h(j4, obj)).longValue();
    }

    public static Field G(String str, Class cls) {
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

    public static int L(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0436v) {
            return ((AbstractC0436v) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0267  */
    /* JADX WARN: Code duplicated, block: B:124:0x026e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0284  */
    /* JADX WARN: Code duplicated, block: B:128:0x0287  */
    /* JADX WARN: Code duplicated, block: B:181:0x0384  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a0  */
    public static L x(U u6, N n6, A a6, b0 b0Var, C0430o c0430o, H h6) {
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
        Field fieldG;
        char cCharAt9;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field fieldG2;
        int i30;
        Object obj2;
        Field fieldG3;
        int i31;
        char cCharAt10;
        int i32;
        int i33;
        char cCharAt11;
        int i34;
        char cCharAt12;
        int i35;
        char cCharAt13;
        String str = u6.f6824b;
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
            iArr = f6799n;
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
        Unsafe unsafe = f6800o;
        Class<?> cls = u6.f6823a.getClass();
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
            Object[] objArr2 = u6.f6825c;
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
                    if (i86 == 12 && (AbstractC0916i.b(u6.a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i28 = i9 + 1;
                        objArr[((i70 / 3) * 2) + 1] = objArr2[i9];
                    }
                    i29 = i85 * 2;
                    obj = objArr2[i29];
                    if (obj instanceof Field) {
                        fieldG2 = (Field) obj;
                    } else {
                        fieldG2 = G((String) obj, cls);
                        objArr2[i29] = fieldG2;
                    }
                    i22 = i7;
                    iArr2 = iArr4;
                    iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldG2);
                    i30 = i29 + 1;
                    obj2 = objArr2[i30];
                    if (obj2 instanceof Field) {
                        fieldG3 = (Field) obj2;
                    } else {
                        fieldG3 = G((String) obj2, cls);
                        objArr2[i30] = fieldG3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldG3);
                    i24 = i87;
                    str = str;
                    i26 = 0;
                }
                i9 = i28;
                i29 = i85 * 2;
                obj = objArr2[i29];
                if (obj instanceof Field) {
                    fieldG2 = (Field) obj;
                } else {
                    fieldG2 = G((String) obj, cls);
                    objArr2[i29] = fieldG2;
                }
                i22 = i7;
                iArr2 = iArr4;
                iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldG2);
                i30 = i29 + 1;
                obj2 = objArr2[i30];
                if (obj2 instanceof Field) {
                    fieldG3 = (Field) obj2;
                } else {
                    fieldG3 = G((String) obj2, cls);
                    objArr2[i30] = fieldG3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldG3);
                i24 = i87;
                str = str;
                i26 = 0;
            } else {
                i22 = i7;
                iArr2 = iArr4;
                int i88 = i9 + 1;
                Field fieldG4 = G((String) objArr2[i9], cls);
                if (i79 == 9 || i79 == 17) {
                    i23 = i88;
                    objArr[((i70 / 3) * 2) + 1] = fieldG4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i9 += 2;
                        objArr[((i70 / 3) * 2) + 1] = objArr2[i88];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i23 = i88;
                        if (u6.a() == 1 || (iCharAt11 & 2048) != 0) {
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG4);
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
                            fieldG = (Field) obj3;
                        } else {
                            fieldG = G((String) obj3, cls);
                            objArr2[i94] = fieldG;
                        }
                        int i95 = iCharAt13;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG4);
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
        return new L(iArr4, objArr, i3, i8, u6.f6823a, iArr, i10, i66, n6, a6, b0Var, c0430o, h6);
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static int z(long j4, Object obj) {
        return ((Integer) i0.f6876c.h(j4, obj)).intValue();
    }

    public final int B(int i) {
        if (i >= this.f6803c && i <= this.f6804d) {
            int[] iArr = this.f6801a;
            int length = (iArr.length / 3) - 1;
            int i3 = 0;
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
        }
        return -1;
    }

    public final void C(Object obj, long j4, C0426k c0426k, V v6, C0429n c0429n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iU;
        this.f6810k.getClass();
        InterfaceC0437w interfaceC0437wA = A.a(j4, obj);
        int i = c0426k.f6885b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            AbstractC0436v abstractC0436vD = v6.d();
            c0426k.b(abstractC0436vD, v6, c0429n);
            v6.b(abstractC0436vD);
            ((T) interfaceC0437wA).add(abstractC0436vD);
            AbstractC0425j abstractC0425j = c0426k.f6884a;
            if (abstractC0425j.c() || c0426k.f6887d != 0) {
                return;
            } else {
                iU = abstractC0425j.u();
            }
        } while (iU == i);
        c0426k.f6887d = iU;
    }

    public final void D(Object obj, int i, C0426k c0426k, V v6, C0429n c0429n) throws InvalidProtocolBufferException {
        int iU;
        this.f6810k.getClass();
        InterfaceC0437w interfaceC0437wA = A.a(i & 1048575, obj);
        int i3 = c0426k.f6885b;
        if ((i3 & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            AbstractC0436v abstractC0436vD = v6.d();
            c0426k.c(abstractC0436vD, v6, c0429n);
            v6.b(abstractC0436vD);
            ((T) interfaceC0437wA).add(abstractC0436vD);
            AbstractC0425j abstractC0425j = c0426k.f6884a;
            if (abstractC0425j.c() || c0426k.f6887d != 0) {
                return;
            } else {
                iU = abstractC0425j.u();
            }
        } while (iU == i3);
        c0426k.f6887d = iU;
    }

    public final void E(int i, C0426k c0426k, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i) != 0) {
            c0426k.w(2);
            i0.o(i & 1048575, obj, c0426k.f6884a.t());
        } else if (!this.f6806f) {
            i0.o(i & 1048575, obj, c0426k.e());
        } else {
            c0426k.w(2);
            i0.o(i & 1048575, obj, c0426k.f6884a.s());
        }
    }

    public final void F(int i, C0426k c0426k, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        boolean z5 = (536870912 & i) != 0;
        A a6 = this.f6810k;
        if (z5) {
            a6.getClass();
            c0426k.s(A.a(i & 1048575, obj), true);
        } else {
            a6.getClass();
            c0426k.s(A.a(i & 1048575, obj), false);
        }
    }

    public final void H(int i, Object obj) {
        int i3 = this.f6801a[i + 2];
        long j4 = 1048575 & i3;
        if (j4 == 1048575) {
            return;
        }
        i0.m((1 << (i3 >>> 20)) | i0.f6876c.f(j4, obj), j4, obj);
    }

    public final void I(int i, int i3, Object obj) {
        i0.m(i, this.f6801a[i3 + 2] & 1048575, obj);
    }

    public final void J(Object obj, int i, AbstractC0416a abstractC0416a) {
        f6800o.putObject(obj, M(i) & 1048575, abstractC0416a);
        H(i, obj);
    }

    public final void K(Object obj, int i, int i3, AbstractC0416a abstractC0416a) {
        f6800o.putObject(obj, M(i3) & 1048575, abstractC0416a);
        I(i, i3, obj);
    }

    public final int M(int i) {
        return this.f6801a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:118:0x0366  */
    /* JADX WARN: Code duplicated, block: B:123:0x0375  */
    /* JADX WARN: Code duplicated, block: B:125:0x038a  */
    /* JADX WARN: Code duplicated, block: B:126:0x039a  */
    /* JADX WARN: Code duplicated, block: B:128:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:130:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:131:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:132:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:134:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:136:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:138:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:139:0x040c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0413  */
    /* JADX WARN: Code duplicated, block: B:142:0x041e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0426  */
    /* JADX WARN: Code duplicated, block: B:144:0x0431  */
    /* JADX WARN: Code duplicated, block: B:145:0x043b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0445  */
    /* JADX WARN: Code duplicated, block: B:147:0x0454  */
    /* JADX WARN: Code duplicated, block: B:148:0x0462  */
    /* JADX WARN: Code duplicated, block: B:149:0x0470  */
    /* JADX WARN: Code duplicated, block: B:150:0x047a  */
    /* JADX WARN: Code duplicated, block: B:283:0x036f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void N(Object obj, D d6) throws IOException {
        int i;
        int i3;
        int[] iArr;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        int iW;
        int size;
        int iV;
        int iA;
        int iV2;
        int i8;
        int iU;
        o0 o0Var;
        int iW2;
        int size2;
        int iV3;
        L l6 = this;
        int i9 = 2;
        int[] iArr2 = l6.f6801a;
        int length = iArr2.length;
        Unsafe unsafe = f6800o;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int iM = l6.M(i12);
            int i14 = iArr2[i12];
            int iL = L(iM);
            if (iL <= 17) {
                int i15 = iArr2[i12 + 2];
                i = 1;
                int i16 = i15 & i10;
                if (i16 != i11) {
                    i13 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i3 = 1 << (i15 >>> 20);
            } else {
                i = 1;
                i3 = 0;
            }
            int i17 = i9;
            long j4 = iM & i10;
            switch (iL) {
                case 0:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        double d7 = i0.f6876c.d(j4, obj);
                        C0427l c0427l = (C0427l) d6.f6789a;
                        c0427l.getClass();
                        c0427l.g0(i14, Double.doubleToRawLongBits(d7));
                    }
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 1:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        float fE = i0.f6876c.e(j4, obj);
                        C0427l c0427l2 = (C0427l) d6.f6789a;
                        c0427l2.getClass();
                        c0427l2.e0(i14, Float.floatToRawIntBits(fE));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 2:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).q0(i14, unsafe.getLong(obj, j4));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 3:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).q0(i14, unsafe.getLong(obj, j4));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 4:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).i0(i14, unsafe.getInt(obj, j4));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 5:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).g0(i14, unsafe.getLong(obj, j4));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 6:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).e0(i14, unsafe.getInt(obj, j4));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 7:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).b0(i14, i0.f6876c.c(j4, obj));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 8:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof String) {
                            ((C0427l) d6.f6789a).l0(i14, (String) object);
                        } else {
                            ((C0427l) d6.f6789a).c0(i14, (C0422g) object);
                        }
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 9:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).k0(i14, (AbstractC0416a) unsafe.getObject(obj, j4), l6.m(i12));
                    }
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 10:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).c0(i14, (C0422g) unsafe.getObject(obj, j4));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 11:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).o0(i14, unsafe.getInt(obj, j4));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 12:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).i0(i14, unsafe.getInt(obj, j4));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 13:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).e0(i14, unsafe.getInt(obj, j4));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 14:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        ((C0427l) d6.f6789a).g0(i14, unsafe.getLong(obj, j4));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 15:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        int i18 = unsafe.getInt(obj, j4);
                        ((C0427l) d6.f6789a).o0(i14, (i18 >> 31) ^ (i18 << 1));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 16:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        long j6 = unsafe.getLong(obj, j4);
                        ((C0427l) d6.f6789a).q0(i14, (j6 >> 63) ^ (j6 << 1));
                    }
                    l6 = this;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    if (l6.o(obj, i12, i11, i13, i3)) {
                        d6.a(i14, unsafe.getObject(obj, j4), l6.m(i12));
                    }
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                    i11 = i11;
                    i13 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    W.n(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                    i11 = i11;
                    i13 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    W.r(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 20:
                    i11 = i11;
                    i13 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    W.t(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 21:
                    i11 = i11;
                    i13 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    W.z(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 22:
                    i11 = i11;
                    i13 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    W.s(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 23:
                    i11 = i11;
                    i13 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    W.q(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 24:
                    i11 = i11;
                    i13 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    W.p(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 25:
                    i11 = i11;
                    i13 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    W.m(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 26:
                    i6 = i11;
                    i7 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    int i19 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j4);
                    Class cls = W.f6827a;
                    if (list != null && !list.isEmpty()) {
                        d6.getClass();
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            ((C0427l) d6.f6789a).l0(i19, (String) list.get(i20));
                        }
                    }
                    i11 = i6;
                    i13 = i7;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 27:
                    i6 = i11;
                    i7 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    int i21 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j4);
                    V vM = l6.m(i12);
                    Class cls2 = W.f6827a;
                    if (list2 != null && !list2.isEmpty()) {
                        d6.getClass();
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((C0427l) d6.f6789a).k0(i21, (AbstractC0416a) list2.get(i22), vM);
                        }
                    }
                    i11 = i6;
                    i13 = i7;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 28:
                    i6 = i11;
                    i7 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    int i23 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j4);
                    Class cls3 = W.f6827a;
                    if (list3 != null && !list3.isEmpty()) {
                        d6.getClass();
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            ((C0427l) d6.f6789a).c0(i23, (C0422g) list3.get(i24));
                        }
                    }
                    i11 = i6;
                    i13 = i7;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 29:
                    iArr = iArr2;
                    z5 = false;
                    W.y(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 30:
                    iArr = iArr2;
                    z5 = false;
                    W.o(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 31:
                    iArr = iArr2;
                    z5 = false;
                    W.u(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 32:
                    iArr = iArr2;
                    z5 = false;
                    W.v(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case WampClient.RequestType.SUBSCRIBED /* 33 */:
                    iArr = iArr2;
                    z5 = false;
                    W.w(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                    iArr = iArr2;
                    z5 = false;
                    W.x(iArr[i12], (List) unsafe.getObject(obj, j4), d6, false);
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                    iArr = iArr2;
                    boolean z7 = i;
                    W.n(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z7);
                    z6 = z7;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case WampClient.RequestType.EVENT /* 36 */:
                    iArr = iArr2;
                    boolean z8 = i;
                    W.r(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z8);
                    z6 = z8;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 37:
                    iArr = iArr2;
                    boolean z9 = i;
                    W.t(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z9);
                    z6 = z9;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 38:
                    iArr = iArr2;
                    boolean z10 = i;
                    W.z(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z10);
                    z6 = z10;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 39:
                    iArr = iArr2;
                    boolean z11 = i;
                    W.s(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z11);
                    z6 = z11;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 40:
                    iArr = iArr2;
                    boolean z12 = i;
                    W.q(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z12);
                    z6 = z12;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 41:
                    iArr = iArr2;
                    boolean z13 = i;
                    W.p(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z13);
                    z6 = z13;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 42:
                    iArr = iArr2;
                    boolean z14 = i;
                    W.m(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z14);
                    z6 = z14;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 43:
                    iArr = iArr2;
                    boolean z15 = i;
                    W.y(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z15);
                    z6 = z15;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 44:
                    iArr = iArr2;
                    boolean z16 = i;
                    W.o(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z16);
                    z6 = z16;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 45:
                    iArr = iArr2;
                    boolean z17 = i;
                    W.u(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z17);
                    z6 = z17;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 46:
                    iArr = iArr2;
                    boolean z18 = i;
                    W.v(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z18);
                    z6 = z18;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 47:
                    iArr = iArr2;
                    boolean z19 = i;
                    W.w(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z19);
                    z6 = z19;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case WampClient.RequestType.CALL /* 48 */:
                    iArr = iArr2;
                    boolean z20 = i;
                    W.x(iArr[i12], (List) unsafe.getObject(obj, j4), d6, z20);
                    z6 = z20;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case WampClient.RequestType.CANCEL /* 49 */:
                    iArr = iArr2;
                    int i25 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j4);
                    V vM2 = l6.m(i12);
                    Class cls4 = W.f6827a;
                    if (list4 != null && !list4.isEmpty()) {
                        d6.getClass();
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            d6.a(i25, list4.get(i26), vM2);
                        }
                    }
                    z6 = true;
                    i11 = i11;
                    i13 = i13;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case WampClient.RequestType.RESULT /* 50 */:
                    Object object2 = unsafe.getObject(obj, j4);
                    if (object2 != null) {
                        Object obj2 = l6.f6802b[(i12 / 3) * i17];
                        l6.f6812m.getClass();
                        E e6 = ((F) obj2).f6793a;
                        C0427l c0427l3 = (C0427l) d6.f6789a;
                        c0427l3.getClass();
                        Iterator it = ((G) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            c0427l3.n0(i14, i17);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int i27 = C0432q.f6901c;
                            int iU2 = C0427l.U(i);
                            int i28 = i11;
                            n0 n0Var = q0.f6905k;
                            int i29 = i13;
                            m0 m0Var = e6.f6790a;
                            if (m0Var == n0Var) {
                                iU2 *= 2;
                            }
                            Iterator it2 = it;
                            int[] iArr3 = iArr2;
                            switch (m0Var.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iW = 8;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key2);
                                            C0432q.b(c0427l3, o0Var, 2, value2);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key3);
                                            C0432q.b(c0427l3, o0Var, 2, value3);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key4);
                                            C0432q.b(c0427l3, o0Var, 2, value4);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key5);
                                            C0432q.b(c0427l3, o0Var, 2, value5);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key6);
                                            C0432q.b(c0427l3, o0Var, 2, value6);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key7);
                                            C0432q.b(c0427l3, o0Var, 2, value7);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key8);
                                            C0432q.b(c0427l3, o0Var, 2, value8);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key9);
                                            C0432q.b(c0427l3, o0Var, 2, value9);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key10);
                                            C0432q.b(c0427l3, o0Var, 2, value10);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11);
                                            C0432q.b(c0427l3, o0Var, 2, value11);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key12);
                                            C0432q.b(c0427l3, o0Var, 2, value12);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key13);
                                            C0432q.b(c0427l3, o0Var, 2, value13);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key14);
                                            C0432q.b(c0427l3, o0Var, 2, value14);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key15);
                                            C0432q.b(c0427l3, o0Var, 2, value15);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key16);
                                            C0432q.b(c0427l3, o0Var, 2, value16);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key17);
                                            C0432q.b(c0427l3, o0Var, 2, value17);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue >> 31) ^ (iIntValue << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key18);
                                            C0432q.b(c0427l3, o0Var, 2, value18);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue << i) ^ (jLongValue >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key19);
                                            C0432q.b(c0427l3, o0Var, 2, value19);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iW = 4;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key110);
                                            C0432q.b(c0427l3, o0Var, 2, value110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111);
                                            C0432q.b(c0427l3, o0Var, 2, value111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key112);
                                            C0432q.b(c0427l3, o0Var, 2, value112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key113);
                                            C0432q.b(c0427l3, o0Var, 2, value113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key114);
                                            C0432q.b(c0427l3, o0Var, 2, value114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key115);
                                            C0432q.b(c0427l3, o0Var, 2, value115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key116);
                                            C0432q.b(c0427l3, o0Var, 2, value116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key117);
                                            C0432q.b(c0427l3, o0Var, 2, value117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key118);
                                            C0432q.b(c0427l3, o0Var, 2, value118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key119);
                                            C0432q.b(c0427l3, o0Var, 2, value119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1110);
                                            C0432q.b(c0427l3, o0Var, 2, value1110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111);
                                            C0432q.b(c0427l3, o0Var, 2, value1111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1112);
                                            C0432q.b(c0427l3, o0Var, 2, value1112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1113);
                                            C0432q.b(c0427l3, o0Var, 2, value1113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1114);
                                            C0432q.b(c0427l3, o0Var, 2, value1114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1115);
                                            C0432q.b(c0427l3, o0Var, 2, value1115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1116);
                                            C0432q.b(c0427l3, o0Var, 2, value1116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue2 << i) ^ (jLongValue2 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1117);
                                            C0432q.b(c0427l3, o0Var, 2, value1117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    length = length;
                                    iW = C0427l.W(((Long) key).longValue());
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1118);
                                            C0432q.b(c0427l3, o0Var, 2, value1118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1119);
                                            C0432q.b(c0427l3, o0Var, 2, value1119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11110);
                                            C0432q.b(c0427l3, o0Var, 2, value11110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111);
                                            C0432q.b(c0427l3, o0Var, 2, value11111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11112);
                                            C0432q.b(c0427l3, o0Var, 2, value11112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11113);
                                            C0432q.b(c0427l3, o0Var, 2, value11113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11114);
                                            C0432q.b(c0427l3, o0Var, 2, value11114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11115);
                                            C0432q.b(c0427l3, o0Var, 2, value11115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11116);
                                            C0432q.b(c0427l3, o0Var, 2, value11116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11117);
                                            C0432q.b(c0427l3, o0Var, 2, value11117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11118);
                                            C0432q.b(c0427l3, o0Var, 2, value11118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11119);
                                            C0432q.b(c0427l3, o0Var, 2, value11119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111110);
                                            C0432q.b(c0427l3, o0Var, 2, value111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111);
                                            C0432q.b(c0427l3, o0Var, 2, value111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111112);
                                            C0432q.b(c0427l3, o0Var, 2, value111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111113);
                                            C0432q.b(c0427l3, o0Var, 2, value111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111114);
                                            C0432q.b(c0427l3, o0Var, 2, value111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue3 << i) ^ (jLongValue3 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111115);
                                            C0432q.b(c0427l3, o0Var, 2, value111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    length = length;
                                    iW = C0427l.W(((Long) key).longValue());
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111116);
                                            C0432q.b(c0427l3, o0Var, 2, value111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111117);
                                            C0432q.b(c0427l3, o0Var, 2, value111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111118);
                                            C0432q.b(c0427l3, o0Var, 2, value111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111119);
                                            C0432q.b(c0427l3, o0Var, 2, value111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111110);
                                            C0432q.b(c0427l3, o0Var, 2, value1111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111112);
                                            C0432q.b(c0427l3, o0Var, 2, value1111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111113);
                                            C0432q.b(c0427l3, o0Var, 2, value1111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111114);
                                            C0432q.b(c0427l3, o0Var, 2, value1111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111115);
                                            C0432q.b(c0427l3, o0Var, 2, value1111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111116);
                                            C0432q.b(c0427l3, o0Var, 2, value1111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111117);
                                            C0432q.b(c0427l3, o0Var, 2, value1111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111118);
                                            C0432q.b(c0427l3, o0Var, 2, value1111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111119);
                                            C0432q.b(c0427l3, o0Var, 2, value1111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111110);
                                            C0432q.b(c0427l3, o0Var, 2, value11111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111112);
                                            C0432q.b(c0427l3, o0Var, 2, value11111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue4 << i) ^ (jLongValue4 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111113);
                                            C0432q.b(c0427l3, o0Var, 2, value11111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    length = length;
                                    iW = C0427l.W(((Integer) key).intValue());
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111114);
                                            C0432q.b(c0427l3, o0Var, 2, value11111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111115);
                                            C0432q.b(c0427l3, o0Var, 2, value11111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111116);
                                            C0432q.b(c0427l3, o0Var, 2, value11111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111117);
                                            C0432q.b(c0427l3, o0Var, 2, value11111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111118);
                                            C0432q.b(c0427l3, o0Var, 2, value11111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111119);
                                            C0432q.b(c0427l3, o0Var, 2, value11111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue5 << i) ^ (jLongValue5 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iW = 8;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue6 << i) ^ (jLongValue6 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iW = 4;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue7 << i) ^ (jLongValue7 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    length = length;
                                    ((Boolean) key).getClass();
                                    iW = i;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue8 << i) ^ (jLongValue8 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    length = length;
                                    if (key instanceof C0422g) {
                                        size = ((C0422g) key).size();
                                        iV = C0427l.V(size);
                                        iW = size + iV;
                                    } else {
                                        iW = C0427l.T((String) key);
                                    }
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue9 << i) ^ (jLongValue9 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    iA = ((AbstractC0436v) ((AbstractC0416a) key)).a(null);
                                    iW = iA;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue10 << i) ^ (jLongValue10 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    int iA2 = ((AbstractC0436v) ((AbstractC0416a) key)).a(null);
                                    iA = iA2 + C0427l.V(iA2);
                                    iW = iA;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue11 << i) ^ (jLongValue11 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    length = length;
                                    if (key instanceof C0422g) {
                                        size = ((C0422g) key).size();
                                        iV = C0427l.V(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        iV = C0427l.V(size);
                                    }
                                    iW = size + iV;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue12 << i) ^ (jLongValue12 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    length = length;
                                    iW = C0427l.V(((Integer) key).intValue());
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue13 << i) ^ (jLongValue13 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    length = length;
                                    iW = C0427l.W(((Integer) key).intValue());
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue14 << i) ^ (jLongValue14 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iW = 4;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue15 << i) ^ (jLongValue15 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iW = 8;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue16 << i) ^ (jLongValue16 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iV2 = C0427l.V((iIntValue17 << 1) ^ (iIntValue17 >> 31));
                                    length = length;
                                    iW = iV2;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue17 << i) ^ (jLongValue17 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iV2 = C0427l.W((jLongValue18 << i) ^ (jLongValue18 >> 63));
                                    length = length;
                                    iW = iV2;
                                    i8 = iW + iU2;
                                    iU = C0427l.U(2);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key1111111111111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value1111111111111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 2:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 3:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Long) value).longValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 4:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 7:
                                            i8 = i8;
                                            iU = iU;
                                            ((Boolean) value).getClass();
                                            iW2 = i;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 8:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                                iW2 = size2 + iV3;
                                            } else {
                                                iW2 = C0427l.T((String) value);
                                            }
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111116);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111116);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 9:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111117);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111117);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 10:
                                            i8 = i8;
                                            iU = iU;
                                            size2 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV3 = C0427l.V(size2);
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111118);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111118);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 11:
                                            i8 = i8;
                                            iU = iU;
                                            if (value instanceof C0422g) {
                                                size2 = ((C0422g) value).size();
                                                iV3 = C0427l.V(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iV3 = C0427l.V(size2);
                                            }
                                            iW2 = size2 + iV3;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key11111111111111111111111111111119);
                                            C0432q.b(c0427l3, o0Var, 2, value11111111111111111111111111111119);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 12:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.V(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111111110);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111111110);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 13:
                                            i8 = i8;
                                            iU = iU;
                                            iW2 = C0427l.W(((Integer) value).intValue());
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111111111);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111111111);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW2 = 4;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111111112);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111111112);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW2 = 8;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111111113);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111111113);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iW2 = C0427l.V((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111111114);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111111114);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iW2 = C0427l.W((jLongValue19 << i) ^ (jLongValue19 >> 63));
                                            i8 = i8;
                                            iU = iU;
                                            c0427l3.p0(iW2 + iU + i8);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            C0432q.b(c0427l3, m0Var, i, key111111111111111111111111111111115);
                                            C0432q.b(c0427l3, o0Var, 2, value111111111111111111111111111111115);
                                            i17 = 2;
                                            i11 = i28;
                                            i13 = i29;
                                            length = length;
                                            it = it2;
                                            iArr2 = iArr3;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i6 = i11;
                    i7 = i13;
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i11 = i6;
                    i13 = i7;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 51:
                    if (l6.q(i14, i12, obj)) {
                        double dDoubleValue = ((Double) i0.f6876c.h(j4, obj)).doubleValue();
                        C0427l c0427l4 = (C0427l) d6.f6789a;
                        c0427l4.getClass();
                        c0427l4.g0(i14, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 52:
                    if (l6.q(i14, i12, obj)) {
                        float fFloatValue = ((Float) i0.f6876c.h(j4, obj)).floatValue();
                        C0427l c0427l5 = (C0427l) d6.f6789a;
                        c0427l5.getClass();
                        c0427l5.e0(i14, Float.floatToRawIntBits(fFloatValue));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 53:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).q0(i14, A(j4, obj));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 54:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).q0(i14, A(j4, obj));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 55:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).i0(i14, z(j4, obj));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 56:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).g0(i14, A(j4, obj));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 57:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).e0(i14, z(j4, obj));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 58:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).b0(i14, ((Boolean) i0.f6876c.h(j4, obj)).booleanValue());
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 59:
                    if (l6.q(i14, i12, obj)) {
                        Object object3 = unsafe.getObject(obj, j4);
                        if (object3 instanceof String) {
                            ((C0427l) d6.f6789a).l0(i14, (String) object3);
                        } else {
                            ((C0427l) d6.f6789a).c0(i14, (C0422g) object3);
                        }
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 60:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).k0(i14, (AbstractC0416a) unsafe.getObject(obj, j4), l6.m(i12));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 61:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).c0(i14, (C0422g) unsafe.getObject(obj, j4));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 62:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).o0(i14, z(j4, obj));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 63:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).i0(i14, z(j4, obj));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 64:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).e0(i14, z(j4, obj));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 65:
                    if (l6.q(i14, i12, obj)) {
                        ((C0427l) d6.f6789a).g0(i14, A(j4, obj));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 66:
                    if (l6.q(i14, i12, obj)) {
                        int iZ = z(j4, obj);
                        ((C0427l) d6.f6789a).o0(i14, (iZ >> 31) ^ (iZ << 1));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 67:
                    if (l6.q(i14, i12, obj)) {
                        long jA = A(j4, obj);
                        ((C0427l) d6.f6789a).q0(i14, (jA << i) ^ (jA >> 63));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                case 68:
                    if (l6.q(i14, i12, obj)) {
                        d6.a(i14, unsafe.getObject(obj, j4), l6.m(i12));
                    }
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
                default:
                    iArr = iArr2;
                    length = length;
                    i17 = i17;
                    i12 += 3;
                    i9 = i17;
                    length = length;
                    iArr2 = iArr;
                    i10 = 1048575;
                    break;
            }
        }
        ((d0) l6.f6811l).getClass();
        ((AbstractC0436v) obj).unknownFields.d(d6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.V
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f6801a;
            if (i >= iArr.length) {
                W.k(this.f6811l, obj, obj2);
                return;
            }
            int iM = M(i);
            long j4 = 1048575 & iM;
            int i3 = iArr[i];
            switch (L(iM)) {
                case 0:
                    if (!n(i, obj2)) {
                        obj3 = obj;
                    } else {
                        h0 h0Var = i0.f6876c;
                        obj3 = obj;
                        h0Var.l(obj3, j4, h0Var.d(j4, obj2));
                        H(i, obj3);
                    }
                    break;
                case 1:
                    if (n(i, obj2)) {
                        h0 h0Var2 = i0.f6876c;
                        h0Var2.m(obj, j4, h0Var2.e(j4, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        i0.n(obj, j4, i0.f6876c.g(j4, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        i0.n(obj, j4, i0.f6876c.g(j4, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        i0.m(i0.f6876c.f(j4, obj2), j4, obj);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        i0.n(obj, j4, i0.f6876c.g(j4, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        i0.m(i0.f6876c.f(j4, obj2), j4, obj);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        h0 h0Var3 = i0.f6876c;
                        h0Var3.j(obj, j4, h0Var3.c(j4, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        i0.o(j4, obj, i0.f6876c.h(j4, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    t(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        i0.o(j4, obj, i0.f6876c.h(j4, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        i0.m(i0.f6876c.f(j4, obj2), j4, obj);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        i0.m(i0.f6876c.f(j4, obj2), j4, obj);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        i0.m(i0.f6876c.f(j4, obj2), j4, obj);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        i0.n(obj, j4, i0.f6876c.g(j4, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        i0.m(i0.f6876c.f(j4, obj2), j4, obj);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        i0.n(obj, j4, i0.f6876c.g(j4, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    t(obj, i, obj2);
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
                    this.f6810k.getClass();
                    h0 h0Var4 = i0.f6876c;
                    InterfaceC0437w interfaceC0437wG = (InterfaceC0437w) h0Var4.h(j4, obj);
                    InterfaceC0437w interfaceC0437w = (InterfaceC0437w) h0Var4.h(j4, obj2);
                    T t6 = (T) interfaceC0437wG;
                    int i6 = t6.f6822j;
                    int i7 = ((T) interfaceC0437w).f6822j;
                    if (i6 > 0 && i7 > 0) {
                        if (!((AbstractC0417b) interfaceC0437wG).f6841h) {
                            interfaceC0437wG = t6.g(i7 + i6);
                        }
                        ((AbstractC0417b) interfaceC0437wG).addAll(interfaceC0437w);
                    }
                    if (i6 > 0) {
                        interfaceC0437w = interfaceC0437wG;
                    }
                    i0.o(j4, obj, interfaceC0437w);
                    obj3 = obj;
                    break;
                case WampClient.RequestType.RESULT /* 50 */:
                    Class cls = W.f6827a;
                    h0 h0Var5 = i0.f6876c;
                    Object objH = h0Var5.h(j4, obj);
                    Object objH2 = h0Var5.h(j4, obj2);
                    this.f6812m.getClass();
                    i0.o(j4, obj, H.a(objH, objH2));
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
                    if (q(i3, i, obj2)) {
                        i0.o(j4, obj, i0.f6876c.h(j4, obj2));
                        I(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    u(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i3, i, obj2)) {
                        i0.o(j4, obj, i0.f6876c.h(j4, obj2));
                        I(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    u(obj, i, obj2);
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

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0436v) {
                AbstractC0436v abstractC0436v = (AbstractC0436v) obj;
                abstractC0436v.k(Integer.MAX_VALUE);
                abstractC0436v.memoizedHashCode = 0;
                abstractC0436v.h();
            }
            int[] iArr = this.f6801a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM = M(i);
                long j4 = 1048575 & iM;
                int iL = L(iM);
                if (iL != 9) {
                    if (iL != 60 && iL != 68) {
                        switch (iL) {
                            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                if (n(i, obj)) {
                                    m(i).b(f6800o.getObject(obj, j4));
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
                                this.f6810k.getClass();
                                AbstractC0417b abstractC0417b = (AbstractC0417b) ((InterfaceC0437w) i0.f6876c.h(j4, obj));
                                if (abstractC0417b.f6841h) {
                                    abstractC0417b.f6841h = false;
                                }
                                break;
                            case WampClient.RequestType.RESULT /* 50 */:
                                Unsafe unsafe = f6800o;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    this.f6812m.getClass();
                                    ((G) object).f6794h = false;
                                    unsafe.putObject(obj, j4, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).b(f6800o.getObject(obj, j4));
                    }
                } else if (n(i, obj)) {
                    m(i).b(f6800o.getObject(obj, j4));
                }
            }
            ((d0) this.f6811l).getClass();
            c0 c0Var = ((AbstractC0436v) obj).unknownFields;
            if (c0Var.f6849e) {
                c0Var.f6849e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean c(Object obj) {
        int i;
        int i3;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f6808h) {
            int i9 = this.f6807g[i8];
            int[] iArr = this.f6801a;
            int i10 = iArr[i9];
            int iM = M(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f6800o.getInt(obj, i12);
                }
                i3 = i7;
                i = i12;
            } else {
                int i14 = i7;
                i = i6;
                i3 = i14;
            }
            if ((268435456 & iM) == 0 || o(obj, i9, i, i3, i13)) {
                int iL = L(iM);
                if (iL == 9 || iL == 17) {
                    if (o(obj, i9, i, i3, i13)) {
                        if (!m(i9).c(i0.f6876c.h(iM & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i8++;
                    i6 = i;
                    i7 = i3;
                } else {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (q(i10, i9, obj)) {
                                if (!m(i9).c(i0.f6876c.h(iM & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i8++;
                            i6 = i;
                            i7 = i3;
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                Object objH = i0.f6876c.h(iM & 1048575, obj);
                                this.f6812m.getClass();
                                G g6 = (G) objH;
                                if (g6.isEmpty()) {
                                    continue;
                                } else {
                                    if (((F) this.f6802b[(i9 / 3) * 2]).f6793a.f6791b.f6908h != r0.MESSAGE) {
                                        continue;
                                    } else {
                                        V vA = null;
                                        for (Object obj2 : g6.values()) {
                                            if (vA == null) {
                                                vA = S.f6818c.a(obj2.getClass());
                                            }
                                            if (!vA.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i8++;
                            i6 = i;
                            i7 = i3;
                        }
                    }
                    List list = (List) i0.f6876c.h(iM & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        V vM = m(i9);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            if (vM.c(list.get(i15))) {
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

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0436v d() {
        this.f6809j.getClass();
        return this.f6805e.i();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void e(Object obj, D d6) throws IOException {
        d6.getClass();
        N(obj, d6);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.V
    public final int f(AbstractC0436v abstractC0436v) {
        int i;
        int iB;
        int i3;
        int[] iArr = this.f6801a;
        int length = iArr.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iM = M(i7);
            int i8 = iArr[i7];
            long j4 = 1048575 & iM;
            int i9 = 1237;
            int iHashCode = 37;
            switch (L(iM)) {
                case 0:
                    i = i6 * 53;
                    iB = AbstractC0438x.b(Double.doubleToLongBits(i0.f6876c.d(j4, abstractC0436v)));
                    i6 = iB + i;
                    break;
                case 1:
                    i = i6 * 53;
                    iB = Float.floatToIntBits(i0.f6876c.e(j4, abstractC0436v));
                    i6 = iB + i;
                    break;
                case 2:
                    i = i6 * 53;
                    iB = AbstractC0438x.b(i0.f6876c.g(j4, abstractC0436v));
                    i6 = iB + i;
                    break;
                case 3:
                    i = i6 * 53;
                    iB = AbstractC0438x.b(i0.f6876c.g(j4, abstractC0436v));
                    i6 = iB + i;
                    break;
                case 4:
                    i = i6 * 53;
                    iB = i0.f6876c.f(j4, abstractC0436v);
                    i6 = iB + i;
                    break;
                case 5:
                    i = i6 * 53;
                    iB = AbstractC0438x.b(i0.f6876c.g(j4, abstractC0436v));
                    i6 = iB + i;
                    break;
                case 6:
                    i = i6 * 53;
                    iB = i0.f6876c.f(j4, abstractC0436v);
                    i6 = iB + i;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zC = i0.f6876c.c(j4, abstractC0436v);
                    Charset charset = AbstractC0438x.f6926a;
                    if (zC) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i = i6 * 53;
                    iB = ((String) i0.f6876c.h(j4, abstractC0436v)).hashCode();
                    i6 = iB + i;
                    break;
                case 9:
                    Object objH = i0.f6876c.h(j4, abstractC0436v);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
                    break;
                case 10:
                    i = i6 * 53;
                    iB = i0.f6876c.h(j4, abstractC0436v).hashCode();
                    i6 = iB + i;
                    break;
                case 11:
                    i = i6 * 53;
                    iB = i0.f6876c.f(j4, abstractC0436v);
                    i6 = iB + i;
                    break;
                case 12:
                    i = i6 * 53;
                    iB = i0.f6876c.f(j4, abstractC0436v);
                    i6 = iB + i;
                    break;
                case 13:
                    i = i6 * 53;
                    iB = i0.f6876c.f(j4, abstractC0436v);
                    i6 = iB + i;
                    break;
                case 14:
                    i = i6 * 53;
                    iB = AbstractC0438x.b(i0.f6876c.g(j4, abstractC0436v));
                    i6 = iB + i;
                    break;
                case 15:
                    i = i6 * 53;
                    iB = i0.f6876c.f(j4, abstractC0436v);
                    i6 = iB + i;
                    break;
                case 16:
                    i = i6 * 53;
                    iB = AbstractC0438x.b(i0.f6876c.g(j4, abstractC0436v));
                    i6 = iB + i;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    Object objH2 = i0.f6876c.h(j4, abstractC0436v);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
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
                    iB = i0.f6876c.h(j4, abstractC0436v).hashCode();
                    i6 = iB + i;
                    break;
                case WampClient.RequestType.RESULT /* 50 */:
                    i = i6 * 53;
                    iB = i0.f6876c.h(j4, abstractC0436v).hashCode();
                    i6 = iB + i;
                    break;
                case 51:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = AbstractC0438x.b(Double.doubleToLongBits(((Double) i0.f6876c.h(j4, abstractC0436v)).doubleValue()));
                        i6 = iB + i;
                    }
                    break;
                case 52:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = Float.floatToIntBits(((Float) i0.f6876c.h(j4, abstractC0436v)).floatValue());
                        i6 = iB + i;
                    }
                    break;
                case 53:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = AbstractC0438x.b(A(j4, abstractC0436v));
                        i6 = iB + i;
                    }
                    break;
                case 54:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = AbstractC0438x.b(A(j4, abstractC0436v));
                        i6 = iB + i;
                    }
                    break;
                case 55:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = z(j4, abstractC0436v);
                        i6 = iB + i;
                    }
                    break;
                case 56:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = AbstractC0438x.b(A(j4, abstractC0436v));
                        i6 = iB + i;
                    }
                    break;
                case 57:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = z(j4, abstractC0436v);
                        i6 = iB + i;
                    }
                    break;
                case 58:
                    if (q(i8, i7, abstractC0436v)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) i0.f6876c.h(j4, abstractC0436v)).booleanValue();
                        Charset charset2 = AbstractC0438x.f6926a;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = ((String) i0.f6876c.h(j4, abstractC0436v)).hashCode();
                        i6 = iB + i;
                    }
                    break;
                case 60:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = i0.f6876c.h(j4, abstractC0436v).hashCode();
                        i6 = iB + i;
                    }
                    break;
                case 61:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = i0.f6876c.h(j4, abstractC0436v).hashCode();
                        i6 = iB + i;
                    }
                    break;
                case 62:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = z(j4, abstractC0436v);
                        i6 = iB + i;
                    }
                    break;
                case 63:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = z(j4, abstractC0436v);
                        i6 = iB + i;
                    }
                    break;
                case 64:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = z(j4, abstractC0436v);
                        i6 = iB + i;
                    }
                    break;
                case 65:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = AbstractC0438x.b(A(j4, abstractC0436v));
                        i6 = iB + i;
                    }
                    break;
                case 66:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = z(j4, abstractC0436v);
                        i6 = iB + i;
                    }
                    break;
                case 67:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = AbstractC0438x.b(A(j4, abstractC0436v));
                        i6 = iB + i;
                    }
                    break;
                case 68:
                    if (q(i8, i7, abstractC0436v)) {
                        i = i6 * 53;
                        iB = i0.f6876c.h(j4, abstractC0436v).hashCode();
                        i6 = iB + i;
                    }
                    break;
            }
        }
        ((d0) this.f6811l).getClass();
        return abstractC0436v.unknownFields.hashCode() + (i6 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean g(AbstractC0436v abstractC0436v, AbstractC0436v abstractC0436v2) {
        int[] iArr = this.f6801a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iM = M(i);
                long j4 = iM & 1048575;
                switch (L(iM)) {
                    case 0:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var = i0.f6876c;
                            if (Double.doubleToLongBits(h0Var.d(j4, abstractC0436v)) != Double.doubleToLongBits(h0Var.d(j4, abstractC0436v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var2 = i0.f6876c;
                            if (Float.floatToIntBits(h0Var2.e(j4, abstractC0436v)) != Float.floatToIntBits(h0Var2.e(j4, abstractC0436v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var3 = i0.f6876c;
                            if (h0Var3.g(j4, abstractC0436v) != h0Var3.g(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var4 = i0.f6876c;
                            if (h0Var4.g(j4, abstractC0436v) != h0Var4.g(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var5 = i0.f6876c;
                            if (h0Var5.f(j4, abstractC0436v) != h0Var5.f(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var6 = i0.f6876c;
                            if (h0Var6.g(j4, abstractC0436v) != h0Var6.g(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var7 = i0.f6876c;
                            if (h0Var7.f(j4, abstractC0436v) != h0Var7.f(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var8 = i0.f6876c;
                            if (h0Var8.c(j4, abstractC0436v) != h0Var8.c(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var9 = i0.f6876c;
                            if (!W.l(h0Var9.h(j4, abstractC0436v), h0Var9.h(j4, abstractC0436v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var10 = i0.f6876c;
                            if (!W.l(h0Var10.h(j4, abstractC0436v), h0Var10.h(j4, abstractC0436v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var11 = i0.f6876c;
                            if (!W.l(h0Var11.h(j4, abstractC0436v), h0Var11.h(j4, abstractC0436v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var12 = i0.f6876c;
                            if (h0Var12.f(j4, abstractC0436v) != h0Var12.f(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var13 = i0.f6876c;
                            if (h0Var13.f(j4, abstractC0436v) != h0Var13.f(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var14 = i0.f6876c;
                            if (h0Var14.f(j4, abstractC0436v) != h0Var14.f(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var15 = i0.f6876c;
                            if (h0Var15.g(j4, abstractC0436v) != h0Var15.g(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var16 = i0.f6876c;
                            if (h0Var16.f(j4, abstractC0436v) != h0Var16.f(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var17 = i0.f6876c;
                            if (h0Var17.g(j4, abstractC0436v) != h0Var17.g(j4, abstractC0436v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                        if (!j(abstractC0436v, abstractC0436v2, i)) {
                            zL = false;
                        } else {
                            h0 h0Var18 = i0.f6876c;
                            if (!W.l(h0Var18.h(j4, abstractC0436v), h0Var18.h(j4, abstractC0436v2))) {
                                zL = false;
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
                        h0 h0Var19 = i0.f6876c;
                        zL = W.l(h0Var19.h(j4, abstractC0436v), h0Var19.h(j4, abstractC0436v2));
                        break;
                    case WampClient.RequestType.RESULT /* 50 */:
                        h0 h0Var20 = i0.f6876c;
                        zL = W.l(h0Var20.h(j4, abstractC0436v), h0Var20.h(j4, abstractC0436v2));
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
                        h0 h0Var21 = i0.f6876c;
                        if (h0Var21.f(j6, abstractC0436v) != h0Var21.f(j6, abstractC0436v2) || !W.l(h0Var21.h(j4, abstractC0436v), h0Var21.h(j4, abstractC0436v2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                d0 d0Var = (d0) this.f6811l;
                d0Var.getClass();
                c0 c0Var = abstractC0436v.unknownFields;
                d0Var.getClass();
                if (c0Var.equals(abstractC0436v2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void h(Object obj, C0426k c0426k, C0429n c0429n) {
        c0429n.getClass();
        if (p(obj)) {
            r(this.f6811l, obj, c0426k, c0429n);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x0320  */
    /* JADX WARN: Code duplicated, block: B:134:0x032f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0341  */
    /* JADX WARN: Code duplicated, block: B:136:0x0352  */
    /* JADX WARN: Code duplicated, block: B:138:0x035b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0364  */
    /* JADX WARN: Code duplicated, block: B:141:0x0371  */
    /* JADX WARN: Code duplicated, block: B:142:0x037d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0381  */
    /* JADX WARN: Code duplicated, block: B:146:0x038e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0396  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:152:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:153:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:154:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:159:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:160:0x0402  */
    /* JADX WARN: Code duplicated, block: B:216:0x060e A[PHI: r21 r23 r24
  0x060e: PHI (r21v47 int) = 
  (r21v30 int)
  (r21v31 int)
  (r21v32 int)
  (r21v36 int)
  (r21v38 int)
  (r21v39 int)
  (r21v40 int)
  (r21v44 int)
  (r21v48 int)
 binds: [B:275:0x07e1, B:271:0x07c1, B:267:0x07a1, B:250:0x071e, B:236:0x06b1, B:232:0x0691, B:228:0x0673, B:221:0x062f, B:215:0x060c] A[DONT_GENERATE, DONT_INLINE]
  0x060e: PHI (r23v19 int) = 
  (r23v2 int)
  (r23v3 int)
  (r23v4 int)
  (r23v8 int)
  (r23v10 int)
  (r23v11 int)
  (r23v12 int)
  (r23v16 int)
  (r23v20 int)
 binds: [B:275:0x07e1, B:271:0x07c1, B:267:0x07a1, B:250:0x071e, B:236:0x06b1, B:232:0x0691, B:228:0x0673, B:221:0x062f, B:215:0x060c] A[DONT_GENERATE, DONT_INLINE]
  0x060e: PHI (r24v18 int) = 
  (r24v2 int)
  (r24v3 int)
  (r24v4 int)
  (r24v8 int)
  (r24v10 int)
  (r24v11 int)
  (r24v12 int)
  (r24v15 int)
  (r24v19 int)
 binds: [B:275:0x07e1, B:271:0x07c1, B:267:0x07a1, B:250:0x071e, B:236:0x06b1, B:232:0x0691, B:228:0x0673, B:221:0x062f, B:215:0x060c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:352:0x0329 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.V
    public final int i(AbstractC0436v abstractC0436v) {
        int i;
        int iU;
        int iU2;
        int iU3;
        int iW;
        int iU4;
        int iW2;
        int iU5;
        int iU6;
        int iS;
        int iC;
        int i3;
        int i6;
        int iU7;
        int size;
        int i7;
        int iU8;
        int iU9;
        int size2;
        int iU10;
        int iV;
        int iA;
        int iV2;
        int iW3;
        int size3;
        int iV3;
        int i8;
        int iU11;
        o0 o0Var;
        int iW4;
        int size4;
        int iV4;
        int iU12;
        int iU13;
        int iU14;
        int iW5;
        int iU15;
        int iW6;
        int iU16;
        int iV5;
        L l6 = this;
        AbstractC0436v abstractC0436v2 = abstractC0436v;
        int i9 = 2;
        int i10 = 1;
        Unsafe unsafe = f6800o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int iS2 = 0;
        while (true) {
            int[] iArr = l6.f6801a;
            if (i13 >= iArr.length) {
                ((d0) l6.f6811l).getClass();
                return abstractC0436v2.unknownFields.b() + iS2;
            }
            int iM = l6.M(i13);
            int iL = L(iM);
            int i15 = iArr[i13];
            int i16 = iArr[i13 + 2];
            int i17 = i16 & i11;
            int i18 = i9;
            if (iL <= 17) {
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(abstractC0436v2, i17);
                    i12 = i17;
                }
                i = i10 << (i16 >>> 20);
            } else {
                i = 0;
            }
            long j4 = iM & i11;
            if (iL >= r.i.f6912h) {
                int i19 = r.f6909j.f6912h;
            }
            char c6 = '?';
            switch (iL) {
                case 0:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        iU = C0427l.U(i15) + 8;
                        iS2 += iU;
                    }
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 1:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        iU2 = C0427l.U(i15);
                        iU6 = iU2 + 4;
                        iS2 += iU6;
                    }
                    l6 = this;
                    abstractC0436v2 = abstractC0436v;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 2:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        long j6 = unsafe.getLong(abstractC0436v2, j4);
                        iU3 = C0427l.U(i15);
                        iW = C0427l.W(j6);
                        iS2 += iW + iU3;
                    }
                    l6 = this;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 3:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        long j7 = unsafe.getLong(abstractC0436v2, j4);
                        iU3 = C0427l.U(i15);
                        iW = C0427l.W(j7);
                        iS2 += iW + iU3;
                    }
                    l6 = this;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 4:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        int i20 = unsafe.getInt(abstractC0436v2, j4);
                        iU4 = C0427l.U(i15);
                        iW2 = C0427l.W(i20);
                        iS = iW2 + iU4;
                        iS2 += iS;
                    }
                    l6 = this;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 5:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        iU5 = C0427l.U(i15);
                        iU6 = iU5 + 8;
                        iS2 += iU6;
                    }
                    l6 = this;
                    abstractC0436v2 = abstractC0436v;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 6:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        iU2 = C0427l.U(i15);
                        iU6 = iU2 + 4;
                        iS2 += iU6;
                    }
                    l6 = this;
                    abstractC0436v2 = abstractC0436v;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 7:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        iU6 = C0427l.U(i15) + 1;
                        iS2 += iU6;
                    }
                    l6 = this;
                    abstractC0436v2 = abstractC0436v;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 8:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        Object object = unsafe.getObject(abstractC0436v2, j4);
                        iS2 = (object instanceof C0422g ? C0427l.S(i15, (C0422g) object) : C0427l.T((String) object) + C0427l.U(i15)) + iS2;
                    }
                    l6 = this;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 9:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        Object object2 = unsafe.getObject(abstractC0436v2, j4);
                        V vM = l6.m(i13);
                        Class cls = W.f6827a;
                        int iU17 = C0427l.U(i15);
                        int iA2 = ((AbstractC0416a) object2).a(vM);
                        iS2 += C0427l.V(iA2) + iA2 + iU17;
                    }
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 10:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        iS = C0427l.S(i15, (C0422g) unsafe.getObject(abstractC0436v2, j4));
                        iS2 += iS;
                    }
                    l6 = this;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 11:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        int i21 = unsafe.getInt(abstractC0436v2, j4);
                        iU4 = C0427l.U(i15);
                        iW2 = C0427l.V(i21);
                        iS = iW2 + iU4;
                        iS2 += iS;
                    }
                    l6 = this;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 12:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        int i22 = unsafe.getInt(abstractC0436v2, j4);
                        iU4 = C0427l.U(i15);
                        iW2 = C0427l.W(i22);
                        iS = iW2 + iU4;
                        iS2 += iS;
                    }
                    l6 = this;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 13:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        iU2 = C0427l.U(i15);
                        iU6 = iU2 + 4;
                        iS2 += iU6;
                    }
                    l6 = this;
                    abstractC0436v2 = abstractC0436v;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 14:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        iU5 = C0427l.U(i15);
                        iU6 = iU5 + 8;
                        iS2 += iU6;
                    }
                    l6 = this;
                    abstractC0436v2 = abstractC0436v;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 15:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        int i23 = unsafe.getInt(abstractC0436v2, j4);
                        iU4 = C0427l.U(i15);
                        iW2 = C0427l.V((i23 >> 31) ^ (i23 << 1));
                        iS = iW2 + iU4;
                        iS2 += iS;
                    }
                    l6 = this;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 16:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        long j8 = unsafe.getLong(abstractC0436v2, j4);
                        iU3 = C0427l.U(i15);
                        iW = C0427l.W((j8 >> 63) ^ (j8 << i10));
                        iS2 += iW + iU3;
                    }
                    l6 = this;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    i10 = i10;
                    if (l6.o(abstractC0436v2, i13, i12, i14, i)) {
                        iU = ((AbstractC0416a) unsafe.getObject(abstractC0436v2, j4)).a(l6.m(i13)) + (C0427l.U(i15) * 2);
                        iS2 += iU;
                    }
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                    iC = W.c(i15, (List) unsafe.getObject(abstractC0436v2, j4));
                    iS2 += iC;
                    i12 = i12;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                    iC = W.b(i15, (List) unsafe.getObject(abstractC0436v2, j4));
                    iS2 += iC;
                    i12 = i12;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 20:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls2 = W.f6827a;
                    if (list.size() == 0) {
                        iU7 = 0;
                    } else {
                        iU7 = (C0427l.U(i15) * list.size()) + W.e(list);
                    }
                    iS2 += iU7;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 21:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list2 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls3 = W.f6827a;
                    size = list2.size();
                    if (size == 0) {
                        iU7 = 0;
                    } else {
                        i7 = W.i(list2);
                        iU8 = C0427l.U(i15);
                        iU7 = (iU8 * size) + i7;
                    }
                    iS2 += iU7;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 22:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list3 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls4 = W.f6827a;
                    size = list3.size();
                    if (size == 0) {
                        iU7 = 0;
                    } else {
                        i7 = W.d(list3);
                        iU8 = C0427l.U(i15);
                        iU7 = (iU8 * size) + i7;
                    }
                    iS2 += iU7;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 23:
                    iC = W.c(i15, (List) unsafe.getObject(abstractC0436v2, j4));
                    iS2 += iC;
                    i12 = i12;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 24:
                    iC = W.b(i15, (List) unsafe.getObject(abstractC0436v2, j4));
                    iS2 += iC;
                    i12 = i12;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 25:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list4 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls5 = W.f6827a;
                    int size5 = list4.size();
                    iS2 += size5 == 0 ? 0 : (C0427l.U(i15) + 1) * size5;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 26:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list5 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls6 = W.f6827a;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        iU7 = 0;
                    } else {
                        iU7 = C0427l.U(i15) * size6;
                        for (int i24 = 0; i24 < size6; i24++) {
                            Object obj = list5.get(i24);
                            if (obj instanceof C0422g) {
                                int size7 = ((C0422g) obj).size();
                                iU7 = C0427l.V(size7) + size7 + iU7;
                            } else {
                                iU7 = C0427l.T((String) obj) + iU7;
                            }
                        }
                    }
                    iS2 += iU7;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 27:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list6 = (List) unsafe.getObject(abstractC0436v2, j4);
                    V vM2 = l6.m(i13);
                    Class cls7 = W.f6827a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iU9 = 0;
                    } else {
                        iU9 = C0427l.U(i15) * size8;
                        for (int i25 = 0; i25 < size8; i25++) {
                            int iA3 = ((AbstractC0416a) list6.get(i25)).a(vM2);
                            iU9 += C0427l.V(iA3) + iA3;
                        }
                    }
                    iS2 += iU9;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 28:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list7 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls8 = W.f6827a;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iU7 = 0;
                    } else {
                        iU7 = C0427l.U(i15) * size9;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int size10 = ((C0422g) list7.get(i26)).size();
                            iU7 += C0427l.V(size10) + size10;
                        }
                    }
                    iS2 += iU7;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 29:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list8 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls9 = W.f6827a;
                    size = list8.size();
                    if (size == 0) {
                        iU7 = 0;
                    } else {
                        i7 = W.h(list8);
                        iU8 = C0427l.U(i15);
                        iU7 = (iU8 * size) + i7;
                    }
                    iS2 += iU7;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 30:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list9 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls10 = W.f6827a;
                    size = list9.size();
                    if (size == 0) {
                        iU7 = 0;
                    } else {
                        i7 = W.a(list9);
                        iU8 = C0427l.U(i15);
                        iU7 = (iU8 * size) + i7;
                    }
                    iS2 += iU7;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 31:
                    iC = W.b(i15, (List) unsafe.getObject(abstractC0436v2, j4));
                    iS2 += iC;
                    i12 = i12;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 32:
                    iC = W.c(i15, (List) unsafe.getObject(abstractC0436v2, j4));
                    iS2 += iC;
                    i12 = i12;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case WampClient.RequestType.SUBSCRIBED /* 33 */:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list10 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls11 = W.f6827a;
                    size = list10.size();
                    if (size == 0) {
                        iU7 = 0;
                    } else {
                        i7 = W.f(list10);
                        iU8 = C0427l.U(i15);
                        iU7 = (iU8 * size) + i7;
                    }
                    iS2 += iU7;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list11 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls12 = W.f6827a;
                    size = list11.size();
                    if (size == 0) {
                        iU7 = 0;
                    } else {
                        i7 = W.g(list11);
                        iU8 = C0427l.U(i15);
                        iU7 = (iU8 * size) + i7;
                    }
                    iS2 += iU7;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list12 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls13 = W.f6827a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case WampClient.RequestType.EVENT /* 36 */:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list13 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls14 = W.f6827a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 37:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    size2 = W.e((List) unsafe.getObject(abstractC0436v2, j4));
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 38:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    size2 = W.i((List) unsafe.getObject(abstractC0436v2, j4));
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 39:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    size2 = W.d((List) unsafe.getObject(abstractC0436v2, j4));
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 40:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list14 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls15 = W.f6827a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 41:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list15 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls16 = W.f6827a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 42:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list16 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls17 = W.f6827a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 43:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    size2 = W.h((List) unsafe.getObject(abstractC0436v2, j4));
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 44:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    size2 = W.a((List) unsafe.getObject(abstractC0436v2, j4));
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 45:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list17 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls18 = W.f6827a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 46:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list18 = (List) unsafe.getObject(abstractC0436v2, j4);
                    Class cls19 = W.f6827a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 47:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    size2 = W.f((List) unsafe.getObject(abstractC0436v2, j4));
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case WampClient.RequestType.CALL /* 48 */:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    size2 = W.g((List) unsafe.getObject(abstractC0436v2, j4));
                    if (size2 > 0) {
                        iU10 = C0427l.U(i15);
                        iV = C0427l.V(size2);
                        iS2 += iV + iU10 + size2;
                    }
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case WampClient.RequestType.CANCEL /* 49 */:
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    List list19 = (List) unsafe.getObject(abstractC0436v2, j4);
                    V vM3 = l6.m(i13);
                    Class cls20 = W.f6827a;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        iA = 0;
                    } else {
                        iA = 0;
                        for (int i27 = 0; i27 < size11; i27++) {
                            iA += ((AbstractC0416a) list19.get(i27)).a(vM3) + (C0427l.U(i15) * 2);
                        }
                    }
                    iS2 += iA;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case WampClient.RequestType.RESULT /* 50 */:
                    Object object3 = unsafe.getObject(abstractC0436v2, j4);
                    Object obj2 = l6.f6802b[(i13 / 3) * 2];
                    l6.f6812m.getClass();
                    G g6 = (G) object3;
                    F f6 = (F) obj2;
                    if (g6.isEmpty()) {
                        iV2 = 0;
                    } else {
                        Iterator it = g6.entrySet().iterator();
                        iV2 = 0;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            char c7 = c6;
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            f6.getClass();
                            int iU18 = C0427l.U(i15);
                            int i28 = i10;
                            E e6 = f6.f6793a;
                            int i29 = C0432q.f6901c;
                            int iU19 = C0427l.U(i28);
                            n0 n0Var = q0.f6905k;
                            m0 m0Var = e6.f6790a;
                            if (m0Var == n0Var) {
                                iU19 *= 2;
                            }
                            int i30 = i12;
                            int i31 = i14;
                            switch (m0Var.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iW3 = 8;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i32 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i32) + i32 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i33 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i33) + i33 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i34 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i34) + i34 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i35 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i35) + i35 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i36 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i36) + i36 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i37 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i37) + i37 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i38 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i38) + i38 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i39 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i39) + i39 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i310 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i310) + i310 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i311 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311) + i311 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i312 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i312) + i312 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i313 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i313) + i313 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i314 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i314) + i314 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i315 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i315) + i315 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i316 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i316) + i316 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i317 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i317) + i317 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue >> 31) ^ (iIntValue << 1));
                                            int i318 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i318) + i318 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue << i28) ^ (jLongValue >> c7));
                                            int i319 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i319) + i319 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iW3 = 4;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i3110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3110) + i3110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i3111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111) + i3111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3112) + i3112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3113) + i3113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3114) + i3114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3115) + i3115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3116) + i3116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i3117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3117) + i3117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i3118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3118) + i3118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i3119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3119) + i3119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i31110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31110) + i31110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i31111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111) + i31111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i31112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31112) + i31112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31113) + i31113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i31114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31114) + i31114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i31115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31115) + i31115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            int i31116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31116) + i31116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue2 << i28) ^ (jLongValue2 >> c7));
                                            int i31117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31117) + i31117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    it = it;
                                    iW3 = C0427l.W(((Long) key).longValue());
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i31118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31118) + i31118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i31119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31119) + i31119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311110) + i311110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111) + i311111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i311112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311112) + i311112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311113) + i311113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i311114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311114) + i311114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i311115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311115) + i311115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i311116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311116) + i311116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i311117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311117) + i311117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i311118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311118) + i311118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i311119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311119) + i311119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i3111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111110) + i3111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111) + i3111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111112) + i3111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111113) + i3111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            int i3111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111114) + i3111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue3 << i28) ^ (jLongValue3 >> c7));
                                            int i3111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111115) + i3111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    it = it;
                                    iW3 = C0427l.W(((Long) key).longValue());
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i3111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111116) + i3111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i3111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111117) + i3111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111118) + i3111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111119) + i3111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111110) + i31111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i31111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111) + i31111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i31111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111112) + i31111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i31111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111113) + i31111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i31111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111114) + i31111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i31111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111115) + i31111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i31111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111116) + i31111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i31111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111117) + i31111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i31111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111118) + i31111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111119) + i31111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i311111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111110) + i311111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111) + i311111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            int i311111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111112) + i311111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue4 << i28) ^ (jLongValue4 >> c7));
                                            int i311111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111113) + i311111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    it = it;
                                    iW3 = C0427l.W(((Integer) key).intValue());
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i311111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111114) + i311111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i311111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111115) + i311111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111116) + i311111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111117) + i311111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i311111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111118) + i311111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111119) + i311111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111110) + i3111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i3111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111) + i3111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i3111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111112) + i3111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i3111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111113) + i3111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i3111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111114) + i3111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i3111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111115) + i3111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i3111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111116) + i3111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111117) + i3111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111118) + i3111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111119) + i3111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            int i31111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111110) + i31111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue5 << i28) ^ (jLongValue5 >> c7));
                                            int i31111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111) + i31111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iW3 = 8;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i31111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111112) + i31111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i31111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111113) + i31111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i31111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111114) + i31111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i31111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111115) + i31111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111116) + i31111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i31111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111117) + i31111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i31111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111118) + i31111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i31111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111119) + i31111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i311111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111110) + i311111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i311111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111) + i311111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i311111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111112) + i311111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i311111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111113) + i311111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i311111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111114) + i311111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i311111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111115) + i311111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i311111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111116) + i311111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111117) + i311111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            int i311111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111118) + i311111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue6 << i28) ^ (jLongValue6 >> c7));
                                            int i311111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111119) + i311111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iW3 = 4;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i3111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111110) + i3111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111) + i3111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111112) + i3111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111113) + i3111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111114) + i3111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111115) + i3111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111116) + i3111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i3111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111117) + i3111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i3111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111118) + i3111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i3111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111119) + i3111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i31111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111110) + i31111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i31111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111) + i31111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i31111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111112) + i31111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111113) + i31111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i31111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111114) + i31111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i31111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111115) + i31111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            int i31111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111116) + i31111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue7 << i28) ^ (jLongValue7 >> c7));
                                            int i31111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111117) + i31111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    it = it;
                                    ((Boolean) key).getClass();
                                    iW3 = i28;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i31111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111118) + i31111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i31111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111119) + i31111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111110) + i311111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111) + i311111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i311111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111112) + i311111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111113) + i311111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i311111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111114) + i311111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i311111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111115) + i311111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i311111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111116) + i311111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i311111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111117) + i311111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i311111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111118) + i311111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i311111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111119) + i311111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i3111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111110) + i3111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111) + i3111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111112) + i3111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111113) + i3111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            int i3111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111114) + i3111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue8 << i28) ^ (jLongValue8 >> c7));
                                            int i3111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111115) + i3111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    it = it;
                                    if (key instanceof C0422g) {
                                        size3 = ((C0422g) key).size();
                                        iV3 = C0427l.V(size3);
                                        iW3 = iV3 + size3;
                                    } else {
                                        iW3 = C0427l.T((String) key);
                                    }
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111116) + i3111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111117) + i3111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111118) + i3111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111119) + i3111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111110) + i31111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i31111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111) + i31111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i31111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111112) + i31111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i31111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111113) + i31111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i31111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111114) + i31111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i31111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111115) + i31111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i31111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111116) + i31111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i31111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111117) + i31111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i31111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111118) + i31111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111119) + i31111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i311111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111110) + i311111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111) + i311111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            int i311111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111112) + i311111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue9 << i28) ^ (jLongValue9 >> c7));
                                            int i311111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111113) + i311111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    it = it;
                                    iW3 = ((AbstractC0436v) ((AbstractC0416a) key)).a(null);
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i311111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111114) + i311111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i311111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111115) + i311111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111116) + i311111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111117) + i311111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i311111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111118) + i311111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111119) + i311111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111110) + i3111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i3111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111) + i3111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i3111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111112) + i3111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i3111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111113) + i3111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i3111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111114) + i3111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i3111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111115) + i3111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i3111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111116) + i3111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111117) + i3111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111118) + i3111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111119) + i3111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            int i31111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111110) + i31111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue10 << i28) ^ (jLongValue10 >> c7));
                                            int i31111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111) + i31111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    it = it;
                                    int iA4 = ((AbstractC0436v) ((AbstractC0416a) key)).a(null);
                                    iW3 = C0427l.V(iA4) + iA4;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i31111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111112) + i31111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i31111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111113) + i31111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i31111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111114) + i31111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i31111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111115) + i31111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111116) + i31111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i31111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111117) + i31111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i31111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111118) + i31111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i31111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111119) + i31111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i311111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111110) + i311111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i311111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111) + i311111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i311111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111112) + i311111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i311111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111113) + i311111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i311111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111114) + i311111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i311111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111115) + i311111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i311111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111116) + i311111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111117) + i311111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            int i311111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111118) + i311111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue11 << i28) ^ (jLongValue11 >> c7));
                                            int i311111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111119) + i311111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    it = it;
                                    if (key instanceof C0422g) {
                                        size3 = ((C0422g) key).size();
                                        iV3 = C0427l.V(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        iV3 = C0427l.V(size3);
                                    }
                                    iW3 = iV3 + size3;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111110) + i3111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111) + i3111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111112) + i3111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111113) + i3111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111114) + i3111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111115) + i3111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111116) + i3111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i3111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111117) + i3111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i3111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111118) + i3111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i3111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111119) + i3111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i31111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111110) + i31111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i31111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111) + i31111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i31111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111112) + i31111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111113) + i31111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i31111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111114) + i31111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i31111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111115) + i31111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            int i31111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111116) + i31111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue12 << i28) ^ (jLongValue12 >> c7));
                                            int i31111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111117) + i31111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    it = it;
                                    iW3 = C0427l.V(((Integer) key).intValue());
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i31111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111118) + i31111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i31111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111119) + i31111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111110) + i311111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111) + i311111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i311111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111112) + i311111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111113) + i311111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i311111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111114) + i311111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i311111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111115) + i311111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i311111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111116) + i311111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i311111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111117) + i311111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i311111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111118) + i311111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i311111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111119) + i311111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i3111111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111110) + i3111111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3111111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111) + i3111111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111112) + i3111111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111113) + i3111111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            int i3111111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111114) + i3111111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue13 << i28) ^ (jLongValue13 >> c7));
                                            int i3111111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111115) + i3111111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    it = it;
                                    iW3 = C0427l.W(((Integer) key).intValue());
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111116) + i3111111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111117) + i3111111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111118) + i3111111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111119) + i3111111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111110) + i31111111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i31111111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111) + i31111111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i31111111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111112) + i31111111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i31111111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111113) + i31111111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i31111111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111114) + i31111111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i31111111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111115) + i31111111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i31111111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111116) + i31111111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i31111111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111117) + i31111111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i31111111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111118) + i31111111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111119) + i31111111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i311111111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111110) + i311111111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111) + i311111111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            int i311111111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111112) + i311111111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue14 << i28) ^ (jLongValue14 >> c7));
                                            int i311111111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111113) + i311111111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iW3 = 4;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i311111111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111114) + i311111111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i311111111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111115) + i311111111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111116) + i311111111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111117) + i311111111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i311111111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111118) + i311111111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111119) + i311111111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111110) + i3111111111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i3111111111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111) + i3111111111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i3111111111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111112) + i3111111111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i3111111111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111113) + i3111111111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i3111111111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111114) + i3111111111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i3111111111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111115) + i3111111111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i3111111111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111116) + i3111111111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3111111111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111117) + i3111111111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111118) + i3111111111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111119) + i3111111111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            int i31111111111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111110) + i31111111111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue15 << i28) ^ (jLongValue15 >> c7));
                                            int i31111111111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111) + i31111111111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iW3 = 8;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i31111111111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111112) + i31111111111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i31111111111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111113) + i31111111111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i31111111111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111114) + i31111111111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i31111111111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111115) + i31111111111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111111111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111116) + i31111111111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i31111111111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111117) + i31111111111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i31111111111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111118) + i31111111111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i31111111111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111119) + i31111111111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i311111111111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111110) + i311111111111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i311111111111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111) + i311111111111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i311111111111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111112) + i311111111111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i311111111111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111113) + i311111111111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i311111111111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111114) + i311111111111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i311111111111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111115) + i311111111111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i311111111111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111116) + i311111111111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111117) + i311111111111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            int i311111111111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111118) + i311111111111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue16 << i28) ^ (jLongValue16 >> c7));
                                            int i311111111111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111119) + i311111111111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iW3 = C0427l.V((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                    it = it;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111110) + i3111111111111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111111) + i3111111111111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111111111111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111112) + i3111111111111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i3111111111111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111113) + i3111111111111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3111111111111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111114) + i3111111111111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111115) + i3111111111111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111116) + i3111111111111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i3111111111111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111117) + i3111111111111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i3111111111111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111118) + i3111111111111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i3111111111111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111119) + i3111111111111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i31111111111111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111110) + i31111111111111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i31111111111111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111111) + i31111111111111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i31111111111111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111112) + i31111111111111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i31111111111111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111113) + i31111111111111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i31111111111111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111114) + i31111111111111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i31111111111111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111115) + i31111111111111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            int i31111111111111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111116) + i31111111111111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue17 << i28) ^ (jLongValue17 >> c7));
                                            int i31111111111111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111117) + i31111111111111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iW3 = C0427l.W((jLongValue18 << i28) ^ (jLongValue18 >> c7));
                                    it = it;
                                    i8 = iW3 + iU19;
                                    iU11 = C0427l.U(i18);
                                    o0Var = e6.f6791b;
                                    if (o0Var == n0Var) {
                                        iU11 *= 2;
                                    }
                                    switch (o0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iW4 = 8;
                                            int i31111111111111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111118) + i31111111111111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iW4 = 4;
                                            int i31111111111111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i31111111111111111111111111111119) + i31111111111111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 2:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111111111111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111110) + i311111111111111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 3:
                                            iW4 = C0427l.W(((Long) value).longValue());
                                            int i311111111111111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111111) + i311111111111111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 4:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i311111111111111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111112) + i311111111111111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i311111111111111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111113) + i311111111111111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i311111111111111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111114) + i311111111111111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iW4 = i28;
                                            int i311111111111111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111115) + i311111111111111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                                iW4 = size4 + iV4;
                                            } else {
                                                iW4 = C0427l.T((String) value);
                                            }
                                            int i311111111111111111111111111111116 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111116) + i311111111111111111111111111111116 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 9:
                                            iW4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            int i311111111111111111111111111111117 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111117) + i311111111111111111111111111111117 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0436v) ((AbstractC0416a) value)).a(null);
                                            iV4 = C0427l.V(size4);
                                            iW4 = size4 + iV4;
                                            int i311111111111111111111111111111118 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111118) + i311111111111111111111111111111118 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 11:
                                            if (value instanceof C0422g) {
                                                size4 = ((C0422g) value).size();
                                                iV4 = C0427l.V(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iV4 = C0427l.V(size4);
                                            }
                                            iW4 = size4 + iV4;
                                            int i311111111111111111111111111111119 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i311111111111111111111111111111119) + i311111111111111111111111111111119 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 12:
                                            iW4 = C0427l.V(((Integer) value).intValue());
                                            int i3111111111111111111111111111111110 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111111110) + i3111111111111111111111111111111110 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 13:
                                            iW4 = C0427l.W(((Integer) value).intValue());
                                            int i3111111111111111111111111111111111 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111111111) + i3111111111111111111111111111111111 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iW4 = 4;
                                            int i3111111111111111111111111111111112 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111111112) + i3111111111111111111111111111111112 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iW4 = 8;
                                            int i3111111111111111111111111111111113 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111111113) + i3111111111111111111111111111111113 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iW4 = C0427l.V((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            int i3111111111111111111111111111111114 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111111114) + i3111111111111111111111111111111114 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iW4 = C0427l.W((jLongValue19 << i28) ^ (jLongValue19 >> c7));
                                            int i3111111111111111111111111111111115 = iW4 + iU11 + i8;
                                            iV2 += C0427l.V(i3111111111111111111111111111111115) + i3111111111111111111111111111111115 + iU18;
                                            it = it;
                                            c6 = c7;
                                            i10 = i28;
                                            i12 = i30;
                                            i14 = i31;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i3 = i12;
                    i6 = i14;
                    i10 = i10;
                    iS2 += iV2;
                    i12 = i3;
                    i14 = i6;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 51:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        iU12 = C0427l.U(i15);
                        iU16 = iU12 + 8;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 52:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        iU13 = C0427l.U(i15);
                        iU16 = iU13 + 4;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 53:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        long jA = A(j4, abstractC0436v2);
                        iU14 = C0427l.U(i15);
                        iW5 = C0427l.W(jA);
                        iU16 = iW5 + iU14;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 54:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        long jA2 = A(j4, abstractC0436v2);
                        iU14 = C0427l.U(i15);
                        iW5 = C0427l.W(jA2);
                        iU16 = iW5 + iU14;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 55:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        int iZ = z(j4, abstractC0436v2);
                        iU15 = C0427l.U(i15);
                        iW6 = C0427l.W(iZ);
                        iU16 = iW6 + iU15;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 56:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        iU12 = C0427l.U(i15);
                        iU16 = iU12 + 8;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 57:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        iU13 = C0427l.U(i15);
                        iU16 = iU13 + 4;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 58:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        iU16 = C0427l.U(i15) + i10;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 59:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        Object object4 = unsafe.getObject(abstractC0436v2, j4);
                        iS2 = (object4 instanceof C0422g ? C0427l.S(i15, (C0422g) object4) : C0427l.T((String) object4) + C0427l.U(i15)) + iS2;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 60:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        Object object5 = unsafe.getObject(abstractC0436v2, j4);
                        V vM4 = l6.m(i13);
                        Class cls21 = W.f6827a;
                        int iU20 = C0427l.U(i15);
                        int iA5 = ((AbstractC0416a) object5).a(vM4);
                        iV5 = C0427l.V(iA5) + iA5 + iU20;
                        iS2 += iV5;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 61:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        iU16 = C0427l.S(i15, (C0422g) unsafe.getObject(abstractC0436v2, j4));
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 62:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        int iZ2 = z(j4, abstractC0436v2);
                        iU15 = C0427l.U(i15);
                        iW6 = C0427l.V(iZ2);
                        iU16 = iW6 + iU15;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 63:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        int iZ3 = z(j4, abstractC0436v2);
                        iU15 = C0427l.U(i15);
                        iW6 = C0427l.W(iZ3);
                        iU16 = iW6 + iU15;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 64:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        iU13 = C0427l.U(i15);
                        iU16 = iU13 + 4;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 65:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        iU12 = C0427l.U(i15);
                        iU16 = iU12 + 8;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 66:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        int iZ4 = z(j4, abstractC0436v2);
                        iU15 = C0427l.U(i15);
                        iW6 = C0427l.V((iZ4 >> 31) ^ (iZ4 << 1));
                        iU16 = iW6 + iU15;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 67:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        long jA3 = A(j4, abstractC0436v2);
                        iV5 = C0427l.W((jA3 >> 63) ^ (jA3 << i10)) + C0427l.U(i15);
                        iS2 += iV5;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 68:
                    if (l6.q(i15, i13, abstractC0436v2)) {
                        AbstractC0416a abstractC0416a = (AbstractC0416a) unsafe.getObject(abstractC0436v2, j4);
                        V vM5 = l6.m(i13);
                        iU14 = C0427l.U(i15) * 2;
                        iW5 = abstractC0416a.a(vM5);
                        iU16 = iW5 + iU14;
                        iS2 += iU16;
                    }
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                default:
                    i10 = i10;
                    i13 += 3;
                    i9 = i18;
                    i10 = i10;
                    i11 = 1048575;
                    break;
            }
        }
    }

    public final boolean j(AbstractC0436v abstractC0436v, AbstractC0436v abstractC0436v2, int i) {
        return n(i, abstractC0436v) == n(i, abstractC0436v2);
    }

    public final void k(Object obj, int i, Object obj2) {
        int i3 = this.f6801a[i];
        if (i0.f6876c.h(M(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.f6802b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final V m(int i) {
        int i3 = (i / 3) * 2;
        Object[] objArr = this.f6802b;
        V v6 = (V) objArr[i3];
        if (v6 != null) {
            return v6;
        }
        V vA = S.f6818c.a((Class) objArr[i3 + 1]);
        objArr[i3] = vA;
        return vA;
    }

    public final boolean n(int i, Object obj) {
        int i3 = this.f6801a[i + 2];
        long j4 = i3 & 1048575;
        if (j4 == 1048575) {
            int iM = M(i);
            long j6 = iM & 1048575;
            switch (L(iM)) {
                case 0:
                    if (Double.doubleToRawLongBits(i0.f6876c.d(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(i0.f6876c.e(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (i0.f6876c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (i0.f6876c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (i0.f6876c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (i0.f6876c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (i0.f6876c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return i0.f6876c.c(j6, obj);
                case 8:
                    Object objH = i0.f6876c.h(j6, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof C0422g) {
                        return !C0422g.f6857j.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (i0.f6876c.h(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0422g.f6857j.equals(i0.f6876c.h(j6, obj));
                case 11:
                    if (i0.f6876c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (i0.f6876c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (i0.f6876c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (i0.f6876c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (i0.f6876c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (i0.f6876c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    if (i0.f6876c.h(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i3 >>> 20)) & i0.f6876c.f(j4, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i, int i3, int i6, int i7) {
        if (i3 == 1048575) {
            return n(i, obj);
        }
        return (i6 & i7) != 0;
    }

    public final boolean q(int i, int i3, Object obj) {
        return i0.f6876c.f((long) (this.f6801a[i3 + 2] & 1048575), obj) == i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void r(androidx.datastore.preferences.protobuf.b0 r19, java.lang.Object r20, androidx.datastore.preferences.protobuf.C0426k r21, androidx.datastore.preferences.protobuf.C0429n r22) {
        /*
            Method dump skipped, instruction units count: 1796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.r(androidx.datastore.preferences.protobuf.b0, java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.n):void");
    }

    public final void s(Object obj, int i, Object obj2, C0429n c0429n, C0426k c0426k) throws InvalidProtocolBufferException.InvalidWireTypeException {
        long jM = M(i) & 1048575;
        Object objH = i0.f6876c.h(jM, obj);
        H h6 = this.f6812m;
        if (objH == null) {
            h6.getClass();
            objH = G.i.b();
            i0.o(jM, obj, objH);
        } else {
            h6.getClass();
            if (!((G) objH).f6794h) {
                G gB = G.i.b();
                H.a(gB, objH);
                i0.o(jM, obj, gB);
                objH = gB;
            }
        }
        h6.getClass();
        G g6 = (G) objH;
        E e6 = ((F) obj2).f6793a;
        c0426k.w(2);
        AbstractC0425j abstractC0425j = c0426k.f6884a;
        int iE = abstractC0425j.e(abstractC0425j.v());
        Object objI = "";
        p108u1.i iVar = e6.f6792c;
        Object objI2 = iVar;
        while (true) {
            try {
                int iA = c0426k.a();
                if (iA == Integer.MAX_VALUE || abstractC0425j.c()) {
                    break;
                }
                if (iA == 1) {
                    objI = c0426k.i(e6.f6790a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!c0426k.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!c0426k.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = c0426k.i(e6.f6791b, iVar.getClass(), c0429n);
                }
            } catch (Throwable th) {
                abstractC0425j.d(iE);
                throw th;
            }
        }
        g6.put(objI, objI2);
        abstractC0425j.d(iE);
    }

    public final void t(Object obj, int i, Object obj2) {
        if (n(i, obj2)) {
            long jM = M(i) & 1048575;
            Unsafe unsafe = f6800o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f6801a[i] + " is present but null: " + obj2);
            }
            V vM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    AbstractC0436v abstractC0436vD = vM.d();
                    vM.a(abstractC0436vD, object);
                    unsafe.putObject(obj, jM, abstractC0436vD);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                H(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0436v abstractC0436vD2 = vM.d();
                vM.a(abstractC0436vD2, object2);
                unsafe.putObject(obj, jM, abstractC0436vD2);
                object2 = abstractC0436vD2;
            }
            vM.a(object2, object);
        }
    }

    public final void u(Object obj, int i, Object obj2) {
        int[] iArr = this.f6801a;
        int i3 = iArr[i];
        if (q(i3, i, obj2)) {
            long jM = M(i) & 1048575;
            Unsafe unsafe = f6800o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            V vM = m(i);
            if (!q(i3, i, obj)) {
                if (p(object)) {
                    AbstractC0436v abstractC0436vD = vM.d();
                    vM.a(abstractC0436vD, object);
                    unsafe.putObject(obj, jM, abstractC0436vD);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                I(i3, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0436v abstractC0436vD2 = vM.d();
                vM.a(abstractC0436vD2, object2);
                unsafe.putObject(obj, jM, abstractC0436vD2);
                object2 = abstractC0436vD2;
            }
            vM.a(object2, object);
        }
    }

    public final Object v(int i, Object obj) {
        V vM = m(i);
        long jM = M(i) & 1048575;
        if (!n(i, obj)) {
            return vM.d();
        }
        Object object = f6800o.getObject(obj, jM);
        if (p(object)) {
            return object;
        }
        AbstractC0436v abstractC0436vD = vM.d();
        if (object != null) {
            vM.a(abstractC0436vD, object);
        }
        return abstractC0436vD;
    }

    public final Object w(int i, int i3, Object obj) {
        V vM = m(i3);
        if (!q(i, i3, obj)) {
            return vM.d();
        }
        Object object = f6800o.getObject(obj, M(i3) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0436v abstractC0436vD = vM.d();
        if (object != null) {
            vM.a(abstractC0436vD, object);
        }
        return abstractC0436vD;
    }
}
