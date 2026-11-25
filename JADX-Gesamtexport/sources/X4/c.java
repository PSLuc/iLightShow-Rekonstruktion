package X4;

import O1.C0308a;
import P4.C0319f;
import P4.InterfaceC0318e;
import P4.p0;
import U4.r;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0318e, p0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0319f f5769h;
    public final /* synthetic */ d i;

    public c(d dVar, C0319f c0319f) {
        this.i = dVar;
        this.f5769h = c0319f;
    }

    @Override // P4.p0
    public final void b(r rVar, int i) {
        this.f5769h.b(rVar, i);
    }

    @Override // p111u4.d
    public final p111u4.i e() {
        return this.f5769h.f4651l;
    }

    @Override // p111u4.d
    public final void g(Object obj) {
        this.f5769h.g(obj);
    }

    @Override // P4.InterfaceC0318e
    public final C0308a h(Object obj, D4.c cVar) {
        d dVar = this.i;
        b bVar = new b(dVar, this, 1);
        C0308a c0308aH = this.f5769h.h((x) obj, bVar);
        if (c0308aH != null) {
            d.f5770g.set(dVar, null);
        }
        return c0308aH;
    }

    @Override // P4.InterfaceC0318e
    public final boolean i(Throwable th) {
        return this.f5769h.i(th);
    }

    @Override // P4.InterfaceC0318e
    public final void r(Object obj) {
        this.f5769h.r(obj);
    }
}
