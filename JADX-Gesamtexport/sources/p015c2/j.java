package p015c2;

import T1.i;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.util.Collection;
import p012c.k;
import p032f2.l;
import p032f2.r;
import p071n2.d;
import p109u2.EnumC0962a;
import p109u2.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements l {
    public Object c(f fVar) {
        return getNullValue(fVar);
    }

    public abstract Object deserialize(i iVar, f fVar);

    public Object deserialize(i iVar, f fVar, Object obj) throws InvalidDefinitionException {
        fVar.m0(this);
        return deserialize(iVar, fVar);
    }

    public Object deserializeWithType(i iVar, f fVar, d dVar) {
        return dVar.b(iVar, fVar);
    }

    public r findBackReference(String str) {
        StringBuilder sbW = k.w("Cannot handle managed/back reference '", str, "': type: value deserializer of type ");
        sbW.append(getClass().getName());
        sbW.append(" does not support them");
        throw new IllegalArgumentException(sbW.toString());
    }

    @Override // p032f2.l
    public Object getAbsentValue(f fVar) {
        return getNullValue(fVar);
    }

    public j getDelegatee() {
        return null;
    }

    public EnumC0962a getEmptyAccessPattern() {
        return EnumC0962a.f12678j;
    }

    public Object getEmptyValue(f fVar) {
        return getNullValue(fVar);
    }

    public Collection<Object> getKnownPropertyNames() {
        return null;
    }

    public EnumC0962a getNullAccessPattern() {
        return EnumC0962a.i;
    }

    @Override // p032f2.l
    public Object getNullValue(f fVar) {
        return getNullValue();
    }

    public p037g2.r getObjectIdReader() {
        return null;
    }

    public Class handledType() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public p104t2.d logicalType() {
        return null;
    }

    public j replaceDelegatee(j jVar) {
        throw new UnsupportedOperationException();
    }

    public Boolean supportsUpdate(C0474e c0474e) {
        return null;
    }

    public j unwrappingDeserializer(s sVar) {
        return this;
    }

    public Object deserializeWithType(i iVar, f fVar, d dVar, Object obj) throws InvalidDefinitionException {
        fVar.m0(this);
        return deserializeWithType(iVar, fVar, dVar);
    }

    @Deprecated
    public Object getEmptyValue() {
        return getNullValue();
    }

    @Deprecated
    public Object getNullValue() {
        return null;
    }
}
