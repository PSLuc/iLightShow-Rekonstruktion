package X;

/* JADX INFO: loaded from: classes.dex */
public final class u extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Q.d f5725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5726d;

    public u(Q.d dVar) {
        this.f5725c = dVar;
    }

    @Override // X.D
    public final void a(D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>", d6);
        u uVar = (u) d6;
        synchronized (t.f5724b) {
            this.f5725c = uVar.f5725c;
            this.f5726d = uVar.f5726d;
        }
    }

    @Override // X.D
    public final D b() {
        return new u(this.f5725c);
    }
}
