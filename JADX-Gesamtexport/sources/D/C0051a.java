package D;

/* JADX INFO: renamed from: D.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0051a extends E4.l implements D4.c {
    public static final C0051a i = new C0051a(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0051a f668j = new C0051a(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0051a f669k = new C0051a(1, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f670h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0051a(int i3, int i6) {
        super(i3);
        this.f670h = i6;
    }

    @Override // D4.c
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f670h) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i3 = ((M0.l) obj).f3429a;
                break;
        }
        return p084p4.x.f10867a;
    }
}
