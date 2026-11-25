package d5;

import c5.E;
import c5.p0;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f8630a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f8631b = t.f8627b;

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        G4.a.l(cVar);
        p0 p0Var = p0.f7477a;
        l lVar = l.f8619a;
        return new JsonObject((Map) new E(p0.f7477a, l.f8619a, 1).deserialize(cVar));
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f8631b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        E4.k.f("value", jsonObject);
        G4.a.k(dVar);
        p0 p0Var = p0.f7477a;
        l lVar = l.f8619a;
        new E(p0.f7477a, l.f8619a, 1).serialize(dVar, jsonObject);
    }
}
