package d5;

import S1.V;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f8619a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.h f8620b = V.r("kotlinx.serialization.json.JsonElement", a5.c.f6351k, new a5.g[0], new defpackage.d(28));

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return G4.a.l(cVar).F0();
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f8620b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        E4.k.f("value", jsonElement);
        G4.a.k(dVar);
        if (jsonElement instanceof JsonPrimitive) {
            dVar.r(w.f8632a, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            dVar.r(u.f8630a, jsonElement);
        } else {
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.r(f.f8601a, jsonElement);
        }
    }
}
