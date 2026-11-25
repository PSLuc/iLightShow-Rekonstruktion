package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum r0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0422g.f6857j),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Serializable f6922h;

    r0(Serializable serializable) {
        this.f6922h = serializable;
    }
}
