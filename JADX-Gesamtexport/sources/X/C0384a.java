package X;

/* JADX INFO: renamed from: X.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0384a extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5667h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0384a(int i, Object obj) {
        super(1);
        this.f5667h = i;
        this.i = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f5667h) {
            case 0:
                ?? r6 = this.i;
                int size = r6.size();
                for (int i = 0; i < size; i++) {
                    ((D4.c) r6.get(i)).invoke(obj);
                }
                return p084p4.x.f10867a;
            default:
                return Boolean.valueOf(E4.k.a(obj, this.i));
        }
    }
}
