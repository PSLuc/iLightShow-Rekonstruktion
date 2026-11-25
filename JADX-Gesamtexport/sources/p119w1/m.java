package p119w1;

/* JADX INFO: loaded from: classes.dex */
public final class m implements l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13428h;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13429j = -1;

    public m(int i) {
        this.f13428h = i;
    }

    @Override // p119w1.l
    public final Object a() {
        return this;
    }

    @Override // p119w1.l
    public final boolean g(CharSequence charSequence, int i, int i3, s sVar) {
        int i6 = this.f13428h;
        if (i > i6 || i6 >= i3) {
            return i3 <= i6;
        }
        this.i = i;
        this.f13429j = i3;
        return false;
    }
}
