package p005a4;

import R3.c;
import io.reactivex.exceptions.MissingBackpressureException;
import p027e3.a;

/* JADX INFO: renamed from: a4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0396d extends AbstractC0394b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6245j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0396d(c cVar, int i) {
        super(cVar);
        this.f6245j = i;
    }

    private final void i() {
    }

    @Override // R3.b
    public final void c(Object obj) {
        if (this.i.b()) {
        }
        if (get() != 0) {
            this.f6239h.c(obj);
            a.q0(this, 1L);
        } else {
            switch (this.f6245j) {
                case 0:
                    break;
                default:
                    d(new MissingBackpressureException("create: could not emit value due to lack of requests"));
                    break;
            }
        }
    }
}
