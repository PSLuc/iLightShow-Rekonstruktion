package H1;

import B.AbstractC0013g0;
import E4.k;
import F1.AbstractC0087d;
import F1.S;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p081p0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y4.a f1763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z2.f f1765g = f5.a.f9006a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f1766h = new LinkedHashMap();
    public int i = -1;

    public f(Y4.a aVar, LinkedHashMap linkedHashMap) {
        this.f1763e = aVar;
        this.f1764f = linkedHashMap;
    }

    public final void P0(Object obj) {
        String strF = this.f1763e.getDescriptor().f(this.i);
        S s6 = (S) this.f1764f.get(strF);
        if (s6 == null) {
            throw new IllegalStateException(AbstractC0013g0.i("Cannot find NavType for argument ", strF, ". Please provide NavType through typeMap.").toString());
        }
        this.f1766h.put(strF, s6 instanceof AbstractC0087d ? ((AbstractC0087d) s6).h(obj) : d0.v(s6.f(obj)));
    }

    @Override // p081p0.c
    public final void a0(a5.g gVar, int i) {
        k.f("descriptor", gVar);
        this.i = i;
    }

    @Override // b5.d
    public final Z2.f c() {
        return this.f1765g;
    }

    @Override // b5.d
    public final void e() {
        P0(null);
    }

    @Override // p081p0.c
    public final void h0(Object obj) {
        k.f("value", obj);
        P0(obj);
    }

    @Override // p081p0.c, b5.d
    public final void r(Y4.a aVar, Object obj) {
        k.f("serializer", aVar);
        P0(obj);
    }
}
