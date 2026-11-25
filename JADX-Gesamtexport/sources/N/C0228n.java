package N;

/* JADX INFO: renamed from: N.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0228n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3731b;

    public /* synthetic */ C0228n(int i, Object obj) {
        this.f3730a = i;
        this.f3731b = obj;
    }

    public final void a() {
        switch (this.f3730a) {
            case 0:
                ((C0230o) this.f3731b).f3769z--;
                break;
            default:
                ((X.w) this.f3731b).f5738j--;
                break;
        }
    }

    public final void b() {
        switch (this.f3730a) {
            case 0:
                ((C0230o) this.f3731b).f3769z++;
                break;
            default:
                ((X.w) this.f3731b).f5738j++;
                break;
        }
    }
}
