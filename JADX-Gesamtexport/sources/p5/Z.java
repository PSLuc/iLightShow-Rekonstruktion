package p5;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public O f11015p;

    @Override // p5.O, p5.B
    public final byte[] d() {
        m5.j jVar = new m5.j(1500);
        for (O o6 = this.f10934l; o6 != null; o6 = o6.f10934l) {
            o6.w(jVar);
        }
        return jVar.a();
    }

    @Override // p5.O
    public final byte[] p() {
        throw new RuntimeException("not supported!");
    }

    @Override // p5.O
    public final int t() {
        return this.f11014o - 12;
    }

    @Override // p5.O
    public final P u() {
        O o6 = this.f10934l;
        if (o6 == null) {
            return null;
        }
        return o6.u();
    }
}
