package B;

import D.C0057g;
import F1.C0096m;
import G0.AbstractC0116l;
import G0.C0108d;
import N.InterfaceC0203a0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p124x0.AbstractC1098f;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f84h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f85j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f86k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f87l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f88m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(M0.w wVar, C0057g c0057g, M0.m mVar, C0026n c0026n, J j4) {
        super(1);
        this.f84h = 2;
        this.f86k = wVar;
        this.i = c0057g;
        this.f85j = mVar;
        this.f87l = c0026n;
        this.f88m = j4;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // D4.c
    public final Object invoke(Object obj) {
        G0.H hA;
        G0.H hA2;
        G0.H hA3;
        List listSubList;
        G0.C c6 = null;
        c6 = null;
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj2 = this.i;
        Object obj3 = this.f86k;
        Object obj4 = this.f85j;
        Object obj5 = this.f87l;
        Object obj6 = this.f88m;
        switch (this.f84h) {
            case 0:
                p124x0.F f6 = (p124x0.F) obj;
                f6.b();
                float fH = ((D.q) obj2).f700b.h();
                if (fH != 0.0f) {
                    int i = G0.I.f1469c;
                    int iB = ((M0.q) obj4).b((int) (((M0.w) obj3).f3454b >> 32));
                    a1 a1VarD = ((C0036s0) obj5).d();
                    p030f0.d dVarC = a1VarD != null ? a1VarD.f281a.c(iB) : new p030f0.d(0.0f, 0.0f, 0.0f, 0.0f);
                    float fY = f6.y(H0.f126a);
                    float f7 = fY / 2;
                    float f8 = dVarC.f8839a + f7;
                    float fD = p030f0.f.d(f6.f13862h.f()) - f7;
                    if (f8 > fD) {
                        f8 = fD;
                    }
                    if (f8 >= f7) {
                        f7 = f8;
                    }
                    p044i0.d.x(f6, (p035g0.O) obj6, p081p0.c.y(f7, dVarC.f8840b), p081p0.c.y(f7, dVarC.f8842d), fY, fH, 432);
                }
                return xVar;
            case 1:
                B0 b6 = (B0) obj;
                C0108d c0108d = (C0108d) obj4;
                Object obj7 = c0108d.f1490a;
                G0.H hA4 = ((AbstractC0116l) obj7).a();
                G0.C c7 = hA4 != null ? hA4.f1464a : null;
                G0.C c8 = (!((Boolean) ((InterfaceC0203a0) obj3).getValue()).booleanValue() || (hA3 = ((AbstractC0116l) obj7).a()) == null) ? null : hA3.f1465b;
                ((f1) obj2).getClass();
                if (c7 != null) {
                    c8 = c7.c(c8);
                }
                G0.C c9 = (!((Boolean) ((InterfaceC0203a0) obj5).getValue()).booleanValue() || (hA2 = ((AbstractC0116l) obj7).a()) == null) ? null : hA2.f1466c;
                if (c8 != null) {
                    c9 = c8.c(c9);
                }
                if (((Boolean) ((InterfaceC0203a0) obj6).getValue()).booleanValue() && (hA = ((AbstractC0116l) obj7).a()) != null) {
                    c6 = hA.f1467d;
                }
                if (c9 != null) {
                    c6 = c9.c(c6);
                }
                if (c6 != null) {
                    b6.f53a.a(c6, c0108d.f1491b, c0108d.f1492c);
                }
                return xVar;
            case 2:
                D.D d6 = (D.D) obj;
                D.z zVar = ((C0057g) obj2).f687a;
                d6.f652h = (M0.w) obj3;
                d6.i = (M0.m) obj4;
                d6.f647c = (C0026n) obj5;
                d6.f648d = (J) obj6;
                d6.f649e = zVar != null ? zVar.f712v : null;
                d6.f650f = zVar != null ? zVar.f713w : null;
                d6.f651g = zVar != null ? (p130y0.G0) AbstractC1098f.h(zVar, AbstractC1124c0.f14377q) : null;
                return xVar;
            case 3:
                C0096m c0096m = (C0096m) obj;
                E4.k.f("entry", c0096m);
                ((E4.s) obj2).f1070h = true;
                ArrayList arrayList = (ArrayList) obj4;
                int iIndexOf = arrayList.indexOf(c0096m);
                if (iIndexOf != -1) {
                    E4.u uVar = (E4.u) obj3;
                    int i3 = iIndexOf + 1;
                    listSubList = arrayList.subList(uVar.f1072h, i3);
                    uVar.f1072h = i3;
                } else {
                    listSubList = p089q4.u.f11237h;
                }
                ((F1.I) obj5).a(c0096m.i, (Bundle) obj6, c0096m, listSubList);
                return xVar;
            case 4:
                V0.y yVar = (V0.y) obj2;
                yVar.f5476u.addView(yVar, yVar.f5477v);
                yVar.i((D4.a) obj4, (V0.B) obj3, (String) obj5, (S0.k) obj6);
                return new A(4, yVar);
            default:
                J2.b bVar = new J2.b(9, (InterfaceC0203a0) obj6);
                g.a aVar = (g.a) obj5;
                p012c.l lVar = (p012c.l) obj4;
                lVar.getClass();
                String str = (String) obj3;
                E4.k.f("key", str);
                lVar.c(str);
                lVar.f7150e.put(str, new p029f.d(bVar, aVar));
                LinkedHashMap linkedHashMap = lVar.f7151f;
                if (linkedHashMap.containsKey(str)) {
                    Object obj8 = linkedHashMap.get(str);
                    linkedHashMap.remove(str);
                    bVar.a(obj8);
                }
                Bundle bundle = lVar.f7152g;
                p029f.a aVar2 = (p029f.a) S1.h0.q(str, bundle);
                if (aVar2 != null) {
                    bundle.remove(str);
                    bVar.a(aVar.F(aVar2.f8815h, aVar2.i));
                }
                p018d.a aVar3 = (p018d.a) obj2;
                aVar3.f8549a = new p029f.g(lVar, str, aVar, 1);
                return new A(5, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.f84h = i;
        this.i = obj;
        this.f85j = obj2;
        this.f86k = obj3;
        this.f87l = obj4;
        this.f88m = obj5;
    }
}
