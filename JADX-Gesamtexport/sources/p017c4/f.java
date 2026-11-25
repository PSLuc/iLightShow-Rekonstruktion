package p017c4;

import B.C0025m0;
import R3.g;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f7367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f7368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0025m0 f7369m;

    public f(C0025m0 c0025m0, b bVar, AtomicReference atomicReference) {
        this.f7369m = c0025m0;
        this.f7367k = bVar;
        this.f7368l = atomicReference;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.d0
    public final void E(g gVar) {
        this.f7369m.e(gVar);
    }
}
