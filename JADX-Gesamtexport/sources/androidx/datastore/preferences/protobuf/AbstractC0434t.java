package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0434t implements Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC0436v f6925h;
    public AbstractC0436v i;

    public AbstractC0434t(AbstractC0436v abstractC0436v) {
        this.f6925h = abstractC0436v;
        if (abstractC0436v.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.i = abstractC0436v.i();
    }

    public final AbstractC0436v a() {
        AbstractC0436v abstractC0436vB = b();
        abstractC0436vB.getClass();
        if (AbstractC0436v.f(abstractC0436vB, true)) {
            return abstractC0436vB;
        }
        throw new UninitializedMessageException();
    }

    public final AbstractC0436v b() {
        if (!this.i.g()) {
            return this.i;
        }
        AbstractC0436v abstractC0436v = this.i;
        abstractC0436v.getClass();
        S s6 = S.f6818c;
        s6.getClass();
        s6.a(abstractC0436v.getClass()).b(abstractC0436v);
        abstractC0436v.h();
        return this.i;
    }

    public final void c() {
        if (this.i.g()) {
            return;
        }
        AbstractC0436v abstractC0436vI = this.f6925h.i();
        AbstractC0436v abstractC0436v = this.i;
        S s6 = S.f6818c;
        s6.getClass();
        s6.a(abstractC0436vI.getClass()).a(abstractC0436vI, abstractC0436v);
        this.i = abstractC0436vI;
    }

    public final Object clone() {
        AbstractC0434t abstractC0434t = (AbstractC0434t) this.f6925h.c(5);
        abstractC0434t.i = b();
        return abstractC0434t;
    }
}
