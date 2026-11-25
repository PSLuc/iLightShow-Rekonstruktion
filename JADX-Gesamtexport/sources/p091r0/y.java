package p091r0;

import D4.e;
import P4.AbstractC0336x;
import P4.C0319f;
import P4.i0;
import S0.b;
import S1.V;
import S1.h0;
import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import p015c2.AbstractC0473d;
import p030f0.f;
import p111u4.d;
import p111u4.i;
import p111u4.j;
import p122w4.a;
import p124x0.AbstractC1098f;
import p130y0.G0;

/* JADX INFO: loaded from: classes.dex */
public final class y implements b, d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0319f f11545h;
    public final /* synthetic */ A i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0319f f11546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f11547k = j.i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f11548l;

    public y(A a6, C0319f c0319f) {
        this.f11548l = a6;
        this.f11545h = c0319f;
        this.i = a6;
    }

    @Override // S0.b
    public final float C(long j4) {
        return this.i.C(j4);
    }

    @Override // S0.b
    public final int H(float f6) {
        return this.i.H(f6);
    }

    @Override // S0.b
    public final long S(long j4) {
        return this.i.S(j4);
    }

    @Override // S0.b
    public final float V(long j4) {
        return this.i.V(j4);
    }

    @Override // S0.b
    public final float a() {
        return this.i.a();
    }

    public final Object b(j jVar, a aVar) {
        C0319f c0319f = new C0319f(1, AbstractC0473d.F(aVar));
        c0319f.u();
        this.f11547k = jVar;
        this.f11546j = c0319f;
        Object objT = c0319f.t();
        v4.a aVar2 = v4.a.f13292h;
        return objT;
    }

    @Override // S0.b
    public final long b0(float f6) {
        return this.i.b0(f6);
    }

    public final long c() {
        A a6 = this.f11548l;
        a6.getClass();
        long jS = a6.S(AbstractC1098f.s(a6).f13852z.g());
        long j4 = a6.f11462D;
        return h0.f(Math.max(0.0f, f.d(jS) - ((int) (j4 >> 32))) / 2.0f, Math.max(0.0f, f.b(jS) - ((int) (j4 & 4294967295L))) / 2.0f);
    }

    public final G0 d() {
        A a6 = this.f11548l;
        a6.getClass();
        return AbstractC1098f.s(a6).f13852z;
    }

    @Override // p111u4.d
    public final i e() {
        return j.f12751h;
    }

    @Override // p111u4.d
    public final void g(Object obj) {
        A a6 = this.f11548l;
        synchronized (a6.f11459A) {
            a6.f11459A.o(this);
        }
        this.f11545h.g(obj);
    }

    @Override // S0.b
    public final float i0(int i) {
        return this.i.i0(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(long j4, e eVar, a aVar) throws Throwable {
        v vVar;
        Throwable th;
        i0 i0Var;
        C0319f c0319f;
        if (aVar instanceof v) {
            vVar = (v) aVar;
            int i = vVar.f11538n;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.f11538n = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, aVar);
            }
        } else {
            vVar = new v(this, aVar);
        }
        Object objD = vVar.f11536l;
        Object obj = v4.a.f13292h;
        int i3 = vVar.f11538n;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0Var = vVar.f11535k;
            try {
                V.O(objD);
                i0Var.c(CancelTimeoutCancellationException.f6719h);
                return objD;
            } catch (Throwable th2) {
                th = th2;
                i0Var.c(CancelTimeoutCancellationException.f6719h);
                throw th;
            }
        }
        V.O(objD);
        if (j4 <= 0 && (c0319f = this.f11546j) != null) {
            c0319f.g(V.v(new PointerEventTimeoutCancellationException(j4)));
        }
        i0 i0VarO = AbstractC0336x.o(this.f11548l.n0(), null, new w(j4, this, null), 3);
        try {
            vVar.f11535k = i0VarO;
            vVar.f11538n = 1;
            objD = eVar.d(this, vVar);
            if (objD == obj) {
                return obj;
            }
            i0Var = i0VarO;
            i0Var.c(CancelTimeoutCancellationException.f6719h);
            return objD;
        } catch (Throwable th3) {
            th = th3;
            i0Var = i0VarO;
            i0Var.c(CancelTimeoutCancellationException.f6719h);
            throw th;
        }
    }

    @Override // S0.b
    public final float j0(float f6) {
        return f6 / this.i.a();
    }

    @Override // S0.b
    public final float n() {
        return this.i.n();
    }

    @Override // S0.b
    public final long v(float f6) {
        return this.i.v(f6);
    }

    @Override // S0.b
    public final long w(long j4) {
        return this.i.w(j4);
    }

    @Override // S0.b
    public final float y(float f6) {
        return this.i.a() * f6;
    }
}
