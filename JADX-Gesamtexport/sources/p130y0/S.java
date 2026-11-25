package p130y0;

import G4.a;
import H4.b;
import N.C0221j0;
import P4.AbstractC0331s;
import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import p084p4.m;
import p089q4.j;
import p111u4.i;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC0331s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f14289t = a.z(I.f14232o);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f14290u = new b(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Choreographer f14291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f14292k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14298q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0221j0 f14300s;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f14293l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f14294m = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f14295n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f14296o = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Q f14299r = new Q(this);

    public S(Choreographer choreographer, Handler handler) {
        this.f14291j = choreographer;
        this.f14292k = handler;
        this.f14300s = new C0221j0(choreographer, this);
    }

    public static final void Z(S s6) {
        Runnable runnable;
        boolean z5;
        do {
            synchronized (s6.f14293l) {
                j jVar = s6.f14294m;
                runnable = (Runnable) (jVar.isEmpty() ? null : jVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (s6.f14293l) {
                    j jVar2 = s6.f14294m;
                    runnable = (Runnable) (jVar2.isEmpty() ? null : jVar2.removeFirst());
                }
            }
            synchronized (s6.f14293l) {
                if (s6.f14294m.isEmpty()) {
                    z5 = false;
                    s6.f14297p = false;
                } else {
                    z5 = true;
                }
            }
        } while (z5);
    }

    @Override // P4.AbstractC0331s
    public final void X(i iVar, Runnable runnable) {
        synchronized (this.f14293l) {
            this.f14294m.addLast(runnable);
            if (!this.f14297p) {
                this.f14297p = true;
                this.f14292k.post(this.f14299r);
                if (!this.f14298q) {
                    this.f14298q = true;
                    this.f14291j.postFrameCallback(this.f14299r);
                }
            }
        }
    }
}
