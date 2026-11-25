package kotlinx.serialization.json;

import Y4.a;
import Y4.d;
import d5.r;

/* JADX INFO: loaded from: classes.dex */
@d(with = r.class)
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();
    private static final String content = "null";

    private JsonNull() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String getContent() {
        return content;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean isString() {
        return false;
    }

    public final a serializer() {
        return r.f8625a;
    }
}
