package N;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends X.D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3622c;

    public J0(long j4) {
        this.f3622c = j4;
    }

    @Override // X.D
    public final void a(X.D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord", d6);
        this.f3622c = ((J0) d6).f3622c;
    }

    @Override // X.D
    public final X.D b() {
        return new J0(this.f3622c);
    }
}
