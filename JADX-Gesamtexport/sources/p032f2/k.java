package p032f2;

import S1.c0;
import S1.d0;
import Y1.e;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p015c2.A;
import p015c2.C0474e;
import p015c2.f;
import p015c2.g;
import p015c2.h;
import p015c2.j;
import p015c2.p;
import p015c2.q;
import p015c2.r;
import p109u2.i;
import p109u2.n;
import p138z3.b;

/* JADX INFO: loaded from: classes.dex */
public final class k extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient LinkedHashMap f8922t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f8923u;

    @Override // p015c2.f
    public final q C0(Object obj) {
        q qVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof q) {
            qVar = (q) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == p.class || i.t(cls)) {
                return null;
            }
            if (!q.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<KeyDeserializer>");
            }
            C0474e c0474e = this.f7249l;
            c0474e.h();
            qVar = (q) i.h(cls, c0474e.k(r.CAN_OVERRIDE_ACCESS_MODIFIERS));
        }
        if (qVar instanceof m) {
            ((m) qVar).b(this);
        }
        return qVar;
    }

    public final Object P0(e eVar, h hVar, j jVar) throws MismatchedInputException {
        C0474e c0474e = this.f7249l;
        c0474e.getClass();
        if (!c0474e.p(g.UNWRAP_ROOT_VALUE)) {
            return jVar.deserialize(eVar, this);
        }
        n nVar = c0474e.f8723m;
        nVar.getClass();
        A a6 = nVar.a(hVar.f7281k, c0474e);
        T1.k kVar = eVar.f5340j;
        T1.k kVar2 = T1.k.START_OBJECT;
        String str = a6.f7195h;
        if (kVar != kVar2) {
            K0(kVar2, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", i.y(str), eVar.f5340j);
            throw null;
        }
        T1.k kVarB0 = eVar.B0();
        T1.k kVar3 = T1.k.FIELD_NAME;
        if (kVarB0 != kVar3) {
            K0(kVar3, "Current token not FIELD_NAME (to contain expected root name %s), but %s", i.y(str), eVar.f5340j);
            throw null;
        }
        String strQ = eVar.Q();
        if (!str.equals(strQ)) {
            MismatchedInputException mismatchedInputException = new MismatchedInputException((Closeable) this.f7252o, String.format("Root name (%s) does not match expected (%s) for type %s", i.y(strQ), i.c(str), i.r(hVar)));
            if (strQ == null) {
                throw mismatchedInputException;
            }
            mismatchedInputException.e(strQ, hVar.f7281k);
            throw mismatchedInputException;
        }
        eVar.B0();
        Object objDeserialize = jVar.deserialize(eVar, this);
        T1.k kVarB1 = eVar.B0();
        T1.k kVar4 = T1.k.END_OBJECT;
        if (kVarB1 == kVar4) {
            return objDeserialize;
        }
        K0(kVar4, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", i.c(str), eVar.f5340j);
        throw null;
    }

    @Override // p015c2.f
    public final j c0(Object obj) {
        j jVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof j) {
            jVar = (j) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == p015c2.i.class || i.t(cls)) {
                return null;
            }
            if (!j.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonDeserializer>");
            }
            C0474e c0474e = this.f7249l;
            c0474e.h();
            jVar = (j) i.h(cls, c0474e.k(r.CAN_OVERRIDE_ACCESS_MODIFIERS));
        }
        if (jVar instanceof m) {
            ((m) jVar).b(this);
        }
        return jVar;
    }

    @Override // p015c2.f
    public final p037g2.A j0(Object obj, d0 d0Var) {
        if (obj == null) {
            return null;
        }
        c0 c0VarD = d0Var.d(obj);
        LinkedHashMap linkedHashMap = this.f8922t;
        if (linkedHashMap == null) {
            this.f8922t = new LinkedHashMap();
        }
        ArrayList arrayList = this.f8923u;
        if (arrayList == null) {
            this.f8923u = new ArrayList(8);
            throw null;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw b.a(it);
        }
        throw null;
    }
}
