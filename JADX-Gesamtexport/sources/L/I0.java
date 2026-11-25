package L;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2315h;
    public final /* synthetic */ ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B.k1 f2318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p123x.a0 f2321o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p113v0.Y f2322p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2323q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f2325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2326t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Integer f2327u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, B.k1 k1Var, int i, int i3, p123x.a0 a0Var, p113v0.Y y2, int i6, int i7, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f2315h = arrayList;
        this.i = arrayList2;
        this.f2316j = arrayList3;
        this.f2317k = arrayList4;
        this.f2318l = k1Var;
        this.f2319m = i;
        this.f2320n = i3;
        this.f2321o = a0Var;
        this.f2322p = y2;
        this.f2323q = i6;
        this.f2324r = i7;
        this.f2325s = num;
        this.f2326t = arrayList5;
        this.f2327u = num2;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        int i;
        p113v0.M m6 = (p113v0.M) obj;
        ArrayList arrayList = this.f2315h;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p113v0.M.d(m6, (p113v0.N) arrayList.get(i3), 0, 0);
        }
        ArrayList arrayList2 = this.i;
        int size2 = arrayList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            p113v0.M.d(m6, (p113v0.N) arrayList2.get(i6), 0, 0);
        }
        ArrayList arrayList3 = this.f2316j;
        int size3 = arrayList3.size();
        int i7 = 0;
        while (true) {
            i = this.f2323q;
            if (i7 >= size3) {
                break;
            }
            p113v0.N n6 = (p113v0.N) arrayList3.get(i7);
            int i8 = (this.f2319m - this.f2320n) / 2;
            p113v0.Y y2 = this.f2322p;
            p113v0.M.d(m6, n6, this.f2321o.a(y2, y2.getLayoutDirection()) + i8, i - this.f2324r);
            i7++;
        }
        ArrayList arrayList4 = this.f2317k;
        int size4 = arrayList4.size();
        for (int i9 = 0; i9 < size4; i9++) {
            p113v0.N n7 = (p113v0.N) arrayList4.get(i9);
            Integer num = this.f2325s;
            p113v0.M.d(m6, n7, 0, i - (num != null ? num.intValue() : 0));
        }
        B.k1 k1Var = this.f2318l;
        if (k1Var != null) {
            ArrayList arrayList5 = this.f2326t;
            int size5 = arrayList5.size();
            for (int i10 = 0; i10 < size5; i10++) {
                p113v0.N n8 = (p113v0.N) arrayList5.get(i10);
                Integer num2 = this.f2327u;
                E4.k.c(num2);
                p113v0.M.d(m6, n8, k1Var.f351a, i - num2.intValue());
            }
        }
        return p084p4.x.f10867a;
    }
}
