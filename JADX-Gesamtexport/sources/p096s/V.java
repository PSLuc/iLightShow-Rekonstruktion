package p096s;

import D4.e;
import E4.k;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class V extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11892l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f11894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f11895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f11896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o0 f11897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f11898r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Object obj, Object obj2, Z z5, o0 o0Var, float f6, d dVar) {
        super(2, dVar);
        this.f11894n = obj;
        this.f11895o = obj2;
        this.f11896p = z5;
        this.f11897q = o0Var;
        this.f11898r = f6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        V v6 = new V(this.f11894n, this.f11895o, this.f11896p, this.f11897q, this.f11898r, dVar);
        v6.f11893m = obj;
        return v6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((V) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11892l;
        x xVar = x.f10867a;
        Z z5 = this.f11896p;
        if (i == 0) {
            S1.V.O(obj);
            InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f11893m;
            Object obj2 = this.f11894n;
            Object obj3 = this.f11895o;
            if (k.a(obj2, obj3)) {
                z5.f11928u = null;
                if (k.a(z5.f11917j.getValue(), obj2)) {
                    return xVar;
                }
            } else {
                Z.p(z5);
            }
            boolean zA = k.a(obj2, obj3);
            float f6 = this.f11898r;
            if (!zA) {
                o0 o0Var = this.f11897q;
                o0Var.q(obj2);
                o0Var.o(0L);
                z5.i.setValue(obj2);
                o0Var.j(f6);
            }
            z5.y(f6);
            if (z5.f11927t.f10795b != 0) {
                AbstractC0336x.o(interfaceC0335w, null, new U(z5, null), 3);
            } else {
                z5.f11926s = Long.MIN_VALUE;
            }
            this.f11892l = 1;
            if (Z.t(z5, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        z5.x();
        return xVar;
    }
}
