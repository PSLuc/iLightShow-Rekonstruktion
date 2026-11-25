package p5;

import java.util.ConcurrentModificationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: p5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0853s implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0854t f11139a;

    public C0853s(C0854t c0854t) {
        this.f11139a = c0854t;
    }

    @Override // p5.u0
    public final void a(Q q6) {
        this.f11139a.f11142a.set(q6);
        C0854t.f11140k.debug("Handshake with [{}] has been started", q6.f10995v.f10894h);
    }

    @Override // p5.u0
    public final void b(Q q6) {
        C0854t c0854t = this.f11139a;
        m5.q qVar = c0854t.f11147f;
        if (qVar != null && !qVar.isShutdown() && C0854t.f11141l.isErrorEnabled()) {
            try {
                qVar.k();
            } catch (ConcurrentModificationException e6) {
                C0854t.f11141l.error("on handshake completed: connection {}", e6.getMessage(), e6);
                if (C0854t.f11141l.isDebugEnabled()) {
                    throw e6;
                }
            }
        }
        AtomicReference atomicReference = c0854t.f11142a;
        while (!atomicReference.compareAndSet(q6, null)) {
            if (atomicReference.get() != q6) {
                return;
            }
        }
        C0854t.f11140k.debug("Handshake with [{}] has been completed", q6.f10995v.f10894h);
    }

    @Override // p5.u0
    public final void c(Q q6, Exception exc) {
        m5.q qVar = this.f11139a.f11147f;
        if (qVar != null && !qVar.isShutdown() && C0854t.f11141l.isErrorEnabled()) {
            try {
                qVar.k();
            } catch (ConcurrentModificationException e6) {
                C0854t.f11141l.error("on handshake failed: connection {}", e6.getMessage(), e6);
                if (C0854t.f11141l.isDebugEnabled()) {
                    throw e6;
                }
            }
        }
        AtomicReference atomicReference = this.f11139a.f11142a;
        while (!atomicReference.compareAndSet(q6, null)) {
            if (atomicReference.get() != q6) {
                return;
            }
        }
        this.f11139a.f11144c = null;
        C0854t.f11140k.debug("Handshake with [{}] has failed", q6.f10995v.f10894h);
    }

    @Override // p5.u0
    public final void d(Q q6, C c6) {
        this.f11139a.i = c6;
        C0854t.f11140k.debug("Session with [{}] has been established", c6.f10894h);
    }
}
