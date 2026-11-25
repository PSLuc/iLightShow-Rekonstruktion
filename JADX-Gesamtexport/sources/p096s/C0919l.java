package p096s;

import N.C0208d;
import N.C0217h0;
import N.U;
import N.V0;

/* JADX INFO: renamed from: s.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0919l implements V0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0 f12025h;
    public final C0217h0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC0924q f12026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f12028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12029m;

    public /* synthetic */ C0919l(w0 w0Var, Object obj, AbstractC0924q abstractC0924q, int i) {
        this(w0Var, obj, (i & 4) != 0 ? null : abstractC0924q, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // N.V0
    public final Object getValue() {
        return this.i.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.i.getValue() + ", velocity=" + this.f12025h.f12137b.invoke(this.f12026j) + ", isRunning=" + this.f12029m + ", lastFrameTimeNanos=" + this.f12027k + ", finishedTimeNanos=" + this.f12028l + ')';
    }

    public C0919l(w0 w0Var, Object obj, AbstractC0924q abstractC0924q, long j4, long j6, boolean z5) {
        AbstractC0924q abstractC0924qF;
        this.f12025h = w0Var;
        this.i = C0208d.K(obj, U.f3673m);
        if (abstractC0924q != null) {
            abstractC0924qF = AbstractC0909d.f(abstractC0924q);
        } else {
            abstractC0924qF = (AbstractC0924q) w0Var.f12136a.invoke(obj);
            abstractC0924qF.d();
        }
        this.f12026j = abstractC0924qF;
        this.f12027k = j4;
        this.f12028l = j6;
        this.f12029m = z5;
    }
}
