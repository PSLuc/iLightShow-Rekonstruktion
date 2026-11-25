package F;

import B.AbstractC0029o0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: renamed from: F.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0075q implements InterfaceC0067i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0075q f1200b = new C0075q(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0075q f1201c = new C0075q(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0074p f1202d = new C0074p(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0074p f1203e = new C0074p(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0074p f1204f = new C0074p(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0074p f1205g = new C0074p(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1206a;

    public /* synthetic */ C0075q(int i) {
        this.f1206a = i;
    }

    @Override // F.InterfaceC0067i
    public long a(C0071m c0071m, int i) {
        switch (this.f1206a) {
            case 0:
                String str = ((G0.G) c0071m.f1192e).f1458a.f1449a.f1494h;
                return AbstractC0599v0.d(AbstractC0029o0.r(str, i), AbstractC0029o0.q(str, i));
            default:
                return ((G0.G) c0071m.f1192e).k(i);
        }
    }
}
