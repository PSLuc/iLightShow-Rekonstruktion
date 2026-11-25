package p092r1;

import D4.e;
import S1.V;
import S4.InterfaceC0369f;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: r1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0892m extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J f11679m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0892m(J j4, d dVar) {
        super(2, dVar);
        this.f11679m = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0892m(this.f11679m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0892m) b((InterfaceC0369f) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11678l;
        if (i == 0) {
            V.O(obj);
            this.f11678l = 1;
            if (J.d(this.f11679m, this) == aVar) {
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
