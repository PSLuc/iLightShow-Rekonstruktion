package B;

import N.C0208d;
import p112v.C1015y0;
import p112v.InterfaceC1003s0;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements InterfaceC1003s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1003s0 f242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N.D f243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N.D f244c;

    public U0(InterfaceC1003s0 interfaceC1003s0, W0 w6) {
        this.f242a = interfaceC1003s0;
        this.f243b = C0208d.C(new T0(w6, 1));
        this.f244c = C0208d.C(new T0(w6, 0));
    }

    @Override // p112v.InterfaceC1003s0
    public final boolean a() {
        return ((Boolean) this.f244c.getValue()).booleanValue();
    }

    @Override // p112v.InterfaceC1003s0
    public final Object b(int i, C1015y0 c1015y0, p122w4.c cVar) {
        return this.f242a.b(i, c1015y0, cVar);
    }

    @Override // p112v.InterfaceC1003s0
    public final boolean c() {
        return this.f242a.c();
    }

    @Override // p112v.InterfaceC1003s0
    public final boolean d() {
        return ((Boolean) this.f243b.getValue()).booleanValue();
    }

    @Override // p112v.InterfaceC1003s0
    public final float e(float f6) {
        return this.f242a.e(f6);
    }
}
