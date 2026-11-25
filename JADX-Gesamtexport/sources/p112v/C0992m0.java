package p112v;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0992m0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1001r0 f13029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f13030n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0992m0(C1001r0 c1001r0, long j4, d dVar) {
        super(2, dVar);
        this.f13029m = c1001r0;
        this.f13030n = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0992m0(this.f13029m, this.f13030n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0992m0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f13028l;
        if (i == 0) {
            V.O(obj);
            C1017z0 c1017z0 = this.f13029m.I;
            C0990l0 c0990l0 = new C0990l0(this.f13030n, null);
            this.f13028l = 1;
            if (c1017z0.e(2, c0990l0, this) == aVar) {
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
