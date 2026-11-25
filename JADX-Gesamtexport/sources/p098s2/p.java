package p098s2;

import T1.e;
import com.fasterxml.jackson.databind.ser.std.C0545p;
import p015c2.D;
import p015c2.E;
import p109u2.u;

/* JADX INFO: loaded from: classes.dex */
public final class p extends C0545p {
    public final void c(E e6, Object obj) {
        Class<?> cls = obj.getClass();
        if (u.a(cls)) {
            e6.P("No serializer found for class " + cls.getName() + " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS). This appears to be a native image, in which case you may need to configure reflection for the class that is to be serialized", handledType());
            throw null;
        }
        e6.P("No serializer found for class " + cls.getName() + " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", handledType());
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.C0545p, p015c2.o
    public final void serialize(Object obj, e eVar, E e6) {
        if (e6.f7226j.p(D.FAIL_ON_EMPTY_BEANS)) {
            c(e6, obj);
            throw null;
        }
        super.serialize(obj, eVar, e6);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.C0545p, p015c2.o
    public final void serializeWithType(Object obj, e eVar, E e6, p071n2.e eVar2) {
        if (e6.f7226j.p(D.FAIL_ON_EMPTY_BEANS)) {
            c(e6, obj);
            throw null;
        }
        super.serializeWithType(obj, eVar, e6, eVar2);
    }
}
