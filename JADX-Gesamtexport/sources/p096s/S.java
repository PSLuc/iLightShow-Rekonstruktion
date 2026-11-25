package p096s;

import D4.c;
import N.C0217h0;
import P4.AbstractC0336x;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class S extends i implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11881l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f11883n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f11884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o0 f11885p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Z z5, Object obj, o0 o0Var, d dVar) {
        super(1, dVar);
        this.f11883n = z5;
        this.f11884o = obj;
        this.f11885p = o0Var;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f11881l) {
            case 0:
                return new S(this.f11885p, this.f11883n, this.f11884o, dVar).o(x.f10867a);
            default:
                return new S(this.f11883n, this.f11884o, this.f11885p, dVar).o(x.f10867a);
        }
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        float f6;
        switch (this.f11881l) {
            case 0:
                a aVar = a.f13292h;
                int i = this.f11882m;
                o0 o0Var = this.f11885p;
                if (i == 0) {
                    V.O(obj);
                    Q q6 = new Q(this.f11883n, this.f11884o, o0Var, null);
                    this.f11882m = 1;
                    if (AbstractC0336x.d(q6, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V.O(obj);
                }
                o0Var.i();
                return x.f10867a;
            default:
                a aVar2 = a.f13292h;
                int i3 = this.f11882m;
                o0 o0Var2 = this.f11885p;
                if (i3 == 0) {
                    V.O(obj);
                    Z z5 = this.f11883n;
                    z5.v();
                    z5.f11926s = Long.MIN_VALUE;
                    z5.y(0.0f);
                    Object value = z5.f11917j.getValue();
                    Object obj2 = this.f11884o;
                    boolean zEquals = obj2.equals(value);
                    C0217h0 c0217h0 = z5.i;
                    if (zEquals) {
                        f6 = -4.0f;
                    } else {
                        f6 = obj2.equals(c0217h0.getValue()) ? -5.0f : -3.0f;
                    }
                    o0Var2.q(obj2);
                    o0Var2.o(0L);
                    c0217h0.setValue(obj2);
                    z5.y(0.0f);
                    z5.m(obj2);
                    o0Var2.j(f6);
                    if (f6 == -3.0f) {
                        this.f11882m = 1;
                        if (Z.t(z5, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V.O(obj);
                }
                o0Var2.i();
                return x.f10867a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(o0 o0Var, Z z5, Object obj, d dVar) {
        super(1, dVar);
        this.f11885p = o0Var;
        this.f11883n = z5;
        this.f11884o = obj;
    }
}
