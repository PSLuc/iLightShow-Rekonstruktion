package p046i2;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import p012c.k;
import p015c2.h;
import p035g0.C0715p;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0771g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f9513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f9514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f9515m;

    public K(C0766b c0766b, Class cls, String str, h hVar) {
        super(c0766b, null);
        this.f9513k = cls;
        this.f9514l = hVar;
        this.f9515m = str;
    }

    @Override // p046i2.q
    public final /* bridge */ /* synthetic */ AnnotatedElement e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i.s(K.class, obj)) {
            return false;
        }
        K k3 = (K) obj;
        return k3.f9513k == this.f9513k && k3.f9515m.equals(this.f9515m);
    }

    @Override // p046i2.q
    public final Class g() {
        return this.f9514l.f7281k;
    }

    @Override // p046i2.q
    public final String getName() {
        return this.f9515m;
    }

    @Override // p046i2.q
    public final h h() {
        return this.f9514l;
    }

    public final int hashCode() {
        return this.f9515m.hashCode();
    }

    @Override // p046i2.AbstractC0771g
    public final Class n() {
        return this.f9513k;
    }

    @Override // p046i2.AbstractC0771g
    public final Member p() {
        return null;
    }

    @Override // p046i2.AbstractC0771g
    public final Object q(Object obj) {
        throw new IllegalArgumentException(k.u(new StringBuilder("Cannot get virtual property '"), this.f9515m, "'"));
    }

    @Override // p046i2.AbstractC0771g
    public final q t(C0715p c0715p) {
        return this;
    }

    public final String toString() {
        return "[virtual " + o() + "]";
    }
}
