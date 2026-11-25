package Q4;

import B.C0005c0;
import E4.k;
import O1.n;
import P4.A;
import P4.AbstractC0331s;
import P4.C0319f;
import P4.C0332t;
import P4.D;
import P4.T;
import U4.m;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p111u4.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0331s implements A {
    private volatile c _immediate;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f4701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f4702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f4704m;

    public c(Handler handler, String str, boolean z5) {
        this.f4701j = handler;
        this.f4702k = str;
        this.f4703l = z5;
        this._immediate = z5 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f4704m = cVar;
    }

    @Override // P4.AbstractC0331s
    public final void X(i iVar, Runnable runnable) {
        if (this.f4701j.post(runnable)) {
            return;
        }
        Z(iVar, runnable);
    }

    @Override // P4.AbstractC0331s
    public final boolean Y() {
        return (this.f4703l && k.a(Looper.myLooper(), this.f4701j.getLooper())) ? false : true;
    }

    public final void Z(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        T t6 = (T) iVar.J(C0332t.i);
        if (t6 != null) {
            t6.c(cancellationException);
        }
        D.f4606c.X(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f4701j == this.f4701j;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4701j);
    }

    @Override // P4.AbstractC0331s
    public final String toString() {
        c cVar;
        String str;
        W4.d dVar = D.f4604a;
        c cVar2 = m.f5373a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f4704m;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f4702k;
        if (string == null) {
            string = this.f4701j.toString();
        }
        if (!this.f4703l) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // P4.A
    public final void v(long j4, C0319f c0319f) {
        n nVar = new n(c0319f, 6, this);
        if (j4 > 4611686018427387903L) {
            j4 = 4611686018427387903L;
        }
        if (this.f4701j.postDelayed(nVar, j4)) {
            c0319f.w(new C0005c0(this, 24, nVar));
        } else {
            Z(c0319f.f4651l, nVar);
        }
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
