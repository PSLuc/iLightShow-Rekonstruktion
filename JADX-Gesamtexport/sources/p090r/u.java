package p090r;

import D4.c;
import E4.l;
import p035g0.P;
import p035g0.r;
import p040h0.d;
import p096s.AbstractC0909d;
import p096s.C0921n;
import p096s.C0923p;

/* JADX INFO: loaded from: classes.dex */
public final class u extends l implements c {
    public static final u i = new u(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u f11436j = new u(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u f11437k = new u(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u f11438l = new u(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u f11439m = new u(1, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f11440n = new u(1, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f11441o = new u(1, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i3, int i6) {
        super(i3);
        this.f11442h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f11442h) {
            case 0:
                long jA = r.a(((r) obj).f9087a, d.f9240t);
                return new C0923p(r.d(jA), r.h(jA), r.g(jA), r.e(jA));
            case 1:
                long j4 = ((P) obj).f9053a;
                return new C0921n(P.b(j4), P.c(j4));
            case 2:
                C0921n c0921n = (C0921n) obj;
                float f6 = c0921n.f12047a;
                return new P((((long) Float.floatToRawIntBits(c0921n.f12048b)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
            case 3:
                return AbstractC0909d.j(7, null);
            case 4:
                ((Number) obj).intValue();
                return 0;
            case 5:
                ((Number) obj).intValue();
                return 0;
            default:
                return B.f11353c;
        }
    }
}
