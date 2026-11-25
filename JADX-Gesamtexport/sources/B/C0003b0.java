package B;

import F.C0074p;
import L.AbstractC0136f;
import L.e2;
import L.g2;
import N.C0208d;
import N.C0230o;
import N.C0248x0;
import N.EnumC0236r0;
import N.InterfaceC0225l0;
import N3.C0255b;
import P4.AbstractC0336x;
import P4.C0319f;
import P4.C0332t;
import android.graphics.RectF;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p035g0.InterfaceC0714o;
import p112v.C0998p0;
import p112v.C1001r0;
import p123x.AbstractC1084q;
import p123x.C1086t;
import p124x0.AbstractC1098f;
import p124x0.C1097e;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1119a;
import p130y0.C1122b0;

/* JADX INFO: renamed from: B.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0003b0 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f287h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0003b0(int i, int i3, Object obj) {
        super(2);
        this.f287h = i3;
        this.i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0381 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0383 A[Catch: all -> 0x0377, LOOP:6: B:141:0x0348->B:158:0x0383, LOOP_END, TryCatch #0 {all -> 0x0377, blocks: (B:134:0x0325, B:136:0x0335, B:138:0x033b, B:141:0x0348, B:143:0x0354, B:145:0x035e, B:147:0x0364, B:149:0x036d, B:154:0x0379, B:155:0x037c, B:158:0x0383, B:168:0x03a7, B:159:0x0385, B:160:0x038b, B:162:0x0391, B:164:0x0399, B:167:0x03a3), top: B:234:0x0325 }] */
    /* JADX WARN: Code duplicated, block: B:256:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x022e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0231  */
    /* JADX WARN: Code duplicated, block: B:90:0x0237  */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x0237, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v52, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r2v66, types: [D4.f, E4.l, java.lang.Object] */
    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        char c6;
        char c7;
        Collection collectionJ0;
        int i = 4;
        char c8 = 7;
        Object objT = null;
        char c9 = 3;
        boolean zF = false;
        switch (this.f287h) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0029o0.g((F.P) this.i, (C0230o) obj, C0208d.V(1));
                return p084p4.x.f10867a;
            case 1:
                ((D0) this.i).d(((p030f0.c) obj2).f8837a);
                return p084p4.x.f10867a;
            case 2:
                ((Number) obj2).intValue();
                ((f1) this.i).a(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 3:
                p030f0.d dVarX = p035g0.H.x((RectF) obj);
                p030f0.d dVarX2 = p035g0.H.x((RectF) obj2);
                switch (((C0074p) this.i).f1199h) {
                    case 4:
                        zF = dVarX.f(dVarX2);
                        break;
                    default:
                        long jA = dVarX.a();
                        dVarX2.getClass();
                        if (p030f0.c.d(jA) >= dVarX2.f8839a && p030f0.c.d(jA) < dVarX2.f8841c && p030f0.c.e(jA) >= dVarX2.f8840b && p030f0.c.e(jA) < dVarX2.f8842d) {
                            zF = true;
                        }
                        break;
                }
                return Boolean.valueOf(zF);
            case 4:
                ((Number) obj2).intValue();
                p027e3.a.G((G1.p) this.i, (C0230o) obj, C0208d.V(1));
                return p084p4.x.f10867a;
            case 5:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    Z.o oVarK = androidx.compose.foundation.layout.a.f(Z.l.f5957a, AbstractC0136f.f2717d).k(new HorizontalAlignElement(Z.b.f5943s));
                    c0230o.W(733328855);
                    C1086t c1086tF = AbstractC1084q.f(Z.b.f5933h, false, c0230o, 0);
                    c0230o.W(-1323940314);
                    int i3 = c0230o.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    V.a aVarH = p113v0.U.h(oVarK);
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, c1086tF);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o, i3, c1100h);
                    }
                    AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
                    ((D4.e) this.i).d(c0230o, 0);
                    c0230o.p(false);
                    c0230o.p(true);
                    c0230o.p(false);
                    c0230o.p(false);
                }
                return p084p4.x.f10867a;
            case 6:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    G0.J j4 = ((g2) this.i).f2754j;
                    V.a aVar = N3.M.f4035a;
                    e2.a(j4, c0230o2, 0);
                }
                return p084p4.x.f10867a;
            case 7:
                float fFloatValue = ((Number) obj2).floatValue();
                ((p091r0.q) obj).a();
                ((E4.t) this.i).f1071h = fFloatValue;
                return p084p4.x.f10867a;
            case 8:
                ((Number) obj2).intValue();
                int iV = C0208d.V(1);
                V.a aVar2 = N3.M.f4035a;
                e2.a((G0.J) this.i, (C0230o) obj, iV);
                return p084p4.x.f10867a;
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Number) obj2).intValue();
                E4.k.f("$this$$receiver", charSequence);
                int iH0 = M4.l.h0(charSequence, (char[]) this.i, iIntValue, false);
                if (iH0 < 0) {
                    return null;
                }
                return new p084p4.h(Integer.valueOf(iH0), 1);
            case 10:
                Set set = (Set) obj;
                C0248x0 c0248x0 = (C0248x0) this.i;
                synchronized (c0248x0.f3855b) {
                    try {
                        if (((EnumC0236r0) c0248x0.f3870r.getValue()).compareTo(EnumC0236r0.f3788l) >= 0) {
                            p080p.A a6 = c0248x0.f3860g;
                            if (set instanceof P.f) {
                                p080p.A a7 = ((P.f) set).f4594h;
                                Object[] objArr = a7.f10709b;
                                long[] jArr = a7.f10708a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j6 = jArr[i6];
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                                            for (int i8 = 0; i8 < i7; i8++) {
                                                if ((j6 & 255) < 128) {
                                                    Object obj3 = objArr[(i6 << 3) + i8];
                                                    if (!(obj3 instanceof X.C) || ((X.C) obj3).d(1)) {
                                                        a6.a(obj3);
                                                    }
                                                }
                                                j6 >>= 8;
                                            }
                                            if (i7 == 8) {
                                                if (i6 != length) {
                                                    i6++;
                                                }
                                            }
                                        } else if (i6 != length) {
                                            i6++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof X.C) || ((X.C) obj4).d(1)) {
                                        a6.a(obj4);
                                    }
                                }
                            }
                            objT = c0248x0.t();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (objT != null) {
                    ((C0319f) objT).g(p084p4.x.f10867a);
                }
                return p084p4.x.f10867a;
            case 11:
                Set set2 = (Set) obj;
                if (set2 instanceof P.f) {
                    p080p.A a8 = ((P.f) set2).f4594h;
                    Object[] objArr2 = a8.f10709b;
                    long[] jArr2 = a8.f10708a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j7 = jArr2[i9];
                            if ((((~j7) << c8) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                int i11 = 0;
                                while (true) {
                                    if (i11 < i10) {
                                        if ((j7 & 255) < 128) {
                                            Object obj5 = objArr2[(i9 << 3) + i11];
                                            if (!(obj5 instanceof X.C) || ((X.C) obj5).d(4)) {
                                            }
                                        }
                                        j7 >>= 8;
                                        i11++;
                                        c9 = c9;
                                        c8 = c8;
                                    } else {
                                        c6 = c8;
                                        c7 = c9;
                                        if (i10 == 8) {
                                        }
                                    }
                                }
                            } else {
                                c6 = c8;
                                c7 = c9;
                            }
                            if (i9 != length2) {
                                i9++;
                                c9 = c7;
                                c8 = c6;
                            }
                        }
                        ((R4.b) this.i).j(set2);
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj6 : set3) {
                            if (!(obj6 instanceof X.C) || ((X.C) obj6).d(4)) {
                                ((R4.b) this.i).j(set2);
                            }
                        }
                    }
                }
                return p084p4.x.f10867a;
            case 12:
                int iIntValue2 = ((Number) obj).intValue();
                p111u4.g gVar = (p111u4.g) obj2;
                p111u4.h key = gVar.getKey();
                p111u4.g gVarJ = ((T4.s) this.i).f5291l.J(key);
                if (key != C0332t.i) {
                    return Integer.valueOf(gVar != gVarJ ? Integer.MIN_VALUE : iIntValue2 + 1);
                }
                P4.T t6 = (P4.T) gVarJ;
                for (P4.T parent = (P4.T) gVar; parent != null; parent = parent.getParent()) {
                    if (parent == t6 || !(parent instanceof U4.q)) {
                        objT = parent;
                        if (objT == t6) {
                            if (t6 != null) {
                                iIntValue2++;
                            }
                            return Integer.valueOf(iIntValue2);
                        }
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objT + ", expected child of " + t6 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                if (objT == t6) {
                    if (t6 != null) {
                        iIntValue2++;
                    }
                    return Integer.valueOf(iIntValue2);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objT + ", expected child of " + t6 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            case 13:
                ((Number) obj2).intValue();
                ((V0.r) this.i).a(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 14:
                ((Number) obj2).intValue();
                ((V0.y) this.i).a(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 15:
                Collection collection = (Set) obj;
                while (true) {
                    X.x xVar = (X.x) this.i;
                    AtomicReference atomicReference = xVar.f5742b;
                    Object obj7 = atomicReference.get();
                    if (obj7 == null) {
                        collectionJ0 = collection;
                    } else if (obj7 instanceof Set) {
                        collectionJ0 = p089q4.m.M(obj7, collection);
                    } else {
                        if (!(obj7 instanceof List)) {
                            C0208d.x("Unexpected notification");
                            throw null;
                        }
                        collectionJ0 = p089q4.l.j0((Collection) obj7, com.fasterxml.jackson.databind.deser.std.d0.v(collection));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj7, collectionJ0)) {
                            if (X.x.a(xVar)) {
                                xVar.f5741a.invoke(new C0043w(26, xVar));
                            }
                            return p084p4.x.f10867a;
                        }
                    } while (atomicReference.get() == obj7);
                }
                break;
            case 16:
                Z.o oVar = (Z.o) obj;
                Z.o oVarB = (Z.m) obj2;
                if (oVarB instanceof Z.j) {
                    ?? r6 = ((Z.j) oVarB).f5955c;
                    E4.z.d(3, r6);
                    Z.l lVar = Z.l.f5957a;
                    C0230o c0230o3 = (C0230o) this.i;
                    oVarB = Z.a.b(c0230o3, (Z.o) r6.c(lVar, c0230o3, 0));
                }
                return oVar.k(oVarB);
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                ((Number) obj2).intValue();
                S1.h0.a((C0255b) this.i, (C0230o) obj, 7);
                return p084p4.x.f10867a;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                p090r.x xVar2 = (p090r.x) obj;
                p090r.x xVar3 = (p090r.x) obj2;
                p090r.x xVar4 = p090r.x.f11449j;
                if (xVar2 == xVar4 && xVar3 == xVar4 && !((p090r.H) this.i).f11378a.f11393d) {
                    zF = true;
                }
                return Boolean.valueOf(zF);
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                ((p096s.H) this.i).a(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 20:
                float fFloatValue2 = ((Number) obj).floatValue();
                float fFloatValue3 = ((Number) obj2).floatValue();
                C1001r0 c1001r0 = (C1001r0) this.i;
                AbstractC0336x.o(c1001r0.n0(), null, new C0998p0(c1001r0, fFloatValue2, fFloatValue3, null), 3);
                return Boolean.TRUE;
            case 21:
                return new S0.h(S1.h0.c(0, Math.round((1 + ((Z.f) this.i).f5949a) * (((int) (((S0.j) obj).f4896a & 4294967295L)) / 2.0f))));
            case 22:
                return new S0.h(((Z.g) this.i).a(0L, ((S0.j) obj).f4896a, (S0.k) obj2));
            case 23:
                InterfaceC0714o interfaceC0714o = (InterfaceC0714o) obj;
                p048j0.b bVar = (p048j0.b) obj2;
                p124x0.Y y2 = (p124x0.Y) this.i;
                if (y2.f13989s.E()) {
                    p124x0.h0 snapshotObserver = ((p130y0.r) AbstractC1098f.u(y2.f13989s)).getSnapshotObserver();
                    p035g0.J j8 = p124x0.Y.f13977L;
                    snapshotObserver.a(y2, C1097e.f14010k, new c1(y2, interfaceC0714o, bVar, i));
                    y2.J = false;
                } else {
                    y2.J = true;
                }
                return p084p4.x.f10867a;
            case 24:
                C0230o c0230o4 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    ((AbstractC1119a) this.i).a(0, c0230o4);
                }
                return p084p4.x.f10867a;
            default:
                ((Number) obj2).intValue();
                ((C1122b0) this.i).a(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0003b0(int i, Object obj) {
        super(2);
        this.f287h = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0003b0(G0.J j4, int i) {
        super(2);
        this.f287h = 8;
        V.a aVar = N3.M.f4035a;
        this.i = j4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0003b0(g2 g2Var) {
        super(2);
        this.f287h = 6;
        V.a aVar = N3.M.f4035a;
        this.i = g2Var;
    }
}
