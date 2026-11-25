package p101t;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import p129y.k;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class J extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K f12249m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k3, d dVar) {
        super(2, dVar);
        this.f12249m = k3;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new J(this.f12249m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((J) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12248l;
        if (i == 0) {
            V.O(obj);
            this.f12248l = 1;
            if (k.b(this.f12249m, null, this) == aVar) {
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
