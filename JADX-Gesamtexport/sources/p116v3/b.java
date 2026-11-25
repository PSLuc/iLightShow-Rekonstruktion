package p116v3;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Type f13252h;
    public final Type i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Type[] f13253j;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type == null && (type2 instanceof Class)) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException("Must specify owner type for " + type2);
            }
        }
        this.f13252h = type == null ? null : d.a(type);
        this.i = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f13253j = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f13253j[i]);
            d.c(this.f13253j[i]);
            Type[] typeArr3 = this.f13253j;
            typeArr3[i] = d.a(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f13253j.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f13252h;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f13253j) ^ this.i.hashCode();
        Type type = this.f13252h;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f13253j;
        int length = typeArr.length;
        Type type = this.i;
        if (length == 0) {
            return d.l(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.l(type));
        sb.append("<");
        sb.append(d.l(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(d.l(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
