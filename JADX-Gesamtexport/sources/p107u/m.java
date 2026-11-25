package p107u;

import D4.a;
import D4.c;
import E4.l;
import p084p4.e;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class m extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12639h = 1;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f12640j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c cVar, boolean z5) {
        super(0);
        this.f12640j = cVar;
        this.i = z5;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [D4.a, E4.l] */
    @Override // D4.a
    public final Object invoke() {
        switch (this.f12639h) {
            case 0:
                if (this.i) {
                    ((l) this.f12640j).invoke();
                }
                break;
            default:
                ((c) this.f12640j).invoke(Boolean.valueOf(!this.i));
                break;
        }
        return x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(boolean z5, a aVar) {
        super(0);
        this.i = z5;
        this.f12640j = (l) aVar;
    }
}
