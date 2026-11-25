package p116v3;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Type f13254h;
    public final Type i;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.b(typeArr2.length <= 1);
        d.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.c(typeArr[0]);
            this.i = null;
            this.f13254h = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.c(typeArr2[0]);
        d.b(typeArr[0] == Object.class);
        this.i = d.a(typeArr2[0]);
        this.f13254h = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.i;
        return type != null ? new Type[]{type} : d.f13255a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f13254h};
    }

    public final int hashCode() {
        Type type = this.i;
        return (this.f13254h.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.i;
        if (type != null) {
            return "? super " + d.l(type);
        }
        Type type2 = this.f13254h;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.l(type2);
    }
}
