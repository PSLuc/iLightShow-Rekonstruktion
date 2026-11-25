package p015c2;

import I1.b;
import T1.c;
import T1.d;
import T1.m;
import V1.g;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import p009b2.f;
import p009b2.k;
import p093r2.e;
import p093r2.h;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k f7331n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C f7332h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f7333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f7334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f7335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f7336m;

    static {
        String str = m.f5239e.f5505h;
        k kVar = new k(0);
        kVar.i = str;
        kVar.f7081j = m.f5238d;
        f7331n = kVar;
    }

    public y(u uVar, C c6, f fVar) {
        this.f7332h = c6;
        this.i = uVar.f7321k;
        this.f7333j = uVar.f7322l;
        this.f7334k = uVar.f7319h;
        this.f7335l = fVar == null ? w.i : new w(fVar);
        this.f7336m = x.f7328k;
    }

    public final h a() {
        h hVar = this.i;
        hVar.getClass();
        return new h(hVar, this.f7332h, this.f7333j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Y1.f fVar, l lVar) throws IOException {
        boolean zP = this.f7332h.p(D.CLOSE_CLOSEABLE);
        x xVar = this.f7336m;
        if (!zP || !(lVar instanceof Closeable)) {
            try {
                xVar.a(fVar, lVar, a());
                fVar.close();
                return;
            } catch (Exception e6) {
                Annotation[] annotationArr = i.f12697a;
                fVar.A0(d.AUTO_CLOSE_JSON_CONTENT);
                try {
                    fVar.close();
                } catch (Exception e7) {
                    e6.addSuppressed(e7);
                }
                i.D(e6);
                i.E(e6);
                throw new RuntimeException(e6);
            }
        }
        Closeable closeable = (Closeable) lVar;
        try {
            xVar.a(fVar, lVar, a());
            try {
                closeable.close();
                fVar.close();
            } catch (Exception e8) {
                e = e8;
                closeable = null;
                i.g(fVar, closeable, e);
                throw null;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final Y1.f c(g gVar) {
        c cVar = this.f7334k;
        cVar.getClass();
        Y1.f fVar = new Y1.f(new b(cVar.c(), new V1.c(gVar, true), false), cVar.f5164k, cVar.f5165l, gVar, cVar.f5167n);
        V1.h hVar = cVar.f5166m;
        if (hVar != c.f5161r) {
            fVar.f5816q = hVar;
        }
        this.f7332h.n(fVar);
        m fVar2 = this.f7335l.f7327h;
        if (fVar2 != null) {
            if (fVar2 == f7331n) {
                fVar.f5181h = null;
            } else {
                if (fVar2 instanceof p009b2.g) {
                    fVar2 = new f((f) ((p009b2.g) fVar2));
                }
                fVar.f5181h = fVar2;
            }
        }
        return fVar;
    }

    public final String d(l lVar) throws JsonProcessingException {
        g gVar = new g(this.f7334k.c());
        try {
            b(c(gVar), lVar);
            p009b2.m mVar = (p009b2.m) gVar.i;
            String strG = mVar.g();
            mVar.m();
            return strG;
        } catch (JsonProcessingException e6) {
            throw e6;
        } catch (IOException e7) {
            throw JsonMappingException.g(e7);
        }
    }

    public y(u uVar, C c6) {
        this.f7332h = c6;
        this.i = uVar.f7321k;
        this.f7333j = uVar.f7322l;
        this.f7334k = uVar.f7319h;
        this.f7335l = w.i;
        this.f7336m = x.f7328k;
    }
}
