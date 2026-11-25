package N;

import android.os.Looper;

/* JADX INFO: renamed from: N.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0202a extends E4.l implements D4.a {
    public static final C0202a i = new C0202a(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0202a f3680j = new C0202a(0, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3681h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0202a(int i3, int i6) {
        super(i3);
        this.f3681h = i6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f3681h) {
            case 0:
                return Looper.getMainLooper() != null ? B.f3554h : B0.f3555h;
            default:
                C0208d.x("Unexpected call to default provider");
                throw null;
        }
    }
}
