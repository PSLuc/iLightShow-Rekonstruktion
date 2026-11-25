package B;

import F1.AbstractC0087d;
import N.C0208d;
import N.C0217h0;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import p096s.AbstractC0916i;
import p096s.C0921n;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f274h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z0(int i, Object obj) {
        super(3);
        this.f274h = i;
        this.i = obj;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        URL url;
        URI uri;
        p089q4.v vVar = p089q4.v.f11238h;
        p084p4.x xVar = p084p4.x.f10867a;
        N.U u6 = C0222k.f3714a;
        int i = 1;
        int i3 = 0;
        Object obj4 = this.i;
        switch (this.f274h) {
            case 0:
                long j4 = ((S0.a) obj3).f4883a;
                long j6 = ((X0) obj4).f265f;
                p113v0.N nC = ((p113v0.E) obj2).c(S0.a.a(j4, p081p0.c.O((int) (j6 >> 32), S0.a.j(j4), S0.a.h(j4)), 0, p081p0.c.O((int) (j6 & 4294967295L), S0.a.i(j4), S0.a.g(j4)), 0, 10));
                return ((p113v0.H) obj).u(nC.f13137h, nC.i, vVar, new Y0(nC, i3));
            case 1:
                C0230o c0230o = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o.V(1582736677);
                S0.b bVar = (S0.b) c0230o.k(AbstractC1124c0.f14367f);
                L0.d dVar = (L0.d) c0230o.k(AbstractC1124c0.i);
                S0.k kVar = (S0.k) c0230o.k(AbstractC1124c0.f14372l);
                G0.J j7 = (G0.J) obj4;
                boolean zF = c0230o.f(j7) | c0230o.f(kVar);
                Object objK = c0230o.K();
                Object obj5 = objK;
                if (zF || objK == u6) {
                    G0.J jI = p020d2.n.I(j7, kVar);
                    c0230o.f0(jI);
                    obj5 = jI;
                }
                G0.J j8 = (G0.J) obj5;
                boolean zF2 = c0230o.f(dVar) | c0230o.f(j8);
                Object objK2 = c0230o.K();
                Object obj6 = objK2;
                if (zF2 || objK2 == u6) {
                    G0.C c6 = j8.f1472a;
                    L0.p pVar = c6.f1433f;
                    L0.k kVar2 = c6.f1430c;
                    if (kVar2 == null) {
                        kVar2 = L0.k.f3025j;
                    }
                    L0.i iVar = c6.f1431d;
                    int i6 = iVar != null ? iVar.f3023a : 0;
                    L0.j jVar = c6.f1432e;
                    L0.r rVarB = ((L0.e) dVar).b(pVar, kVar2, i6, jVar != null ? jVar.f3024a : 1);
                    c0230o.f0(rVarB);
                    obj6 = rVarB;
                }
                N.V0 v6 = (N.V0) obj6;
                Object objK3 = c0230o.K();
                Object obj7 = objK3;
                if (objK3 == u6) {
                    Object value = v6.getValue();
                    X0 x6 = new X0();
                    x6.f260a = kVar;
                    x6.f261b = bVar;
                    x6.f262c = dVar;
                    x6.f263d = j7;
                    x6.f264e = value;
                    x6.f265f = I0.a(j7, bVar, dVar, I0.f143a, 1);
                    c0230o.f0(x6);
                    obj7 = x6;
                }
                X0 x7 = (X0) obj7;
                Object value2 = v6.getValue();
                if (kVar != x7.f260a || !E4.k.a(bVar, x7.f261b) || !E4.k.a(dVar, x7.f262c) || !E4.k.a(j8, x7.f263d) || !E4.k.a(value2, x7.f264e)) {
                    x7.f260a = kVar;
                    x7.f261b = bVar;
                    x7.f262c = dVar;
                    x7.f263d = j8;
                    x7.f264e = value2;
                    x7.f265f = I0.a(j8, bVar, dVar, I0.f143a, 1);
                }
                boolean zH = c0230o.h(x7);
                Object objK4 = c0230o.K();
                Object obj8 = objK4;
                if (zH || objK4 == u6) {
                    Z0 z5 = new Z0(i3, x7);
                    c0230o.f0(z5);
                    obj8 = z5;
                }
                Z.o oVarB = androidx.compose.ui.layout.a.b((D4.f) obj8);
                c0230o.p(false);
                return oVarB;
            case 2:
                Z.o oVar = (Z.o) obj;
                C0230o c0230o2 = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o2.V(1980580247);
                S0.b bVar2 = (S0.b) c0230o2.k(AbstractC1124c0.f14367f);
                Object objK5 = c0230o2.K();
                Object obj9 = objK5;
                if (objK5 == u6) {
                    C0217h0 c0217h0K = C0208d.K(new S0.j(0L), N.U.f3673m);
                    c0230o2.f0(c0217h0K);
                    obj9 = c0217h0K;
                }
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) obj9;
                F.P p6 = (F.P) obj4;
                boolean zH2 = c0230o2.h(p6);
                Object objK6 = c0230o2.K();
                Object obj10 = objK6;
                if (zH2 || objK6 == u6) {
                    C0024m c0024m = new C0024m(p6, 4, interfaceC0203a0);
                    c0230o2.f0(c0024m);
                    obj10 = c0024m;
                }
                D4.a aVar = (D4.a) obj10;
                boolean zF3 = c0230o2.f(bVar2);
                Object objK7 = c0230o2.K();
                Object obj11 = objK7;
                if (zF3 || objK7 == u6) {
                    F.W w6 = new F.W(bVar2, interfaceC0203a0, i);
                    c0230o2.f0(w6);
                    obj11 = w6;
                }
                C0921n c0921n = F.H.f1096a;
                Z.o oVarA = Z.a.a(oVar, new S0(aVar, (D4.c) obj11));
                c0230o2.p(false);
                return oVarA;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                String str = (String) obj2;
                F1.S s6 = (F1.S) obj3;
                E4.k.f("argName", str);
                E4.k.f("navType", s6);
                H1.d dVar2 = (H1.d) obj4;
                int iD = AbstractC0916i.d(((s6 instanceof AbstractC0087d) || ((Y4.a) dVar2.i).getDescriptor().l(iIntValue)) ? 2 : 1);
                if (iD == 0) {
                    dVar2.f1758j = ((String) dVar2.f1758j) + '/' + ("{" + str + '}');
                } else if (iD == 1) {
                    dVar2.c(str, "{" + str + '}');
                }
                return xVar;
            case 4:
                p113v0.N nC2 = ((p113v0.E) obj2).c(((S0.a) obj3).f4883a);
                return ((p113v0.H) obj).u(nC2.f13137h, nC2.i, vVar, new C0005c0(nC2, 29, (p090r.w) obj4));
            case 5:
                C0230o c0230o3 = ((N.C0) obj).f3562a;
                C0230o c0230o4 = (C0230o) obj2;
                ((Number) obj3).intValue();
                int i7 = c0230o4.f3744P;
                Z.o oVarC = Z.a.c(c0230o4, (Z.o) obj4);
                c0230o3.W(509942095);
                InterfaceC1102j.f14043g.getClass();
                C0208d.R(C1101i.f14039c, c0230o3, oVarC);
                C1100h c1100h = C1101i.f14042f;
                if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i7))) {
                    p012c.k.y(i7, c0230o3, i7, c1100h);
                }
                c0230o3.p(false);
                return xVar;
            case 6:
                C0230o c0230o5 = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o5.V(-1415685722);
                p123x.K k3 = (p123x.K) obj4;
                boolean zF4 = c0230o5.f(k3);
                Object objK8 = c0230o5.K();
                Object obj12 = objK8;
                if (zF4 || objK8 == u6) {
                    p123x.G g6 = new p123x.G(k3);
                    c0230o5.f0(g6);
                    obj12 = g6;
                }
                p123x.G g7 = (p123x.G) obj12;
                c0230o5.p(false);
                return g7;
            default:
                p126x2.u uVar = (p126x2.u) obj;
                String strConcat = (String) obj2;
                List list = (List) obj3;
                E4.k.f("method", uVar);
                E4.k.f("path", strConcat);
                A0.b bVar3 = (A0.b) obj4;
                bVar3.getClass();
                try {
                    url = new URL(strConcat);
                    break;
                } catch (MalformedURLException unused) {
                    String strSubstring = "";
                    if ("".length() > 0 && S1.V.x("".charAt(M4.l.d0("")), '/', false)) {
                        strSubstring = "".substring(0, "".length() - 1);
                        E4.k.e("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(strSubstring);
                    if (((M4.l.v0(strConcat, '/') ? 1 : 0) | (strConcat.length() != 0 ? 0 : 1)) == 0) {
                        strConcat = "/".concat(strConcat);
                    }
                    sb.append(strConcat);
                    url = new URL(sb.toString());
                }
                try {
                    uri = url.toURI();
                    break;
                } catch (URISyntaxException unused2) {
                    URL url2 = url;
                    uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                }
                URL url3 = new URL(uri.toASCIIString());
                if (list == null) {
                    list = p089q4.u.f11237h;
                }
                Map map = p126x2.t.i;
                return new B2.h(uVar, url3, AbstractC0599v0.w((p126x2.t) bVar3.f10c), list);
        }
    }
}
