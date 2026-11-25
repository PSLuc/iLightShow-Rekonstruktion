package N;

import P4.InterfaceC0335w;

/* JADX INFO: renamed from: N.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0229n0 implements InterfaceC0203a0, InterfaceC0335w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p111u4.i f3732h;
    public final /* synthetic */ InterfaceC0203a0 i;

    public C0229n0(InterfaceC0203a0 interfaceC0203a0, p111u4.i iVar) {
        this.f3732h = iVar;
        this.i = interfaceC0203a0;
    }

    @Override // N.InterfaceC0203a0
    public final D4.c a() {
        return this.i.a();
    }

    @Override // N.InterfaceC0203a0
    public final Object b() {
        return this.i.b();
    }

    @Override // P4.InterfaceC0335w
    public final p111u4.i d() {
        return this.f3732h;
    }

    @Override // N.V0
    public final Object getValue() {
        return this.i.getValue();
    }

    @Override // N.InterfaceC0203a0
    public final void setValue(Object obj) {
        this.i.setValue(obj);
    }
}
