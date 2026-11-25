package p098s2;

import T1.e;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.P;
import p015c2.E;
import p093r2.h;

/* JADX INFO: loaded from: classes.dex */
public final class c extends P {
    @Override // p015c2.o
    public final void serialize(Object obj, e eVar, E e6) throws JsonMappingException {
        e6.getClass();
        throw new JsonMappingException(((h) e6).f11759x, "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)", null);
    }
}
