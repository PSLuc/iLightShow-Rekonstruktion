package B;

import N.C0208d;
import N.C0230o;

/* JADX INFO: renamed from: B.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0004c extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z.o f291h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f292j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004c(Z.o oVar, int i, int i3) {
        super(2);
        this.f291h = oVar;
        this.i = i;
        this.f292j = i3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0208d.V(this.i | 1);
        int i = this.f292j;
        AbstractC0012g.b(this.f291h, (C0230o) obj, iV, i);
        return p084p4.x.f10867a;
    }
}
