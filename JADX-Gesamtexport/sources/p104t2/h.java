package p104t2;

import p015c2.j;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p015c2.h f12511t;

    @Override // p104t2.j, p015c2.h
    public final m X() {
        p015c2.h hVar = this.f12511t;
        return hVar != null ? hVar.X() : this.f12515r;
    }

    @Override // p015c2.h
    public final StringBuilder Z(StringBuilder sb) {
        p015c2.h hVar = this.f12511t;
        return hVar != null ? hVar.Z(sb) : sb;
    }

    @Override // p015c2.h
    public final StringBuilder a0(StringBuilder sb) {
        p015c2.h hVar = this.f12511t;
        if (hVar != null) {
            return hVar.Z(sb);
        }
        sb.append("?");
        return sb;
    }

    @Override // p104t2.j, p015c2.h
    public final p015c2.h d0() {
        p015c2.h hVar = this.f12511t;
        return hVar != null ? hVar.d0() : this.f12513p;
    }

    @Override // p015c2.h
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p015c2.h
    public final boolean k0() {
        return false;
    }

    @Override // p015c2.h
    public final p015c2.h p0(Class cls, m mVar, p015c2.h hVar, p015c2.h[] hVarArr) {
        return null;
    }

    @Override // p015c2.h
    public final p015c2.h q0(p015c2.h hVar) {
        return this;
    }

    @Override // p015c2.h
    public final p015c2.h r0(Object obj) {
        return this;
    }

    @Override // p015c2.h
    public final p015c2.h s0(j jVar) {
        return this;
    }

    @Override // p015c2.h
    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[recursive type; ");
        p015c2.h hVar = this.f12511t;
        if (hVar == null) {
            sb.append("UNRESOLVED");
        } else {
            sb.append(hVar.f7281k.getName());
        }
        return sb.toString();
    }

    @Override // p015c2.h
    public final p015c2.h u0() {
        return this;
    }

    @Override // p015c2.h
    public final p015c2.h v0(Object obj) {
        return this;
    }

    @Override // p015c2.h
    public final p015c2.h w0(Object obj) {
        return this;
    }
}
