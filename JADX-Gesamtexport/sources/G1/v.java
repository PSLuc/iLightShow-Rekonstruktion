package G1;

import F1.C0096m;
import P4.InterfaceC0335w;
import S1.V;
import p096s.N;
import p096s.S;
import p096s.Z;
import p096s.o0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f1662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0096m f1663o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(float f6, Z z5, C0096m c0096m, p111u4.d dVar) {
        super(2, dVar);
        this.f1661m = f6;
        this.f1662n = z5;
        this.f1663o = c0096m;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new v(this.f1661m, this.f1662n, this.f1663o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((v) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    @Override // p122w4.a
    public final Object o(Object obj) {
        Object objA;
        v4.a aVar = v4.a.f13292h;
        int i = this.f1660l;
        p084p4.x xVar = p084p4.x.f10867a;
        Z z5 = this.f1662n;
        float f6 = this.f1661m;
        if (i == 0) {
            V.O(obj);
            if (f6 > 0.0f) {
                this.f1660l = 1;
                if (z5.w(f6, z5.i.getValue(), this) != aVar) {
                }
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return xVar;
        }
        V.O(obj);
        if (f6 == 0.0f) {
            this.f1660l = 2;
            o0 o0Var = z5.f11919l;
            if (o0Var == null) {
                objA = xVar;
            } else {
                Object value = z5.f11917j.getValue();
                C0096m c0096m = this.f1663o;
                if (E4.k.a(value, c0096m) && E4.k.a(z5.i.getValue(), c0096m)) {
                    objA = xVar;
                } else {
                    objA = N.a(z5.f11925r, new S(z5, c0096m, o0Var, (p111u4.d) null), this);
                    if (objA != aVar) {
                        objA = xVar;
                    }
                }
            }
            if (objA == aVar) {
                return aVar;
            }
        }
        return xVar;
    }
}
