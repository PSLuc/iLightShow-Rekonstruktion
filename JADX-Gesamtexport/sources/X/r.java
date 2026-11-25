package X;

/* JADX INFO: loaded from: classes.dex */
public final class r extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public R.c f5719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5721e;

    public r(R.c cVar) {
        this.f5719c = cVar;
    }

    @Override // X.D
    public final void a(D d6) {
        synchronized (t.f5723a) {
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>", d6);
            this.f5719c = ((r) d6).f5719c;
            this.f5720d = ((r) d6).f5720d;
            this.f5721e = ((r) d6).f5721e;
        }
    }

    @Override // X.D
    public final D b() {
        return new r(this.f5719c);
    }
}
