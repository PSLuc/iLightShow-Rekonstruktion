package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q extends P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7699h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(int i, Class cls) {
        super(i, cls);
        this.f7699h = 3;
    }

    public static void c(T1.e eVar, Object obj) {
        if (obj instanceof Date) {
            eVar.a0(((Date) obj).getTime() / 1000);
            return;
        }
        if (obj instanceof Instant) {
            eVar.a0(((Instant) obj).getEpochSecond());
            return;
        }
        if (obj instanceof Map) {
            eVar.o0();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                eVar.T((String) entry.getKey());
                c(eVar, entry.getValue());
            }
            eVar.M();
            return;
        }
        if (!(obj instanceof List)) {
            eVar.f0(obj);
            return;
        }
        eVar.l0();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            c(eVar, it.next());
        }
        eVar.L();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        switch (this.f7699h) {
            case 2:
                visitStringFormat(bVar, hVar);
                break;
            case 3:
                visitStringFormat(bVar, hVar);
                break;
            default:
                super.acceptJsonFormatVisitor(bVar, hVar);
                break;
        }
    }

    public abstract String d(Object obj);

    public void e(Map.Entry entry, T1.e eVar) {
        eVar.T((String) entry.getKey());
        c(eVar, entry.getValue());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public JsonNode getSchema(p015c2.E e6, Type type) {
        switch (this.f7699h) {
            case 2:
                return createSchemaNode("string", true);
            case 3:
                return createSchemaNode("string", true);
            default:
                return super.getSchema(e6, type);
        }
    }

    @Override // p015c2.o
    public boolean isEmpty(p015c2.E e6, Object obj) {
        switch (this.f7699h) {
            case 3:
                return d(obj).isEmpty();
            default:
                return super.isEmpty(e6, obj);
        }
    }

    @Override // p015c2.o
    public void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        switch (this.f7699h) {
            case 1:
                eVar.o0();
                Iterator it = ((R1.a) obj).f4763a.entrySet().iterator();
                while (it.hasNext()) {
                    e((Map.Entry) it.next(), eVar);
                }
                eVar.M();
                break;
            default:
                eVar.s0(d(obj));
                break;
        }
    }

    @Override // p015c2.o
    public void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) {
        switch (this.f7699h) {
            case 2:
                p003a2.a aVarE = eVar2.e(eVar, eVar2.d(T1.k.VALUE_STRING, obj));
                serialize(obj, eVar, e6);
                eVar2.f(eVar, aVarE);
                break;
            case 3:
                p003a2.a aVarE2 = eVar2.e(eVar, eVar2.d(T1.k.VALUE_STRING, obj));
                serialize(obj, eVar, e6);
                eVar2.f(eVar, aVarE2);
                break;
            default:
                super.serializeWithType(obj, eVar, e6, eVar2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(Class cls, int i, byte b6) {
        super(cls);
        this.f7699h = i;
    }
}
