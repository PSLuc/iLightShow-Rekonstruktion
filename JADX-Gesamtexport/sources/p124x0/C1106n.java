package p124x0;

import D4.a;
import E4.l;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: x0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1106n extends l implements a {
    public static final C1106n i = new C1106n(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1106n f14047j = new C1106n(0, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14048h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1106n(int i3, int i6) {
        super(i3);
        this.f14048h = i6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f14048h) {
            case 0:
                return new LinkedHashMap();
            default:
                return new D(3);
        }
    }
}
