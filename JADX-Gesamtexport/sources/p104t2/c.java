package p104t2;

import p015c2.h;
import p015c2.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f12491t;

    public c(Class cls, m mVar, h hVar, h[] hVarArr, h hVar2, Object obj, Object obj2, boolean z5) {
        super(cls, mVar, hVar, hVarArr, hVar2.f7282l, obj, obj2, z5);
        this.f12491t = hVar2;
    }

    @Override // p015c2.h
    public final h Y() {
        return this.f12491t;
    }

    @Override // p015c2.h
    public final StringBuilder Z(StringBuilder sb) {
        j.x0(this.f7281k, sb, true);
        return sb;
    }

    @Override // p015c2.h
    public final StringBuilder a0(StringBuilder sb) {
        j.x0(this.f7281k, sb, false);
        sb.append('<');
        this.f12491t.a0(sb);
        sb.append(">;");
        return sb;
    }

    @Override // p015c2.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != c.class) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7281k == cVar.f7281k && this.f12491t.equals(cVar.f12491t);
    }

    @Override // p015c2.h
    public final boolean g0() {
        return super.g0() || this.f12491t.g0();
    }

    @Override // p015c2.h
    public final boolean k0() {
        return true;
    }

    @Override // p015c2.h
    public final h p0(Class cls, m mVar, h hVar, h[] hVarArr) {
        return new c(cls, mVar, hVar, hVarArr, this.f12491t, this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final h q0(h hVar) {
        if (this.f12491t == hVar) {
            return this;
        }
        return new c(this.f7281k, this.f12515r, this.f12513p, this.f12514q, hVar, this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final h r0(Object obj) {
        return new c(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12491t.v0(obj), this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final h s0(j jVar) {
        return new c(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12491t.w0(jVar), this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final h t0(h hVar) {
        h hVar2;
        h hVarT0;
        h hVarT1 = super.t0(hVar);
        h hVarY = hVar.Y();
        return (hVarY == null || (hVarT0 = (hVar2 = this.f12491t).t0(hVarY)) == hVar2) ? hVarT1 : hVarT1.q0(hVarT0);
    }

    @Override // p015c2.h
    public final String toString() {
        return "[collection type; class " + this.f7281k.getName() + ", contains " + this.f12491t + "]";
    }

    @Override // p015c2.h
    public final h u0() {
        if (this.f7285o) {
            return this;
        }
        return new c(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12491t.u0(), this.f7283m, this.f7284n, true);
    }

    @Override // p015c2.h
    public final h v0(Object obj) {
        return new c(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12491t, this.f7283m, obj, this.f7285o);
    }

    @Override // p015c2.h
    public final h w0(Object obj) {
        return new c(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12491t, obj, this.f7284n, this.f7285o);
    }

    @Override // p104t2.j
    public final String y0() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f7281k;
        sb.append(cls.getName());
        h hVar = this.f12491t;
        if (hVar != null && cls.getTypeParameters().length == 1) {
            sb.append('<');
            sb.append(((j) hVar).y0());
            sb.append('>');
        }
        return sb.toString();
    }
}
