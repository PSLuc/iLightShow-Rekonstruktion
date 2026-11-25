package p092r1;

import D4.e;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f11582n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j4, d dVar) {
        super(2, dVar);
        this.f11582n = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        G g6 = new G(this.f11582n, dVar);
        g6.f11581m = obj;
        return g6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((G) b((L) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11580l;
        if (i == 0) {
            V.O(obj);
            L l6 = (L) this.f11581m;
            this.f11580l = 1;
            if (J.c(this.f11582n, l6, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return x.f10867a;
    }
}
