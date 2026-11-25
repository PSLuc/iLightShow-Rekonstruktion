package p096s;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class U extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f11891m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Z z5, d dVar) {
        super(2, dVar);
        this.f11891m = z5;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new U(this.f11891m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((U) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11890l;
        if (i == 0) {
            V.O(obj);
            this.f11890l = 1;
            if (Z.r(this.f11891m, this) == aVar) {
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
