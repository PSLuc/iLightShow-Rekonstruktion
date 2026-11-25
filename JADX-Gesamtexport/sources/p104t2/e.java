package p104t2;

import p015c2.h;
import p015c2.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f12505t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h f12506u;

    public e(Class cls, m mVar, h hVar, h[] hVarArr, h hVar2, h hVar3, Object obj, Object obj2, boolean z5) {
        super(cls, mVar, hVar, hVarArr, hVar2.f7282l ^ hVar3.f7282l, obj, obj2, z5);
        this.f12505t = hVar2;
        this.f12506u = hVar3;
    }

    @Override // p015c2.h
    public final h Y() {
        return this.f12506u;
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
        this.f12505t.a0(sb);
        this.f12506u.a0(sb);
        sb.append(">;");
        return sb;
    }

    @Override // p015c2.h
    public final h b0() {
        return this.f12505t;
    }

    @Override // p015c2.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != e.class) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7281k == eVar.f7281k && this.f12505t.equals(eVar.f12505t) && this.f12506u.equals(eVar.f12506u);
    }

    @Override // p015c2.h
    public final boolean g0() {
        return super.g0() || this.f12506u.g0() || this.f12505t.g0();
    }

    @Override // p015c2.h
    public final boolean k0() {
        return true;
    }

    @Override // p015c2.h
    public final h p0(Class cls, m mVar, h hVar, h[] hVarArr) {
        return new e(cls, mVar, hVar, hVarArr, this.f12505t, this.f12506u, this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final h q0(h hVar) {
        if (this.f12506u == hVar) {
            return this;
        }
        return new e(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12505t, hVar, this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final h r0(Object obj) {
        return new e(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12505t, this.f12506u.v0(obj), this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final h s0(j jVar) {
        return new e(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12505t, this.f12506u.w0(jVar), this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final h t0(h hVar) {
        h hVar2;
        h hVarT0;
        h hVar3;
        h hVarT1;
        h hVarT2 = super.t0(hVar);
        h hVarB0 = hVar.b0();
        if ((hVarT2 instanceof e) && hVarB0 != null && (hVarT1 = (hVar3 = this.f12505t).t0(hVarB0)) != hVar3) {
            hVarT2 = ((e) hVarT2).z0(hVarT1);
        }
        h hVarY = hVar.Y();
        return (hVarY == null || (hVarT0 = (hVar2 = this.f12506u).t0(hVarY)) == hVar2) ? hVarT2 : hVarT2.q0(hVarT0);
    }

    @Override // p015c2.h
    public final String toString() {
        return "[map type; class " + this.f7281k.getName() + ", " + this.f12505t + " -> " + this.f12506u + "]";
    }

    @Override // p015c2.h
    public final h u0() {
        if (this.f7285o) {
            return this;
        }
        return new e(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12505t.u0(), this.f12506u.u0(), this.f7283m, this.f7284n, true);
    }

    @Override // p015c2.h
    public final h v0(Object obj) {
        return new e(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12505t, this.f12506u, this.f7283m, obj, this.f7285o);
    }

    @Override // p015c2.h
    public final h w0(Object obj) {
        return new e(this.f7281k, this.f12515r, this.f12513p, this.f12514q, this.f12505t, this.f12506u, obj, this.f7284n, this.f7285o);
    }

    @Override // p104t2.j
    public final String y0() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f7281k;
        sb.append(cls.getName());
        h hVar = this.f12505t;
        if (hVar != null && cls.getTypeParameters().length == 2) {
            sb.append('<');
            sb.append(((j) hVar).y0());
            sb.append(',');
            sb.append(((j) this.f12506u).y0());
            sb.append('>');
        }
        return sb.toString();
    }

    public final e z0(h hVar) {
        if (hVar == this.f12505t) {
            return this;
        }
        return new e(this.f7281k, this.f12515r, this.f12513p, this.f12514q, hVar, this.f12506u, this.f7283m, this.f7284n, this.f7285o);
    }
}
