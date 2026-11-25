package p093r2;

import B.AbstractC0013g0;
import S1.d0;
import T1.e;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import p015c2.A;
import p015c2.C;
import p015c2.D;
import p015c2.E;
import p015c2.n;
import p015c2.o;
import p015c2.r;
import p046i2.q;
import p098s2.s;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends E implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient AbstractMap f11757v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient ArrayList f11758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient e f11759x;

    public static IOException A0(e eVar, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strI = i.i(exc);
        if (strI == null) {
            strI = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException(eVar, strI, exc);
    }

    public final void B0(e eVar, Object obj) {
        this.f11759x = eVar;
        if (obj == null) {
            try {
                this.f7231o.getClass();
                eVar.V();
                return;
            } catch (Exception e6) {
                throw A0(eVar, e6);
            }
        }
        Class<?> cls = obj.getClass();
        o oVarN0 = n0(cls);
        C c6 = this.f7226j;
        c6.getClass();
        if (c6.p(D.WRAP_ROOT_VALUE)) {
            z0(eVar, obj, oVarN0, c6.f8723m.a(cls, c6));
            return;
        }
        try {
            oVarN0.serialize(obj, eVar, this);
        } catch (Exception e7) {
            throw A0(eVar, e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    @Override // p015c2.E
    public final s k0(Object obj, d0 d0Var) {
        d0 d0VarE;
        AbstractMap abstractMap = this.f11757v;
        if (abstractMap == null) {
            this.f11757v = this.f7226j.p(D.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
        } else {
            s sVar = (s) abstractMap.get(obj);
            if (sVar != null) {
                return sVar;
            }
        }
        ArrayList arrayList = this.f11758w;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    d0VarE = (d0) this.f11758w.get(i);
                    if (d0VarE.a(d0Var)) {
                        break;
                    }
                    i++;
                }
            }
            if (d0VarE == null) {
                d0VarE = d0Var.e();
                this.f11758w.add(d0VarE);
            }
            s sVar2 = new s(d0VarE);
            this.f11757v.put(obj, sVar2);
            return sVar2;
        }
        this.f11758w = new ArrayList(8);
        d0VarE = null;
        if (d0VarE == null) {
            d0VarE = d0Var.e();
            this.f11758w.add(d0VarE);
        }
        s sVar3 = new s(d0VarE);
        this.f11757v.put(obj, sVar3);
        return sVar3;
    }

    @Override // p015c2.E
    public final Object u0(Class cls) {
        if (cls == null) {
            return null;
        }
        C c6 = this.f7226j;
        c6.h();
        return i.h(cls, c6.k(r.CAN_OVERRIDE_ACCESS_MODIFIERS));
    }

    @Override // p015c2.E
    public final boolean v0(Object obj) throws InvalidDefinitionException {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Exception e6) {
            String name = obj.getClass().getName();
            String name2 = e6.getClass().getName();
            String strI = i.i(e6);
            StringBuilder sbO = AbstractC0013g0.o("Problem determining whether filter of type '", name, "' should filter out `null` values: (", name2, ") ");
            sbO.append(strI);
            String string = sbO.toString();
            Class<?> cls = obj.getClass();
            e eVar = this.f11759x;
            k(cls);
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(eVar, string);
            invalidDefinitionException.initCause(e6);
            throw invalidDefinitionException;
        }
    }

    @Override // p015c2.E
    public final o y0(q qVar, Object obj) {
        o oVar;
        if (obj instanceof o) {
            oVar = (o) obj;
        } else {
            if (!(obj instanceof Class)) {
                qVar.h();
                O("AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
                throw null;
            }
            Class cls = (Class) obj;
            if (cls == n.class || i.t(cls)) {
                return null;
            }
            if (!o.class.isAssignableFrom(cls)) {
                qVar.h();
                O("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
                throw null;
            }
            C c6 = this.f7226j;
            c6.h();
            oVar = (o) i.h(cls, c6.k(r.CAN_OVERRIDE_ACCESS_MODIFIERS));
        }
        if (oVar instanceof j) {
            ((j) oVar).a(this);
        }
        return oVar;
    }

    public final void z0(e eVar, Object obj, o oVar, A a6) throws IOException {
        try {
            eVar.o0();
            C c6 = this.f7226j;
            V1.h hVar = a6.f7196j;
            if (hVar == null) {
                String str = a6.f7195h;
                hVar = c6 == null ? new V1.h(str) : new V1.h(str);
                a6.f7196j = hVar;
            }
            eVar.Q(hVar);
            oVar.serialize(obj, eVar, this);
            eVar.M();
        } catch (Exception e6) {
            throw A0(eVar, e6);
        }
    }
}
