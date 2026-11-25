package W;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends E4.l implements D4.c {
    public static final e i = new e(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f5523j = new e(1, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5524h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, int i6) {
        super(i3);
        this.f5524h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f5524h) {
            case 0:
                return new g((Map) obj);
            default:
                return obj;
        }
    }
}
