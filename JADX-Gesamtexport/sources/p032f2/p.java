package p032f2;

import T1.i;
import T1.k;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.io.Serializable;
import p015c2.C0471b;
import p015c2.f;
import p015c2.h;
import p015c2.j;
import p015c2.q;
import p046i2.AbstractC0771g;
import p046i2.C0769e;
import p071n2.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0471b f8926h;
    public final AbstractC0771g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f8927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f8928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f8929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f8930m;

    public p(C0471b c0471b, AbstractC0771g abstractC0771g, h hVar, q qVar, j jVar, d dVar) {
        this.f8926h = c0471b;
        this.i = abstractC0771g;
        this.f8927j = hVar;
        this.f8928k = jVar;
        this.f8929l = dVar;
        this.f8930m = qVar;
        boolean z5 = abstractC0771g instanceof C0769e;
    }

    public abstract void a(Object obj, Object obj2, Object obj3);

    public Object b(i iVar, f fVar) {
        boolean zS0 = iVar.s0(k.VALUE_NULL);
        j jVar = this.f8928k;
        if (zS0) {
            return jVar.getNullValue(fVar);
        }
        d dVar = this.f8929l;
        return dVar != null ? jVar.deserializeWithType(iVar, fVar, dVar) : jVar.deserialize(iVar, fVar);
    }

    public void c(i iVar, f fVar, Object obj, String str) throws IOException {
        try {
            q qVar = this.f8930m;
            d(obj, qVar == null ? str : qVar.a(fVar, str), b(iVar, fVar));
        } catch (UnresolvedForwardReference e6) {
            if (this.f8928k.getObjectIdReader() == null) {
                throw new JsonMappingException(iVar, "Unresolved forward reference but no identity info.", e6);
            }
            Class cls = this.f8927j.f7281k;
            throw null;
        }
    }

    public final void d(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            a(obj, obj2, obj3);
        } catch (IOException e6) {
            throw e6;
        } catch (Exception e7) {
            if (!(e7 instanceof IllegalArgumentException)) {
                p109u2.i.D(e7);
                p109u2.i.E(e7);
                Throwable thQ = p109u2.i.q(e7);
                throw new JsonMappingException(null, p109u2.i.i(thQ), thQ);
            }
            String strF = p109u2.i.f(obj3);
            StringBuilder sb = new StringBuilder("Problem deserializing \"any-property\" '");
            sb.append(obj2);
            sb.append("' of class " + p109u2.i.z(this.i.n()) + " (expected type: ");
            sb.append(this.f8927j);
            sb.append("; actual type: ");
            sb.append(strF);
            sb.append(")");
            String strI = p109u2.i.i(e7);
            if (strI != null) {
                sb.append(", problem: ");
                sb.append(strI);
            } else {
                sb.append(" (no error message provided)");
            }
            throw new JsonMappingException(null, sb.toString(), e7);
        }
    }

    public abstract p e(j jVar);

    public final String toString() {
        return "[any property on class " + p109u2.i.z(this.i.n()) + "]";
    }
}
