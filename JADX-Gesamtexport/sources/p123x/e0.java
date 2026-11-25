package p123x;

import D4.c;
import E4.l;
import S0.h;
import S0.j;
import p015c2.AbstractC0473d;
import p084p4.x;
import p113v0.H;
import p113v0.M;
import p113v0.N;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0 f13768h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N f13769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f13771l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, int i, N n6, int i3, H h6) {
        super(1);
        this.f13768h = f0Var;
        this.i = i;
        this.f13769j = n6;
        this.f13770k = i3;
        this.f13771l = h6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [D4.e, E4.l] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        ?? r6 = this.f13768h.f13773v;
        N n6 = this.f13769j;
        M.e((M) obj, n6, ((h) r6.d(new j(AbstractC0473d.b(this.i - n6.f13137h, this.f13770k - n6.i)), this.f13771l.getLayoutDirection())).f4890a);
        return x.f10867a;
    }
}
