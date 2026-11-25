package S1;

import B.C0003b0;
import B.C0005c0;
import B.C0026n;
import B.C0043w;
import L.AbstractC0151k;
import L.J0;
import N.C0208d;
import N.C0222k;
import N.C0227m0;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0203a0;
import N3.C0253a;
import N3.C0254a0;
import N3.C0255b;
import N3.C0257c;
import N3.C0275l;
import N3.C0284p0;
import N3.P0;
import N3.a1;
import N3.d1;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;
import c5.AbstractC0476a0;
import com.google.android.gms.internal.play_billing.AbstractC0586o0;
import com.nanjoran.ilightshow.Services.E0;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import p035g0.C0701b;
import p035g0.C0704e;
import p058l0.C0822e;
import p058l0.C0823f;
import p101t.s0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0704e f4942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0701b f4943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p044i0.b f4944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C0823f f4945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C0823f f4946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C0823f f4947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static long f4948h;
    public static Method i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4949a = 17;

    public static Z.o A(Z.o oVar, s0 s0Var) {
        return Z.a.a(oVar, new androidx.compose.foundation.e(s0Var));
    }

    public static String B(AbstractC0586o0 abstractC0586o0) {
        StringBuilder sb = new StringBuilder(abstractC0586o0.i());
        for (int i3 = 0; i3 < abstractC0586o0.i(); i3++) {
            byte bC = abstractC0586o0.c(i3);
            if (bC == 34) {
                sb.append("\\\"");
            } else if (bC == 39) {
                sb.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bC < 32 || bC > 126) {
                            sb.append('\\');
                            sb.append((char) (((bC >>> 6) & 3) + 48));
                            sb.append((char) (((bC >>> 3) & 7) + 48));
                            sb.append((char) ((bC & 7) + 48));
                        } else {
                            sb.append((char) bC);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void C(int i3, int i6) {
        String strK;
        if (i3 < 0 || i3 >= i6) {
            if (i3 < 0) {
                strK = p006b.a.K("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i6 < 0) {
                    throw new IllegalArgumentException(p012c.k.r(i6, "negative size: "));
                }
                strK = p006b.a.K("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i6));
            }
            throw new IndexOutOfBoundsException(strK);
        }
    }

    public static void D(int i3, int i6) {
        if (i3 < 0 || i3 > i6) {
            throw new IndexOutOfBoundsException(I(i3, "index", i6));
        }
    }

    public static void E(int i3, int i6) {
        String strI;
        if (i3 < 0 || i3 >= i6) {
            if (i3 < 0) {
                strI = p006b.a.I("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i6 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i6);
                    throw new IllegalArgumentException(sb.toString());
                }
                strI = p006b.a.I("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i6));
            }
            throw new IndexOutOfBoundsException(strI);
        }
    }

    public static void F(int i3, int i6, int i7) {
        String strI;
        if (i3 < 0 || i6 < i3 || i6 > i7) {
            if (i3 < 0 || i3 > i7) {
                strI = I(i3, "start index", i7);
            } else {
                strI = (i6 < 0 || i6 > i7) ? I(i6, "end index", i7) : p006b.a.K("end index (%s) must not be less than start index (%s)", Integer.valueOf(i6), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strI);
        }
    }

    public static void G(int i3, int i6, int i7) {
        String strH;
        if (i3 < 0 || i6 < i3 || i6 > i7) {
            if (i3 < 0 || i3 > i7) {
                strH = H(i3, "start index", i7);
            } else {
                strH = (i6 < 0 || i6 > i7) ? H(i6, "end index", i7) : p006b.a.I("end index (%s) must not be less than start index (%s)", Integer.valueOf(i6), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static String H(int i3, String str, int i6) {
        if (i3 < 0) {
            return p006b.a.I("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i6 >= 0) {
            return p006b.a.I("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i6));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 15);
        sb.append("negative size: ");
        sb.append(i6);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String I(int i3, String str, int i6) {
        if (i3 < 0) {
            return p006b.a.K("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i6 >= 0) {
            return p006b.a.K("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i6));
        }
        throw new IllegalArgumentException(p012c.k.r(i6, "negative size: "));
    }

    public static final void a(C0255b c0255b, C0230o c0230o, int i3) {
        c0230o.X(-361453782);
        if ((((c0230o.f(c0255b) ? 32 : 16) | i3) & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            InterfaceC0203a0 interfaceC0203a0N = C0208d.N(c0255b, c0230o);
            c0230o.W(-971159753);
            Object objK = c0230o.K();
            N.U u6 = C0222k.f3714a;
            if (objK == u6) {
                objK = new p018d.c(interfaceC0203a0N);
                c0230o.f0(objK);
            }
            p018d.c cVar = (p018d.c) objK;
            c0230o.p(false);
            c0230o.W(-971159481);
            boolean zF = c0230o.f(cVar) | c0230o.g(true);
            Object objK2 = c0230o.K();
            if (zF || objK2 == u6) {
                objK2 = new C0043w(28, cVar);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            C0208d.g((D4.a) objK2, c0230o);
            p012c.E eA = p018d.f.a(c0230o);
            if (eA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            p012c.D dA = eA.a();
            InterfaceC0458s interfaceC0458s = (InterfaceC0458s) c0230o.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            c0230o.W(-971159120);
            boolean zF2 = c0230o.f(dA) | c0230o.f(interfaceC0458s) | c0230o.f(cVar);
            Object objK3 = c0230o.K();
            if (zF2 || objK3 == u6) {
                objK3 = new C0026n(dA, interfaceC0458s, cVar, 6);
                c0230o.f0(objK3);
            }
            c0230o.p(false);
            C0208d.d(interfaceC0458s, dA, (D4.c) objK3, c0230o);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0003b0(i3, 17, c0255b);
        }
    }

    public static final void b(int i3, C0230o c0230o) {
        F1.I i6;
        InterfaceC0203a0 interfaceC0203a0;
        boolean z5;
        C0230o c0230o2 = c0230o;
        c0230o2.X(71614578);
        if (i3 == 0 && c0230o2.B()) {
            c0230o2.P();
        } else {
            F1.I i7 = (F1.I) c0230o2.k(P0.f4083b);
            c0230o2.V(642465758);
            Object objK = c0230o2.K();
            N.U u6 = C0222k.f3714a;
            if (objK == u6) {
                objK = C0208d.K(Boolean.FALSE, N.U.f3673m);
                c0230o2.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a1 = (InterfaceC0203a0) objK;
            c0230o2.p(false);
            c0230o2.V(642467510);
            if (((Boolean) interfaceC0203a1.getValue()).booleanValue()) {
                c0230o2.V(642469035);
                Object objK2 = c0230o2.K();
                if (objK2 == u6) {
                    objK2 = new C0275l(10, interfaceC0203a1);
                    c0230o2.f0(objK2);
                }
                c0230o2.p(false);
                z5 = false;
                interfaceC0203a0 = interfaceC0203a1;
                i6 = i7;
                AbstractC0151k.a((D4.a) objK2, V.b.c(-783885307, new C0254a0(3, interfaceC0203a1), c0230o2), null, null, N3.D.f3941b, N3.D.f3942c, null, 0L, 0L, 0L, 0L, 0.0f, null, c0230o, 1769526, 16284);
                c0230o2 = c0230o;
            } else {
                i6 = i7;
                interfaceC0203a0 = interfaceC0203a1;
                z5 = false;
            }
            c0230o2.p(z5);
            C0208d.c(p084p4.x.f10867a, new defpackage.d(6), c0230o2);
            F1.I i8 = i6;
            J0.b(null, V.b.c(2133340470, new C0257c(i8, 6), c0230o2), null, null, null, 0, 0L, 0L, null, V.b.c(1622994177, new C0284p0(i8, interfaceC0203a0), c0230o2), c0230o2, 805306416, 509);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0253a(i3, 5);
        }
    }

    public static final long c(int i3, int i6) {
        return (((long) i6) & 4294967295L) | (((long) i3) << 32);
    }

    public static final void d(final boolean z5, boolean z6, C0230o c0230o, final int i3, final int i6) {
        int i7;
        final boolean z7;
        int i8;
        O1.h hVarA;
        c0230o.X(1454518758);
        if ((i3 & 14) == 0) {
            i7 = (c0230o.g(z5) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i9 = i6 & 2;
        if (i9 != 0) {
            i8 = i7 | 48;
            z7 = z6;
        } else {
            z7 = z6;
            i8 = i7 | (c0230o.g(z7) ? 32 : 16);
        }
        if ((i8 & 91) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            boolean z8 = i9 != 0 ? false : z7;
            F1.I i10 = (F1.I) c0230o.k(P0.f4083b);
            Context context = (Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b);
            E0 e6 = E0.f8249o;
            O1.i iVar = e6.f8250h;
            String str = (iVar == null || (hVarA = iVar.a()) == null) ? null : hVarA.f4496a;
            C0208d.e(new a1(i10, null), c0230o, e6.a());
            a(new C0255b(i10, 27), c0230o, 6);
            J0.b(null, N3.S.f4094a, null, null, null, 0, 0L, 0L, null, V.b.c(1502926135, new d1(z8, z5, i10, context, str), c0230o), c0230o, 805306416, 509);
            z7 = z8;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new D4.e() { // from class: N3.Z0
                @Override // D4.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = C0208d.V(i3 | 1);
                    boolean z9 = z7;
                    int i11 = i6;
                    S1.h0.d(z5, z9, (C0230o) obj, iV, i11);
                    return p084p4.x.f10867a;
                }
            };
        }
    }

    public static final void e(G2.a aVar, EnumC0453m enumC0453m, C0230o c0230o, int i3) {
        E4.k.f("permissionState", aVar);
        c0230o.X(-1770945943);
        if ((((c0230o.f(aVar) ? 4 : 2) | i3 | 48) & 91) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            enumC0453m = EnumC0453m.ON_RESUME;
            c0230o.W(1157296644);
            boolean zF = c0230o.f(aVar);
            Object objK = c0230o.K();
            if (zF || objK == C0222k.f3714a) {
                objK = new G2.f(enumC0453m, 0, aVar);
                c0230o.f0(objK);
            }
            c0230o.p(false);
            InterfaceC0457q interfaceC0457q = (InterfaceC0457q) objK;
            C0460u c0460uF = ((InterfaceC0458s) c0230o.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).f();
            E4.k.e("LocalLifecycleOwner.current.lifecycle", c0460uF);
            C0208d.d(c0460uF, interfaceC0457q, new C0005c0(c0460uF, 13, interfaceC0457q), c0230o);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T == null) {
            return;
        }
        c0235q0T.f3780d = new A2.d(i3, 6, aVar, enumC0453m);
    }

    public static final long f(float f6, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static final boolean g(String str) {
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (E4.k.h(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final void h(X.s sVar, List list) {
        sVar.clear();
        sVar.addAll(list);
    }

    public static final void i(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                p081p0.c.D(th, th2);
            }
        }
    }

    public static void j(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static final void k(Y4.c cVar, b5.a aVar, String str) {
        E4.k.f("<this>", cVar);
        aVar.c().getClass();
        K4.b bVar = cVar.f5923a;
        E4.k.f("baseClass", bVar);
        E4.z.e(1, null);
        AbstractC0476a0.k(str, bVar);
        throw null;
    }

    public static final void l(Y4.c cVar, p081p0.c cVar2, Object obj) {
        E4.k.f("<this>", cVar);
        E4.k.f("value", obj);
        cVar2.c().getClass();
        K4.b bVar = cVar.f5923a;
        E4.k.f("baseClass", bVar);
        if (((E4.f) bVar).c(obj)) {
            E4.z.e(1, null);
        }
        E4.f fVarA = E4.x.a(obj.getClass());
        String strB = fVarA.b();
        if (strB == null) {
            strB = String.valueOf(fVarA);
        }
        AbstractC0476a0.k(strB, bVar);
        throw null;
    }

    public static p111u4.g m(p111u4.g gVar, p111u4.h hVar) {
        E4.k.f("key", hVar);
        if (E4.k.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static final long n(long j4) {
        if (j4 != 9205357640488583168L) {
            return p081p0.c.y(Float.intBitsToFloat((int) (j4 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j4 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final C0823f o() {
        C0823f c0823f = f4945e;
        if (c0823f != null) {
            return c0823f;
        }
        C0822e c0822e = new C0822e("Filled.DeleteForever", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i3 = p058l0.G.f10217a;
        p035g0.O o6 = new p035g0.O(p035g0.r.f9076b);
        C0227m0 c0227m0 = new C0227m0(2);
        c0227m0.i(6.0f, 19.0f);
        c0227m0.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c0227m0.f(8.0f);
        c0227m0.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c0227m0.g(18.0f, 7.0f);
        c0227m0.g(6.0f, 7.0f);
        c0227m0.n(12.0f);
        c0227m0.b();
        c0227m0.i(8.46f, 11.88f);
        c0227m0.h(1.41f, -1.41f);
        c0227m0.g(12.0f, 12.59f);
        c0227m0.h(2.12f, -2.12f);
        c0227m0.h(1.41f, 1.41f);
        c0227m0.g(13.41f, 14.0f);
        c0227m0.h(2.12f, 2.12f);
        c0227m0.h(-1.41f, 1.41f);
        c0227m0.g(12.0f, 15.41f);
        c0227m0.h(-2.12f, 2.12f);
        c0227m0.h(-1.41f, -1.41f);
        c0227m0.g(10.59f, 14.0f);
        c0227m0.h(-2.13f, -2.12f);
        c0227m0.b();
        c0227m0.i(15.5f, 4.0f);
        c0227m0.h(-1.0f, -1.0f);
        c0227m0.f(-5.0f);
        c0227m0.h(-1.0f, 1.0f);
        c0227m0.g(5.0f, 4.0f);
        c0227m0.n(2.0f);
        c0227m0.f(14.0f);
        c0227m0.g(19.0f, 4.0f);
        c0227m0.b();
        C0822e.a(c0822e, c0227m0.f3729h, o6);
        C0823f c0823fB = c0822e.b();
        f4945e = c0823fB;
        return c0823fB;
    }

    public static String p(Class cls) {
        LinkedHashMap linkedHashMap = F1.V.f1329b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            F1.T t6 = (F1.T) cls.getAnnotation(F1.T.class);
            strValue = t6 != null ? t6.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        E4.k.c(strValue);
        return strValue;
    }

    public static Object q(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return p025e1.d.a(bundle, str, p029f.a.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (p029f.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final defpackage.k r(D3.a aVar) {
        E4.k.f("hsv", aVar);
        double d6 = ((double) aVar.f761a) / 65535.0d;
        double d7 = ((double) aVar.f762b) / 255.0d;
        double d8 = ((double) aVar.f763c) / 255.0d;
        double d9 = d6 * ((double) 6);
        double dFloor = Math.floor(d9);
        double d10 = d9 - dFloor;
        double d11 = 1;
        double d12 = (d11 - d7) * d8;
        double d13 = (d11 - (d10 * d7)) * d8;
        double d14 = (d11 - ((d11 - d10) * d7)) * d8;
        int i3 = ((int) dFloor) % 6;
        if (i3 == 0) {
            return new defpackage.k(d8, d14, d12);
        }
        if (i3 == 1) {
            return new defpackage.k(d13, d8, d12);
        }
        if (i3 == 2) {
            return new defpackage.k(d12, d8, d14);
        }
        if (i3 == 3) {
            return new defpackage.k(d12, d13, d8);
        }
        if (i3 != 4) {
            return i3 != 5 ? new defpackage.k(0.0d, 0.0d, 0.0d) : new defpackage.k(d8, d12, d13);
        }
        return new defpackage.k(d14, d12, d8);
    }

    public static boolean s() {
        try {
            if (i == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (i == null) {
                f4948h = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                i = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) i.invoke(null, Long.valueOf(f4948h))).booleanValue();
        } catch (Exception e6) {
            if (!(e6 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static p111u4.i t(p111u4.g gVar, p111u4.h hVar) {
        E4.k.f("key", hVar);
        return E4.k.a(gVar.getKey(), hVar) ? p111u4.j.f12751h : gVar;
    }

    public static p111u4.i u(p111u4.g gVar, p111u4.i iVar) {
        E4.k.f("context", iVar);
        return iVar == p111u4.j.f12751h ? gVar : (p111u4.i) iVar.T(gVar, p111u4.b.f12747j);
    }

    public static final s0 v(C0230o c0230o) {
        int i3 = 0;
        Object[] objArr = new Object[0];
        D.x xVar = s0.i;
        boolean zD = c0230o.d(0);
        Object objK = c0230o.K();
        if (zD || objK == C0222k.f3714a) {
            objK = new p101t.Z(i3, 2);
            c0230o.f0(objK);
        }
        return (s0) p020d2.n.H(objArr, xVar, (D4.a) objK, c0230o, 0, 4);
    }

    public static final long w(long j4) {
        int iRound = Math.round(p030f0.c.d(j4));
        return (((long) Math.round(p030f0.c.e(j4))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static void x(EditorInfo editorInfo, CharSequence charSequence) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            p064m1.a.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i3 >= 30) {
            p064m1.a.a(editorInfo, charSequence);
            return;
        }
        int i6 = editorInfo.initialSelStart;
        int i7 = editorInfo.initialSelEnd;
        int i8 = i6 > i7 ? i7 : i6;
        if (i6 <= i7) {
            i6 = i7;
        }
        int length = charSequence.length();
        if (i8 < 0 || i6 > length) {
            y(editorInfo, null, 0, 0);
            return;
        }
        int i9 = editorInfo.inputType & 4095;
        if (i9 == 129 || i9 == 225 || i9 == 18) {
            y(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            y(editorInfo, charSequence, i8, i6);
            return;
        }
        int i10 = i6 - i8;
        int i11 = i10 > 1024 ? 0 : i10;
        int i12 = 2048 - i11;
        int iMin = Math.min(charSequence.length() - i6, i12 - Math.min(i8, (int) (((double) i12) * 0.8d)));
        int iMin2 = Math.min(i8, i12 - iMin);
        int i13 = i8 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i13))) {
            i13++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i6 + iMin) - 1))) {
            iMin--;
        }
        int i14 = iMin2 + i11;
        y(editorInfo, i11 != i10 ? TextUtils.concat(charSequence.subSequence(i13, i13 + iMin2), charSequence.subSequence(i6, iMin + i6)) : charSequence.subSequence(i13, i14 + iMin + i13), iMin2, i14);
    }

    public static void y(EditorInfo editorInfo, CharSequence charSequence, int i3, int i6) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i3);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i6);
    }

    public static final double z(long j4) {
        return ((j4 >>> 11) * ((double) 2048)) + (j4 & 2047);
    }

    public int hashCode() {
        switch (this.f4949a) {
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f4949a) {
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                String strB = E4.x.a(getClass()).b();
                E4.k.c(strB);
                return strB;
            default:
                return super.toString();
        }
    }
}
