package B;

import F.C0074p;
import G0.AbstractC0116l;
import G0.C0108d;
import G0.C0114j;
import G0.C0115k;
import com.github.kittinunf.fuel.core.FuelError;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import p035g0.InterfaceC0714o;
import p101t.C0948p;
import p112v.C0981h;
import p112v.C0987k;
import p112v.InterfaceC0973d;
import p124x0.C1110s;
import p130y0.AbstractC1119a;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f295h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f297k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f295h = i;
        this.i = obj;
        this.f296j = obj2;
        this.f297k = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0205  */
    /* JADX WARN: Code duplicated, block: B:94:0x0214  */
    /* JADX WARN: Code duplicated, block: B:96:0x0217  */
    /* JADX WARN: Type inference failed for: r12v27, types: [D4.f, E4.l] */
    /* JADX WARN: Type inference failed for: r12v29, types: [D4.f, E4.l] */
    /* JADX WARN: Type inference failed for: r12v31, types: [D4.f, E4.l] */
    /* JADX WARN: Type inference failed for: r3v14, types: [D4.a, E4.l] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // D4.a
    public final Object invoke() {
        p030f0.d dVarZ0;
        int i = 0;
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj = this.f297k;
        Object obj2 = this.f296j;
        Object obj3 = this.i;
        switch (this.f295h) {
            case 0:
                AbstractC0116l abstractC0116l = (AbstractC0116l) ((C0108d) obj2).f1490a;
                p130y0.T t6 = (p130y0.T) obj;
                ((f1) obj3).getClass();
                if (abstractC0116l instanceof C0115k) {
                    abstractC0116l.getClass();
                    try {
                        t6.a(((C0115k) abstractC0116l).f1507a);
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                } else if (abstractC0116l instanceof C0114j) {
                    abstractC0116l.getClass();
                }
                return xVar;
            case 1:
                p124x0.F f6 = (p124x0.F) obj;
                ((E4.w) obj3).f1074h = ((C0948p) obj2).f12394x.a(f6.f13862h.f(), f6.getLayoutDirection(), f6);
                return xVar;
            case 2:
                C0987k c0987k = (C0987k) obj3;
                p091r0.h hVar = c0987k.f13010x;
                while (hVar.f11493a.n()) {
                    P.d dVar = hVar.f11493a;
                    if (dVar.m()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    p030f0.d dVar2 = (p030f0.d) ((C0981h) dVar.f4582h[dVar.f4583j - 1]).f12978a.invoke();
                    if (!(dVar2 == null ? true : c0987k.A0(dVar2, c0987k.f13005B))) {
                        if (c0987k.f13004A) {
                            dVarZ0 = c0987k.z0();
                            if (dVarZ0 == null && c0987k.A0(dVarZ0, c0987k.f13005B)) {
                                c0987k.f13004A = false;
                            }
                        }
                        ((p112v.b1) obj2).f12961e = C0987k.y0(c0987k, (InterfaceC0973d) obj);
                        return xVar;
                    }
                    ((C0981h) dVar.p(dVar.f4583j - 1)).f12979b.g(xVar);
                }
                if (c0987k.f13004A) {
                    dVarZ0 = c0987k.z0();
                    if (dVarZ0 == null && c0987k.A0(dVarZ0, c0987k.f13005B)) {
                        c0987k.f13004A = false;
                    }
                }
                ((p112v.b1) obj2).f12961e = C0987k.y0(c0987k, (InterfaceC0973d) obj);
                return xVar;
            case 3:
                p124x0.H h6 = (p124x0.H) obj3;
                p124x0.J j4 = h6.f13869E;
                j4.f13915j = 0;
                P.d dVarU = j4.f13907a.u();
                int i3 = dVarU.f4583j;
                if (i3 > 0) {
                    Object[] objArr = dVarU.f4582h;
                    int i6 = 0;
                    do {
                        p124x0.H h7 = ((p124x0.D) objArr[i6]).f13829D.f13924s;
                        E4.k.c(h7);
                        h7.f13871n = h7.f13872o;
                        h7.f13872o = Integer.MAX_VALUE;
                        if (h7.f13873p == 2) {
                            h7.f13873p = 3;
                        }
                        i6++;
                    } while (i6 < i3);
                }
                p124x0.J j6 = h6.f13869E;
                P.d dVarU2 = j6.f13907a.u();
                int i7 = dVarU2.f4583j;
                if (i7 > 0) {
                    Object[] objArr2 = dVarU2.f4582h;
                    int i8 = 0;
                    do {
                        p124x0.H h8 = ((p124x0.D) objArr2[i8]).f13829D.f13924s;
                        E4.k.c(h8);
                        h8.f13881x.f13856d = false;
                        i8++;
                    } while (i8 < i7);
                }
                C1110s c1110s = h6.l().f14061R;
                p124x0.J j7 = (p124x0.J) obj;
                if (c1110s != null) {
                    boolean z5 = c1110s.f13935o;
                    P.a aVar = (P.a) j7.f13907a.m();
                    int i9 = aVar.f4578h.f4583j;
                    for (int i10 = 0; i10 < i9; i10++) {
                        p124x0.N nK0 = ((p124x0.Y) ((p124x0.D) aVar.get(i10)).f13828C.f3794d).K0();
                        if (nK0 != null) {
                            nK0.f13935o = z5;
                        }
                    }
                }
                ((C1110s) obj2).v0().c();
                if (h6.l().f14061R != null) {
                    P.a aVar2 = (P.a) j7.f13907a.m();
                    int i11 = aVar2.f4578h.f4583j;
                    for (int i12 = 0; i12 < i11; i12++) {
                        p124x0.N nK1 = ((p124x0.Y) ((p124x0.D) aVar2.get(i12)).f13828C.f3794d).K0();
                        if (nK1 != null) {
                            nK1.f13935o = false;
                        }
                    }
                }
                p124x0.D d6 = j6.f13907a;
                P.d dVarU3 = d6.u();
                int i13 = dVarU3.f4583j;
                if (i13 > 0) {
                    Object[] objArr3 = dVarU3.f4582h;
                    int i14 = 0;
                    do {
                        p124x0.H h9 = ((p124x0.D) objArr3[i14]).f13829D.f13924s;
                        E4.k.c(h9);
                        int i15 = h9.f13871n;
                        int i16 = h9.f13872o;
                        if (i15 != i16 && i16 == Integer.MAX_VALUE) {
                            h9.q0();
                        }
                        i14++;
                    } while (i14 < i13);
                }
                P.d dVarU4 = d6.u();
                int i17 = dVarU4.f4583j;
                if (i17 > 0) {
                    Object[] objArr4 = dVarU4.f4582h;
                    do {
                        p124x0.H h10 = ((p124x0.D) objArr4[i]).f13829D.f13924s;
                        E4.k.c(h10);
                        p124x0.E e6 = h10.f13881x;
                        e6.f13857e = e6.f13856d;
                        i++;
                    } while (i < i17);
                }
                return xVar;
            case 4:
                p035g0.J j8 = p124x0.Y.f13977L;
                ((p124x0.Y) obj3).G0((InterfaceC0714o) obj2, (p048j0.b) obj);
                return xVar;
            case 5:
                F2.c cVar = (F2.c) obj2;
                boolean z6 = cVar instanceof F2.b;
                D d7 = (D) obj3;
                p126x2.z zVar = (p126x2.z) obj;
                p126x2.w wVar = (p126x2.w) d7.i;
                if (z6) {
                    ((E4.l) d7.f66k).c(wVar, zVar, ((F2.b) cVar).f1404a);
                } else {
                    if (!(cVar instanceof F2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ?? r12 = (E4.l) d7.f67l;
                    int i18 = FuelError.i;
                    FuelError fuelErrorA = p126x2.g.a(((F2.a) cVar).f1403a, zVar);
                    p120w2.a.f13456b.getClass();
                    r12.c(wVar, zVar, fuelErrorA);
                }
                return xVar;
            case 6:
                A2.d dVar3 = (A2.d) obj3;
                ?? r13 = (E4.l) dVar3.f21j;
                p120w2.a.f13456b.getClass();
                r13.c((p126x2.w) dVar3.i, (p126x2.z) obj2, (FuelError) obj);
                return xVar;
            case 7:
                p129y.i iVar = (p129y.i) obj3;
                p030f0.d dVarY0 = p129y.i.y0(iVar, (p124x0.Y) obj2, (E4.l) obj);
                if (dVarY0 == null) {
                    return null;
                }
                C0987k c0987k2 = iVar.f14172u;
                if (S0.j.a(c0987k2.f13005B, 0L)) {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return dVarY0.h(c0987k2.C0(dVarY0, c0987k2.f13005B) ^ (-9223372034707292160L));
            default:
                AbstractC1119a abstractC1119a = (AbstractC1119a) obj3;
                abstractC1119a.removeOnAttachStateChangeListener((p052k.d) obj2);
                C0074p c0074p = (C0074p) obj;
                E4.k.f("listener", c0074p);
                p027e3.a.g0(abstractC1119a).f10835a.remove(c0074p);
                return xVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(p129y.i iVar, p124x0.Y y2, D4.a aVar) {
        super(0);
        this.f295h = 7;
        this.i = iVar;
        this.f296j = y2;
        this.f297k = (E4.l) aVar;
    }
}
