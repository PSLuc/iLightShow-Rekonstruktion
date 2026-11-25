package L;

/* JADX INFO: renamed from: L.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0189x extends E4.l implements D4.c {
    public static final C0189x i = new C0189x(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0189x f2967j = new C0189x(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0189x f2968k = new C0189x(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0189x f2969l = new C0189x(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0189x f2970m = new C0189x(1, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2971h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0189x(int i3, int i6) {
        super(i3);
        this.f2971h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        p084p4.x xVar = p084p4.x.f10867a;
        switch (this.f2971h) {
            case 0:
                E0.q.g((E0.h) obj, 0);
                break;
            case 1:
                E0.q.g((E0.h) obj, 0);
                break;
            case 2:
                break;
            case 3:
                K4.e[] eVarArr = E0.q.f997a;
                E0.r rVar = E0.o.f981l;
                K4.e eVar = E0.q.f997a[5];
                rVar.a((E0.h) obj, Boolean.TRUE);
                break;
            default:
                break;
        }
        return xVar;
    }
}
