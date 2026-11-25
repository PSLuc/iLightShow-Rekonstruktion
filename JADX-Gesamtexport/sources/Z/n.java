package Z;

import P4.AbstractC0336x;
import P4.C0332t;
import P4.InterfaceC0335w;
import P4.T;
import P4.V;
import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import p101t.G;
import p124x0.AbstractC1098f;
import p124x0.InterfaceC1104l;
import p124x0.Y;
import p124x0.b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements InterfaceC1104l {
    public U4.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5959j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f5961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f5962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b0 f5963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Y f5964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5969t;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f5958h = this;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5960k = -1;

    public final InterfaceC0335w n0() {
        U4.d dVar = this.i;
        if (dVar != null) {
            return dVar;
        }
        U4.d dVarA = AbstractC0336x.a(((p130y0.r) AbstractC1098f.t(this)).getCoroutineContext().o(new V((T) ((p130y0.r) AbstractC1098f.t(this)).getCoroutineContext().J(C0332t.i))));
        this.i = dVarA;
        return dVarA;
    }

    public boolean o0() {
        return !(this instanceof G);
    }

    public void p0() {
        if (this.f5969t) {
            p027e3.a.y0("node attached multiple times");
            throw null;
        }
        if (this.f5964o == null) {
            p027e3.a.y0("attach invoked on a node without a coordinator");
            throw null;
        }
        this.f5969t = true;
        this.f5967r = true;
    }

    public void q0() {
        if (!this.f5969t) {
            p027e3.a.y0("Cannot detach a node that is not attached");
            throw null;
        }
        if (this.f5967r) {
            p027e3.a.y0("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (this.f5968s) {
            p027e3.a.y0("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.f5969t = false;
        U4.d dVar = this.i;
        if (dVar != null) {
            AbstractC0336x.c(dVar, new ModifierNodeDetachedCancellationException());
            this.i = null;
        }
    }

    public void r0() {
    }

    public void s0() {
    }

    public void t0() {
        if (this.f5969t) {
            return;
        }
        p027e3.a.y0("reset() called on an unattached node");
        throw null;
    }

    public void u0() {
        if (!this.f5969t) {
            p027e3.a.y0("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.f5967r) {
            p027e3.a.y0("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.f5967r = false;
        r0();
        this.f5968s = true;
    }

    public void v0() {
        if (!this.f5969t) {
            p027e3.a.y0("node detached multiple times");
            throw null;
        }
        if (this.f5964o == null) {
            p027e3.a.y0("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.f5968s) {
            p027e3.a.y0("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.f5968s = false;
        s0();
    }

    public void w0(n nVar) {
        this.f5958h = nVar;
    }

    public void x0(Y y2) {
        this.f5964o = y2;
    }
}
