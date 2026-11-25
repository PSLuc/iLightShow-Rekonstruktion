package B2;

import S1.V;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.HttpException;
import com.spotify.sdk.android.auth.LoginActivity;
import java.util.concurrent.Callable;
import p126x2.w;
import p126x2.x;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Callable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p084p4.m f516h;
    public final p084p4.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p084p4.m f517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f518k;

    public l(w wVar) {
        E4.k.f(LoginActivity.REQUEST_KEY, wVar);
        this.f518k = wVar;
        this.f516h = G4.a.z(new k(this, 2));
        this.i = G4.a.z(new k(this, 1));
        this.f517j = G4.a.z(new k(this, 0));
    }

    public final p084p4.h a(w wVar) throws FuelError {
        Object objV;
        try {
            objV = new p084p4.h(wVar, ((D2.b) ((p126x2.d) this.f517j.getValue())).d(wVar));
        } catch (Throwable th) {
            objV = V.v(th);
        }
        Throwable thA = p084p4.k.a(objV);
        if (thA == null) {
            V.O(objV);
            return (p084p4.h) objV;
        }
        int i = FuelError.i;
        throw p126x2.g.a(thA, new z(wVar.q()));
    }

    public final x b() {
        return (x) this.i.getValue();
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
    public final z c(p084p4.h hVar) throws FuelError {
        Object objV;
        w wVar = (w) hVar.f10849h;
        z zVar = (z) hVar.i;
        try {
            objV = (z) b().f14133o.d(wVar, zVar);
        } catch (Throwable th) {
            objV = V.v(th);
        }
        boolean z5 = objV instanceof p084p4.j;
        Object objV2 = objV;
        if (!z5) {
            try {
                z zVar2 = (z) objV;
                if (!((Boolean) b().f14126g.invoke(zVar2)).booleanValue()) {
                    int i = FuelError.i;
                    throw p126x2.g.a(new HttpException(zVar2.f14135b, zVar2.f14136c), zVar2);
                }
                objV2 = zVar2;
            } catch (Throwable th2) {
                objV2 = V.v(th2);
            }
        }
        Throwable thA = p084p4.k.a(objV2);
        if (thA == null) {
            V.O(objV2);
            return (z) objV2;
        }
        int i3 = FuelError.i;
        throw p126x2.g.a(thA, zVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objV;
        Object objV2;
        w wVar = this.f518k;
        try {
            objV = (w) b().f14132n.invoke(wVar);
        } catch (Throwable th) {
            objV = V.v(th);
        }
        if (!(objV instanceof p084p4.j)) {
            try {
                objV = a((w) objV);
            } catch (Throwable th2) {
                objV = V.v(th2);
            }
        }
        if (!(objV instanceof p084p4.j)) {
            try {
                p084p4.h hVar = (p084p4.h) objV;
                try {
                    objV2 = c(hVar);
                } catch (Throwable th3) {
                    objV2 = V.v(th3);
                }
                Throwable thA = p084p4.k.a(objV2);
                if (thA != null) {
                    p120w2.a.f13456b.getClass();
                    int i = FuelError.i;
                    throw p126x2.g.a(thA, (z) hVar.i);
                }
                V.O(objV2);
                objV = (z) objV2;
            } catch (Throwable th4) {
                objV = V.v(th4);
            }
        }
        Throwable thA2 = p084p4.k.a(objV);
        if (thA2 != null) {
            p120w2.a.f13456b.getClass();
            if ((thA2 instanceof FuelError) && ((FuelError) thA2).a()) {
                ((D4.c) this.f516h.getValue()).invoke(wVar);
            }
        }
        V.O(objV);
        return (z) objV;
    }
}
