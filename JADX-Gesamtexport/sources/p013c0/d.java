package p013c0;

import B.C0025m0;
import B.C0026n;
import E4.k;
import E4.w;
import G4.a;
import Z.n;
import android.view.DragEvent;
import p081p0.c;
import p124x0.AbstractC1098f;
import p124x0.InterfaceC1104l;
import p124x0.p0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n implements p0, InterfaceC1104l {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f7192u;

    public final void A0(C0025m0 c0025m0) {
        d dVar = this.f7192u;
        if (dVar != null) {
            dVar.A0(c0025m0);
        }
        this.f7192u = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final void B0(C0025m0 c0025m0) {
        p0 p0Var;
        d dVar;
        d dVar2 = this.f7192u;
        if (dVar2 != null) {
            DragEvent dragEvent = (DragEvent) c0025m0.i;
            if (a.h(dVar2, c.y(dragEvent.getX(), dragEvent.getY()))) {
                dVar = dVar2;
            } else {
                if (this.f5958h.f5969t) {
                    w wVar = new w();
                    AbstractC1098f.x(this, new C0026n(wVar, this, c0025m0, 5));
                    p0Var = (p0) wVar.f1074h;
                } else {
                    p0Var = null;
                }
                dVar = (d) p0Var;
            }
        } else {
            if (this.f5958h.f5969t) {
                p0Var = null;
            } else {
                w wVar2 = new w();
                AbstractC1098f.x(this, new C0026n(wVar2, this, c0025m0, 5));
                p0Var = (p0) wVar2.f1074h;
            }
            dVar = (d) p0Var;
        }
        if (dVar != null && dVar2 == null) {
            dVar.z0(c0025m0);
            dVar.B0(c0025m0);
        } else if (dVar == null && dVar2 != null) {
            dVar2.A0(c0025m0);
        } else if (!k.a(dVar, dVar2)) {
            if (dVar != null) {
                dVar.z0(c0025m0);
                dVar.B0(c0025m0);
            }
            if (dVar2 != null) {
                dVar2.A0(c0025m0);
            }
        } else if (dVar != null) {
            dVar.B0(c0025m0);
        }
        this.f7192u = dVar;
    }

    public final void C0(C0025m0 c0025m0) {
        d dVar = this.f7192u;
        if (dVar != null) {
            dVar.C0(c0025m0);
        }
    }

    @Override // p124x0.p0
    public final Object o() {
        return b.f7190a;
    }

    @Override // Z.n
    public final void s0() {
        this.f7192u = null;
    }

    public final boolean y0(C0025m0 c0025m0) {
        d dVar = this.f7192u;
        if (dVar == null) {
            return false;
        }
        return dVar.y0(c0025m0);
    }

    public final void z0(C0025m0 c0025m0) {
        d dVar = this.f7192u;
        if (dVar != null) {
            dVar.z0(c0025m0);
        }
    }
}
