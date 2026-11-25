package p011b4;

import R3.e;
import S3.b;
import V3.a;
import p043h4.c;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f7114j;

    @Override // R3.e
    public final void b() {
        this.f9304h.b();
    }

    @Override // u5.c
    public final void cancel() {
        set(4);
        this.i = null;
        this.f7114j.a();
    }

    @Override // R3.e, R3.m
    public final void d(b bVar) {
        if (a.e(this.f7114j, bVar)) {
            this.f7114j = bVar;
            this.f9304h.h(this);
        }
    }

    @Override // R3.e, R3.m
    public final void onError(Throwable th) {
        this.f9304h.onError(th);
    }
}
