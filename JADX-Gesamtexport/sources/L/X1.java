package L;

/* JADX INFO: loaded from: classes.dex */
public final class X1 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2565h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y1 f2575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p113v0.H f2577u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(p113v0.N n6, int i, int i3, p113v0.N n7, p113v0.N n8, p113v0.N n9, p113v0.N n10, p113v0.N n11, p113v0.N n12, p113v0.N n13, p113v0.N n14, Y1 y2, int i6, p113v0.H h6) {
        super(1);
        this.f2565h = n6;
        this.i = i;
        this.f2566j = i3;
        this.f2567k = n7;
        this.f2568l = n8;
        this.f2569m = n9;
        this.f2570n = n10;
        this.f2571o = n11;
        this.f2572p = n12;
        this.f2573q = n13;
        this.f2574r = n14;
        this.f2575s = y2;
        this.f2576t = i6;
        this.f2577u = h6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        p113v0.M m6 = (p113v0.M) obj;
        p113v0.N n6 = this.f2567k;
        p113v0.N n7 = this.f2573q;
        p113v0.H h6 = this.f2577u;
        p113v0.N n8 = this.f2574r;
        p113v0.N n9 = this.f2572p;
        p113v0.N n10 = this.f2571o;
        p113v0.N n11 = this.f2570n;
        p113v0.N n12 = this.f2569m;
        p113v0.N n13 = this.f2568l;
        int i = this.f2566j;
        int i3 = this.i;
        Y1 y2 = this.f2575s;
        p113v0.N n14 = this.f2565h;
        if (n14 != null) {
            y2.getClass();
            int i6 = n14.i;
            int i7 = this.f2576t;
            int i8 = i6 + i7;
            float fA = h6.a();
            float f6 = W1.f2557a;
            p113v0.M.e(m6, n7, 0L);
            float f7 = S1.f2489b;
            int i9 = i - (n8 != null ? n8.i : 0);
            if (n12 != null) {
                p113v0.M.f(m6, n12, 0, Math.round((1 + 0.0f) * ((i9 - n12.i) / 2.0f)));
            }
            if (n11 != null) {
                p113v0.M.f(m6, n11, i3 - n11.f13137h, Math.round((1 + 0.0f) * ((i9 - n11.i) / 2.0f)));
            }
            int iD = G4.a.D(S1.f2489b * fA);
            p113v0.M.f(m6, n14, n12 != null ? n12.f13137h : 0, iD - G4.a.D((iD - i7) * y2.f2584a));
            if (n10 != null) {
                p113v0.M.f(m6, n10, n12 != null ? n12.f13137h : 0, i8);
            }
            if (n9 != null) {
                p113v0.M.f(m6, n9, (i3 - (n11 != null ? n11.f13137h : 0)) - n9.f13137h, i8);
            }
            int i10 = (n12 != null ? n12.f13137h : 0) + (n10 != null ? n10.f13137h : 0);
            p113v0.M.f(m6, n6, i10, i8);
            if (n13 != null) {
                p113v0.M.f(m6, n13, i10, i8);
            }
            if (n8 != null) {
                p113v0.M.f(m6, n8, 0, i9);
            }
        } else {
            y2.getClass();
            float fA2 = h6.a();
            float f8 = W1.f2557a;
            p113v0.M.e(m6, n7, 0L);
            float f9 = S1.f2489b;
            int i11 = i - (n8 != null ? n8.i : 0);
            int iD2 = G4.a.D(y2.f2585b.f13709b * fA2);
            if (n12 != null) {
                p113v0.M.f(m6, n12, 0, Math.round((1 + 0.0f) * ((i11 - n12.i) / 2.0f)));
            }
            if (n11 != null) {
                p113v0.M.f(m6, n11, i3 - n11.f13137h, Math.round((1 + 0.0f) * ((i11 - n11.i) / 2.0f)));
            }
            if (n10 != null) {
                p113v0.M.f(m6, n10, n12 != null ? n12.f13137h : 0, iD2);
            }
            if (n9 != null) {
                p113v0.M.f(m6, n9, (i3 - (n11 != null ? n11.f13137h : 0)) - n9.f13137h, iD2);
            }
            int i12 = (n12 != null ? n12.f13137h : 0) + (n10 != null ? n10.f13137h : 0);
            p113v0.M.f(m6, n6, i12, iD2);
            if (n13 != null) {
                p113v0.M.f(m6, n13, i12, iD2);
            }
            if (n8 != null) {
                p113v0.M.f(m6, n8, 0, i11);
            }
        }
        return p084p4.x.f10867a;
    }
}
