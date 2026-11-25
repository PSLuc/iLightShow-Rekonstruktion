package p107u;

import S0.i;
import S0.k;
import S1.h0;
import V0.A;
import p020d2.n;

/* JADX INFO: loaded from: classes.dex */
public final class f implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12622a;

    public f(long j4) {
        this.f12622a = j4;
    }

    @Override // V0.A
    public final long a(i iVar, long j4, k kVar, long j6) {
        int i = iVar.f4892a;
        long j7 = this.f12622a;
        return h0.c(n.l(i + ((int) (j7 >> 32)), (int) (j6 >> 32), (int) (j4 >> 32), kVar == k.f4897h), n.l(iVar.f4893b + ((int) (j7 & 4294967295L)), (int) (j6 & 4294967295L), (int) (j4 & 4294967295L), true));
    }
}
