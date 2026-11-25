package p037g2;

import T1.i;
import java.util.Collection;
import java.util.Map;
import p012c.k;
import p015c2.C0474e;
import p015c2.f;
import p032f2.q;
import p032f2.r;

/* JADX INFO: loaded from: classes.dex */
public final class n extends q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f9148u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9149v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r f9150w;

    public n(r rVar, String str, r rVar2, boolean z5) {
        super(rVar);
        this.f9148u = str;
        this.f9150w = rVar2;
        this.f9149v = z5;
    }

    @Override // p032f2.q, p032f2.r
    public final Object A(Object obj, Object obj2) {
        if (obj2 != null) {
            boolean z5 = this.f9149v;
            r rVar = this.f9150w;
            if (!z5) {
                rVar.z(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        rVar.z(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object obj4 : (Collection) obj2) {
                    if (obj4 != null) {
                        rVar.z(obj4, obj);
                    }
                }
            } else {
                if (!(obj2 instanceof Map)) {
                    StringBuilder sb = new StringBuilder("Unsupported container type (");
                    sb.append(obj2.getClass().getName());
                    sb.append(") when resolving reference '");
                    throw new IllegalStateException(k.u(sb, this.f9148u, "'"));
                }
                for (Object obj5 : ((Map) obj2).values()) {
                    if (obj5 != null) {
                        rVar.z(obj5, obj);
                    }
                }
            }
        }
        return this.f8931t.A(obj, obj2);
    }

    @Override // p032f2.q
    public final r F(r rVar) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    @Override // p032f2.r
    public final void j(i iVar, f fVar, Object obj) {
        A(obj, this.f8931t.i(iVar, fVar));
    }

    @Override // p032f2.r
    public final Object k(i iVar, f fVar, Object obj) {
        return A(obj, i(iVar, fVar));
    }

    @Override // p032f2.q, p032f2.r
    public final void m(C0474e c0474e) {
        this.f8931t.m(c0474e);
        this.f9150w.m(c0474e);
    }

    @Override // p032f2.q, p032f2.r
    public final void z(Object obj, Object obj2) {
        A(obj, obj2);
    }
}
