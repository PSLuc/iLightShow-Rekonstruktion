package kotlinx.serialization.json;

import E4.g;
import Y4.d;
import d5.v;
import d5.w;

/* JADX INFO: loaded from: classes.dex */
@d(with = w.class)
public abstract class JsonPrimitive extends JsonElement {
    public static final v Companion = new v();

    public /* synthetic */ JsonPrimitive(g gVar) {
        this();
    }

    public abstract String getContent();

    public abstract boolean isString();

    public String toString() {
        return getContent();
    }

    private JsonPrimitive() {
        super(null);
    }
}
