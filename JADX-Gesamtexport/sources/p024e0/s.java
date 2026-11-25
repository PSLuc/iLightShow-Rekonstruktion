package p024e0;

import D4.a;
import E4.l;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class s extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8676h;
    public final /* synthetic */ r i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(r rVar, int i) {
        super(0);
        this.f8676h = i;
        this.i = rVar;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f8676h) {
            case 0:
                this.i.y0();
                break;
            default:
                r rVar = this.i;
                if (rVar.f5958h.f5969t) {
                    d.A(rVar);
                }
                break;
        }
        return x.f10867a;
    }
}
