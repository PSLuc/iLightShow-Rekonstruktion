package p124x0;

import E4.k;
import N.C0237s;
import Z.n;
import p027e3.a;
import p080p.v;

/* JADX INFO: renamed from: x0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1105m extends n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14045u = Z.f(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n f14046v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void A0(int i, boolean z5) {
        n nVar;
        int i3 = this.f5959j;
        this.f5959j = i;
        if (i3 != i) {
            n nVar2 = this.f5958h;
            if (nVar2 == this) {
                this.f5960k = i;
            }
            boolean z6 = this.f5969t;
            ?? r6 = this;
            if (z6) {
                while (r6 != 0) {
                    i |= r6.f5959j;
                    r6.f5959j = i;
                    if (r6 == nVar2) {
                        break;
                    } else {
                        r6 = r6.f5961l;
                    }
                }
                if (z5 && r6 == nVar2) {
                    i = Z.g(nVar2);
                    nVar2.f5959j = i;
                }
                int i6 = i | ((r6 == 0 || (nVar = r6.f5962m) == null) ? 0 : nVar.f5960k);
                for (?? r7 = r6; r7 != 0; r7 = r7.f5961l) {
                    i6 |= r7.f5959j;
                    r7.f5960k = i6;
                }
            }
        }
    }

    @Override // Z.n
    public final void p0() {
        super.p0();
        for (n nVar = this.f14046v; nVar != null; nVar = nVar.f5962m) {
            nVar.x0(this.f5964o);
            if (!nVar.f5969t) {
                nVar.p0();
            }
        }
    }

    @Override // Z.n
    public final void q0() {
        for (n nVar = this.f14046v; nVar != null; nVar = nVar.f5962m) {
            nVar.q0();
        }
        super.q0();
    }

    @Override // Z.n
    public final void t0() {
        super.t0();
        for (n nVar = this.f14046v; nVar != null; nVar = nVar.f5962m) {
            nVar.t0();
        }
    }

    @Override // Z.n
    public final void u0() {
        for (n nVar = this.f14046v; nVar != null; nVar = nVar.f5962m) {
            nVar.u0();
        }
        super.u0();
    }

    @Override // Z.n
    public final void v0() {
        super.v0();
        for (n nVar = this.f14046v; nVar != null; nVar = nVar.f5962m) {
            nVar.v0();
        }
    }

    @Override // Z.n
    public final void w0(n nVar) {
        this.f5958h = nVar;
        for (n nVar2 = this.f14046v; nVar2 != null; nVar2 = nVar2.f5962m) {
            nVar2.w0(nVar);
        }
    }

    @Override // Z.n
    public final void x0(Y y2) {
        this.f5964o = y2;
        for (n nVar = this.f14046v; nVar != null; nVar = nVar.f5962m) {
            nVar.x0(y2);
        }
    }

    public final void y0(InterfaceC1104l interfaceC1104l) {
        n nVar = ((n) interfaceC1104l).f5958h;
        if (nVar != interfaceC1104l) {
            n nVar2 = interfaceC1104l instanceof n ? (n) interfaceC1104l : null;
            n nVar3 = nVar2 != null ? nVar2.f5961l : null;
            if (nVar != this.f5958h || !k.a(nVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (nVar.f5969t) {
            a.y0("Cannot delegate to an already attached node");
            throw null;
        }
        nVar.w0(this.f5958h);
        int i = this.f5959j;
        int iG = Z.g(nVar);
        nVar.f5959j = iG;
        int i3 = this.f5959j;
        int i6 = iG & 2;
        if (i6 != 0 && (i3 & 2) != 0 && !(this instanceof InterfaceC1114w)) {
            a.y0("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + nVar);
            throw null;
        }
        nVar.f5962m = this.f14046v;
        this.f14046v = nVar;
        nVar.f5961l = this;
        A0(iG | i3, false);
        if (this.f5969t) {
            if (i6 == 0 || (i & 2) != 0) {
                x0(this.f5964o);
            } else {
                C0237s c0237s = AbstractC1098f.s(this).f13828C;
                this.f5958h.x0(null);
                c0237s.k();
            }
            nVar.p0();
            nVar.u0();
            Z.a(nVar);
        }
    }

    public final void z0(InterfaceC1104l interfaceC1104l) {
        n nVar = null;
        for (n nVar2 = this.f14046v; nVar2 != null; nVar2 = nVar2.f5962m) {
            if (nVar2 == interfaceC1104l) {
                boolean z5 = nVar2.f5969t;
                if (z5) {
                    v vVar = Z.f13997a;
                    if (!z5) {
                        a.y0("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    Z.b(nVar2, -1, 2);
                    nVar2.v0();
                    nVar2.q0();
                }
                nVar2.w0(nVar2);
                nVar2.f5960k = 0;
                if (nVar == null) {
                    this.f14046v = nVar2.f5962m;
                } else {
                    nVar.f5962m = nVar2.f5962m;
                }
                nVar2.f5962m = null;
                nVar2.f5961l = null;
                int i = this.f5959j;
                int iG = Z.g(this);
                A0(iG, true);
                if (this.f5969t && (i & 2) != 0 && (iG & 2) == 0) {
                    C0237s c0237s = AbstractC1098f.s(this).f13828C;
                    this.f5958h.x0(null);
                    c0237s.k();
                    return;
                }
                return;
            }
            nVar = nVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC1104l).toString());
    }
}
