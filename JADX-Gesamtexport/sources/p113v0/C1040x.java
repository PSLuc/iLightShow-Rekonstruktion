package p113v0;

import D4.c;
import java.util.Map;
import p089q4.r;
import p090r.v;

/* JADX INFO: renamed from: v0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1040x implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f13197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f13198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G f13200e;

    public /* synthetic */ C1040x(G g6, B b6, int i, G g7, int i3) {
        this.f13196a = i3;
        this.f13198c = b6;
        this.f13199d = i;
        this.f13200e = g7;
        this.f13197b = g6;
    }

    @Override // p113v0.G
    public final Map b() {
        switch (this.f13196a) {
            case 0:
                break;
        }
        return this.f13197b.b();
    }

    @Override // p113v0.G
    public final void c() {
        switch (this.f13196a) {
            case 0:
                B b6 = this.f13198c;
                b6.f13117k = this.f13199d;
                this.f13200e.c();
                r.S(b6.f13124r.entrySet(), new v(10, b6));
                break;
            default:
                B b7 = this.f13198c;
                b7.f13116j = this.f13199d;
                this.f13200e.c();
                b7.d(b7.f13116j);
                break;
        }
    }

    @Override // p113v0.G
    public final int d() {
        switch (this.f13196a) {
            case 0:
                break;
        }
        return this.f13197b.d();
    }

    @Override // p113v0.G
    public final c e() {
        switch (this.f13196a) {
            case 0:
                break;
        }
        return this.f13197b.e();
    }

    @Override // p113v0.G
    public final int f() {
        switch (this.f13196a) {
            case 0:
                break;
        }
        return this.f13197b.f();
    }
}
