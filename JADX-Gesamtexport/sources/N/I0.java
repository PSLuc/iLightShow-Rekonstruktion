package N;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends X.D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3617c;

    public I0(int i) {
        this.f3617c = i;
    }

    @Override // X.D
    public final void a(X.D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord", d6);
        this.f3617c = ((I0) d6).f3617c;
    }

    @Override // X.D
    public final X.D b() {
        return new I0(this.f3617c);
    }
}
