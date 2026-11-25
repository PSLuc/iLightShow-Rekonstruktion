package p5;

import java.security.Principal;
import java.util.Arrays;
import javax.security.auth.Destroyable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Destroyable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11154h;
    public final t5.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q5.i f11155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final EnumC0852q f11156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t5.e f11157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Principal f11158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f11159n;

    public v0(q5.i iVar, EnumC0852q enumC0852q, t5.b bVar, t5.e eVar, Principal principal, long j4) {
        if (iVar == null) {
            throw new NullPointerException("Cipher suite must not be null");
        }
        if (enumC0852q == null) {
            throw new NullPointerException("Compression method must not be null");
        }
        if (bVar == null) {
            throw new NullPointerException("Master secret must not be null");
        }
        t5.b bVarA = t5.c.a(bVar);
        this.i = bVarA;
        this.f11155j = iVar;
        this.f11156k = enumC0852q;
        this.f11157l = eVar;
        this.f11158m = principal;
        this.f11159n = j4;
        bVarA.getClass();
        this.f11154h = 0;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        t5.c.b(this.i);
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f11154h == v0Var.f11154h) {
                byte[] encoded = this.i.getEncoded();
                byte[] encoded2 = v0Var.i.getEncoded();
                if (!Arrays.equals(encoded, encoded2)) {
                    Arrays.fill(encoded, (byte) 0);
                    Arrays.fill(encoded2, (byte) 0);
                    return false;
                }
                Arrays.fill(encoded, (byte) 0);
                Arrays.fill(encoded2, (byte) 0);
                c0 c0Var = c0.f11035j;
                if (c0Var.equals(c0Var) && this.f11155j.equals(v0Var.f11155j) && this.f11156k.equals(v0Var.f11156k) && this.f11158m.equals(v0Var.f11158m) && this.f11159n == v0Var.f11159n) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11154h;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        Logger logger = t5.c.f12598a;
        t5.b bVar = this.i;
        if (bVar != null) {
            return bVar.isDestroyed();
        }
        return true;
    }
}
