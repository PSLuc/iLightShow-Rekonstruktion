package d5;

import E4.x;
import c5.AbstractC0476a0;
import c5.F;
import c5.p0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f8618a = AbstractC0476a0.a(p0.f7477a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final JsonPrimitive a(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw new IllegalArgumentException("Element " + x.a(jsonElement.getClass()) + " is not a JsonPrimitive");
    }
}
