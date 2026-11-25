package B;

import N.C0222k;
import N.C0230o;
import p130y0.AbstractC1124c0;

/* JADX INFO: renamed from: B.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0015h0 extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f325h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G0.J f326j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015h0(int i, int i3, G0.J j4) {
        super(3);
        this.f325h = i;
        this.i = i3;
        this.f326j = j4;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        C0230o c0230o = (C0230o) obj2;
        ((Number) obj3).intValue();
        c0230o.V(408240218);
        int i = this.f325h;
        int i3 = this.i;
        AbstractC0029o0.w(i, i3);
        Z.l lVar = Z.l.f5957a;
        if (i == 1 && i3 == Integer.MAX_VALUE) {
            c0230o.p(false);
            return lVar;
        }
        S0.b bVar = (S0.b) c0230o.k(AbstractC1124c0.f14367f);
        L0.d dVar = (L0.d) c0230o.k(AbstractC1124c0.i);
        S0.k kVar = (S0.k) c0230o.k(AbstractC1124c0.f14372l);
        G0.J j4 = this.f326j;
        boolean zF = c0230o.f(j4) | c0230o.f(kVar);
        Object objK = c0230o.K();
        N.U u6 = C0222k.f3714a;
        if (zF || objK == u6) {
            objK = p020d2.n.I(j4, kVar);
            c0230o.f0(objK);
        }
        G0.J j6 = (G0.J) objK;
        boolean zF2 = c0230o.f(dVar) | c0230o.f(j6);
        Object objK2 = c0230o.K();
        if (zF2 || objK2 == u6) {
            G0.C c6 = j6.f1472a;
            L0.p pVar = c6.f1433f;
            L0.k kVar2 = c6.f1430c;
            if (kVar2 == null) {
                kVar2 = L0.k.f3025j;
            }
            L0.i iVar = c6.f1431d;
            int i6 = iVar != null ? iVar.f3023a : 0;
            L0.j jVar = c6.f1432e;
            objK2 = ((L0.e) dVar).b(pVar, kVar2, i6, jVar != null ? jVar.f3024a : 1);
            c0230o.f0(objK2);
        }
        N.V0 v6 = (N.V0) objK2;
        boolean zF3 = c0230o.f(v6.getValue()) | c0230o.f(bVar) | c0230o.f(dVar) | c0230o.f(j4) | c0230o.f(kVar);
        Object objK3 = c0230o.K();
        if (zF3 || objK3 == u6) {
            objK3 = Integer.valueOf((int) (I0.a(j6, bVar, dVar, I0.f143a, 1) & 4294967295L));
            c0230o.f0(objK3);
        }
        int iIntValue = ((Number) objK3).intValue();
        boolean zF4 = c0230o.f(j4) | c0230o.f(bVar) | c0230o.f(dVar) | c0230o.f(kVar) | c0230o.f(v6.getValue());
        Object objK4 = c0230o.K();
        if (zF4 || objK4 == u6) {
            StringBuilder sb = new StringBuilder();
            String str = I0.f143a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objK4 = Integer.valueOf((int) (I0.a(j6, bVar, dVar, sb.toString(), 2) & 4294967295L));
            c0230o.f0(objK4);
        }
        int iIntValue2 = ((Number) objK4).intValue() - iIntValue;
        Integer numValueOf = i == 1 ? null : Integer.valueOf(((i - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i3 != Integer.MAX_VALUE ? Integer.valueOf(((i3 - 1) * iIntValue2) + iIntValue) : null;
        Z.o oVarD = androidx.compose.foundation.layout.c.d(lVar, numValueOf != null ? bVar.i0(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? bVar.i0(numValueOf2.intValue()) : Float.NaN);
        c0230o.p(false);
        return oVarD;
    }
}
