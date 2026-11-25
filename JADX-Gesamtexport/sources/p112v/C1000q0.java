package p112v;

import D4.e;
import S1.V;
import p030f0.c;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1000q0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f13053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1001r0 f13054n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1000q0(C1001r0 c1001r0, d dVar) {
        super(2, dVar);
        this.f13054n = c1001r0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C1000q0 c1000q0 = new C1000q0(this.f13054n, dVar);
        c1000q0.f13053m = ((c) obj).f8837a;
        return c1000q0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        long j4 = ((c) obj).f8837a;
        C1000q0 c1000q0 = new C1000q0(this.f13054n, (d) obj2);
        c1000q0.f13053m = j4;
        return c1000q0.o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f13052l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return obj;
        }
        V.O(obj);
        long j4 = this.f13053m;
        C1017z0 c1017z0 = this.f13054n.I;
        this.f13052l = 1;
        Object objA = androidx.compose.foundation.gestures.a.a(c1017z0, j4, this);
        return objA == aVar ? aVar : objA;
    }
}
