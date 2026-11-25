package F;

import B.C0031p0;
import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.C0715p;

/* JADX INFO: renamed from: F.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0065g extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ D4.a f1176h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0704e f1177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0709j f1178k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0065g(D4.a aVar, boolean z5, C0704e c0704e, C0709j c0709j) {
        super(1);
        this.f1176h = aVar;
        this.i = z5;
        this.f1177j = c0704e;
        this.f1178k = c0709j;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        p124x0.F f6 = (p124x0.F) obj;
        f6.b();
        if (((Boolean) this.f1176h.invoke()).booleanValue()) {
            boolean z5 = this.i;
            C0709j c0709j = this.f1178k;
            C0704e c0704e = this.f1177j;
            p044i0.b bVar = f6.f13862h;
            if (z5) {
                long jN = bVar.N();
                C0031p0 c0031p0 = bVar.i;
                long jL = c0031p0.l();
                c0031p0.f().l();
                try {
                    ((C0715p) c0031p0.i).y(-1.0f, 1.0f, jN);
                    bVar.d(c0704e, c0709j);
                } finally {
                    c0031p0.f().i();
                    c0031p0.x(jL);
                }
            } else {
                bVar.d(c0704e, c0709j);
            }
        }
        return p084p4.x.f10867a;
    }
}
