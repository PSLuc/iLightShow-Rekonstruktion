package F;

import p096s.C0921n;

/* JADX INFO: loaded from: classes.dex */
public final class C extends E4.l implements D4.c {
    public static final C i = new C(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C f1083j = new C(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C f1084k = new C(1, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1085h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(int i3, int i6) {
        super(i3);
        this.f1085h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f1085h) {
            case 0:
                long j4 = ((p030f0.c) obj).f8837a;
                return p081p0.c.s0(j4) ? new C0921n(p030f0.c.d(j4), p030f0.c.e(j4)) : H.f1096a;
            case 1:
                C0921n c0921n = (C0921n) obj;
                return new p030f0.c(p081p0.c.y(c0921n.f12047a, c0921n.f12048b));
            default:
                return p084p4.x.f10867a;
        }
    }
}
