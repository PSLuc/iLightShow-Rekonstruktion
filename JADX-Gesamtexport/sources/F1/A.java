package F1;

/* JADX INFO: loaded from: classes.dex */
public final class A extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1241h;
    public final /* synthetic */ y i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(y yVar, int i) {
        super(1);
        this.f1241h = i;
        this.i = yVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f1241h) {
            case 0:
                String str = (String) obj;
                E4.k.f("key", str);
                return Boolean.valueOf(!this.i.c().contains(str));
            default:
                String str2 = (String) obj;
                E4.k.f("key", str2);
                return Boolean.valueOf(!this.i.c().contains(str2));
        }
    }
}
