package D;

import P4.InterfaceC0335w;
import S1.V;
import kotlin.KotlinNothingValueException;
import p130y0.AbstractC1161v0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0056f f710n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, C0056f c0056f, p111u4.d dVar) {
        super(2, dVar);
        this.f709m = zVar;
        this.f710n = c0056f;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new y(this.f709m, this.f710n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((y) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
        return v4.a.f13292h;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f708l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            throw new KotlinNothingValueException();
        }
        V.O(obj);
        this.f708l = 1;
        AbstractC1161v0.a(this.f709m, this.f710n, this);
        return aVar;
    }
}
