package com.nanjoran.ilightshow.Services;

import B.C0031p0;
import N.C0208d;
import N.C0217h0;
import P4.AbstractC0336x;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.Model.Presets.Palettes.ColorDef;
import com.nanjoran.ilightshow.Model.Presets.Palettes.ColorPalette;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Services.lights.hue.DeviceDiscoveryHue;
import com.nanjoran.ilightshow.Services.lights.storage.SharedDeviceStorage;
import com.nanjoran.ilightshow.Services.lights.storage.SharedDeviceStorageDocument;
import com.nanjoran.ilightshow.Services.lights.storage.SharedPersistedLightOptions;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Observable;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final class M extends Observable {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ K4.e[] f8304N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final M f8305O;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public com.google.protobuf.r f8306A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final U4.d f8307B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public P4.i0 f8308C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public P4.i0 f8309D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Date f8310E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0217h0 f8311F;
    public ColorDef G;
    public ArrayList H;
    public Date I;
    public int J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Date f8312K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public P4.i0 f8313L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final U4.d f8314M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8315a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0217h0 f8316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public J3.e f8317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Date f8318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f8319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorDef f8320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B3.b f8321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8322h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f8323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public D.x f8324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0693t f8325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final defpackage.t f8326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final defpackage.t f8327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0688o0 f8328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Context f8329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0217h0 f8330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0217h0 f8331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f8332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public X.s f8334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final X.s f8335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final D3.l f8336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0217h0 f8337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8338y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final X.s f8339z;

    static {
        E4.n nVar = new E4.n(M.class, "useHueLegacy", "getUseHueLegacy()Z", 0);
        E4.x.f1075a.getClass();
        f8304N = new K4.e[]{nVar, new E4.n(M.class, "savedPresetString", "getSavedPresetString()Ljava/lang/String;", 0)};
        f8305O = new M();
        MediaType.Companion.parse("application/json; charset=utf-8");
    }

    public M() {
        Boolean bool = Boolean.FALSE;
        N.U u6 = N.U.f3673m;
        this.f8316b = C0208d.K(bool, u6);
        new Date();
        this.f8318d = new Date();
        this.f8319e = new Date();
        this.f8320f = new ColorDef();
        this.f8321g = new B3.b();
        p089q4.u uVar = p089q4.u.f11237h;
        this.i = uVar;
        this.f8323j = uVar;
        this.f8325l = new C0693t();
        this.f8326m = new defpackage.t("useHueLegacy", E4.x.a(Boolean.TYPE), bool);
        this.f8327n = new defpackage.t("savedPresetString", E4.x.a(String.class), "");
        this.f8330q = C0208d.K(Double.valueOf(0.0d), u6);
        this.f8331r = C0208d.K(null, u6);
        new OkHttpClient();
        this.f8334u = new X.s();
        new ArrayList();
        this.f8335v = new X.s();
        this.f8336w = new D3.l();
        this.f8337x = C0208d.K(bool, u6);
        this.f8339z = new X.s();
        P4.j0 j0VarB = AbstractC0336x.b();
        W4.d dVar = P4.D.f4604a;
        dVar.getClass();
        this.f8307B = AbstractC0336x.a(S1.h0.u(dVar, j0VarB));
        this.f8310E = new Date();
        this.f8311F = C0208d.K(bool, u6);
        this.H = new ArrayList();
        this.I = new Date();
        new Date();
        new Date();
        this.f8312K = new Date();
        this.f8314M = AbstractC0336x.a(dVar);
    }

    public static O1.B d(String str, boolean z5, X.s sVar) {
        D3.l lVar;
        ListIterator listIterator = sVar.listIterator();
        do {
            X.y yVar = (X.y) listIterator;
            if (!yVar.hasNext()) {
                D3.l lVar2 = new D3.l();
                lVar2.f812c = str;
                if (z5) {
                    sVar.add(lVar2);
                }
                return new O1.B(lVar2, false);
            }
            lVar = (D3.l) yVar.next();
        } while (!E4.k.a(lVar.f812c, str));
        return new O1.B(lVar, true);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0174  */
    public static void e(M m6, boolean z5) {
        D3.d dVar;
        D3.d dVar2;
        UMPreset uMPresetG = m6.g();
        if (uMPresetG == null) {
            return;
        }
        ColorDef randomFromPalette$default = ColorPalette.getRandomFromPalette$default(uMPresetG.getColorDefs(), null, 1, null);
        int hue = randomFromPalette$default.getHue();
        int sat = randomFromPalette$default.getSat();
        D3.a aVar = new D3.a();
        aVar.f761a = hue;
        aVar.f762b = z5 ? 0 : sat;
        aVar.f763c = uMPresetG.getBrightnessMax();
        D3.d dVar3 = new D3.d(aVar, 0, true, false, 85, true, false, true, false);
        D3.a aVar2 = new D3.a();
        aVar2.f761a = hue;
        aVar2.f762b = z5 ? 0 : sat;
        aVar2.f763c = uMPresetG.getBrightnessMin();
        D3.d dVar4 = new D3.d(aVar2, 0, false, 85, false, 128);
        D3.a aVar3 = new D3.a();
        aVar3.f761a = hue;
        aVar3.f762b = z5 ? 0 : sat;
        aVar3.f763c = uMPresetG.getBrightnessMin();
        D3.d dVar5 = new D3.d(aVar3, 0, false, 85, false, 32);
        D3.a aVar4 = new D3.a();
        aVar4.f761a = hue;
        aVar4.f762b = z5 ? 0 : sat;
        aVar4.f763c = 0;
        D3.d dVar6 = new D3.d(aVar4, 0, false, 85, false, 32);
        D3.a aVar5 = new D3.a();
        aVar5.f761a = hue;
        if (z5) {
            sat = 0;
        }
        aVar5.f762b = sat;
        aVar5.f763c = uMPresetG.getAmbientBrightness();
        D3.d dVar7 = new D3.d(aVar5, 0, false, 85, false, 32);
        ListIterator listIterator = m6.f8335v.listIterator();
        while (true) {
            X.y yVar = (X.y) listIterator;
            if (!yVar.hasNext()) {
                return;
            }
            D3.l lVar = (D3.l) yVar.next();
            X.s sVar = lVar.f815f;
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator2 = sVar.listIterator();
            while (true) {
                X.y yVar2 = (X.y) listIterator2;
                if (!yVar2.hasNext()) {
                    break;
                }
                Object next = yVar2.next();
                D3.h hVar = ((D3.j) next).f806h;
                if (!E4.k.a(hVar != null ? hVar.f789d : null, "never")) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ListIterator listIterator3 = lVar.i.listIterator();
            while (true) {
                X.y yVar3 = (X.y) listIterator3;
                if (!yVar3.hasNext()) {
                    break;
                }
                Object next2 = yVar3.next();
                D3.h hVar2 = ((D3.j) next2).f806h;
                if (!E4.k.a(hVar2 != null ? hVar2.f789d : null, "never")) {
                    arrayList2.add(next2);
                }
            }
            H4.a aVar6 = H4.e.f1802h;
            D3.j jVar = (D3.j) p089q4.l.l0(arrayList);
            if (jVar != null) {
                D3.j.h(jVar, dVar3, null, false, 14);
            }
            if (jVar == null) {
                dVar = dVar5;
            } else {
                D3.h hVar3 = jVar.f806h;
                if (E4.k.a(hVar3 != null ? hVar3.f789d : null, "only")) {
                    D3.h hVar4 = jVar.f806h;
                    dVar = E4.k.a(hVar4 != null ? hVar4.f790e : null, "black") ? dVar6 : dVar7;
                } else {
                    dVar = dVar5;
                }
            }
            double d6 = 0.08d;
            if (jVar != null) {
                jVar.g(dVar, Double.valueOf(0.08d), true, false);
            }
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                D3.j jVar2 = (D3.j) obj;
                double d7 = d6;
                D3.j.h(jVar2, dVar3, null, true, 10);
                D3.h hVar5 = jVar2.f806h;
                if (E4.k.a(hVar5 != null ? hVar5.f789d : null, "only")) {
                    D3.h hVar6 = jVar2.f806h;
                    dVar2 = E4.k.a(hVar6 != null ? hVar6.f790e : null, "black") ? dVar6 : dVar7;
                } else {
                    dVar2 = dVar4;
                }
                jVar2.g(dVar2, Double.valueOf(d7), true, false);
                d6 = d7;
            }
        }
    }

    public static void w(M m6, double d6, double d7, Double d8, Double d9, double d10, boolean z5, double d11, double d12, Integer num, Integer num2, int i, boolean z6, int i3) {
        int shiftedBrightness$default;
        UMPreset uMPreset;
        int i6;
        double d13;
        D3.d dVar;
        D3.d dVar2;
        D3.d dVar3;
        double d14;
        double d15 = (i3 & 1) != 0 ? 0.0d : d6;
        double d16 = (i3 & 4) != 0 ? 0.08d : d7;
        Double dValueOf = (i3 & 16) != 0 ? Double.valueOf(1.0d) : d9;
        double d17 = (i3 & 128) != 0 ? 0.15d : d11;
        double d18 = (i3 & HueLog.LogComponent.STREAMDTLS) != 0 ? 1.0d : d12;
        Integer num3 = (i3 & HueLog.LogComponent.APPCORE) != 0 ? null : num;
        Integer numValueOf = (i3 & 1024) != 0 ? null : num2;
        boolean z7 = (i3 & 2048) == 0;
        int i7 = (i3 & 4096) != 0 ? 80 : i;
        boolean z8 = (i3 & 8192) != 0 ? false : z6;
        UMPreset uMPresetG = m6.g();
        if (uMPresetG == null) {
            return;
        }
        String intensityMode = uMPresetG.getIntensityMode();
        FXOpt fXOpt = FXOpt.INSTANCE;
        Double dValueOf2 = E4.k.a(intensityMode, fXOpt.getIntensityChill()) ? Double.valueOf(2.0d) : d8;
        boolean z9 = z8;
        double d19 = E4.k.a(uMPresetG.getIntensityMode(), fXOpt.getIntensityChill()) ? 1.0d : d10;
        if (E4.k.a(uMPresetG.getIntensityMode(), fXOpt.getIntensityChill())) {
            numValueOf = Integer.valueOf((uMPresetG.getBrightnessMin() + uMPresetG.getBrightnessMax()) / 2);
        }
        if (num3 != null) {
            shiftedBrightness$default = num3.intValue();
            uMPreset = uMPresetG;
        } else {
            shiftedBrightness$default = UMPreset.getShiftedBrightness$default(uMPresetG, 255, 0, 0, 6, null);
            uMPreset = uMPresetG;
        }
        double d20 = d15;
        ColorDef randomFromPalette$default = ColorPalette.getRandomFromPalette$default(uMPreset.getColorDefs(), null, 1, null);
        int hue = randomFromPalette$default.getHue();
        int sat = randomFromPalette$default.getSat();
        int iIntValue = numValueOf != null ? numValueOf.intValue() : uMPreset.getBrightnessMin();
        D3.a aVar = new D3.a();
        aVar.f761a = hue;
        aVar.f762b = sat;
        aVar.f763c = shiftedBrightness$default;
        double d21 = d16;
        double d22 = 10;
        D3.d dVar4 = new D3.d(aVar, (int) (d20 * d22), false, i7, z5, 448);
        if (dValueOf2 != null) {
            D3.a aVar2 = new D3.a();
            i6 = hue;
            aVar2.f761a = i6;
            aVar2.f762b = sat;
            aVar2.f763c = iIntValue;
            d13 = d22;
            dVar = new D3.d(aVar2, (int) (dValueOf2.doubleValue() * d13), false, i7, false, 448);
        } else {
            i6 = hue;
            d13 = d22;
            dVar = null;
        }
        if (dValueOf2 != null) {
            D3.a aVar3 = new D3.a();
            aVar3.f761a = i6;
            aVar3.f762b = sat;
            aVar3.f763c = iIntValue;
            dVar2 = new D3.d(aVar3, (int) (dValueOf.doubleValue() * d13), false, i7, false, 448);
        } else {
            dVar2 = null;
        }
        D3.a aVar4 = new D3.a();
        aVar4.f761a = i6;
        aVar4.f762b = sat;
        aVar4.f763c = iIntValue;
        D3.d dVar5 = new D3.d(aVar4, (int) (d19 * d13), false, i7, false, 448);
        ListIterator listIterator = m6.f8335v.listIterator();
        while (true) {
            X.y yVar = (X.y) listIterator;
            if (!yVar.hasNext()) {
                return;
            }
            D3.l lVar = (D3.l) yVar.next();
            X.s sVar = lVar.f810a;
            D3.d dVar6 = dVar2;
            ListIterator listIterator2 = listIterator;
            int iMin = Math.min(Math.max(1, G4.a.C(((double) sVar.size()) * d17)), sVar.size());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ListIterator listIterator3 = sVar.listIterator();
            while (true) {
                X.y yVar2 = (X.y) listIterator3;
                if (!yVar2.hasNext()) {
                    break;
                }
                D3.d dVar7 = dVar;
                Object next = yVar2.next();
                X.s sVar2 = sVar;
                double d23 = d17;
                if (!lVar.f821m.contains((D3.j) next)) {
                    arrayList2.add(next);
                }
                dVar = dVar7;
                d17 = d23;
                sVar = sVar2;
            }
            D3.d dVar8 = dVar;
            X.s sVar3 = sVar;
            double d24 = d17;
            arrayList.addAll(p089q4.l.o0(iMin, com.fasterxml.jackson.databind.deser.std.d0.C(arrayList2)));
            if (arrayList.size() < iMin) {
                arrayList.addAll(p089q4.l.o0(iMin - arrayList.size(), com.fasterxml.jackson.databind.deser.std.d0.C(lVar.f821m)));
            }
            if (i7 < 255) {
                ListIterator listIterator4 = lVar.i.listIterator();
                while (true) {
                    X.y yVar3 = (X.y) listIterator4;
                    if (!yVar3.hasNext()) {
                        break;
                    }
                    D3.j jVar = (D3.j) yVar3.next();
                    if (!arrayList.contains(jVar)) {
                        arrayList.add(jVar);
                    }
                }
            }
            lVar.f821m = arrayList;
            ArrayList arrayList3 = new ArrayList();
            ListIterator listIterator5 = sVar3.listIterator();
            while (true) {
                X.y yVar4 = (X.y) listIterator5;
                if (!yVar4.hasNext()) {
                    break;
                }
                Object next2 = yVar4.next();
                if (!arrayList.contains((D3.j) next2)) {
                    arrayList3.add(next2);
                }
            }
            List listO0 = p089q4.l.o0(Math.min(Math.max(1, G4.a.C(((double) arrayList3.size()) * d18)), arrayList3.size()), com.fasterxml.jackson.databind.deser.std.d0.C(arrayList3));
            if (!listO0.isEmpty() || !z9) {
                boolean z10 = sVar3.size() > 1 || d24 != 1.0d;
                if (z10) {
                    dVar3 = dVar8;
                } else {
                    if (z10) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar3 = dVar6;
                }
                boolean z11 = sVar3.size() > 1 || d24 != 1.0d;
                if (z11) {
                    d14 = 0.08d;
                } else {
                    if (z11) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d14 = d21;
                }
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    D3.j jVar2 = (D3.j) obj;
                    List list = listO0;
                    D3.j.h(jVar2, dVar4, null, z7, 8);
                    if (dVar3 != null) {
                        D3.j.h(jVar2, dVar3, Double.valueOf(d20 + d14), z7, 8);
                    }
                    listO0 = list;
                }
                Iterator it = listO0.iterator();
                while (it.hasNext()) {
                    D3.j.h((D3.j) it.next(), dVar5, null, z7, 10);
                }
            }
            listIterator = listIterator2;
            dVar2 = dVar6;
            dVar = dVar8;
            d17 = d24;
        }
    }

    public final void A() {
        UMPreset uMPresetG = g();
        if (uMPresetG == null) {
            return;
        }
        UMPreset uMPresetNormalizeEngineAndFxSize = UMPreset.copy$default(uMPresetG, null, 0, 0, 0, 0, 0, null, false, null, false, false, null, null, null, false, false, false, false, null, 524287, null).normalizeEngineAndFxSize();
        D(uMPresetNormalizeEngineAndFxSize);
        d5.b bVar = d5.c.f8594d;
        bVar.getClass();
        String strB = bVar.b(UMPreset.Companion.serializer(), uMPresetNormalizeEngineAndFxSize);
        this.f8327n.b(f8304N[1], strB);
    }

    public final void B() {
        Context context = this.f8329p;
        if (context != null) {
            E4.k.c(context);
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("prefFile", 0).edit();
            editorEdit.putFloat("timeShift", (float) m());
            editorEdit.commit();
        }
    }

    public final void C(boolean z5) {
        SharedPreferences sharedPreferences;
        Context context = this.f8329p;
        if (context == null || (sharedPreferences = context.getSharedPreferences("prefFile", 0)) == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("backgroundServiceEnabled", z5);
        editorEdit.commit();
        if (i()) {
            C0674i c0674i = C0674i.f8401h;
            C0674i.g();
        }
    }

    public final void D(UMPreset uMPreset) {
        this.f8331r.setValue(uMPreset);
    }

    public final void E(List list) {
        X.s sVar = this.f8339z;
        sVar.clear();
        sVar.addAll(list);
        boolean z5 = h() && i();
        if (h() && !this.f8333t && z5) {
            I();
        }
        this.f8333t = z5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListK = k();
        int size = arrayListK.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListK.get(i);
            i++;
            arrayList.add(((D3.j) obj).f799a);
        }
        if (this.f8329p != null) {
            this.f8332s = arrayList;
            Iterator it = arrayList.iterator();
            E4.k.e("iterator(...)", it);
            String str = "";
            while (it.hasNext()) {
                str = str + ((String) it.next()) + "&&&";
            }
            Context context = this.f8329p;
            E4.k.c(context);
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("prefFile", 0).edit();
            editorEdit.putString("savedEnabledLightsIDList", str);
            editorEdit.apply();
        }
        b();
        setChanged();
        notifyObservers(this);
        C0674i c0674i = C0674i.f8401h;
        C0674i.g();
    }

    public final void F(double d6) {
        this.f8330q.setValue(Double.valueOf(d6));
    }

    public final void G(boolean z5) {
        this.f8326m.b(f8304N[0], Boolean.valueOf(z5));
    }

    public final void H() {
        if (((Boolean) this.f8316b.getValue()).booleanValue()) {
            P4.i0 i0Var = this.f8308C;
            U4.d dVar = this.f8307B;
            if (i0Var == null || !i0Var.b()) {
                this.f8308C = AbstractC0336x.o(dVar, null, new K(this, null), 3);
            }
            P4.i0 i0Var2 = this.f8309D;
            if (i0Var2 == null || !i0Var2.b()) {
                this.f8309D = AbstractC0336x.o(dVar, null, new L(2, null), 3);
            }
            Context context = this.f8329p;
            if (context != null) {
                C0693t c0693t = this.f8325l;
                c0693t.getClass();
                P4.i0 i0Var3 = c0693t.f8488g;
                if (i0Var3 == null || !i0Var3.b()) {
                    c0693t.f8488g = AbstractC0336x.o(c0693t.f8486e, null, new r(c0693t, context, null), 3);
                }
            }
            H3.d dVarA = H3.f.f1787d.a();
            if (dVarA != null && dVarA.f1784f == null) {
                Timer timer = new Timer();
                dVarA.f1784f = timer;
                timer.scheduleAtFixedRate(new H3.c(0, dVarA), 1L, dVarA.b());
            }
            J3.e eVar = this.f8317c;
            if (eVar != null) {
                eVar.a();
            }
            l().d();
            r0.f8470a.getClass();
            r0.b();
            E0 e6 = E0.f8249o;
            if (e6.i != null) {
                return;
            }
            Timer timer2 = new Timer();
            e6.i = timer2;
            timer2.schedule(new H3.c(2, e6), 1L, 5000L);
        }
    }

    public final void I() {
        if (i() && h()) {
            this.f8333t = true;
        }
    }

    public final void J() {
        S s6;
        ListIterator listIterator;
        Timer timer;
        this.f8333t = false;
        P4.i0 i0Var = this.f8308C;
        if (i0Var != null) {
            i0Var.c(null);
        }
        this.f8308C = null;
        P4.i0 i0Var2 = this.f8309D;
        if (i0Var2 != null) {
            i0Var2.c(null);
        }
        this.f8309D = null;
        this.f8306A = null;
        P4.i0 i0Var3 = this.f8313L;
        if (i0Var3 != null) {
            i0Var3.c(null);
        }
        this.f8313L = null;
        H3.d dVarA = H3.f.f1787d.a();
        if (dVarA != null && (timer = dVarA.f1784f) != null) {
            timer.cancel();
            dVarA.f1784f = null;
        }
        C0693t c0693t = this.f8325l;
        P4.i0 i0Var4 = c0693t.f8488g;
        if (i0Var4 != null) {
            i0Var4.c(null);
        }
        c0693t.f8488g = null;
        c0693t.f8483b.set(false);
        P4.i0 i0Var5 = c0693t.f8484c;
        if (i0Var5 != null) {
            i0Var5.c(null);
        }
        c0693t.f8484c = null;
        J3.e eVar = this.f8317c;
        if (eVar != null) {
            eVar.f1934d++;
            for (J3.a aVar : eVar.f1935e) {
                aVar.stop();
            }
            I3.c cVar = I3.c.f1859f;
            cVar.f1862c = false;
            try {
                DatagramSocket datagramSocket = cVar.f1860a;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                while (true) {
                    try {
                        WifiManager.MulticastLock multicastLock = s6.f8363a;
                        if (multicastLock == null || !multicastLock.isHeld()) {
                            break;
                        }
                        WifiManager.MulticastLock multicastLock2 = s6.f8363a;
                        if (multicastLock2 != null) {
                            multicastLock2.release();
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
                while (true) {
                    X.y yVar = (X.y) listIterator;
                    if (!yVar.hasNext()) {
                        break;
                    } else {
                        ((K3.a) yVar.next()).disconnect();
                    }
                }
            } catch (Exception unused) {
            }
            cVar.f1860a = null;
            Thread thread = cVar.f1861b;
            if (thread != null) {
                thread.interrupt();
            }
            cVar.f1861b = null;
            cVar.f1863d.clear();
            s6 = S.f8362c;
            s6.f8364b = 0;
            listIterator = eVar.f1932b.listIterator();
        }
        if (this.f8328o != null) {
            C0688o0 c0688o0L = l();
            P4.i0 i0Var6 = c0688o0L.i;
            if (i0Var6 != null) {
                i0Var6.c(null);
            }
            c0688o0L.i = null;
        }
        r0.f8470a.getClass();
        P4.i0 i0Var7 = r0.f8477h;
        if (i0Var7 != null) {
            i0Var7.c(null);
        }
        r0.f8477h = null;
        E0 e7 = E0.f8249o;
        Timer timer2 = e7.i;
        if (timer2 != null) {
            timer2.cancel();
        }
        e7.i = null;
    }

    public final void K() {
        this.f8338y = false;
        this.f8337x.setValue(Boolean.FALSE);
        J();
        setChanged();
        notifyObservers(this);
    }

    public final void L() {
        this.f8337x.setValue(Boolean.FALSE);
        J();
        setChanged();
        notifyObservers(this);
    }

    public final void M(boolean z5) {
        this.f8338y = z5;
        this.f8337x.setValue(Boolean.valueOf(z5));
        if (i()) {
            H();
            I();
        } else {
            J();
        }
        setChanged();
        notifyObservers(this);
        C0674i c0674i = C0674i.f8401h;
        C0674i.g();
    }

    public final synchronized void a() {
        try {
            p();
            O1.B bD = d("Default", false, this.f8335v);
            ArrayList arrayList = this.f8332s;
            ListIterator listIterator = this.f8334u.listIterator();
            while (true) {
                X.y yVar = (X.y) listIterator;
                if (!yVar.hasNext()) {
                    break;
                }
                D3.j jVar = (D3.j) yVar.next();
                String str = jVar.f801c;
                if (str == null || str.equals("")) {
                    ((D3.l) bD.f4439b).a(jVar);
                } else {
                    ((D3.l) d(str, true, this.f8335v).f4439b).a(jVar);
                }
                String str2 = jVar.f799a;
                if (str2 != null) {
                    E4.k.c(arrayList);
                    if (arrayList.contains(str2)) {
                        ListIterator listIterator2 = this.f8339z.listIterator();
                        boolean z5 = false;
                        while (true) {
                            X.y yVar2 = (X.y) listIterator2;
                            if (!yVar2.hasNext()) {
                                break;
                            } else if (str2.equals(((D3.j) yVar2.next()).f799a)) {
                                z5 = true;
                            }
                        }
                        if (!z5) {
                            this.f8339z.add(jVar);
                        }
                    }
                }
            }
            D3.l lVar = (D3.l) bD.f4439b;
            if (!lVar.f814e.isEmpty() && !bD.f4438a) {
                this.f8335v.add(lVar);
            }
            ArrayList arrayList2 = new ArrayList();
            ListIterator listIterator3 = this.f8335v.listIterator();
            while (true) {
                X.y yVar3 = (X.y) listIterator3;
                if (yVar3.hasNext()) {
                    D3.l lVar2 = (D3.l) yVar3.next();
                    if (!lVar2.f813d) {
                        lVar2.e(this.f8334u);
                        if (lVar2.f814e.isEmpty()) {
                            arrayList2.add(lVar2);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [D3.l] */
    /* JADX WARN: Type inference failed for: r2v8, types: [D3.l] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    public final void b() {
        Object next;
        D3.j jVar;
        ?? arrayList;
        List list;
        Object next2;
        WeakReference weakReference;
        Object next3;
        WeakReference weakReference2;
        boolean zN = n();
        X.s sVar = this.f8335v;
        p089q4.u uVar = p089q4.u.f11237h;
        X.s sVar2 = this.f8339z;
        if (!zN) {
            ArrayList arrayList2 = new ArrayList();
            ListIterator listIterator = sVar2.listIterator();
            while (true) {
                X.y yVar = (X.y) listIterator;
                if (!yVar.hasNext()) {
                    break;
                }
                Object next4 = yVar.next();
                D3.h hVar = ((D3.j) next4).f806h;
                if (hVar != null && hVar.f788c) {
                    arrayList2.add(next4);
                }
            }
            this.i = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            ListIterator listIterator2 = sVar2.listIterator();
            while (true) {
                X.y yVar2 = (X.y) listIterator2;
                if (!yVar2.hasNext()) {
                    break;
                }
                Object next5 = yVar2.next();
                D3.h hVar2 = ((D3.j) next5).f806h;
                if (hVar2 == null || !hVar2.f788c) {
                    arrayList3.add(next5);
                }
            }
            this.H = new ArrayList(arrayList3);
            this.f8323j = uVar;
            ListIterator listIterator3 = sVar.listIterator();
            while (true) {
                X.y yVar3 = (X.y) listIterator3;
                if (!yVar3.hasNext()) {
                    break;
                }
                ?? r6 = (D3.l) yVar3.next();
                if (r6 != 0) {
                    r6.b(this.H, this.i, this.f8323j, false);
                }
            }
        } else {
            ArrayList arrayList4 = new ArrayList();
            ListIterator listIterator4 = sVar2.listIterator();
            while (true) {
                X.y yVar4 = (X.y) listIterator4;
                if (!yVar4.hasNext()) {
                    break;
                }
                Object next6 = yVar4.next();
                D3.j jVar2 = (D3.j) next6;
                boolean zN2 = f8305O.n();
                E4.k.f("<this>", jVar2);
                if (!jVar2.f803e && (jVar2.f802d || !zN2)) {
                    D3.h hVar3 = jVar2.f806h;
                    if (hVar3 == null || !hVar3.f788c) {
                        arrayList4.add(next6);
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                WeakReference weakReference3 = ((D3.j) obj).f805g;
                K3.a aVar = weakReference3 != null ? (K3.a) weakReference3.get() : null;
                Object arrayList5 = linkedHashMap.get(aVar);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap.put(aVar, arrayList5);
                }
                ((List) arrayList5).add(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int size2 = arrayList4.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList4.get(i3);
                i3++;
                String str = ((D3.j) obj2).f801c;
                Object arrayList6 = linkedHashMap2.get(str);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap2.put(str, arrayList6);
                }
                ((List) arrayList6).add(obj2);
            }
            LinkedHashMap linkedHashMapY = p089q4.z.Y(linkedHashMap2);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                K3.a aVar2 = (K3.a) key;
                Integer maxStreamingLights = aVar2 != null ? aVar2.getMaxStreamingLights() : null;
                if (key != null && maxStreamingLights != null) {
                    while (((Collection) value).size() > maxStreamingLights.intValue()) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMapY.entrySet()) {
                            Iterator it = ((Iterable) entry2.getValue()).iterator();
                            do {
                                if (!it.hasNext()) {
                                    next3 = null;
                                    break;
                                } else {
                                    next3 = it.next();
                                    weakReference2 = ((D3.j) next3).f805g;
                                }
                            } while (!E4.k.a(weakReference2 != null ? (K3.a) weakReference2.get() : null, key));
                            if (next3 != null) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        Iterator it2 = linkedHashMap3.entrySet().iterator();
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (it2.hasNext()) {
                                int size3 = ((Collection) ((Map.Entry) next).getValue()).size();
                                do {
                                    Object next7 = it2.next();
                                    int size4 = ((Collection) ((Map.Entry) next7).getValue()).size();
                                    if (size3 < size4) {
                                        size3 = size4;
                                        next = next7;
                                    }
                                } while (it2.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Map.Entry entry3 = (Map.Entry) next;
                        if (entry3 == null || (list = (List) entry3.getValue()) == null) {
                            jVar = null;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj3 : list) {
                                Iterator it3 = ((Iterable) value).iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        next2 = null;
                                        break;
                                    } else {
                                        next2 = it3.next();
                                        weakReference = ((D3.j) next2).f805g;
                                    }
                                } while (!E4.k.a(weakReference != null ? (K3.a) weakReference.get() : null, key));
                                if (next2 != null) {
                                    arrayList7.add(obj3);
                                }
                            }
                            jVar = (D3.j) p089q4.l.Z(com.fasterxml.jackson.databind.deser.std.d0.C(arrayList7));
                        }
                        String str2 = entry3 != null ? (String) entry3.getKey() : null;
                        List list2 = (List) linkedHashMapY.get(entry3 != null ? (String) entry3.getKey() : null);
                        if (list2 != null) {
                            arrayList = new ArrayList();
                            for (Object obj4 : list2) {
                                if (!E4.k.a((D3.j) obj4, jVar)) {
                                    arrayList.add(obj4);
                                }
                            }
                        } else {
                            arrayList = uVar;
                        }
                        linkedHashMapY.put(str2, arrayList);
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj5 : (Iterable) value) {
                            if (!E4.k.a((D3.j) obj5, jVar)) {
                                arrayList8.add(obj5);
                            }
                        }
                        value = arrayList8;
                    }
                }
                if (aVar2 != null) {
                    aVar2.setEnabledStreamingLights((List) value);
                }
            }
            this.H = new ArrayList();
            Iterator it4 = linkedHashMapY.values().iterator();
            while (it4.hasNext()) {
                this.H.addAll((List) it4.next());
            }
            ArrayList arrayList9 = new ArrayList();
            ListIterator listIterator5 = sVar2.listIterator();
            while (true) {
                X.y yVar5 = (X.y) listIterator5;
                if (!yVar5.hasNext()) {
                    break;
                }
                Object next8 = yVar5.next();
                if (((D3.j) next8).f803e) {
                    arrayList9.add(next8);
                }
            }
            this.f8323j = arrayList9;
            ArrayList arrayList10 = new ArrayList();
            ListIterator listIterator6 = sVar2.listIterator();
            while (true) {
                X.y yVar6 = (X.y) listIterator6;
                if (!yVar6.hasNext()) {
                    break;
                }
                Object next9 = yVar6.next();
                D3.j jVar3 = (D3.j) next9;
                if (!this.H.contains(jVar3) && !jVar3.f803e) {
                    arrayList10.add(next9);
                }
            }
            this.i = arrayList10;
            int size5 = arrayList10.size();
            int i6 = 0;
            while (i6 < size5) {
                Object obj6 = arrayList10.get(i6);
                i6++;
                D3.h hVar4 = ((D3.j) obj6).f806h;
                if (hVar4 != null) {
                    hVar4.f788c = true;
                }
            }
            ListIterator listIterator7 = sVar.listIterator();
            while (true) {
                X.y yVar7 = (X.y) listIterator7;
                if (!yVar7.hasNext()) {
                    break;
                }
                ?? r7 = (D3.l) yVar7.next();
                if (r7 != 0) {
                    r7.b(this.H, this.i, this.f8323j, true);
                }
            }
        }
        setChanged();
        notifyObservers(this);
    }

    public final void c(ArrayList arrayList) {
        HashSet hashSet = new HashSet(this.f8339z);
        hashSet.addAll(arrayList);
        E(new ArrayList(hashSet));
    }

    public final boolean f() {
        Context context = this.f8329p;
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences("prefFile", 0).getBoolean("backgroundServiceEnabled", true);
    }

    public final UMPreset g() {
        return (UMPreset) this.f8331r.getValue();
    }

    public final boolean h() {
        return (k().isEmpty() && this.f8336w.f810a.isEmpty()) ? false : true;
    }

    public final boolean i() {
        return ((Boolean) this.f8337x.getValue()).booleanValue();
    }

    public final double j() {
        UMPreset uMPresetG = g();
        String fxSize = uMPresetG != null ? uMPresetG.getFxSize() : null;
        FXOpt fXOpt = FXOpt.INSTANCE;
        if (E4.k.a(fxSize, fXOpt.getSize25())) {
            return 0.25d;
        }
        if (E4.k.a(fxSize, fXOpt.getSize50())) {
            return 0.5d;
        }
        return E4.k.a(fxSize, fXOpt.getSize100()) ? 1.0d : 0.25d;
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = this.f8339z.listIterator();
        while (true) {
            X.y yVar = (X.y) listIterator;
            if (!yVar.hasNext()) {
                return arrayList;
            }
            Object next = yVar.next();
            if (!((D3.j) next).f804f) {
                arrayList.add(next);
            }
        }
    }

    public final C0688o0 l() {
        C0688o0 c0688o0 = this.f8328o;
        if (c0688o0 != null) {
            return c0688o0;
        }
        E4.k.m("quotaService");
        throw null;
    }

    public final double m() {
        return ((Number) this.f8330q.getValue()).doubleValue();
    }

    public final boolean n() {
        return !o();
    }

    public final boolean o() {
        return ((Boolean) this.f8326m.a(f8304N[0])).booleanValue();
    }

    public final void p() {
        X.y yVar;
        ColorDef colorDef;
        ColorDef colorDef2;
        ColorDef colorDef3;
        ColorPalette colorDefs;
        X.s sVar = this.f8335v;
        if (sVar == null || !sVar.isEmpty()) {
            ListIterator listIterator = sVar.listIterator();
            do {
                yVar = (X.y) listIterator;
                if (yVar.hasNext()) {
                }
            } while (!((D3.l) yVar.next()).f813d);
            return;
        }
        D3.l lVar = this.f8336w;
        lVar.getClass();
        lVar.f811b = "ILS_PreviewRoom";
        lVar.f812c = "Preview Room";
        lVar.f813d = true;
        UMPreset uMPresetG = g();
        ArrayList<ColorDef> colors = (uMPresetG == null || (colorDefs = uMPresetG.getColorDefs()) == null) ? null : colorDefs.getColors();
        int hue = (colors == null || (colorDef3 = (ColorDef) p089q4.l.a0(0, colors)) == null) ? 0 : colorDef3.getHue();
        int hue2 = (colors == null || (colorDef2 = (ColorDef) p089q4.l.a0(1, colors)) == null) ? hue : colorDef2.getHue();
        int hue3 = (colors == null || (colorDef = (ColorDef) p089q4.l.a0(2, colors)) == null) ? hue2 : colorDef.getHue();
        J4.d dVarD0 = p081p0.c.D0(0, 4);
        ArrayList arrayList = new ArrayList(p089q4.n.P(dVarD0, 10));
        Iterator it = dVarD0.iterator();
        while (((J4.c) it).f1944j) {
            int iA = ((p089q4.y) it).a();
            D3.e eVar = new D3.e((iA == 1 || iA == 2) ? hue3 : hue);
            eVar.f799a = p012c.k.r(iA, "Preview_");
            eVar.f800b = p012c.k.r(iA, "Preview ");
            eVar.f801c = lVar.f812c;
            eVar.f806h = new D3.h(eVar.b());
            arrayList.add(eVar);
        }
        J4.d dVarD1 = p081p0.c.D0(0, 2);
        ArrayList arrayList2 = new ArrayList(p089q4.n.P(dVarD1, 10));
        Iterator it2 = dVarD1.iterator();
        while (((J4.c) it2).f1944j) {
            int iA2 = ((p089q4.y) it2).a();
            D3.f fVar = new D3.f(hue2);
            fVar.f799a = p012c.k.r(iA2, "NanoPreview_");
            fVar.f800b = p012c.k.r(iA2, "NanoPreview_");
            fVar.f801c = lVar.f812c;
            fVar.f806h = new D3.h(fVar.b());
            arrayList2.add(fVar);
        }
        ArrayList arrayListJ0 = p089q4.l.j0(arrayList, arrayList2);
        X.s sVar2 = lVar.f814e;
        sVar2.clear();
        sVar2.addAll(arrayListJ0);
        X.s sVar3 = lVar.f815f;
        sVar3.clear();
        sVar3.addAll(arrayList);
        X.s sVar4 = lVar.i;
        sVar4.clear();
        sVar4.addAll(arrayList2);
        X.s sVar5 = lVar.f810a;
        sVar5.clear();
        sVar5.addAll(arrayListJ0);
        sVar.add(lVar);
    }

    public final boolean q(Context context) {
        String string;
        List listV;
        boolean z5 = false;
        if (this.f8329p != null) {
            return false;
        }
        try {
            d5.b bVar = d5.c.f8594d;
            String str = (String) this.f8327n.a(f8304N[1]);
            bVar.getClass();
            D(((UMPreset) bVar.a(UMPreset.Companion.serializer(), str)).normalizeEngineAndFxSize());
        } catch (Exception unused) {
            D(UMPreset.Companion.defaultPreset());
        }
        Context applicationContext = context.getApplicationContext();
        this.f8329p = applicationContext;
        if (applicationContext != null && (string = applicationContext.getSharedPreferences("prefFile", 0).getString("savedEnabledLightsIDList", "")) != null) {
            Pattern patternCompile = Pattern.compile("&&&");
            E4.k.e("compile(...)", patternCompile);
            M4.l.r0(0);
            Matcher matcher = patternCompile.matcher(string);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(string.subSequence(iEnd, string.length()).toString());
                listV = arrayList;
            } else {
                listV = com.fasterxml.jackson.databind.deser.std.d0.v(string.toString());
            }
            String[] strArr = (String[]) listV.toArray(new String[0]);
            if (strArr != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : strArr) {
                    if (!E4.k.a(str2, "")) {
                        arrayList2.add(str2);
                    }
                }
                this.f8332s = arrayList2;
            }
        }
        J3.e eVar = new J3.e();
        eVar.f1932b = new X.s();
        eVar.f1933c = new X.s();
        eVar.f1937g = true;
        DeviceDiscoveryHue deviceDiscoveryHue = new DeviceDiscoveryHue(context);
        L3.c cVar = new L3.c();
        K.y yVar = new K.y();
        yVar.f2032c = context;
        yVar.f2030a = new ArrayList();
        new ArrayList();
        eVar.f1935e = new J3.a[]{deviceDiscoveryHue, cVar, yVar};
        C0031p0 c0031p0 = new C0031p0(context);
        eVar.f1931a = c0031p0;
        ArrayList arrayList3 = (ArrayList) c0031p0.f394j;
        eVar.f1932b = arrayList3 != null ? C0208d.U(arrayList3) : new X.s();
        this.f8317c = eVar;
        eVar.f1936f = this;
        eVar.a();
        this.f8328o = new C0688o0(context);
        AbstractC0336x.o(AbstractC0336x.a(P4.D.f4604a), null, new I(this, null), 3);
        D.x xVar = new D.x(6, z5);
        xVar.i = context;
        xVar.f707j = new HashMap();
        SharedDeviceStorageDocument sharedDeviceStorageDocumentLoad = SharedDeviceStorage.INSTANCE.load(context);
        if (sharedDeviceStorageDocumentLoad == null || sharedDeviceStorageDocumentLoad.getLightOptions().isEmpty()) {
            String string2 = context.getSharedPreferences("prefFile", 0).getString("light_options", null);
            if (string2 != null) {
                HashMap map = (HashMap) new p105t3.m().c(new StringReader(string2), p132y3.a.get(new J3.h().getType()));
                E4.k.f("value", map);
                xVar.f707j = map;
                xVar.o();
            }
        } else {
            List<SharedPersistedLightOptions> lightOptions = sharedDeviceStorageDocumentLoad.getLightOptions();
            int iS = p089q4.z.S(p089q4.n.P(lightOptions, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (SharedPersistedLightOptions sharedPersistedLightOptions : lightOptions) {
                String legacyHashId = sharedPersistedLightOptions.getLegacyHashId();
                if (legacyHashId == null) {
                    legacyHashId = sharedPersistedLightOptions.getLightId() + "#" + sharedPersistedLightOptions.getDeviceLocalId();
                }
                linkedHashMap.put(legacyHashId, sharedPersistedLightOptions.toLightOptions(legacyHashId));
            }
            xVar.f707j = new HashMap(linkedHashMap);
            xVar.o();
        }
        this.f8324k = xVar;
        Context context2 = this.f8329p;
        if ((context2 != null ? context2.getSharedPreferences("prefFile", 0).getString("deviceName", null) : null) == null) {
            String str3 = "A_" + Math.random();
            Context context3 = this.f8329p;
            if (context3 != null) {
                SharedPreferences.Editor editorEdit = context3.getSharedPreferences("prefFile", 0).edit();
                editorEdit.putString("deviceName", str3);
                editorEdit.commit();
            }
        }
        Context context4 = this.f8329p;
        E4.k.c(context4);
        F(context4.getSharedPreferences("prefFile", 0).getFloat("timeShift", 0.0f));
        p();
        this.f8316b.setValue(Boolean.TRUE);
        C0674i c0674i = C0674i.f8401h;
        C0674i.g();
        return true;
    }

    public final boolean r() {
        if (!i() || !h()) {
            return false;
        }
        H3.f fVar = H3.f.f1787d;
        H3.d dVarA = H3.f.f1787d.a();
        return E4.k.a(dVarA != null ? dVarA.c() : null, "playing");
    }

    public final boolean s(D3.l lVar) {
        E4.k.f("room", lVar);
        X.s<D3.j> sVar = lVar.f814e;
        if (sVar != null && sVar.isEmpty()) {
            return true;
        }
        for (D3.j jVar : sVar) {
            X.s sVar2 = this.f8339z;
            if (sVar2 != null && sVar2.isEmpty()) {
                return false;
            }
            Iterator<E> it = sVar2.iterator();
            while (it.hasNext()) {
                if (E4.k.a(((D3.j) it.next()).f799a, jVar.f799a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final synchronized void t(List list, List list2, J3.e eVar) {
        try {
            E4.k.f("devices", list);
            E4.k.f("lights", list2);
            E4.k.f("manager", eVar);
            if (this.f8334u.size() != list2.size()) {
                this.f8334u = C0208d.U(list2);
                a();
            }
            setChanged();
            notifyObservers(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void u() {
        UMPreset uMPresetG = g();
        if (uMPresetG != null) {
            uMPresetG.nextAutoPalette();
        }
        ListIterator listIterator = this.f8334u.listIterator();
        while (true) {
            X.y yVar = (X.y) listIterator;
            if (!yVar.hasNext()) {
                break;
            } else {
                ((D3.j) yVar.next()).f807j = null;
            }
        }
        ListIterator listIterator2 = this.f8336w.f814e.listIterator();
        while (true) {
            X.y yVar2 = (X.y) listIterator2;
            if (!yVar2.hasNext()) {
                return;
            } else {
                ((D3.j) yVar2.next()).f807j = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:135:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0232  */
    /* JADX WARN: Code duplicated, block: B:195:0x0320  */
    /* JADX WARN: Code duplicated, block: B:240:0x0421  */
    /* JADX WARN: Code duplicated, block: B:297:0x0520  */
    /* JADX WARN: Code duplicated, block: B:423:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0189  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    public final void v(defpackage.i iVar) throws InterruptedException {
        B3.f fVarA;
        defpackage.j jVar;
        UMPreset uMPresetG;
        B3.c cVar;
        B3.c cVar2;
        int iRandom;
        boolean z5;
        ColorDef randomFromPalette;
        int sat;
        X.s sVar;
        int i;
        int i3;
        int ambientBrightness;
        UMPreset uMPreset;
        boolean z6;
        p084p4.h hVar;
        B3.c cVar3;
        boolean z7;
        boolean z8;
        H3.d dVarA = H3.f.f1787d.a();
        if (dVarA == null || (fVarA = dVarA.a()) == null || (jVar = fVarA.f572r) == null || (uMPresetG = g()) == null) {
            return;
        }
        if (iVar.s()) {
            Math.random();
        }
        y0 y0VarH = (!uMPresetG.getSmartMode() || jVar.p() == 0) ? null : AbstractC0698y.h(Math.max(Math.min(iVar.p() + ((int) (((double) uMPresetG.getIntensityShift()) * 0.2d)), 100), 0));
        if (!iVar.v()) {
            return;
        }
        double dCurrentTimeMillis = System.currentTimeMillis() / 1000.0d;
        boolean zS = iVar.s();
        float fQ = iVar.q();
        int i6 = y0VarH != null ? y0VarH.f8498a : 0;
        B3.b bVar = this.f8321g;
        Double d6 = bVar.f543a;
        if (d6 == null || dCurrentTimeMillis - d6.doubleValue() > 0.3d || zS) {
            bVar.f543a = Double.valueOf(dCurrentTimeMillis);
            if (i6 < 3) {
                bVar.f545c = (((double) i6) * 0.33d) + (bVar.f545c * 0.66d);
            } else {
                bVar.f545c = i6;
            }
            if (zS) {
                bVar.f544b = 0;
            }
            bVar.f544b++;
            float fMax = Math.max(fQ, 0.3f);
            if (bVar.f545c >= 3.0d || fMax >= 0.5f) {
                cVar = new B3.c(fMax, true);
            } else if (bVar.f544b % 2 == 0) {
                cVar = new B3.c(fMax, false);
            } else {
                fMax *= 2;
                cVar = new B3.c(fMax, true);
            }
            cVar2 = cVar;
        } else {
            cVar2 = new B3.c(fQ, false);
        }
        if (!cVar2.f546a) {
            return;
        }
        new Date();
        if (y0VarH == null || y0VarH.f8498a != 2) {
            iRandom = (y0VarH != null ? y0VarH.f8498a : 0) >= 4 ? 140 + ((int) (Math.random() * ((double) 100))) : iVar.u();
        } else {
            iRandom = Math.max(140, iVar.u());
        }
        int iMin = Math.min(Math.max(uMPresetG.getIntensityShift() + iRandom + (y0VarH != null ? y0VarH.f8500c : 0), 0), 255);
        if (!iVar.s() || p012c.k.o() - this.f8318d.getTime() <= 4000) {
            z5 = false;
        } else {
            this.f8322h = uMPresetG.getStandardHighFlash() && Math.random() < 0.34d;
            this.f8320f = ColorPalette.getRandomFromPalette$default(uMPresetG.getColorDefs(), null, 1, null);
            this.f8318d = new Date();
            z5 = true;
        }
        if (iMin > 150) {
            randomFromPalette = uMPresetG.getColorDefs().getRandomFromPalette(this.G);
        } else {
            if ((y0VarH != null ? y0VarH.f8498a : 0) >= 2) {
                randomFromPalette = uMPresetG.getColorDefs().getRandomFromPalette(this.G);
            } else {
                randomFromPalette = this.f8320f;
            }
        }
        this.G = randomFromPalette;
        int hue = randomFromPalette.getHue();
        if (uMPresetG.getWhiteFlash()) {
            if ((y0VarH != null ? y0VarH.f8498a : 0) < 3 || iMin < 200) {
                sat = randomFromPalette.getSat();
            } else if (((int) (((double) 3) * Math.random())) == 0) {
                sat = 0;
            } else {
                sat = randomFromPalette.getSat();
            }
        } else {
            sat = randomFromPalette.getSat();
        }
        B3.c cVar4 = cVar2;
        int iRandom2 = (((int) (Math.random() * 4.0d)) + 1) * 1000;
        boolean z9 = (y0VarH != null && y0VarH.f8502e) && uMPresetG.getStandardHighFlash() && Math.random() < 0.5d;
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = this.f8339z.listIterator();
        while (true) {
            X.y yVar = (X.y) listIterator;
            if (!yVar.hasNext()) {
                break;
            }
            Object next = yVar.next();
            D3.j jVar2 = (D3.j) next;
            D3.h hVar2 = jVar2.f806h;
            if (hVar2 != null) {
                cVar3 = cVar4;
                z7 = hVar2.f788c;
                if (z7 && jVar2.d()) {
                    D3.h hVar3 = jVar2.f806h;
                    if (E4.k.a(hVar3 != null ? hVar3.f789d : null, "never")) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                } else {
                    z8 = false;
                }
                if (z8) {
                    arrayList.add(next);
                }
                cVar4 = cVar3;
            } else {
                cVar3 = cVar4;
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z8) {
                arrayList.add(next);
            }
            cVar4 = cVar3;
        }
        B3.c cVar5 = cVar4;
        boolean zIsEmpty = arrayList.isEmpty();
        X.s sVar2 = this.f8335v;
        D3.l lVar = this.f8336w;
        if (zIsEmpty) {
            sVar = sVar2;
        } else {
            if ((y0VarH != null && y0VarH.f8503f) && uMPresetG.getStandardStrobe()) {
                sVar = sVar2;
                if (p012c.k.o() - this.f8319e.getTime() > iRandom2) {
                    double dQ = iVar.q();
                    ArrayList arrayListJ0 = p089q4.l.j0(this.H, lVar.f814e);
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayListJ0.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayListJ0.get(i7);
                        i7++;
                        D3.j jVar3 = (D3.j) obj;
                        if (jVar3.f802d && jVar3.d()) {
                            D3.h hVar4 = jVar3.f806h;
                            if (!E4.k.a(hVar4 != null ? hVar4.f789d : null, "never")) {
                                arrayList2.add(obj);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList2.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj2 = arrayList2.get(i8);
                        i8++;
                        D3.j jVar4 = (D3.j) obj2;
                        D3.h hVar5 = jVar4.f806h;
                        if (E4.k.a(hVar5 != null ? hVar5.f789d : null, "only")) {
                            D3.h hVar6 = jVar4.f806h;
                            if (E4.k.a(hVar6 != null ? hVar6.f790e : null, "black")) {
                                arrayList3.add(obj2);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size3 = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj3 = arrayList2.get(i9);
                        i9++;
                        D3.j jVar5 = (D3.j) obj3;
                        double d7 = dQ;
                        D3.h hVar7 = jVar5.f806h;
                        if (E4.k.a(hVar7 != null ? hVar7.f789d : null, "only")) {
                            D3.h hVar8 = jVar5.f806h;
                            if (!E4.k.a(hVar8 != null ? hVar8.f790e : null, "black")) {
                                arrayList4.add(obj3);
                            }
                        } else {
                            arrayList4.add(obj3);
                        }
                        dQ = d7;
                    }
                    double d8 = dQ;
                    int i10 = 0;
                    while (((double) i10) * 0.1d < ((((double) 2) * d8) - 0.1d) - 0.03d) {
                        i10++;
                    }
                    ListIterator listIterator2 = sVar.listIterator();
                    while (true) {
                        X.y yVar2 = (X.y) listIterator2;
                        if (!yVar2.hasNext()) {
                            break;
                        }
                        ((D3.l) yVar2.next()).f824p = i10 % 2 == 0;
                    }
                    int i11 = 0;
                    while (i11 < i10) {
                        int brightnessMax = i11 % 2 == 1 ? uMPresetG.getBrightnessMax() : 0;
                        int i12 = i10 - 1;
                        if (i11 == i12) {
                            brightnessMax = uMPresetG.getAmbientBrightness();
                        }
                        D3.a aVar = new D3.a();
                        aVar.f761a = hue;
                        aVar.f762b = sat;
                        aVar.f763c = brightnessMax;
                        D3.d dVar = new D3.d(aVar, i11 == i12 ? 4 : 0, false, 255, false, 480);
                        if (i11 == i12) {
                            int size4 = arrayList4.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                Object obj4 = arrayList4.get(i13);
                                i13++;
                                ((D3.j) obj4).f(dVar);
                            }
                            D3.a aVar2 = new D3.a();
                            aVar2.f761a = hue;
                            aVar2.f762b = sat;
                            aVar2.f763c = 0;
                            D3.d dVar2 = new D3.d(aVar2, 4, false, 255, false, 480);
                            int size5 = arrayList3.size();
                            int i14 = 0;
                            while (i14 < size5) {
                                Object obj5 = arrayList3.get(i14);
                                i14++;
                                ((D3.j) obj5).f(dVar2);
                            }
                        } else {
                            int size6 = arrayList2.size();
                            int i15 = 0;
                            while (i15 < size6) {
                                Object obj6 = arrayList2.get(i15);
                                i15++;
                                ((D3.j) obj6).f(dVar);
                            }
                        }
                        if (i11 < i12) {
                            Thread.sleep((long) (((double) 1000) * 0.1d));
                        }
                        i11++;
                    }
                    this.f8319e = new Date();
                    return;
                }
            } else {
                sVar = sVar2;
            }
        }
        float f6 = cVar5.f547b;
        if (z9) {
            double d9 = ((double) f6) / 2.0d;
            D3.a aVar3 = new D3.a();
            aVar3.f761a = hue;
            aVar3.f762b = sat;
            aVar3.f763c = uMPresetG.getBrightnessMax();
            D3.d dVar3 = new D3.d(aVar3, 0, false, 255, false, 480);
            ArrayList arrayListJ1 = p089q4.l.j0(this.H, lVar.f814e);
            ArrayList arrayList5 = new ArrayList();
            int size7 = arrayListJ1.size();
            int i16 = 0;
            while (i16 < size7) {
                Object obj7 = arrayListJ1.get(i16);
                i16++;
                D3.j jVar6 = (D3.j) obj7;
                if (jVar6.f802d && jVar6.d()) {
                    D3.h hVar9 = jVar6.f806h;
                    if (!E4.k.a(hVar9 != null ? hVar9.f789d : null, "only")) {
                        arrayList5.add(obj7);
                    }
                }
            }
            int size8 = arrayList5.size();
            int i17 = 0;
            while (i17 < size8) {
                Object obj8 = arrayList5.get(i17);
                i17++;
                ((D3.j) obj8).f(dVar3);
            }
            D3.d dVarA2 = D3.d.a(dVar3);
            D3.a aVar4 = dVarA2.f767a;
            if (aVar4 != null) {
                aVar4.f762b = sat;
            }
            if (aVar4 != null) {
                aVar4.f763c = uMPresetG.getBrightnessMin();
            }
            Thread.sleep((long) (d9 * ((double) 1000)));
            int size9 = arrayList5.size();
            int i18 = 0;
            while (i18 < size9) {
                Object obj9 = arrayList5.get(i18);
                i18++;
                ((D3.j) obj9).f(dVarA2);
            }
            return;
        }
        double d10 = f6;
        boolean z10 = this.f8322h;
        int iMin2 = Math.min(Math.max(iMin, 0), 255);
        int i19 = !uMPresetG.getColorFades() ? 200 : (y0VarH == null || !y0VarH.f8501d) ? 100 : 200;
        if (!uMPresetG.getSmartMode()) {
            i19 = 0;
        }
        int shiftedBrightness = uMPresetG.getShiftedBrightness(iMin2 > 160 ? 255 : iMin2, i19, y0VarH != null ? y0VarH.f8499b : 255);
        if (iMin2 > 180) {
            i = 0;
        } else {
            if ((y0VarH != null ? y0VarH.f8498a : 0) > 3) {
                i = 0;
            } else {
                i = 10 - (iMin2 / 25);
            }
        }
        if (i < 2) {
            i = 0;
        }
        if ((y0VarH != null && y0VarH.f8498a == 2) && z5) {
            i = 0;
        }
        D3.a aVar5 = new D3.a();
        aVar5.f761a = hue;
        aVar5.f762b = sat;
        aVar5.f763c = shiftedBrightness;
        D3.d dVar4 = new D3.d(aVar5, i, iMin2 > 200, iMin2, uMPresetG.getColorFades() || i > 10 || i == 0 || z5, 448);
        ListIterator listIterator3 = sVar.listIterator();
        while (true) {
            X.y yVar3 = (X.y) listIterator3;
            if (!yVar3.hasNext()) {
                break;
            }
            D3.l lVar2 = (D3.l) yVar3.next();
            p084p4.h hVar10 = lVar2.f823o;
            if (uMPresetG.getAllAtOnce()) {
                uMPreset = uMPresetG;
            } else {
                uMPreset = uMPresetG;
                if (lVar2.f814e.size() > 1) {
                    z6 = z10;
                    Integer numC = D3.l.c(lVar2, dVar4, null, false, 8);
                    lVar2.f822n = numC;
                    if (hVar10 != null) {
                        Object obj10 = hVar10.i;
                        if (!E4.k.a(obj10, numC)) {
                            D3.l.c(lVar2, (D3.d) hVar10.f10849h, (Integer) obj10, false, 12);
                        }
                    }
                    hVar = null;
                }
                lVar2.f823o = hVar;
                z10 = z6;
                uMPresetG = uMPreset;
            }
            z6 = z10;
            if (hVar10 == null || !lVar2.f824p || d10 >= 0.7d) {
                hVar = null;
                D3.l.c(lVar2, dVar4, null, true, 8);
                lVar2.f824p = true;
            } else {
                D3.d dVar5 = (D3.d) hVar10.f10849h;
                hVar = null;
                D3.l.c(lVar2, dVar5, null, true, 8);
                lVar2.f824p = false;
            }
            lVar2.f823o = hVar;
            z10 = z6;
            uMPresetG = uMPreset;
        }
        UMPreset uMPreset2 = uMPresetG;
        boolean z11 = z10;
        D3.a aVar6 = new D3.a();
        aVar6.f761a = hue;
        aVar6.f762b = sat;
        aVar6.f763c = uMPreset2.getAmbientBrightness();
        D3.d dVar6 = new D3.d(aVar6, 50, iMin2 > 200, iMin2, false, 480);
        if (z5) {
            ListIterator listIterator4 = sVar.listIterator();
            while (true) {
                X.y yVar4 = (X.y) listIterator4;
                if (!yVar4.hasNext()) {
                    break;
                } else {
                    D3.l.d((D3.l) yVar4.next(), dVar6);
                }
            }
        }
        ?? r6 = this.f8323j;
        H4.a aVar7 = H4.e.f1802h;
        D3.j jVar7 = (D3.j) p089q4.l.l0(r6);
        Integer numValueOf = y0VarH != null ? Integer.valueOf(y0VarH.f8498a) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            i3 = 10;
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            i3 = 4;
        } else {
            i3 = ((numValueOf != null && numValueOf.intValue() == 4) || (numValueOf != null && numValueOf.intValue() == 5)) ? 0 : 20;
        }
        if (jVar7 != null) {
            boolean z12 = jVar7.i;
            jVar7.i = !z12;
            D3.a aVar8 = new D3.a();
            M m6 = f8305O;
            if (z12) {
                UMPreset uMPresetG2 = m6.g();
                ambientBrightness = uMPresetG2 != null ? uMPresetG2.getAmbientBrightness() : 0;
            } else {
                UMPreset uMPresetG3 = m6.g();
                ambientBrightness = uMPresetG3 != null ? uMPresetG3.getBrightnessMax() : 255;
            }
            aVar8.f763c = ambientBrightness;
            jVar7.a(new D3.d(aVar8, i3, false, 100, false, 480));
        }
        if (iMin2 <= 120) {
            return;
        }
        Thread.sleep(100L);
        D3.d dVarA3 = D3.d.a(dVar4);
        D3.a aVar9 = dVarA3.f767a;
        if (aVar9 != null) {
            aVar9.f763c = uMPreset2.getBrightnessMin();
        }
        dVarA3.f769c = true;
        dVarA3.f768b = z11 ? 0 : (int) (((double) 10) * d10);
        if (uMPreset2.getEnablePulses()) {
            if (!((y0VarH == null || y0VarH.f8501d) ? false : true)) {
                if (d10 > 0.5d) {
                    Thread.sleep((((long) d10) * ((long) 1000)) / ((long) 2000));
                    if (z11) {
                        dVarA3.f768b = 0;
                    }
                }
                ListIterator listIterator5 = sVar.listIterator();
                while (true) {
                    X.y yVar5 = (X.y) listIterator5;
                    if (!yVar5.hasNext()) {
                        return;
                    }
                    D3.l lVar3 = (D3.l) yVar5.next();
                    D3.l.c(lVar3, dVarA3, lVar3.f822n, uMPreset2.getAllAtOnce(), 8);
                }
            }
        }
        ListIterator listIterator6 = sVar.listIterator();
        while (true) {
            X.y yVar6 = (X.y) listIterator6;
            if (!yVar6.hasNext()) {
                return;
            }
            D3.l lVar4 = (D3.l) yVar6.next();
            lVar4.f823o = new p084p4.h(dVarA3, lVar4.f822n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final void x() {
        boolean zN = n();
        ListIterator listIterator = this.f8335v.listIterator();
        while (true) {
            X.y yVar = (X.y) listIterator;
            if (!yVar.hasNext()) {
                return;
            } else {
                ((D3.l) yVar.next()).b(this.H, this.i, this.f8323j, zN);
            }
        }
    }

    public final void y() {
        if (((Boolean) this.f8316b.getValue()).booleanValue() && this.f8338y) {
            if (!i()) {
                this.f8337x.setValue(Boolean.TRUE);
                setChanged();
                notifyObservers(this);
            }
            H();
            I();
        }
    }

    public final void z() {
        if (E0.f8249o.a() == F0.NONE) {
            H4.a aVar = H4.e.f1802h;
            X.s sVar = this.f8339z;
            E4.k.f("<this>", sVar);
            if (sVar.isEmpty()) {
                throw new NoSuchElementException("Collection is empty.");
            }
            D3.j jVar = (D3.j) p089q4.l.V(sVar, H4.e.f1802h.c(sVar.size()));
            sVar.clear();
            E(com.fasterxml.jackson.databind.deser.std.d0.v(jVar));
        }
        UMPreset uMPresetG = g();
        if (uMPresetG != null) {
            uMPresetG.withEngineMode(FXOpt.INSTANCE.getEngineStandard());
        }
    }
}
