package d5;

import S1.V;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f8625a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.h f8626b = V.s("kotlinx.serialization.json.JsonNull", a5.i.f6373k, new a5.g[0]);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        G4.a.l(cVar);
        if (cVar.g()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f8626b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        E4.k.f("value", (JsonNull) obj);
        G4.a.k(dVar);
        dVar.e();
    }
}
