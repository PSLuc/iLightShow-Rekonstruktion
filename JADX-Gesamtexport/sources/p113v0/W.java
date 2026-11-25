package p113v0;

import D4.e;
import E4.l;
import N.AbstractC0234q;
import p084p4.x;
import p124x0.D;

/* JADX INFO: loaded from: classes.dex */
public final class W extends l implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13152h;
    public final /* synthetic */ X i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(X x6, int i) {
        super(2);
        this.f13152h = i;
        this.i = x6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f13152h) {
            case 0:
                this.i.a().i = (AbstractC0234q) obj2;
                break;
            case 1:
                B bA = this.i.a();
                ((D) obj).V(new C1041y(bA, (e) obj2, bA.f13128v));
                break;
            default:
                D d6 = (D) obj;
                B b6 = d6.f13830E;
                X x6 = this.i;
                if (b6 == null) {
                    x6.getClass();
                    b6 = new B(d6);
                    d6.f13830E = b6;
                }
                x6.f13153a = b6;
                x6.a().e();
                x6.a();
                break;
        }
        return x.f10867a;
    }
}
