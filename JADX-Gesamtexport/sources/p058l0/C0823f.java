package p058l0;

import E4.k;
import S0.e;
import Z2.f;
import p035g0.r;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: l0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0823f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f10281k = new f(27, false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f10282l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f10288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10290h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10291j;

    public C0823f(String str, float f6, float f7, float f8, float f9, F f10, long j4, int i, boolean z5) {
        int i3;
        synchronized (f10281k) {
            i3 = f10282l;
            f10282l = i3 + 1;
        }
        this.f10283a = str;
        this.f10284b = f6;
        this.f10285c = f7;
        this.f10286d = f8;
        this.f10287e = f9;
        this.f10288f = f10;
        this.f10289g = j4;
        this.f10290h = i;
        this.i = z5;
        this.f10291j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0823f)) {
            return false;
        }
        C0823f c0823f = (C0823f) obj;
        return k.a(this.f10283a, c0823f.f10283a) && e.a(this.f10284b, c0823f.f10284b) && e.a(this.f10285c, c0823f.f10285c) && this.f10286d == c0823f.f10286d && this.f10287e == c0823f.f10287e && this.f10288f.equals(c0823f.f10288f) && r.c(this.f10289g, c0823f.f10289g) && this.f10290h == c0823f.f10290h && this.i == c0823f.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f10288f.hashCode() + p012c.k.i(this.f10287e, p012c.k.i(this.f10286d, p012c.k.i(this.f10285c, p012c.k.i(this.f10284b, this.f10283a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = r.f9086m;
        return Boolean.hashCode(this.i) + AbstractC0916i.c(this.f10290h, p012c.k.l(iHashCode, 31, this.f10289g), 31);
    }
}
