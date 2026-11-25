package N;

import B.C0005c0;
import B.C0043w;
import P4.C0319f;
import java.util.ArrayList;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: N.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0214g implements V {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0043w f3697h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Throwable f3698j;
    public final Object i = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f3699k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f3700l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0210e f3701m = new C0210e(0);

    public C0214g(C0043w c0043w) {
        this.f3697h = c0043w;
    }

    @Override // N.V
    public final Object C(D4.c cVar, p111u4.d dVar) {
        C0319f c0319f = new C0319f(1, AbstractC0473d.F(dVar));
        c0319f.u();
        C0212f c0212f = new C0212f(cVar, c0319f);
        synchronized (this.i) {
            Throwable th = this.f3698j;
            if (th != null) {
                c0319f.g(S1.V.v(th));
            } else {
                boolean zIsEmpty = this.f3699k.isEmpty();
                this.f3699k.add(c0212f);
                if (zIsEmpty) {
                    this.f3701m.set(1);
                }
                c0319f.w(new C0005c0(this, 20, c0212f));
                if (zIsEmpty) {
                    try {
                        this.f3697h.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.i) {
                            try {
                                if (this.f3698j == null) {
                                    this.f3698j = th2;
                                    ArrayList arrayList = this.f3699k;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        ((C0212f) arrayList.get(i)).f3696b.g(S1.V.v(th2));
                                    }
                                    this.f3699k.clear();
                                    this.f3701m.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object objT = c0319f.t();
        v4.a aVar = v4.a.f13292h;
        return objT;
    }

    @Override // p111u4.i
    public final p111u4.i D(p111u4.h hVar) {
        return S1.h0.t(this, hVar);
    }

    @Override // p111u4.i
    public final p111u4.g J(p111u4.h hVar) {
        return S1.h0.m(this, hVar);
    }

    @Override // p111u4.i
    public final Object T(Object obj, D4.e eVar) {
        return eVar.d(obj, this);
    }

    public final void a(long j4) {
        Object objV;
        synchronized (this.i) {
            try {
                ArrayList arrayList = this.f3699k;
                this.f3699k = this.f3700l;
                this.f3700l = arrayList;
                this.f3701m.set(0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0212f c0212f = (C0212f) arrayList.get(i);
                    c0212f.getClass();
                    try {
                        objV = c0212f.f3695a.invoke(Long.valueOf(j4));
                    } catch (Throwable th) {
                        objV = S1.V.v(th);
                    }
                    c0212f.f3696b.g(objV);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p111u4.i
    public final p111u4.i o(p111u4.i iVar) {
        return S1.h0.u(this, iVar);
    }
}
