package Q;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p089q4.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R.c f4684h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4685j;

    public a(R.c cVar, int i, int i3) {
        this.f4684h = cVar;
        this.i = i;
        p081p0.c.L(i, i3, cVar.c());
        this.f4685j = i3 - i;
    }

    @Override // p089q4.AbstractC0861a
    public final int c() {
        return this.f4685j;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p081p0.c.J(i, this.f4685j);
        return this.f4684h.get(this.i + i);
    }

    @Override // p089q4.d, java.util.List
    public final List subList(int i, int i3) {
        p081p0.c.L(i, i3, this.f4685j);
        int i6 = this.i;
        return new a(this.f4684h, i + i6, i6 + i3);
    }
}
