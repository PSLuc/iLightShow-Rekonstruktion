package p046i2;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import p015c2.h;
import p035g0.C0715p;
import p109u2.i;

/* JADX INFO: renamed from: i2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0776l extends AbstractC0771g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f9555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f9556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9557m;

    public C0776l(m mVar, h hVar, J j4, C0715p c0715p, int i) {
        super(j4, c0715p);
        this.f9555k = mVar;
        this.f9556l = hVar;
        this.f9557m = i;
    }

    @Override // p046i2.q
    public final AnnotatedElement e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i.s(C0776l.class, obj)) {
            return false;
        }
        C0776l c0776l = (C0776l) obj;
        return c0776l.f9555k.equals(this.f9555k) && c0776l.f9557m == this.f9557m;
    }

    @Override // p046i2.q
    public final Class g() {
        return this.f9556l.f7281k;
    }

    @Override // p046i2.q
    public final String getName() {
        return "";
    }

    @Override // p046i2.q
    public final h h() {
        return this.f9556l;
    }

    public final int hashCode() {
        return this.f9555k.hashCode() + this.f9557m;
    }

    @Override // p046i2.AbstractC0771g
    public final Class n() {
        return this.f9555k.n();
    }

    @Override // p046i2.AbstractC0771g
    public final Member p() {
        return this.f9555k.p();
    }

    @Override // p046i2.AbstractC0771g
    public final Object q(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of ".concat(this.f9555k.n().getName()));
    }

    @Override // p046i2.AbstractC0771g
    public final q t(C0715p c0715p) {
        if (c0715p == this.f9546j) {
            return this;
        }
        m mVar = this.f9555k;
        C0715p[] c0715pArr = mVar.f9558k;
        int i = this.f9557m;
        c0715pArr[i] = c0715p;
        return mVar.x(i);
    }

    public final String toString() {
        return "[parameter #" + this.f9557m + ", annotations: " + this.f9546j + "]";
    }
}
