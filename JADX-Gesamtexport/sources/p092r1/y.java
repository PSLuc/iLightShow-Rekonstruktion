package p092r1;

import D4.c;
import S1.V;
import p084p4.h;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class y extends i implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f11721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11722m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f11723n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(J j4, d dVar) {
        super(1, dVar);
        this.f11723n = j4;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        return new y(this.f11723n, (d) obj).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        Throwable th;
        U m6;
        a aVar = a.f13292h;
        int i = this.f11722m;
        J j4 = this.f11723n;
        try {
            if (i == 0) {
                V.O(obj);
                this.f11722m = 1;
                obj = J.f(j4, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = this.f11721l;
                    V.O(obj);
                    m6 = new M(th, ((Number) obj).intValue());
                    return new h(m6, Boolean.TRUE);
                }
                V.O(obj);
            }
            m6 = (U) obj;
        } catch (Throwable th2) {
            T tG = j4.g();
            this.f11721l = th2;
            this.f11722m = 2;
            Integer numA = tG.a();
            if (numA != aVar) {
                obj = numA;
                th = th2;
            }
            return aVar;
        }
        return new h(m6, Boolean.TRUE);
    }
}
