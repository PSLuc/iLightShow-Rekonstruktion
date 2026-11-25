package p045i1;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import p008b1.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f9421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c[] f9422b;

    public T() {
        this(new c0());
    }

    public final void a() {
        c[] cVarArr = this.f9422b;
        if (cVarArr != null) {
            c cVarF = cVarArr[0];
            c cVarF2 = cVarArr[1];
            c0 c0Var = this.f9421a;
            if (cVarF2 == null) {
                cVarF2 = c0Var.f9452a.f(2);
            }
            if (cVarF == null) {
                cVarF = c0Var.f9452a.f(1);
            }
            f(c.a(cVarF, cVarF2));
            c cVar = this.f9422b[AbstractC0599v0.D(16)];
            if (cVar != null) {
                e(cVar);
            }
            c cVar2 = this.f9422b[AbstractC0599v0.D(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            c cVar3 = this.f9422b[AbstractC0599v0.D(64)];
            if (cVar3 != null) {
                g(cVar3);
            }
        }
    }

    public abstract c0 b();

    public void c(int i, c cVar) {
        if (this.f9422b == null) {
            this.f9422b = new c[9];
        }
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i & i3) != 0) {
                this.f9422b[AbstractC0599v0.D(i3)] = cVar;
            }
        }
    }

    public abstract void d(c cVar);

    public abstract void e(c cVar);

    public abstract void f(c cVar);

    public abstract void g(c cVar);

    public T(c0 c0Var) {
        this.f9421a = c0Var;
    }
}
