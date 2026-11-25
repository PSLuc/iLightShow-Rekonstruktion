package c5;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7424c;

    public Y(String str, Object obj) {
        E4.k.f("objectInstance", obj);
        this.f7422a = obj;
        this.f7423b = p089q4.u.f11237h;
        this.f7424c = G4.a.y(p084p4.g.f10847h, new N3.A0(str, 5, this));
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g descriptor = getDescriptor();
        b5.a aVarA = cVar.a(descriptor);
        int iK = aVarA.k(getDescriptor());
        if (iK != -1) {
            throw new SerializationException(p012c.k.r(iK, "Unexpected index "));
        }
        aVarA.b(descriptor);
        return this.f7422a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p4.f] */
    @Override // Y4.a
    public final a5.g getDescriptor() {
        return (a5.g) this.f7424c.getValue();
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        E4.k.f("value", obj);
        dVar.a(getDescriptor()).b(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        E4.k.f("objectInstance", obj);
        this.f7423b = p089q4.k.a0(annotationArr);
    }
}
