package com.fasterxml.jackson.databind.ser.std;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0547s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7761l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i, Class cls) {
        super(cls, T1.h.f5211l, "number");
        this.f7761l = i;
        switch (i) {
            case 1:
                super(cls, T1.h.f5208h, "integer");
                break;
            case 2:
                super(cls, T1.h.i, "number");
                break;
            default:
                break;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        switch (this.f7761l) {
            case 0:
                eVar.X(((Double) obj).doubleValue());
                break;
            case 1:
                eVar.Z(((Integer) obj).intValue());
                break;
            default:
                eVar.a0(((Long) obj).longValue());
                break;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) {
        switch (this.f7761l) {
            case 0:
                Double d6 = (Double) obj;
                double dDoubleValue = d6.doubleValue();
                String str = V1.f.f5498a;
                if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                    p003a2.a aVarE = eVar2.e(eVar, eVar2.d(T1.k.VALUE_NUMBER_FLOAT, obj));
                    eVar.X(d6.doubleValue());
                    eVar2.f(eVar, aVarE);
                } else {
                    eVar.X(d6.doubleValue());
                }
                break;
            case 1:
                serialize(obj, eVar, e6);
                break;
            default:
                super.serializeWithType(obj, eVar, e6, eVar2);
                break;
        }
    }
}
