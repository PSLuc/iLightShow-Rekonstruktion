package V0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends E4.l implements D4.c {
    public static final c i = new c(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f5410j = new c(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f5411k = new c(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f5412l = new c(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f5413m = new c(1, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f5414n = new c(1, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5415h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, int i6) {
        super(i3);
        this.f5415h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        p084p4.x xVar = p084p4.x.f10867a;
        switch (this.f5415h) {
            case 0:
                K4.e[] eVarArr = E0.q.f997a;
                ((E0.h) obj).i(E0.o.f987r, xVar);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                K4.e[] eVarArr2 = E0.q.f997a;
                ((E0.h) obj).i(E0.o.f986q, xVar);
                break;
            case 4:
                break;
            default:
                y yVar = (y) obj;
                if (yVar.isAttachedToWindow()) {
                    yVar.l();
                }
                break;
        }
        return xVar;
    }
}
