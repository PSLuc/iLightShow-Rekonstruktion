package V0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ E4.v f5461h;
    public final /* synthetic */ y i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S0.i f5462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f5463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5464l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(E4.v vVar, y yVar, S0.i iVar, long j4, long j6) {
        super(0);
        this.f5461h = vVar;
        this.i = yVar;
        this.f5462j = iVar;
        this.f5463k = j4;
        this.f5464l = j6;
    }

    @Override // D4.a
    public final Object invoke() {
        y yVar = this.i;
        A positionProvider = yVar.getPositionProvider();
        S0.k parentLayoutDirection = yVar.getParentLayoutDirection();
        this.f5461h.f1073h = positionProvider.a(this.f5462j, this.f5463k, parentLayoutDirection, this.f5464l);
        return p084p4.x.f10867a;
    }
}
