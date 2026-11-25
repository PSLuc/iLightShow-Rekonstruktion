package p124x0;

import E4.k;
import N.C0237s;
import P.d;
import Z.m;
import Z.n;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f13956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f13958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f13959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0237s f13961f;

    public T(C0237s c0237s, n nVar, int i, d dVar, d dVar2, boolean z5) {
        this.f13961f = c0237s;
        this.f13956a = nVar;
        this.f13957b = i;
        this.f13958c = dVar;
        this.f13959d = dVar2;
        this.f13960e = z5;
    }

    public final boolean a(int i, int i3) {
        d dVar = this.f13958c;
        int i6 = this.f13957b;
        m mVar = (m) dVar.f4582h[i + i6];
        m mVar2 = (m) this.f13959d.f4582h[i6 + i3];
        U u6 = V.f13962a;
        return k.a(mVar, mVar2) || mVar.getClass() == mVar2.getClass();
    }
}
