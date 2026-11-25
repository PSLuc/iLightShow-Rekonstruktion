package c5;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements a5.g, InterfaceC0490k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.g f7461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f7463c;

    public j0(a5.g gVar) {
        E4.k.f("original", gVar);
        this.f7461a = gVar;
        this.f7462b = gVar.b() + '?';
        this.f7463c = AbstractC0476a0.b(gVar);
    }

    @Override // a5.g
    public final int a(String str) {
        E4.k.f("name", str);
        return this.f7461a.a(str);
    }

    @Override // a5.g
    public final String b() {
        return this.f7462b;
    }

    @Override // a5.g
    public final S1.h0 c() {
        return this.f7461a.c();
    }

    @Override // a5.g
    public final List d() {
        return this.f7461a.d();
    }

    @Override // a5.g
    public final int e() {
        return this.f7461a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return E4.k.a(this.f7461a, ((j0) obj).f7461a);
        }
        return false;
    }

    @Override // a5.g
    public final String f(int i) {
        return this.f7461a.f(i);
    }

    @Override // a5.g
    public final boolean g() {
        return this.f7461a.g();
    }

    @Override // c5.InterfaceC0490k
    public final Set h() {
        return this.f7463c;
    }

    public final int hashCode() {
        return this.f7461a.hashCode() * 31;
    }

    @Override // a5.g
    public final boolean i() {
        return true;
    }

    @Override // a5.g
    public final List j(int i) {
        return this.f7461a.j(i);
    }

    @Override // a5.g
    public final a5.g k(int i) {
        return this.f7461a.k(i);
    }

    @Override // a5.g
    public final boolean l(int i) {
        return this.f7461a.l(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7461a);
        sb.append('?');
        return sb.toString();
    }
}
