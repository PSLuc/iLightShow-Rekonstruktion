package p015c2;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import p020d2.n;
import p104t2.j;
import p104t2.m;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends n implements Serializable, Type {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f7281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f7283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f7284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7285o;

    public h(Class cls, int i, Object obj, Object obj2, boolean z5) {
        this.f7281k = cls;
        this.f7282l = cls.getName().hashCode() + i;
        this.f7283m = obj;
        this.f7284n = obj2;
        this.f7285o = z5;
    }

    public final h V(int i) {
        h hVarD = ((j) this).f12515r.d(i);
        return hVarD == null ? p104t2.n.n() : hVarD;
    }

    public abstract h W(Class cls);

    public abstract m X();

    public h Y() {
        return null;
    }

    public abstract StringBuilder Z(StringBuilder sb);

    public abstract StringBuilder a0(StringBuilder sb);

    public h b0() {
        return null;
    }

    @Override // p020d2.n
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public h x() {
        return null;
    }

    public abstract h d0();

    public boolean e0() {
        return true;
    }

    public abstract boolean equals(Object obj);

    public boolean f0() {
        return ((j) this).f12515r.i.length > 0;
    }

    public boolean g0() {
        return (this.f7284n == null && this.f7283m == null) ? false : true;
    }

    public final boolean h0(Class cls) {
        return this.f7281k == cls;
    }

    public final int hashCode() {
        return this.f7282l;
    }

    public boolean i0() {
        return Modifier.isAbstract(this.f7281k.getModifiers());
    }

    public boolean j0() {
        Class cls = this.f7281k;
        if ((cls.getModifiers() & 1536) == 0) {
            return true;
        }
        return cls.isPrimitive();
    }

    public abstract boolean k0();

    public final boolean l0() {
        Annotation[] annotationArr = i.f12697a;
        return Enum.class.isAssignableFrom(this.f7281k);
    }

    public final boolean m0() {
        return this.f7281k == Object.class;
    }

    public final boolean n0(Class cls) {
        Class cls2 = this.f7281k;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean o0(Class cls) {
        Class cls2 = this.f7281k;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public abstract h p0(Class cls, m mVar, h hVar, h[] hVarArr);

    public abstract h q0(h hVar);

    public abstract h r0(Object obj);

    public abstract h s0(j jVar);

    public h t0(h hVar) {
        Object obj = hVar.f7284n;
        h hVarV0 = obj != this.f7284n ? v0(obj) : this;
        Object obj2 = this.f7283m;
        Object obj3 = hVar.f7283m;
        return obj3 != obj2 ? hVarV0.w0(obj3) : hVarV0;
    }

    public abstract String toString();

    public abstract h u0();

    public abstract h v0(Object obj);

    public abstract h w0(Object obj);
}
