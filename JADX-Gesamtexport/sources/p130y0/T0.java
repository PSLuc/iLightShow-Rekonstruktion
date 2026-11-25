package p130y0;

import D.C0052b;
import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import S4.N;
import kotlin.KotlinNothingValueException;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f14304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1152q0 f14305n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(N n6, C1152q0 c1152q0, d dVar) {
        super(2, dVar);
        this.f14304m = n6;
        this.f14305n = c1152q0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new T0(this.f14304m, this.f14305n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((T0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
        return a.f13292h;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f14303l;
        if (i == 0) {
            V.O(obj);
            C0052b c0052b = new C0052b(4, this.f14305n);
            this.f14303l = 1;
            if (this.f14304m.a(c0052b, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        throw new KotlinNothingValueException();
    }
}
