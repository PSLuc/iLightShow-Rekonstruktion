package p112v;

import D4.a;
import E4.l;
import R4.b;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class F extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12809h;
    public final /* synthetic */ M i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(M m6, int i) {
        super(0);
        this.f12809h = i;
        this.i = m6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f12809h) {
            case 0:
                b bVar = this.i.f12859A;
                if (bVar != null) {
                    bVar.j(C0999q.f13051a);
                }
                return x.f10867a;
            default:
                return Boolean.valueOf(!this.i.I0());
        }
    }
}
