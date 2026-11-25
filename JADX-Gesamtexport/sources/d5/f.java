package d5;

import c5.C0479c;
import java.util.List;
import kotlinx.serialization.json.JsonArray;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f8601a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f8602b = e.f8598b;

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        G4.a.l(cVar);
        return new JsonArray((List) new C0479c(l.f8619a, 0).deserialize(cVar));
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f8602b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        E4.k.f("value", jsonArray);
        G4.a.k(dVar);
        new C0479c(l.f8619a, 0).serialize(dVar, jsonArray);
    }
}
