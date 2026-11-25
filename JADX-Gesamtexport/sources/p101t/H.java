package p101t;

import D4.e;
import P4.E;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p117w.l;
import p117w.m;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class H extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f12243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f12244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E f12245o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(m mVar, l lVar, E e6, d dVar) {
        super(2, dVar);
        this.f12243m = mVar;
        this.f12244n = lVar;
        this.f12245o = e6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new H(this.f12243m, this.f12244n, this.f12245o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((H) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12242l;
        if (i == 0) {
            V.O(obj);
            this.f12242l = 1;
            if (this.f12243m.a(this.f12244n, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        E e6 = this.f12245o;
        if (e6 != null) {
            e6.a();
        }
        return x.f10867a;
    }
}
