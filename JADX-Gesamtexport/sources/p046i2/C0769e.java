package p046i2;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import p015c2.h;
import p035g0.C0715p;
import p109u2.i;

/* JADX INFO: renamed from: i2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0769e extends AbstractC0771g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient Field f9542k;

    public C0769e(J j4, Field field, C0715p c0715p) {
        super(j4, c0715p);
        this.f9542k = field;
    }

    @Override // p046i2.q
    public final AnnotatedElement e() {
        return this.f9542k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i.s(C0769e.class, obj)) {
            return false;
        }
        Field field = ((C0769e) obj).f9542k;
        Field field2 = this.f9542k;
        if (field == null) {
            return field2 == null;
        }
        return field.equals(field2);
    }

    @Override // p046i2.q
    public final Class g() {
        return this.f9542k.getType();
    }

    @Override // p046i2.q
    public final String getName() {
        return this.f9542k.getName();
    }

    @Override // p046i2.q
    public final h h() {
        return this.i.c(this.f9542k.getGenericType());
    }

    public final int hashCode() {
        return this.f9542k.getName().hashCode();
    }

    @Override // p046i2.AbstractC0771g
    public final Class n() {
        return this.f9542k.getDeclaringClass();
    }

    @Override // p046i2.AbstractC0771g
    public final Member p() {
        return this.f9542k;
    }

    @Override // p046i2.AbstractC0771g
    public final Object q(Object obj) {
        try {
            return this.f9542k.get(obj);
        } catch (IllegalAccessException e6) {
            throw new IllegalArgumentException("Failed to getValue() for field " + o() + ": " + e6.getMessage(), e6);
        }
    }

    @Override // p046i2.AbstractC0771g
    public final q t(C0715p c0715p) {
        return new C0769e(this.i, this.f9542k, c0715p);
    }

    public final String toString() {
        return "[field " + o() + "]";
    }

    public final void u(Object obj, Object obj2) {
        try {
            this.f9542k.set(obj, obj2);
        } catch (IllegalAccessException e6) {
            throw new IllegalArgumentException("Failed to setValue() for field " + o() + ": " + e6.getMessage(), e6);
        }
    }
}
