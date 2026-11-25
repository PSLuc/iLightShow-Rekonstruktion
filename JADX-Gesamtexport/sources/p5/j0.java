package p5;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11085b;

    public j0(int i) {
        super(26);
        d(i);
        this.f11085b = i;
    }

    public static void d(int i) {
        if (i < 64 || i > 65535) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i, "Record size limit must be within [64...65535], not ", "!"));
        }
    }

    @Override // p5.S
    public final void a(m5.j jVar) {
        jVar.b(2, 16);
        jVar.b(this.f11085b, 16);
    }

    @Override // p5.S
    public final int c() {
        return 6;
    }
}
