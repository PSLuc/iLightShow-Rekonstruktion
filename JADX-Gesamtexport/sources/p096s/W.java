package p096s;

import D4.c;
import P4.AbstractC0336x;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class W extends i implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f11900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f11901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f11902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o0 f11903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f11904q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Object obj, Object obj2, Z z5, o0 o0Var, float f6, d dVar) {
        super(1, dVar);
        this.f11900m = obj;
        this.f11901n = obj2;
        this.f11902o = z5;
        this.f11903p = o0Var;
        this.f11904q = f6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        o0 o0Var = this.f11903p;
        float f6 = this.f11904q;
        return new W(this.f11900m, this.f11901n, this.f11902o, o0Var, f6, (d) obj).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11899l;
        if (i == 0) {
            V.O(obj);
            V v6 = new V(this.f11900m, this.f11901n, this.f11902o, this.f11903p, this.f11904q, null);
            this.f11899l = 1;
            if (AbstractC0336x.d(v6, this) == aVar) {
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
