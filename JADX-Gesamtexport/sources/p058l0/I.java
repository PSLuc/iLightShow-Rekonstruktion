package p058l0;

import B.C0024m;
import B.C0031p0;
import B.Z0;
import D4.a;
import D4.c;
import E4.k;
import E4.l;
import N.C0211e0;
import P.d;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S0.b;
import W2.g;
import Z.n;
import h5.C;
import java.io.File;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p024e0.h;
import p024e0.r;
import p035g0.C0715p;
import p084p4.x;
import p086q0.e;
import p096s.AbstractC0909d;
import p096s.Z;
import p096s.o0;
import p101t.AbstractC0942j;
import p101t.K;
import p112v.C1001r0;
import p113v0.B;
import p113v0.C1036t;
import p113v0.X;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.C1095c;
import p124x0.D;
import p124x0.E;
import p124x0.H;
import p124x0.J;
import p124x0.Y;
import p126x2.u;
import p126x2.w;
import p130y0.AbstractC1124c0;
import p130y0.N;
import p130y0.O;

/* JADX INFO: loaded from: classes.dex */
public final class I extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10218h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f10218h = i;
        this.i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0259 A[PHI: r12
  0x0259: PHI (r12v41 java.lang.Boolean) = (r12v30 java.lang.Boolean), (r12v43 java.lang.Boolean) binds: [B:146:0x02ed, B:102:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x025f A[PHI: r12
  0x025f: PHI (r12v39 e0.r) = (r12v29 e0.r), (r12v42 e0.r) binds: [B:144:0x02e7, B:100:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // D4.a
    public final Object invoke() {
        r rVar;
        Boolean boolB;
        boolean zI = false;
        int i = 0;
        int i3 = 0;
        zI = false;
        zI = false;
        x xVar = x.f10867a;
        Object obj = this.i;
        switch (this.f10218h) {
            case 0:
                J j4 = (J) obj;
                int i6 = j4.f10224k;
                C0211e0 c0211e0 = j4.f10222h;
                if (i6 == c0211e0.h()) {
                    c0211e0.j(c0211e0.h() + 1);
                }
                return xVar;
            case 1:
                return (InterfaceC0335w) ((C0031p0) obj).f395k;
            case 2:
                return ((e) obj).y0();
            case 3:
                return k.j((Object[]) obj);
            case 4:
                return Float.valueOf(AbstractC0909d.h(((InterfaceC0335w) obj).d()));
            case 5:
                Z z5 = (Z) obj;
                o0 o0Var = z5.f11919l;
                z5.f11920m = o0Var != null ? ((Number) o0Var.f12066l.getValue()).longValue() : 0L;
                return xVar;
            case 6:
                ((AbstractC0942j) obj).f12349B.invoke();
                return Boolean.TRUE;
            case 7:
                K k3 = (K) obj;
                n nVarE = k3.f5958h;
                d dVar = null;
                while (true) {
                    h hVar = h.f8653m;
                    if (nVarE == null) {
                        n nVar = k3.f5958h;
                        if (!nVar.f5969t) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        d dVar2 = new d(new n[16]);
                        n nVar2 = nVar.f5962m;
                        if (nVar2 == null) {
                            AbstractC1098f.b(dVar2, nVar);
                        } else {
                            dVar2.c(nVar2);
                        }
                        while (dVar2.n()) {
                            n nVarE2 = (n) dVar2.p(dVar2.f4583j - 1);
                            if ((nVarE2.f5960k & 1024) == 0) {
                                AbstractC1098f.b(dVar2, nVarE2);
                            } else {
                                while (true) {
                                    if (nVarE2 == null) {
                                        continue;
                                    } else if ((nVarE2.f5959j & 1024) != 0) {
                                        d dVar3 = null;
                                        while (true) {
                                            if (nVarE2 == null) {
                                                continue;
                                            } else if (nVarE2 instanceof r) {
                                                rVar = (r) nVarE2;
                                                if (rVar.y0().f8655a) {
                                                    boolB = p024e0.d.B(rVar);
                                                    if (boolB != null) {
                                                        zI = boolB.booleanValue();
                                                    }
                                                } else {
                                                    zI = p024e0.d.i(rVar, 7, hVar);
                                                }
                                            } else {
                                                if ((nVarE2.f5959j & 1024) != 0 && (nVarE2 instanceof AbstractC1105m)) {
                                                    int i7 = 0;
                                                    for (n nVar3 = ((AbstractC1105m) nVarE2).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                                        if ((nVar3.f5959j & 1024) != 0) {
                                                            i7++;
                                                            if (i7 == 1) {
                                                                nVarE2 = nVar3;
                                                            } else {
                                                                if (dVar3 == null) {
                                                                    dVar3 = new d(new n[16]);
                                                                }
                                                                if (nVarE2 != null) {
                                                                    dVar3.c(nVarE2);
                                                                    nVarE2 = null;
                                                                }
                                                                dVar3.c(nVar3);
                                                            }
                                                        }
                                                    }
                                                    if (i7 == 1) {
                                                    }
                                                }
                                                nVarE2 = AbstractC1098f.e(dVar3);
                                            }
                                        }
                                    } else {
                                        nVarE2 = nVarE2.f5962m;
                                    }
                                }
                            }
                        }
                    } else if (nVarE instanceof r) {
                        rVar = (r) nVarE;
                        if (rVar.y0().f8655a) {
                            boolB = p024e0.d.B(rVar);
                            if (boolB != null) {
                                zI = boolB.booleanValue();
                            }
                        } else {
                            zI = p024e0.d.i(rVar, 7, hVar);
                        }
                    } else {
                        if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                            int i8 = 0;
                            for (n nVar4 = ((AbstractC1105m) nVarE).f14046v; nVar4 != null; nVar4 = nVar4.f5962m) {
                                if ((nVar4.f5959j & 1024) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        nVarE = nVar4;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new d(new n[16]);
                                        }
                                        if (nVarE != null) {
                                            dVar.c(nVarE);
                                            nVarE = null;
                                        }
                                        dVar.c(nVar4);
                                    }
                                }
                            }
                            if (i8 == 1) {
                            }
                        }
                        nVarE = AbstractC1098f.e(dVar);
                    }
                }
                return Boolean.valueOf(zI);
            case 8:
                C1001r0 c1001r0 = (C1001r0) obj;
                c1001r0.H.i = new C0715p(23, new C0715p((b) AbstractC1098f.h(c1001r0, AbstractC1124c0.f14367f)));
                return xVar;
            case 9:
                B bA = ((X) obj).a();
                D d6 = bA.f13115h;
                if (bA.f13126t != ((P.a) d6.o()).f4578h.f4583j) {
                    Iterator it = bA.f13118l.entrySet().iterator();
                    while (it.hasNext()) {
                        ((C1036t) ((Map.Entry) it.next()).getValue()).f13183d = true;
                    }
                    if (!d6.f13829D.f13910d) {
                        D.Q(d6, false, 7);
                    }
                }
                return xVar;
            case 10:
                File file = (File) ((C0024m) obj).invoke();
                String name = file.getName();
                k.e("getName(...)", name);
                if (M4.l.z0(name, "").equals("preferences_pb")) {
                    String str = C.i;
                    File absoluteFile = file.getAbsoluteFile();
                    k.e("file.absoluteFile", absoluteFile);
                    return g.l(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 11:
                p118w0.d dVar4 = (p118w0.d) obj;
                dVar4.f13406f = false;
                HashSet hashSet = new HashSet();
                d dVar5 = dVar4.f13404d;
                int i9 = dVar5.f4583j;
                d dVar6 = dVar4.f13405e;
                if (i9 > 0) {
                    Object[] objArr = dVar5.f4582h;
                    int i10 = 0;
                    do {
                        D d7 = (D) objArr[i10];
                        p118w0.g gVar = (p118w0.g) dVar6.f4582h[i10];
                        n nVar5 = (n) d7.f13828C.f3796f;
                        if (nVar5.f5969t) {
                            p118w0.d.b(nVar5, gVar, hashSet);
                        }
                        i10++;
                    } while (i10 < i9);
                }
                dVar5.i();
                dVar6.i();
                d dVar7 = dVar4.f13402b;
                int i11 = dVar7.f4583j;
                d dVar8 = dVar4.f13403c;
                if (i11 > 0) {
                    Object[] objArr2 = dVar7.f4582h;
                    do {
                        C1095c c1095c = (C1095c) objArr2[i3];
                        p118w0.g gVar2 = (p118w0.g) dVar8.f4582h[i3];
                        if (c1095c.f5969t) {
                            p118w0.d.b(c1095c, gVar2, hashSet);
                        }
                        i3++;
                    } while (i3 < i11);
                }
                dVar7.i();
                dVar8.i();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C1095c) it2.next()).A0();
                }
                return xVar;
            case 12:
                J j6 = ((D) obj).f13829D;
                j6.f13923r.f13886C = true;
                H h6 = j6.f13924s;
                if (h6 != null) {
                    h6.f13883z = true;
                }
                return xVar;
            case 13:
                p124x0.I i12 = (p124x0.I) obj;
                J j7 = i12.f13892M;
                j7.f13916k = 0;
                d dVarU = j7.f13907a.u();
                int i13 = dVarU.f4583j;
                if (i13 > 0) {
                    Object[] objArr3 = dVarU.f4582h;
                    int i14 = 0;
                    do {
                        p124x0.I i15 = ((D) objArr3[i14]).f13829D.f13923r;
                        i15.f13894n = i15.f13895o;
                        i15.f13895o = Integer.MAX_VALUE;
                        i15.f13906z = false;
                        if (i15.f13898r == 2) {
                            i15.f13898r = 3;
                        }
                        i14++;
                    } while (i14 < i13);
                }
                J j8 = i12.f13892M;
                d dVarU2 = j8.f13907a.u();
                int i16 = dVarU2.f4583j;
                if (i16 > 0) {
                    Object[] objArr4 = dVarU2.f4582h;
                    int i17 = 0;
                    do {
                        ((D) objArr4[i17]).f13829D.f13923r.f13884A.f13856d = false;
                        i17++;
                    } while (i17 < i16);
                }
                i12.l().v0().c();
                D d8 = j8.f13907a;
                d dVarU3 = d8.u();
                int i18 = dVarU3.f4583j;
                if (i18 > 0) {
                    Object[] objArr5 = dVarU3.f4582h;
                    int i19 = 0;
                    do {
                        D d9 = (D) objArr5[i19];
                        if (d9.f13829D.f13923r.f13894n != d9.s()) {
                            d8.I();
                            d8.x();
                            if (d9.s() == Integer.MAX_VALUE) {
                                d9.f13829D.f13923r.r0();
                            }
                        }
                        i19++;
                    } while (i19 < i18);
                }
                d dVarU4 = d8.u();
                int i20 = dVarU4.f4583j;
                if (i20 > 0) {
                    Object[] objArr6 = dVarU4.f4582h;
                    do {
                        E e6 = ((D) objArr6[i]).f13829D.f13923r.f13884A;
                        e6.f13857e = e6.f13856d;
                        i++;
                    } while (i < i20);
                }
                return xVar;
            case 14:
                J j9 = (J) obj;
                j9.a().c(j9.f13925t);
                return xVar;
            case 15:
                Y y2 = ((Y) obj).f13991u;
                if (y2 != null) {
                    y2.S0();
                }
                return xVar;
            case 16:
                p035g0.J j10 = Y.f13977L;
                ((c) obj).invoke(j10);
                j10.f9031w = j10.f9026r.a(j10.f9028t, j10.f9030v, j10.f9029u);
                return xVar;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                A0.b bVar = (A0.b) obj;
                return (w) ((Z0) bVar.f8a).c((u) bVar.f11d, (String) bVar.f12e, bVar.f13f);
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return (InputStream) obj;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                AbstractC0336x.c(((N) obj).f14275j, null);
                return xVar;
            case 20:
                ((O) obj).f14280b = null;
                return xVar;
            default:
                p134z.c cVar = (p134z.c) obj;
                cVar.f14608P.invoke(Boolean.valueOf(!cVar.f14607O));
                return xVar;
        }
    }
}
