package X;

/* JADX INFO: renamed from: X.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0385b extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5668h;
    public final /* synthetic */ D4.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D4.c f5669j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0385b(D4.c cVar, D4.c cVar2, int i) {
        super(1);
        this.f5668h = i;
        this.i = cVar;
        this.f5669j = cVar2;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        int i;
        switch (this.f5668h) {
            case 0:
                m mVar = (m) obj;
                synchronized (o.f5709b) {
                    i = o.f5711d;
                    o.f5711d = i + 1;
                }
                return new C0387d(i, mVar, this.i, this.f5669j);
            case 1:
                this.i.invoke(obj);
                this.f5669j.invoke(obj);
                return p084p4.x.f10867a;
            default:
                this.i.invoke(obj);
                this.f5669j.invoke(obj);
                return p084p4.x.f10867a;
        }
    }
}
