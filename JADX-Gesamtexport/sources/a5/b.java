package a5;

import S1.h0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f6347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K4.b f6348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6349c;

    public b(h hVar, K4.b bVar) {
        E4.k.f("kClass", bVar);
        this.f6347a = hVar;
        this.f6348b = bVar;
        this.f6349c = hVar.f6361a + '<' + ((E4.f) bVar).b() + '>';
    }

    @Override // a5.g
    public final int a(String str) {
        E4.k.f("name", str);
        return this.f6347a.a(str);
    }

    @Override // a5.g
    public final String b() {
        return this.f6349c;
    }

    @Override // a5.g
    public final h0 c() {
        return this.f6347a.f6362b;
    }

    @Override // a5.g
    public final List d() {
        return this.f6347a.f6364d;
    }

    @Override // a5.g
    public final int e() {
        return this.f6347a.f6363c;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f6347a.equals(bVar.f6347a) && E4.k.a(bVar.f6348b, this.f6348b);
    }

    @Override // a5.g
    public final String f(int i) {
        return this.f6347a.f6366f[i];
    }

    @Override // a5.g
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return this.f6349c.hashCode() + (((E4.f) this.f6348b).hashCode() * 31);
    }

    @Override // a5.g
    public final boolean i() {
        return false;
    }

    @Override // a5.g
    public final List j(int i) {
        return this.f6347a.f6368h[i];
    }

    @Override // a5.g
    public final g k(int i) {
        return this.f6347a.f6367g[i];
    }

    @Override // a5.g
    public final boolean l(int i) {
        return this.f6347a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f6348b + ", original: " + this.f6347a + ')';
    }
}
