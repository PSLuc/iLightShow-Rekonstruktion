package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0603x0 implements Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC0605y0 f8016h;
    public AbstractC0605y0 i;

    public AbstractC0603x0(AbstractC0605y0 abstractC0605y0) {
        this.f8016h = abstractC0605y0;
        if (abstractC0605y0.f()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.i = (AbstractC0605y0) abstractC0605y0.h(4);
    }

    public final AbstractC0605y0 a() {
        AbstractC0605y0 abstractC0605y0B = b();
        abstractC0605y0B.getClass();
        if (AbstractC0605y0.g(abstractC0605y0B, true)) {
            return abstractC0605y0B;
        }
        throw new zzhe();
    }

    public final AbstractC0605y0 b() {
        if (!this.i.f()) {
            return this.i;
        }
        AbstractC0605y0 abstractC0605y0 = this.i;
        abstractC0605y0.getClass();
        P0.f7899c.a(abstractC0605y0.getClass()).a(abstractC0605y0);
        abstractC0605y0.m();
        return this.i;
    }

    public final void c() {
        if (this.i.f()) {
            return;
        }
        AbstractC0605y0 abstractC0605y0 = (AbstractC0605y0) this.f8016h.h(4);
        P0.f7899c.a(abstractC0605y0.getClass()).b(abstractC0605y0, this.i);
        this.i = abstractC0605y0;
    }

    public final Object clone() {
        AbstractC0603x0 abstractC0603x0 = (AbstractC0603x0) this.f8016h.h(5);
        abstractC0603x0.i = b();
        return abstractC0603x0;
    }
}
