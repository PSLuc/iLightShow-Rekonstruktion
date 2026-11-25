package B;

import N.C0208d;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class V extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ F.P f245h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f246j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(F.P p6, boolean z5, int i) {
        super(2);
        this.f245h = p6;
        this.i = z5;
        this.f246j = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0208d.V(this.f246j | 1);
        AbstractC0029o0.h(this.f245h, this.i, (C0230o) obj, iV);
        return p084p4.x.f10867a;
    }
}
