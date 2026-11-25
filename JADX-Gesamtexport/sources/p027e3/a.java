package p027e3;

import A.e;
import B.AbstractC0013g0;
import B.C0003b0;
import B.C0024m;
import B.C0036s0;
import B.D0;
import B.P;
import B.a1;
import E4.k;
import F.C0064f;
import F.InterfaceC0070l;
import F.Q;
import F.S;
import F1.B;
import F1.C0096m;
import F1.I;
import G0.E;
import G0.G;
import G1.p;
import L.AbstractC0151k;
import L.J0;
import L.L;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import N.U;
import N3.AbstractC0302z;
import N3.C0253a;
import N3.C0254a0;
import N3.C0257c;
import N3.C0259d;
import N3.C0263f;
import N3.C0264f0;
import N3.C0271j;
import N3.C0273k;
import N3.C0275l;
import N3.C0277m;
import N3.C0279n;
import N3.C0282o0;
import N3.C0288s;
import N3.C0292u;
import N3.C0296w;
import N3.K;
import N3.P0;
import N3.U0;
import R0.h;
import S0.d;
import S0.j;
import S1.V;
import T1.f;
import W.i;
import X.s;
import X.y;
import Z.b;
import Z.g;
import Z.l;
import Z.o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0454n;
import b5.c;
import c5.C0484e0;
import com.fasterxml.jackson.databind.deser.std.C0527x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.google.android.gms.internal.play_billing.O;
import com.google.protobuf.AbstractC0640h;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.C0688o0;
import com.nanjoran.ilightshow.Services.E0;
import com.nanjoran.ilightshow.Services.F0;
import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Services.PaletteColorSource;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import kotlinx.serialization.SerializationException;
import okhttp3.internal.http2.Http2;
import org.slf4j.Logger;
import p005a4.AbstractC0394b;
import p015c2.AbstractC0473d;
import p020d2.n;
import p035g0.C0704e;
import p035g0.r;
import p058l0.C0823f;
import p084p4.x;
import p089q4.m;
import p091r0.u;
import p113v0.C1025h;
import p113v0.C1026i;
import p113v0.F;
import p113v0.InterfaceC1033p;
import p123x.AbstractC1084q;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;
import p130y0.AbstractC1148o0;
import p130y0.G0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c, b5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f8731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f8732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0823f f8733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C0823f f8734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C0823f f8735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f8736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f8737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f8738h;
    public static Boolean i;

    public static String A0(int i3) {
        if (i3 == 0) {
            return "Unspecified";
        }
        if (i3 == 1) {
            return "Text";
        }
        if (i3 == 2) {
            return "Ascii";
        }
        if (i3 == 3) {
            return "Number";
        }
        if (i3 == 4) {
            return "Phone";
        }
        if (i3 == 5) {
            return "Uri";
        }
        if (i3 == 6) {
            return "Email";
        }
        if (i3 == 7) {
            return "Password";
        }
        if (i3 == 8) {
            return "NumberPassword";
        }
        return i3 == 9 ? "Decimal" : "Invalid";
    }

    public static final String B0(float f6) {
        if (Float.isNaN(f6)) {
            return "NaN";
        }
        if (Float.isInfinite(f6)) {
            return f6 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f7 = f6 * fPow;
        int i3 = (int) f7;
        if (f7 - i3 >= 0.5f) {
            i3++;
        }
        float f8 = i3 / fPow;
        return iMax > 0 ? String.valueOf(f8) : String.valueOf((int) f8);
    }

    public static int C0(Parcel parcel) {
        int i3 = parcel.readInt();
        int iT0 = t0(parcel, i3);
        char c6 = (char) i3;
        int iDataPosition = parcel.dataPosition();
        if (c6 != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i3))), parcel);
        }
        int i6 = iT0 + iDataPosition;
        if (i6 >= iDataPosition && i6 <= parcel.dataSize()) {
            return i6;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i6).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i6);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static final void D(final o oVar, final Palette palette, final InterfaceC0203a0 interfaceC0203a0, C0230o c0230o, final int i3) {
        C0230o c0230o2 = c0230o;
        k.f(PaletteColorSource.DISPLAY_PALETTE, palette);
        c0230o2.X(547609533);
        c0230o2.V(-320869800);
        Object objK = c0230o2.K();
        U u6 = C0222k.f3714a;
        U u7 = U.f3673m;
        boolean z5 = false;
        if (objK == u6) {
            objK = C0208d.K(0, u7);
            c0230o2.f0(objK);
        }
        InterfaceC0203a0 interfaceC0203a1 = (InterfaceC0203a0) objK;
        Object objD = AbstractC0013g0.d(-320868093, c0230o2, false);
        if (objD == u6) {
            objD = C0208d.K(new j(0L), u7);
            c0230o2.f0(objD);
        }
        InterfaceC0203a0 interfaceC0203a2 = (InterfaceC0203a0) objD;
        Object objD2 = AbstractC0013g0.d(-320863001, c0230o2, false);
        if (objD2 == u6) {
            objD2 = new s();
            c0230o2.f0(objD2);
        }
        s sVar = (s) objD2;
        c0230o2.p(false);
        g gVar = b.f5936l;
        o oVarE = androidx.compose.ui.layout.a.e(oVar, new C0271j(0, interfaceC0203a2, sVar, palette));
        F fE = AbstractC1084q.e(gVar, false);
        int i6 = c0230o2.f3744P;
        InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
        o oVarC = Z.a.c(c0230o2, oVarE);
        InterfaceC1102j.f14043g.getClass();
        C1106n c1106n = C1101i.f14038b;
        c0230o2.Z();
        if (c0230o2.f3743O) {
            c0230o2.l(c1106n);
        } else {
            c0230o2.i0();
        }
        C0208d.R(C1101i.f14041e, c0230o2, fE);
        C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M);
        C1100h c1100h = C1101i.f14042f;
        if (c0230o2.f3743O || !k.a(c0230o2.K(), Integer.valueOf(i6))) {
            p012c.k.y(i6, c0230o2, i6, c1100h);
        }
        C0208d.R(C1101i.f14039c, c0230o2, oVarC);
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f6633a;
        E(androidx.compose.foundation.layout.c.f6635b, c0230o2, 6);
        InterfaceC0203a0 interfaceC0203a3 = interfaceC0203a2;
        AbstractC1084q.a(u.a(bVar.b(), x.f10867a, new C0288s(sVar, palette, interfaceC0203a0, interfaceC0203a2, interfaceC0203a1, null)), c0230o2, 0);
        float f6 = 35;
        c0230o2.V(944957390);
        ListIterator listIterator = sVar.listIterator();
        int i7 = 0;
        while (true) {
            y yVar = (y) listIterator;
            boolean zHasNext = yVar.hasNext();
            l lVar = l.f5957a;
            if (!zHasNext) {
                final s sVar2 = sVar;
                c0230o2.p(z5);
                c0230o2.V(944991339);
                final int i8 = -1;
                if (((Number) interfaceC0203a0.getValue()).intValue() != -1) {
                    ListIterator listIterator2 = sVar2.listIterator();
                    int i9 = 0;
                    while (true) {
                        y yVar2 = (y) listIterator2;
                        if (!yVar2.hasNext()) {
                            break;
                        }
                        if (((U0) ((InterfaceC0203a0) yVar2.next()).getValue()).f4127a == ((Number) interfaceC0203a0.getValue()).intValue()) {
                            i8 = i9;
                            break;
                        }
                        i9++;
                    }
                    L.d(new D4.a() { // from class: N3.o
                        @Override // D4.a
                        public final Object invoke() {
                            U0 u0;
                            X.s sVar3 = sVar2;
                            Palette palette2 = palette;
                            E4.k.f("$palette", palette2);
                            int i10 = i8;
                            sVar3.remove(i10);
                            palette2.getColors().remove(i10);
                            InterfaceC0203a0 interfaceC0203a4 = (InterfaceC0203a0) p089q4.l.h0(sVar3);
                            interfaceC0203a0.setValue(Integer.valueOf((interfaceC0203a4 == null || (u0 = (U0) interfaceC0203a4.getValue()) == null) ? -1 : u0.f4127a));
                            return p084p4.x.f10867a;
                        }
                    }, androidx.compose.foundation.layout.c.h(androidx.compose.foundation.a.b(bVar.a(lVar, b.f5934j), ((U0) ((InterfaceC0203a0) sVar2.get(i8)).getValue()).f4130d.m2toAndroidColor0d7_KjU(), e.f6a), 32), false, null, null, AbstractC0302z.f4323a, c0230o, 196608, 28);
                    c0230o2 = c0230o;
                }
                c0230o2.p(false);
                c0230o2.p(true);
                C0235q0 c0235q0T = c0230o2.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new D4.e(palette, interfaceC0203a0, i3) { // from class: N3.p
                        public final /* synthetic */ Palette i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC0203a0 f4238j;

                        @Override // D4.e
                        public final Object d(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            Palette palette2 = this.i;
                            E4.k.f("$palette", palette2);
                            int iV = C0208d.V(449);
                            p027e3.a.D(this.f4237h, palette2, this.f4238j, (C0230o) obj, iV);
                            return p084p4.x.f10867a;
                        }
                    };
                    return;
                }
                return;
            }
            Object next = yVar.next();
            int i10 = i7 + 1;
            if (i7 < 0) {
                m.O();
                throw null;
            }
            InterfaceC0203a0 interfaceC0203a4 = (InterfaceC0203a0) next;
            c0230o2.T(1219560203, Integer.valueOf(((U0) interfaceC0203a4.getValue()).f4127a));
            boolean z6 = ((Number) interfaceC0203a0.getValue()).intValue() != ((U0) interfaceC0203a4.getValue()).f4127a ? z5 : true;
            int i11 = ((U0) interfaceC0203a4.getValue()).f4127a;
            float f7 = (-f6) / 2;
            o oVarA = bVar.a(androidx.compose.foundation.layout.a.e(androidx.compose.foundation.layout.c.h(lVar, f6), f7, f7), b.f5933h);
            c0230o2.V(1219569126);
            Object objK2 = c0230o2.K();
            if (objK2 == u6) {
                objK2 = new C0275l(0, interfaceC0203a3);
                c0230o2.f0(objK2);
            }
            D4.a aVar = (D4.a) objK2;
            c0230o2.p(false);
            c0230o2.V(1219577724);
            boolean zF = c0230o2.f(interfaceC0203a4);
            InterfaceC0203a0 interfaceC0203a5 = interfaceC0203a3;
            Object objK3 = c0230o2.K();
            if (zF || objK3 == u6) {
                objK3 = new C0277m(interfaceC0203a0, interfaceC0203a4, 0);
                c0230o2.f0(objK3);
            }
            z5 = false;
            c0230o2.p(false);
            H(i11, z6, interfaceC0203a4, aVar, oVarA, (D4.a) objK3, new C0279n(palette, i7), c0230o2, 3072);
            c0230o2.p(false);
            i7 = i10;
            interfaceC0203a3 = interfaceC0203a5;
            sVar = sVar;
        }
    }

    public static void D0(Parcel parcel, int i3, int i6) {
        int iT0 = t0(parcel, i3);
        if (iT0 == i6) {
            return;
        }
        String hexString = Integer.toHexString(iT0);
        int length = String.valueOf(i6).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iT0).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i6);
        sb.append(" got ");
        sb.append(iT0);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static final void E(o oVar, C0230o c0230o, int i3) {
        c0230o.X(1972950571);
        if ((i3 & 11) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.V(-1748244869);
            Object objK = c0230o.K();
            Object obj = C0222k.f3714a;
            if (objK == obj) {
                objK = C0208d.K(new j(0L), U.f3673m);
                c0230o.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
            Object objD = AbstractC0013g0.d(-1748241429, c0230o, false);
            if (objD == obj) {
                objD = new C0259d(1, interfaceC0203a0);
                c0230o.f0(objD);
            }
            c0230o.p(false);
            o oVarE = androidx.compose.ui.layout.a.e(oVar, (D4.c) objD);
            F fE = AbstractC1084q.e(b.f5933h, false);
            int i6 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            o oVarC = Z.a.c(c0230o, oVarE);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, fE);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !k.a(c0230o.K(), Integer.valueOf(i6))) {
                p012c.k.y(i6, c0230o, i6, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            c0230o.V(-1308268757);
            if (((int) (((j) interfaceC0203a0.getValue()).f4896a >> 32)) > 0 && ((int) (((j) interfaceC0203a0.getValue()).f4896a & 4294967295L)) > 0) {
                int iMin = Math.min((int) (((j) interfaceC0203a0.getValue()).f4896a >> 32), (int) (((j) interfaceC0203a0.getValue()).f4896a & 4294967295L));
                C0704e c0704eC = AbstractC0473d.C(R.drawable.color_wheel, c0230o);
                o oVarH = androidx.compose.foundation.layout.c.h(l.f5957a, ((S0.b) c0230o.k(AbstractC1124c0.f14367f)).i0(iMin));
                c0230o.V(-1308253747);
                boolean zD = c0230o.d(iMin);
                Object objK2 = c0230o.K();
                if (zD || objK2 == obj) {
                    objK2 = new C0279n(iMin, interfaceC0203a0);
                    c0230o.f0(objK2);
                }
                c0230o.p(false);
                o oVarA = androidx.compose.ui.draw.a.a(oVarH, (D4.c) objK2);
                g gVar = b.f5936l;
                C1025h c1025h = C1026i.f13168a;
                boolean zF = c0230o.f(c0704eC);
                Object objK3 = c0230o.K();
                if (zF || objK3 == obj) {
                    p053k0.a aVar = new p053k0.a(c0704eC, AbstractC0473d.b(c0704eC.f9060a.getWidth(), c0704eC.f9060a.getHeight()));
                    aVar.f9928g = 1;
                    c0230o.f0(aVar);
                    objK3 = aVar;
                }
                V.d((p053k0.a) objK3, null, oVarA, gVar, c1025h, 1.0f, null, c0230o, 48, 0);
            }
            c0230o.p(false);
            c0230o.p(true);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0273k(i3, 0, oVar);
        }
    }

    public static /* synthetic */ boolean E0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, O o6, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(o6, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(o6) != obj && atomicReferenceFieldUpdater.get(o6) != obj) {
                return false;
            }
        }
        return true;
    }

    public static final d F(Context context) {
        float f6 = context.getResources().getConfiguration().fontScale;
        float f7 = context.getResources().getDisplayMetrics().density;
        T0.a aVarA = T0.b.a(f6);
        if (aVarA == null) {
            aVarA = new S0.l(f6);
        }
        return new d(f7, f6, aVarA);
    }

    public static final void G(p pVar, C0230o c0230o, int i3) {
        p pVar2;
        C0230o c0230o2;
        p pVar3 = pVar;
        C0230o c0230o3 = c0230o;
        c0230o3.X(294589392);
        int i6 = i3 | (c0230o3.f(pVar3) ? 4 : 2);
        if ((i6 & 3) == 2 && c0230o3.B()) {
            c0230o3.P();
            pVar2 = pVar3;
            c0230o2 = c0230o3;
        } else {
            W.g gVarU0 = u0(c0230o3);
            InterfaceC0203a0 interfaceC0203a0V = C0208d.v(pVar3.b().f1373e, c0230o3);
            List list = (List) interfaceC0203a0V.getValue();
            boolean zBooleanValue = ((Boolean) c0230o3.k(AbstractC1148o0.f14437a)).booleanValue();
            boolean zF = c0230o3.f(list);
            Object objK = c0230o3.K();
            U u6 = C0222k.f3714a;
            Object obj = objK;
            if (zF || objK == u6) {
                s sVar = new s();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    C0096m c0096m = (C0096m) obj2;
                    if (zBooleanValue || c0096m.f1359o.f7001c.compareTo(EnumC0454n.f6993k) >= 0) {
                        arrayList.add(obj2);
                    }
                }
                sVar.addAll(arrayList);
                c0230o3.f0(sVar);
                obj = sVar;
            }
            s sVar2 = (s) obj;
            J(sVar2, (List) interfaceC0203a0V.getValue(), c0230o3, 0);
            InterfaceC0203a0 interfaceC0203a0V2 = C0208d.v(pVar3.b().f1374f, c0230o3);
            Object objK2 = c0230o3.K();
            if (objK2 == u6) {
                objK2 = new s();
                c0230o3.f0(objK2);
            }
            s sVar3 = (s) objK2;
            c0230o3.V(1361037007);
            ListIterator listIterator = sVar2.listIterator();
            C0230o c0230o4 = c0230o3;
            while (true) {
                y yVar = (y) listIterator;
                if (!yVar.hasNext()) {
                    break;
                }
                C0096m c0096m2 = (C0096m) yVar.next();
                B b6 = c0096m2.i;
                k.d("null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination", b6);
                G1.o oVar = (G1.o) b6;
                boolean zH = ((i6 & 14) == 4) | c0230o4.h(c0096m2);
                Object objK3 = c0230o4.K();
                if (zH || objK3 == u6) {
                    objK3 = new C0024m(pVar3, 6, c0096m2);
                    c0230o4.f0(objK3);
                }
                C0230o c0230o5 = c0230o4;
                p006b.a.a((D4.a) objK3, oVar.f1637q, V.b.c(1129586364, new G1.l(c0096m2, pVar3, gVarU0, sVar3, oVar), c0230o4), c0230o5, 384, 0);
                sVar3 = sVar3;
                pVar3 = pVar3;
                c0230o4 = c0230o5;
                gVarU0 = gVarU0;
            }
            pVar2 = pVar3;
            C0230o c0230o6 = c0230o4;
            s sVar4 = sVar3;
            c0230o6.p(false);
            Set set = (Set) interfaceC0203a0V2.getValue();
            boolean zF2 = c0230o6.f(interfaceC0203a0V2) | ((i6 & 14) == 4);
            Object objK4 = c0230o6.K();
            if (zF2 || objK4 == u6) {
                objK4 = new G1.m(interfaceC0203a0V2, pVar2, sVar4, null);
                c0230o6.f0(objK4);
            }
            C0208d.f(set, sVar4, (D4.e) objK4, c0230o6);
            c0230o2 = c0230o6;
        }
        C0235q0 c0235q0T = c0230o2.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0003b0(i3, 4, pVar2);
        }
    }

    public static final void H(final int i3, final boolean z5, final InterfaceC0203a0 interfaceC0203a0, final D4.a aVar, final o oVar, final D4.a aVar2, final D4.c cVar, C0230o c0230o, final int i6) {
        InterfaceC0203a0 interfaceC0203a1;
        float f6;
        k.f("parentSizeProvider", aVar);
        c0230o.X(64796508);
        int i7 = i6 | (c0230o.g(z5) ? 32 : 16) | (c0230o.f(interfaceC0203a0) ? 256 : 128) | (c0230o.f(oVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (c0230o.h(aVar2) ? 131072 : 65536) | (c0230o.h(cVar) ? 1048576 : 524288);
        if ((2995921 & i7) == 599184 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.V(184425066);
            Object objK = c0230o.K();
            U u6 = C0222k.f3714a;
            if (objK == u6) {
                objK = C0208d.K(Boolean.FALSE, U.f3673m);
                c0230o.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a2 = (InterfaceC0203a0) objK;
            c0230o.p(false);
            c0230o.V(184428841);
            int i8 = i7 & 896;
            boolean z6 = i8 == 256;
            Object objK2 = c0230o.K();
            if (z6 || objK2 == u6) {
                objK2 = new C0263f(aVar, 1, interfaceC0203a0);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            o oVarD = androidx.compose.foundation.layout.a.d(oVar, (D4.c) objK2);
            x xVar = x.f10867a;
            c0230o.V(184457010);
            int i9 = 458752 & i7;
            boolean z7 = i9 == 131072;
            Object objK3 = c0230o.K();
            if (z7 || objK3 == u6) {
                objK3 = new C0292u(aVar2, interfaceC0203a2, null);
                c0230o.f0(objK3);
            }
            c0230o.p(false);
            o oVarA = u.a(oVarD, xVar, (D4.e) objK3);
            c0230o.V(184469645);
            boolean z8 = (i9 == 131072) | (i8 == 256) | ((i7 & 3670016) == 1048576);
            Object objK4 = c0230o.K();
            if (z8 || objK4 == u6) {
                interfaceC0203a1 = interfaceC0203a2;
                C0296w c0296w = new C0296w(aVar2, interfaceC0203a0, interfaceC0203a1, aVar, cVar, null);
                c0230o.f0(c0296w);
                objK4 = c0296w;
            } else {
                interfaceC0203a1 = interfaceC0203a2;
            }
            c0230o.p(false);
            o oVarA2 = u.a(oVarA, xVar, (D4.e) objK4);
            if (((Boolean) interfaceC0203a1.getValue()).booleanValue()) {
                f6 = 1.4f;
            } else {
                f6 = z5 ? 1.2f : 1.0f;
            }
            A.d dVar = e.f6a;
            AbstractC1084q.a(p081p0.c.F(androidx.compose.foundation.a.b(n.N(AbstractC0599v0.H(oVarA2, f6), 10, dVar, 28), ((U0) interfaceC0203a0.getValue()).f4130d.m2toAndroidColor0d7_KjU(), dVar), 2, r.f9080f, dVar), c0230o, 0);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new D4.e(i3, z5, interfaceC0203a0, aVar, oVar, aVar2, cVar, i6) { // from class: N3.q

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f4241h;
                public final /* synthetic */ boolean i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0203a0 f4242j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ D4.a f4243k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ Z.o f4244l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ D4.a f4245m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ D4.c f4246n;

                @Override // D4.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    InterfaceC0203a0 interfaceC0203a3 = this.f4242j;
                    D4.a aVar3 = this.f4243k;
                    E4.k.f("$parentSizeProvider", aVar3);
                    int iV = C0208d.V(3073);
                    D4.c cVar2 = this.f4246n;
                    p027e3.a.H(this.f4241h, this.i, interfaceC0203a3, aVar3, this.f4244l, this.f4245m, cVar2, (C0230o) obj, iV);
                    return p084p4.x.f10867a;
                }
            };
        }
    }

    public static final void I(int i3, C0230o c0230o) {
        I i6;
        InterfaceC0203a0 interfaceC0203a0;
        U u6;
        U u7;
        boolean z5;
        InterfaceC0203a0 interfaceC0203a1;
        InterfaceC0203a0 interfaceC0203a2;
        I i7;
        U u8;
        InterfaceC0203a0 interfaceC0203a3;
        InterfaceC0203a0 interfaceC0203a4;
        C0230o c0230o2 = c0230o;
        c0230o2.X(589773518);
        if (i3 == 0 && c0230o2.B()) {
            c0230o2.P();
        } else {
            I i8 = (I) c0230o2.k(P0.f4083b);
            M m6 = M.f8305O;
            m6.p();
            c0230o2.V(1362665049);
            Object objK = c0230o2.K();
            U u9 = C0222k.f3714a;
            U u10 = U.f3673m;
            if (objK == u9) {
                objK = C0208d.K(null, u10);
                c0230o2.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a5 = (InterfaceC0203a0) objK;
            Object objD = AbstractC0013g0.d(1362667408, c0230o2, false);
            if (objD == u9) {
                objD = C0208d.K(Boolean.FALSE, u10);
                c0230o2.f0(objD);
            }
            InterfaceC0203a0 interfaceC0203a6 = (InterfaceC0203a0) objD;
            Object objD2 = AbstractC0013g0.d(1362669230, c0230o2, false);
            if (objD2 == u9) {
                objD2 = C0208d.K(Boolean.valueOf(m6.o()), u10);
                c0230o2.f0(objD2);
            }
            InterfaceC0203a0 interfaceC0203a7 = (InterfaceC0203a0) objD2;
            c0230o2.p(false);
            c0230o2.V(1362672314);
            if (((D3.j) interfaceC0203a5.getValue()) != null) {
                c0230o2.V(1362674154);
                Object objK2 = c0230o2.K();
                if (objK2 == u9) {
                    objK2 = new C0275l(12, interfaceC0203a5);
                    c0230o2.f0(objK2);
                }
                c0230o2.p(false);
                interfaceC0203a1 = interfaceC0203a6;
                z5 = false;
                interfaceC0203a0 = interfaceC0203a5;
                interfaceC0203a2 = interfaceC0203a7;
                u7 = u10;
                u6 = u9;
                i6 = i8;
                AbstractC0151k.a((D4.a) objK2, V.b.c(-265726367, new C0254a0(4, interfaceC0203a5), c0230o2), null, V.b.c(-2132435041, new C0254a0(5, interfaceC0203a5), c0230o2), K.f4001c, K.f4002d, null, 0L, 0L, 0L, 0L, 0.0f, null, c0230o, 1772598, 16276);
                c0230o2 = c0230o;
            } else {
                i6 = i8;
                interfaceC0203a0 = interfaceC0203a5;
                u6 = u9;
                u7 = u10;
                z5 = false;
                interfaceC0203a1 = interfaceC0203a6;
                interfaceC0203a2 = interfaceC0203a7;
            }
            c0230o2.p(z5);
            c0230o2.V(1362701415);
            if (((Boolean) interfaceC0203a1.getValue()).booleanValue()) {
                c0230o2.V(1362702784);
                Object objK3 = c0230o2.K();
                U u11 = u6;
                if (objK3 == u11) {
                    interfaceC0203a4 = interfaceC0203a1;
                    objK3 = new C0275l(13, interfaceC0203a4);
                    c0230o2.f0(objK3);
                } else {
                    interfaceC0203a4 = interfaceC0203a1;
                }
                c0230o2.p(z5);
                I i9 = i6;
                i7 = i9;
                u8 = u11;
                interfaceC0203a3 = interfaceC0203a4;
                AbstractC0151k.a((D4.a) objK3, V.b.c(1310956632, new C0264f0(i9, interfaceC0203a4, 1), c0230o2), null, V.b.c(-1594716650, new C0254a0(6, interfaceC0203a4), c0230o2), K.f4005g, K.f4006h, null, 0L, 0L, 0L, 0L, 0.0f, null, c0230o, 1772598, 16276);
                c0230o2 = c0230o;
            } else {
                i7 = i6;
                u8 = u6;
                interfaceC0203a3 = interfaceC0203a1;
            }
            Object objD3 = AbstractC0013g0.d(1362793008, c0230o2, z5);
            if (objD3 == u8) {
                objD3 = C0208d.K(Boolean.FALSE, u7);
                c0230o2.f0(objD3);
            }
            c0230o2.p(z5);
            I i10 = i7;
            J0.b(null, V.b.c(-1643467886, new C0257c(i10, 13), c0230o2), null, null, null, 0, 0L, 0L, null, V.b.c(2141153117, new C0282o0(i10, interfaceC0203a2, interfaceC0203a3, interfaceC0203a0), c0230o2), c0230o2, 805306416, 509);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0253a(i3, 8);
        }
    }

    public static final void J(s sVar, List list, C0230o c0230o, int i3) {
        c0230o.X(1537894851);
        if ((((c0230o.h(sVar) ? 4 : 2) | i3 | (c0230o.h(list) ? 32 : 16)) & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            boolean zBooleanValue = ((Boolean) c0230o.k(AbstractC1148o0.f14437a)).booleanValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0096m c0096m = (C0096m) it.next();
                C0460u c0460u = c0096m.f1359o;
                boolean zG = c0230o.g(zBooleanValue) | c0230o.h(sVar) | c0230o.h(c0096m);
                Object objK = c0230o.K();
                if (zG || objK == C0222k.f3714a) {
                    objK = new P(c0096m, sVar, zBooleanValue);
                    c0230o.f0(objK);
                }
                C0208d.c(c0460u, (D4.c) objK, c0230o);
            }
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new A2.d(i3, 3, sVar, list);
        }
    }

    public static final void K(boolean z5, h hVar, F.P p6, C0230o c0230o, int i3) {
        int i6;
        c0230o.X(-1344558920);
        if ((i3 & 6) == 0) {
            i6 = (c0230o.g(z5) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= c0230o.f(hVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= c0230o.h(p6) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i6 & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            int i7 = i6 & 14;
            boolean zF = (i7 == 4) | c0230o.f(p6);
            Object objK = c0230o.K();
            Object obj = C0222k.f3714a;
            if (zF || objK == obj) {
                objK = new F.O(p6, z5);
                c0230o.f0(objK);
            }
            D0 d1 = (D0) objK;
            boolean zH = c0230o.h(p6) | (i7 == 4);
            Object objK2 = c0230o.K();
            if (zH || objK2 == obj) {
                objK2 = new Q(p6, z5);
                c0230o.f0(objK2);
            }
            InterfaceC0070l interfaceC0070l = (InterfaceC0070l) objK2;
            boolean zF2 = G0.I.f(p6.j().f3454b);
            l lVar = l.f5957a;
            boolean zH2 = c0230o.h(d1);
            Object objK3 = c0230o.K();
            if (zH2 || objK3 == obj) {
                objK3 = new S(d1, null);
                c0230o.f0(objK3);
            }
            V.m(interfaceC0070l, z5, hVar, zF2, 0L, u.a(lVar, d1, (D4.e) objK3), c0230o, (i6 << 3) & 1008);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0064f(z5, hVar, p6, i3);
        }
    }

    public static final void L(InterfaceC0203a0 interfaceC0203a0, D3.l lVar) {
        M m6 = M.f8305O;
        E0 e6 = E0.f8249o;
        C0688o0 c0688o0L = m6.l();
        boolean zS = m6.s(lVar);
        s sVar = lVar.f814e;
        if (zS) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(sVar);
            s sVar2 = m6.f8339z;
            sVar2.removeAll(arrayList);
            m6.E(new ArrayList(sVar2));
            return;
        }
        if (sVar.size() + m6.k().size() >= m6.f8315a && e6.a() == F0.NONE && c0688o0L.b() <= 0) {
            interfaceC0203a0.setValue(Boolean.TRUE);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(sVar);
        m6.c(arrayList2);
    }

    public static final long M(C0036s0 c0036s0, p030f0.d dVar, p030f0.d dVar2, int i3) {
        long jH0 = h0(c0036s0, dVar, i3);
        if (G0.I.b(jH0)) {
            return G0.I.f1468b;
        }
        long jH1 = h0(c0036s0, dVar2, i3);
        if (G0.I.b(jH1)) {
            return G0.I.f1468b;
        }
        int i6 = (int) (jH0 >> 32);
        int i7 = (int) (jH1 & 4294967295L);
        return AbstractC0599v0.d(Math.min(i6, i6), Math.max(i7, i7));
    }

    public static final boolean N(G g6, int i3) {
        int iE = g6.e(i3);
        return i3 == g6.h(iE) || i3 == g6.d(iE, false) ? g6.i(i3) != g6.a(i3) : g6.a(i3) != g6.a(i3 - 1);
    }

    public static long O(AtomicLong atomicLong, long j4) {
        long j6;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j6, P(j6, j4)));
        return j6;
    }

    public static long P(long j4, long j6) {
        long j7 = j4 + j6;
        if (j7 < 0) {
            return Long.MAX_VALUE;
        }
        return j7;
    }

    public static final InterfaceC0203a0 Q(p117w.m mVar, C0230o c0230o, int i3) {
        Object objK = c0230o.K();
        U u6 = C0222k.f3714a;
        if (objK == u6) {
            objK = C0208d.K(Boolean.FALSE, U.f3673m);
            c0230o.f0(objK);
        }
        InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
        boolean z5 = (((i3 & 14) ^ 6) > 4 && c0230o.f(mVar)) || (i3 & 6) == 4;
        Object objK2 = c0230o.K();
        if (z5 || objK2 == u6) {
            objK2 = new p117w.h(mVar, interfaceC0203a0, null);
            c0230o.f0(objK2);
        }
        C0208d.e((D4.e) objK2, c0230o, mVar);
        return interfaceC0203a0;
    }

    public static int R(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static Parcelable S(Parcel parcel, int i3, Parcelable.Creator creator) {
        int iT0 = t0(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iT0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iT0);
        return parcelable;
    }

    public static String T(Parcel parcel, int i3) {
        int iT0 = t0(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iT0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iT0);
        return string;
    }

    public static Object[] U(Parcel parcel, int i3, Parcelable.Creator creator) {
        int iT0 = t0(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iT0 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iT0);
        return objArrCreateTypedArray;
    }

    public static androidx.lifecycle.O V(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            k.e("{\n            modelClass…).newInstance()\n        }", objNewInstance);
            return (androidx.lifecycle.O) objNewInstance;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }

    public static final byte[] X(Mac mac, byte[] bArr, byte[] bArr2, int i3) {
        int macLength = mac.getMacLength();
        byte[] bArr3 = new byte[bArr.length + macLength + bArr2.length];
        byte[] bArr4 = new byte[i3];
        try {
            System.arraycopy(bArr, 0, bArr3, macLength, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length + macLength, bArr2.length);
            mac.update(bArr);
            mac.update(bArr2);
            int i6 = 0;
            while (true) {
                mac.doFinal(bArr3, 0);
                mac.update(bArr3);
                int i7 = i6 + macLength;
                if (i7 > i3) {
                    mac.doFinal(bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr4, i6, i3 - i6);
                    return bArr4;
                }
                mac.doFinal(bArr4, i6);
                if (i7 != i3) {
                    mac.update(bArr3, 0, macLength);
                    i6 = i7;
                }
                return bArr4;
            }
        } catch (ShortBufferException e6) {
            e6.printStackTrace();
        }
    }

    public static void Y(Parcel parcel, int i3) {
        if (parcel.dataPosition() == i3) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i3);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static String Z(AbstractC0640h abstractC0640h) {
        StringBuilder sb = new StringBuilder(abstractC0640h.size());
        for (int i3 = 0; i3 < abstractC0640h.size(); i3++) {
            byte bC = abstractC0640h.c(i3);
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

    public static p032f2.s a0(Class cls) {
        if (cls == f.class) {
            return new C0527x(f.class);
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return p037g2.k.f9143j;
            }
            Set set = Collections.EMPTY_SET;
            if (set.getClass() == cls) {
                return new p037g2.l(set);
            }
            List list = Collections.EMPTY_LIST;
            if (list.getClass() == cls) {
                return new p037g2.l(list);
            }
            return null;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (cls == LinkedHashMap.class) {
            return p037g2.k.f9145l;
        }
        if (cls == HashMap.class) {
            return p037g2.k.f9144k;
        }
        Map map = Collections.EMPTY_MAP;
        if (map.getClass() == cls) {
            return new p037g2.l(map);
        }
        return null;
    }

    public static t5.b b0(Mac mac, t5.b bVar, byte[] bArr) {
        q5.l lVar = q5.l.MASTER_SECRET_LABEL;
        byte[] bArr2 = lVar.f11312h;
        int i3 = lVar.i;
        try {
            mac.init(bVar);
            byte[] bArrX = X(mac, bArr2, bArr, i3);
            mac.reset();
            Logger logger = t5.c.f12598a;
            t5.b bVar2 = new t5.b(0, bArrX.length, "MAC", bArrX);
            Arrays.fill(bArrX, (byte) 0);
            return bVar2;
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException("Cannot run Pseudo Random Function with invalid key", e6);
        }
    }

    public static t5.b c0(t5.b bVar, t5.b bVar2) {
        byte[] encoded = bVar2.getEncoded();
        int length = encoded.length;
        byte[] encoded2 = bVar != null ? bVar.getEncoded() : new byte[length];
        m5.j jVar = new m5.j(true);
        jVar.b(encoded2.length, 16);
        jVar.c(encoded2);
        jVar.b(length, 16);
        jVar.c(encoded);
        byte[] bArrA = jVar.a();
        ByteArrayOutputStream byteArrayOutputStream = jVar.f10452a;
        try {
            byteArrayOutputStream.close();
        } catch (IOException e6) {
            m5.j.f10451d.warn("{}.close() failed!", byteArrayOutputStream.getClass(), e6);
        }
        Logger logger = t5.c.f12598a;
        t5.b bVar3 = new t5.b(0, bArrA == null ? 0 : bArrA.length, "MAC", bArrA);
        Arrays.fill(encoded, (byte) 0);
        Arrays.fill(encoded2, (byte) 0);
        Arrays.fill(bArrA, (byte) 0);
        return bVar3;
    }

    public static final int f0(G0.n nVar, long j4, G0 g6) {
        float f6 = g6 != null ? g6.f() : 0.0f;
        int iC = nVar.c(p030f0.c.e(j4));
        if (p030f0.c.e(j4) < nVar.d(iC) - f6 || p030f0.c.e(j4) > nVar.b(iC) + f6 || p030f0.c.d(j4) < (-f6) || p030f0.c.d(j4) > nVar.f1516d + f6) {
            return -1;
        }
        return iC;
    }

    public static final p082p1.a g0(View view) {
        p082p1.a aVar = (p082p1.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        p082p1.a aVar2 = new p082p1.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final long h0(C0036s0 c0036s0, p030f0.d dVar, int i3) {
        a1 a1VarD = c0036s0.d();
        G0.n nVar = a1VarD != null ? a1VarD.f281a.f1459b : null;
        InterfaceC1033p interfaceC1033pC = c0036s0.c();
        return (nVar == null || interfaceC1033pC == null) ? G0.I.f1468b : nVar.f(dVar.h(interfaceC1033pC.J(0L)), i3, E.f1448b);
    }

    public static final boolean j0(int i3) {
        int type = Character.getType(i3);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean l0(F.P p6, boolean z5) {
        InterfaceC1033p interfaceC1033pC;
        C0036s0 c0036s0 = p6.f1123d;
        if (c0036s0 == null || (interfaceC1033pC = c0036s0.c()) == null) {
            return false;
        }
        p030f0.d dVarO = AbstractC0599v0.O(interfaceC1033pC);
        long jI = p6.i(z5);
        float fD = p030f0.c.d(jI);
        if (dVarO.f8839a > fD || fD > dVarO.f8841c) {
            return false;
        }
        float fE = p030f0.c.e(jI);
        return dVarO.f8840b <= fE && fE <= dVarO.f8842d;
    }

    public static boolean m0(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f8736f == null) {
            f8736f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f8736f.booleanValue();
        if (f8737g == null) {
            f8737g = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f8737g.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static final boolean n0(int i3) {
        return Character.isWhitespace(i3) || i3 == 160;
    }

    public static final boolean o0(int i3) {
        int type;
        return (!n0(i3) || (type = Character.getType(i3)) == 14 || type == 13 || i3 == 10) ? false : true;
    }

    public static String p0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            sb.append(str.charAt(i3));
            if (str2.length() > i3) {
                sb.append(str2.charAt(i3));
            }
        }
        return sb.toString();
    }

    public static void q0(AbstractC0394b abstractC0394b, long j4) {
        long j6;
        long j7;
        do {
            j6 = abstractC0394b.get();
            if (j6 == Long.MAX_VALUE) {
                return;
            }
            j7 = j6 - j4;
            if (j7 < 0) {
                G4.a.A(new IllegalStateException(AbstractC0013g0.h("More produced than requested: ", j7)));
                j7 = 0;
            }
        } while (!abstractC0394b.compareAndSet(j6, j7));
    }

    public static boolean r0(Parcel parcel, int i3) {
        D0(parcel, i3, 4);
        return parcel.readInt() != 0;
    }

    public static int s0(Parcel parcel, int i3) {
        D0(parcel, i3, 4);
        return parcel.readInt();
    }

    public static int t0(Parcel parcel, int i3) {
        return (i3 & (-65536)) != -65536 ? (char) (i3 >> 16) : parcel.readInt();
    }

    public static final W.g u0(C0230o c0230o) {
        c0230o.V(-796080049);
        W.g gVar = (W.g) n.H(new Object[0], W.g.f5528d, W.h.i, c0230o, 3072, 4);
        gVar.f5531c = (i) c0230o.k(W.k.f5537a);
        c0230o.p(false);
        return gVar;
    }

    public static void v0(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + t0(parcel, i3));
    }

    public static void w0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final void x0(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void y0(String str) {
        throw new IllegalStateException(str);
    }

    public static final void z0(String str) {
        throw new IllegalStateException(str);
    }

    @Override // b5.c
    public Object A(Y4.a aVar) {
        k.f("deserializer", aVar);
        return aVar.deserialize(this);
    }

    @Override // b5.a
    public Object B(a5.g gVar, int i3, Y4.a aVar, Object obj) {
        k.f("descriptor", gVar);
        k.f("deserializer", aVar);
        return A(aVar);
    }

    @Override // b5.c
    public double C() {
        Object objW = W();
        k.d("null cannot be cast to non-null type kotlin.Double", objW);
        return ((Double) objW).doubleValue();
    }

    public Object W() {
        throw new SerializationException(E4.x.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // b5.c
    public b5.a a(a5.g gVar) {
        k.f("descriptor", gVar);
        return this;
    }

    @Override // b5.a
    public void b(a5.g gVar) {
        k.f("descriptor", gVar);
    }

    @Override // b5.c
    public long d() {
        Object objW = W();
        k.d("null cannot be cast to non-null type kotlin.Long", objW);
        return ((Long) objW).longValue();
    }

    public abstract Method d0(Class cls, Field field);

    @Override // b5.a
    public long e(a5.g gVar, int i3) {
        k.f("descriptor", gVar);
        return d();
    }

    public abstract Constructor e0(Class cls);

    @Override // b5.c
    public boolean f() {
        Object objW = W();
        k.d("null cannot be cast to non-null type kotlin.Boolean", objW);
        return ((Boolean) objW).booleanValue();
    }

    @Override // b5.c
    public boolean g() {
        return true;
    }

    @Override // b5.a
    public float h(a5.g gVar, int i3) {
        k.f("descriptor", gVar);
        return z();
    }

    @Override // b5.c
    public char i() {
        Object objW = W();
        k.d("null cannot be cast to non-null type kotlin.Char", objW);
        return ((Character) objW).charValue();
    }

    public abstract String[] i0(Class cls);

    @Override // b5.a
    public Object j(a5.g gVar, int i3, Y4.a aVar, Object obj) {
        k.f("descriptor", gVar);
        k.f("deserializer", aVar);
        if (aVar.getDescriptor().i() || g()) {
            return A(aVar);
        }
        return null;
    }

    public abstract boolean k0(Class cls);

    @Override // b5.a
    public short l(C0484e0 c0484e0, int i3) {
        k.f("descriptor", c0484e0);
        return x();
    }

    @Override // b5.a
    public String m(a5.g gVar, int i3) {
        k.f("descriptor", gVar);
        return y();
    }

    @Override // b5.a
    public int n(a5.g gVar, int i3) {
        k.f("descriptor", gVar);
        return q();
    }

    @Override // b5.a
    public double o(a5.g gVar, int i3) {
        k.f("descriptor", gVar);
        return C();
    }

    @Override // b5.a
    public byte p(C0484e0 c0484e0, int i3) {
        k.f("descriptor", c0484e0);
        return s();
    }

    @Override // b5.c
    public int q() {
        Object objW = W();
        k.d("null cannot be cast to non-null type kotlin.Int", objW);
        return ((Integer) objW).intValue();
    }

    @Override // b5.c
    public c r(a5.g gVar) {
        k.f("descriptor", gVar);
        return this;
    }

    @Override // b5.c
    public byte s() {
        Object objW = W();
        k.d("null cannot be cast to non-null type kotlin.Byte", objW);
        return ((Byte) objW).byteValue();
    }

    @Override // b5.c
    public int t(a5.g gVar) {
        k.f("enumDescriptor", gVar);
        Object objW = W();
        k.d("null cannot be cast to non-null type kotlin.Int", objW);
        return ((Integer) objW).intValue();
    }

    @Override // b5.a
    public boolean u(a5.g gVar, int i3) {
        k.f("descriptor", gVar);
        return f();
    }

    @Override // b5.a
    public c v(C0484e0 c0484e0, int i3) {
        k.f("descriptor", c0484e0);
        return r(c0484e0.k(i3));
    }

    @Override // b5.a
    public char w(C0484e0 c0484e0, int i3) {
        k.f("descriptor", c0484e0);
        return i();
    }

    @Override // b5.c
    public short x() {
        Object objW = W();
        k.d("null cannot be cast to non-null type kotlin.Short", objW);
        return ((Short) objW).shortValue();
    }

    @Override // b5.c
    public String y() {
        Object objW = W();
        k.d("null cannot be cast to non-null type kotlin.String", objW);
        return (String) objW;
    }

    @Override // b5.c
    public float z() {
        Object objW = W();
        k.d("null cannot be cast to non-null type kotlin.Float", objW);
        return ((Float) objW).floatValue();
    }
}
