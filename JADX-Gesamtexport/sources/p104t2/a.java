package p104t2;

import java.lang.reflect.Array;
import p015c2.h;
import p015c2.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f12486v = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f12487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f12488u;

    public a(h hVar, m mVar, Object obj, Object obj2, Object obj3, boolean z5) {
        super(obj.getClass(), mVar, null, null, hVar.f7282l, obj2, obj3, z5);
        this.f12487t = hVar;
        this.f12488u = obj;
    }

    @Override // p015c2.h
    public final h Y() {
        return this.f12487t;
    }

    @Override // p015c2.h
    public final StringBuilder Z(StringBuilder sb) {
        sb.append('[');
        return this.f12487t.Z(sb);
    }

    @Override // p015c2.h
    public final StringBuilder a0(StringBuilder sb) {
        sb.append('[');
        return this.f12487t.a0(sb);
    }

    @Override // p015c2.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == a.class) {
            return this.f12487t.equals(((a) obj).f12487t);
        }
        return false;
    }

    @Override // p015c2.h
    public final boolean f0() {
        return this.f12487t.f0();
    }

    @Override // p015c2.h
    public final boolean g0() {
        return super.g0() || this.f12487t.g0();
    }

    @Override // p015c2.h
    public final boolean i0() {
        return false;
    }

    @Override // p015c2.h
    public final boolean j0() {
        return true;
    }

    @Override // p015c2.h
    public final boolean k0() {
        return true;
    }

    @Override // p015c2.h
    public final h p0(Class cls, m mVar, h hVar, h[] hVarArr) {
        return null;
    }

    @Override // p015c2.h
    public final h q0(h hVar) {
        return new a(hVar, this.f12515r, Array.newInstance((Class<?>) hVar.f7281k, 0), this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final h r0(Object obj) {
        h hVar = this.f12487t;
        if (obj == hVar.f7284n) {
            return this;
        }
        return new a(hVar.v0(obj), this.f12515r, this.f12488u, this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final h s0(j jVar) {
        h hVar = this.f12487t;
        if (jVar == hVar.f7283m) {
            return this;
        }
        return new a(hVar.w0(jVar), this.f12515r, this.f12488u, this.f7283m, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public final String toString() {
        return "[array type, component type: " + this.f12487t + "]";
    }

    @Override // p015c2.h
    public final h u0() {
        if (this.f7285o) {
            return this;
        }
        return new a(this.f12487t.u0(), this.f12515r, this.f12488u, this.f7283m, this.f7284n, true);
    }

    @Override // p015c2.h
    public final h v0(Object obj) {
        if (obj == this.f7284n) {
            return this;
        }
        return new a(this.f12487t, this.f12515r, this.f12488u, this.f7283m, obj, this.f7285o);
    }

    @Override // p015c2.h
    public final h w0(Object obj) {
        if (obj == this.f7283m) {
            return this;
        }
        return new a(this.f12487t, this.f12515r, this.f12488u, obj, this.f7284n, this.f7285o);
    }
}
