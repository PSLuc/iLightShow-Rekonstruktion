package Z2;

import O1.C0308a;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import h5.AbstractC0723a;
import h5.AbstractC0724b;
import h5.C;
import h5.C0735m;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import p035g0.H;

/* JADX INFO: loaded from: classes.dex */
public final class f implements I1.e, L0.o, N2.b, U2.a, U3.b, q5.r {
    public static f i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6027h;

    public /* synthetic */ f(int i3, boolean z5) {
        this.f6027h = i3;
    }

    public static final boolean a(C c6) {
        C c7 = i5.d.f9600c;
        return !M4.s.P(c6.b(), ".class", true);
    }

    public static final float c(float f6, float[] fArr, float[] fArr2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float fAbs = Math.abs(f6);
        float fSignum = Math.signum(f6);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i3 = -(iBinarySearch + 1);
        int i6 = i3 - 1;
        if (i6 >= fArr.length - 1) {
            float f11 = fArr[fArr.length - 1];
            float f12 = fArr2[fArr.length - 1];
            if (f11 == 0.0f) {
                return 0.0f;
            }
            return (f12 / f11) * f6;
        }
        if (i6 == -1) {
            float f13 = fArr[0];
            f9 = fArr2[0];
            f10 = f13;
            f8 = 0.0f;
            f7 = 0.0f;
        } else {
            float f14 = fArr[i6];
            float f15 = fArr[i3];
            f7 = fArr2[i6];
            f8 = f14;
            f9 = fArr2[i3];
            f10 = f15;
        }
        return (((f9 - f7) * Math.max(0.0f, Math.min(1.0f, f8 == f10 ? 0.0f : (fAbs - f8) / (f10 - f8)))) + f7) * fSignum;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        mac.update(bArr2);
        mac.update((byte) 46);
        return mac.doFinal(bArr3);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e8 A[RETURN] */
    public static C0735m g(String str) {
        char c6;
        int i3;
        char cCharAt;
        char c7 = 'A';
        E4.k.f("<this>", str);
        byte[] bArr = AbstractC0723a.f9338a;
        int length = str.length();
        while (true) {
            c6 = '\t';
            if (length <= 0 || !((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                break;
            }
            length--;
        }
        int i6 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i7 >= length) {
                int i11 = i8 % 4;
                if (i11 != 1) {
                    if (i11 == 2) {
                        bArrCopyOf[i10] = (byte) ((i9 << 12) >> 16);
                        i10 = 1 + i10;
                    } else if (i11 == 3) {
                        int i12 = i9 << 6;
                        int i13 = 1 + i10;
                        bArrCopyOf[i10] = (byte) (i12 >> 16);
                        i10 += 2;
                        bArrCopyOf[i13] = (byte) (i12 >> 8);
                    }
                    if (i10 != i6) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i10);
                        E4.k.e("copyOf(this, newSize)", bArrCopyOf);
                    }
                }
                if (bArrCopyOf != null) {
                    return new C0735m(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i7);
            char c8 = c7;
            if (c7 <= cCharAt2 && cCharAt2 < '[') {
                i3 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i3 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i3 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i3 = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != c6) {
                        break;
                    }
                } else {
                    i3 = 63;
                }
                i7++;
                c7 = c8;
                c6 = '\t';
            }
            int i14 = i3 | (i9 << 6);
            i8++;
            if (i8 % 4 == 0) {
                bArrCopyOf[i10] = (byte) (i14 >> 16);
                int i15 = i10 + 2;
                bArrCopyOf[i10 + 1] = (byte) (i14 >> 8);
                i10 += 3;
                bArrCopyOf[i15] = (byte) i14;
            }
            i9 = i14;
            i7++;
            c7 = c8;
            c6 = '\t';
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new C0735m(bArrCopyOf);
        }
        return null;
    }

    public static C0735m h(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i6 = i3 * 2;
            bArr[i3] = (byte) (i5.b.a(str.charAt(i6 + 1)) + (i5.b.a(str.charAt(i6)) << 4));
        }
        return new C0735m(bArr);
    }

    public static C0735m i(String str) {
        E4.k.f("<this>", str);
        byte[] bytes = str.getBytes(M4.a.f3520a);
        E4.k.e("this as java.lang.String).getBytes(charset)", bytes);
        C0735m c0735m = new C0735m(bytes);
        c0735m.f9354j = str;
        return c0735m;
    }

    public static Font j(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iL = l(fontStyle, font.getStyle());
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font font2 = fontFamily.getFont(i6);
            int iL2 = l(fontStyle, font2.getStyle());
            if (iL2 < iL) {
                font = font2;
                iL = iL2;
            }
        }
        return font;
    }

    public static long k() {
        return p035g0.r.f9078d;
    }

    public static int l(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static long m(float f6, float f7, float f8) {
        int i3 = p035g0.r.f9086m;
        p040h0.q qVar = p040h0.d.f9224c;
        if (0.0f <= f6 && f6 <= 360.0f && 0.0f <= f7 && f7 <= 1.0f && 0.0f <= f8 && f8 <= 1.0f) {
            return H.b(n(5, f6, f7, f8), n(3, f6, f7, f8), n(1, f6, f7, f8), 1.0f, qVar);
        }
        H.q("HSV (" + f6 + ", " + f7 + ", " + f8 + ") must be in range (0..360, 0..1, 0..1)");
        throw null;
    }

    public static float n(int i3, float f6, float f7, float f8) {
        float f9 = ((f6 / 60.0f) + i3) % 6.0f;
        return f8 - (Math.max(0.0f, Math.min(f9, Math.min(4 - f9, 1.0f))) * (f7 * f8));
    }

    public static C0735m o(byte[] bArr) {
        C0735m c0735m = C0735m.f9352k;
        int length = bArr.length;
        AbstractC0724b.e(bArr.length, 0, length);
        return new C0735m(p089q4.k.h0(bArr, 0, length));
    }

    @Override // U3.b
    public Object apply(Object obj) {
        return obj;
    }

    @Override // I1.e
    public void b(int i3, Serializable serializable) {
    }

    @Override // U2.a
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // q5.r
    public Object f(String str) {
        switch (this.f6027h) {
            case 28:
                return new q5.s(str);
            default:
                return new q5.u(new C0308a(str, 9));
        }
    }

    @Override // p079o4.a
    public Object get() {
        return new L2.p(Executors.newSingleThreadExecutor());
    }

    public String toString() {
        switch (this.f6027h) {
            case 14:
                return "EmptyAction";
            case 15:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    public f(JSONObject jSONObject) {
        this.f6027h = 9;
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }

    public f(int i3) {
        this.f6027h = i3;
        switch (i3) {
            case 21:
                new ConcurrentHashMap();
                break;
            default:
                new K0.b();
                break;
        }
    }
}
