package p052k;

import k5.a;
import m5.s;
import n5.g;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import p035g0.C0715p;
import p057l.B0;
import p5.C;
import p5.C0838c;
import p5.C0850o;
import p5.C0854t;
import p5.i0;
import p5.t0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9812h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f9813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f9814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f9815l;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f9812h = i;
        this.f9815l = obj;
        this.i = obj2;
        this.f9813j = obj3;
        this.f9814k = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9812h) {
            case 0:
                f fVar = (f) this.i;
                if (fVar != null) {
                    C0715p c0715p = (C0715p) this.f9815l;
                    ((g) c0715p.i).G = true;
                    fVar.f9817b.c(false);
                    ((g) c0715p.i).G = false;
                }
                k kVar = (k) this.f9813j;
                if (kVar.isEnabled() && kVar.hasSubMenu()) {
                    ((j) this.f9814k).p(kVar, null, 4);
                    return;
                }
                return;
            case 1:
                g gVar = (g) this.f9815l;
                if (gVar.f10607u.get()) {
                    C0850o c0850o = (C0850o) this.i;
                    B0 b6 = (B0) this.f9814k;
                    C0854t c0854t = (C0854t) b6.f9967c;
                    if (c0854t == null) {
                        throw new NullPointerException("connection by address must not be null!");
                    }
                    i0 i0Var = (i0) this.f9813j;
                    boolean zA = c0854t.a(i0Var.d());
                    Logger logger = g.f10587z;
                    if (!zA) {
                        logger.info("Drop received CLIENT_HELLO, changed address {} => {}!", i0Var.d(), c0854t.f11148g);
                        return;
                    }
                    Logger logger2 = g.f10586y;
                    if (logger2.isTraceEnabled()) {
                        logger2.trace("Processing CLIENT_HELLO from peer [" + i0Var.d() + "]:" + s.f10493b + i0Var);
                    }
                    try {
                        if (c0854t.d() || c0854t.b() != null) {
                            logger.debug("Discarding received duplicate CLIENT_HELLO message [epoch={}] from peer [{}]!", Integer.valueOf(i0Var.f11075c), i0Var.d());
                        } else {
                            t0 t0Var = c0850o.f11123p;
                            if (t0Var == null || t0Var.f10440a.length <= 0) {
                                gVar.u(c0850o, i0Var, c0854t);
                            } else {
                                gVar.m(c0850o, i0Var, b6);
                            }
                        }
                        return;
                    } catch (HandshakeException e6) {
                        C0838c c0838c = e6.f10704h;
                        gVar.e(e6, c0838c.i, c0838c.f11034j, c0854t, i0Var);
                        return;
                    }
                }
                return;
            default:
                ((g) this.f9815l).q((a) this.i, (C0854t) this.f9813j, (C) this.f9814k);
                return;
        }
    }
}
