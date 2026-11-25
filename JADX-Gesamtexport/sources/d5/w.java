package d5;

import E4.x;
import S1.V;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f8632a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.h f8633b = V.s("kotlinx.serialization.json.JsonPrimitive", a5.e.f6360r, new a5.g[0]);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        JsonElement jsonElementF0 = G4.a.l(cVar).F0();
        if (jsonElementF0 instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementF0;
        }
        throw e5.h.b(-1, "Unexpected JSON element, expected JsonPrimitive, had " + x.a(jsonElementF0.getClass()), jsonElementF0.toString());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f8633b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        E4.k.f("value", jsonPrimitive);
        G4.a.k(dVar);
        if (jsonPrimitive instanceof JsonNull) {
            dVar.r(r.f8625a, JsonNull.INSTANCE);
        } else {
            dVar.r(p.f8623a, (o) jsonPrimitive);
        }
    }
}
