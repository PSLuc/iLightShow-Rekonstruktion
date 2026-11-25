package p005a4;

import G4.a;
import java.util.NoSuchElementException;
import p043h4.c;
import p043h4.f;

/* JADX INFO: loaded from: classes.dex */
public final class K extends c implements R3.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u5.c f6205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6206l;

    public K(R3.c cVar, boolean z5) {
        super(cVar);
        this.f6204j = z5;
    }

    @Override // u5.b
    public final void b() {
        if (this.f6206l) {
            return;
        }
        this.f6206l = true;
        Object obj = this.i;
        this.i = null;
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            j(obj);
            return;
        }
        boolean z5 = this.f6204j;
        R3.c cVar = this.f9304h;
        if (z5) {
            cVar.onError(new NoSuchElementException());
        } else {
            cVar.b();
        }
    }

    @Override // u5.b
    public final void c(Object obj) {
        if (this.f6206l) {
            return;
        }
        if (this.i == null) {
            this.i = obj;
            return;
        }
        this.f6206l = true;
        this.f6205k.cancel();
        this.f9304h.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // u5.c
    public final void cancel() {
        set(4);
        this.i = null;
        this.f6205k.cancel();
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (f.g(this.f6205k, cVar)) {
            this.f6205k = cVar;
            this.f9304h.h(this);
            cVar.e(Long.MAX_VALUE);
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        if (this.f6206l) {
            a.A(th);
        } else {
            this.f6206l = true;
            this.f9304h.onError(th);
        }
    }
}
