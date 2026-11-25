package p101t;

import D4.a;
import E4.l;
import p030f0.c;
import p084p4.x;
import p113v0.InterfaceC1033p;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12300h;
    public final /* synthetic */ e0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(e0 e0Var, int i) {
        super(0);
        this.f12300h = i;
        this.i = e0Var;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f12300h) {
            case 0:
                InterfaceC1033p interfaceC1033p = (InterfaceC1033p) this.i.f12313A.getValue();
                return new c(interfaceC1033p != null ? interfaceC1033p.Q(0L) : 9205357640488583168L);
            case 1:
                return new c(this.i.f12315C);
            default:
                this.i.A0();
                return x.f10867a;
        }
    }
}
