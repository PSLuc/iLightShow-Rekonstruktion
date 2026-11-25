package p037g2;

import T1.i;
import java.io.Serializable;
import java.util.Collection;
import p015c2.C0474e;
import p015c2.f;
import p015c2.j;
import p071n2.d;

/* JADX INFO: loaded from: classes.dex */
public final class C extends j implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f9103h;
    public final j i;

    public C(d dVar, j jVar) {
        this.f9103h = dVar;
        this.i = jVar;
    }

    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar) {
        return this.i.deserializeWithType(iVar, fVar, this.f9103h);
    }

    @Override // p015c2.j
    public final Object deserializeWithType(i iVar, f fVar, d dVar) {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // p015c2.j
    public final j getDelegatee() {
        return this.i.getDelegatee();
    }

    @Override // p015c2.j
    public final Object getEmptyValue(f fVar) {
        return this.i.getEmptyValue(fVar);
    }

    @Override // p015c2.j
    public final Collection getKnownPropertyNames() {
        return this.i.getKnownPropertyNames();
    }

    @Override // p015c2.j, p032f2.l
    public final Object getNullValue(f fVar) {
        return this.i.getNullValue(fVar);
    }

    @Override // p015c2.j
    public final Class handledType() {
        return this.i.handledType();
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return this.i.logicalType();
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return this.i.supportsUpdate(c0474e);
    }

    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar, Object obj) {
        return this.i.deserialize(iVar, fVar, obj);
    }
}
