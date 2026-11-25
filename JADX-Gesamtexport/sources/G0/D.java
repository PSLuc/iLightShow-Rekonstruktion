package G0;

import S1.V;
import com.fasterxml.jackson.databind.deser.std.d0;
import kotlin.NoWhenBranchMatchedException;
import p015c2.AbstractC0473d;
import p035g0.AbstractC0712m;
import p035g0.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f1443a = d0.q(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f1444b = d0.q(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f1445c = p035g0.r.f9084k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final R0.n f1446d;

    static {
        long j4 = p035g0.r.f9076b;
        f1446d = j4 != 16 ? new R0.c(j4) : R0.l.f4751a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x017b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0182  */
    /* JADX WARN: Code duplicated, block: B:110:0x0188  */
    /* JADX WARN: Code duplicated, block: B:113:0x0195  */
    /* JADX WARN: Code duplicated, block: B:115:0x019e  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:122:0x01af  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01db  */
    /* JADX WARN: Code duplicated, block: B:139:0x01df  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:156:0x0202  */
    /* JADX WARN: Code duplicated, block: B:158:0x0206  */
    /* JADX WARN: Code duplicated, block: B:159:0x0209  */
    /* JADX WARN: Code duplicated, block: B:7:0x0029 A[PHI: r11
  0x0029: PHI (r11v8 long) = 
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v9 long)
 binds: [B:36:0x0088, B:48:0x00b2, B:45:0x00a8, B:42:0x009e, B:39:0x0094, B:34:0x007c, B:29:0x006f, B:25:0x005f, B:22:0x0059, B:19:0x004f, B:16:0x0045, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    /* JADX WARN: Code duplicated, block: B:84:0x011e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0124  */
    /* JADX WARN: Code duplicated, block: B:86:0x0126  */
    /* JADX WARN: Code duplicated, block: B:88:0x012c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0135  */
    /* JADX WARN: Code duplicated, block: B:91:0x013b  */
    /* JADX WARN: Code duplicated, block: B:93:0x013f  */
    public static final C a(C c6, long j4, AbstractC0712m abstractC0712m, float f6, long j6, L0.k kVar, L0.i iVar, L0.j jVar, L0.p pVar, String str, long j7, R0.a aVar, R0.o oVar, N0.b bVar, long j8, R0.j jVar2, p035g0.L l6, w wVar, p044i0.e eVar) {
        long j9;
        R0.o oVar2;
        long j10;
        p044i0.e eVar2;
        R0.l lVar;
        R0.n cVar;
        R0.n nVar;
        boolean z5;
        R0.m mVar;
        L0.p pVar2;
        L0.k kVar2;
        L0.i iVar2;
        L0.j jVar3;
        long j11;
        R0.o oVar3;
        N0.b bVar2;
        p035g0.L l7;
        w wVar2;
        p044i0.e eVar3;
        long jI;
        String str2 = str;
        R0.a aVar2 = aVar;
        R0.j jVar4 = jVar2;
        if (!d0.u(j6)) {
            j9 = j6;
            if (!S0.m.a(j9, c6.f1429b)) {
                oVar2 = oVar;
                j10 = j8;
                eVar2 = eVar;
            }
            lVar = R0.l.f4751a;
            if (abstractC0712m != null) {
                if (abstractC0712m instanceof O) {
                    jI = AbstractC0473d.I(f6, ((O) abstractC0712m).f9050a);
                    if (jI != 16) {
                        cVar = new R0.c(jI);
                    } else {
                        cVar = lVar;
                    }
                } else {
                    if (abstractC0712m instanceof p035g0.K) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = new R0.b((p035g0.K) abstractC0712m, f6);
                }
            } else if (j4 != 16) {
                cVar = new R0.c(j4);
            } else {
                cVar = lVar;
            }
            nVar = c6.f1428a;
            nVar.getClass();
            z5 = cVar instanceof R0.b;
            if (!z5 && (nVar instanceof R0.b)) {
                R0.b bVar3 = (R0.b) cVar;
                R0.m mVar2 = new R0.m(nVar, 0);
                float fFloatValue = ((R0.b) cVar).f4732b;
                if (Float.isNaN(fFloatValue)) {
                    fFloatValue = ((Number) mVar2.invoke()).floatValue();
                }
                cVar = new R0.b(bVar3.f4731a, fFloatValue);
            } else if (z5 || (nVar instanceof R0.b)) {
                if (z5 && (nVar instanceof R0.b)) {
                    cVar = nVar;
                } else {
                    mVar = new R0.m(nVar, 1);
                    if (cVar.equals(lVar)) {
                        cVar = (R0.n) mVar.invoke();
                    }
                }
            }
            if (pVar == null) {
                pVar2 = c6.f1433f;
            } else {
                pVar2 = pVar;
            }
            if (d0.u(j9)) {
                j9 = c6.f1429b;
            }
            if (kVar == null) {
                kVar2 = c6.f1430c;
            } else {
                kVar2 = kVar;
            }
            if (iVar == null) {
                iVar2 = c6.f1431d;
            } else {
                iVar2 = iVar;
            }
            if (jVar == null) {
                jVar3 = c6.f1432e;
            } else {
                jVar3 = jVar;
            }
            if (str2 == null) {
                str2 = c6.f1434g;
            }
            if (d0.u(j7)) {
                j11 = c6.f1435h;
            } else {
                j11 = j7;
            }
            if (aVar2 == null) {
                aVar2 = c6.i;
            }
            if (oVar2 == null) {
                oVar3 = c6.f1436j;
            } else {
                oVar3 = oVar2;
            }
            if (bVar == null) {
                bVar2 = c6.f1437k;
            } else {
                bVar2 = bVar;
            }
            if (j10 == 16) {
                j10 = c6.f1438l;
            }
            if (jVar4 == null) {
                jVar4 = c6.f1439m;
            }
            long j12 = j11;
            if (l6 == null) {
                l7 = c6.f1440n;
            } else {
                l7 = l6;
            }
            wVar2 = c6.f1441o;
            if (wVar2 == null) {
                wVar2 = wVar;
            }
            if (eVar2 == null) {
                eVar3 = c6.f1442p;
            } else {
                eVar3 = eVar2;
            }
            return new C(cVar, j9, kVar2, iVar2, jVar3, pVar2, str2, j12, aVar2, oVar3, bVar2, j10, jVar4, l7, wVar2, eVar3);
        }
        j9 = j6;
        if ((abstractC0712m != null || j4 == 16 || p035g0.r.c(j4, c6.f1428a.a())) && ((iVar == null || iVar.equals(c6.f1431d)) && ((kVar == null || kVar.equals(c6.f1430c)) && ((pVar == null || pVar == c6.f1433f) && (d0.u(j7) || S0.m.a(j7, c6.f1435h)))))) {
            if ((jVar4 == null || jVar4.equals(c6.f1439m)) && E4.k.a(abstractC0712m, c6.f1428a.b()) && ((abstractC0712m == null || f6 == c6.f1428a.c()) && ((jVar == null || jVar.equals(c6.f1432e)) && ((str2 == null || str2.equals(c6.f1434g)) && (aVar2 == null || aVar2.equals(c6.i)))))) {
                if (oVar != null) {
                    oVar2 = oVar;
                    if (oVar2.equals(c6.f1436j)) {
                    }
                } else {
                    oVar2 = oVar;
                }
                if (bVar == null || bVar.equals(c6.f1437k)) {
                    if (j8 != 16) {
                        j10 = j8;
                        if (p035g0.r.c(j10, c6.f1438l)) {
                        }
                    } else {
                        j10 = j8;
                    }
                    if (l6 == null || l6.equals(c6.f1440n)) {
                        if (wVar == null || wVar.equals(c6.f1441o)) {
                            eVar2 = eVar;
                            if (eVar2 == null || eVar2.equals(c6.f1442p)) {
                                return c6;
                            }
                        }
                    }
                    eVar2 = eVar;
                }
                eVar2 = eVar;
            } else {
                oVar2 = oVar;
            }
            j10 = j8;
            eVar2 = eVar;
        } else {
            oVar2 = oVar;
            j10 = j8;
            eVar2 = eVar;
        }
        lVar = R0.l.f4751a;
        if (abstractC0712m != null) {
            if (abstractC0712m instanceof O) {
                jI = AbstractC0473d.I(f6, ((O) abstractC0712m).f9050a);
                if (jI != 16) {
                    cVar = new R0.c(jI);
                } else {
                    cVar = lVar;
                }
            } else {
                if (abstractC0712m instanceof p035g0.K) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new R0.b((p035g0.K) abstractC0712m, f6);
            }
        } else if (j4 != 16) {
            cVar = new R0.c(j4);
        } else {
            cVar = lVar;
        }
        nVar = c6.f1428a;
        nVar.getClass();
        z5 = cVar instanceof R0.b;
        if (!z5) {
            if (z5) {
                if (z5) {
                    mVar = new R0.m(nVar, 1);
                    if (cVar.equals(lVar)) {
                        cVar = (R0.n) mVar.invoke();
                    }
                } else {
                    mVar = new R0.m(nVar, 1);
                    if (cVar.equals(lVar)) {
                        cVar = (R0.n) mVar.invoke();
                    }
                }
            } else if (z5) {
                mVar = new R0.m(nVar, 1);
                if (cVar.equals(lVar)) {
                    cVar = (R0.n) mVar.invoke();
                }
            } else {
                mVar = new R0.m(nVar, 1);
                if (cVar.equals(lVar)) {
                    cVar = (R0.n) mVar.invoke();
                }
            }
        } else if (z5) {
            if (z5) {
                mVar = new R0.m(nVar, 1);
                if (cVar.equals(lVar)) {
                    cVar = (R0.n) mVar.invoke();
                }
            } else {
                mVar = new R0.m(nVar, 1);
                if (cVar.equals(lVar)) {
                    cVar = (R0.n) mVar.invoke();
                }
            }
        } else if (z5) {
            mVar = new R0.m(nVar, 1);
            if (cVar.equals(lVar)) {
                cVar = (R0.n) mVar.invoke();
            }
        } else {
            mVar = new R0.m(nVar, 1);
            if (cVar.equals(lVar)) {
                cVar = (R0.n) mVar.invoke();
            }
        }
        if (pVar == null) {
            pVar2 = c6.f1433f;
        } else {
            pVar2 = pVar;
        }
        if (d0.u(j9)) {
            j9 = c6.f1429b;
        }
        if (kVar == null) {
            kVar2 = c6.f1430c;
        } else {
            kVar2 = kVar;
        }
        if (iVar == null) {
            iVar2 = c6.f1431d;
        } else {
            iVar2 = iVar;
        }
        if (jVar == null) {
            jVar3 = c6.f1432e;
        } else {
            jVar3 = jVar;
        }
        if (str2 == null) {
            str2 = c6.f1434g;
        }
        if (d0.u(j7)) {
            j11 = j7;
        } else {
            j11 = c6.f1435h;
        }
        if (aVar2 == null) {
            aVar2 = c6.i;
        }
        if (oVar2 == null) {
            oVar3 = c6.f1436j;
        } else {
            oVar3 = oVar2;
        }
        if (bVar == null) {
            bVar2 = c6.f1437k;
        } else {
            bVar2 = bVar;
        }
        if (j10 == 16) {
            j10 = c6.f1438l;
        }
        if (jVar4 == null) {
            jVar4 = c6.f1439m;
        }
        long j13 = j11;
        if (l6 == null) {
            l7 = c6.f1440n;
        } else {
            l7 = l6;
        }
        wVar2 = c6.f1441o;
        if (wVar2 == null) {
            wVar2 = wVar;
        }
        if (eVar2 == null) {
            eVar3 = c6.f1442p;
        } else {
            eVar3 = eVar2;
        }
        return new C(cVar, j9, kVar2, iVar2, jVar3, pVar2, str2, j13, aVar2, oVar3, bVar2, j10, jVar4, l7, wVar2, eVar3);
    }

    public static final Object b(Object obj, Object obj2, float f6) {
        return ((double) f6) < 0.5d ? obj : obj2;
    }

    public static final long c(long j4, long j6, float f6) {
        if (d0.u(j4) || d0.u(j6)) {
            return ((S0.m) b(new S0.m(j4), new S0.m(j6), f6)).f4902a;
        }
        if (d0.u(j4) || d0.u(j6)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (S0.n.a(S0.m.b(j4), S0.m.b(j6))) {
            return d0.y(V.G(S0.m.c(j4), S0.m.c(j6), f6), 1095216660480L & j4);
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) S0.n.b(S0.m.b(j4))) + " and " + ((Object) S0.n.b(S0.m.b(j6)))).toString());
    }
}
