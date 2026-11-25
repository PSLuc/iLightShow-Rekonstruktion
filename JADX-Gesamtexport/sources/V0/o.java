package V0;

import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class o extends E4.l implements D4.e {
    public static final o i = new o(2, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o f5439j = new o(2, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5440h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i3, int i6) {
        super(i3);
        this.f5440h = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f5440h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
