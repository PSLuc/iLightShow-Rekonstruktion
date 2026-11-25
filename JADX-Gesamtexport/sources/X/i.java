package X;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0387d f5689c;

    public i(C0387d c0387d) {
        this.f5689c = c0387d;
    }

    @Override // X.t
    public final void c() throws SnapshotApplyConflictException {
        this.f5689c.c();
        throw new SnapshotApplyConflictException();
    }
}
