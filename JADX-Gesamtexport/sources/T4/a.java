package T4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c[] f5254h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x f5256k;

    public final c c() {
        c cVarD;
        x xVar;
        synchronized (this) {
            try {
                c[] cVarArrE = this.f5254h;
                if (cVarArrE == null) {
                    cVarArrE = e();
                    this.f5254h = cVarArrE;
                } else if (this.i >= cVarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(cVarArrE, cVarArrE.length * 2);
                    E4.k.e("copyOf(this, newSize)", objArrCopyOf);
                    this.f5254h = (c[]) objArrCopyOf;
                    cVarArrE = (c[]) objArrCopyOf;
                }
                int i = this.f5255j;
                do {
                    cVarD = cVarArrE[i];
                    if (cVarD == null) {
                        cVarD = d();
                        cVarArrE[i] = cVarD;
                    }
                    i++;
                    if (i >= cVarArrE.length) {
                        i = 0;
                    }
                } while (!cVarD.a(this));
                this.f5255j = i;
                this.i++;
                xVar = this.f5256k;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xVar != null) {
            xVar.w(1);
        }
        return cVarD;
    }

    public abstract c d();

    public abstract c[] e();

    public final void f(c cVar) {
        x xVar;
        int i;
        p111u4.d[] dVarArrB;
        synchronized (this) {
            try {
                int i3 = this.i - 1;
                this.i = i3;
                xVar = this.f5256k;
                if (i3 == 0) {
                    this.f5255j = 0;
                }
                E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>", cVar);
                dVarArrB = cVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p111u4.d dVar : dVarArrB) {
            if (dVar != null) {
                dVar.g(p084p4.x.f10867a);
            }
        }
        if (xVar != null) {
            xVar.w(-1);
        }
    }

    public final x g() {
        x xVar;
        synchronized (this) {
            xVar = this.f5256k;
            if (xVar == null) {
                int i = this.i;
                xVar = new x(1, Integer.MAX_VALUE, 2);
                xVar.q(Integer.valueOf(i));
                this.f5256k = xVar;
            }
        }
        return xVar;
    }
}
