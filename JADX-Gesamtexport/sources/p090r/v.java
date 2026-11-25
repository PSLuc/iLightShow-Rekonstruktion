package p090r;

import B.C0003b0;
import B.C0031p0;
import D4.c;
import E4.k;
import E4.l;
import E4.w;
import G0.m;
import M0.n;
import N.C0211e0;
import P4.C0319f;
import S0.e;
import S1.V;
import S1.h0;
import android.graphics.Bitmap;
import com.github.kittinunf.fuel.core.FuelError;
import com.spotify.sdk.android.auth.LoginActivity;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p015c2.AbstractC0473d;
import p030f0.f;
import p035g0.B;
import p035g0.C;
import p035g0.C0701b;
import p035g0.C0704e;
import p035g0.C0706g;
import p035g0.C0709j;
import p035g0.C0710k;
import p035g0.C0715p;
import p035g0.D;
import p035g0.E;
import p035g0.F;
import p035g0.H;
import p035g0.InterfaceC0714o;
import p035g0.O;
import p035g0.r;
import p040h0.d;
import p044i0.a;
import p044i0.b;
import p044i0.g;
import p044i0.h;
import p084p4.u;
import p084p4.x;
import p091r0.y;
import p092r1.J;
import p092r1.K;
import p096s.C0923p;
import p101t.A;
import p101t.C0949q;
import p101t.C0950s;
import p101t.C0951t;
import p101t.C0954w;
import p101t.s0;
import p103t1.i;
import p107u.j;
import p112v.C1001r0;
import p112v.C1017z0;
import p113v0.C1029l;
import p113v0.InterfaceC1033p;
import p124x0.InterfaceC1093a;
import p124x0.Y;
import p126x2.z;
import p130y0.AbstractC1140k0;
import p130y0.C1128e0;
import p130y0.C1142l0;
import p130y0.C1146n0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11443h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, Object obj) {
        super(1);
        this.f11443h = i;
        this.i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:158:0x03db  */
    /* JADX WARN: Type inference failed for: r1v51, types: [v0.N, x0.a] */
    @Override // D4.c
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        C0709j c0709j;
        int i;
        Object zVar;
        int i3 = 8;
        boolean z5 = true;
        int i6 = 0;
        switch (this.f11443h) {
            case 0:
                C0923p c0923p = (C0923p) obj;
                float f6 = c0923p.f12068b;
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                float f7 = c0923p.f12069c;
                if (f7 < -0.5f) {
                    f7 = -0.5f;
                }
                if (f7 > 0.5f) {
                    f7 = 0.5f;
                }
                float f8 = c0923p.f12070d;
                float f9 = f8 >= -0.5f ? f8 : -0.5f;
                float f10 = f9 <= 0.5f ? f9 : 0.5f;
                float f11 = c0923p.f12067a;
                float f12 = f11 >= 0.0f ? f11 : 0.0f;
                return new r(r.a(H.b(f6, f7, f10, f12 <= 1.0f ? f12 : 1.0f, d.f9240t), (p040h0.c) this.i));
            case 1:
                Throwable th = (Throwable) obj;
                y yVar = (y) this.i;
                C0319f c0319f = yVar.f11546j;
                if (c0319f != null) {
                    c0319f.i(th);
                }
                yVar.f11546j = null;
                return x.f10867a;
            case 2:
                Throwable th2 = (Throwable) obj;
                J j4 = (J) this.i;
                if (th2 != null) {
                    j4.f11601h.C(new K(th2));
                }
                if (j4.f11602j.i != u.f10864a) {
                    ((i) j4.f11602j.getValue()).close();
                }
                return x.f10867a;
            case 3:
                p019d0.c cVar = (p019d0.c) obj;
                C0951t c0951t = (C0951t) this.i;
                if (cVar.a() * c0951t.f12427x < 0.0f || f.c(cVar.f8571h.f()) <= 0.0f) {
                    return cVar.b(p101t.r.i);
                }
                float f13 = 2;
                float fMin = Math.min(e.a(c0951t.f12427x, 0.0f) ? 1.0f : (float) Math.ceil(cVar.a() * c0951t.f12427x), (float) Math.ceil(f.c(cVar.f8571h.f()) / f13));
                float f14 = fMin / f13;
                long jY = p081p0.c.y(f14, f14);
                long jF = h0.f(f.d(cVar.f8571h.f()) - fMin, f.b(cVar.f8571h.f()) - fMin);
                float f15 = fMin * f13;
                boolean z6 = f15 > f.c(cVar.f8571h.f());
                E eA = c0951t.f12429z.a(cVar.f8571h.f(), cVar.f8571h.getLayoutDirection(), cVar);
                if (!(eA instanceof B)) {
                    if (!(eA instanceof D)) {
                        boolean z7 = z6;
                        if (!(eA instanceof C)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        O o6 = c0951t.f12428y;
                        if (z7) {
                            jY = 0;
                        }
                        long j6 = jY;
                        if (z7) {
                            jF = cVar.f8571h.f();
                        }
                        return cVar.b(new C(o6, j6, jF, z7 ? g.f9389a : new h(fMin, 0.0f, 0, 0, 30), 1));
                    }
                    O o7 = c0951t.f12428y;
                    p030f0.e eVar = ((D) eA).f9011a;
                    if (V.E(eVar)) {
                        return cVar.b(new C0950s(z6, o7, eVar.f8847e, f14, fMin, jY, jF, new h(fMin, 0.0f, 0, 0, 30)));
                    }
                    boolean z8 = z6;
                    if (c0951t.f12426w == null) {
                        c0951t.f12426w = new C0949q();
                    }
                    C0949q c0949q = c0951t.f12426w;
                    k.c(c0949q);
                    C0706g c0706g = c0949q.f12402d;
                    C0706g c0706g2 = c0706g;
                    if (c0706g == null) {
                        C0706g c0706gH = H.h();
                        c0949q.f12402d = c0706gH;
                        c0706g2 = c0706gH;
                    }
                    c0706g2.e();
                    F.b(c0706g2, eVar);
                    if (!z8) {
                        F fH = H.h();
                        F.b(fH, new p030f0.e(fMin, fMin, eVar.b() - fMin, eVar.a() - fMin, p081p0.c.B0(fMin, eVar.f8847e), p081p0.c.B0(fMin, eVar.f8848f), p081p0.c.B0(fMin, eVar.f8849g), p081p0.c.B0(fMin, eVar.f8850h)));
                        c0706g2.d(c0706g2, fH, 0);
                    }
                    return cVar.b(new C0870i(c0706g2, i3, o7));
                }
                O o8 = c0951t.f12428y;
                B b6 = (B) eA;
                if (z6) {
                    return cVar.b(new C0870i(b6, 7, o8));
                }
                if (o8 != null) {
                    long j7 = o8.f9050a;
                    C0709j c0709j2 = new C0709j(j7, 5, C0710k.f9071a.a(j7, 5));
                    i = 1;
                    c0709j = c0709j2;
                } else {
                    c0709j = null;
                    i = 0;
                }
                C0706g c0706g3 = b6.f9009a;
                p030f0.d dVarC = c0706g3.c();
                if (c0951t.f12426w == null) {
                    c0951t.f12426w = new C0949q();
                }
                C0949q c0949q2 = c0951t.f12426w;
                k.c(c0949q2);
                C0706g c0706g4 = c0949q2.f12402d;
                C0706g c0706g5 = c0706g4;
                if (c0706g4 == null) {
                    C0706g c0706gH2 = H.h();
                    c0949q2.f12402d = c0706gH2;
                    c0706g5 = c0706gH2;
                }
                c0706g5.e();
                F.a(c0706g5, dVarC);
                c0706g5.d(c0706g5, c0706g3, 0);
                w wVar = new w();
                long jB = AbstractC0473d.b((int) Math.ceil(dVarC.c()), (int) Math.ceil(dVarC.b()));
                C0949q c0949q3 = c0951t.f12426w;
                k.c(c0949q3);
                C0704e c0704eF = c0949q3.f12399a;
                C0701b c0701bA = c0949q3.f12400b;
                p035g0.y yVar2 = c0704eF != null ? new p035g0.y(c0704eF.a()) : null;
                if (yVar2 != null && yVar2.f9093a == 0) {
                    i6 = 1;
                } else {
                    p035g0.y yVar3 = c0704eF != null ? new p035g0.y(c0704eF.a()) : null;
                    if (yVar3 != null && i == yVar3.f9093a) {
                        i6 = 1;
                    }
                }
                if (c0704eF == null || c0701bA == null) {
                    c0704eF = H.f((int) (jB >> 32), (int) (4294967295L & jB), i);
                    c0949q3.f12399a = c0704eF;
                    c0701bA = H.a(c0704eF);
                    c0949q3.f12400b = c0701bA;
                } else {
                    float fD = f.d(cVar.f8571h.f());
                    Bitmap bitmap = c0704eF.f9060a;
                    if (fD > bitmap.getWidth() || f.b(cVar.f8571h.f()) > bitmap.getHeight() || i6 == 0) {
                        c0704eF = H.f((int) (jB >> 32), (int) (4294967295L & jB), i);
                        c0949q3.f12399a = c0704eF;
                        c0701bA = H.a(c0704eF);
                        c0949q3.f12400b = c0701bA;
                    }
                }
                b bVar = c0949q3.f12401c;
                if (bVar == null) {
                    bVar = new b();
                    c0949q3.f12401c = bVar;
                }
                long jU = AbstractC0473d.U(jB);
                S0.k layoutDirection = cVar.f8571h.getLayoutDirection();
                a aVar = bVar.f9385h;
                S0.b bVar2 = aVar.f9381a;
                S0.k kVar = aVar.f9382b;
                InterfaceC0714o interfaceC0714o = aVar.f9383c;
                long j8 = aVar.f9384d;
                aVar.f9381a = cVar;
                aVar.f9382b = layoutDirection;
                aVar.f9383c = c0701bA;
                aVar.f9384d = jU;
                c0701bA.l();
                p044i0.d.k0(bVar, r.f9076b, jU, 58);
                float f16 = -dVarC.f8839a;
                float f17 = -dVarC.f8840b;
                C0701b c0701b = c0701bA;
                C0031p0 c0031p0 = bVar.i;
                ((C0715p) c0031p0.i).B(f16, f17);
                try {
                    b bVar3 = bVar;
                    p044i0.d.t(bVar3, b6.f9009a, o8, 0.0f, new h(f15, 0.0f, 0, 0, 30), 52);
                    float f18 = 1;
                    float fD2 = (f.d(bVar3.f()) + f18) / f.d(bVar3.f());
                    float fB = (f.b(bVar3.f()) + f18) / f.b(bVar3.f());
                    C0704e c0704e = c0704eF;
                    long jN = bVar3.N();
                    long jL = c0031p0.l();
                    c0031p0.f().l();
                    try {
                        ((C0715p) c0031p0.i).y(fD2, fB, jN);
                        p044i0.d.t(bVar3, c0706g5, o8, 0.0f, null, 28);
                        c0031p0.f().i();
                        c0031p0.x(jL);
                        ((C0715p) c0031p0.i).B(-f16, -f17);
                        c0701b.i();
                        aVar.f9381a = bVar2;
                        aVar.f9382b = kVar;
                        aVar.f9383c = interfaceC0714o;
                        aVar.f9384d = j8;
                        c0704e.f9060a.prepareToDraw();
                        wVar.f1074h = c0704e;
                        return cVar.b(new m(dVarC, wVar, jB, c0709j));
                    } catch (Throwable th3) {
                        c0031p0.f().i();
                        c0031p0.x(jL);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    ((C0715p) c0031p0.i).B(-f16, -f17);
                    throw th4;
                }
            case 4:
                long j9 = ((p030f0.c) obj).f8837a;
                C0954w c0954w = (C0954w) this.i;
                if (c0954w.f12348A) {
                    c0954w.f12349B.invoke();
                }
                return x.f10867a;
            case 5:
                long j10 = ((p030f0.c) obj).f8837a;
                A a6 = (A) this.i;
                if (a6.f12348A) {
                    a6.f12349B.invoke();
                }
                return x.f10867a;
            case 6:
                float fFloatValue = ((Number) obj).floatValue();
                s0 s0Var = (s0) this.i;
                float fH2 = s0Var.f12417a.h() + fFloatValue + s0Var.f12421e;
                float fN = p081p0.c.N(fH2, 0.0f, s0Var.f12420d.h());
                z5 = fH2 == fN;
                C0211e0 c0211e0 = s0Var.f12417a;
                float fH3 = fN - c0211e0.h();
                int iRound = Math.round(fH3);
                c0211e0.j(c0211e0.h() + iRound);
                s0Var.f12421e = fH3 - iRound;
                if (!z5) {
                    fFloatValue = fH3;
                }
                return Float.valueOf(fFloatValue);
            case 7:
                ((p107u.l) this.i).f12638a.setValue(new j(((p030f0.c) obj).f8837a));
                return x.f10867a;
            case 8:
                ((C1001r0) this.i).f13058K.f13011y = (InterfaceC1033p) obj;
                return x.f10867a;
            case 9:
                long j11 = ((p030f0.c) obj).f8837a;
                C1017z0 c1017z0 = (C1017z0) this.i;
                return new p030f0.c(C1017z0.a(c1017z0, c1017z0.f13111h, j11, c1017z0.f13110g));
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                p113v0.V v6 = (p113v0.V) entry.getValue();
                p113v0.B b7 = (p113v0.B) this.i;
                int iL = b7.f13125s.l(key);
                if (iL < 0 || iL >= b7.f13117k) {
                    v6.a();
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 11:
                InterfaceC1093a interfaceC1093a = (InterfaceC1093a) obj;
                if (interfaceC1093a.D()) {
                    if (interfaceC1093a.b().f13854b) {
                        interfaceC1093a.A();
                    }
                    Iterator it = interfaceC1093a.b().i.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        p124x0.E e6 = (p124x0.E) this.i;
                        if (zHasNext) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            p124x0.E.a(e6, (C1029l) entry2.getKey(), ((Number) entry2.getValue()).intValue(), interfaceC1093a.l());
                        } else {
                            Y y2 = interfaceC1093a.l().f13991u;
                            k.c(y2);
                            while (!y2.equals(e6.f13853a.l())) {
                                for (C1029l c1029l : e6.b(y2).keySet()) {
                                    p124x0.E.a(e6, c1029l, e6.c(y2, c1029l), y2);
                                }
                                y2 = y2.f13991u;
                                k.c(y2);
                            }
                        }
                    }
                }
                return x.f10867a;
            case 12:
                ((P.d) this.i).c((Z.m) obj);
                return Boolean.TRUE;
            case 13:
                Exception exc = (Exception) obj;
                k.f("it", exc);
                int i7 = FuelError.i;
                F2.c cVar2 = (F2.c) this.i;
                if (cVar2 instanceof F2.b) {
                    zVar = ((F2.b) cVar2).f1404a;
                } else {
                    if (!(cVar2 instanceof F2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zVar = new z(new URL("http://."));
                }
                return p126x2.g.a(exc, (z) zVar);
            case 14:
                p126x2.w wVar2 = (p126x2.w) obj;
                k.f(LoginActivity.REQUEST_KEY, wVar2);
                ArrayList arrayList = ((p126x2.x) this.i).f14125f;
                int size = arrayList.size();
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    ((c) obj2).invoke(wVar2);
                }
                return x.f10867a;
            case 15:
                return new B.A(i3, (C1128e0) this.i);
            case 16:
                boolean zCompareAndSet = AbstractC1140k0.f14405b.compareAndSet(false, true);
                x xVar = x.f10867a;
                if (zCompareAndSet) {
                    ((R4.b) this.i).j(xVar);
                }
                return xVar;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                p044i0.d dVar = (p044i0.d) obj;
                InterfaceC0714o interfaceC0714oF = dVar.B().f();
                C0003b0 c0003b0 = ((C1142l0) this.i).f14413k;
                if (c0003b0 != null) {
                    c0003b0.d(interfaceC0714oF, (p048j0.b) dVar.B().f394j);
                }
                return x.f10867a;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                n nVar = (n) obj;
                D.F f19 = nVar.f3437b;
                if (f19 != null) {
                    nVar.a(f19);
                    nVar.f3437b = null;
                }
                C1146n0 c1146n0 = (C1146n0) this.i;
                P.d dVar2 = c1146n0.f14434d;
                int i8 = dVar2.f4583j;
                if (i8 > 0) {
                    Object[] objArr = dVar2.f4582h;
                    while (!k.a((WeakReference) objArr[i6], nVar)) {
                        i6++;
                        if (i6 >= i8) {
                            i6 = -1;
                        }
                    }
                } else {
                    i6 = -1;
                }
                P.d dVar3 = c1146n0.f14434d;
                if (i6 >= 0) {
                    dVar3.p(i6);
                }
                if (dVar3.m()) {
                    c1146n0.f14432b.invoke();
                }
                return x.f10867a;
            default:
                ((C0003b0) this.i).d((InterfaceC0714o) obj, null);
                return x.f10867a;
        }
    }
}
