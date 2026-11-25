package M0;

import B.C0026n;
import B.C0031p0;
import B.C0043w;
import B.J;
import G0.G;
import G0.I;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0031p0 f3463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f3464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public E4.l f3466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public E4.l f3467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f3468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f3469h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f3470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f3471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f3472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final P.d f3473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public I3.a f3474n;

    public z(View view, p130y0.r rVar) {
        C0031p0 c0031p0 = new C0031p0(view);
        A a6 = new A(Choreographer.getInstance());
        this.f3462a = view;
        this.f3463b = c0031p0;
        this.f3464c = a6;
        this.f3466e = C0201d.f3398k;
        this.f3467f = C0201d.f3399l;
        this.f3468g = new w(4, "", I.f1468b);
        this.f3469h = m.f3430f;
        this.i = new ArrayList();
        this.f3470j = G4.a.y(p084p4.g.i, new C0043w(20, this));
        this.f3472l = new e(rVar, c0031p0);
        this.f3473m = new P.d(new y[16]);
    }

    @Override // M0.r
    public final void a() {
        i(y.f3458h);
    }

    @Override // M0.r
    public final void b() {
        i(y.f3459j);
    }

    @Override // M0.r
    public final void c(w wVar, q qVar, G g6, A2.e eVar, p030f0.d dVar, p030f0.d dVar2) {
        e eVar2 = this.f3472l;
        synchronized (eVar2.f3405c) {
            try {
                eVar2.f3411j = wVar;
                eVar2.f3413l = qVar;
                eVar2.f3412k = g6;
                eVar2.f3414m = eVar;
                eVar2.f3415n = dVar;
                eVar2.f3416o = dVar2;
                if (eVar2.f3407e || eVar2.f3406d) {
                    eVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.r
    public final void d() {
        i(y.f3460k);
    }

    @Override // M0.r
    public final void e() {
        this.f3465d = false;
        this.f3466e = C0201d.f3400m;
        this.f3467f = C0201d.f3401n;
        this.f3471k = null;
        i(y.i);
    }

    @Override // M0.r
    public final void f(p030f0.d dVar) {
        Rect rect;
        this.f3471k = new Rect(G4.a.D(dVar.f8839a), G4.a.D(dVar.f8840b), G4.a.D(dVar.f8841c), G4.a.D(dVar.f8842d));
        if (!this.i.isEmpty() || (rect = this.f3471k) == null) {
            return;
        }
        this.f3462a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // M0.r
    public final void g(w wVar, m mVar, C0026n c0026n, J j4) {
        this.f3465d = true;
        this.f3468g = wVar;
        this.f3469h = mVar;
        this.f3466e = c0026n;
        this.f3467f = j4;
        i(y.f3458h);
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, p4.f] */
    @Override // M0.r
    public final void h(w wVar, w wVar2) {
        boolean z5 = (I.a(this.f3468g.f3454b, wVar2.f3454b) && E4.k.a(this.f3468g.f3455c, wVar2.f3455c)) ? false : true;
        this.f3468g = wVar2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            s sVar = (s) ((WeakReference) this.i.get(i)).get();
            if (sVar != null) {
                sVar.f3442d = wVar2;
            }
        }
        e eVar = this.f3472l;
        synchronized (eVar.f3405c) {
            eVar.f3411j = null;
            eVar.f3413l = null;
            eVar.f3412k = null;
            eVar.f3414m = C0201d.i;
            eVar.f3415n = null;
            eVar.f3416o = null;
        }
        if (E4.k.a(wVar, wVar2)) {
            if (z5) {
                C0031p0 c0031p0 = this.f3463b;
                int iE = I.e(wVar2.f3454b);
                int iD = I.d(wVar2.f3454b);
                I i3 = this.f3468g.f3455c;
                int iE2 = i3 != null ? I.e(i3.f1470a) : -1;
                I i6 = this.f3468g.f3455c;
                ((InputMethodManager) c0031p0.f394j.getValue()).updateSelection((View) c0031p0.i, iE, iD, iE2, i6 != null ? I.d(i6.f1470a) : -1);
                return;
            }
            return;
        }
        if (wVar != null && (!E4.k.a(wVar.f3453a.f1494h, wVar2.f3453a.f1494h) || (I.a(wVar.f3454b, wVar2.f3454b) && !E4.k.a(wVar.f3455c, wVar2.f3455c)))) {
            C0031p0 c0031p1 = this.f3463b;
            ((InputMethodManager) c0031p1.f394j.getValue()).restartInput((View) c0031p1.i);
            return;
        }
        int size2 = this.i.size();
        for (int i7 = 0; i7 < size2; i7++) {
            s sVar2 = (s) ((WeakReference) this.i.get(i7)).get();
            if (sVar2 != null) {
                w wVar3 = this.f3468g;
                C0031p0 c0031p2 = this.f3463b;
                if (sVar2.f3446h) {
                    sVar2.f3442d = wVar3;
                    if (sVar2.f3444f) {
                        ((InputMethodManager) c0031p2.f394j.getValue()).updateExtractedText((View) c0031p2.i, sVar2.f3443e, AbstractC0599v0.N(wVar3));
                    }
                    I i8 = wVar3.f3455c;
                    int iE3 = i8 != null ? I.e(i8.f1470a) : -1;
                    I i9 = wVar3.f3455c;
                    int iD2 = i9 != null ? I.d(i9.f1470a) : -1;
                    long j4 = wVar3.f3454b;
                    ((InputMethodManager) c0031p2.f394j.getValue()).updateSelection((View) c0031p2.i, I.e(j4), I.d(j4), iE3, iD2);
                }
            }
        }
    }

    public final void i(y yVar) {
        this.f3473m.c(yVar);
        if (this.f3474n == null) {
            I3.a aVar = new I3.a(3, this);
            this.f3464c.execute(aVar);
            this.f3474n = aVar;
        }
    }
}
