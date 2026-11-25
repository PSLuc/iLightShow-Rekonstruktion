package B;

import N.InterfaceC0203a0;
import P4.AbstractC0336x;
import p112v.C0968a0;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends p122w4.i implements D4.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ C0968a0 f214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ long f215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ U4.d f216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p117w.m f218q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(U4.d dVar, InterfaceC0203a0 interfaceC0203a0, p117w.m mVar, p111u4.d dVar2) {
        super(3, dVar2);
        this.f216o = dVar;
        this.f217p = interfaceC0203a0;
        this.f218q = mVar;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j4 = ((p030f0.c) obj2).f8837a;
        Q0 q6 = new Q0(this.f216o, this.f217p, this.f218q, (p111u4.d) obj3);
        q6.f214m = (C0968a0) obj;
        q6.f215n = j4;
        return q6.o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f213l;
        U4.d dVar = this.f216o;
        if (i == 0) {
            S1.V.O(obj);
            C0968a0 c0968a0 = this.f214m;
            AbstractC0336x.o(dVar, null, new O0(this.f217p, this.f215n, this.f218q, null), 3);
            this.f213l = 1;
            obj = c0968a0.d(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        AbstractC0336x.o(dVar, null, new P0(this.f217p, ((Boolean) obj).booleanValue(), this.f218q, null), 3);
        return p084p4.x.f10867a;
    }
}
