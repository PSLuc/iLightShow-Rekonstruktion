package F;

import B.EnumC0009e0;

/* JADX INFO: renamed from: F.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0063e extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0070l f1170h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1171j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063e(InterfaceC0070l interfaceC0070l, boolean z5, boolean z6) {
        super(1);
        this.f1170h = interfaceC0070l;
        this.i = z5;
        this.f1171j = z6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        E0.h hVar = (E0.h) obj;
        long jA = this.f1170h.a();
        hVar.i(B.f1082c, new A(this.i ? EnumC0009e0.i : EnumC0009e0.f308j, jA, this.f1171j ? 1 : 3, p081p0.c.s0(jA)));
        return p084p4.x.f10867a;
    }
}
