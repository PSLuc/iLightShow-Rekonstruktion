package p101t;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p117w.j;
import p117w.m;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: t.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0934b extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f12292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f12293n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934b(m mVar, j jVar, d dVar) {
        super(2, dVar);
        this.f12292m = mVar;
        this.f12293n = jVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0934b(this.f12292m, this.f12293n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0934b) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12291l;
        if (i == 0) {
            V.O(obj);
            this.f12291l = 1;
            if (this.f12292m.a(this.f12293n, this) == aVar) {
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
