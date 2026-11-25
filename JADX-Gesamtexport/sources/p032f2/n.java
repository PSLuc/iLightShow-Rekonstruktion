package p032f2;

import B.AbstractC0013g0;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import p012c.k;
import p015c2.A;
import p015c2.C0471b;
import p015c2.f;
import p015c2.h;
import p015c2.j;
import p015c2.q;
import p046i2.AbstractC0771g;
import p046i2.C0769e;
import p071n2.d;
import p087q2.m;
import p087q2.r;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8924n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Serializable f8925o;

    public n(C0471b c0471b, AbstractC0771g abstractC0771g, h hVar, q qVar, j jVar, d dVar, s sVar) {
        super(c0471b, abstractC0771g, hVar, qVar, jVar, dVar);
        this.f8925o = sVar;
    }

    @Override // p032f2.p
    public final void a(Object obj, Object obj2, Object obj3) throws JsonMappingException {
        switch (this.f8924n) {
            case 0:
                f(obj, (String) obj2, (JsonNode) obj3);
                return;
            default:
                C0769e c0769e = (C0769e) this.i;
                Map map = (Map) c0769e.q(obj);
                if (map == null) {
                    s sVar = (s) this.f8925o;
                    if (sVar == null) {
                        throw new JsonMappingException(null, AbstractC0013g0.j("Cannot create an instance of ", i.z(this.f8927j.f7281k), " for use as \"any-setter\" '", ((A) this.f8926h.f7238h).f7195h, "'"));
                    }
                    map = (Map) sVar.v(null);
                    c0769e.u(obj, map);
                }
                map.put(obj2, obj3);
                return;
        }
    }

    @Override // p032f2.p
    public Object b(T1.i iVar, f fVar) {
        switch (this.f8924n) {
            case 0:
                return this.f8928k.deserialize(iVar, fVar);
            default:
                return super.b(iVar, fVar);
        }
    }

    @Override // p032f2.p
    public void c(T1.i iVar, f fVar, Object obj, String str) throws IOException {
        switch (this.f8924n) {
            case 0:
                f(obj, str, (JsonNode) this.f8928k.deserialize(iVar, fVar));
                break;
            default:
                super.c(iVar, fVar, obj, str);
                break;
        }
    }

    @Override // p032f2.p
    public final p e(j jVar) {
        switch (this.f8924n) {
            case 0:
                return this;
            default:
                return new n(this.f8926h, this.i, this.f8927j, this.f8930m, jVar, this.f8929l, (s) this.f8925o);
        }
    }

    public void f(Object obj, String str, JsonNode jsonNode) throws JsonMappingException {
        r rVar;
        C0769e c0769e = (C0769e) this.i;
        Object objQ = c0769e.q(obj);
        if (objQ == null) {
            m mVar = (m) this.f8925o;
            mVar.getClass();
            rVar = new r(mVar);
            c0769e.u(obj, rVar);
        } else {
            if (!(objQ instanceof r)) {
                throw new JsonMappingException(null, k.s("Value \"any-setter\" '", ((A) this.f8926h.f7238h).f7195h, "' not `ObjectNode` but ", i.z(objQ.getClass())));
            }
            rVar = (r) objQ;
        }
        rVar.w(str, jsonNode);
    }

    public n(C0471b c0471b, C0769e c0769e, h hVar, j jVar, m mVar) {
        super(c0471b, c0769e, hVar, null, jVar, null);
        this.f8925o = mVar;
    }
}
