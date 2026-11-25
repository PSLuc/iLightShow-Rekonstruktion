package p015c2;

import B.AbstractC0013g0;
import T1.e;
import java.util.Iterator;
import p059l2.b;
import p109u2.i;
import p109u2.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public void acceptJsonFormatVisitor(b bVar, h hVar) {
        bVar.getClass();
    }

    public o getDelegatee() {
        return null;
    }

    public abstract Class handledType();

    @Deprecated
    public boolean isEmpty(Object obj) {
        return isEmpty(null, obj);
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public Iterator<p093r2.b> properties() {
        return i.f12699c;
    }

    public o replaceDelegatee(o oVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void serialize(Object obj, e eVar, E e6);

    public void serializeWithType(Object obj, e eVar, E e6, p071n2.e eVar2) {
        Class<?> clsHandledType = handledType();
        if (clsHandledType == null) {
            clsHandledType = obj.getClass();
        }
        e6.P(AbstractC0013g0.j("Type id handling not implemented for type ", clsHandledType.getName(), " (by serializer of type ", getClass().getName(), ")"), clsHandledType);
        throw null;
    }

    public o unwrappingSerializer(s sVar) {
        return this;
    }

    public boolean usesObjectId() {
        return false;
    }

    public o withFilterId(Object obj) {
        return this;
    }

    public boolean isEmpty(E e6, Object obj) {
        return obj == null;
    }
}
