package Y4;

import E4.k;
import N3.R0;
import S1.h0;
import kotlinx.serialization.SerializationException;
import p084p4.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K4.b f5923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5924b;

    public c(K4.b bVar) {
        k.f("baseClass", bVar);
        this.f5923a = bVar;
        this.f5924b = G4.a.y(g.f10847h, new R0(1, this));
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        b5.a aVarA = cVar.a(getDescriptor());
        String strM = null;
        while (true) {
            int iK = aVarA.k(getDescriptor());
            if (iK == -1) {
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + strM).toString());
            }
            if (iK != 0) {
                if (iK == 1) {
                    if (strM == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    h0.k(this, aVarA, strM);
                    throw null;
                }
                StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                if (strM == null) {
                    strM = "unknown class";
                }
                sb.append(strM);
                sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                sb.append(iK);
                throw new SerializationException(sb.toString());
            }
            strM = aVarA.m(getDescriptor(), iK);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p4.f] */
    @Override // Y4.a
    public final a5.g getDescriptor() {
        return (a5.g) this.f5924b.getValue();
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        k.f("value", obj);
        h0.l(this, (p081p0.c) dVar, obj);
        throw null;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f5923a + ')';
    }
}
