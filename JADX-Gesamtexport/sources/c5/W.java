package c5;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f7418a = new W();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f7419b = V.f7417a;

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7419b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        E4.k.f("value", (Void) obj);
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
