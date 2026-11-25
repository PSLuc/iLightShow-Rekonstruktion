package p113v0;

import D4.c;
import E4.l;
import java.util.Map;
import p124x0.C1110s;
import p124x0.C1111t;

/* JADX INFO: renamed from: v0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1038v implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f13189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1039w f13190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f13191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f13192f;

    /* JADX WARN: Multi-variable type inference failed */
    public C1038v(int i, int i3, Map map, C1039w c1039w, B b6, c cVar) {
        this.f13187a = i;
        this.f13188b = i3;
        this.f13189c = map;
        this.f13190d = c1039w;
        this.f13191e = b6;
        this.f13192f = (l) cVar;
    }

    @Override // p113v0.G
    public final Map b() {
        return this.f13189c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D4.c, E4.l] */
    @Override // p113v0.G
    public final void c() {
        C1110s c1110s;
        boolean zS = this.f13190d.s();
        ?? r6 = this.f13192f;
        B b6 = this.f13191e;
        if (!zS || (c1110s = ((C1111t) b6.f13115h.f13828C.f3793c).f14061R) == null) {
            r6.invoke(((C1111t) b6.f13115h.f13828C.f3793c).f13936p);
        } else {
            r6.invoke(c1110s.f13936p);
        }
    }

    @Override // p113v0.G
    public final int d() {
        return this.f13188b;
    }

    @Override // p113v0.G
    public final c e() {
        return null;
    }

    @Override // p113v0.G
    public final int f() {
        return this.f13187a;
    }
}
