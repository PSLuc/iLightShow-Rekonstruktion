package kotlinx.serialization;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(k.r(i, "An unknown field for index "));
    }
}
