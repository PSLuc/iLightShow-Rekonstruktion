package p032f2;

import B.AbstractC0013g0;
import T1.i;
import T1.k;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import p015c2.A;
import p015c2.C0474e;
import p015c2.f;
import p015c2.j;
import p015c2.z;
import p037g2.h;
import p037g2.q;
import p046i2.C;
import p046i2.t;
import p046i2.w;
import p071n2.d;
import p109u2.D;
import p109u2.E;
import p109u2.InterfaceC0963b;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f8932s = new h(Object.class);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final A f8933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p015c2.h f8934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f8935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f8936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f8937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f8938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C f8939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public E f8940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8941r;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(t tVar, p015c2.h hVar, d dVar, InterfaceC0963b interfaceC0963b) {
        A a6 = tVar.a();
        tVar.t();
        this(a6, hVar, null, dVar, interfaceC0963b, tVar.c());
    }

    public abstract Object A(Object obj, Object obj2);

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Class[] clsArr) {
        if (clsArr == 0) {
            this.f8940q = null;
            return;
        }
        E d6 = E.f12676h;
        int length = clsArr.length;
        if (length != 0) {
            d6 = length != 1 ? new D(clsArr) : new D(clsArr[0]);
        }
        this.f8940q = d6;
    }

    public abstract r C(A a6);

    public abstract r D(l lVar);

    public abstract r E(j jVar);

    @Override // p015c2.InterfaceC0472c
    public final A a() {
        return this.f8933j;
    }

    public final void g(i iVar, Exception exc, Object obj) throws JsonMappingException {
        if (!(exc instanceof IllegalArgumentException)) {
            p109u2.i.D(exc);
            p109u2.i.E(exc);
            Throwable thQ = p109u2.i.q(exc);
            throw new JsonMappingException(iVar, p109u2.i.i(thQ), thQ);
        }
        String strF = p109u2.i.f(obj);
        StringBuilder sb = new StringBuilder("Problem deserializing property '");
        sb.append(this.f8933j.f7195h);
        sb.append("' (expected type: ");
        sb.append(this.f8934k);
        sb.append("; actual type: ");
        sb.append(strF);
        sb.append(")");
        String strI = p109u2.i.i(exc);
        if (strI != null) {
            sb.append(", problem: ");
            sb.append(strI);
        } else {
            sb.append(" (no error message provided)");
        }
        throw new JsonMappingException(iVar, sb.toString(), exc);
    }

    @Override // p109u2.t
    public final String getName() {
        return this.f8933j.f7195h;
    }

    @Override // p015c2.InterfaceC0472c
    public final p015c2.h getType() {
        return this.f8934k;
    }

    public void h(int i) {
        if (this.f8941r == -1) {
            this.f8941r = i;
            return;
        }
        throw new IllegalStateException("Property '" + this.f8933j.f7195h + "' already had index (" + this.f8941r + "), trying to assign " + i);
    }

    public final Object i(i iVar, f fVar) {
        boolean zS0 = iVar.s0(k.VALUE_NULL);
        l lVar = this.f8937n;
        if (zS0) {
            return lVar.getNullValue(fVar);
        }
        j jVar = this.f8935l;
        d dVar = this.f8936m;
        if (dVar != null) {
            return jVar.deserializeWithType(iVar, fVar, dVar);
        }
        Object objDeserialize = jVar.deserialize(iVar, fVar);
        return objDeserialize == null ? lVar.getNullValue(fVar) : objDeserialize;
    }

    public abstract void j(i iVar, f fVar, Object obj);

    public abstract Object k(i iVar, f fVar, Object obj);

    public final Object l(i iVar, f fVar, Object obj) throws InvalidDefinitionException {
        boolean zS0 = iVar.s0(k.VALUE_NULL);
        l lVar = this.f8937n;
        if (zS0) {
            if (!q.a(lVar)) {
                return lVar.getNullValue(fVar);
            }
        } else {
            if (this.f8936m != null) {
                return fVar.f0(fVar.A().j(obj.getClass()), this).deserialize(iVar, fVar, obj);
            }
            Object objDeserialize = this.f8935l.deserialize(iVar, fVar, obj);
            if (objDeserialize != null) {
                return objDeserialize;
            }
            if (!q.a(lVar)) {
                return lVar.getNullValue(fVar);
            }
        }
        return obj;
    }

    public void m(C0474e c0474e) {
    }

    public int n() {
        throw new IllegalStateException(AbstractC0013g0.j("Internal error: no creator index for property '", this.f8933j.f7195h, "' (of type ", getClass().getName(), ")"));
    }

    public Object o() {
        return null;
    }

    public String p() {
        return this.f8938o;
    }

    public C q() {
        return this.f8939p;
    }

    public j r() {
        h hVar = f8932s;
        j jVar = this.f8935l;
        if (jVar == hVar) {
            return null;
        }
        return jVar;
    }

    public d s() {
        return this.f8936m;
    }

    public boolean t() {
        j jVar = this.f8935l;
        return (jVar == null || jVar == f8932s) ? false : true;
    }

    public String toString() {
        return p012c.k.u(new StringBuilder("[property '"), this.f8933j.f7195h, "']");
    }

    public boolean u() {
        return this.f8936m != null;
    }

    public boolean v() {
        return this.f8940q != null;
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return false;
    }

    public void y() {
    }

    public abstract void z(Object obj, Object obj2);

    public r(A a6, p015c2.h hVar, A a7, d dVar, InterfaceC0963b interfaceC0963b, z zVar) {
        String strA;
        super(zVar);
        this.f8941r = -1;
        if (a6 == null) {
            this.f8933j = A.f7194l;
        } else {
            String str = a6.f7195h;
            if (!str.isEmpty() && (strA = p009b2.h.i.a(str)) != str) {
                a6 = new A(strA, a6.i);
            }
            this.f8933j = a6;
        }
        this.f8934k = hVar;
        this.f8940q = null;
        this.f8936m = dVar != null ? dVar.f(this) : dVar;
        h hVar2 = f8932s;
        this.f8935l = hVar2;
        this.f8937n = hVar2;
    }

    public r(A a6, p015c2.h hVar, z zVar, j jVar) {
        String strA;
        super(zVar);
        this.f8941r = -1;
        String str = a6.f7195h;
        if (!str.isEmpty() && (strA = p009b2.h.i.a(str)) != str) {
            a6 = new A(strA, a6.i);
        }
        this.f8933j = a6;
        this.f8934k = hVar;
        this.f8940q = null;
        this.f8936m = null;
        this.f8935l = jVar;
        this.f8937n = jVar;
    }

    public r(r rVar) {
        super(rVar);
        this.f8941r = -1;
        this.f8933j = rVar.f8933j;
        this.f8934k = rVar.f8934k;
        this.f8935l = rVar.f8935l;
        this.f8936m = rVar.f8936m;
        this.f8938o = rVar.f8938o;
        this.f8941r = rVar.f8941r;
        this.f8940q = rVar.f8940q;
        this.f8937n = rVar.f8937n;
    }

    public r(r rVar, j jVar, l lVar) {
        super(rVar);
        this.f8941r = -1;
        this.f8933j = rVar.f8933j;
        this.f8934k = rVar.f8934k;
        this.f8936m = rVar.f8936m;
        this.f8938o = rVar.f8938o;
        this.f8941r = rVar.f8941r;
        h hVar = f8932s;
        if (jVar == null) {
            this.f8935l = hVar;
        } else {
            this.f8935l = jVar;
        }
        this.f8940q = rVar.f8940q;
        this.f8937n = lVar == hVar ? this.f8935l : lVar;
    }

    public r(r rVar, A a6) {
        super(rVar);
        this.f8941r = -1;
        this.f8933j = a6;
        this.f8934k = rVar.f8934k;
        this.f8935l = rVar.f8935l;
        this.f8936m = rVar.f8936m;
        this.f8938o = rVar.f8938o;
        this.f8941r = rVar.f8941r;
        this.f8940q = rVar.f8940q;
        this.f8937n = rVar.f8937n;
    }
}
