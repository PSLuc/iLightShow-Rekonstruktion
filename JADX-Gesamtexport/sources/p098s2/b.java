package p098s2;

import K.y;
import T1.e;
import T1.k;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.AbstractC0532c;
import java.io.IOException;
import java.util.Set;
import p003a2.a;
import p015c2.D;
import p015c2.E;
import p015c2.o;
import p093r2.c;
import p109u2.s;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0532c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0532c f12161q;

    public b(b bVar, Set set, Set set2) {
        super(bVar, set, set2);
        this.f12161q = bVar;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c f() {
        return this;
    }

    @Override // p015c2.o
    public final boolean isUnwrappingSerializer() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c j(Set set, Set set2) {
        return new b(this, set, set2);
    }

    @Override // p015c2.o
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final AbstractC0532c withFilterId(Object obj) {
        return new b(this, this.f7715n, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c l(y yVar) {
        return this.f12161q.l(yVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c m(p093r2.b[] bVarArr, p093r2.b[] bVarArr2) {
        return this;
    }

    public final void n(Object obj, e eVar, E e6) throws IOException {
        if (this.f7711j != null) {
            e6.getClass();
        }
        p093r2.b[] bVarArr = this.i;
        int i = 0;
        try {
            int length = bVarArr.length;
            while (i < length) {
                p093r2.b bVar = bVarArr[i];
                if (bVar == null) {
                    eVar.V();
                } else {
                    bVar.m(obj, eVar, e6);
                }
                i++;
            }
        } catch (Exception e7) {
            wrapAndThrow(e6, e7, obj, bVarArr[i].f11732j.f5505h);
        } catch (StackOverflowError e8) {
            JsonMappingException jsonMappingException = new JsonMappingException(eVar, "Infinite recursion (StackOverflowError)", e8);
            jsonMappingException.e(bVarArr[i].f11732j.f5505h, obj);
            throw jsonMappingException;
        }
    }

    @Override // p015c2.o
    public final void serialize(Object obj, e eVar, E e6) throws IOException {
        if (e6.f7226j.p(D.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && this.i.length == 1) {
            n(obj, eVar, e6);
            return;
        }
        eVar.m0(obj);
        n(obj, eVar, e6);
        eVar.L();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c, p015c2.o
    public final void serializeWithType(Object obj, e eVar, E e6, p071n2.e eVar2) throws IOException {
        if (this.f7715n != null) {
            c(obj, eVar, e6, eVar2);
            return;
        }
        a aVarE = e(eVar2, obj, k.START_ARRAY);
        eVar2.e(eVar, aVarE);
        eVar.C(obj);
        n(obj, eVar, e6);
        eVar2.f(eVar, aVarE);
    }

    public final String toString() {
        return "BeanAsArraySerializer for ".concat(handledType().getName());
    }

    @Override // p015c2.o
    public final o unwrappingSerializer(s sVar) {
        return this.f12161q.unwrappingSerializer(sVar);
    }

    public b(b bVar, y yVar, Object obj) {
        super(bVar, yVar, obj);
        this.f12161q = bVar;
    }

    public b(c cVar) {
        super(cVar, (y) null, cVar.f7713l);
        this.f12161q = cVar;
    }
}
