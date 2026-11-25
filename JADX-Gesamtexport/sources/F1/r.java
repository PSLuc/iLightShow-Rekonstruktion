package F1;

/* JADX INFO: loaded from: classes.dex */
public final class r extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1377h;
    public final /* synthetic */ I i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(I i, int i3) {
        super(1);
        this.f1377h = i3;
        this.i = i;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f1377h) {
            case 0:
                B b6 = (B) obj;
                E4.k.f("destination", b6);
                return Boolean.valueOf(!this.i.f1281m.containsKey(Integer.valueOf(b6.f1247m)));
            default:
                B b7 = (B) obj;
                E4.k.f("destination", b7);
                return Boolean.valueOf(!this.i.f1281m.containsKey(Integer.valueOf(b7.f1247m)));
        }
    }
}
