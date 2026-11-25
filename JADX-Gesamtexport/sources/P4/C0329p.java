package P4;

/* JADX INFO: renamed from: P4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0329p extends E4.l implements D4.e {
    public static final C0329p i = new C0329p(2, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0329p f4667j = new C0329p(2, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0329p(int i3, int i6) {
        super(i3);
        this.f4668h = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4668h) {
            case 0:
                return ((p111u4.i) obj).o((p111u4.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((p111u4.i) obj).o((p111u4.g) obj2);
        }
    }
}
