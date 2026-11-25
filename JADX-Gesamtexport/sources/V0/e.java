package V0;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e extends E4.l implements D4.a {
    public static final e i = new e(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f5417j = new e(0, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f5418k = new e(0, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5419h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, int i6) {
        super(i3);
        this.f5419h = i6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f5419h) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
