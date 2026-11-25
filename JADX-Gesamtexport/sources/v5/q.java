package v5;

import B.C0025m0;
import F.C0071m;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p005a4.B;
import p005a4.C0398f;
import p005a4.C0402j;
import p005a4.C0407o;
import p005a4.C0410s;
import p005a4.C0415x;
import p005a4.G;
import p005a4.T;
import p005a4.y;
import p089q4.u;
import w5.C1059q;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R3.l f13364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L3.c f13365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f13366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y5.e f13367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G f13368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p017c4.h f13369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13370h;
    public final S3.a i;

    public q(L3.c cVar) throws Exception {
        int i = 16;
        int i3 = 1;
        d dVar = d.f13307a;
        R3.l lVar = p061l4.f.f10387c;
        R3.l lVar2 = p061l4.f.f10385a;
        u uVar = u.f11237h;
        E4.k.f("ioScheduler", lVar);
        E4.k.f("observeScheduler", lVar2);
        this.f13363a = dVar;
        this.f13364b = lVar;
        this.f13365c = cVar;
        this.f13366d = uVar;
        y5.e eVar = new y5.e(0, new d());
        this.f13367e = eVar;
        y5.e eVar2 = new y5.e(56700, new d());
        J2.b bVar = new J2.b(i, new o(i3));
        C0398f c0398f = eVar.f14604e;
        c0398f.getClass();
        T t6 = new T(new C0402j(c0398f, bVar, 1), lVar, !false);
        J2.b bVar2 = new J2.b(i, new o(i3));
        C0398f c0398f2 = eVar2.f14604e;
        c0398f2.getClass();
        C0407o c0407o = new C0407o(0, new u5.a[]{t6, new T(new C0402j(c0398f2, bVar2, 1), lVar, !false)});
        Z2.f fVar = W3.b.f5599a;
        int i6 = R3.a.f4801h;
        R3.a aVarD = c0407o.d(fVar, 2, i6);
        W3.b.b(i6, "bufferSize");
        C0415x c0415x = new C0415x(aVarD, lVar2, i6);
        InetAddress inetAddress = x5.a.f14146a;
        C0402j c0402j = new C0402j(c0415x, new J2.b(18, new o(3)), 0);
        W3.b.b(i6, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        this.f13368f = new G(new B(new y(atomicReference, i6), c0402j, atomicReference, i6));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        R3.l lVar3 = p061l4.f.f10386b;
        W3.b.a("unit is null", timeUnit);
        W3.b.a("scheduler is null", lVar3);
        p017c4.b bVar3 = new p017c4.b(Math.max(0L, 5L), Math.max(0L, 5L), lVar3);
        AtomicReference atomicReference2 = new AtomicReference();
        this.f13369g = new p017c4.h(new p017c4.f(new C0025m0(23, atomicReference2), bVar3, atomicReference2));
        this.f13370h = (int) (Math.random() * ((double) Integer.MAX_VALUE));
        this.i = new S3.a(0);
    }

    public final boolean a(y5.c cVar) {
        y5.e eVar = this.f13367e;
        eVar.getClass();
        if (!eVar.f14603d) {
            return false;
        }
        eVar.f14602c.c(cVar);
        return true;
    }

    public final void b() {
        J2.b bVar = new J2.b(13, new o(0));
        G g6 = this.f13368f;
        g6.getClass();
        int i = R3.a.f4801h;
        W3.b.b(i, "bufferSize");
        C0410s c0410s = new C0410s(g6, bVar, i);
        p039g4.a aVar = new p039g4.a(new J2.b(14, new p(this, 0)));
        c0410s.e(aVar);
        S3.a aVar2 = this.i;
        aVar2.b(aVar);
        J2.b bVar2 = new J2.b(15, new p(this, 1));
        p017c4.h hVar = this.f13369g;
        hVar.getClass();
        Y3.b bVar3 = new Y3.b(bVar2);
        hVar.e(bVar3);
        aVar2.b(bVar3);
        x5.b.b(new C0025m0(18, new R2.j(this, 4, new C1059q())));
        this.f13366d.getClass();
    }

    public final void c() {
        this.f13366d.getClass();
        S3.a aVar = this.i;
        if (aVar.i) {
            return;
        }
        synchronized (aVar) {
            try {
                if (aVar.i) {
                    return;
                }
                C0071m c0071m = (C0071m) aVar.f5012j;
                aVar.f5012j = null;
                S3.a.d(c0071m);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
