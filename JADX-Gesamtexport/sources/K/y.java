package K;

import F.L;
import S1.d0;
import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import c5.C0495p;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.nanjoran.ilightshow.Services.S;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import p035g0.C0715p;
import p045i1.F;
import p045i1.InterfaceC0747h;
import p045i1.InterfaceC0748i;
import p124x0.D;

/* JADX INFO: loaded from: classes.dex */
public final class y implements J3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2034e;

    public y() {
        this.f2032c = new Object();
        this.f2033d = new L(5);
    }

    public static y a(p015c2.h hVar, p015c2.A a6, d0 d0Var, boolean z5) {
        String str = a6 == null ? null : a6.f7195h;
        return new y(hVar, str != null ? new V1.h(str) : null, d0Var, null, z5);
    }

    public boolean b(float f6, float f7) {
        ViewParent viewParentE;
        if (this.f2031b && (viewParentE = e(0)) != null) {
            try {
                return F.b(viewParentE, (NestedScrollView) this.f2030a, f6, f7);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        return false;
    }

    public boolean c(int i, int i3, int i6, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i7;
        int i8;
        if (!this.f2031b || (viewParentE = e(i6)) == null) {
            return false;
        }
        if (i == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) this.f2030a;
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (((int[]) this.f2034e) == null) {
                this.f2034e = new int[2];
            }
            iArr = (int[]) this.f2034e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentE instanceof InterfaceC0747h) {
            ((InterfaceC0747h) viewParentE).d(i, i3, iArr, i6);
        } else if (i6 == 0) {
            try {
                F.c(viewParentE, nestedScrollView, i, i3, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    @Override // J3.a
    public boolean checkOrConnect(K3.a aVar) {
        List list;
        if (!(aVar instanceof M3.c)) {
            return false;
        }
        if (aVar.type != K3.d.f2135l) {
            String str = aVar.customInfo.get("model");
            if (str != null && ((list = E3.g.f1027h) == null || !list.isEmpty())) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (M4.s.W(str, (String) it.next(), false)) {
                        }
                    }
                }
            }
            M3.c cVar = (M3.c) aVar;
            if (cVar.f3491a == null) {
                M3.h hVar = new M3.h();
                cVar.f3491a = hVar;
                hVar.f799a = aVar.id;
                hVar.f3511l = aVar.ip;
                M3.h hVar2 = cVar.f3491a;
                E4.k.c(hVar2);
                hVar2.f3512m = aVar.port;
                M3.h hVar3 = cVar.f3491a;
                E4.k.c(hVar3);
                hVar3.f3514o = aVar.token;
            }
            M3.h hVar4 = cVar.f3491a;
            E4.k.c(hVar4);
            hVar4.f3516q = (M3.c) aVar;
            M3.h hVar5 = cVar.f3491a;
            E4.k.c(hVar5);
            hVar5.k();
            return true;
        }
        aVar.type = K3.d.f2135l;
        M3.c cVar2 = (M3.c) aVar;
        if (cVar2.f3492b == null) {
            M3.f fVar = new M3.f();
            cVar2.f3492b = fVar;
            fVar.f799a = aVar.id;
            fVar.f3500l = aVar.ip;
            M3.f fVar2 = cVar2.f3492b;
            E4.k.c(fVar2);
            fVar2.f3501m = aVar.port;
            M3.f fVar3 = cVar2.f3492b;
            E4.k.c(fVar3);
            fVar3.f3503o = aVar.token;
        }
        M3.f fVar4 = cVar2.f3492b;
        E4.k.c(fVar4);
        fVar4.f3505q = (M3.c) aVar;
        M3.f fVar5 = cVar2.f3492b;
        E4.k.c(fVar5);
        fVar5.l();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    public boolean d(int i, int i3, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent viewParentE;
        int i9;
        int i10;
        int[] iArr3;
        NestedScrollView nestedScrollView;
        if (this.f2031b && (viewParentE = e(i8)) != null) {
            if (i != 0 || i3 != 0 || i6 != 0 || i7 != 0) {
                NestedScrollView nestedScrollView2 = (NestedScrollView) this.f2030a;
                if (iArr != null) {
                    nestedScrollView2.getLocationInWindow(iArr);
                    i9 = iArr[0];
                    i10 = iArr[1];
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.f2034e) == null) {
                        this.f2034e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.f2034e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (!(viewParentE instanceof InterfaceC0748i)) {
                    iArr3[0] = iArr3[0] + i6;
                    iArr3[1] = iArr3[1] + i7;
                    if (viewParentE instanceof InterfaceC0747h) {
                        InterfaceC0747h interfaceC0747h = (InterfaceC0747h) viewParentE;
                        nestedScrollView = nestedScrollView2;
                        interfaceC0747h.e(nestedScrollView, i, i3, i6, i7, i8);
                    } else if (i8 == 0) {
                        try {
                            F.d(viewParentE, nestedScrollView2, i, i3, i6, i7);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(viewParentE);
                        }
                    }
                    if (iArr != null) {
                        nestedScrollView2.getLocationInWindow(iArr);
                        iArr[0] = iArr[0] - i9;
                        iArr[1] = iArr[1] - i10;
                    }
                    return true;
                }
                InterfaceC0748i interfaceC0748i = (InterfaceC0748i) viewParentE;
                nestedScrollView = nestedScrollView2;
                interfaceC0748i.c(nestedScrollView, i, i3, i6, i7, i8, iArr3);
                nestedScrollView2 = nestedScrollView;
                if (iArr != null) {
                    nestedScrollView2.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i9;
                    iArr[1] = iArr[1] - i10;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public ViewParent e(int i) {
        if (i == 0) {
            return (ViewParent) this.f2032c;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.f2033d;
    }

    public Object f() {
        Object obj;
        synchronized (this.f2032c) {
            try {
                if (!this.f2031b) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                Exception exc = (Exception) this.f2034e;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f2030a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean g() {
        boolean z5;
        synchronized (this.f2032c) {
            z5 = false;
            if (this.f2031b && ((Exception) this.f2034e) == null) {
                z5 = true;
            }
        }
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int h(C0495p c0495p, p130y0.r rVar, boolean z5) {
        int i;
        byte b6;
        p091r0.d dVar;
        int i3;
        p124x0.r rVar2 = (p124x0.r) this.f2034e;
        if (this.f2031b) {
            return 0;
        }
        try {
            this.f2031b = true;
            C0495p c0495pX = ((C0715p) this.f2030a).x(c0495p, rVar);
            p080p.l lVar = (p080p.l) c0495pX.i;
            int iD = lVar.d();
            while (true) {
                if (i >= iD) {
                    b6 = true;
                    break;
                }
                p091r0.q qVar = (p091r0.q) lVar.e(i);
                i = (qVar.f11511d || qVar.f11515h) ? 0 : i + 1;
                b6 = false;
                break;
            }
            int iD2 = lVar.d();
            int i6 = 0;
            while (true) {
                dVar = (p091r0.d) this.f2033d;
                if (i6 >= iD2) {
                    break;
                }
                p091r0.q qVar2 = (p091r0.q) lVar.e(i6);
                if (b6 != false || p091r0.o.a(qVar2)) {
                    ((D) this.f2032c).v(qVar2.f11510c, (p124x0.r) this.f2034e, qVar2.i == 1, true);
                    if (!rVar2.isEmpty()) {
                        dVar.a(qVar2.f11508a, rVar2, p091r0.o.a(qVar2));
                        rVar2.clear();
                    }
                }
                i6++;
            }
            ((p091r0.h) dVar.f11477c).d();
            boolean zD = dVar.d(c0495pX, z5);
            int iD3 = lVar.d();
            for (int i7 = 0; i7 < iD3; i7++) {
                p091r0.q qVar3 = (p091r0.q) lVar.e(i7);
                if (!p030f0.c.b(p091r0.o.g(qVar3, true), 0L) && qVar3.b()) {
                    i3 = 2;
                    return (zD ? 1 : 0) | i3;
                }
            }
            i3 = 0;
            return (zD ? 1 : 0) | i3;
        } finally {
            this.f2031b = false;
        }
    }

    public void i() {
        if (this.f2031b) {
            return;
        }
        p080p.l lVar = (p080p.l) ((C0715p) this.f2030a).i;
        int i = lVar.f10742k;
        Object[] objArr = lVar.f10741j;
        int i3 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            objArr[i6] = null;
        }
        lVar.f10742k = 0;
        lVar.f10740h = false;
        p091r0.d dVar = (p091r0.d) this.f2033d;
        P.d dVar2 = ((p091r0.h) dVar.f11477c).f11493a;
        int i7 = dVar2.f4583j;
        if (i7 > 0) {
            Object[] objArr2 = dVar2.f4582h;
            do {
                ((p091r0.g) objArr2[i3]).f();
                i3++;
            } while (i3 < i7);
        }
        ((p091r0.h) dVar.f11477c).f11493a.i();
    }

    public void j() {
        synchronized (this.f2032c) {
            k();
            this.f2031b = true;
            this.f2030a = null;
        }
        ((L) this.f2033d).m(this);
    }

    public void k() {
        boolean z5;
        Exception exc;
        String strConcat;
        if (this.f2031b) {
            int i = DuplicateTaskCompletionException.f8024h;
            synchronized (this.f2032c) {
                z5 = this.f2031b;
            }
            if (!z5) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            synchronized (this.f2032c) {
                exc = (Exception) this.f2034e;
            }
            if (exc == null) {
                strConcat = g() ? "result ".concat(String.valueOf(f())) : "unknown issue";
            } else {
                strConcat = "failure";
            }
        }
    }

    @Override // J3.a
    public void restart() {
    }

    @Override // J3.a
    public void scan(D4.c cVar) {
        Context context = (Context) this.f2032c;
        if (!this.f2031b) {
            S s6 = S.f8362c;
            if (s6.f8364b == 0) {
                WifiManager.MulticastLock multicastLock = s6.f8363a;
                if (multicastLock != null) {
                    multicastLock.setReferenceCounted(true);
                }
                WifiManager.MulticastLock multicastLock2 = s6.f8363a;
                if (multicastLock2 != null) {
                    multicastLock2.acquire();
                }
            }
            s6.f8364b++;
            this.f2031b = true;
        }
        Object systemService = context.getSystemService("servicediscovery");
        NsdManager nsdManager = systemService instanceof NsdManager ? (NsdManager) systemService : null;
        this.f2033d = nsdManager;
        M3.b bVar = new M3.b(this);
        this.f2034e = bVar;
        if (nsdManager != null) {
            nsdManager.discoverServices("_nanoleafapi._tcp.", 1, bVar);
        }
        new Timer().schedule(new L3.b(this, (J3.b) cVar, 1), 10000L);
    }

    @Override // J3.a
    public void stop() {
        M3.b bVar = (M3.b) this.f2034e;
        if (bVar != null) {
            try {
                NsdManager nsdManager = (NsdManager) this.f2033d;
                if (nsdManager != null) {
                    nsdManager.stopServiceDiscovery(bVar);
                }
            } catch (Exception e6) {
                e6.toString();
            }
            this.f2034e = null;
        }
        if (this.f2031b) {
            this.f2031b = false;
            S.f8362c.a();
        }
    }

    public y(p015c2.h hVar, V1.h hVar2, d0 d0Var, p015c2.o oVar, boolean z5) {
        this.f2032c = hVar;
        this.f2033d = hVar2;
        this.f2030a = d0Var;
        this.f2034e = oVar;
        this.f2031b = z5;
    }
}
