package p091r0;

import P.d;
import P4.InterfaceC0318e;
import c5.C0495p;
import java.util.concurrent.CancellationException;
import p080p.l;
import p084p4.x;
import p112v.C0981h;
import p113v0.InterfaceC1033p;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11493a;

    public h(int i) {
        switch (i) {
            case 1:
                this.f11493a = new d(new C0981h[16]);
                break;
            default:
                this.f11493a = new d(new g[16]);
                break;
        }
    }

    public boolean a(l lVar, InterfaceC1033p interfaceC1033p, C0495p c0495p, boolean z5) {
        d dVar = this.f11493a;
        int i = dVar.f4583j;
        if (i <= 0) {
            return false;
        }
        Object[] objArr = dVar.f4582h;
        int i3 = 0;
        boolean z6 = false;
        do {
            z6 = ((g) objArr[i3]).a(lVar, interfaceC1033p, c0495p, z5) || z6;
            i3++;
        } while (i3 < i);
        return z6;
    }

    public void b(CancellationException cancellationException) {
        d dVar = this.f11493a;
        int i = dVar.f4583j;
        InterfaceC0318e[] interfaceC0318eArr = new InterfaceC0318e[i];
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC0318eArr[i3] = ((C0981h) dVar.f4582h[i3]).f12979b;
        }
        for (int i6 = 0; i6 < i; i6++) {
            interfaceC0318eArr[i6].i(cancellationException);
        }
        if (!dVar.m()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public void c(C0495p c0495p) {
        d dVar = this.f11493a;
        int i = dVar.f4583j;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((g) dVar.f4582h[i]).f11487c.f2138b == 0) {
                dVar.p(i);
            }
        }
    }

    public void d() {
        int i = 0;
        while (true) {
            d dVar = this.f11493a;
            if (i >= dVar.f4583j) {
                return;
            }
            g gVar = (g) dVar.f4582h[i];
            if (gVar.f11486b.f5969t) {
                i++;
                gVar.d();
            } else {
                gVar.f();
                dVar.p(i);
            }
        }
    }

    public void e() {
        d dVar = this.f11493a;
        int i = 0;
        int i3 = new J4.d(0, dVar.f4583j - 1, 1).i;
        if (i3 >= 0) {
            while (true) {
                ((C0981h) dVar.f4582h[i]).f12979b.g(x.f10867a);
                if (i == i3) {
                    break;
                } else {
                    i++;
                }
            }
        }
        dVar.i();
    }
}
