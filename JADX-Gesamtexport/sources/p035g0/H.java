package p035g0;

import O1.u;
import S0.i;
import S1.V;
import W2.g;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import p040h0.b;
import p040h0.c;
import p040h0.d;
import p040h0.l;
import p040h0.m;
import p040h0.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9016a = new g(25);

    public static final C0701b a(C0704e c0704e) {
        Canvas canvas = AbstractC0702c.f9059a;
        C0701b c0701b = new C0701b();
        c0701b.f9056a = new Canvas(k(c0704e));
        return c0701b;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x014c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0162  */
    /* JADX WARN: Code duplicated, block: B:113:0x0165  */
    /* JADX WARN: Code duplicated, block: B:115:0x0169  */
    /* JADX WARN: Code duplicated, block: B:116:0x016b A[PHI: r2
  0x016b: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v0 int) binds: [B:123:0x0180, B:115:0x0169, B:111:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:124:0x0182  */
    /* JADX WARN: Code duplicated, block: B:126:0x0188  */
    /* JADX WARN: Code duplicated, block: B:128:0x0191  */
    /* JADX WARN: Code duplicated, block: B:133:0x019e  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:84:0x0108  */
    /* JADX WARN: Code duplicated, block: B:86:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:91:0x011d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0123  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0135  */
    public static final long b(float f6, float f7, float f8, float f9, c cVar) {
        int i;
        int i3;
        int i6;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        float f10;
        int i22 = 31;
        if (cVar.c()) {
            float f11 = f9 < 0.0f ? 0.0f : f9;
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            int i23 = ((int) ((f11 * 255.0f) + 0.5f)) << 24;
            float f12 = f6 < 0.0f ? 0.0f : f6;
            if (f12 > 1.0f) {
                f12 = 1.0f;
            }
            int i24 = i23 | (((int) ((f12 * 255.0f) + 0.5f)) << 16);
            float f13 = f7 < 0.0f ? 0.0f : f7;
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            int i25 = i24 | (((int) ((f13 * 255.0f) + 0.5f)) << 8);
            f10 = f8 >= 0.0f ? f8 : 0.0f;
            long j4 = ((long) (i25 | ((int) (((f10 <= 1.0f ? f10 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i26 = r.f9086m;
            return j4;
        }
        int i27 = b.f9218e;
        if (((int) (cVar.f9220b >> 32)) != 3) {
            q("Color only works with ColorSpaces with 3 components");
            throw null;
        }
        int i28 = cVar.f9221c;
        if (i28 == -1) {
            q("Unknown color space, please use a color space in ColorSpaces");
            throw null;
        }
        float fB3 = cVar.b(0);
        float fA3 = cVar.a(0);
        if (f6 >= fB3) {
            fB3 = f6;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i29 = iFloatToRawIntBits3 >>> 31;
        int i30 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i31 = iFloatToRawIntBits3 & 8388607;
        if (i30 == 255) {
            i3 = i31 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i30 - 112;
            if (i >= 31) {
                i = 49;
                i3 = 0;
            } else {
                if (i > 0) {
                    int i32 = i31 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i6 = (((i << 10) | i32) + 1) | (i29 << 15);
                    } else {
                        i3 = i32;
                    }
                    short s6 = (short) i6;
                    fB = cVar.b(1);
                    fA = cVar.a(1);
                    if (f7 >= fB) {
                        fB = f7;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i7 = iFloatToRawIntBits >>> 31;
                    i8 = (iFloatToRawIntBits >>> 23) & 255;
                    i9 = iFloatToRawIntBits & 8388607;
                    if (i8 == 255) {
                        if (i9 != 0) {
                            i12 = 512;
                        } else {
                            i12 = 0;
                        }
                        i10 = 31;
                    } else {
                        i10 = i8 - 112;
                        if (i10 >= 31) {
                            i10 = 49;
                            i12 = 0;
                        } else {
                            if (i10 <= 0) {
                                i11 = i9 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i13 = (((i10 << 10) | i11) + 1) | (i7 << 15);
                                } else {
                                    i12 = i11;
                                }
                                short s7 = (short) i13;
                                fB2 = cVar.b(2);
                                fA2 = cVar.a(2);
                                if (f8 >= fB2) {
                                    fB2 = f8;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i15 = iFloatToRawIntBits2 >>> 31;
                                i16 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i17 = 8388607 & iFloatToRawIntBits2;
                                if (i16 == 255) {
                                    if (i17 != 0) {
                                        i19 = 512;
                                    } else {
                                        i19 = 0;
                                    }
                                    i20 = (i15 << 15) | (i22 << 10) | i19;
                                } else {
                                    i18 = i16 - 112;
                                    if (i18 >= 31) {
                                        i22 = 49;
                                    } else {
                                        if (i18 <= 0) {
                                            i19 = i17 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i20 = (((i18 << 10) | i19) + 1) | (i15 << 15);
                                            } else {
                                                i22 = i18;
                                            }
                                        } else if (i18 >= -10) {
                                            i21 = (i17 | 8388608) >> (1 - i18);
                                            if ((i21 & 4096) != 0) {
                                                i21 += 8192;
                                            }
                                            i19 = i21 >> 13;
                                            i22 = 0;
                                        } else {
                                            i22 = 0;
                                        }
                                        i20 = (i15 << 15) | (i22 << 10) | i19;
                                    }
                                    i19 = 0;
                                    i20 = (i15 << 15) | (i22 << 10) | i19;
                                }
                                short s8 = (short) i20;
                                f10 = f9 >= 0.0f ? f9 : 0.0f;
                                long j6 = ((((long) ((int) (((f10 <= 1.0f ? f10 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s7) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | (((long) i28) & 63);
                                int i33 = r.f9086m;
                                return j6;
                            }
                            if (i10 >= -10) {
                                i14 = (i9 | 8388608) >> (1 - i10);
                                if ((i14 & 4096) != 0) {
                                    i14 += 8192;
                                }
                                i12 = i14 >> 13;
                            } else {
                                i12 = 0;
                            }
                            i10 = 0;
                        }
                    }
                    i13 = i12 | (i7 << 15) | (i10 << 10);
                    short s9 = (short) i13;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f8 >= fB2) {
                        fB2 = f8;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i15 = iFloatToRawIntBits2 >>> 31;
                    i16 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i17 = 8388607 & iFloatToRawIntBits2;
                    if (i16 == 255) {
                        if (i17 != 0) {
                            i19 = 512;
                        } else {
                            i19 = 0;
                        }
                        i20 = (i15 << 15) | (i22 << 10) | i19;
                    } else {
                        i18 = i16 - 112;
                        if (i18 >= 31) {
                            i22 = 49;
                        } else {
                            if (i18 <= 0) {
                                i19 = i17 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i20 = (((i18 << 10) | i19) + 1) | (i15 << 15);
                                } else {
                                    i22 = i18;
                                }
                            } else if (i18 >= -10) {
                                i21 = (i17 | 8388608) >> (1 - i18);
                                if ((i21 & 4096) != 0) {
                                    i21 += 8192;
                                }
                                i19 = i21 >> 13;
                                i22 = 0;
                            } else {
                                i22 = 0;
                            }
                            i20 = (i15 << 15) | (i22 << 10) | i19;
                        }
                        i19 = 0;
                        i20 = (i15 << 15) | (i22 << 10) | i19;
                    }
                    short s10 = (short) i20;
                    if (f9 >= 0.0f) {
                    }
                    long j7 = ((((long) ((int) (((f10 <= 1.0f ? f10 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | (((long) i28) & 63);
                    int i34 = r.f9086m;
                    return j7;
                }
                if (i >= -10) {
                    int i35 = (i31 | 8388608) >> (1 - i);
                    if ((i35 & 4096) != 0) {
                        i35 += 8192;
                    }
                    i3 = i35 >> 13;
                } else {
                    i3 = 0;
                }
                i = 0;
            }
        }
        i6 = i3 | (i29 << 15) | (i << 10);
        short s11 = (short) i6;
        fB = cVar.b(1);
        fA = cVar.a(1);
        if (f7 >= fB) {
            fB = f7;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i7 = iFloatToRawIntBits >>> 31;
        i8 = (iFloatToRawIntBits >>> 23) & 255;
        i9 = iFloatToRawIntBits & 8388607;
        if (i8 == 255) {
            if (i9 != 0) {
                i12 = 512;
            } else {
                i12 = 0;
            }
            i10 = 31;
        } else {
            i10 = i8 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i12 = 0;
            } else {
                if (i10 <= 0) {
                    i11 = i9 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i13 = (((i10 << 10) | i11) + 1) | (i7 << 15);
                    } else {
                        i12 = i11;
                    }
                    short s12 = (short) i13;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f8 >= fB2) {
                        fB2 = f8;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i15 = iFloatToRawIntBits2 >>> 31;
                    i16 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i17 = 8388607 & iFloatToRawIntBits2;
                    if (i16 == 255) {
                        if (i17 != 0) {
                            i19 = 512;
                        } else {
                            i19 = 0;
                        }
                        i20 = (i15 << 15) | (i22 << 10) | i19;
                    } else {
                        i18 = i16 - 112;
                        if (i18 >= 31) {
                            i22 = 49;
                        } else {
                            if (i18 <= 0) {
                                i19 = i17 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i20 = (((i18 << 10) | i19) + 1) | (i15 << 15);
                                } else {
                                    i22 = i18;
                                }
                            } else if (i18 >= -10) {
                                i21 = (i17 | 8388608) >> (1 - i18);
                                if ((i21 & 4096) != 0) {
                                    i21 += 8192;
                                }
                                i19 = i21 >> 13;
                                i22 = 0;
                            } else {
                                i22 = 0;
                            }
                            i20 = (i15 << 15) | (i22 << 10) | i19;
                        }
                        i19 = 0;
                        i20 = (i15 << 15) | (i22 << 10) | i19;
                    }
                    short s13 = (short) i20;
                    if (f9 >= 0.0f) {
                    }
                    long j8 = ((((long) ((int) (((f10 <= 1.0f ? f10 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s13) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | (((long) i28) & 63);
                    int i36 = r.f9086m;
                    return j8;
                }
                if (i10 >= -10) {
                    i14 = (i9 | 8388608) >> (1 - i10);
                    if ((i14 & 4096) != 0) {
                        i14 += 8192;
                    }
                    i12 = i14 >> 13;
                } else {
                    i12 = 0;
                }
                i10 = 0;
            }
        }
        i13 = i12 | (i7 << 15) | (i10 << 10);
        short s14 = (short) i13;
        fB2 = cVar.b(2);
        fA2 = cVar.a(2);
        if (f8 >= fB2) {
            fB2 = f8;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i15 = iFloatToRawIntBits2 >>> 31;
        i16 = (iFloatToRawIntBits2 >>> 23) & 255;
        i17 = 8388607 & iFloatToRawIntBits2;
        if (i16 == 255) {
            if (i17 != 0) {
                i19 = 512;
            } else {
                i19 = 0;
            }
            i20 = (i15 << 15) | (i22 << 10) | i19;
        } else {
            i18 = i16 - 112;
            if (i18 >= 31) {
                i22 = 49;
            } else {
                if (i18 <= 0) {
                    i19 = i17 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i20 = (((i18 << 10) | i19) + 1) | (i15 << 15);
                    } else {
                        i22 = i18;
                    }
                } else if (i18 >= -10) {
                    i21 = (i17 | 8388608) >> (1 - i18);
                    if ((i21 & 4096) != 0) {
                        i21 += 8192;
                    }
                    i19 = i21 >> 13;
                    i22 = 0;
                } else {
                    i22 = 0;
                }
                i20 = (i15 << 15) | (i22 << 10) | i19;
            }
            i19 = 0;
            i20 = (i15 << 15) | (i22 << 10) | i19;
        }
        short s15 = (short) i20;
        if (f9 >= 0.0f) {
        }
        long j9 = ((((long) ((int) (((f10 <= 1.0f ? f10 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s14) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) s15) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | (((long) i28) & 63);
        int i37 = r.f9086m;
        return j9;
    }

    public static final long c(int i) {
        long j4 = ((long) i) << 32;
        int i3 = r.f9086m;
        return j4;
    }

    public static final long d(long j4) {
        long j6 = j4 << 32;
        int i = r.f9086m;
        return j6;
    }

    public static long e(int i, int i3, int i6) {
        return c(((i & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i6 & 255));
    }

    public static C0704e f(int i, int i3, int i6) {
        q qVar = d.f9224c;
        w(i6);
        return new C0704e(AbstractC0708i.b(i, i3, i6, true, qVar));
    }

    public static final u g() {
        return new u(new Paint(7));
    }

    public static final C0706g h() {
        return new C0706g(new Path());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    public static final long i(float f6, float f7, float f8, float f9, c cVar) {
        int i;
        int i3;
        int i6;
        int iFloatToRawIntBits;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iFloatToRawIntBits2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = 31;
        if (cVar.c()) {
            long j4 = ((long) ((((((int) ((f9 * 255.0f) + 0.5f)) << 24) | (((int) ((f6 * 255.0f) + 0.5f)) << 16)) | (((int) ((f7 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f8) + 0.5f)))) << 32;
            int i22 = r.f9086m;
            return j4;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f6);
        int i23 = iFloatToRawIntBits3 >>> 31;
        int i24 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i25 = iFloatToRawIntBits3 & 8388607;
        int i26 = HueLog.LogComponent.APPCORE;
        int i27 = 0;
        if (i24 == 255) {
            i3 = i25 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i24 - 112;
            if (i >= 31) {
                i = 49;
                i3 = 0;
            } else {
                if (i > 0) {
                    int i28 = i25 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i6 = (((i << 10) | i28) + 1) | (i23 << 15);
                    } else {
                        i3 = i28;
                    }
                    short s6 = (short) i6;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f7);
                    i7 = iFloatToRawIntBits >>> 31;
                    i8 = (iFloatToRawIntBits >>> 23) & 255;
                    i9 = iFloatToRawIntBits & 8388607;
                    if (i8 == 255) {
                        if (i9 != 0) {
                            i12 = 512;
                        } else {
                            i12 = 0;
                        }
                        i10 = 31;
                    } else {
                        i10 = i8 - 112;
                        if (i10 >= 31) {
                            i10 = 49;
                            i12 = 0;
                        } else {
                            if (i10 <= 0) {
                                i11 = i9 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i13 = (((i10 << 10) | i11) + 1) | (i7 << 15);
                                } else {
                                    i12 = i11;
                                }
                                short s7 = (short) i13;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
                                i15 = iFloatToRawIntBits2 >>> 31;
                                i16 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i17 = 8388607 & iFloatToRawIntBits2;
                                if (i16 == 255) {
                                    if (i17 == 0) {
                                        i26 = 0;
                                    }
                                    i27 = i26;
                                } else {
                                    i18 = i16 - 112;
                                    if (i18 >= 31) {
                                        i21 = 49;
                                    } else {
                                        if (i18 <= 0) {
                                            i27 = i17 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i19 = (((i18 << 10) | i27) + 1) | (i15 << 15);
                                            } else {
                                                i21 = i18;
                                            }
                                            long jMax = ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s7) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((short) i19)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f9, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f9221c) & 63);
                                            int i29 = r.f9086m;
                                            return jMax;
                                        }
                                        if (i18 >= -10) {
                                            i20 = (i17 | 8388608) >> (1 - i18);
                                            if ((i20 & 4096) != 0) {
                                                i20 += 8192;
                                            }
                                            i27 = i20 >> 13;
                                            i21 = 0;
                                        } else {
                                            i21 = 0;
                                        }
                                    }
                                }
                                i19 = (i21 << 10) | (i15 << 15) | i27;
                                long jMax2 = ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s7) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((short) i19)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f9, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f9221c) & 63);
                                int i210 = r.f9086m;
                                return jMax2;
                            }
                            if (i10 >= -10) {
                                i14 = (i9 | 8388608) >> (1 - i10);
                                if ((i14 & 4096) != 0) {
                                    i14 += 8192;
                                }
                                i12 = i14 >> 13;
                                i10 = 0;
                            } else {
                                i12 = 0;
                                i10 = 0;
                            }
                        }
                    }
                    i13 = i12 | (i7 << 15) | (i10 << 10);
                    short s8 = (short) i13;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
                    i15 = iFloatToRawIntBits2 >>> 31;
                    i16 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i17 = 8388607 & iFloatToRawIntBits2;
                    if (i16 == 255) {
                        if (i17 == 0) {
                            i26 = 0;
                        }
                        i27 = i26;
                    } else {
                        i18 = i16 - 112;
                        if (i18 >= 31) {
                            i21 = 49;
                        } else {
                            if (i18 <= 0) {
                                i27 = i17 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i18 << 10) | i27) + 1) | (i15 << 15);
                                } else {
                                    i21 = i18;
                                }
                                long jMax3 = ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((short) i19)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f9, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f9221c) & 63);
                                int i211 = r.f9086m;
                                return jMax3;
                            }
                            if (i18 >= -10) {
                                i20 = (i17 | 8388608) >> (1 - i18);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i27 = i20 >> 13;
                                i21 = 0;
                            } else {
                                i21 = 0;
                            }
                        }
                    }
                    i19 = (i21 << 10) | (i15 << 15) | i27;
                    long jMax4 = ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((short) i19)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f9, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f9221c) & 63);
                    int i212 = r.f9086m;
                    return jMax4;
                }
                if (i >= -10) {
                    int i30 = (i25 | 8388608) >> (1 - i);
                    if ((i30 & 4096) != 0) {
                        i30 += 8192;
                    }
                    i3 = i30 >> 13;
                    i = 0;
                } else {
                    i3 = 0;
                    i = 0;
                }
            }
        }
        i6 = i3 | (i23 << 15) | (i << 10);
        short s9 = (short) i6;
        iFloatToRawIntBits = Float.floatToRawIntBits(f7);
        i7 = iFloatToRawIntBits >>> 31;
        i8 = (iFloatToRawIntBits >>> 23) & 255;
        i9 = iFloatToRawIntBits & 8388607;
        if (i8 == 255) {
            if (i9 != 0) {
                i12 = 512;
            } else {
                i12 = 0;
            }
            i10 = 31;
        } else {
            i10 = i8 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i12 = 0;
            } else {
                if (i10 <= 0) {
                    i11 = i9 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i13 = (((i10 << 10) | i11) + 1) | (i7 << 15);
                    } else {
                        i12 = i11;
                    }
                    short s10 = (short) i13;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
                    i15 = iFloatToRawIntBits2 >>> 31;
                    i16 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i17 = 8388607 & iFloatToRawIntBits2;
                    if (i16 == 255) {
                        if (i17 == 0) {
                            i26 = 0;
                        }
                        i27 = i26;
                    } else {
                        i18 = i16 - 112;
                        if (i18 >= 31) {
                            i21 = 49;
                        } else {
                            if (i18 <= 0) {
                                i27 = i17 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i18 << 10) | i27) + 1) | (i15 << 15);
                                } else {
                                    i21 = i18;
                                }
                                long jMax5 = ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((short) i19)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f9, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f9221c) & 63);
                                int i213 = r.f9086m;
                                return jMax5;
                            }
                            if (i18 >= -10) {
                                i20 = (i17 | 8388608) >> (1 - i18);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i27 = i20 >> 13;
                                i21 = 0;
                            } else {
                                i21 = 0;
                            }
                        }
                    }
                    i19 = (i21 << 10) | (i15 << 15) | i27;
                    long jMax6 = ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((short) i19)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f9, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f9221c) & 63);
                    int i214 = r.f9086m;
                    return jMax6;
                }
                if (i10 >= -10) {
                    i14 = (i9 | 8388608) >> (1 - i10);
                    if ((i14 & 4096) != 0) {
                        i14 += 8192;
                    }
                    i12 = i14 >> 13;
                    i10 = 0;
                } else {
                    i12 = 0;
                    i10 = 0;
                }
            }
        }
        i13 = i12 | (i7 << 15) | (i10 << 10);
        short s11 = (short) i13;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
        i15 = iFloatToRawIntBits2 >>> 31;
        i16 = (iFloatToRawIntBits2 >>> 23) & 255;
        i17 = 8388607 & iFloatToRawIntBits2;
        if (i16 == 255) {
            if (i17 == 0) {
                i26 = 0;
            }
            i27 = i26;
        } else {
            i18 = i16 - 112;
            if (i18 >= 31) {
                i21 = 49;
            } else {
                if (i18 <= 0) {
                    i27 = i17 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i19 = (((i18 << 10) | i27) + 1) | (i15 << 15);
                    } else {
                        i21 = i18;
                    }
                    long jMax7 = ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((short) i19)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f9, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f9221c) & 63);
                    int i215 = r.f9086m;
                    return jMax7;
                }
                if (i18 >= -10) {
                    i20 = (i17 | 8388608) >> (1 - i18);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i27 = i20 >> 13;
                    i21 = 0;
                } else {
                    i21 = 0;
                }
            }
        }
        i19 = (i21 << 10) | (i15 << 15) | i27;
        long jMax8 = ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((short) i19)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f9, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f9221c) & 63);
        int i216 = r.f9086m;
        return jMax8;
    }

    public static final float j(float[] fArr, int i, float[] fArr2, int i3) {
        int i6 = i * 4;
        return (fArr[i6 + 3] * fArr2[12 + i3]) + (fArr[i6 + 2] * fArr2[8 + i3]) + (fArr[i6 + 1] * fArr2[4 + i3]) + (fArr[i6] * fArr2[i3]);
    }

    public static final Bitmap k(C0704e c0704e) {
        if (c0704e instanceof C0704e) {
            return c0704e.f9060a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long l(long j4, long j6) {
        float f6;
        float f7;
        long jA = r.a(j4, r.f(j6));
        float fD = r.d(j6);
        float fD2 = r.d(jA);
        float f8 = 1.0f - fD2;
        float f9 = (fD * f8) + fD2;
        float fH = r.h(jA);
        float fH2 = r.h(j6);
        float f10 = 0.0f;
        if (f9 == 0.0f) {
            f6 = 0.0f;
        } else {
            f6 = (((fH2 * fD) * f8) + (fH * fD2)) / f9;
        }
        float fG = r.g(jA);
        float fG2 = r.g(j6);
        if (f9 == 0.0f) {
            f7 = 0.0f;
        } else {
            f7 = (((fG2 * fD) * f8) + (fG * fD2)) / f9;
        }
        float fE = r.e(jA);
        float fE2 = r.e(j6);
        if (f9 != 0.0f) {
            f10 = (((fE2 * fD) * f8) + (fE * fD2)) / f9;
        }
        return i(f6, f7, f10, f9, r.f(j6));
    }

    public static final long m(long j4, long j6, float f6) {
        l lVar = d.f9240t;
        long jA = r.a(j4, lVar);
        long jA2 = r.a(j6, lVar);
        float fD = r.d(jA);
        float fH = r.h(jA);
        float fG = r.g(jA);
        float fE = r.e(jA);
        float fD2 = r.d(jA2);
        float fH2 = r.h(jA2);
        float fG2 = r.g(jA2);
        float fE2 = r.e(jA2);
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        return r.a(i(V.G(fH, fH2, f6), V.G(fG, fG2, f6), V.G(fE, fE2, f6), V.G(fD, fD2, f6), lVar), r.f(j6));
    }

    public static final float n(long j4) {
        c cVarF = r.f(j4);
        if (!b.a(cVarF.f9220b, b.f9214a)) {
            q("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) b.b(cVarF.f9220b)));
            throw null;
        }
        double dH = r.h(j4);
        m mVar = ((q) cVarF).f9276p;
        double dB = mVar.b(dH);
        float fB = (float) ((mVar.b(r.e(j4)) * 0.0722d) + (mVar.b(r.g(j4)) * 0.7152d) + (dB * 0.2126d));
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > 1.0f) {
            return 1.0f;
        }
        return fB;
    }

    public static final void o(Matrix matrix, float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f15;
        fArr[3] = f7;
        fArr[4] = f11;
        fArr[5] = f16;
        fArr[6] = f9;
        fArr[7] = f13;
        fArr[8] = f17;
        matrix.setValues(fArr);
        fArr[0] = f6;
        fArr[1] = f7;
        fArr[2] = f8;
        fArr[3] = f9;
        fArr[4] = f10;
        fArr[5] = f11;
        fArr[6] = f12;
        fArr[7] = f13;
        fArr[8] = f14;
    }

    public static final void p(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        fArr[0] = f6;
        fArr[1] = f9;
        fArr[2] = 0.0f;
        fArr[3] = f12;
        fArr[4] = f7;
        fArr[5] = f10;
        fArr[6] = 0.0f;
        fArr[7] = f13;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f8;
        fArr[13] = f11;
        fArr[14] = 0.0f;
        fArr[15] = f14;
    }

    public static final void q(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final BlendMode r(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Rect s(i iVar) {
        return new Rect(iVar.f4892a, iVar.f4893b, iVar.f4894c, iVar.f4895d);
    }

    public static final Rect t(p030f0.d dVar) {
        return new Rect((int) dVar.f8839a, (int) dVar.f8840b, (int) dVar.f8841c, (int) dVar.f8842d);
    }

    public static final RectF u(p030f0.d dVar) {
        return new RectF(dVar.f8839a, dVar.f8840b, dVar.f8841c, dVar.f8842d);
    }

    public static final int v(long j4) {
        float[] fArr = d.f9222a;
        return (int) (r.a(j4, d.f9224c) >>> 32);
    }

    public static final Bitmap.Config w(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final p030f0.d x(RectF rectF) {
        return new p030f0.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final void y(List list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d A[PHI: r0
  0x000d: PHI (r0v2 float) = (r0v1 float), (r0v0 float) binds: [B:11:0x001c, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public static final int z(float f6, float[] fArr, int i) {
        float f7 = 0.0f;
        if (f6 >= 0.0f) {
            f7 = 1.0f;
            if (f6 > 1.0f) {
                if (f6 <= 1.0000008f) {
                    f6 = f7;
                } else {
                    f6 = Float.NaN;
                }
            }
        } else if (f6 >= -8.34465E-7f) {
            f6 = f7;
        } else {
            f6 = Float.NaN;
        }
        fArr[i] = f6;
        return !Float.isNaN(f6) ? 1 : 0;
    }
}
