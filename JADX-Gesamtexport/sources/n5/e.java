package n5;

import L2.o;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m5.q;
import org.eclipse.californium.scandium.dtls.ConnectionEvictedException;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import p5.C;
import p5.C0838c;
import p5.C0854t;
import p5.EnumC0835a;
import p5.Q;
import p5.X;
import p5.i0;
import p5.s0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f10580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10581b;

    public e(g gVar, X x6) {
        this.f10581b = gVar;
        this.f10580a = x6;
    }

    @Override // p5.s0, p5.u0
    public final void b(Q q6) {
        this.f10581b.getClass();
        C0854t c0854t = q6.f10957O;
        ScheduledExecutorService scheduledExecutorService = this.f10581b.f10606t;
        if (scheduledExecutorService != null) {
            try {
                scheduledExecutorService.schedule(new o(9, c0854t), g.f10585B, TimeUnit.MILLISECONDS);
                return;
            } catch (RejectedExecutionException unused) {
                g.f10586y.debug("stopping.");
            }
        }
        c0854t.f11144c = null;
    }

    @Override // p5.u0
    public final void c(Q q6, Exception exc) {
        this.f10581b.getClass();
        q6.getClass();
        ArrayList arrayList = q6.I;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (!arrayList2.isEmpty()) {
            g.f10586y.debug("Handshake with [{}] failed, report error to deferred {} messages", q6.f10995v.f10894h, Integer.valueOf(arrayList2.size()));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((k5.a) obj).b(exc);
            }
        }
        C0854t c0854t = q6.f10957O;
        if (q6.p()) {
            this.f10580a.g(c0854t, false);
            return;
        }
        if (q6.o()) {
            g.f10586y.debug("Handshake with [{}] failed within probe!", q6.f10995v.f10894h);
            return;
        }
        C c6 = c0854t.i;
        C c7 = q6.f10995v;
        if (c6 != c7) {
            if (c0854t.d()) {
                g.f10586y.warn("Handshake with [{}] failed, but has an established session!", q6.f10995v.f10894h);
                return;
            } else {
                g.f10586y.warn("Handshake with [{}] failed, connection preserved!", q6.f10995v.f10894h);
                return;
            }
        }
        if (!(exc instanceof HandshakeException)) {
            if (exc instanceof ConnectionEvictedException) {
                g.f10586y.debug("Handshake with [{}] never get APPLICATION_DATA", c7.f10894h, exc);
                return;
            } else {
                g.f10586y.warn("Handshake with [{}] failed after session was established!", c7.f10894h, exc);
                return;
            }
        }
        C0838c c0838c = ((HandshakeException) exc).f10704h;
        if (c0838c == null || c0838c.f11034j != EnumC0835a.CLOSE_NOTIFY) {
            g.f10586y.warn("Handshake with [{}] failed after session was established! {}", c7.f10894h, c0838c);
        } else {
            g.f10586y.debug("Handshake with [{}] closed after session was established!", c7.f10894h);
        }
    }

    @Override // p5.u0
    public final void d(Q q6, C c6) {
        g gVar = this.f10581b;
        gVar.getClass();
        Logger logger = g.f10586y;
        try {
            C0854t c0854t = q6.f10957O;
            gVar.f10589b.f(c6, c0854t);
            q qVar = c0854t.f11147f;
            ArrayList arrayList = q6.I;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            int i = 0;
            if (!arrayList2.isEmpty()) {
                logger.trace("Session with [{}] established, now process deferred {} messages", c6.f10894h, Integer.valueOf(arrayList2.size()));
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C c7 = c6;
                    qVar.execute(new p052k.e(gVar, (k5.a) arrayList2.get(i3), c0854t, c7, 2));
                    c6 = c7;
                }
            }
            C c8 = c6;
            ArrayList arrayListB = q6.B();
            if (arrayListB.isEmpty()) {
                return;
            }
            logger.trace("Session with [{}] established, now process deferred {} messages", c8.f10894h, Integer.valueOf(arrayListB.size()));
            int size2 = arrayListB.size();
            while (i < size2) {
                Object obj = arrayListB.get(i);
                i++;
                qVar.execute(new b(gVar, (i0) obj, c0854t, 1));
            }
        } catch (RejectedExecutionException unused) {
            logger.debug("stopping.");
        }
    }
}
