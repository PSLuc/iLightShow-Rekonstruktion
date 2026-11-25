package p092r1;

import D4.c;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: r1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897s extends i implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f11696m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0897s(C c6, d dVar) {
        super(1, dVar);
        this.f11696m = c6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        return new C0897s(this.f11696m, (d) obj).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11695l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return obj;
        }
        V.O(obj);
        this.f11695l = 1;
        Object objInvoke = this.f11696m.invoke(this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
