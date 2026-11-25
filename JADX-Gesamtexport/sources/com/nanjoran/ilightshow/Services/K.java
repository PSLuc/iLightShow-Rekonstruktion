package com.nanjoran.ilightshow.Services;

import O1.C0308a;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import c5.C0495p;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.review.ReviewException;
import com.google.protobuf.InterfaceC0651t;
import com.nanjoran.ilightshow.MainActivity;
import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class K extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M f8286m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(M m6, p111u4.d dVar) {
        super(2, dVar);
        this.f8286m = m6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        K k3 = new K(this.f8286m, dVar);
        k3.f8285l = obj;
        return k3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) throws InterruptedException {
        K k3 = (K) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        k3.o(xVar);
        return xVar;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:163:0x034a  */
    /* JADX WARN: Code duplicated, block: B:172:0x03bb A[LOOP:3: B:170:0x03b2->B:172:0x03bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:185:0x040b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0410  */
    /* JADX WARN: Code duplicated, block: B:191:0x0429  */
    /* JADX WARN: Code duplicated, block: B:193:0x0432  */
    /* JADX WARN: Code duplicated, block: B:195:0x0436  */
    /* JADX WARN: Code duplicated, block: B:196:0x0439  */
    /* JADX WARN: Code duplicated, block: B:205:0x047e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0486  */
    /* JADX WARN: Code duplicated, block: B:212:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:214:0x04db  */
    /* JADX WARN: Code duplicated, block: B:219:0x052e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0534  */
    /* JADX WARN: Code duplicated, block: B:223:0x0547  */
    /* JADX WARN: Code duplicated, block: B:224:0x057d  */
    /* JADX WARN: Code duplicated, block: B:309:0x0768  */
    /* JADX WARN: Code duplicated, block: B:339:0x03c5 A[EDGE_INSN: B:339:0x03c5->B:173:0x03c5 BREAK  A[LOOP:3: B:170:0x03b2->B:172:0x03bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p122w4.a
    public final Object o(Object obj) throws InterruptedException {
        B3.f fVar;
        com.google.protobuf.r rVar;
        boolean z5;
        boolean z6;
        defpackage.i iVar;
        boolean z7;
        double d6;
        Object next;
        B3.f fVarA;
        defpackage.c cVar;
        Object obj2;
        D3.d dVar;
        ListIterator listIterator;
        X.y yVar;
        double dJ;
        double d7;
        String intensityMode;
        FXOpt fXOpt;
        int iL;
        double dMin;
        double d8;
        double d9;
        int i;
        B3.f fVarA2;
        WeakReference weakReference;
        Context context;
        K.y yVar2;
        String str;
        K k3 = this;
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) k3.f8285l;
        Process.setThreadPriority(-19);
        while (AbstractC0336x.m(interfaceC0335w)) {
            M m6 = k3.f8286m;
            K4.e[] eVarArr = M.f8304N;
            if (((Boolean) m6.f8311F.getValue()).booleanValue()) {
                m6.f8306A = null;
                Thread.sleep(50L);
            } else {
                H3.f fVar2 = H3.f.f1787d;
                H3.d dVarA = fVar2.a();
                if (E4.k.a(dVarA != null ? dVarA.c() : null, "playing") && m6.i()) {
                    if (p012c.k.o() - m6.f8310E.getTime() > 10000) {
                        m6.f8310E = new Date();
                        m6.x();
                    }
                    if (m6.l().a()) {
                        Thread.sleep(1000L);
                    } else {
                        H3.d dVarA2 = fVar2.a();
                        B3.f fVarA3 = dVarA2 != null ? dVarA2.a() : null;
                        UMPreset uMPresetG = m6.g();
                        if (uMPresetG != null) {
                            if (fVarA3 == null) {
                                Thread.sleep(1000L);
                            } else {
                                com.google.protobuf.r rVar2 = m6.f8306A;
                                boolean z8 = rVar2 instanceof defpackage.b;
                                defpackage.b bVar = z8 ? (defpackage.b) rVar2 : null;
                                boolean z9 = rVar2 instanceof defpackage.i;
                                defpackage.i iVar2 = z9 ? (defpackage.i) rVar2 : null;
                                r0.f8470a.getClass();
                                if (!r0.a() || r0.f8474e || (weakReference = r0.f8476g) == null || (context = (MainActivity) weakReference.get()) == null) {
                                    interfaceC0335w = interfaceC0335w;
                                    fVar2 = fVar2;
                                } else {
                                    if (r0.f8475f == null) {
                                        Context applicationContext = context.getApplicationContext();
                                        if (applicationContext == null) {
                                            applicationContext = context;
                                        }
                                        r0.f8475f = new C0495p(new p066m3.f(applicationContext));
                                    }
                                    C0495p c0495p = r0.f8475f;
                                    if (c0495p == null) {
                                        interfaceC0335w = interfaceC0335w;
                                        fVar2 = fVar2;
                                    } else {
                                        p066m3.f fVar3 = (p066m3.f) c0495p.i;
                                        String str2 = fVar3.f10419b;
                                        C0308a c0308a = p066m3.f.f10417c;
                                        c0308a.c("requestInAppReview (%s)", str2);
                                        if (fVar3.f10418a == null) {
                                            Object[] objArr = new Object[0];
                                            if (Log.isLoggable("PlayCore", 6)) {
                                                C0308a.e(c0308a.i, "Play Store app is either not installed or not the official version", objArr);
                                            }
                                            Locale locale = Locale.getDefault();
                                            HashMap map = p078o3.a.f10663a;
                                            if (map.containsKey(-1)) {
                                                str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) p078o3.a.f10664b.get(-1)) + ")";
                                            } else {
                                                str = "";
                                            }
                                            ReviewException reviewException = new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null));
                                            yVar2 = new K.y();
                                            synchronized (yVar2.f2032c) {
                                                yVar2.k();
                                                yVar2.f2031b = true;
                                                yVar2.f2034e = reviewException;
                                            }
                                            ((F.L) yVar2.f2033d).m(yVar2);
                                        } else {
                                            fVar2 = fVar2;
                                            p060l3.b bVar2 = new p060l3.b();
                                            p072n3.i iVar3 = fVar3.f10418a;
                                            p066m3.d dVar2 = new p066m3.d(fVar3, bVar2, bVar2);
                                            iVar3.getClass();
                                            iVar3.a().post(new p072n3.g(iVar3, bVar2, bVar2, dVar2));
                                            yVar2 = bVar2.f10375a;
                                        }
                                        E4.k.e("requestReviewFlow(...)", yVar2);
                                        p060l3.d dVar3 = new p060l3.d(p060l3.c.f10376a, new R2.j(c0495p, 3, context));
                                        F.L l6 = (F.L) yVar2.f2033d;
                                        synchronized (l6.f1106c) {
                                            try {
                                                if (((ArrayDeque) l6.f1107d) == null) {
                                                    l6.f1107d = new ArrayDeque();
                                                }
                                                ((ArrayDeque) l6.f1107d).add(dVar3);
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        synchronized (yVar2.f2032c) {
                                            try {
                                                if (yVar2.f2031b) {
                                                    ((F.L) yVar2.f2033d).m(yVar2);
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                }
                                if (bVar != null) {
                                    UMPreset uMPresetG2 = m6.g();
                                    if (uMPresetG2 == null) {
                                        fVar = fVarA3;
                                        rVar = rVar2;
                                        z5 = z8;
                                        z6 = z9;
                                    } else {
                                        double dR = ((double) bVar.r()) / 100.0d;
                                        H3.d dVarA3 = fVar2.a();
                                        defpackage.i iVarB = (dVarA3 == null || (fVarA2 = dVarA3.a()) == null) ? null : B3.f.b(fVarA2, dR, null, 2);
                                        int i3 = iVarB != null ? AbstractC0698y.h(iVarB.p()).f8498a : 0;
                                        if (bVar.t()) {
                                            E4.k.a(uMPresetG2.getIntensityMode(), FXOpt.INSTANCE.getIntensityChill());
                                            m6.u();
                                        }
                                        long jO = p012c.k.o() - m6.I.getTime();
                                        if (!E4.k.a(uMPresetG2.getIntensityMode(), FXOpt.INSTANCE.getIntensityChill()) || jO >= 300) {
                                            m6.I = new Date();
                                            H3.d dVarA4 = fVar2.a();
                                            if (dVarA4 == null || (fVarA = dVarA4.a()) == null || (cVar = fVarA.f573s) == null) {
                                                fVar = fVarA3;
                                                rVar = rVar2;
                                                z5 = z8;
                                                z6 = z9;
                                            } else {
                                                double dN = cVar.n();
                                                if (dN > 100.0d) {
                                                    dN /= (double) 2;
                                                }
                                                double dX = 60.0d / dN;
                                                boolean zO = bVar.o();
                                                InterfaceC0651t interfaceC0651tL = cVar.l();
                                                E4.k.e("getItemsList(...)", interfaceC0651tL);
                                                Iterator<E> it = interfaceC0651tL.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        obj2 = null;
                                                        break;
                                                    }
                                                    Object next2 = it.next();
                                                    defpackage.b bVar3 = (defpackage.b) next2;
                                                    if (bVar3.o() && bVar3.r() > bVar.r()) {
                                                        obj2 = next2;
                                                        break;
                                                    }
                                                }
                                                defpackage.b bVar4 = (defpackage.b) obj2;
                                                if ((bVar4 == null || bVar4.r() != m6.J) && bVar4 != null) {
                                                    m6.J = bVar4.r();
                                                    zO = true;
                                                }
                                                if (E4.k.a(uMPresetG2.getIntensityMode(), FXOpt.INSTANCE.getIntensityChill())) {
                                                    fVar = fVarA3;
                                                    rVar = rVar2;
                                                    z5 = z8;
                                                    z6 = z9;
                                                    long jO2 = p012c.k.o() - m6.f8318d.getTime();
                                                    if ((!zO || bVar.t()) && jO2 > 4000) {
                                                        m6.f8320f = uMPresetG2.getColorDefs().getRandomFromPalette(m6.f8320f);
                                                        m6.f8318d = new Date();
                                                        int hue = m6.f8320f.getHue();
                                                        int sat = m6.f8320f.getSat();
                                                        D3.a aVar2 = new D3.a();
                                                        aVar2.f761a = hue;
                                                        aVar2.f762b = sat;
                                                        aVar2.f763c = uMPresetG2.getAmbientBrightness();
                                                        dVar = new D3.d(aVar2, 40, false, 50, false, 480);
                                                        listIterator = m6.f8335v.listIterator();
                                                        while (true) {
                                                            yVar = (X.y) listIterator;
                                                            if (!yVar.hasNext()) {
                                                                break;
                                                            }
                                                            D3.l.d((D3.l) yVar.next(), dVar);
                                                        }
                                                    }
                                                    new Date();
                                                    dJ = m6.j();
                                                    if (bVar.p()) {
                                                        intensityMode = uMPresetG2.getIntensityMode();
                                                        fXOpt = FXOpt.INSTANCE;
                                                        if (E4.k.a(intensityMode, fXOpt.getIntensityChill()) || bVar.q() > 40) {
                                                            iL = bVar.l();
                                                            if (!E4.k.a(uMPresetG2.getIntensityMode(), fXOpt.getIntensityMax()) && iL > 60 && i3 >= 4) {
                                                                dX = bVar.x();
                                                            } else if (iL <= 70) {
                                                                dX *= (double) 2;
                                                            }
                                                            dMin = Math.min(bVar.w(), bVar.x());
                                                            d8 = 0.08d;
                                                            if (dMin < 0.08d + dX) {
                                                                d8 = dMin / ((double) 2);
                                                                d9 = dMin / 1.5d;
                                                            } else {
                                                                d9 = dX;
                                                            }
                                                            if (i3 >= 3) {
                                                                i = 255;
                                                            } else {
                                                                i = 100;
                                                            }
                                                            M.w(m6, 0.0d, d8, Double.valueOf(dX), Double.valueOf(d9), 0.4d, !(zO || E4.k.a(uMPresetG2.getIntensityMode(), fXOpt.getIntensityChill())) || bVar.t(), dJ, 0.0d, null, null, i, !bVar.u(), 1793);
                                                            new Date();
                                                        } else if (bVar.s() <= 80 && bVar.m() && AbstractC0698y.i(new Date(), m6.f8312K) > dX) {
                                                            m6.f8312K = new Date();
                                                            M.w(m6, dX, 0.0d, null, null, ((double) 2) * dX, false, 0.3d, 0.3d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                        } else if (bVar.s() <= 50 && bVar.m()) {
                                                            double d10 = dX * ((double) 2);
                                                            if (AbstractC0698y.i(new Date(), m6.f8312K) > d10) {
                                                                m6.f8312K = new Date();
                                                                M.w(m6, d10, 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.3d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            } else if (bVar.o()) {
                                                                d7 = dX * ((double) 4);
                                                                if (AbstractC0698y.i(new Date(), m6.f8312K) > d7) {
                                                                    m6.f8312K = new Date();
                                                                    M.w(m6, dX * ((double) 2), 0.0d, null, null, d7, false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                                } else {
                                                                    M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                                }
                                                            } else {
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            }
                                                        } else if (bVar.o()) {
                                                            d7 = dX * ((double) 4);
                                                            if (AbstractC0698y.i(new Date(), m6.f8312K) > d7) {
                                                                m6.f8312K = new Date();
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, d7, false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            } else {
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            }
                                                        } else {
                                                            M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                        }
                                                    } else if (bVar.s() <= 80) {
                                                        if (bVar.s() <= 50) {
                                                            if (bVar.o()) {
                                                                d7 = dX * ((double) 4);
                                                                if (AbstractC0698y.i(new Date(), m6.f8312K) > d7) {
                                                                    m6.f8312K = new Date();
                                                                    M.w(m6, dX * ((double) 2), 0.0d, null, null, d7, false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                                } else {
                                                                    M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                                }
                                                            } else {
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            }
                                                        } else if (bVar.o()) {
                                                            d7 = dX * ((double) 4);
                                                            if (AbstractC0698y.i(new Date(), m6.f8312K) > d7) {
                                                                m6.f8312K = new Date();
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, d7, false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            } else {
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            }
                                                        } else {
                                                            M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                        }
                                                    } else if (bVar.s() <= 50) {
                                                        if (bVar.o()) {
                                                            d7 = dX * ((double) 4);
                                                            if (AbstractC0698y.i(new Date(), m6.f8312K) > d7) {
                                                                m6.f8312K = new Date();
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, d7, false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            } else {
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            }
                                                        } else {
                                                            M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                        }
                                                    } else if (bVar.o()) {
                                                        d7 = dX * ((double) 4);
                                                        if (AbstractC0698y.i(new Date(), m6.f8312K) > d7) {
                                                            m6.f8312K = new Date();
                                                            M.w(m6, dX * ((double) 2), 0.0d, null, null, d7, false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                        } else {
                                                            M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                        }
                                                    } else {
                                                        M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                    }
                                                } else if (bVar.v() && uMPresetG2.getStrobeDrops()) {
                                                    M.e(m6, uMPresetG2.getStrobeDropsWhite());
                                                    fVar = fVarA3;
                                                    rVar = rVar2;
                                                    z5 = z8;
                                                    z6 = z9;
                                                } else if (bVar.n() && uMPresetG2.getStrobeDrops()) {
                                                    rVar = rVar2;
                                                    z5 = z8;
                                                    z6 = z9;
                                                    fVar = fVarA3;
                                                    M.w(m6, 0.0d, 0.0d, Double.valueOf(0.2d), null, 0.0d, true, 0.0d, 0.0d, null, null, 0, false, 16279);
                                                } else {
                                                    fVar = fVarA3;
                                                    rVar = rVar2;
                                                    z5 = z8;
                                                    z6 = z9;
                                                    long jO3 = p012c.k.o() - m6.f8318d.getTime();
                                                    if (!zO) {
                                                        m6.f8320f = uMPresetG2.getColorDefs().getRandomFromPalette(m6.f8320f);
                                                        m6.f8318d = new Date();
                                                        int hue2 = m6.f8320f.getHue();
                                                        int sat2 = m6.f8320f.getSat();
                                                        D3.a aVar3 = new D3.a();
                                                        aVar3.f761a = hue2;
                                                        aVar3.f762b = sat2;
                                                        aVar3.f763c = uMPresetG2.getAmbientBrightness();
                                                        dVar = new D3.d(aVar3, 40, false, 50, false, 480);
                                                        listIterator = m6.f8335v.listIterator();
                                                        while (true) {
                                                            yVar = (X.y) listIterator;
                                                            if (!yVar.hasNext()) {
                                                                break;
                                                                break;
                                                            }
                                                            D3.l.d((D3.l) yVar.next(), dVar);
                                                        }
                                                    } else {
                                                        m6.f8320f = uMPresetG2.getColorDefs().getRandomFromPalette(m6.f8320f);
                                                        m6.f8318d = new Date();
                                                        int hue3 = m6.f8320f.getHue();
                                                        int sat3 = m6.f8320f.getSat();
                                                        D3.a aVar4 = new D3.a();
                                                        aVar4.f761a = hue3;
                                                        aVar4.f762b = sat3;
                                                        aVar4.f763c = uMPresetG2.getAmbientBrightness();
                                                        dVar = new D3.d(aVar4, 40, false, 50, false, 480);
                                                        listIterator = m6.f8335v.listIterator();
                                                        while (true) {
                                                            yVar = (X.y) listIterator;
                                                            if (!yVar.hasNext()) {
                                                                break;
                                                                break;
                                                            }
                                                            D3.l.d((D3.l) yVar.next(), dVar);
                                                        }
                                                    }
                                                    new Date();
                                                    dJ = m6.j();
                                                    if (bVar.p()) {
                                                        intensityMode = uMPresetG2.getIntensityMode();
                                                        fXOpt = FXOpt.INSTANCE;
                                                        if (E4.k.a(intensityMode, fXOpt.getIntensityChill())) {
                                                        }
                                                        iL = bVar.l();
                                                        if (!E4.k.a(uMPresetG2.getIntensityMode(), fXOpt.getIntensityMax())) {
                                                            if (iL <= 70) {
                                                                dX *= (double) 2;
                                                            }
                                                        } else if (iL <= 70) {
                                                            dX *= (double) 2;
                                                        }
                                                        dMin = Math.min(bVar.w(), bVar.x());
                                                        d8 = 0.08d;
                                                        if (dMin < 0.08d + dX) {
                                                            d8 = dMin / ((double) 2);
                                                            d9 = dMin / 1.5d;
                                                        } else {
                                                            d9 = dX;
                                                        }
                                                        if (i3 >= 3) {
                                                            i = 255;
                                                        } else {
                                                            i = 100;
                                                        }
                                                        M.w(m6, 0.0d, d8, Double.valueOf(dX), Double.valueOf(d9), 0.4d, !(zO || E4.k.a(uMPresetG2.getIntensityMode(), fXOpt.getIntensityChill())) || bVar.t(), dJ, 0.0d, null, null, i, !bVar.u(), 1793);
                                                        new Date();
                                                    } else if (bVar.s() <= 80) {
                                                        if (bVar.s() <= 50) {
                                                            if (bVar.o()) {
                                                                d7 = dX * ((double) 4);
                                                                if (AbstractC0698y.i(new Date(), m6.f8312K) > d7) {
                                                                    m6.f8312K = new Date();
                                                                    M.w(m6, dX * ((double) 2), 0.0d, null, null, d7, false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                                } else {
                                                                    M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                                }
                                                            } else {
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            }
                                                        } else if (bVar.o()) {
                                                            d7 = dX * ((double) 4);
                                                            if (AbstractC0698y.i(new Date(), m6.f8312K) > d7) {
                                                                m6.f8312K = new Date();
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, d7, false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            } else {
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            }
                                                        } else {
                                                            M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                        }
                                                    } else if (bVar.s() <= 50) {
                                                        if (bVar.o()) {
                                                            d7 = dX * ((double) 4);
                                                            if (AbstractC0698y.i(new Date(), m6.f8312K) > d7) {
                                                                m6.f8312K = new Date();
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, d7, false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            } else {
                                                                M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                            }
                                                        } else {
                                                            M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                        }
                                                    } else if (bVar.o()) {
                                                        d7 = dX * ((double) 4);
                                                        if (AbstractC0698y.i(new Date(), m6.f8312K) > d7) {
                                                            m6.f8312K = new Date();
                                                            M.w(m6, dX * ((double) 2), 0.0d, null, null, d7, false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                        } else {
                                                            M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                        }
                                                    } else {
                                                        M.w(m6, dX * ((double) 2), 0.0d, null, null, dX * ((double) 4), false, 0.2d, 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG2, 200, 0, 0, 6, null)), null, 0, false, 15382);
                                                    }
                                                }
                                            }
                                        } else {
                                            fVar = fVarA3;
                                            rVar = rVar2;
                                            z5 = z8;
                                            z6 = z9;
                                        }
                                    }
                                    iVar = null;
                                } else {
                                    fVar = fVarA3;
                                    rVar = rVar2;
                                    z5 = z8;
                                    z6 = z9;
                                    if (iVar2 != null) {
                                        if (iVar2.t()) {
                                            m6.u();
                                        }
                                        if (E4.k.a(uMPresetG.getEngineMode(), FXOpt.INSTANCE.getEngineAdvanced())) {
                                            double dQ = iVar2.q();
                                            int i6 = AbstractC0698y.h(iVar2.p()).f8498a;
                                            if (i6 < 4 && i6 < 2) {
                                                z7 = true;
                                                d6 = i6 >= 1 ? dQ : 4.0d * dQ;
                                            } else {
                                                d6 = 0.0d;
                                                z7 = true;
                                            }
                                            Double dValueOf = Double.valueOf(i6 >= 3 ? ((double) 2) * dQ : 100.0d);
                                            if (i6 >= 3) {
                                                dQ = 0.0d;
                                            } else if (i6 < 2) {
                                                dQ *= (double) 4;
                                            }
                                            M.w(m6, d6, 0.0d, dValueOf, null, dQ, (!iVar2.s() || i6 < 3) ? false : z7, i6 >= 3 ? m6.j() : 0.1d, i6 >= 3 ? 0.75d : 0.1d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG, i6 >= 3 ? 255 : 210, 0, 0, 6, null)), Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG, 50, 0, 0, 6, null)), 0, false, 12310);
                                        } else {
                                            m6.v(iVar2);
                                        }
                                    } else {
                                        M.w(m6, 3.0d, 0.0d, Double.valueOf(3.0d), null, 10.0d, false, 0.0d, 0.0d, Integer.valueOf(UMPreset.getShiftedBrightness$default(uMPresetG, 210, 0, 0, 6, null)), null, 0, false, 15638);
                                    }
                                    iVar = null;
                                }
                                m6.f8306A = iVar;
                                Double d11 = fVar.d() != null ? fVar.d() : fVar.c();
                                if (d11 != null) {
                                    defpackage.j jVar = fVar.f572r;
                                    defpackage.c cVar2 = fVar.f573s;
                                    if (E4.k.a(uMPresetG.getEngineMode(), FXOpt.INSTANCE.getEngineAdvanced()) && cVar2 != null) {
                                        defpackage.b bVar5 = z5 ? (defpackage.b) rVar : iVar;
                                        int iR = bVar5 != 0 ? bVar5.r() : -100000;
                                        InterfaceC0651t interfaceC0651tL2 = cVar2.l();
                                        E4.k.e("getItemsList(...)", interfaceC0651tL2);
                                        Iterator<E> it2 = interfaceC0651tL2.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                next = iVar;
                                                break;
                                            }
                                            next = it2.next();
                                            defpackage.b bVar6 = (defpackage.b) next;
                                            if (bVar6.r() > d11.doubleValue() * ((double) 100) && bVar6.r() > iR) {
                                                break;
                                            }
                                        }
                                        defpackage.b bVar7 = (defpackage.b) next;
                                        if (bVar7 != null) {
                                            double dR2 = (((double) bVar7.r()) / ((double) 100)) - d11.doubleValue();
                                            if (dR2 > 1.0d) {
                                                Thread.sleep(1000L);
                                            } else {
                                                m6.f8306A = bVar7;
                                                Thread.sleep((long) (dR2 * ((double) 1000)));
                                            }
                                        } else {
                                            Thread.sleep(1000L);
                                        }
                                    } else if (jVar != null) {
                                        defpackage.i iVarB2 = B3.f.b(fVar, d11.doubleValue(), z6 ? (defpackage.i) rVar : iVar, 4);
                                        if (iVarB2 != null) {
                                            m6.f8306A = iVarB2;
                                            Thread.sleep((long) ((((double) iVarB2.w()) - d11.doubleValue()) * ((double) 1000)));
                                        } else {
                                            Thread.sleep(1000L);
                                        }
                                    } else {
                                        Thread.sleep(1000L);
                                    }
                                } else {
                                    Thread.sleep(1000L);
                                }
                            }
                        }
                    }
                } else {
                    interfaceC0335w = interfaceC0335w;
                    Thread.sleep(1000L);
                }
                k3 = this;
                interfaceC0335w = interfaceC0335w;
            }
            interfaceC0335w = interfaceC0335w;
            k3 = this;
            interfaceC0335w = interfaceC0335w;
        }
        return p084p4.x.f10867a;
    }
}
