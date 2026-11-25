package p113v0;

import D4.c;
import D4.e;
import P.a;
import P.d;
import S0.k;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p089q4.u;
import p124x0.D;
import p124x0.I;

/* JADX INFO: renamed from: v0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1037u implements Y, H {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1039w f13186h;
    public final /* synthetic */ B i;

    public C1037u(B b6) {
        this.i = b6;
        this.f13186h = b6.f13120n;
    }

    @Override // S0.b
    public final float C(long j4) {
        return this.f13186h.C(j4);
    }

    @Override // p113v0.H
    public final G F(int i, int i3, Map map, c cVar) {
        return this.f13186h.F(i, i3, map, cVar);
    }

    @Override // S0.b
    public final int H(float f6) {
        return this.f13186h.H(f6);
    }

    @Override // S0.b
    public final long S(long j4) {
        return this.f13186h.S(j4);
    }

    @Override // S0.b
    public final float V(long j4) {
        return this.f13186h.V(j4);
    }

    @Override // S0.b
    public final float a() {
        return this.f13186h.i;
    }

    @Override // S0.b
    public final long b0(float f6) {
        return this.f13186h.b0(f6);
    }

    @Override // p113v0.InterfaceC1030m
    public final k getLayoutDirection() {
        return this.f13186h.f13193h;
    }

    @Override // S0.b
    public final float i0(int i) {
        return this.f13186h.i0(i);
    }

    @Override // S0.b
    public final float j0(float f6) {
        return f6 / this.f13186h.a();
    }

    @Override // p113v0.Y
    public final List m(Object obj, e eVar) {
        V a6;
        B b6 = this.i;
        D d6 = (D) b6.f13119m.get(obj);
        List listL = d6 != null ? d6.l() : null;
        if (listL != null) {
            return listL;
        }
        d dVar = b6.f13125s;
        int i = dVar.f4583j;
        int i3 = b6.f13117k;
        if (i < i3) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        if (i == i3) {
            dVar.c(obj);
        } else {
            Object[] objArr = dVar.f4582h;
            Object obj2 = objArr[i3];
            objArr[i3] = obj;
        }
        b6.f13117k++;
        HashMap map = b6.f13122p;
        if (!map.containsKey(obj)) {
            D d7 = b6.f13115h;
            boolean zD = d7.D();
            LinkedHashMap linkedHashMap = b6.f13124r;
            if (zD) {
                b6.e();
                if (!b6.f13119m.containsKey(obj)) {
                    linkedHashMap.remove(obj);
                    Object objI = map.get(obj);
                    if (objI == null) {
                        objI = b6.i(obj);
                        if (objI != null) {
                            int iL = ((a) d7.o()).f4578h.l(objI);
                            int i6 = ((a) d7.o()).f4578h.f4583j;
                            d7.f13844r = true;
                            d7.G(iL, i6, 1);
                            d7.f13844r = false;
                            b6.f13127u++;
                        } else {
                            int i7 = ((a) d7.o()).f4578h.f4583j;
                            D d8 = new D(2);
                            d7.f13844r = true;
                            d7.w(i7, d8);
                            d7.f13844r = false;
                            b6.f13127u++;
                            objI = d8;
                        }
                        map.put(obj, objI);
                    }
                    b6.g((D) objI, obj, eVar);
                }
                a6 = new A(b6, obj);
            } else {
                a6 = new C1042z();
            }
            linkedHashMap.put(obj, a6);
            if (d7.f13829D.f13909c == 3) {
                d7.N(true);
            } else {
                D.O(d7, true, 6);
            }
        }
        D d9 = (D) map.get(obj);
        if (d9 == null) {
            return u.f11237h;
        }
        List listP0 = d9.f13829D.f13923r.p0();
        a aVar = (a) listP0;
        int i8 = aVar.f4578h.f4583j;
        for (int i9 = 0; i9 < i8; i9++) {
            ((I) aVar.get(i9)).f13892M.f13908b = true;
        }
        return listP0;
    }

    @Override // S0.b
    public final float n() {
        return this.f13186h.f13194j;
    }

    @Override // p113v0.InterfaceC1030m
    public final boolean s() {
        return this.f13186h.s();
    }

    @Override // p113v0.H
    public final G u(int i, int i3, Map map, c cVar) {
        return this.f13186h.F(i, i3, map, cVar);
    }

    @Override // S0.b
    public final long v(float f6) {
        return this.f13186h.v(f6);
    }

    @Override // S0.b
    public final long w(long j4) {
        return this.f13186h.w(j4);
    }

    @Override // S0.b
    public final float y(float f6) {
        return this.f13186h.a() * f6;
    }
}
