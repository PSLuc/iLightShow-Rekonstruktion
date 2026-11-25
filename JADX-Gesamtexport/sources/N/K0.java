package N;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends X.D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3624c;

    public K0(Object obj) {
        this.f3624c = obj;
    }

    @Override // X.D
    public final void a(X.D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>", d6);
        this.f3624c = ((K0) d6).f3624c;
    }

    @Override // X.D
    public final X.D b() {
        return new K0(this.f3624c);
    }
}
