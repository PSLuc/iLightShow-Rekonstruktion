package p124x0;

import D4.c;
import E4.k;
import O1.u;
import Z.n;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p035g0.H;
import p035g0.InterfaceC0714o;
import p035g0.r;
import p048j0.b;
import p113v0.C1029l;
import p113v0.N;

/* JADX INFO: renamed from: x0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1116y extends Y {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final u f14068S;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public InterfaceC1114w f14069Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C1115x f14070R;

    static {
        u uVarG = H.g();
        int i = r.f9086m;
        uVarG.n(r.i);
        uVarG.t(1.0f);
        uVarG.u(1);
        f14068S = uVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1116y(D d6, InterfaceC1114w interfaceC1114w) {
        super(d6);
        this.f14069Q = interfaceC1114w;
        this.f14070R = d6.f13836j != null ? new C1115x(this) : null;
        if ((((n) interfaceC1114w).f5958h.f5959j & HueLog.LogComponent.APPCORE) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // p124x0.Y
    public final void H0() {
        if (this.f14070R == null) {
            this.f14070R = new C1115x(this);
        }
    }

    @Override // p124x0.Y
    public final N K0() {
        return this.f14070R;
    }

    @Override // p124x0.Y
    public final n M0() {
        return ((n) this.f14069Q).f5958h;
    }

    @Override // p113v0.E
    public final int U(int i) {
        InterfaceC1114w interfaceC1114w = this.f14069Q;
        Y y2 = this.f13990t;
        k.c(y2);
        return interfaceC1114w.d(this, y2, i);
    }

    @Override // p113v0.E
    public final int Y(int i) {
        InterfaceC1114w interfaceC1114w = this.f14069Q;
        Y y2 = this.f13990t;
        k.c(y2);
        return interfaceC1114w.h(this, y2, i);
    }

    @Override // p124x0.Y
    public final void Y0(InterfaceC0714o interfaceC0714o, b bVar) {
        Y y2 = this.f13990t;
        k.c(y2);
        y2.E0(interfaceC0714o, bVar);
        if (((p130y0.r) AbstractC1098f.u(this.f13989s)).getShowLayoutBounds()) {
            F0(interfaceC0714o, f14068S);
        }
    }

    @Override // p113v0.E
    public final int Z(int i) {
        InterfaceC1114w interfaceC1114w = this.f14069Q;
        Y y2 = this.f13990t;
        k.c(y2);
        return interfaceC1114w.c(this, y2, i);
    }

    @Override // p113v0.E
    public final N c(long j4) {
        o0(j4);
        InterfaceC1114w interfaceC1114w = this.f14069Q;
        Y y2 = this.f13990t;
        k.c(y2);
        b1(interfaceC1114w.e(this, y2, j4));
        W0();
        return this;
    }

    @Override // p113v0.E
    public final int d(int i) {
        InterfaceC1114w interfaceC1114w = this.f14069Q;
        Y y2 = this.f13990t;
        k.c(y2);
        return interfaceC1114w.i(this, y2, i);
    }

    @Override // p113v0.N
    public final void h0(long j4, float f6, c cVar) {
        Z0(j4, f6, cVar);
        if (this.f13934n) {
            return;
        }
        X0();
        v0().c();
        k.c(this.f13990t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j1(InterfaceC1114w interfaceC1114w) {
        if (!interfaceC1114w.equals(this.f14069Q) && (((n) interfaceC1114w).f5958h.f5959j & HueLog.LogComponent.APPCORE) != 0) {
            throw new ClassCastException();
        }
        this.f14069Q = interfaceC1114w;
    }

    @Override // p124x0.M
    public final int p0(C1029l c1029l) {
        C1115x c1115x = this.f14070R;
        if (c1115x == null) {
            return AbstractC1098f.c(this, c1029l);
        }
        Integer num = (Integer) c1115x.f13944x.get(c1029l);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
