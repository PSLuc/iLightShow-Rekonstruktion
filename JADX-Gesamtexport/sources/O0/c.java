package O0;

import B.C0031p0;
import L0.p;
import L0.r;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class c extends E4.l implements D4.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f4391h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(4);
        this.f4391h = dVar;
    }

    @Override // D4.g
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = ((L0.i) obj3).f3023a;
        d dVar = this.f4391h;
        r rVarB = ((L0.e) dVar.f4395l).b((p) obj, (L0.k) obj2, i, ((L0.j) obj4).f3024a);
        if (rVarB instanceof r) {
            Object obj5 = rVarB.f3038h;
            E4.k.d("null cannot be cast to non-null type android.graphics.Typeface", obj5);
            return (Typeface) obj5;
        }
        C0031p0 c0031p0 = new C0031p0(rVarB, dVar.f4400q);
        dVar.f4400q = c0031p0;
        Object obj6 = c0031p0.f395k;
        E4.k.d("null cannot be cast to non-null type android.graphics.Typeface", obj6);
        return (Typeface) obj6;
    }
}
