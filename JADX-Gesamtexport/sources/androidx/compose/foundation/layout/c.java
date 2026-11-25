package androidx.compose.foundation.layout;

import B.C0003b0;
import E4.k;
import Z.f;
import Z.g;
import Z.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FillElement f6634a = new FillElement(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FillElement f6635b = new FillElement(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WrapContentElement f6636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f6637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f6638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f6639f;

    static {
        f fVar = Z.b.f5942r;
        f6636c = new WrapContentElement(1, new C0003b0(21, fVar), fVar);
        f fVar2 = Z.b.f5941q;
        f6637d = new WrapContentElement(1, new C0003b0(21, fVar2), fVar2);
        g gVar = Z.b.f5936l;
        f6638e = new WrapContentElement(3, new C0003b0(22, gVar), gVar);
        g gVar2 = Z.b.f5933h;
        f6639f = new WrapContentElement(3, new C0003b0(22, gVar2), gVar2);
    }

    public static final o a(o oVar, float f6, float f7) {
        return oVar.k(new UnspecifiedConstraintsElement(f6, f7));
    }

    public static o b(o oVar) {
        return oVar.k(f6634a);
    }

    public static final o c(o oVar, float f6) {
        return oVar.k(new SizeElement(0.0f, f6, 0.0f, f6, 5));
    }

    public static final o d(o oVar, float f6, float f7) {
        return oVar.k(new SizeElement(0.0f, f6, 0.0f, f7, 5));
    }

    public static final o e(o oVar, float f6) {
        return oVar.k(new SizeElement(f6, f6, f6, f6, false));
    }

    public static final o f(o oVar, float f6, float f7) {
        return oVar.k(new SizeElement(f6, f7, f6, f7, false));
    }

    public static o g(o oVar, float f6, float f7, float f8, float f9, int i) {
        return oVar.k(new SizeElement(f6, (i & 2) != 0 ? Float.NaN : f7, (i & 4) != 0 ? Float.NaN : f8, (i & 8) != 0 ? Float.NaN : f9, false));
    }

    public static final o h(o oVar, float f6) {
        return oVar.k(new SizeElement(f6, f6, f6, f6, true));
    }

    public static final o i(o oVar, float f6, float f7) {
        return oVar.k(new SizeElement(f6, f7, f6, f7, true));
    }

    public static final o j(o oVar, float f6, float f7, float f8, float f9) {
        return oVar.k(new SizeElement(f6, f7, f8, f9, true));
    }

    public static final o k(o oVar, float f6) {
        return oVar.k(new SizeElement(f6, 0.0f, f6, 0.0f, 10));
    }

    public static o l(o oVar) {
        WrapContentElement wrapContentElement;
        f fVar = Z.b.f5942r;
        if (k.a(fVar, fVar)) {
            wrapContentElement = f6636c;
        } else {
            wrapContentElement = k.a(fVar, Z.b.f5941q) ? f6637d : new WrapContentElement(1, new C0003b0(21, fVar), fVar);
        }
        return oVar.k(wrapContentElement);
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
    public static o m(o oVar) {
        WrapContentElement wrapContentElement;
        g gVar = Z.b.f5936l;
        if (gVar.equals(gVar)) {
            wrapContentElement = f6638e;
        } else {
            wrapContentElement = gVar.equals(Z.b.f5933h) ? f6639f : new WrapContentElement(3, new C0003b0(22, gVar), gVar);
        }
        return oVar.k(wrapContentElement);
    }
}
