package p035g0;

import S0.b;
import S0.k;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class J implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9017h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f9018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f9019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f9020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f9023o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f9024p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f9025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M f9026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f9028t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f9029u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k f9030v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public E f9031w;

    @Override // S0.b
    public final float a() {
        return this.f9029u.a();
    }

    public final void b(float f6) {
        if (this.f9019k == f6) {
            return;
        }
        this.f9017h |= 4;
        this.f9019k = f6;
    }

    public final void c(long j4) {
        if (r.c(this.f9021m, j4)) {
            return;
        }
        this.f9017h |= 64;
        this.f9021m = j4;
    }

    public final void d(boolean z5) {
        if (this.f9027s != z5) {
            this.f9017h |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.f9027s = z5;
        }
    }

    public final void e(float f6) {
        if (this.i == f6) {
            return;
        }
        this.f9017h |= 1;
        this.i = f6;
    }

    public final void g(float f6) {
        if (this.f9018j == f6) {
            return;
        }
        this.f9017h |= 2;
        this.f9018j = f6;
    }

    public final void h(float f6) {
        if (this.f9020l == f6) {
            return;
        }
        this.f9017h |= 32;
        this.f9020l = f6;
    }

    public final void i(M m6) {
        if (E4.k.a(this.f9026r, m6)) {
            return;
        }
        this.f9017h |= 8192;
        this.f9026r = m6;
    }

    public final void j(long j4) {
        if (r.c(this.f9022n, j4)) {
            return;
        }
        this.f9017h |= 128;
        this.f9022n = j4;
    }

    public final void k(long j4) {
        if (P.a(this.f9025q, j4)) {
            return;
        }
        this.f9017h |= 4096;
        this.f9025q = j4;
    }

    @Override // S0.b
    public final float n() {
        return this.f9029u.n();
    }
}
