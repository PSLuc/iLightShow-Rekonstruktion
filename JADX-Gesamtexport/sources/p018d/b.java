package p018d;

import D4.a;
import E4.l;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements a {
    public static final b i = new b(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f8550j = new b(0, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f8551k = new b(0, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8552h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, int i6) {
        super(i3);
        this.f8552h = i6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f8552h) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
