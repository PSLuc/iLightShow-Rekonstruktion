package p5;

/* JADX INFO: renamed from: p5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0856v extends S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0855u f11153b;

    public C0856v(C0855u c0855u) {
        super(24);
        this.f11153b = c0855u;
    }

    @Override // p5.S
    public final void a(m5.j jVar) {
        C0855u c0855u = this.f11153b;
        int length = c0855u.f10440a.length;
        jVar.b(length + 1, 16);
        jVar.b(length, 8);
        jVar.c(c0855u.f10440a);
    }

    @Override // p5.S
    public final int c() {
        return this.f11153b.f10440a.length + 5;
    }
}
