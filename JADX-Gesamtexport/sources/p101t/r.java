package p101t;

import D4.c;
import E0.d;
import E0.h;
import E0.o;
import E0.q;
import E4.l;
import K4.e;
import p084p4.x;
import p124x0.F;

/* JADX INFO: loaded from: classes.dex */
public final class r extends l implements c {
    public static final r i = new r(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r f12404j = new r(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f12405k = new r(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f12406l = new r(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r f12407m = new r(1, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12408h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i3, int i6) {
        super(i3);
        this.f12408h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        x xVar = x.f10867a;
        switch (this.f12408h) {
            case 0:
                ((F) obj).b();
                return xVar;
            case 1:
                return xVar;
            case 2:
                ((Number) obj).longValue();
                return xVar;
            case 3:
                d dVar = d.f907d;
                e[] eVarArr = q.f997a;
                E0.r rVar = o.f973c;
                e eVar = q.f997a[1];
                rVar.a((h) obj, dVar);
                return xVar;
            default:
                return new s0(((Number) obj).intValue());
        }
    }
}
