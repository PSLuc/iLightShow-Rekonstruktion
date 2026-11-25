package B;

import F1.AbstractC0087d;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0245w;
import N.InterfaceC0203a0;
import P4.AbstractC0336x;
import android.graphics.Typeface;
import android.text.Spannable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p096s.AbstractC0916i;
import p096s.C0907c;
import p096s.C0919l;
import p112v.C1002s;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f232h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f233j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(D4.a aVar, D4.c cVar) {
        super(3);
        this.f232h = 1;
        this.f233j = aVar;
        this.i = cVar;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [D4.c, E4.l] */
    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f232h) {
            case 0:
                C0230o c0230o = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o.V(-102778667);
                Object objK = c0230o.K();
                N.U u6 = C0222k.f3714a;
                if (objK == u6) {
                    C0245w c0245w = new C0245w(C0208d.y(c0230o));
                    c0230o.f0(c0245w);
                    objK = c0245w;
                }
                U4.d dVar = ((C0245w) objK).f3838h;
                Object objK2 = c0230o.K();
                if (objK2 == u6) {
                    objK2 = C0208d.K(null, N.U.f3673m);
                    c0230o.f0(objK2);
                }
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK2;
                InterfaceC0203a0 interfaceC0203a0N = C0208d.N((D4.c) this.i, c0230o);
                p117w.m mVar = (p117w.m) this.f233j;
                boolean zF = c0230o.f(mVar);
                Object objK3 = c0230o.K();
                if (zF || objK3 == u6) {
                    objK3 = new C0005c0(interfaceC0203a0, 3, mVar);
                    c0230o.f0(objK3);
                }
                C0208d.c(mVar, (D4.c) objK3, c0230o);
                Z.l lVar = Z.l.f5957a;
                boolean zH = c0230o.h(dVar) | c0230o.f(mVar) | c0230o.f(interfaceC0203a0N);
                Object objK4 = c0230o.K();
                if (zH || objK4 == u6) {
                    R0 r6 = new R0(dVar, interfaceC0203a0, (p117w.m) this.f233j, interfaceC0203a0N, null);
                    c0230o.f0(r6);
                    objK4 = r6;
                }
                Z.o oVarA = p091r0.u.a(lVar, mVar, (D4.e) objK4);
                c0230o.p(false);
                return oVarA;
            case 1:
                C0230o c0230o2 = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o2.V(759876635);
                Object objK5 = c0230o2.K();
                N.U u7 = C0222k.f3714a;
                if (objK5 == u7) {
                    objK5 = C0208d.C((D4.a) this.f233j);
                    c0230o2.f0(objK5);
                }
                N.V0 v6 = (N.V0) objK5;
                Object objK6 = c0230o2.K();
                if (objK6 == u7) {
                    objK6 = new C0907c(new p030f0.c(((p030f0.c) v6.getValue()).f8837a), F.H.f1097b, new p030f0.c(F.H.f1098c), 8);
                    c0230o2.f0(objK6);
                }
                C0907c c0907c = (C0907c) objK6;
                p084p4.x xVar = p084p4.x.f10867a;
                boolean zH2 = c0230o2.h(c0907c);
                Object objK7 = c0230o2.K();
                if (zH2 || objK7 == u7) {
                    objK7 = new F.G(v6, c0907c, null);
                    c0230o2.f0(objK7);
                }
                C0208d.e((D4.e) objK7, c0230o2, xVar);
                C0919l c0919l = c0907c.f11953c;
                boolean zF2 = c0230o2.f(c0919l);
                Object objK8 = c0230o2.K();
                if (zF2 || objK8 == u7) {
                    objK8 = new F.D(c0919l, 0);
                    c0230o2.f0(objK8);
                }
                Z.o oVar = (Z.o) ((D4.c) this.i).invoke((D4.a) objK8);
                c0230o2.p(false);
                return oVar;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                String str = (String) obj2;
                F1.S s6 = (F1.S) obj3;
                E4.k.f("argName", str);
                E4.k.f("navType", s6);
                Object obj4 = ((Map) this.i).get(str);
                E4.k.c(obj4);
                List list = (List) obj4;
                H1.d dVar2 = (H1.d) this.f233j;
                int iD = AbstractC0916i.d(((s6 instanceof AbstractC0087d) || ((Y4.a) dVar2.i).getDescriptor().l(iIntValue)) ? 2 : 1);
                if (iD != 0) {
                    if (iD == 1) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            dVar2.c(str, (String) it.next());
                        }
                    }
                } else {
                    if (list.size() != 1) {
                        StringBuilder sbW = p012c.k.w("Expected one value for argument ", str, ", found ");
                        sbW.append(list.size());
                        sbW.append("values instead.");
                        throw new IllegalArgumentException(sbW.toString().toString());
                    }
                    dVar2.f1758j = ((String) dVar2.f1758j) + '/' + ((String) p089q4.l.X(list));
                }
                return p084p4.x.f10867a;
            case 3:
                G0.C c6 = (G0.C) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                int iIntValue3 = ((Number) obj3).intValue();
                L0.p pVar = c6.f1433f;
                L0.k kVar = c6.f1430c;
                if (kVar == null) {
                    kVar = L0.k.f3025j;
                }
                L0.i iVar = c6.f1431d;
                int i = iVar != null ? iVar.f3023a : 0;
                L0.j jVar = c6.f1432e;
                int i3 = jVar != null ? jVar.f3024a : 1;
                O0.d dVar3 = ((O0.c) this.f233j).f4391h;
                L0.r rVarB = ((L0.e) dVar3.f4395l).b(pVar, kVar, i, i3);
                if (rVarB instanceof L0.r) {
                    Object obj5 = rVarB.f3038h;
                    E4.k.d("null cannot be cast to non-null type android.graphics.Typeface", obj5);
                    typeface = (Typeface) obj5;
                } else {
                    C0031p0 c0031p0 = new C0031p0(rVarB, dVar3.f4400q);
                    dVar3.f4400q = c0031p0;
                    Object obj6 = c0031p0.f395k;
                    E4.k.d("null cannot be cast to non-null type android.graphics.Typeface", obj6);
                    typeface = (Typeface) obj6;
                }
                ((Spannable) this.i).setSpan(new J0.b(1, typeface), iIntValue2, iIntValue3, 33);
                return p084p4.x.f10867a;
            case 4:
                C0230o c0230o3 = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o3.V(-353972293);
                p101t.Y yA = ((p101t.X) this.i).a((p117w.m) this.f233j, c0230o3);
                boolean zF3 = c0230o3.f(yA);
                Object objK9 = c0230o3.K();
                if (zF3 || objK9 == C0222k.f3714a) {
                    objK9 = new p101t.a0(yA);
                    c0230o3.f0(objK9);
                }
                p101t.a0 a0Var = (p101t.a0) objK9;
                c0230o3.p(false);
                return a0Var;
            case 5:
                C0230o c0230o4 = (C0230o) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    Object objK10 = c0230o4.K();
                    if (objK10 == C0222k.f3714a) {
                        objK10 = new p107u.g();
                        c0230o4.f0(objK10);
                    }
                    p107u.g gVar = (p107u.g) objK10;
                    gVar.f12623a.clear();
                    ((C0005c0) this.i).invoke(gVar);
                    gVar.a((p107u.a) this.f233j, c0230o4, 0);
                }
                return p084p4.x.f10867a;
            default:
                p091r0.q qVar = (p091r0.q) obj;
                p091r0.q qVar2 = (p091r0.q) obj2;
                long j4 = ((p030f0.c) obj3).f8837a;
                p112v.M m6 = (p112v.M) this.i;
                if (((Boolean) m6.f12864x.invoke(qVar)).booleanValue()) {
                    if (!m6.f12861C) {
                        if (m6.f12859A == null) {
                            m6.f12859A = R4.i.a(Integer.MAX_VALUE, 0, 6);
                        }
                        m6.f12861C = true;
                        AbstractC0336x.o(m6.n0(), null, new p112v.L(m6, null), 3);
                    }
                    com.fasterxml.jackson.databind.deser.std.d0.i((p097s0.c) this.f233j, qVar);
                    long jG = p030f0.c.g(qVar2.f11510c, j4);
                    R4.b bVar = m6.f12859A;
                    if (bVar != null) {
                        bVar.j(new C1002s(jG));
                    }
                }
                return p084p4.x.f10867a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S0(Object obj, int i, Object obj2) {
        super(3);
        this.f232h = i;
        this.i = obj;
        this.f233j = obj2;
    }
}
