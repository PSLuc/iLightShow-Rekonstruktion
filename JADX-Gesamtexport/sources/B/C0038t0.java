package B;

import L.C0123a1;
import L.C0135e1;
import L.C0188w1;
import L.EnumC0193y0;
import N.C0209d0;
import N.C0211e0;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: B.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0038t0 implements p113v0.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f442b;

    public /* synthetic */ C0038t0(int i, Object obj) {
        this.f441a = i;
        this.f442b = obj;
    }

    @Override // p113v0.F
    public final p113v0.G c(p113v0.H h6, List list, long j4) {
        switch (this.f441a) {
            case 0:
                return h6.u(S0.a.h(j4), S0.a.g(j4), p089q4.v.f11238h, new C0005c0(list, 1, this));
            case 1:
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    p113v0.E e6 = (p113v0.E) list.get(i);
                    if (androidx.compose.ui.layout.a.a(e6) == EnumC0193y0.i) {
                        p113v0.N nC = e6.c(j4);
                        int size2 = list.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            p113v0.E e7 = (p113v0.E) list.get(i3);
                            if (androidx.compose.ui.layout.a.a(e7) == EnumC0193y0.f2986h) {
                                p113v0.N nC2 = e7.c(j4);
                                int size3 = list.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    p113v0.E e8 = (p113v0.E) list.get(i6);
                                    if (androidx.compose.ui.layout.a.a(e8) == EnumC0193y0.f2987j) {
                                        p113v0.N nC3 = e8.c(S0.a.a(p081p0.c.x0(j4, (-(nC.f13137h + nC2.f13137h)) / 2, 0, 2), 0, 0, 0, 0, 11));
                                        int i7 = ((nC.f13137h + nC2.f13137h) / 2) + nC3.f13137h;
                                        int iMax = Math.max(nC3.i, Math.max(nC.i, nC2.i));
                                        float f6 = nC.f13137h;
                                        L.A0 a6 = (L.A0) this.f442b;
                                        C0209d0 c0209d0 = a6.f2151h;
                                        c0209d0.j(f6);
                                        float f7 = nC2.f13137h;
                                        C0209d0 c0209d1 = a6.i;
                                        c0209d1.j(f7);
                                        C0211e0 c0211e0 = a6.f2152j;
                                        c0211e0.j(i7);
                                        float f8 = 2;
                                        float fMax = Math.max(c0211e0.h() - (c0209d1.h() / f8), 0.0f);
                                        float fMin = Math.min(c0209d0.h() / f8, fMax);
                                        C0209d0 c0209d2 = a6.f2158p;
                                        float fH = c0209d2.h();
                                        C0209d0 c0209d3 = a6.f2157o;
                                        if (fH != fMin || c0209d3.h() != fMax) {
                                            c0209d2.j(fMin);
                                            c0209d3.j(fMax);
                                            a6.f2153k.j(a6.f(c0209d2.h(), c0209d3.h(), a6.f2147d.h()));
                                            a6.f2154l.j(a6.f(c0209d2.h(), c0209d3.h(), a6.f2148e.h()));
                                        }
                                        return h6.u(i7, iMax, p089q4.v.f11238h, new C0123a1(nC3, nC.f13137h / 2, (iMax - nC3.i) / 2, nC, G4.a.D(a6.b() * nC3.f13137h), (iMax - nC.i) / 2, nC2, G4.a.D((a6.a() * nC3.f13137h) + ((nC.f13137h - nC2.f13137h) / 2)), (iMax - nC2.i) / 2));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                int size4 = list.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    p113v0.E e9 = (p113v0.E) list.get(i8);
                    if (androidx.compose.ui.layout.a.a(e9) == L.P0.f2452h) {
                        p113v0.N nC4 = e9.c(j4);
                        int size5 = list.size();
                        for (int i9 = 0; i9 < size5; i9++) {
                            p113v0.E e10 = (p113v0.E) list.get(i9);
                            if (androidx.compose.ui.layout.a.a(e10) == L.P0.i) {
                                p113v0.N nC5 = e10.c(S0.a.a(p081p0.c.x0(j4, -nC4.f13137h, 0, 2), 0, 0, 0, 0, 11));
                                int i10 = nC4.f13137h + nC5.f13137h;
                                int iMax2 = Math.max(nC5.i, nC4.i);
                                float f9 = nC4.f13137h;
                                C0188w1 c0188w1 = (C0188w1) this.f442b;
                                c0188w1.i.j(f9);
                                c0188w1.f2959g.j(i10);
                                return h6.u(i10, iMax2, p089q4.v.f11238h, new C0135e1(nC5, nC4.f13137h / 2, (iMax2 - nC5.i) / 2, nC4, G4.a.D(c0188w1.b() * nC5.f13137h), (iMax2 - nC4.i) / 2));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
