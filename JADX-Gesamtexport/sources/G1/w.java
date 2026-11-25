package G1;

import B.U;
import F1.C0096m;
import N.C0209d0;
import P4.InterfaceC0335w;
import S1.V;
import p096s.AbstractC0909d;
import p096s.N;
import p096s.S;
import p096s.Z;
import p096s.o0;
import p096s.v0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f1666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0096m f1667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o0 f1668p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Z z5, C0096m c0096m, o0 o0Var, p111u4.d dVar) {
        super(2, dVar);
        this.f1666n = z5;
        this.f1667o = c0096m;
        this.f1668p = o0Var;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        w wVar = new w(this.f1666n, this.f1667o, this.f1668p, dVar);
        wVar.f1665m = obj;
        return wVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((w) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0088 A[RETURN] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        Object objA;
        v4.a aVar = v4.a.f13292h;
        int i = this.f1664l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i != 0) {
            if (i == 1) {
                V.O(obj);
                return xVar;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return xVar;
        }
        V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f1665m;
        Z z5 = this.f1666n;
        Object value = z5.f11917j.getValue();
        C0096m c0096m = this.f1667o;
        if (E4.k.a(value, c0096m)) {
            long jLongValue = ((Number) this.f1668p.f12066l.getValue()).longValue() / ((long) 1000000);
            C0209d0 c0209d0 = z5.f11922o;
            float fH = c0209d0.h();
            v0 v0VarK = AbstractC0909d.k((int) (c0209d0.h() * jLongValue), 6, null);
            U u6 = new U(interfaceC0335w, z5, c0096m, 2);
            this.f1664l = 2;
            if (AbstractC0909d.c(fH, 0.0f, v0VarK, u6, this, 4) == aVar) {
                return aVar;
            }
            return xVar;
        }
        this.f1664l = 1;
        o0 o0Var = z5.f11919l;
        if (o0Var == null) {
            objA = xVar;
        } else {
            objA = N.a(z5.f11925r, new S(o0Var, z5, c0096m, (p111u4.d) null), this);
            if (objA != aVar) {
                objA = xVar;
            }
        }
        if (objA == aVar) {
            return aVar;
        }
        return xVar;
    }
}
