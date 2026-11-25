package p113v0;

import D4.c;
import D4.e;
import S0.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p027e3.a;
import p089q4.l;
import p124x0.D;

/* JADX INFO: renamed from: v0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1039w implements Y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f13193h = k.i;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f13194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B f13195k;

    public C1039w(B b6) {
        this.f13195k = b6;
    }

    @Override // p113v0.H
    public final G F(int i, int i3, Map map, c cVar) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new C1038v(i, i3, map, this, this.f13195k, cVar);
        }
        a.y0("Size(" + i + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // S0.b
    public final float a() {
        return this.i;
    }

    @Override // p113v0.InterfaceC1030m
    public final k getLayoutDirection() {
        return this.f13193h;
    }

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
    @Override // p113v0.Y
    public final List m(Object obj, e eVar) {
        D d6;
        B b6 = this.f13195k;
        b6.e();
        D d7 = b6.f13115h;
        int i = d7.f13829D.f13909c;
        if (!(i == 1 || i == 3 || i == 2 || i == 4)) {
            a.y0("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        HashMap map = b6.f13119m;
        Object obj2 = map.get(obj);
        Object obj3 = obj2;
        if (obj2 == null) {
            D d8 = (D) b6.f13122p.remove(obj);
            if (d8 != null) {
                int i3 = b6.f13127u;
                if (i3 <= 0) {
                    a.y0("Check failed.");
                    throw null;
                }
                b6.f13127u = i3 - 1;
                d6 = d8;
            } else {
                D dI = b6.i(obj);
                if (dI == null) {
                    int i6 = b6.f13116j;
                    D d9 = new D(2);
                    d7.f13844r = true;
                    d7.w(i6, d9);
                    d7.f13844r = false;
                    d6 = d9;
                } else {
                    d6 = dI;
                }
            }
            map.put(obj, d6);
            obj3 = d6;
        }
        D d10 = (D) obj3;
        if (l.a0(b6.f13116j, d7.o()) != d10) {
            int iL = ((P.a) d7.o()).f4578h.l(d10);
            int i7 = b6.f13116j;
            if (iL < i7) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i7 != iL) {
                d7.f13844r = true;
                d7.G(iL, i7, 1);
                d7.f13844r = false;
            }
        }
        b6.f13116j++;
        b6.g(d10, obj, eVar);
        return (i == 1 || i == 3) ? d10.l() : d10.k();
    }

    @Override // S0.b
    public final float n() {
        return this.f13194j;
    }

    @Override // p113v0.InterfaceC1030m
    public final boolean s() {
        int i = this.f13195k.f13115h.f13829D.f13909c;
        return i == 4 || i == 2;
    }
}
