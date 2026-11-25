package p096s;

import D4.c;
import D4.e;
import E4.k;
import N.InterfaceC0203a0;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: s.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0911e extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f11974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0907c f11975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f11976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f11977p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0911e(Object obj, C0907c c0907c, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, d dVar) {
        super(2, dVar);
        this.f11974m = obj;
        this.f11975n = c0907c;
        this.f11976o = interfaceC0203a0;
        this.f11977p = interfaceC0203a1;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0911e(this.f11974m, this.f11975n, this.f11976o, this.f11977p, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0911e) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11973l;
        C0907c c0907c = this.f11975n;
        if (i == 0) {
            V.O(obj);
            Object value = c0907c.f11955e.getValue();
            Object obj2 = this.f11974m;
            if (!k.a(obj2, value)) {
                C0906b0 c0906b0 = AbstractC0914g.f11997a;
                InterfaceC0918k interfaceC0918k = (InterfaceC0918k) this.f11976o.getValue();
                this.f11973l = 1;
                if (C0907c.a(c0907c, obj2, interfaceC0918k, this) == aVar) {
                    return aVar;
                }
            }
            return x.f10867a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        V.O(obj);
        C0906b0 c0906b1 = AbstractC0914g.f11997a;
        c cVar = (c) this.f11977p.getValue();
        if (cVar != null) {
            cVar.invoke(c0907c.c());
        }
        return x.f10867a;
    }
}
