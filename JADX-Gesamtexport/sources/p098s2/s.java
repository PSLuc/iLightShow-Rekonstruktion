package p098s2;

import K.y;
import S1.d0;
import T1.e;
import V1.h;
import com.fasterxml.jackson.core.JsonGenerationException;
import p015c2.E;
import p015c2.o;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f12193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12195c = false;

    public s(d0 d0Var) {
        this.f12193a = d0Var;
    }

    public final void a(e eVar, E e6, y yVar) {
        this.f12195c = true;
        if (eVar.k()) {
            Object obj = this.f12194b;
            eVar.g0(obj == null ? null : String.valueOf(obj));
            return;
        }
        h hVar = (h) yVar.f2033d;
        if (hVar != null) {
            eVar.Q(hVar);
            ((o) yVar.f2034e).serialize(this.f12194b, eVar, e6);
        }
    }

    public final boolean b(e eVar, E e6, y yVar) throws JsonGenerationException {
        if (this.f12194b == null) {
            return false;
        }
        if (!this.f12195c && !yVar.f2031b) {
            return false;
        }
        if (eVar.k()) {
            String.valueOf(this.f12194b);
            throw new JsonGenerationException("No native support for writing Object Ids", eVar);
        }
        ((o) yVar.f2034e).serialize(this.f12194b, eVar, e6);
        return true;
    }
}
