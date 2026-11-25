package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.EnumC0354p;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0540k extends Q implements p093r2.g {
    public final p009b2.k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f7729j;

    public C0540k(p009b2.k kVar, Boolean bool) {
        super((Class) kVar.i, 2, (byte) 0);
        this.i = kVar;
        this.f7729j = bool;
    }

    public static Boolean f(Class cls, C0355q c0355q, boolean z5, Boolean bool) {
        EnumC0354p enumC0354p = c0355q.i;
        if (enumC0354p == null || enumC0354p == EnumC0354p.f4961h || enumC0354p == EnumC0354p.f4962j) {
            return bool;
        }
        if (enumC0354p == EnumC0354p.f4968p || enumC0354p == EnumC0354p.i) {
            return Boolean.FALSE;
        }
        if (enumC0354p.a() || enumC0354p == EnumC0354p.f4963k) {
            return Boolean.TRUE;
        }
        String name = cls.getName();
        String str = z5 ? "class" : "property";
        StringBuilder sb = new StringBuilder("Unsupported serialization shape (");
        sb.append(enumC0354p);
        sb.append(") for Enum ");
        sb.append(name);
        sb.append(", not supported as ");
        throw new IllegalArgumentException(p012c.k.u(sb, str, " annotation"));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        throw null;
    }

    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        C0355q c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, handledType());
        if (c0355qFindFormatOverrides != null) {
            Class<Object> clsHandledType = handledType();
            Boolean bool = this.f7729j;
            Boolean boolF = f(clsHandledType, c0355qFindFormatOverrides, false, bool);
            if (!Objects.equals(boolF, bool)) {
                return new C0540k(this.i, boolF);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        boolean zP;
        JsonNode jsonNodeA;
        Boolean bool = this.f7729j;
        if (bool != null) {
            zP = bool.booleanValue();
        } else {
            zP = e6.f7226j.p(p015c2.D.WRITE_ENUMS_USING_INDEX);
        }
        if (zP) {
            return createSchemaNode("integer", true);
        }
        p087q2.r rVarCreateSchemaNode = createSchemaNode("string", true);
        if (type != null && e6.k(type).l0()) {
            p087q2.m mVar = rVarCreateSchemaNode.f11215h;
            mVar.getClass();
            p087q2.a aVar = new p087q2.a(mVar);
            rVarCreateSchemaNode.i.put("enum", aVar);
            Iterator it = Arrays.asList((T1.n[]) this.i.f7081j).iterator();
            while (it.hasNext()) {
                String str = ((V1.h) ((T1.n) it.next())).f5505h;
                if (str == null) {
                    aVar.p();
                    jsonNodeA = p087q2.p.f11225h;
                } else {
                    aVar.f11215h.getClass();
                    jsonNodeA = p087q2.m.a(str);
                }
                aVar.q(jsonNodeA);
            }
        }
        return rVarCreateSchemaNode;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        boolean zP;
        Enum r6 = (Enum) obj;
        Boolean bool = this.f7729j;
        if (bool != null) {
            zP = bool.booleanValue();
        } else {
            zP = e6.f7226j.p(p015c2.D.WRITE_ENUMS_USING_INDEX);
        }
        if (zP) {
            eVar.Z(r6.ordinal());
            return;
        }
        if (e6.f7226j.p(p015c2.D.WRITE_ENUMS_USING_TO_STRING)) {
            eVar.s0(r6.toString());
        } else {
            eVar.r0(((T1.n[]) this.i.f7081j)[r6.ordinal()]);
        }
    }
}
