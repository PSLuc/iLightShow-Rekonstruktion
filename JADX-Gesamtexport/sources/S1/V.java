package S1;

import B.AbstractC0013g0;
import B.C0005c0;
import B.C0025m0;
import B.C0031p0;
import B.C0039u;
import B.F0;
import B.d1;
import B.k1;
import F.C0061c;
import F.C0062d;
import F.C0063e;
import F.C0064f;
import F.C0069k;
import F.InterfaceC0070l;
import F1.C0096m;
import F1.C0098o;
import F1.C0100q;
import F1.C0102t;
import F1.C0103u;
import L.AbstractC0151k;
import L.J0;
import L.e2;
import N.C0208d;
import N.C0209d0;
import N.C0222k;
import N.C0227m0;
import N.C0230o;
import N.C0235q0;
import N.C0247x;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import N.V0;
import N3.AbstractC0274k0;
import N3.B0;
import N3.C0253a;
import N3.C0254a0;
import N3.C0257c;
import N3.C0258c0;
import N3.C0260d0;
import N3.C0262e0;
import N3.C0264f0;
import N3.C0268h0;
import N3.C0272j0;
import N3.C0273k;
import N3.C0275l;
import N3.M0;
import N3.P0;
import N3.Y0;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0458s;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.AbstractC0665d0;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Views.HomeScreenRoute;
import com.nanjoran.ilightshow.Views.PaletteEditorRoute;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.philips.lighting.hue.sdk.wrapper.domain.ClipAttribute;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import okhttp3.internal.http2.Http2;
import p035g0.C0701b;
import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.InterfaceC0714o;
import p058l0.AbstractC0819b;
import p058l0.C0822e;
import p058l0.C0823f;
import p058l0.C0827j;
import p092r1.C0883d;
import p092r1.C0885f;
import p092r1.C0889j;
import p096s.o0;
import p096s.r0;
import p096s.t0;
import p096s.u0;
import p113v0.C1025h;
import p113v0.C1026i;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;
import p130y0.G0;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C0823f f4923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0823f f4924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0823f f4925c;

    public static final C0823f A() {
        C0823f c0823f = f4923a;
        if (c0823f != null) {
            return c0823f;
        }
        C0822e c0822e = new C0822e("Filled.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = p058l0.G.f10217a;
        p035g0.O o6 = new p035g0.O(p035g0.r.f9076b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new p058l0.n(10.0f, 6.0f));
        arrayList.add(new p058l0.m(8.59f, 7.41f));
        arrayList.add(new p058l0.m(13.17f, 12.0f));
        arrayList.add(new p058l0.u(-4.58f, 4.59f));
        arrayList.add(new p058l0.m(10.0f, 18.0f));
        arrayList.add(new p058l0.u(6.0f, -6.0f));
        arrayList.add(C0827j.f10318c);
        C0822e.a(c0822e, arrayList, o6);
        C0823f c0823fB = c0822e.b();
        f4923a = c0823fB;
        return c0823fB;
    }

    public static Intent B(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strC = C(context, componentName);
        if (strC == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strC);
        return C(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String C(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final C0823f D() {
        C0823f c0823f = f4925c;
        if (c0823f != null) {
            return c0823f;
        }
        C0822e c0822e = new C0822e("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = p058l0.G.f10217a;
        p035g0.O o6 = new p035g0.O(p035g0.r.f9076b);
        C0227m0 c0227m0 = new C0227m0(2);
        c0227m0.i(1.0f, 21.0f);
        c0227m0.f(22.0f);
        c0227m0.g(12.0f, 2.0f);
        c0227m0.g(1.0f, 21.0f);
        c0227m0.b();
        c0227m0.i(13.0f, 18.0f);
        c0227m0.f(-2.0f);
        c0227m0.n(-2.0f);
        c0227m0.f(2.0f);
        c0227m0.n(2.0f);
        c0227m0.b();
        c0227m0.i(13.0f, 14.0f);
        c0227m0.f(-2.0f);
        c0227m0.n(-4.0f);
        c0227m0.f(2.0f);
        c0227m0.n(4.0f);
        c0227m0.b();
        C0822e.a(c0822e, c0227m0.f3729h, o6);
        C0823f c0823fB = c0822e.b();
        f4925c = c0823fB;
        return c0823fB;
    }

    public static final boolean E(p030f0.e eVar) {
        float fB = p030f0.a.b(eVar.f8847e);
        long j4 = eVar.f8847e;
        if (fB != p030f0.a.c(j4)) {
            return false;
        }
        float fB2 = p030f0.a.b(j4);
        long j6 = eVar.f8848f;
        if (fB2 != p030f0.a.b(j6) || p030f0.a.b(j4) != p030f0.a.c(j6)) {
            return false;
        }
        float fB3 = p030f0.a.b(j4);
        long j7 = eVar.f8849g;
        if (fB3 != p030f0.a.b(j7) || p030f0.a.b(j4) != p030f0.a.c(j7)) {
            return false;
        }
        float fB4 = p030f0.a.b(j4);
        long j8 = eVar.f8850h;
        return fB4 == p030f0.a.b(j8) && p030f0.a.b(j4) == p030f0.a.c(j8);
    }

    public static boolean F(char c6) {
        return Character.isWhitespace(c6) || Character.isSpaceChar(c6);
    }

    public static final float G(float f6, float f7, float f8) {
        return (f8 * f7) + ((1 - f8) * f6);
    }

    public static final int H(float f6, int i, int i3) {
        return i + ((int) Math.round(((double) (i3 - i)) * ((double) f6)));
    }

    public static final p018d.g I(g.a aVar, D4.c cVar, C0230o c0230o, int i) {
        Object obj;
        c0230o.W(-1408504823);
        C0208d.N(aVar, c0230o);
        Object objN = C0208d.N(cVar, c0230o);
        Object obj2 = (String) p020d2.n.H(new Object[0], null, p018d.b.i, c0230o, 3072, 6);
        C0247x c0247x = p018d.e.f8555a;
        c0230o.W(1418020823);
        p029f.h hVar = (p029f.h) c0230o.k(p018d.e.f8555a);
        if (hVar == null) {
            Object baseContext = (Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof p029f.h) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            hVar = (p029f.h) baseContext;
        }
        c0230o.p(false);
        if (hVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        p012c.n nVar = (p012c.n) hVar;
        c0230o.W(-1672765924);
        Object objK = c0230o.K();
        Object obj3 = C0222k.f3714a;
        if (objK == obj3) {
            objK = new p018d.a();
            c0230o.f0(objK);
        }
        p018d.a aVar2 = (p018d.a) objK;
        c0230o.p(false);
        c0230o.W(-1672765850);
        Object objK2 = c0230o.K();
        if (objK2 == obj3) {
            objK2 = new p018d.g(aVar2);
            c0230o.f0(objK2);
        }
        p018d.g gVar = (p018d.g) objK2;
        c0230o.p(false);
        c0230o.W(-1672765582);
        boolean zF = c0230o.f(aVar2);
        Object obj4 = nVar.f7163p;
        boolean zF2 = c0230o.f(obj4) | zF | c0230o.f(obj2) | c0230o.f(aVar) | c0230o.f(objN);
        Object objK3 = c0230o.K();
        if (zF2 || objK3 == obj3) {
            obj = aVar;
            objK3 = new F0(aVar2, obj4, obj2, obj, objN, 5);
            c0230o.f0(objK3);
        } else {
            obj = aVar;
        }
        D4.c cVar2 = (D4.c) objK3;
        c0230o.p(false);
        boolean zF3 = c0230o.f(obj4) | c0230o.f(obj2) | c0230o.f(obj);
        Object objK4 = c0230o.K();
        if (zF3 || objK4 == obj3) {
            objK4 = new N.E(cVar2);
            c0230o.f0(objK4);
        }
        c0230o.p(false);
        return gVar;
    }

    public static final float J(long j4, float f6, S0.b bVar) {
        float fC;
        long jB = S0.m.b(j4);
        if (S0.n.a(jB, 4294967296L)) {
            if (bVar.n() <= 1.05d) {
                return bVar.V(j4);
            }
            fC = S0.m.c(j4) / S0.m.c(bVar.b0(f6));
        } else {
            if (!S0.n.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = S0.m.c(j4);
        }
        return fC * f6;
    }

    public static final void K(Spannable spannable, long j4, int i, int i3) {
        if (j4 != 16) {
            spannable.setSpan(new ForegroundColorSpan(p035g0.H.v(j4)), i, i3, 33);
        }
    }

    public static final void L(Spannable spannable, long j4, S0.b bVar, int i, int i3) {
        long jB = S0.m.b(j4);
        if (S0.n.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(G4.a.D(bVar.V(j4)), false), i, i3, 33);
        } else if (S0.n.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(S0.m.c(j4)), i, i3, 33);
        }
    }

    public static boolean M(Object obj, Collection collection, Collection collection2) {
        if (collection == null && collection2 == null) {
            return false;
        }
        if (collection2 == null) {
            return collection.contains(obj);
        }
        if (collection == null) {
            return !collection2.contains(obj);
        }
        return !collection2.contains(obj) || collection.contains(obj);
    }

    public static final void N(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void O(Object obj) {
        if (obj instanceof p084p4.j) {
            throw ((p084p4.j) obj).f10850h;
        }
    }

    public static final void P(E0.l lVar, int i, D0.k kVar) {
        P.d dVar = new P.d(new E0.l[16]);
        List listG = lVar.g(false, false);
        while (true) {
            dVar.f(dVar.f4583j, listG);
            while (dVar.n()) {
                E0.l lVar2 = (E0.l) dVar.p(dVar.f4583j - 1);
                p124x0.Y yC = lVar2.c();
                if (!(yC != null ? yC.T0() : false)) {
                    E0.r rVar = E0.o.f982m;
                    E0.h hVar = lVar2.f947d;
                    LinkedHashMap linkedHashMap = hVar.f939h;
                    if (!linkedHashMap.containsKey(rVar) && !linkedHashMap.containsKey(E0.o.i)) {
                        p124x0.Y yC2 = lVar2.c();
                        if (yC2 == null) {
                            p027e3.a.z0("Expected semantics node to have a coordinator.");
                            throw null;
                        }
                        S0.i iVarA = p006b.a.A(p113v0.U.e(yC2));
                        if (iVarA.f4892a < iVarA.f4894c && iVarA.f4893b < iVarA.f4895d) {
                            Object obj = hVar.f939h.get(E0.g.f918e);
                            if (obj == null) {
                                obj = null;
                            }
                            D4.e eVar = (D4.e) obj;
                            Object obj2 = linkedHashMap.get(E0.o.f985p);
                            E0.f fVar = (E0.f) (obj2 != null ? obj2 : null);
                            if (eVar == null || fVar == null || ((Number) fVar.f913b.invoke()).floatValue() <= 0.0f) {
                                listG = lVar2.g(false, false);
                            } else {
                                int i3 = i + 1;
                                kVar.invoke(new D0.m(lVar2, i3, iVarA, yC2));
                                P(lVar2, i3, kVar);
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    public static void Q(Object[] objArr, int i) {
        for (int i3 = 0; i3 < i; i3++) {
            if (objArr[i3] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 9);
                sb.append("at index ");
                sb.append(i3);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static final void a(K3.a aVar, C0230o c0230o, int i) {
        C0230o c0230o2;
        InterfaceC0203a0 interfaceC0203a0;
        E4.k.f(ClipAttribute.Sensor.Configuration.Device, aVar);
        c0230o.X(1320340125);
        c0230o.V(-1682989552);
        Object objK = c0230o.K();
        N.U u6 = C0222k.f3714a;
        N.U u7 = N.U.f3673m;
        if (objK == u6) {
            objK = C0208d.K(aVar.getState(), u7);
            c0230o.f0(objK);
        }
        InterfaceC0203a0 interfaceC0203a1 = (InterfaceC0203a0) objK;
        Object objD = AbstractC0013g0.d(-1682987319, c0230o, false);
        if (objD == u6) {
            objD = C0208d.K(Boolean.FALSE, u7);
            c0230o.f0(objD);
        }
        InterfaceC0203a0 interfaceC0203a2 = (InterfaceC0203a0) objD;
        c0230o.p(false);
        C0208d.e(new N3.X(aVar, interfaceC0203a1, null), c0230o, p084p4.x.f10867a);
        Z.f fVar = Z.b.f5942r;
        Z.l lVar = Z.l.f5957a;
        Z.o oVarC = androidx.compose.foundation.layout.c.c(lVar, 80);
        p123x.U uA = p123x.T.a(AbstractC1078k.f13777a, fVar, c0230o, 48);
        int i3 = c0230o.f3744P;
        InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
        Z.o oVarC2 = Z.a.c(c0230o, oVarC);
        InterfaceC1102j.f14043g.getClass();
        C1106n c1106n = C1101i.f14038b;
        c0230o.Z();
        if (c0230o.f3743O) {
            c0230o.l(c1106n);
        } else {
            c0230o.i0();
        }
        C1100h c1100h = C1101i.f14041e;
        C0208d.R(c1100h, c0230o, uA);
        C1100h c1100h2 = C1101i.f14040d;
        C0208d.R(c1100h2, c0230o, interfaceC0225l0M);
        C1100h c1100h3 = C1101i.f14042f;
        if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i3))) {
            p012c.k.y(i3, c0230o, i3, c1100h3);
        }
        C1100h c1100h4 = C1101i.f14039c;
        C0208d.R(c1100h4, c0230o, oVarC2);
        Z.o oVarG = androidx.compose.foundation.layout.a.g(lVar, 8);
        C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o, 0);
        int i6 = c0230o.f3744P;
        InterfaceC0225l0 interfaceC0225l0M2 = c0230o.m();
        Z.o oVarC3 = Z.a.c(c0230o, oVarG);
        c0230o.Z();
        if (c0230o.f3743O) {
            c0230o.l(c1106n);
        } else {
            c0230o.i0();
        }
        C0208d.R(c1100h, c0230o, c1090xA);
        C0208d.R(c1100h2, c0230o, interfaceC0225l0M2);
        if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i6))) {
            p012c.k.y(i6, c0230o, i6, c1100h3);
        }
        C0208d.R(c1100h4, c0230o, oVarC3);
        String strK = aVar.name;
        c0230o.V(1444386076);
        if (strK == null) {
            strK = AbstractC0599v0.K(R.string.devices_unknown, c0230o);
        }
        c0230o.p(false);
        e2.b(strK, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o, 0, 0, 131070);
        K3.b bVar = (K3.b) interfaceC0203a1.getValue();
        switch (bVar == null ? -1 : AbstractC0274k0.f4206a[bVar.ordinal()]) {
            case 1:
                c0230o.V(1826433503);
                e2.b(AbstractC0599v0.K(R.string.devices_state_connected, c0230o), null, p035g0.r.f9079e, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o, 384, 0, 131066);
                c0230o2 = c0230o;
                c0230o2.p(false);
                break;
            case 2:
                c0230o.V(1826668545);
                e2.b(AbstractC0599v0.K(R.string.devices_state_connecting, c0230o), null, p035g0.r.f9083j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o, 384, 0, 131066);
                c0230o2 = c0230o;
                c0230o2.p(false);
                break;
            case 3:
                c0230o.V(1826894256);
                e2.b(AbstractC0599v0.K(R.string.devices_state_error, c0230o), null, p035g0.r.f9081g, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o, 384, 0, 131066);
                c0230o2 = c0230o;
                c0230o2.p(false);
                break;
            case 4:
                c0230o.V(1827048295);
                e2.b(AbstractC0599v0.K(R.string.devices_state_pairing, c0230o), null, p035g0.r.f9081g, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o, 384, 0, 131066);
                c0230o2 = c0230o;
                c0230o2.p(false);
                break;
            case 5:
                c0230o.V(1827275866);
                e2.b(AbstractC0599v0.K(R.string.devices_state_tap_to_connect, c0230o), null, p035g0.r.f9079e, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o, 384, 0, 131066);
                c0230o2 = c0230o;
                c0230o2.p(false);
                break;
            case 6:
                c0230o.V(1827513512);
                e2.b("Not found. Delete and scan again to re-add.", null, p035g0.r.f9081g, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o, 390, 0, 131066);
                c0230o2 = c0230o;
                c0230o2.p(false);
                break;
            default:
                c0230o.V(1827718701);
                e2.b(AbstractC0599v0.K(R.string.devices_unknown, c0230o), null, p035g0.r.f9081g, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o, 384, 0, 131066);
                c0230o2 = c0230o;
                c0230o2.p(false);
                break;
        }
        c0230o2.p(true);
        AbstractC1070c.b(c0230o2, p123x.V.a(lVar, 1.0f));
        c0230o2.V(-1910001259);
        Object objK2 = c0230o2.K();
        if (objK2 == u6) {
            interfaceC0203a0 = interfaceC0203a2;
            objK2 = new C0275l(4, interfaceC0203a0);
            c0230o2.f0(objK2);
        } else {
            interfaceC0203a0 = interfaceC0203a2;
        }
        c0230o2.p(false);
        L.L.d((D4.a) objK2, null, false, null, null, N3.C.f3934h, c0230o2, 196614, 30);
        c0230o2.V(-1909994062);
        if (((Boolean) interfaceC0203a0.getValue()).booleanValue()) {
            c0230o2.V(-1909992474);
            Object objK3 = c0230o2.K();
            if (objK3 == u6) {
                objK3 = new C0275l(5, interfaceC0203a0);
                c0230o2.f0(objK3);
            }
            c0230o2.p(false);
            AbstractC0151k.a((D4.a) objK3, V.b.c(-893766508, new N3.Z(aVar, interfaceC0203a0, 0), c0230o2), null, V.b.c(1205971922, new C0254a0(0, interfaceC0203a0), c0230o2), N3.C.f3936k, N3.C.f3937l, null, 0L, 0L, 0L, 0L, 0.0f, null, c0230o, 1772598, 16276);
            c0230o2 = c0230o;
        }
        c0230o2.p(false);
        c0230o2.p(true);
        C0235q0 c0235q0T = c0230o2.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0273k(i, 1, aVar);
        }
    }

    public static final void b(int i, C0230o c0230o) {
        InterfaceC0203a0 interfaceC0203a0;
        F1.I i3;
        InterfaceC0203a0 interfaceC0203a1;
        boolean z5;
        C0230o c0230o2 = c0230o;
        c0230o2.X(795641548);
        if (i == 0 && c0230o2.B()) {
            c0230o2.P();
        } else {
            F1.I i6 = (F1.I) c0230o2.k(P0.f4083b);
            c0230o2.V(-1837708599);
            Object objK = c0230o2.K();
            N.U u6 = C0222k.f3714a;
            N.U u7 = N.U.f3673m;
            if (objK == u6) {
                objK = C0208d.K(null, u7);
                c0230o2.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a2 = (InterfaceC0203a0) objK;
            c0230o2.p(false);
            K3.a aVar = (K3.a) interfaceC0203a2.getValue();
            c0230o2.V(-1837701689);
            if (aVar != null) {
                c0230o2.V(-1837699691);
                Object objK2 = c0230o2.K();
                if (objK2 == u6) {
                    objK2 = new C0275l(2, interfaceC0203a2);
                    c0230o2.f0(objK2);
                }
                c0230o2.p(false);
                p006b.a.a((D4.a) objK2, null, V.b.c(1452814974, new N3.Z(aVar, interfaceC0203a2, 1), c0230o2), c0230o2, 390, 2);
            }
            Object objD = AbstractC0013g0.d(-1837684190, c0230o2, false);
            if (objD == u6) {
                objD = C0208d.K(Boolean.FALSE, u7);
                c0230o2.f0(objD);
            }
            InterfaceC0203a0 interfaceC0203a3 = (InterfaceC0203a0) objD;
            Object objD2 = AbstractC0013g0.d(-1837682561, c0230o2, false);
            if (objD2 == u6) {
                objD2 = C0208d.K("", u7);
                c0230o2.f0(objD2);
            }
            InterfaceC0203a0 interfaceC0203a4 = (InterfaceC0203a0) objD2;
            c0230o2.p(false);
            c0230o2.V(-1837679729);
            if (((Boolean) interfaceC0203a3.getValue()).booleanValue()) {
                c0230o2.V(-1837678519);
                Object objK3 = c0230o2.K();
                if (objK3 == u6) {
                    objK3 = new C0275l(3, interfaceC0203a3);
                    c0230o2.f0(objK3);
                }
                c0230o2.p(false);
                i3 = i6;
                interfaceC0203a0 = interfaceC0203a3;
                interfaceC0203a1 = interfaceC0203a2;
                z5 = false;
                AbstractC0151k.a((D4.a) objK3, V.b.c(-1932087850, new C0258c0(0, interfaceC0203a3, interfaceC0203a4, interfaceC0203a2), c0230o2), null, V.b.c(1739597844, new C0254a0(1, interfaceC0203a3), c0230o2), N3.C.f3929c, V.b.c(-1342808207, new C0254a0(2, interfaceC0203a4), c0230o2), null, 0L, 0L, 0L, 0L, 0.0f, null, c0230o, 1772598, 16276);
                c0230o2 = c0230o;
            } else {
                interfaceC0203a0 = interfaceC0203a3;
                i3 = i6;
                interfaceC0203a1 = interfaceC0203a2;
                z5 = false;
            }
            c0230o2.p(z5);
            C0208d.e(new C0260d0(2, null), c0230o2, p084p4.x.f10867a);
            J0.b(null, V.b.c(2134300304, new C0264f0(i3, interfaceC0203a0, 0), c0230o2), null, null, null, 0, 0L, 0L, null, V.b.c(1317784475, new C0262e0(1, interfaceC0203a1), c0230o2), c0230o, 805306416, 509);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0253a(i, 4);
        }
    }

    public static final void c(InterfaceC0070l interfaceC0070l, Z.c cVar, V.a aVar, C0230o c0230o, int i) {
        int i3;
        c0230o.X(476043083);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? c0230o.f(interfaceC0070l) : c0230o.h(interfaceC0070l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.f(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.h(aVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i3 & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            boolean z5 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && c0230o.f(interfaceC0070l))) | ((i3 & 112) == 32);
            Object objK = c0230o.K();
            if (z5 || objK == C0222k.f3714a) {
                objK = new C0069k(cVar, interfaceC0070l);
                c0230o.f0(objK);
            }
            V0.l.a((C0069k) objK, null, new V0.B(1, false, false), aVar, c0230o, ((i3 << 3) & 7168) | 384, 2);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new d1(interfaceC0070l, cVar, aVar, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015e  */
    /* JADX WARN: Code duplicated, block: B:102:0x016c  */
    /* JADX WARN: Code duplicated, block: B:106:0x017e  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final void d(p053k0.b bVar, String str, Z.o oVar, Z.c cVar, C1025h c1025h, float f6, C0709j c0709j, C0230o c0230o, int i, int i3) {
        Z.o oVar2;
        int i6;
        Z.c cVar2;
        int i7;
        int i8;
        int i9;
        C1025h c1025h2;
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        C0709j c0709j2;
        int i15;
        int i16;
        Z.o oVarA;
        C0709j c0709j3;
        int i17;
        C1106n c1106n;
        C1100h c1100h;
        Z.o oVar3;
        Z.c cVar3;
        C1025h c1025h3;
        C0709j c0709j4;
        boolean z5;
        Object objK;
        float f8;
        C0235q0 c0235q0T;
        c0230o.X(1142754848);
        int i18 = (c0230o.h(bVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i18 |= c0230o.f(str) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 == 0) {
            if ((i & 384) == 0) {
                oVar2 = oVar;
                i18 |= c0230o.f(oVar2) ? HueLog.LogComponent.STREAMDTLS : 128;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                i8 = i18 | 3072;
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                if (c0230o.f(cVar2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i8 = i18 | i7;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i & 24576) == 0) {
                    c1025h2 = c1025h;
                    if (c0230o.f(c1025h2)) {
                        i10 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i10 = 8192;
                    }
                    i8 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i13 = i8 | 196608;
                    f7 = f6;
                } else {
                    f7 = f6;
                    if (c0230o.c(f7)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i13 = i8 | i12;
                }
                i14 = i3 & 64;
                if (i14 != 0) {
                    if ((1572864 & i) == 0) {
                        c0709j2 = c0709j;
                        if (c0230o.f(c0709j2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i13 |= i15;
                    }
                    i16 = i13;
                    if ((i13 & 599187) == 599186 || !c0230o.B()) {
                        oVarA = Z.l.f5957a;
                        if (i19 != 0) {
                            oVar2 = oVarA;
                        }
                        if (i6 != 0) {
                            cVar2 = Z.b.f5936l;
                        }
                        if (i9 != 0) {
                            c1025h2 = C1026i.f13168a;
                        }
                        if (i11 != 0) {
                            f7 = 1.0f;
                        }
                        if (i14 != 0) {
                            c0709j3 = null;
                        } else {
                            c0709j3 = c0709j2;
                        }
                        if (str != null) {
                            c0230o.V(1040258775);
                            if ((i16 & 112) == 32) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            objK = c0230o.K();
                            if (z5 || objK == C0222k.f3714a) {
                                objK = new E0.j(str, 7);
                                c0230o.f0(objK);
                            }
                            oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                            c0230o.p(false);
                        } else {
                            c0230o.V(1040398089);
                            c0230o.p(false);
                        }
                        C1025h c1025h4 = c1025h2;
                        Z.c cVar4 = cVar2;
                        Z.o oVarD = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar4, c1025h4, f7, c0709j3, 2);
                        p101t.V v6 = p101t.V.f12276a;
                        i17 = c0230o.f3744P;
                        Z.o oVarC = Z.a.c(c0230o, oVarD);
                        InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                        InterfaceC1102j.f14043g.getClass();
                        c1106n = C1101i.f14038b;
                        c0230o.Z();
                        if (c0230o.f3743O) {
                            c0230o.l(c1106n);
                        } else {
                            c0230o.i0();
                        }
                        C0208d.R(C1101i.f14041e, c0230o, v6);
                        C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                        C0208d.R(C1101i.f14039c, c0230o, oVarC);
                        c1100h = C1101i.f14042f;
                        if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i17))) {
                            p012c.k.y(i17, c0230o, i17, c1100h);
                        }
                        c0230o.p(true);
                        oVar3 = oVar2;
                        cVar3 = cVar4;
                        c1025h3 = c1025h4;
                        c0709j4 = c0709j3;
                    } else {
                        c0230o.P();
                        oVar3 = oVar2;
                        cVar3 = cVar2;
                        c1025h3 = c1025h2;
                        c0709j4 = c0709j2;
                    }
                    f8 = f7;
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new p101t.W(bVar, str, oVar3, cVar3, c1025h3, f8, c0709j4, i, i3);
                    }
                }
                i13 |= 1572864;
                c0709j2 = c0709j;
                i16 = i13;
                if ((i13 & 599187) == 599186) {
                    oVarA = Z.l.f5957a;
                    if (i19 != 0) {
                        oVar2 = oVarA;
                    }
                    if (i6 != 0) {
                        cVar2 = Z.b.f5936l;
                    }
                    if (i9 != 0) {
                        c1025h2 = C1026i.f13168a;
                    }
                    if (i11 != 0) {
                        f7 = 1.0f;
                    }
                    if (i14 != 0) {
                        c0709j3 = null;
                    } else {
                        c0709j3 = c0709j2;
                    }
                    if (str != null) {
                        c0230o.V(1040258775);
                        if ((i16 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objK = c0230o.K();
                        if (z5) {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        } else {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        }
                        oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                        c0230o.p(false);
                    } else {
                        c0230o.V(1040398089);
                        c0230o.p(false);
                    }
                    C1025h c1025h5 = c1025h2;
                    Z.c cVar5 = cVar2;
                    Z.o oVarD2 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar5, c1025h5, f7, c0709j3, 2);
                    p101t.V v7 = p101t.V.f12276a;
                    i17 = c0230o.f3744P;
                    Z.o oVarC2 = Z.a.c(c0230o, oVarD2);
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, v7);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M2);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC2);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                    oVar3 = oVar2;
                    cVar3 = cVar5;
                    c1025h3 = c1025h5;
                    c0709j4 = c0709j3;
                } else {
                    oVarA = Z.l.f5957a;
                    if (i19 != 0) {
                        oVar2 = oVarA;
                    }
                    if (i6 != 0) {
                        cVar2 = Z.b.f5936l;
                    }
                    if (i9 != 0) {
                        c1025h2 = C1026i.f13168a;
                    }
                    if (i11 != 0) {
                        f7 = 1.0f;
                    }
                    if (i14 != 0) {
                        c0709j3 = null;
                    } else {
                        c0709j3 = c0709j2;
                    }
                    if (str != null) {
                        c0230o.V(1040258775);
                        if ((i16 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objK = c0230o.K();
                        if (z5) {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        } else {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        }
                        oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                        c0230o.p(false);
                    } else {
                        c0230o.V(1040398089);
                        c0230o.p(false);
                    }
                    C1025h c1025h6 = c1025h2;
                    Z.c cVar6 = cVar2;
                    Z.o oVarD3 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar6, c1025h6, f7, c0709j3, 2);
                    p101t.V v8 = p101t.V.f12276a;
                    i17 = c0230o.f3744P;
                    Z.o oVarC3 = Z.a.c(c0230o, oVarD3);
                    InterfaceC0225l0 interfaceC0225l0M3 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, v8);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M3);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC3);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                    oVar3 = oVar2;
                    cVar3 = cVar6;
                    c1025h3 = c1025h6;
                    c0709j4 = c0709j3;
                }
                f8 = f7;
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new p101t.W(bVar, str, oVar3, cVar3, c1025h3, f8, c0709j4, i, i3);
                }
            }
            i8 |= 24576;
            c1025h2 = c1025h;
            i11 = i3 & 32;
            if (i11 != 0) {
                i13 = i8 | 196608;
                f7 = f6;
            } else {
                f7 = f6;
                if (c0230o.c(f7)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i13 = i8 | i12;
            }
            i14 = i3 & 64;
            if (i14 != 0) {
                if ((1572864 & i) == 0) {
                    c0709j2 = c0709j;
                    if (c0230o.f(c0709j2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i13 |= i15;
                }
                i16 = i13;
                if ((i13 & 599187) == 599186) {
                    oVarA = Z.l.f5957a;
                    if (i19 != 0) {
                        oVar2 = oVarA;
                    }
                    if (i6 != 0) {
                        cVar2 = Z.b.f5936l;
                    }
                    if (i9 != 0) {
                        c1025h2 = C1026i.f13168a;
                    }
                    if (i11 != 0) {
                        f7 = 1.0f;
                    }
                    if (i14 != 0) {
                        c0709j3 = null;
                    } else {
                        c0709j3 = c0709j2;
                    }
                    if (str != null) {
                        c0230o.V(1040258775);
                        if ((i16 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objK = c0230o.K();
                        if (z5) {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        } else {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        }
                        oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                        c0230o.p(false);
                    } else {
                        c0230o.V(1040398089);
                        c0230o.p(false);
                    }
                    C1025h c1025h7 = c1025h2;
                    Z.c cVar7 = cVar2;
                    Z.o oVarD4 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar7, c1025h7, f7, c0709j3, 2);
                    p101t.V v9 = p101t.V.f12276a;
                    i17 = c0230o.f3744P;
                    Z.o oVarC4 = Z.a.c(c0230o, oVarD4);
                    InterfaceC0225l0 interfaceC0225l0M4 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, v9);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M4);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC4);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                    oVar3 = oVar2;
                    cVar3 = cVar7;
                    c1025h3 = c1025h7;
                    c0709j4 = c0709j3;
                } else {
                    oVarA = Z.l.f5957a;
                    if (i19 != 0) {
                        oVar2 = oVarA;
                    }
                    if (i6 != 0) {
                        cVar2 = Z.b.f5936l;
                    }
                    if (i9 != 0) {
                        c1025h2 = C1026i.f13168a;
                    }
                    if (i11 != 0) {
                        f7 = 1.0f;
                    }
                    if (i14 != 0) {
                        c0709j3 = null;
                    } else {
                        c0709j3 = c0709j2;
                    }
                    if (str != null) {
                        c0230o.V(1040258775);
                        if ((i16 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objK = c0230o.K();
                        if (z5) {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        } else {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        }
                        oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                        c0230o.p(false);
                    } else {
                        c0230o.V(1040398089);
                        c0230o.p(false);
                    }
                    C1025h c1025h8 = c1025h2;
                    Z.c cVar8 = cVar2;
                    Z.o oVarD5 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar8, c1025h8, f7, c0709j3, 2);
                    p101t.V v10 = p101t.V.f12276a;
                    i17 = c0230o.f3744P;
                    Z.o oVarC5 = Z.a.c(c0230o, oVarD5);
                    InterfaceC0225l0 interfaceC0225l0M5 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, v10);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M5);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC5);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                    oVar3 = oVar2;
                    cVar3 = cVar8;
                    c1025h3 = c1025h8;
                    c0709j4 = c0709j3;
                }
                f8 = f7;
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new p101t.W(bVar, str, oVar3, cVar3, c1025h3, f8, c0709j4, i, i3);
                }
            }
            i13 |= 1572864;
            c0709j2 = c0709j;
            i16 = i13;
            if ((i13 & 599187) == 599186) {
                oVarA = Z.l.f5957a;
                if (i19 != 0) {
                    oVar2 = oVarA;
                }
                if (i6 != 0) {
                    cVar2 = Z.b.f5936l;
                }
                if (i9 != 0) {
                    c1025h2 = C1026i.f13168a;
                }
                if (i11 != 0) {
                    f7 = 1.0f;
                }
                if (i14 != 0) {
                    c0709j3 = null;
                } else {
                    c0709j3 = c0709j2;
                }
                if (str != null) {
                    c0230o.V(1040258775);
                    if ((i16 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objK = c0230o.K();
                    if (z5) {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    } else {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    }
                    oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                    c0230o.p(false);
                } else {
                    c0230o.V(1040398089);
                    c0230o.p(false);
                }
                C1025h c1025h9 = c1025h2;
                Z.c cVar9 = cVar2;
                Z.o oVarD6 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar9, c1025h9, f7, c0709j3, 2);
                p101t.V v11 = p101t.V.f12276a;
                i17 = c0230o.f3744P;
                Z.o oVarC6 = Z.a.c(c0230o, oVarD6);
                InterfaceC0225l0 interfaceC0225l0M6 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, v11);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M6);
                C0208d.R(C1101i.f14039c, c0230o, oVarC6);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
                oVar3 = oVar2;
                cVar3 = cVar9;
                c1025h3 = c1025h9;
                c0709j4 = c0709j3;
            } else {
                oVarA = Z.l.f5957a;
                if (i19 != 0) {
                    oVar2 = oVarA;
                }
                if (i6 != 0) {
                    cVar2 = Z.b.f5936l;
                }
                if (i9 != 0) {
                    c1025h2 = C1026i.f13168a;
                }
                if (i11 != 0) {
                    f7 = 1.0f;
                }
                if (i14 != 0) {
                    c0709j3 = null;
                } else {
                    c0709j3 = c0709j2;
                }
                if (str != null) {
                    c0230o.V(1040258775);
                    if ((i16 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objK = c0230o.K();
                    if (z5) {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    } else {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    }
                    oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                    c0230o.p(false);
                } else {
                    c0230o.V(1040398089);
                    c0230o.p(false);
                }
                C1025h c1025h10 = c1025h2;
                Z.c cVar10 = cVar2;
                Z.o oVarD7 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar10, c1025h10, f7, c0709j3, 2);
                p101t.V v12 = p101t.V.f12276a;
                i17 = c0230o.f3744P;
                Z.o oVarC7 = Z.a.c(c0230o, oVarD7);
                InterfaceC0225l0 interfaceC0225l0M7 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, v12);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M7);
                C0208d.R(C1101i.f14039c, c0230o, oVarC7);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
                oVar3 = oVar2;
                cVar3 = cVar10;
                c1025h3 = c1025h10;
                c0709j4 = c0709j3;
            }
            f8 = f7;
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new p101t.W(bVar, str, oVar3, cVar3, c1025h3, f8, c0709j4, i, i3);
            }
        }
        i18 |= 384;
        oVar2 = oVar;
        i6 = i3 & 8;
        if (i6 != 0) {
            i8 = i18 | 3072;
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            if (c0230o.f(cVar2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i8 = i18 | i7;
        }
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i & 24576) == 0) {
                c1025h2 = c1025h;
                if (c0230o.f(c1025h2)) {
                    i10 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i10 = 8192;
                }
                i8 |= i10;
            }
            i11 = i3 & 32;
            if (i11 != 0) {
                i13 = i8 | 196608;
                f7 = f6;
            } else {
                f7 = f6;
                if (c0230o.c(f7)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i13 = i8 | i12;
            }
            i14 = i3 & 64;
            if (i14 != 0) {
                if ((1572864 & i) == 0) {
                    c0709j2 = c0709j;
                    if (c0230o.f(c0709j2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i13 |= i15;
                }
                i16 = i13;
                if ((i13 & 599187) == 599186) {
                    oVarA = Z.l.f5957a;
                    if (i19 != 0) {
                        oVar2 = oVarA;
                    }
                    if (i6 != 0) {
                        cVar2 = Z.b.f5936l;
                    }
                    if (i9 != 0) {
                        c1025h2 = C1026i.f13168a;
                    }
                    if (i11 != 0) {
                        f7 = 1.0f;
                    }
                    if (i14 != 0) {
                        c0709j3 = null;
                    } else {
                        c0709j3 = c0709j2;
                    }
                    if (str != null) {
                        c0230o.V(1040258775);
                        if ((i16 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objK = c0230o.K();
                        if (z5) {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        } else {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        }
                        oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                        c0230o.p(false);
                    } else {
                        c0230o.V(1040398089);
                        c0230o.p(false);
                    }
                    C1025h c1025h11 = c1025h2;
                    Z.c cVar11 = cVar2;
                    Z.o oVarD8 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar11, c1025h11, f7, c0709j3, 2);
                    p101t.V v13 = p101t.V.f12276a;
                    i17 = c0230o.f3744P;
                    Z.o oVarC8 = Z.a.c(c0230o, oVarD8);
                    InterfaceC0225l0 interfaceC0225l0M8 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, v13);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M8);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC8);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                    oVar3 = oVar2;
                    cVar3 = cVar11;
                    c1025h3 = c1025h11;
                    c0709j4 = c0709j3;
                } else {
                    oVarA = Z.l.f5957a;
                    if (i19 != 0) {
                        oVar2 = oVarA;
                    }
                    if (i6 != 0) {
                        cVar2 = Z.b.f5936l;
                    }
                    if (i9 != 0) {
                        c1025h2 = C1026i.f13168a;
                    }
                    if (i11 != 0) {
                        f7 = 1.0f;
                    }
                    if (i14 != 0) {
                        c0709j3 = null;
                    } else {
                        c0709j3 = c0709j2;
                    }
                    if (str != null) {
                        c0230o.V(1040258775);
                        if ((i16 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objK = c0230o.K();
                        if (z5) {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        } else {
                            objK = new E0.j(str, 7);
                            c0230o.f0(objK);
                        }
                        oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                        c0230o.p(false);
                    } else {
                        c0230o.V(1040398089);
                        c0230o.p(false);
                    }
                    C1025h c1025h12 = c1025h2;
                    Z.c cVar12 = cVar2;
                    Z.o oVarD9 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar12, c1025h12, f7, c0709j3, 2);
                    p101t.V v14 = p101t.V.f12276a;
                    i17 = c0230o.f3744P;
                    Z.o oVarC9 = Z.a.c(c0230o, oVarD9);
                    InterfaceC0225l0 interfaceC0225l0M9 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, v14);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M9);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC9);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                    oVar3 = oVar2;
                    cVar3 = cVar12;
                    c1025h3 = c1025h12;
                    c0709j4 = c0709j3;
                }
                f8 = f7;
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new p101t.W(bVar, str, oVar3, cVar3, c1025h3, f8, c0709j4, i, i3);
                }
            }
            i13 |= 1572864;
            c0709j2 = c0709j;
            i16 = i13;
            if ((i13 & 599187) == 599186) {
                oVarA = Z.l.f5957a;
                if (i19 != 0) {
                    oVar2 = oVarA;
                }
                if (i6 != 0) {
                    cVar2 = Z.b.f5936l;
                }
                if (i9 != 0) {
                    c1025h2 = C1026i.f13168a;
                }
                if (i11 != 0) {
                    f7 = 1.0f;
                }
                if (i14 != 0) {
                    c0709j3 = null;
                } else {
                    c0709j3 = c0709j2;
                }
                if (str != null) {
                    c0230o.V(1040258775);
                    if ((i16 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objK = c0230o.K();
                    if (z5) {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    } else {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    }
                    oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                    c0230o.p(false);
                } else {
                    c0230o.V(1040398089);
                    c0230o.p(false);
                }
                C1025h c1025h13 = c1025h2;
                Z.c cVar13 = cVar2;
                Z.o oVarD10 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar13, c1025h13, f7, c0709j3, 2);
                p101t.V v15 = p101t.V.f12276a;
                i17 = c0230o.f3744P;
                Z.o oVarC10 = Z.a.c(c0230o, oVarD10);
                InterfaceC0225l0 interfaceC0225l0M10 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, v15);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M10);
                C0208d.R(C1101i.f14039c, c0230o, oVarC10);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
                oVar3 = oVar2;
                cVar3 = cVar13;
                c1025h3 = c1025h13;
                c0709j4 = c0709j3;
            } else {
                oVarA = Z.l.f5957a;
                if (i19 != 0) {
                    oVar2 = oVarA;
                }
                if (i6 != 0) {
                    cVar2 = Z.b.f5936l;
                }
                if (i9 != 0) {
                    c1025h2 = C1026i.f13168a;
                }
                if (i11 != 0) {
                    f7 = 1.0f;
                }
                if (i14 != 0) {
                    c0709j3 = null;
                } else {
                    c0709j3 = c0709j2;
                }
                if (str != null) {
                    c0230o.V(1040258775);
                    if ((i16 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objK = c0230o.K();
                    if (z5) {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    } else {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    }
                    oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                    c0230o.p(false);
                } else {
                    c0230o.V(1040398089);
                    c0230o.p(false);
                }
                C1025h c1025h14 = c1025h2;
                Z.c cVar14 = cVar2;
                Z.o oVarD11 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar14, c1025h14, f7, c0709j3, 2);
                p101t.V v16 = p101t.V.f12276a;
                i17 = c0230o.f3744P;
                Z.o oVarC11 = Z.a.c(c0230o, oVarD11);
                InterfaceC0225l0 interfaceC0225l0M11 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, v16);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M11);
                C0208d.R(C1101i.f14039c, c0230o, oVarC11);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
                oVar3 = oVar2;
                cVar3 = cVar14;
                c1025h3 = c1025h14;
                c0709j4 = c0709j3;
            }
            f8 = f7;
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new p101t.W(bVar, str, oVar3, cVar3, c1025h3, f8, c0709j4, i, i3);
            }
        }
        i8 |= 24576;
        c1025h2 = c1025h;
        i11 = i3 & 32;
        if (i11 != 0) {
            i13 = i8 | 196608;
            f7 = f6;
        } else {
            f7 = f6;
            if (c0230o.c(f7)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i13 = i8 | i12;
        }
        i14 = i3 & 64;
        if (i14 != 0) {
            if ((1572864 & i) == 0) {
                c0709j2 = c0709j;
                if (c0230o.f(c0709j2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i13 |= i15;
            }
            i16 = i13;
            if ((i13 & 599187) == 599186) {
                oVarA = Z.l.f5957a;
                if (i19 != 0) {
                    oVar2 = oVarA;
                }
                if (i6 != 0) {
                    cVar2 = Z.b.f5936l;
                }
                if (i9 != 0) {
                    c1025h2 = C1026i.f13168a;
                }
                if (i11 != 0) {
                    f7 = 1.0f;
                }
                if (i14 != 0) {
                    c0709j3 = null;
                } else {
                    c0709j3 = c0709j2;
                }
                if (str != null) {
                    c0230o.V(1040258775);
                    if ((i16 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objK = c0230o.K();
                    if (z5) {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    } else {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    }
                    oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                    c0230o.p(false);
                } else {
                    c0230o.V(1040398089);
                    c0230o.p(false);
                }
                C1025h c1025h15 = c1025h2;
                Z.c cVar15 = cVar2;
                Z.o oVarD12 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar15, c1025h15, f7, c0709j3, 2);
                p101t.V v17 = p101t.V.f12276a;
                i17 = c0230o.f3744P;
                Z.o oVarC12 = Z.a.c(c0230o, oVarD12);
                InterfaceC0225l0 interfaceC0225l0M12 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, v17);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M12);
                C0208d.R(C1101i.f14039c, c0230o, oVarC12);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
                oVar3 = oVar2;
                cVar3 = cVar15;
                c1025h3 = c1025h15;
                c0709j4 = c0709j3;
            } else {
                oVarA = Z.l.f5957a;
                if (i19 != 0) {
                    oVar2 = oVarA;
                }
                if (i6 != 0) {
                    cVar2 = Z.b.f5936l;
                }
                if (i9 != 0) {
                    c1025h2 = C1026i.f13168a;
                }
                if (i11 != 0) {
                    f7 = 1.0f;
                }
                if (i14 != 0) {
                    c0709j3 = null;
                } else {
                    c0709j3 = c0709j2;
                }
                if (str != null) {
                    c0230o.V(1040258775);
                    if ((i16 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objK = c0230o.K();
                    if (z5) {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    } else {
                        objK = new E0.j(str, 7);
                        c0230o.f0(objK);
                    }
                    oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                    c0230o.p(false);
                } else {
                    c0230o.V(1040398089);
                    c0230o.p(false);
                }
                C1025h c1025h16 = c1025h2;
                Z.c cVar16 = cVar2;
                Z.o oVarD13 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar16, c1025h16, f7, c0709j3, 2);
                p101t.V v18 = p101t.V.f12276a;
                i17 = c0230o.f3744P;
                Z.o oVarC13 = Z.a.c(c0230o, oVarD13);
                InterfaceC0225l0 interfaceC0225l0M13 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, v18);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M13);
                C0208d.R(C1101i.f14039c, c0230o, oVarC13);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
                oVar3 = oVar2;
                cVar3 = cVar16;
                c1025h3 = c1025h16;
                c0709j4 = c0709j3;
            }
            f8 = f7;
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new p101t.W(bVar, str, oVar3, cVar3, c1025h3, f8, c0709j4, i, i3);
            }
        }
        i13 |= 1572864;
        c0709j2 = c0709j;
        i16 = i13;
        if ((i13 & 599187) == 599186) {
            oVarA = Z.l.f5957a;
            if (i19 != 0) {
                oVar2 = oVarA;
            }
            if (i6 != 0) {
                cVar2 = Z.b.f5936l;
            }
            if (i9 != 0) {
                c1025h2 = C1026i.f13168a;
            }
            if (i11 != 0) {
                f7 = 1.0f;
            }
            if (i14 != 0) {
                c0709j3 = null;
            } else {
                c0709j3 = c0709j2;
            }
            if (str != null) {
                c0230o.V(1040258775);
                if ((i16 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objK = c0230o.K();
                if (z5) {
                    objK = new E0.j(str, 7);
                    c0230o.f0(objK);
                } else {
                    objK = new E0.j(str, 7);
                    c0230o.f0(objK);
                }
                oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                c0230o.p(false);
            } else {
                c0230o.V(1040398089);
                c0230o.p(false);
            }
            C1025h c1025h17 = c1025h2;
            Z.c cVar17 = cVar2;
            Z.o oVarD14 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar17, c1025h17, f7, c0709j3, 2);
            p101t.V v19 = p101t.V.f12276a;
            i17 = c0230o.f3744P;
            Z.o oVarC14 = Z.a.c(c0230o, oVarD14);
            InterfaceC0225l0 interfaceC0225l0M14 = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            c1106n = C1101i.f14038b;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, v19);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M14);
            C0208d.R(C1101i.f14039c, c0230o, oVarC14);
            c1100h = C1101i.f14042f;
            if (c0230o.f3743O) {
                p012c.k.y(i17, c0230o, i17, c1100h);
            } else {
                p012c.k.y(i17, c0230o, i17, c1100h);
            }
            c0230o.p(true);
            oVar3 = oVar2;
            cVar3 = cVar17;
            c1025h3 = c1025h17;
            c0709j4 = c0709j3;
        } else {
            oVarA = Z.l.f5957a;
            if (i19 != 0) {
                oVar2 = oVarA;
            }
            if (i6 != 0) {
                cVar2 = Z.b.f5936l;
            }
            if (i9 != 0) {
                c1025h2 = C1026i.f13168a;
            }
            if (i11 != 0) {
                f7 = 1.0f;
            }
            if (i14 != 0) {
                c0709j3 = null;
            } else {
                c0709j3 = c0709j2;
            }
            if (str != null) {
                c0230o.V(1040258775);
                if ((i16 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objK = c0230o.K();
                if (z5) {
                    objK = new E0.j(str, 7);
                    c0230o.f0(objK);
                } else {
                    objK = new E0.j(str, 7);
                    c0230o.f0(objK);
                }
                oVarA = E0.i.a(oVarA, false, (D4.c) objK);
                c0230o.p(false);
            } else {
                c0230o.V(1040398089);
                c0230o.p(false);
            }
            C1025h c1025h18 = c1025h2;
            Z.c cVar18 = cVar2;
            Z.o oVarD15 = androidx.compose.ui.draw.a.d(com.fasterxml.jackson.databind.deser.std.d0.l(oVar2.k(oVarA)), bVar, cVar18, c1025h18, f7, c0709j3, 2);
            p101t.V v110 = p101t.V.f12276a;
            i17 = c0230o.f3744P;
            Z.o oVarC15 = Z.a.c(c0230o, oVarD15);
            InterfaceC0225l0 interfaceC0225l0M15 = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            c1106n = C1101i.f14038b;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, v110);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M15);
            C0208d.R(C1101i.f14039c, c0230o, oVarC15);
            c1100h = C1101i.f14042f;
            if (c0230o.f3743O) {
                p012c.k.y(i17, c0230o, i17, c1100h);
            } else {
                p012c.k.y(i17, c0230o, i17, c1100h);
            }
            c0230o.p(true);
            oVar3 = oVar2;
            cVar3 = cVar18;
            c1025h3 = c1025h18;
            c0709j4 = c0709j3;
        }
        f8 = f7;
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new p101t.W(bVar, str, oVar3, cVar3, c1025h3, f8, c0709j4, i, i3);
        }
    }

    public static final void e(C0823f c0823f, Z.o oVar, C0709j c0709j, C0230o c0230o) {
        d(AbstractC0819b.c(c0823f, c0230o), null, oVar, Z.b.f5936l, C1026i.f13168a, 1.0f, c0709j, c0230o, 1573304, 0);
    }

    public static d5.n f(D4.c cVar) {
        d5.b bVar = d5.c.f8594d;
        E4.k.f("from", bVar);
        d5.g gVar = new d5.g();
        d5.i iVar = bVar.f8595a;
        gVar.f8603a = iVar.f8611a;
        gVar.f8604b = iVar.f8613c;
        gVar.f8605c = iVar.f8612b;
        String str = iVar.f8614d;
        gVar.f8606d = str;
        gVar.f8607e = iVar.f8615e;
        gVar.f8608f = iVar.f8617g;
        gVar.f8609g = iVar.f8616f;
        gVar.f8610h = bVar.f8596b;
        cVar.invoke(gVar);
        if (!E4.k.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        d5.i iVar2 = new d5.i(gVar.f8603a, gVar.f8605c, gVar.f8604b, gVar.f8606d, gVar.f8607e, gVar.f8609g, gVar.f8608f);
        Z2.f fVar = gVar.f8610h;
        E4.k.f("module", fVar);
        return new d5.n(iVar2, fVar);
    }

    public static final void g(F1.I i, F1.E e6, Z.l lVar, Z.g gVar, D4.c cVar, D4.c cVar2, D4.c cVar3, D4.c cVar4, C0230o c0230o, int i3) {
        InterfaceC0458s interfaceC0458s;
        InterfaceC0203a0 interfaceC0203a0;
        C0230o c0230o2;
        G1.p pVar;
        C0096m c0096m;
        G1.i iVar;
        int i6;
        G1.i iVar2;
        InterfaceC0203a0 interfaceC0203a1;
        Activity activity;
        Intent intent;
        int[] intArray;
        F1.E eH;
        F1.z zVarL;
        int[] iArr;
        String strV;
        F1.B bK;
        F1.E e7;
        boolean z5;
        Bundle bundle;
        F1.B bK2;
        F1.E e8;
        ArrayList<String> stringArrayList;
        int i7 = 0;
        c0230o.X(-1964664536);
        int i8 = (i3 & 6) == 0 ? (c0230o.h(i) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i8 |= c0230o.h(e6) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i8 |= c0230o.f(lVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i3 & 3072) == 0) {
            i8 |= c0230o.f(gVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i8 |= c0230o.h(cVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i3) == 0) {
            i8 |= c0230o.h(cVar2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i8 |= c0230o.h(cVar3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i8 |= c0230o.h(cVar4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i8 |= c0230o.h(null) ? 67108864 : 33554432;
        }
        if ((i8 & 38347923) == 38347922 && c0230o.B()) {
            c0230o.P();
            c0230o2 = c0230o;
        } else {
            c0230o.R();
            if ((i3 & 1) != 0 && !c0230o.z()) {
                c0230o.P();
            }
            c0230o.q();
            InterfaceC0458s interfaceC0458s2 = (InterfaceC0458s) c0230o.k(B1.b.f488a);
            androidx.lifecycle.V vA = D1.b.a(c0230o);
            if (vA == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            androidx.lifecycle.U uE = vA.e();
            i.getClass();
            E4.k.f("viewModelStore", uE);
            C0103u c0103u = i.f1284p;
            boolean z6 = true;
            C0102t c0102t = C0103u.f1380c;
            boolean zA = E4.k.a(c0103u, (C0103u) new C0025m0(uE, c0102t, i7).d(E4.x.a(C0103u.class)));
            p089q4.j<C0096m> jVar = i.f1276g;
            if (!zA) {
                if (!jVar.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                i.f1284p = (C0103u) new C0025m0(uE, c0102t, 0).d(E4.x.a(C0103u.class));
            }
            E4.k.f("graph", e6);
            boolean zA2 = E4.k.a(i.f1272c, e6);
            F1.V v6 = i.f1290v;
            if (zA2) {
                interfaceC0458s = interfaceC0458s2;
                i8 = i8;
                p080p.F f6 = e6.f1259q;
                int iF = f6.f();
                for (int i9 = 0; i9 < iF; i9++) {
                    F1.B b6 = (F1.B) f6.g(i9);
                    F1.E e9 = i.f1272c;
                    E4.k.c(e9);
                    int iD = e9.f1259q.d(i9);
                    F1.E e10 = i.f1272c;
                    E4.k.c(e10);
                    p080p.F f7 = e10.f1259q;
                    if (f7.f10718h) {
                        p080p.m.a(f7);
                    }
                    int iA = p085q.a.a(f7.f10720k, iD, f7.i);
                    if (iA >= 0) {
                        Object[] objArr = f7.f10719j;
                        Object obj = objArr[iA];
                        objArr[iA] = b6;
                    }
                }
                for (C0096m c0096m2 : jVar) {
                    int i10 = F1.B.f1242p;
                    M4.h hVar = new M4.h(1, L4.l.R(G4.a.w(c0096m2.i)));
                    F1.B bK3 = i.f1272c;
                    E4.k.c(bK3);
                    Iterator it = hVar.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((X.E) it).i;
                        if (listIterator.hasPrevious()) {
                            F1.B b7 = (F1.B) listIterator.previous();
                            if (!E4.k.a(b7, i.f1272c) || !E4.k.a(bK3, e6)) {
                                if (bK3 instanceof F1.E) {
                                    F1.E e11 = (F1.E) bK3;
                                    bK3 = e11.k(b7.f1247m, e11, false);
                                    E4.k.c(bK3);
                                }
                            }
                        }
                    }
                    E4.k.f("<set-?>", bK3);
                    c0096m2.i = bK3;
                }
            } else {
                F1.E e12 = i.f1272c;
                LinkedHashMap linkedHashMap = i.f1291w;
                if (e12 != null) {
                    ArrayList arrayList = new ArrayList(i.f1281m.keySet());
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        int i12 = i11 + 1;
                        int i13 = size;
                        Integer num = (Integer) obj2;
                        E4.k.e(AuthorizationClient.PlayStoreParams.ID, num);
                        int iIntValue = num.intValue();
                        for (Iterator it2 = linkedHashMap.values().iterator(); it2.hasNext(); it2 = it2) {
                            boolean z7 = z6;
                            ((C0100q) it2.next()).f1372d = z7;
                            z6 = z7;
                        }
                        F1.L l6 = new F1.L();
                        l6.f1304c = z6;
                        boolean z8 = l6.f1303b;
                        k1 k1Var = l6.f1302a;
                        boolean zQ = i.q(iIntValue, null, new F1.K(z8, l6.f1304c, l6.f1305d, false, l6.f1306e, k1Var.f351a, k1Var.f352b));
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((C0100q) it3.next()).f1372d = false;
                            zQ = zQ;
                        }
                        if (zQ) {
                            i.m(iIntValue, true, false);
                        }
                        z6 = true;
                        i11 = i12;
                        size = i13;
                    }
                    i.m(e12.f1247m, z6, false);
                }
                i.f1272c = e6;
                Bundle bundle2 = i.f1273d;
                if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                    int size2 = stringArrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        String str = stringArrayList.get(i14);
                        i14++;
                        String str2 = str;
                        E4.k.e("name", str2);
                        v6.b(str2);
                        bundle2.getBundle(str2);
                    }
                }
                Parcelable[] parcelableArr = i.f1274e;
                Context context = i.f1270a;
                if (parcelableArr != null) {
                    int length = parcelableArr.length;
                    int i15 = 0;
                    while (i15 < length) {
                        Parcelable parcelable = parcelableArr[i15];
                        Parcelable[] parcelableArr2 = parcelableArr;
                        E4.k.d("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState", parcelable);
                        C0098o c0098o = (C0098o) parcelable;
                        int i16 = c0098o.i;
                        int i17 = length;
                        F1.B bC = i.c(i16);
                        if (bC == null) {
                            int i18 = F1.B.f1242p;
                            StringBuilder sbW = p012c.k.w("Restoring the Navigation back stack failed: destination ", G4.a.v(context, i16), " cannot be found from the current destination ");
                            C0096m c0096m3 = (C0096m) jVar.l();
                            sbW.append(c0096m3 != null ? c0096m3.i : null);
                            throw new IllegalStateException(sbW.toString());
                        }
                        int i19 = i15;
                        C0096m c0096mA = c0098o.a(context, bC, i.g(), i.f1284p);
                        F1.U uB = v6.b(bC.f1243h);
                        Object c0100q = linkedHashMap.get(uB);
                        if (c0100q == null) {
                            c0100q = new C0100q(i, uB);
                            linkedHashMap.put(uB, c0100q);
                        }
                        jVar.addLast(c0096mA);
                        ((C0100q) c0100q).a(c0096mA);
                        F1.E e13 = c0096mA.i.i;
                        if (e13 != null) {
                            i.i(c0096mA, i.e(e13.f1247m));
                        }
                        i15 = i19 + 1;
                        parcelableArr = parcelableArr2;
                        length = i17;
                    }
                    i.t();
                    i.f1274e = null;
                }
                Collection collectionValues = p089q4.z.X(v6.f1330a).values();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (!((F1.U) obj3).f1328b) {
                        arrayList2.add(obj3);
                    }
                }
                int i20 = 0;
                for (int size3 = arrayList2.size(); i20 < size3; size3 = size3) {
                    Object obj4 = arrayList2.get(i20);
                    i20++;
                    F1.U u6 = (F1.U) obj4;
                    Object obj5 = linkedHashMap.get(u6);
                    if (obj5 == null) {
                        C0100q c0100q2 = new C0100q(i, u6);
                        linkedHashMap.put(u6, c0100q2);
                        obj5 = c0100q2;
                    }
                    u6.getClass();
                    u6.f1327a = (C0100q) obj5;
                    u6.f1328b = true;
                }
                if (i.f1272c == null || !jVar.isEmpty()) {
                    interfaceC0458s = interfaceC0458s2;
                    i.b();
                } else {
                    if (i.f1275f || (activity = i.f1271b) == null || (intent = activity.getIntent()) == null) {
                        interfaceC0458s = interfaceC0458s2;
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            try {
                                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                            } catch (Exception unused) {
                                intent.toString();
                                intArray = null;
                            }
                        } else {
                            intArray = null;
                        }
                        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                        Bundle bundle3 = new Bundle();
                        Bundle bundle4 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                        if (bundle4 != null) {
                            bundle3.putAll(bundle4);
                        }
                        if ((intArray == null || intArray.length == 0) && (zVarL = (eH = i.h(jVar)).l(new C0031p0(intent), true, eH)) != null) {
                            F1.B b8 = zVarL.f1399h;
                            b8.getClass();
                            p089q4.j jVar2 = new p089q4.j();
                            F1.B b9 = b8;
                            while (true) {
                                F1.E e14 = b9.i;
                                if (e14 != null) {
                                    interfaceC0458s = interfaceC0458s2;
                                    if (e14.f1260r != b9.f1247m) {
                                    }
                                    if (!E4.k.a(e14, null) || e14 == null) {
                                        break;
                                    }
                                    b9 = e14;
                                    interfaceC0458s2 = interfaceC0458s;
                                } else {
                                    interfaceC0458s = interfaceC0458s2;
                                }
                                jVar2.addFirst(b9);
                                if (!E4.k.a(e14, null)) {
                                    break;
                                }
                                b9 = e14;
                                interfaceC0458s2 = interfaceC0458s;
                            }
                            List listS0 = p089q4.l.s0(jVar2);
                            ArrayList arrayList3 = new ArrayList(p089q4.n.P(listS0, 10));
                            Iterator it4 = listS0.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(Integer.valueOf(((F1.B) it4.next()).f1247m));
                            }
                            int[] iArrR0 = p089q4.l.r0(arrayList3);
                            Bundle bundleC = b8.c(zVarL.i);
                            if (bundleC != null) {
                                bundle3.putAll(bundleC);
                            }
                            iArr = iArrR0;
                            parcelableArrayList = null;
                        } else {
                            interfaceC0458s = interfaceC0458s2;
                            iArr = intArray;
                        }
                        if (iArr != null && iArr.length != 0) {
                            F1.E e15 = i.f1272c;
                            int length2 = iArr.length;
                            int i21 = 0;
                            while (true) {
                                if (i21 >= length2) {
                                    strV = null;
                                    break;
                                }
                                int i22 = iArr[i21];
                                if (i21 == 0) {
                                    F1.E e16 = i.f1272c;
                                    E4.k.c(e16);
                                    bK2 = e16.f1247m == i22 ? i.f1272c : null;
                                } else {
                                    E4.k.c(e15);
                                    bK2 = e15.k(i22, e15, false);
                                }
                                if (bK2 == null) {
                                    int i23 = F1.B.f1242p;
                                    strV = G4.a.v(context, i22);
                                    break;
                                }
                                if (i21 != iArr.length - 1 && (bK2 instanceof F1.E)) {
                                    while (true) {
                                        e8 = (F1.E) bK2;
                                        E4.k.c(e8);
                                        if (!(e8.k(e8.f1260r, e8, false) instanceof F1.E)) {
                                            break;
                                        } else {
                                            bK2 = e8.k(e8.f1260r, e8, false);
                                        }
                                    }
                                    e15 = e8;
                                }
                                i21++;
                            }
                            if (strV != null) {
                                intent.toString();
                            } else {
                                bundle3.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                int length3 = iArr.length;
                                Bundle[] bundleArr = new Bundle[length3];
                                for (int i24 = 0; i24 < length3; i24++) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putAll(bundle3);
                                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i24)) != null) {
                                        bundle5.putAll(bundle);
                                    }
                                    bundleArr[i24] = bundle5;
                                }
                                int flags = intent.getFlags();
                                int i25 = 268435456 & flags;
                                if (i25 != 0 && (flags & 32768) == 0) {
                                    intent.addFlags(32768);
                                    ArrayList arrayList4 = new ArrayList();
                                    ComponentName component = intent.getComponent();
                                    if (component == null) {
                                        component = intent.resolveActivity(context.getPackageManager());
                                    }
                                    if (component != null) {
                                        int size4 = arrayList4.size();
                                        try {
                                            for (Intent intentB = B(context, component); intentB != null; intentB = B(context, intentB.getComponent())) {
                                                arrayList4.add(size4, intentB);
                                            }
                                        } catch (PackageManager.NameNotFoundException e17) {
                                            throw new IllegalArgumentException(e17);
                                        }
                                    }
                                    arrayList4.add(intent);
                                    if (arrayList4.isEmpty()) {
                                        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                                    }
                                    Intent[] intentArr = (Intent[]) arrayList4.toArray(new Intent[0]);
                                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                    context.startActivities(intentArr, null);
                                    activity.finish();
                                    activity.overridePendingTransition(0, 0);
                                } else if (i25 != 0) {
                                    if (jVar.isEmpty()) {
                                        z5 = true;
                                    } else {
                                        F1.E e18 = i.f1272c;
                                        E4.k.c(e18);
                                        z5 = true;
                                        i.m(e18.f1247m, true, false);
                                    }
                                    int i26 = 0;
                                    while (i26 < iArr.length) {
                                        int i27 = iArr[i26];
                                        int i28 = i26 + 1;
                                        Bundle bundle6 = bundleArr[i26];
                                        F1.B bC2 = i.c(i27);
                                        if (bC2 == null) {
                                            int i29 = F1.B.f1242p;
                                            StringBuilder sbW2 = p012c.k.w("Deep Linking failed: destination ", G4.a.v(context, i27), " cannot be found from the current destination ");
                                            C0096m c0096m4 = (C0096m) jVar.l();
                                            sbW2.append(c0096m4 != null ? c0096m4.i : null);
                                            throw new IllegalStateException(sbW2.toString());
                                        }
                                        C0005c0 c0005c0 = new C0005c0(bC2, 9, i);
                                        F1.L l7 = new F1.L();
                                        c0005c0.invoke(l7);
                                        boolean z9 = l7.f1303b;
                                        k1 k1Var2 = l7.f1302a;
                                        i.j(bC2, bundle6, new F1.K(z9, l7.f1304c, l7.f1305d, false, l7.f1306e, k1Var2.f351a, k1Var2.f352b));
                                        i26 = i28;
                                        bundleArr = bundleArr;
                                        z5 = true;
                                    }
                                    i.f1275f = z5;
                                } else {
                                    F1.E e19 = i.f1272c;
                                    int length4 = iArr.length;
                                    for (int i30 = 0; i30 < length4; i30++) {
                                        int i31 = iArr[i30];
                                        Bundle bundle7 = bundleArr[i30];
                                        if (i30 == 0) {
                                            bK = i.f1272c;
                                        } else {
                                            E4.k.c(e19);
                                            bK = e19.k(i31, e19, false);
                                        }
                                        if (bK == null) {
                                            int i32 = F1.B.f1242p;
                                            throw new IllegalStateException("Deep Linking failed: destination " + G4.a.v(context, i31) + " cannot be found in graph " + e19);
                                        }
                                        if (i30 == iArr.length - 1) {
                                            F1.E e20 = i.f1272c;
                                            E4.k.c(e20);
                                            i.j(bK, bundle7, new F1.K(false, false, e20.f1247m, true, false, 0, 0));
                                        } else if (bK instanceof F1.E) {
                                            while (true) {
                                                e7 = (F1.E) bK;
                                                E4.k.c(e7);
                                                if (!(e7.k(e7.f1260r, e7, false) instanceof F1.E)) {
                                                    break;
                                                } else {
                                                    bK = e7.k(e7.f1260r, e7, false);
                                                }
                                            }
                                            e19 = e7;
                                        }
                                    }
                                    i.f1275f = true;
                                }
                            }
                        }
                    }
                    F1.B b10 = i.f1272c;
                    E4.k.c(b10);
                    i.j(b10, null, null);
                }
            }
            F1.U uB2 = v6.b("composable");
            G1.i iVar3 = uB2 instanceof G1.i ? (G1.i) uB2 : null;
            if (iVar3 == null) {
                C0235q0 c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new G1.B(i, e6, lVar, gVar, cVar, cVar2, cVar3, cVar4, i3, 1);
                    return;
                }
                return;
            }
            InterfaceC0203a0 interfaceC0203a0V = C0208d.v(iVar3.b().f1373e, c0230o);
            Object objK = c0230o.K();
            N.U u7 = C0222k.f3714a;
            if (objK == u7) {
                objK = C0208d.I(0.0f);
                c0230o.f0(objK);
            }
            C0209d0 c0209d0 = (C0209d0) objK;
            Object objK2 = c0230o.K();
            if (objK2 == u7) {
                objK2 = C0208d.K(Boolean.FALSE, N.U.f3673m);
                c0230o.f0(objK2);
            }
            InterfaceC0203a0 interfaceC0203a2 = (InterfaceC0203a0) objK2;
            boolean z10 = ((List) interfaceC0203a0V.getValue()).size() > 1;
            boolean zF = c0230o.f(interfaceC0203a0V) | c0230o.f(iVar3);
            Object objK3 = c0230o.K();
            if (zF || objK3 == u7) {
                objK3 = new G1.s(iVar3, c0209d0, interfaceC0203a0V, interfaceC0203a2, null);
                interfaceC0203a0 = interfaceC0203a0V;
                c0230o.f0(objK3);
            } else {
                interfaceC0203a0 = interfaceC0203a0V;
            }
            p006b.a.d(z10, (D4.e) objK3, c0230o, 0);
            InterfaceC0458s interfaceC0458s3 = interfaceC0458s;
            boolean zH = c0230o.h(i) | c0230o.h(interfaceC0458s3);
            Object objK4 = c0230o.K();
            if (zH || objK4 == u7) {
                objK4 = new C0005c0(i, 10, interfaceC0458s3);
                c0230o.f0(objK4);
            }
            C0208d.c(interfaceC0458s3, (D4.c) objK4, c0230o);
            W.g gVarU0 = p027e3.a.u0(c0230o);
            InterfaceC0203a0 interfaceC0203a0V2 = C0208d.v(i.f1278j, c0230o);
            Object objK5 = c0230o.K();
            if (objK5 == u7) {
                objK5 = C0208d.C(new C0039u(2, interfaceC0203a0V2));
                c0230o.f0(objK5);
            }
            V0 v7 = (V0) objK5;
            C0096m c0096m5 = (C0096m) p089q4.l.h0((List) v7.getValue());
            Object objK6 = c0230o.K();
            if (objK6 == u7) {
                objK6 = new LinkedHashMap();
                c0230o.f0(objK6);
            }
            Map map = (Map) objK6;
            c0230o.V(653353748);
            if (c0096m5 != null) {
                boolean zF2 = c0230o.f(iVar3) | ((((i8 & 3670016) ^ 1572864) > 1048576 && c0230o.f(cVar3)) || (i8 & 1572864) == 1048576) | ((i8 & 57344) == 16384);
                Object objK7 = c0230o.K();
                if (zF2 || objK7 == u7) {
                    c0096m = c0096m5;
                    iVar = iVar3;
                    G1.C c6 = new G1.C(iVar, cVar3, cVar, interfaceC0203a2, 0);
                    c0230o.f0(c6);
                    objK7 = c6;
                } else {
                    c0096m = c0096m5;
                    iVar = iVar3;
                }
                D4.c cVar5 = (D4.c) objK7;
                boolean zF3 = c0230o.f(iVar) | ((((29360128 & i8) ^ 12582912) > 8388608 && c0230o.f(cVar4)) || (i8 & 12582912) == 8388608) | ((458752 & i8) == 131072);
                Object objK8 = c0230o.K();
                if (zF3 || objK8 == u7) {
                    G1.C c7 = new G1.C(iVar, cVar4, cVar2, interfaceC0203a2, 1);
                    c0230o.f0(c7);
                    objK8 = c7;
                }
                D4.c cVar6 = (D4.c) objK8;
                boolean z11 = (234881024 & i8) == 67108864;
                Object objK9 = c0230o.K();
                if (z11 || objK9 == u7) {
                    int i33 = 1;
                    objK9 = new G1.y(i33, i33);
                    c0230o.f0(objK9);
                }
                D4.c cVar7 = (D4.c) objK9;
                Boolean bool = Boolean.TRUE;
                boolean zF4 = c0230o.f(iVar);
                Object objK10 = c0230o.K();
                if (zF4 || objK10 == u7) {
                    objK10 = new C0005c0(v7, 11, iVar);
                    c0230o.f0(objK10);
                }
                C0208d.c(bool, (D4.c) objK10, c0230o);
                Object objK11 = c0230o.K();
                if (objK11 == u7) {
                    objK11 = new p096s.Z(c0096m);
                    c0230o.f0(objK11);
                }
                p096s.Z z12 = (p096s.Z) objK11;
                Object obj6 = u0.f12124a;
                boolean zF5 = c0230o.f(z12);
                Object objK12 = c0230o.K();
                if (zF5 || objK12 == u7) {
                    objK12 = new o0(z12, null, "entry");
                    c0230o.f0(objK12);
                }
                o0 o0Var = (o0) objK12;
                if (z12 != null) {
                    c0230o.V(1030413636);
                    Object value = z12.f11917j.getValue();
                    Object value2 = z12.i.getValue();
                    boolean zF6 = c0230o.f(z12);
                    Object objK13 = c0230o.K();
                    if (zF6 || objK13 == u7) {
                        objK13 = new r0(z12, null);
                        c0230o.f0(objK13);
                    }
                    C0208d.f(value, value2, (D4.e) objK13, c0230o);
                    i6 = 0;
                    c0230o.p(false);
                } else {
                    gVarU0 = gVarU0;
                    i6 = 0;
                    c0230o.V(1030875195);
                    o0Var.a(z12.i.getValue(), c0230o, 0);
                    c0230o.p(false);
                }
                boolean zF7 = c0230o.f(o0Var);
                Object objK14 = c0230o.K();
                if (zF7 || objK14 == u7) {
                    objK14 = new t0(o0Var, i6);
                    c0230o.f0(objK14);
                }
                C0208d.c(o0Var, (D4.c) objK14, c0230o);
                if (i(interfaceC0203a2)) {
                    c0230o.V(-1218592968);
                    Float fValueOf = Float.valueOf(c0209d0.h());
                    boolean zF8 = c0230o.f(interfaceC0203a0) | c0230o.h(z12);
                    Object objK15 = c0230o.K();
                    if (zF8 || objK15 == u7) {
                        objK15 = new G1.u(z12, interfaceC0203a0, c0209d0, null);
                        c0230o.f0(objK15);
                    }
                    C0208d.e((D4.e) objK15, c0230o, fValueOf);
                    c0230o.p(false);
                    pVar = null;
                } else {
                    c0230o.V(-1218337931);
                    boolean zH2 = c0230o.h(z12) | c0230o.h(c0096m) | c0230o.f(o0Var);
                    Object objK16 = c0230o.K();
                    if (zH2 || objK16 == u7) {
                        pVar = null;
                        objK16 = new G1.w(z12, c0096m, o0Var, null);
                        c0230o.f0(objK16);
                    } else {
                        pVar = null;
                    }
                    C0208d.e((D4.e) objK16, c0230o, c0096m);
                    c0230o.p(false);
                }
                boolean zH3 = c0230o.h(map) | c0230o.f(iVar) | c0230o.f(cVar5) | c0230o.f(cVar6) | c0230o.f(cVar7);
                Object objK17 = c0230o.K();
                if (zH3 || objK17 == u7) {
                    G1.i iVar4 = iVar;
                    objK17 = new G1.x(map, iVar4, cVar5, cVar6, cVar7, v7, interfaceC0203a2);
                    iVar2 = iVar4;
                    interfaceC0203a1 = interfaceC0203a2;
                    c0230o.f0(objK17);
                } else {
                    iVar2 = iVar;
                    interfaceC0203a1 = interfaceC0203a2;
                }
                p081p0.c.s(o0Var, lVar, (D4.c) objK17, gVar, G1.y.i, V.b.c(820763100, new G1.z(gVarU0, interfaceC0203a1, v7), c0230o), c0230o, ((i8 >> 3) & 112) | 221184 | (i8 & 7168));
                c0230o2 = c0230o;
                Object objJ = o0Var.f12056a.j();
                Object value3 = o0Var.f12059d.getValue();
                boolean zF9 = c0230o2.f(o0Var) | c0230o2.f(iVar2) | c0230o2.h(map);
                Object objK18 = c0230o2.K();
                if (zF9 || objK18 == u7) {
                    G1.A a6 = new G1.A(o0Var, map, v7, iVar2, null);
                    c0230o2.f0(a6);
                    objK18 = a6;
                }
                C0208d.f(objJ, value3, (D4.e) objK18, c0230o2);
            } else {
                c0230o2 = c0230o;
                v6 = v6;
                pVar = null;
            }
            c0230o2.p(false);
            F1.U uB3 = v6.b("dialog");
            if (uB3 instanceof G1.p) {
                pVar = (G1.p) uB3;
            }
            if (pVar == null) {
                C0235q0 c0235q0T2 = c0230o2.t();
                if (c0235q0T2 != null) {
                    c0235q0T2.f3780d = new G1.B(i, e6, lVar, gVar, cVar, cVar2, cVar3, cVar4, i3, 2);
                    return;
                }
                return;
            }
            p027e3.a.G(pVar, c0230o2, 0);
        }
        C0235q0 c0235q0T3 = c0230o2.t();
        if (c0235q0T3 != null) {
            c0235q0T3.f3780d = new G1.B(i, e6, lVar, gVar, cVar, cVar2, cVar3, cVar4, i3, 0);
        }
    }

    public static final void h(F1.I i, HomeScreenRoute homeScreenRoute, Z.l lVar, Z.g gVar, p089q4.v vVar, D4.c cVar, D4.c cVar2, D4.c cVar3, D4.c cVar4, D4.c cVar5, C0230o c0230o, int i3) {
        Z.g gVar2;
        p089q4.v vVar2;
        Z.g gVar3;
        p089q4.v vVar3;
        Z.l lVar2;
        c0230o.X(-1476019057);
        int i6 = i3 | (c0230o.h(i) ? 4 : 2) | 224640;
        int i7 = (c0230o.h(cVar5) ? ' ' : (char) 16) | 6;
        if ((306783379 & i6) == 306783378 && (i7 & 19) == 18 && c0230o.B()) {
            c0230o.P();
            lVar2 = lVar;
            gVar3 = gVar;
            vVar3 = vVar;
        } else {
            c0230o.R();
            if ((i3 & 1) == 0 || c0230o.z()) {
                lVar = Z.l.f5957a;
                gVar2 = Z.b.f5933h;
                vVar2 = p089q4.v.f11238h;
            } else {
                c0230o.P();
                gVar2 = gVar;
                vVar2 = vVar;
            }
            c0230o.q();
            boolean zF = ((i7 & 112) == 32) | c0230o.f(null) | c0230o.f(homeScreenRoute);
            Object objK = c0230o.K();
            if (zF || objK == C0222k.f3714a) {
                F1.F f6 = new F1.F(i.f1290v, homeScreenRoute, vVar2);
                cVar5.invoke(f6);
                objK = f6.c();
                c0230o.f0(objK);
            }
            Z.l lVar3 = lVar;
            g(i, (F1.E) objK, lVar3, gVar2, cVar, cVar2, cVar3, cVar4, c0230o, (i6 & 8078) | 115040256);
            gVar3 = gVar2;
            vVar3 = vVar2;
            lVar2 = lVar3;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new G1.r(i, homeScreenRoute, lVar2, gVar3, vVar3, cVar, cVar2, cVar3, cVar4, cVar5, i3);
        }
    }

    public static final boolean i(InterfaceC0203a0 interfaceC0203a0) {
        return ((Boolean) interfaceC0203a0.getValue()).booleanValue();
    }

    public static final void j(K3.a aVar, D4.a aVar2, C0230o c0230o, int i) {
        c0230o.X(1039028189);
        C0208d.e(new C0268h0(aVar, aVar2, null), c0230o, p084p4.x.f10867a);
        float f6 = 16;
        L.L.b(androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.f6634a, 300), f6), A.e.a(f6), null, null, V.b.c(-1386671793, new C0272j0(0, aVar), c0230o), c0230o, 196614, 28);
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new N3.W(i, 0, aVar, aVar2);
        }
    }

    public static final void k(PaletteEditorRoute paletteEditorRoute, C0230o c0230o, int i) {
        Object next;
        E4.k.f("paletteRoute", paletteEditorRoute);
        c0230o.X(-478276517);
        if (((i | (c0230o.f(paletteEditorRoute) ? 4 : 2)) & 11) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            F1.I i3 = (F1.I) c0230o.k(P0.f4083b);
            c0230o.V(112303437);
            Object objK = c0230o.K();
            if (objK == C0222k.f3714a) {
                ListIterator listIterator = AbstractC0665d0.c().listIterator();
                do {
                    X.y yVar = (X.y) listIterator;
                    if (!yVar.hasNext()) {
                        next = null;
                        break;
                    }
                    next = yVar.next();
                } while (!E4.k.a(((Palette) next).getId(), paletteEditorRoute.getPaletteId()));
                Palette palette = (Palette) next;
                if (palette == null) {
                    String string = UUID.randomUUID().toString();
                    E4.k.e("toString(...)", string);
                    objK = new Palette(string, (String) null, 0, new ArrayList(), 6, (E4.g) null);
                } else {
                    objK = palette;
                }
                c0230o.f0(objK);
            }
            Palette palette2 = (Palette) objK;
            c0230o.p(false);
            C0208d.c(p084p4.x.f10867a, new M0(1, palette2), c0230o);
            J0.b(null, V.b.c(756910871, new Y0(i3, palette2), c0230o), null, null, null, 0, 0L, 0L, null, V.b.c(1442059756, new C0272j0(3, palette2), c0230o), c0230o, 805306416, 509);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0273k(i, 4, paletteEditorRoute);
        }
    }

    public static final void l(int i, C0230o c0230o) {
        c0230o.X(-1414139024);
        if (i == 0 && c0230o.B()) {
            c0230o.P();
        } else {
            F1.I i3 = (F1.I) c0230o.k(P0.f4083b);
            J0.b(null, V.b.c(-649961932, new C0257c(i3, 20), c0230o), null, null, V.b.c(-463191881, new C0257c(i3, 21), c0230o), 0, 0L, 0L, null, V.b.c(-730021505, new B0(i3, 1), c0230o), c0230o, 805330992, 493);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0253a(i, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    public static final void m(InterfaceC0070l interfaceC0070l, boolean z5, R0.h hVar, boolean z6, long j4, Z.o oVar, C0230o c0230o, int i) {
        int i3;
        int i6;
        long j6;
        boolean z7;
        long j7;
        InterfaceC0070l interfaceC0070l2 = interfaceC0070l;
        c0230o.X(-843755800);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? c0230o.f(interfaceC0070l2) : c0230o.h(interfaceC0070l2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.g(z5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.f(hVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.g(z6) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c0230o.f(oVar) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && c0230o.B()) {
            c0230o.P();
            j7 = j4;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                i6 = i3 & (-57345);
                j6 = 9205357640488583168L;
            } else {
                c0230o.P();
                i6 = i3 & (-57345);
                j6 = j4;
            }
            c0230o.q();
            R0.h hVar2 = R0.h.i;
            R0.h hVar3 = R0.h.f4743h;
            if (z5) {
                float f6 = F.B.f1080a;
                if ((hVar != hVar3 || z6) && !(hVar == hVar2 && z6)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
            } else {
                float f7 = F.B.f1080a;
                if ((hVar == hVar3 && !z6) || (hVar == hVar2 && z6)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
            }
            Z.d dVar = z7 ? Z.a.f5931b : Z.a.f5930a;
            int i7 = i6 & 14;
            boolean zG = ((i6 & 112) == 32) | (i7 == 4 || ((i6 & 8) != 0 && c0230o.h(interfaceC0070l2))) | c0230o.g(z7);
            Object objK = c0230o.K();
            if (zG || objK == C0222k.f3714a) {
                objK = new C0063e(interfaceC0070l2, z5, z7);
                c0230o.f0(objK);
            }
            Z.o oVarA = E0.i.a(oVar, false, (D4.c) objK);
            long j8 = j6;
            interfaceC0070l2 = interfaceC0070l;
            c(interfaceC0070l2, dVar, V.b.c(280174801, new C0061c((G0) c0230o.k(AbstractC1124c0.f14377q), j8, z7, oVarA, interfaceC0070l), c0230o), c0230o, i7 | 384);
            j7 = j8;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0062d(interfaceC0070l2, z5, hVar, z6, j7, oVar, i);
        }
    }

    public static final void n(Z.o oVar, D4.a aVar, boolean z5, C0230o c0230o, int i) {
        int i3;
        c0230o.X(2111672474);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(oVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (((i3 | (c0230o.h(aVar) ? 32 : 16) | (c0230o.g(z5) ? HueLog.LogComponent.STREAMDTLS : 128)) & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            AbstractC1070c.b(c0230o, Z.a.a(androidx.compose.foundation.layout.c.i(oVar, F.B.f1080a, F.B.f1081b), new L.Y0(2, aVar, z5)));
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0064f(oVar, aVar, z5, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    public static final Object o(List list, C0889j c0889j, p122w4.c cVar) throws Throwable {
        C0883d c0883d;
        List list2;
        E4.w wVar;
        Iterator it;
        Throwable th;
        D4.c cVar2;
        if (cVar instanceof C0883d) {
            c0883d = (C0883d) cVar;
            int i = c0883d.f11644n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0883d.f11644n = i - Integer.MIN_VALUE;
            } else {
                c0883d = new C0883d(cVar);
            }
        } else {
            c0883d = new C0883d(cVar);
        }
        Object obj = c0883d.f11643m;
        Object obj2 = v4.a.f13292h;
        int i3 = c0883d.f11644n;
        if (i3 != 0) {
            if (i3 == 1) {
                list2 = (List) c0883d.f11641k;
                O(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c0883d.f11642l;
                wVar = (E4.w) c0883d.f11641k;
                try {
                    O(obj);
                } catch (Throwable th2) {
                    Object obj3 = wVar.f1074h;
                    if (obj3 == null) {
                        wVar.f1074h = th2;
                    } else {
                        p081p0.c.D((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                cVar2 = (D4.c) it.next();
                c0883d.f11641k = wVar;
                c0883d.f11642l = it;
                c0883d.f11644n = 2;
                if (cVar2.invoke(c0883d) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) wVar.f1074h;
            if (th == null) {
                return p084p4.x.f10867a;
            }
            throw th;
        }
        O(obj);
        ArrayList arrayList = new ArrayList();
        C0885f c0885f = new C0885f(list, arrayList, null);
        c0883d.f11641k = arrayList;
        c0883d.f11644n = 1;
        if (c0889j.a(c0885f, c0883d) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        wVar = new E4.w();
        it = list2.iterator();
        while (it.hasNext()) {
            cVar2 = (D4.c) it.next();
            c0883d.f11641k = wVar;
            c0883d.f11642l = it;
            c0883d.f11644n = 2;
            if (cVar2.invoke(c0883d) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) wVar.f1074h;
        if (th == null) {
            return p084p4.x.f10867a;
        }
        throw th;
    }

    public static p009b2.k p(Set set, Set set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return new p009b2.k(set, set2);
    }

    public static final a5.h q(String str, a5.g[] gVarArr, D4.c cVar) {
        if (M4.l.i0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a5.a aVar = new a5.a(str);
        cVar.invoke(aVar);
        return new a5.h(str, a5.j.f6374j, aVar.f6342c.size(), p089q4.k.t0(gVarArr), aVar);
    }

    public static final a5.h r(String str, h0 h0Var, a5.g[] gVarArr, D4.c cVar) {
        E4.k.f("serialName", str);
        if (M4.l.i0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (h0Var.equals(a5.j.f6374j)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a5.a aVar = new a5.a(str);
        cVar.invoke(aVar);
        return new a5.h(str, h0Var, aVar.f6342c.size(), p089q4.k.t0(gVarArr), aVar);
    }

    public static a5.h s(String str, h0 h0Var, a5.g[] gVarArr) {
        E4.k.f("serialName", str);
        if (M4.l.i0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (h0Var.equals(a5.j.f6374j)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a5.a aVar = new a5.a(str);
        return new a5.h(str, h0Var, aVar.f6342c.size(), p089q4.k.t0(gVarArr), aVar);
    }

    public static void t(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbV = p012c.k.v(i, "radix ", " was not in valid range ");
            sbV.append(new J4.d(2, 36, 1));
            throw new IllegalArgumentException(sbV.toString());
        }
    }

    public static long u(InputStream inputStream, OutputStream outputStream) throws IOException {
        E4.k.f("<this>", inputStream);
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j4 = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j4 += (long) i;
            i = inputStream.read(bArr);
        }
        return j4;
    }

    public static final p084p4.j v(Throwable th) {
        E4.k.f("exception", th);
        return new p084p4.j(th);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final C0704e w(p019d0.c cVar, float f6) {
        int iCeil = ((int) Math.ceil(f6)) * 2;
        C0704e c0704eF = h0.f4942b;
        C0701b c0701bA = h0.f4943c;
        p044i0.b bVar = h0.f4944d;
        if (c0704eF == null || c0701bA == null) {
            c0704eF = p035g0.H.f(iCeil, iCeil, 1);
            h0.f4942b = c0704eF;
            c0701bA = p035g0.H.a(c0704eF);
            h0.f4943c = c0701bA;
        } else {
            Bitmap bitmap = c0704eF.f9060a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                c0704eF = p035g0.H.f(iCeil, iCeil, 1);
                h0.f4942b = c0704eF;
                c0701bA = p035g0.H.a(c0704eF);
                h0.f4943c = c0701bA;
            }
        }
        C0704e c0704e = c0704eF;
        C0701b c0701b = c0701bA;
        if (bVar == null) {
            bVar = new p044i0.b();
            h0.f4944d = bVar;
        }
        p044i0.b bVar2 = bVar;
        S0.k layoutDirection = cVar.f8571h.getLayoutDirection();
        Bitmap bitmap2 = c0704e.f9060a;
        long jF = h0.f(bitmap2.getWidth(), bitmap2.getHeight());
        p044i0.a aVar = bVar2.f9385h;
        S0.b bVar3 = aVar.f9381a;
        S0.k kVar = aVar.f9382b;
        InterfaceC0714o interfaceC0714o = aVar.f9383c;
        long j4 = aVar.f9384d;
        aVar.f9381a = cVar;
        aVar.f9382b = layoutDirection;
        aVar.f9383c = c0701b;
        aVar.f9384d = jF;
        c0701b.l();
        p044i0.d.k0(bVar2, p035g0.r.f9076b, bVar2.f(), 58);
        p044i0.d.k0(bVar2, p035g0.H.d(4278190080L), h0.f(f6, f6), 120);
        p044i0.d.c0(bVar2, p035g0.H.d(4278190080L), f6, p081p0.c.y(f6, f6), null, 120);
        c0701b.i();
        aVar.f9381a = bVar3;
        aVar.f9382b = kVar;
        aVar.f9383c = interfaceC0714o;
        aVar.f9384d = j4;
        return c0704e;
    }

    public static final boolean x(char c6, char c7, boolean z5) {
        if (c6 == c7) {
            return true;
        }
        if (!z5) {
            return false;
        }
        char upperCase = Character.toUpperCase(c6);
        char upperCase2 = Character.toUpperCase(c7);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final float y(float f6) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f6)) & 8589934591L) / ((long) 3))) + 709952852);
        float f7 = fIntBitsToFloat - ((fIntBitsToFloat - (f6 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f7 - ((f7 - (f6 / (f7 * f7))) * 0.33333334f);
    }

    public static L0.k z() {
        return L0.k.f3027l;
    }
}
