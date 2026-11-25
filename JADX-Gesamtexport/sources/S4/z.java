package S4;

/* JADX INFO: loaded from: classes.dex */
public final class z implements N, InterfaceC0368e, T4.o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f5139h;

    public z(y yVar) {
        this.f5139h = yVar;
    }

    @Override // S4.InterfaceC0368e
    public final Object a(InterfaceC0369f interfaceC0369f, p111u4.d dVar) throws Throwable {
        ((P) this.f5139h).a(interfaceC0369f, dVar);
        return v4.a.f13292h;
    }

    @Override // T4.o
    public final InterfaceC0368e b(p111u4.i iVar, int i, int i3) {
        return (((i < 0 || i >= 2) && i != -2) || i3 != 2) ? F.j(this, iVar, i, i3) : this;
    }

    @Override // S4.N
    public final Object getValue() {
        return ((P) this.f5139h).getValue();
    }
}
