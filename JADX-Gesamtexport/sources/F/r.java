package F;

/* JADX INFO: loaded from: classes.dex */
public final class r extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0071m f1207h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ L f1209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1210l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0071m c0071m, int i, int i3, L l6, p084p4.f fVar) {
        super(0);
        this.f1207h = c0071m;
        this.i = i;
        this.f1208j = i3;
        this.f1209k = l6;
        this.f1210l = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p4.f] */
    @Override // D4.a
    public final Object invoke() {
        int iIntValue = ((Number) this.f1210l.getValue()).intValue();
        L l6 = this.f1209k;
        boolean z5 = l6.g() == 1;
        C0071m c0071m = this.f1207h;
        G0.G g6 = (G0.G) c0071m.f1192e;
        int i = this.i;
        long jK = g6.k(i);
        int i3 = G0.I.f1469c;
        int iH = (int) (jK >> 32);
        int iE = g6.e(iH);
        int i6 = g6.f1459b.f1518f;
        if (iE != iIntValue) {
            iH = iIntValue >= i6 ? g6.h(i6 - 1) : g6.h(iIntValue);
        }
        int iD = (int) (jK & 4294967295L);
        if (g6.e(iD) != iIntValue) {
            iD = iIntValue >= i6 ? g6.d(i6 - 1, false) : g6.d(iIntValue, false);
        }
        int i7 = this.f1208j;
        if (iH == i7) {
            return c0071m.b(iD);
        }
        if (iD == i7) {
            return c0071m.b(iH);
        }
        if (!(l6.f1105b ^ z5) ? i >= iH : i > iD) {
            iH = iD;
        }
        return c0071m.b(iH);
    }
}
