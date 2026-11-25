package p112v;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p081p0.c;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0998p0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1001r0 f13048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f13049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f13050o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0998p0(C1001r0 c1001r0, float f6, float f7, d dVar) {
        super(2, dVar);
        this.f13048m = c1001r0;
        this.f13049n = f6;
        this.f13050o = f7;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0998p0(this.f13048m, this.f13049n, this.f13050o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0998p0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f13047l;
        if (i == 0) {
            V.O(obj);
            C1017z0 c1017z0 = this.f13048m.I;
            long jY = c.y(this.f13049n, this.f13050o);
            this.f13047l = 1;
            if (androidx.compose.foundation.gestures.a.a(c1017z0, jY, this) == aVar) {
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
