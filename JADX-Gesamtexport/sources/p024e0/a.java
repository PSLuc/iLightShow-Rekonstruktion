package p024e0;

import D4.c;
import E4.k;
import Z.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f8638u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f8639v;

    @Override // p024e0.c
    public final void J(q qVar) {
        if (k.a(this.f8639v, qVar)) {
            return;
        }
        this.f8639v = qVar;
        this.f8638u.invoke(qVar);
    }
}
