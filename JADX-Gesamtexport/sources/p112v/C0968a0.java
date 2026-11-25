package p112v;

import S0.b;
import S1.V;
import X4.d;
import androidx.compose.foundation.gestures.GestureCancellationException;
import p084p4.x;
import p122w4.c;
import v4.a;

/* JADX INFO: renamed from: v.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0968a0 implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f12946h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f12948k = new d();

    public C0968a0(b bVar) {
        this.f12946h = bVar;
    }

    @Override // S0.b
    public final float C(long j4) {
        return this.f12946h.C(j4);
    }

    @Override // S0.b
    public final int H(float f6) {
        return this.f12946h.H(f6);
    }

    @Override // S0.b
    public final long S(long j4) {
        return this.f12946h.S(j4);
    }

    @Override // S0.b
    public final float V(long j4) {
        return this.f12946h.V(j4);
    }

    @Override // S0.b
    public final float a() {
        return this.f12946h.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c cVar) {
        X x6;
        if (cVar instanceof X) {
            x6 = (X) cVar;
            int i = x6.f12929m;
            if ((i & Integer.MIN_VALUE) != 0) {
                x6.f12929m = i - Integer.MIN_VALUE;
            } else {
                x6 = new X(this, cVar);
            }
        } else {
            x6 = new X(this, cVar);
        }
        Object objD = x6.f12927k;
        Object obj = a.f13292h;
        int i3 = x6.f12929m;
        if (i3 == 0) {
            V.O(objD);
            x6.f12929m = 1;
            objD = d(x6);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(objD);
        }
        if (((Boolean) objD).booleanValue()) {
            return x.f10867a;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }

    @Override // S0.b
    public final long b0(float f6) {
        return this.f12946h.b0(f6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(c cVar) {
        Y y2;
        if (cVar instanceof Y) {
            y2 = (Y) cVar;
            int i = y2.f12937n;
            if ((i & Integer.MIN_VALUE) != 0) {
                y2.f12937n = i - Integer.MIN_VALUE;
            } else {
                y2 = new Y(this, cVar);
            }
        } else {
            y2 = new Y(this, cVar);
        }
        Object obj = y2.f12935l;
        a aVar = a.f13292h;
        int i3 = y2.f12937n;
        if (i3 == 0) {
            V.O(obj);
            y2.f12934k = this;
            y2.f12937n = 1;
            if (this.f12948k.c(y2) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = y2.f12934k;
            V.O(obj);
        }
        this.i = false;
        this.f12947j = false;
        return x.f10867a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(c cVar) {
        Z z5;
        if (cVar instanceof Z) {
            z5 = (Z) cVar;
            int i = z5.f12942n;
            if ((i & Integer.MIN_VALUE) != 0) {
                z5.f12942n = i - Integer.MIN_VALUE;
            } else {
                z5 = new Z(this, cVar);
            }
        } else {
            z5 = new Z(this, cVar);
        }
        Object obj = z5.f12940l;
        a aVar = a.f13292h;
        int i3 = z5.f12942n;
        if (i3 == 0) {
            V.O(obj);
            if (!this.i && !this.f12947j) {
                z5.f12939k = this;
                z5.f12942n = 1;
                if (this.f12948k.c(z5) == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(this.i);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = z5.f12939k;
        V.O(obj);
        this.f12948k.e(null);
        return Boolean.valueOf(this.i);
    }

    @Override // S0.b
    public final float i0(int i) {
        return this.f12946h.i0(i);
    }

    @Override // S0.b
    public final float j0(float f6) {
        return this.f12946h.j0(f6);
    }

    @Override // S0.b
    public final float n() {
        return this.f12946h.n();
    }

    @Override // S0.b
    public final long v(float f6) {
        return this.f12946h.v(f6);
    }

    @Override // S0.b
    public final long w(long j4) {
        return this.f12946h.w(j4);
    }

    @Override // S0.b
    public final float y(float f6) {
        return this.f12946h.y(f6);
    }
}
