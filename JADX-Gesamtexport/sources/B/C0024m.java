package B;

import F1.C0096m;
import F1.C0100q;
import G0.C0107c;
import G0.C0110f;
import N.C0237s;
import N.C0239t;
import N.InterfaceC0203a0;
import android.content.Context;
import android.view.KeyEvent;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import p015c2.AbstractC0473d;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p130y0.C1126d0;
import p130y0.C1169z0;

/* JADX INFO: renamed from: B.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0024m extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f369h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f370j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024m(C0100q c0100q, C0096m c0096m, boolean z5) {
        super(0);
        this.f369h = 5;
        this.i = c0100q;
        this.f370j = c0096m;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x027a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x027c A[LOOP:3: B:119:0x0247->B:129:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x0366  */
    /* JADX WARN: Code duplicated, block: B:204:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:223:0x027e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [P.d] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [P.d] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r4v20 */
    @Override // D4.a
    public final Object invoke() {
        C0110f c0110fC;
        long jY;
        long j4;
        a1 a1VarD;
        C0036s0 c0036s0;
        C0110f c0110f;
        p113v0.M placementScope;
        E0.l lVar;
        p124x0.D d6;
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj = this.f370j;
        Object obj2 = this.i;
        switch (this.f369h) {
            case 0:
                M0.w wVar = (M0.w) obj2;
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) obj;
                if (!G0.I.a(wVar.f3454b, ((M0.w) interfaceC0203a0.getValue()).f3454b)) {
                    interfaceC0203a0.setValue(wVar);
                } else if (!E4.k.a(wVar.f3455c, ((M0.w) interfaceC0203a0.getValue()).f3455c)) {
                    interfaceC0203a0.setValue(wVar);
                }
                return xVar;
            case 1:
                f1 f1Var = (f1) obj2;
                if (f1Var != null) {
                    X.s sVar = f1Var.f318d;
                    if (sVar.isEmpty()) {
                        c0110fC = f1Var.f317c;
                    } else {
                        C0107c c0107c = new C0107c();
                        c0107c.b(f1Var.f315a);
                        B0 b6 = new B0(c0107c);
                        int size = sVar.size();
                        for (int i = 0; i < size; i++) {
                            ((D4.c) sVar.get(i)).invoke(b6);
                        }
                        c0110fC = c0107c.c();
                    }
                    f1Var.f317c = c0110fC;
                    if (c0110fC != null) {
                        return c0110fC;
                    }
                }
                return (C0110f) obj;
            case 2:
                ((C0036s0) obj2).f435u.invoke(new M0.l(((M0.m) obj).f3434d));
                return Boolean.TRUE;
            case 3:
                C0036s0 c0036s1 = (C0036s0) obj2;
                if (c0036s1.b()) {
                    p130y0.C0 c6 = c0036s1.f418c;
                    if (c6 != null) {
                        ((C1126d0) c6).b();
                    }
                } else {
                    ((p024e0.n) obj).a(p024e0.h.f8652l);
                }
                return Boolean.TRUE;
            case 4:
                long j6 = ((S0.j) ((InterfaceC0203a0) obj).getValue()).f4896a;
                F.P p6 = (F.P) obj2;
                p030f0.c cVarG = p6.g();
                if (cVarG == null) {
                    jY = 9205357640488583168L;
                } else {
                    C0036s0 c0036s2 = p6.f1123d;
                    C0110f c0110f2 = c0036s2 != null ? c0036s2.f416a.f54a : null;
                    if (c0110f2 == null || c0110f2.f1494h.length() == 0) {
                        jY = 9205357640488583168L;
                    } else {
                        EnumC0009e0 enumC0009e0 = (EnumC0009e0) p6.f1133o.getValue();
                        int i3 = enumC0009e0 == null ? -1 : F.T.f1145a[enumC0009e0.ordinal()];
                        if (i3 == -1) {
                            jY = 9205357640488583168L;
                        } else {
                            if (i3 == 1 || i3 == 2) {
                                long j7 = p6.j().f3454b;
                                int i6 = G0.I.f1469c;
                                j4 = j7 >> 32;
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                long j8 = p6.j().f3454b;
                                int i7 = G0.I.f1469c;
                                j4 = j8 & 4294967295L;
                            }
                            int i8 = (int) j4;
                            C0036s0 c0036s3 = p6.f1123d;
                            if (c0036s3 == null || (a1VarD = c0036s3.d()) == null || (c0036s0 = p6.f1123d) == null || (c0110f = c0036s0.f416a.f54a) == null) {
                                jY = 9205357640488583168L;
                            } else {
                                int iO = p081p0.c.O(p6.f1121b.b(i8), 0, c0110f.f1494h.length());
                                float fD = p030f0.c.d(a1VarD.d(cVarG.f8837a));
                                G0.G g6 = a1VarD.f281a;
                                int iE = g6.e(iO);
                                float f6 = g6.f(iE);
                                float fG = g6.g(iE);
                                float fN = p081p0.c.N(fD, Math.min(f6, fG), Math.max(f6, fG));
                                if (S0.j.a(j6, 0L) || Math.abs(fD - fN) <= ((int) (j6 >> 32)) / 2) {
                                    G0.n nVar = g6.f1459b;
                                    float fD2 = nVar.d(iE);
                                    jY = p081p0.c.y(fN, ((nVar.b(iE) - fD2) / 2) + fD2);
                                } else {
                                    jY = 9205357640488583168L;
                                }
                            }
                        }
                    }
                }
                return new p030f0.c(jY);
            case 5:
                ((C0100q) obj2).d((C0096m) obj);
                return xVar;
            case 6:
                ((G1.p) obj2).e((C0096m) obj, false);
                return xVar;
            case 7:
                p080p.A a6 = (p080p.A) obj2;
                Object[] objArr = a6.f10709b;
                long[] jArr = a6.f10708a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j9 = jArr[i9];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j9) < 128) {
                                    ((C0239t) obj).w(objArr[(i9 << 3) + i11]);
                                }
                                j9 >>= 8;
                            }
                            if (i10 == 8) {
                                if (i9 != length) {
                                    i9++;
                                }
                            }
                        } else if (i9 != length) {
                            i9++;
                        }
                    }
                }
                return xVar;
            case 8:
                ((p019d0.b) obj2).f8570w.invoke((p019d0.c) obj);
                return xVar;
            case 9:
                ((E4.w) obj2).f1074h = ((p024e0.r) obj).y0();
                return xVar;
            case 10:
                ((R4.f) obj2).j(obj);
                return xVar;
            case 11:
                ((E4.w) obj2).f1074h = AbstractC1098f.h((p101t.L) obj, p113v0.L.f13135a);
                return xVar;
            case 12:
                Context context = (Context) obj2;
                E4.k.e("applicationContext", context);
                String str = ((p108u1.b) obj).f12648a;
                E4.k.f("name", str);
                String strConcat = str.concat(".preferences_pb");
                E4.k.f("fileName", strConcat);
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(strConcat));
            case 13:
                C0237s c0237s = ((p124x0.D) obj2).f13828C;
                if ((((Z.n) c0237s.f3796f).f5960k & 8) != 0) {
                    for (Z.n nVar2 = (p124x0.n0) c0237s.f3795e; nVar2 != null; nVar2 = nVar2.f5961l) {
                        if ((nVar2.f5959j & 8) != 0) {
                            ?? E5 = nVar2;
                            ?? dVar = 0;
                            while (E5 != 0) {
                                if (E5 instanceof p124x0.m0) {
                                    p124x0.m0 m0Var = (p124x0.m0) E5;
                                    E4.w wVar2 = (E4.w) obj;
                                    if (m0Var.Y()) {
                                        E0.h hVar = new E0.h();
                                        wVar2.f1074h = hVar;
                                        hVar.f940j = true;
                                    }
                                    if (m0Var.Z()) {
                                        ((E0.h) wVar2.f1074h).i = true;
                                    }
                                    m0Var.g0((E0.h) wVar2.f1074h);
                                } else if ((E5.f5959j & 8) != 0 && (E5 instanceof AbstractC1105m)) {
                                    Z.n nVar3 = ((AbstractC1105m) E5).f14046v;
                                    int i12 = 0;
                                    E5 = E5;
                                    dVar = dVar;
                                    while (nVar3 != null) {
                                        if ((nVar3.f5959j & 8) != 0) {
                                            i12++;
                                            dVar = dVar;
                                            if (i12 == 1) {
                                                E5 = nVar3;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new P.d(new Z.n[16]);
                                                }
                                                if (E5 != 0) {
                                                    dVar.c(E5);
                                                    E5 = 0;
                                                }
                                                dVar.c(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f5962m;
                                        E5 = E5;
                                        dVar = dVar;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                E5 = AbstractC1098f.e(dVar);
                            }
                        }
                    }
                }
                return xVar;
            case 14:
                p124x0.J j10 = (p124x0.J) obj2;
                p124x0.Y y2 = j10.a().f13991u;
                if (y2 == null || (placementScope = y2.f13936p) == null) {
                    placementScope = ((p130y0.r) AbstractC1098f.u(j10.f13907a)).getPlacementScope();
                }
                p124x0.I i13 = (p124x0.I) obj;
                D4.c cVar = i13.H;
                if (cVar == null) {
                    p124x0.Y yA = j10.a();
                    long j11 = i13.I;
                    float f7 = i13.J;
                    placementScope.getClass();
                    p113v0.M.a(placementScope, yA);
                    yA.h0(S0.h.c(j11, yA.f13140l), f7, null);
                } else {
                    p124x0.Y yA2 = j10.a();
                    long j12 = i13.I;
                    float f8 = i13.J;
                    placementScope.getClass();
                    p113v0.M.a(placementScope, yA2);
                    yA2.h0(S0.h.c(j12, yA2.f13140l), f8, cVar);
                }
                return xVar;
            case 15:
                D4.c cVarE = ((p124x0.j0) obj2).f14044h.e();
                if (cVarE != null) {
                    p124x0.M m6 = (p124x0.M) obj;
                    m6.getClass();
                    cVarE.invoke(new p124x0.L(m6));
                }
                return xVar;
            case 16:
                return ((p126x2.h) ((D) obj2).f65j).deserialize((p126x2.z) obj);
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                p030f0.d dVar2 = (p030f0.d) obj2;
                if (dVar2 != null) {
                    return dVar2;
                }
                p124x0.Y y6 = (p124x0.Y) obj;
                if (!y6.M0().f5969t) {
                    y6 = null;
                }
                if (y6 != null) {
                    return G4.a.e(0L, AbstractC0473d.U(y6.f13138j));
                }
                return null;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            default:
                C1169z0 c1169z0 = (C1169z0) obj2;
                E0.f fVar = c1169z0.f14573l;
                E0.f fVar2 = c1169z0.f14574m;
                Float f9 = c1169z0.f14571j;
                Float f10 = c1169z0.f14572k;
                float fFloatValue = (fVar == null || f9 == null) ? 0.0f : ((Number) fVar.f912a.invoke()).floatValue() - f9.floatValue();
                float fFloatValue2 = (fVar2 == null || f10 == null) ? 0.0f : ((Number) fVar2.f912a.invoke()).floatValue() - f10.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    p130y0.B b7 = (p130y0.B) obj;
                    int iY = b7.y(c1169z0.f14570h);
                    p130y0.B0 b8 = (p130y0.B0) b7.o().f(b7.f14197n);
                    if (b8 != null) {
                        try {
                            p049j1.h hVar2 = b7.f14198o;
                            if (hVar2 != null) {
                                hVar2.f9708a.setBoundsInScreen(b7.f(b8));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    b7.f14188d.invalidate();
                    p130y0.B0 b9 = (p130y0.B0) b7.o().f(iY);
                    if (b9 != null && (lVar = b9.f14210a) != null && (d6 = lVar.f946c) != null) {
                        if (fVar != null) {
                            b7.f14200q.i(iY, fVar);
                        }
                        if (fVar2 != null) {
                            b7.f14201r.i(iY, fVar2);
                        }
                        b7.u(d6);
                    }
                }
                if (fVar != null) {
                    c1169z0.f14571j = (Float) fVar.f912a.invoke();
                }
                if (fVar2 != null) {
                    c1169z0.f14572k = (Float) fVar2.f912a.invoke();
                }
                return xVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0024m(Object obj, int i, Object obj2) {
        super(0);
        this.f369h = i;
        this.i = obj;
        this.f370j = obj2;
    }
}
