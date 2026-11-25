package N;

/* JADX INFO: renamed from: N.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0235q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0239t f3778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0206c f3779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D4.e f3780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p080p.v f3782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p080p.x f3783g;

    public C0235q0(C0239t c0239t) {
        this.f3778b = c0239t;
    }

    public static boolean a(D d6, p080p.x xVar) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>", d6);
        return !E4.k.a(d6.j().f3560f, xVar.e(d6));
    }

    public final boolean b() {
        if (this.f3778b != null) {
            C0206c c0206c = this.f3779c;
            if (c0206c != null ? c0206c.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final int c(Object obj) {
        int iP;
        C0239t c0239t = this.f3778b;
        if (c0239t == null || (iP = c0239t.p(this, obj)) == 0) {
            return 1;
        }
        return iP;
    }

    public final void d() {
        C0239t c0239t = this.f3778b;
        if (c0239t != null) {
            c0239t.f3813v = true;
        }
        this.f3778b = null;
        this.f3782f = null;
        this.f3783g = null;
    }

    public final void e(boolean z5) {
        if (z5) {
            this.f3777a |= 32;
        } else {
            this.f3777a &= -33;
        }
    }
}
