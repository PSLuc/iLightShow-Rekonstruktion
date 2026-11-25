package p123x;

import D4.e;
import E4.l;
import N.C0208d;
import N.C0230o;
import Z.o;
import p084p4.x;

/* JADX INFO: renamed from: x.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1081n extends l implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f13786h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1081n(o oVar, int i) {
        super(2);
        this.f13786h = oVar;
        this.i = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0208d.V(this.i | 1);
        AbstractC1084q.a(this.f13786h, (C0230o) obj, iV);
        return x.f10867a;
    }
}
