package p018d;

import D4.e;
import F.L;
import R4.b;
import U4.d;
import p012c.C0464b;
import p012c.u;

/* JADX INFO: loaded from: classes.dex */
public final class i extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f8563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f8564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L f8565f;

    @Override // p012c.u
    public final void a() {
        L l6 = this.f8565f;
        if (l6 != null) {
            l6.c();
        }
        L l7 = this.f8565f;
        if (l7 == null) {
            return;
        }
        l7.f1105b = false;
    }

    @Override // p012c.u
    public final void b() {
        L l6 = this.f8565f;
        if (l6 != null && !l6.f1105b) {
            l6.c();
            this.f8565f = null;
        }
        if (this.f8565f == null) {
            this.f8565f = new L(this.f8563d, false, this.f8564e, this);
        }
        L l7 = this.f8565f;
        if (l7 != null) {
            ((b) l7.f1106c).g(null, false);
        }
        L l8 = this.f8565f;
        if (l8 == null) {
            return;
        }
        l8.f1105b = false;
    }

    @Override // p012c.u
    public final void c(C0464b c0464b) {
        super.c(c0464b);
        L l6 = this.f8565f;
        if (l6 != null) {
            ((b) l6.f1106c).j(c0464b);
        }
    }

    @Override // p012c.u
    public final void d(C0464b c0464b) {
        super.d(c0464b);
        L l6 = this.f8565f;
        if (l6 != null) {
            l6.c();
        }
        if (this.f7179a) {
            this.f8565f = new L(this.f8563d, true, this.f8564e, this);
        }
    }
}
