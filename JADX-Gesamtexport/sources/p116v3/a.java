package p116v3;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Type f13251h;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f13251h = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f13251h;
    }

    public final int hashCode() {
        return this.f13251h.hashCode();
    }

    public final String toString() {
        return d.l(this.f13251h) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
