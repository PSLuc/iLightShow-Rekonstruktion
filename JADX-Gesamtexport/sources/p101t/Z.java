package p101t;

import D4.a;
import E4.l;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends l implements a {
    public static final Z i = new Z(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Z f12285j = new Z(0, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12286h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(int i3, int i6) {
        super(i3);
        this.f12286h = i6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f12286h) {
            case 0:
                return D.f12227a;
            case 1:
                return new k0();
            default:
                return new s0(0);
        }
    }
}
