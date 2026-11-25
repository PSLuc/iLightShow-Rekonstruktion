package p104t2;

import java.util.Objects;
import p015c2.h;
import p015c2.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f12509t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g f12510u;

    public g(Class cls, m mVar, h hVar, h[] hVarArr, h hVar2, g gVar, Object obj, Object obj2, boolean z5) {
        super(cls, mVar, hVar, hVarArr, Objects.hashCode(hVar2), obj, obj2, z5);
        this.f12509t = hVar2;
        this.f12510u = gVar == null ? this : gVar;
    }

    @Override // p104t2.i
    /* JADX INFO: renamed from: C0 */
    public final i v0(Object obj) {
        if (obj == this.f7284n) {
            return this;
        }
        return new g(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12509t, this.f12510u, this.f7283m, obj, this.f7285o);
    }

    @Override // p020d2.n
    public final boolean D() {
        return true;
    }

    @Override // p104t2.i
    /* JADX INFO: renamed from: D0 */
    public final i w0(Object obj) {
        if (obj == this.f7283m) {
            return this;
        }
        return new g(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12509t, this.f12510u, obj, this.f7284n, this.f7285o);
    }

    @Override // p104t2.i, p015c2.h
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final g s0(j jVar) {
        h hVar = this.f12509t;
        if (jVar == hVar.f7283m) {
            return this;
        }
        return new g(this.f7281k, this.f12515r, this.f12513p, this.f12514q, hVar.w0(jVar), this.f12510u, this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p104t2.i, p015c2.h
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final g u0() {
        if (this.f7285o) {
            return this;
        }
        return new g(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12509t.u0(), this.f12510u, this.f7283m, this.f7284n, true);
    }

    @Override // p015c2.h
    public final h Y() {
        return this.f12509t;
    }

    @Override // p104t2.i, p015c2.h
    public final StringBuilder Z(StringBuilder sb) {
        j.x0(this.f7281k, sb, true);
        return sb;
    }

    @Override // p104t2.i, p015c2.h
    public final StringBuilder a0(StringBuilder sb) {
        j.x0(this.f7281k, sb, false);
        sb.append('<');
        StringBuilder sbA0 = this.f12509t.a0(sb);
        sbA0.append(">;");
        return sbA0;
    }

    @Override // p015c2.h
    /* JADX INFO: renamed from: c0 */
    public final h x() {
        return this.f12509t;
    }

    @Override // p104t2.i, p015c2.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != g.class) {
            return false;
        }
        g gVar = (g) obj;
        if (gVar.f7281k != this.f7281k) {
            return false;
        }
        return this.f12509t.equals(gVar.f12509t);
    }

    @Override // p104t2.i, p015c2.h
    public final h p0(Class cls, m mVar, h hVar, h[] hVarArr) {
        return new g(cls, this.f12515r, hVar, hVarArr, this.f12509t, this.f12510u, this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p104t2.i, p015c2.h
    public final h q0(h hVar) {
        if (this.f12509t == hVar) {
            return this;
        }
        return new g(this.f7281k, this.f12515r, this.f12513p, this.f12514q, hVar, this.f12510u, this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p104t2.i, p015c2.h
    public final h r0(Object obj) {
        h hVar = this.f12509t;
        if (obj == hVar.f7284n) {
            return this;
        }
        return new g(this.f7281k, this.f12515r, this.f12513p, this.f12514q, hVar.v0(obj), this.f12510u, this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p104t2.i, p015c2.h
    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[reference type, class ");
        sb.append(y0());
        sb.append('<');
        sb.append(this.f12509t);
        sb.append(">]");
        return sb.toString();
    }

    @Override // p104t2.i, p015c2.h
    public final h v0(Object obj) {
        if (obj == this.f7284n) {
            return this;
        }
        return new g(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12509t, this.f12510u, this.f7283m, obj, this.f7285o);
    }

    @Override // p104t2.i, p015c2.h
    public final h w0(Object obj) {
        if (obj == this.f7283m) {
            return this;
        }
        return new g(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12509t, this.f12510u, obj, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h, p020d2.n
    public final h x() {
        return this.f12509t;
    }

    @Override // p104t2.i, p104t2.j
    public final String y0() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f7281k;
        sb.append(cls.getName());
        h hVar = this.f12509t;
        if (hVar != null && cls.getTypeParameters().length == 1) {
            sb.append('<');
            sb.append(((j) hVar).y0());
            sb.append('>');
        }
        return sb.toString();
    }
}
