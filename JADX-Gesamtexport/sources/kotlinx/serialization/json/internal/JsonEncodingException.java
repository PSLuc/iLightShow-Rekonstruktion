package kotlinx.serialization.json.internal;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class JsonEncodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(String str) {
        super(str);
        k.f("message", str);
    }
}
