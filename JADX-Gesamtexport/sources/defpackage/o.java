package defpackage;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import S4.F;
import android.content.Context;
import p084p4.x;
import p092r1.InterfaceC0886g;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f10613m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f10614n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, t tVar, d dVar) {
        super(2, dVar);
        this.f10613m = context;
        this.f10614n = tVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new o(this.f10613m, this.f10614n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((o) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f10612l;
        if (i == 0) {
            V.O(obj);
            Context context = this.f10613m;
            n nVar = new n(((InterfaceC0886g) u.f12605b.a(u.f12604a[0], context)).getData(), this.f10614n, 0);
            this.f10612l = 1;
            obj = F.i(nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        this.f10614n.f12219c = obj;
        return x.f10867a;
    }
}
