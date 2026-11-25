package p092r1;

import D.C0052b;
import D4.e;
import P4.C0325l;
import P4.InterfaceC0335w;
import S1.V;
import S4.F;
import S4.InterfaceC0368e;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: r1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0900v extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J f11709m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0900v(J j4, d dVar) {
        super(2, dVar);
        this.f11709m = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0900v(this.f11709m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0900v) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        a aVar = a.f13292h;
        int i = this.f11708l;
        x xVar = x.f10867a;
        J j4 = this.f11709m;
        if (i == 0) {
            V.O(obj);
            this.f11708l = 1;
            Object objD0 = ((C0325l) j4.i.f1757h).d0(this);
            if (objD0 != aVar) {
                objD0 = xVar;
            }
            if (objD0 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return xVar;
        }
        V.O(obj);
        InterfaceC0368e interfaceC0368eE = F.e(j4.g().f11631c, -1);
        C0052b c0052b = new C0052b(3, j4);
        this.f11708l = 2;
        return interfaceC0368eE.a(c0052b, this) == aVar ? aVar : xVar;
    }
}
