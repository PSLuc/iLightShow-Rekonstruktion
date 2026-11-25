package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0439y {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0422g.class, C0422g.f6857j),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Serializable f6938h;

    EnumC0439y(Class cls, Serializable serializable) {
        this.f6938h = serializable;
    }
}
