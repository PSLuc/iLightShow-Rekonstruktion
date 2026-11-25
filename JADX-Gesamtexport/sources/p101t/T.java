package p101t;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class T extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U f12273m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u6, d dVar) {
        super(2, dVar);
        this.f12273m = u6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new T(this.f12273m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((T) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12272l;
        if (i == 0) {
            V.O(obj);
            this.f12272l = 1;
            if (U.z0(this.f12273m, this) == aVar) {
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
