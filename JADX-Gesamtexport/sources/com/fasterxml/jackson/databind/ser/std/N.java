package com.fasterxml.jackson.databind.ser.std;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class N extends P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7697h = 1;
    public final Serializable i;

    public N(p015c2.h hVar, String str) {
        super(Object.class);
        this.i = str;
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        switch (this.f7697h) {
            case 0:
                if (e6.f7226j.p(p015c2.D.WRITE_ENUMS_USING_TO_STRING)) {
                    eVar.T(obj.toString());
                    return;
                }
                Enum r6 = (Enum) obj;
                if (e6.f7226j.p(p015c2.D.WRITE_ENUM_KEYS_USING_INDEX)) {
                    eVar.T(String.valueOf(r6.ordinal()));
                    return;
                } else {
                    eVar.Q(((T1.n[]) ((p009b2.k) this.i).f7081j)[r6.ordinal()]);
                    return;
                }
            default:
                e6.O((String) this.i);
                throw null;
        }
    }

    public N(Class cls, p009b2.k kVar) {
        super(0, cls);
        this.i = kVar;
    }
}
