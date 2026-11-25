package p123x;

import D4.c;
import E4.k;
import E4.l;
import p084p4.x;
import p113v0.H;
import p113v0.M;
import p113v0.N;

/* JADX INFO: renamed from: x.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1089w extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N[] f13812h;
    public final /* synthetic */ C1090x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f13813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ H f13814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int[] f13815l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1089w(N[] nArr, C1090x c1090x, int i, H h6, int[] iArr) {
        super(1);
        this.f13812h = nArr;
        this.i = c1090x;
        this.f13813j = i;
        this.f13814k = h6;
        this.f13815l = iArr;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        M m6 = (M) obj;
        N[] nArr = this.f13812h;
        int length = nArr.length;
        int i = 0;
        int i3 = 0;
        while (i < length) {
            N n6 = nArr[i];
            int i6 = i3 + 1;
            k.c(n6);
            Object objI = n6.i();
            S s6 = objI instanceof S ? (S) objI : null;
            S0.k layoutDirection = this.f13814k.getLayoutDirection();
            C1090x c1090x = this.i;
            c1090x.getClass();
            A a6 = s6 != null ? s6.f13715c : null;
            int i7 = this.f13813j;
            M.d(m6, n6, a6 != null ? a6.f13674a.a(i7 - n6.f13137h, layoutDirection) : c1090x.f13817b.a(i7 - n6.f13137h, layoutDirection), this.f13815l[i3]);
            i++;
            i3 = i6;
        }
        return x.f10867a;
    }
}
