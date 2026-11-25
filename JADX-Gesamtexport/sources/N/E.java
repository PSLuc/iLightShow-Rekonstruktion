package N;

/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC0250y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D4.c f3577h;
    public F i;

    public E(D4.c cVar) {
        this.f3577h = cVar;
    }

    @Override // N.InterfaceC0250y0
    public final void a() {
        this.i = (F) this.f3577h.invoke(C0208d.f3694h);
    }

    @Override // N.InterfaceC0250y0
    public final void b() {
    }

    @Override // N.InterfaceC0250y0
    public final void e() {
        F f6 = this.i;
        if (f6 != null) {
            f6.a();
        }
        this.i = null;
    }
}
