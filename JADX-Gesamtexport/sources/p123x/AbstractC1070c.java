package p123x;

import A2.d;
import D4.e;
import E4.k;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0225l0;
import V.a;
import V0.C0383b;
import Z.b;
import Z.g;
import Z.l;
import Z.o;
import java.util.List;
import p081p0.c;
import p113v0.E;
import p113v0.F;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p113v0.U;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: x.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1070c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1069b f13756a = new C1069b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1069b f13757b = new C1069b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13758c = 9;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13759d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13760e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13761f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f13762g = 15;

    public static final void a(o oVar, g gVar, a aVar, C0230o c0230o, int i, int i3) {
        int i6;
        a aVar2;
        g gVar2;
        c0230o.X(1781813501);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i6 = i | 6;
        } else {
            i6 = i | (c0230o.f(oVar) ? 4 : 2);
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= c0230o.f(gVar) ? 32 : 16;
        }
        int i9 = i6 | 384;
        if ((i9 & 1171) == 1170 && c0230o.B()) {
            c0230o.P();
            gVar2 = gVar;
            aVar2 = aVar;
        } else {
            if (i7 != 0) {
                oVar = l.f5957a;
            }
            g gVar3 = i8 != 0 ? b.f5933h : gVar;
            F fE = AbstractC1084q.e(gVar3, false);
            boolean zF = c0230o.f(fE);
            Object objK = c0230o.K();
            if (zF || objK == C0222k.f3714a) {
                aVar2 = aVar;
                objK = new d(fE, 16, aVar2);
                c0230o.f0(objK);
            } else {
                aVar2 = aVar;
            }
            U.b(oVar, (e) objK, c0230o, i9 & 14, 0);
            gVar2 = gVar3;
        }
        o oVar2 = oVar;
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0383b(oVar2, gVar2, aVar2, i, i3, 1);
        }
    }

    public static final void b(C0230o c0230o, o oVar) {
        C1083p c1083p = C1083p.f13791c;
        int i = c0230o.f3744P;
        o oVarC = Z.a.c(c0230o, oVar);
        InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
        InterfaceC1102j.f14043g.getClass();
        C1106n c1106n = C1101i.f14038b;
        p091r0.d dVar = c0230o.f3745a;
        c0230o.Z();
        if (c0230o.f3743O) {
            c0230o.l(c1106n);
        } else {
            c0230o.i0();
        }
        C0208d.R(C1101i.f14041e, c0230o, c1083p);
        C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
        C0208d.R(C1101i.f14039c, c0230o, oVarC);
        C1100h c1100h = C1101i.f14042f;
        if (c0230o.f3743O || !k.a(c0230o.K(), Integer.valueOf(i))) {
            p012c.k.y(i, c0230o, i, c1100h);
        }
        c0230o.p(true);
    }

    public static final S c(E e6) {
        Object objI = e6.i();
        if (objI instanceof S) {
            return (S) objI;
        }
        return null;
    }

    public static final float d(S s6) {
        if (s6 != null) {
            return s6.f13713a;
        }
        return 0.0f;
    }

    public static G e(Q q6, int i, int i3, int i6, int i7, int i8, H h6, List list, N[] nArr, int i9) throws Throwable {
        int[] iArr;
        float f6;
        String str;
        long j4;
        int i10;
        int i11;
        int iO;
        int i12;
        String str2;
        int i13;
        int i14;
        int i15;
        boolean z5;
        List list2 = list;
        int i16 = i9;
        long j6 = i8;
        int[] iArr2 = new int[i16];
        float f7 = 0.0f;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int iMin = 0;
        int iMax = 0;
        while (i17 < i16) {
            E e6 = (E) list2.get(i17);
            float fD = d(c(e6));
            if (fD > 0.0f) {
                f7 += fD;
                i18++;
                i17 = i17;
            } else {
                int i20 = i6 - i19;
                N nC = nArr[i17];
                if (nC == null) {
                    nC = e6.c(q6.d(0, i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i20 < 0 ? 0 : i20, i7, false));
                }
                N n6 = nC;
                int iJ = q6.j(n6);
                int iH = q6.h(n6);
                iArr2[i17] = iJ;
                int i21 = i20 - iJ;
                if (i21 < 0) {
                    i21 = 0;
                }
                iMin = Math.min(i8, i21);
                i19 += iJ + iMin;
                iMax = Math.max(iMax, iH);
                nArr[i17] = n6;
                f7 = f7;
            }
            i17++;
        }
        float f8 = f7;
        int i22 = iMax;
        if (i18 != 0) {
            int i23 = i6 != Integer.MAX_VALUE ? i6 : i;
            long j7 = ((long) (i18 - 1)) * j6;
            iArr = iArr2;
            long j8 = ((long) (i23 - i19)) - j7;
            if (j8 < 0) {
                j8 = 0;
            }
            float f9 = j8 / f8;
            long jRound = j8;
            int i24 = 0;
            while (true) {
                f6 = f9;
                str = "fixedSpace ";
                j4 = j8;
                if (i24 >= i16) {
                    break;
                }
                int i25 = i24;
                float fD2 = d(c((E) list2.get(i24)));
                float f10 = f6 * fD2;
                try {
                    jRound -= (long) Math.round(f10);
                    i24 = i25 + 1;
                    list2 = list;
                    f9 = f6;
                    j8 = j4;
                } catch (IllegalArgumentException e7) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i6 + "mainAxisMin " + i + "targetSpace " + i23 + "arrangementSpacingPx " + j6 + "weightChildrenCount " + i18 + "fixedSpace " + i19 + "arrangementSpacingTotal " + j7 + "remainingToTarget " + j4 + "totalWeight " + f8 + "weightUnitSpace " + f6 + "itemWeight " + fD2 + "weightedSize " + f10).initCause(e7);
                }
            }
            int i26 = i22;
            int i27 = 0;
            int i28 = 0;
            while (true) {
                long j9 = j4;
                if (i28 >= i16) {
                    i10 = i19;
                    i11 = 0;
                    i22 = i26;
                    iO = c.O((int) (((long) i27) + j7), 0, i6 - i10);
                    break;
                }
                if (nArr[i28] == null) {
                    i12 = i28;
                    E e8 = (E) list.get(i28);
                    S sC = c(e8);
                    i13 = i19;
                    float fD3 = d(sC);
                    if (fD3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    str2 = str;
                    int i29 = i18;
                    jRound -= (long) iSignum;
                    float f11 = f6 * fD3;
                    int iMax2 = Math.max(0, Math.round(f11) + iSignum);
                    if (sC != null) {
                        try {
                            z5 = sC.f13714b;
                        } catch (IllegalArgumentException e9) {
                            e = e9;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i6 + "mainAxisMin " + i + "targetSpace " + i23 + "arrangementSpacingPx " + j6 + "weightChildrenCount " + i29 + str2 + i13 + "arrangementSpacingTotal " + j7 + "remainingToTarget " + j9 + "totalWeight " + f8 + "weightUnitSpace " + f6 + "weight " + fD3 + "weightedSize " + f11 + "crossAxisDesiredSize nullremainderUnit " + iSignum + "childMainAxisSize " + iMax2).initCause(e);
                        }
                    } else {
                        z5 = true;
                    }
                    try {
                        N nC2 = e8.c(q6.d((!z5 || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i7, true));
                        int iJ2 = q6.j(nC2);
                        int iH2 = q6.h(nC2);
                        iArr[i12] = iJ2;
                        i15 = i27 + iJ2;
                        int iMax3 = Math.max(i26, iH2);
                        nArr[i12] = nC2;
                        i26 = iMax3;
                        i14 = i29;
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i6 + "mainAxisMin " + i + "targetSpace " + i23 + "arrangementSpacingPx " + j6 + "weightChildrenCount " + i29 + str2 + i13 + "arrangementSpacingTotal " + j7 + "remainingToTarget " + j9 + "totalWeight " + f8 + "weightUnitSpace " + f6 + "weight " + fD3 + "weightedSize " + f11 + "crossAxisDesiredSize nullremainderUnit " + iSignum + "childMainAxisSize " + iMax2).initCause(e);
                    }
                } else {
                    i12 = i28;
                    str2 = str;
                    i13 = i19;
                    i14 = i18;
                    i15 = i27;
                }
                j4 = j9;
                i28 = i12 + 1;
                i27 = i15;
                i18 = i14;
                i19 = i13;
                str = str2;
                i16 = i9;
            }
        } else {
            iArr = iArr2;
            i10 = i19 - iMin;
            i11 = 0;
            iO = 0;
        }
        int i30 = i10 + iO;
        if (i30 < 0) {
            i30 = i11;
        }
        int iMax4 = Math.max(i30, i);
        int iMax5 = Math.max(i22, Math.max(i3, i11));
        int[] iArr3 = new int[i9];
        for (int i31 = i11; i31 < i9; i31++) {
            iArr3[i31] = i11;
        }
        q6.f(iMax4, h6, iArr, iArr3);
        return q6.b(nArr, h6, iArr3, iMax4, iMax5);
    }

    public static final H f(p008b1.c cVar) {
        return new H(cVar.f7047a, cVar.f7048b, cVar.f7049c, cVar.f7050d);
    }

    public static final void g(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
