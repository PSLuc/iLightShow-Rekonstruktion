package p130y0;

import B.C0031p0;
import B.C0043w;
import W.i;
import W.j;

/* JADX INFO: renamed from: y0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1128e0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1130f0 f14385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f14386b;

    public C1128e0(j jVar, C1130f0 c1130f0) {
        this.f14385a = c1130f0;
        this.f14386b = jVar;
    }

    @Override // W.i
    public final boolean a(Object obj) {
        return this.f14386b.a(obj);
    }

    @Override // W.i
    public final Object b(String str) {
        return this.f14386b.b(str);
    }

    @Override // W.i
    public final C0031p0 c(String str, C0043w c0043w) {
        return this.f14386b.c(str, c0043w);
    }
}
