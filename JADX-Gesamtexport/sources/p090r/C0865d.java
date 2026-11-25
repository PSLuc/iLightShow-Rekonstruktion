package p090r;

import D4.c;
import E4.l;
import S0.k;
import p015c2.AbstractC0473d;
import p084p4.x;
import p113v0.M;
import p113v0.N;

/* JADX INFO: renamed from: r.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0865d extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N[] f11399h;
    public final /* synthetic */ C0866e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11401k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0865d(N[] nArr, C0866e c0866e, int i, int i3) {
        super(1);
        this.f11399h = nArr;
        this.i = c0866e;
        this.f11400j = i;
        this.f11401k = i3;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        M m6 = (M) obj;
        for (N n6 : this.f11399h) {
            if (n6 != null) {
                long jA = this.i.f11402a.f11413b.a(AbstractC0473d.b(n6.f13137h, n6.i), AbstractC0473d.b(this.f11400j, this.f11401k), k.f4897h);
                M.d(m6, n6, (int) (jA >> 32), (int) (jA & 4294967295L));
            }
        }
        return x.f10867a;
    }
}
