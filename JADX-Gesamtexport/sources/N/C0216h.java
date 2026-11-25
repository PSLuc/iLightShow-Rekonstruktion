package N;

/* JADX INFO: renamed from: N.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0216h extends E4.l implements D4.e {
    public static final C0216h i = new C0216h(2, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0216h f3702j = new C0216h(2, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3703h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0216h(int i3, int i6) {
        super(i3);
        this.f3703h = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f3703h) {
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
