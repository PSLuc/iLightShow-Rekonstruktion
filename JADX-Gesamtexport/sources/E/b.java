package E;

import G0.J;
import com.fasterxml.jackson.databind.deser.std.d0;
import p020d2.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f827h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S0.k f828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S0.b f830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L0.d f831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f833f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f834g = Float.NaN;

    public b(S0.k kVar, J j4, S0.b bVar, L0.d dVar) {
        this.f828a = kVar;
        this.f829b = j4;
        this.f830c = bVar;
        this.f831d = dVar;
        this.f832e = n.I(j4, kVar);
    }

    public final long a(int i, long j4) {
        int i3;
        float f6 = this.f834g;
        float f7 = this.f833f;
        if (Float.isNaN(f6) || Float.isNaN(f7)) {
            float fB = d0.h(c.f835a, this.f832e, p081p0.c.u(0, 0, 15), this.f830c, this.f831d, 1, 96).b();
            float fB2 = d0.h(c.f836b, this.f832e, p081p0.c.u(0, 0, 15), this.f830c, this.f831d, 2, 96).b() - fB;
            this.f834g = fB;
            this.f833f = fB2;
            f7 = fB2;
            f6 = fB;
        }
        if (i != 1) {
            int iRound = Math.round((f7 * (i - 1)) + f6);
            i3 = iRound >= 0 ? iRound : 0;
            int iG = S0.a.g(j4);
            if (i3 > iG) {
                i3 = iG;
            }
        } else {
            i3 = S0.a.i(j4);
        }
        return p081p0.c.t(S0.a.j(j4), S0.a.h(j4), i3, S0.a.g(j4));
    }
}
