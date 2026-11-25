package p5;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11012b;

    public Y(int i) {
        super(2);
        if (i == 0) {
            throw new NullPointerException("Length must not be null");
        }
        this.f11012b = i;
    }

    @Override // p5.S
    public final void a(m5.j jVar) {
        jVar.b(1, 16);
        jVar.b(p012c.k.c(this.f11012b), 8);
    }

    @Override // p5.S
    public final int c() {
        return 5;
    }

    @Override // p5.S
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\t\t\t\tCode: ");
        int i = this.f11012b;
        sb.append(p012c.k.c(i));
        sb.append(" (");
        sb.append(p012c.k.g(i));
        sb.append(" bytes)");
        return sb.toString();
    }
}
