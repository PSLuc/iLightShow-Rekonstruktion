package W;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends E4.l implements D4.a {
    public static final h i = new h(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f5532j = new h(0, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5533h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i3, int i6) {
        super(i3);
        this.f5533h = i6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f5533h) {
            case 0:
                return new g(new LinkedHashMap());
            default:
                return null;
        }
    }
}
