package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0648p implements Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f8223h;
    public r i;

    public AbstractC0648p(r rVar) {
        this.f8223h = rVar;
        if (rVar.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.i = rVar.g();
    }

    public final r a() {
        if (!this.i.e()) {
            return this.i;
        }
        r rVar = this.i;
        rVar.getClass();
        O o6 = O.f8176c;
        o6.getClass();
        o6.a(rVar.getClass()).b(rVar);
        rVar.f();
        return this.i;
    }

    public final void b() {
        if (this.i.e()) {
            return;
        }
        r rVarG = this.f8223h.g();
        r rVar = this.i;
        O o6 = O.f8176c;
        o6.getClass();
        o6.a(rVarG.getClass()).a(rVarG, rVar);
        this.i = rVarG;
    }

    public final Object clone() {
        AbstractC0648p abstractC0648p = (AbstractC0648p) this.f8223h.a(5);
        abstractC0648p.i = a();
        return abstractC0648p;
    }
}
