package p124x0;

import D4.c;
import E4.l;
import java.util.Map;
import p113v0.G;

/* JADX INFO: loaded from: classes.dex */
public final class K implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f13929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f13930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f13931e;

    /* JADX WARN: Multi-variable type inference failed */
    public K(int i, int i3, Map map, c cVar, M m6) {
        this.f13927a = i;
        this.f13928b = i3;
        this.f13929c = map;
        this.f13930d = (l) cVar;
        this.f13931e = m6;
    }

    @Override // p113v0.G
    public final Map b() {
        return this.f13929c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [D4.c, E4.l] */
    @Override // p113v0.G
    public final void c() {
        this.f13930d.invoke(this.f13931e.f13936p);
    }

    @Override // p113v0.G
    public final int d() {
        return this.f13928b;
    }

    @Override // p113v0.G
    public final c e() {
        return null;
    }

    @Override // p113v0.G
    public final int f() {
        return this.f13927a;
    }
}
