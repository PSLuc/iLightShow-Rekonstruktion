package com.fasterxml.jackson.databind.ser.std;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public final class M extends P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient AbstractC0599v0 f7696h;

    public M() {
        super(0, String.class);
        this.f7696h = p098s2.i.f12180k;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        visitStringFormat(bVar, hVar);
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        Class<?> cls = obj.getClass();
        AbstractC0599v0 abstractC0599v0 = this.f7696h;
        p015c2.o oVarI = abstractC0599v0.I(cls);
        if (oVarI == null) {
            if (cls == Object.class) {
                oVarI = new L(8, cls);
                this.f7696h = abstractC0599v0.G(cls, oVarI);
            } else {
                oVarI = e6.j0(e6.f7226j.c(cls), null);
                AbstractC0599v0 abstractC0599v0G = abstractC0599v0.G(cls, oVarI);
                if (abstractC0599v0 != abstractC0599v0G) {
                    this.f7696h = abstractC0599v0G;
                }
            }
        }
        oVarI.serialize(obj, eVar, e6);
    }
}
