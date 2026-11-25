package p123x;

import D4.c;
import E4.k;
import E4.l;
import E4.u;
import java.util.List;
import p084p4.x;
import p113v0.E;
import p113v0.H;
import p113v0.M;
import p113v0.N;

/* JADX INFO: renamed from: x.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1085s extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N[] f13802h;
    public final /* synthetic */ List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H f13803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f13804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f13805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1086t f13806m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1085s(N[] nArr, List list, H h6, u uVar, u uVar2, C1086t c1086t) {
        super(1);
        this.f13802h = nArr;
        this.i = list;
        this.f13803j = h6;
        this.f13804k = uVar;
        this.f13805l = uVar2;
        this.f13806m = c1086t;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        M m6 = (M) obj;
        N[] nArr = this.f13802h;
        int length = nArr.length;
        int i = 0;
        int i3 = 0;
        while (i3 < length) {
            int i6 = i;
            N n6 = nArr[i3];
            k.d("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable", n6);
            AbstractC1084q.b(m6, n6, (E) this.i.get(i6), this.f13803j.getLayoutDirection(), this.f13804k.f1072h, this.f13805l.f1072h, this.f13806m.f13807a);
            i3++;
            i = i6 + 1;
        }
        return x.f10867a;
    }
}
