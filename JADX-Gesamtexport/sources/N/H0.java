package N;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends X.D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3613c;

    public H0(float f6) {
        this.f3613c = f6;
    }

    @Override // X.D
    public final void a(X.D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord", d6);
        this.f3613c = ((H0) d6).f3613c;
    }

    @Override // X.D
    public final X.D b() {
        return new H0(this.f3613c);
    }
}
