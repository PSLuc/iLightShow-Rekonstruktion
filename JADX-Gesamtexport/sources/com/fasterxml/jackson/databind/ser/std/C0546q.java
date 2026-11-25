package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0546q extends Q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0546q f7756j = new C0546q(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0546q f7757k = new C0546q(1);
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0546q(int i, Class cls) {
        super(i, cls);
        this.i = 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q
    public final String d(Object obj) {
        switch (this.i) {
            case 0:
                throw new IllegalStateException();
            default:
                return obj.toString();
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public boolean isEmpty(p015c2.E e6, Object obj) {
        switch (this.i) {
            case 0:
                return false;
            default:
                return super.isEmpty(e6, obj);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public void serialize(Object obj, T1.e eVar, p015c2.E e6) throws JsonMappingException {
        String string;
        switch (this.i) {
            case 0:
                if (eVar.v(T1.d.WRITE_BIGDECIMAL_AS_PLAIN)) {
                    BigDecimal bigDecimal = (BigDecimal) obj;
                    int iScale = bigDecimal.scale();
                    if (iScale < -9999 || iScale > 9999) {
                        String str = String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999);
                        e6.getClass();
                        throw new JsonMappingException(((p093r2.h) e6).f11759x, str, null);
                    }
                    string = bigDecimal.toPlainString();
                } else {
                    string = obj.toString();
                }
                eVar.s0(string);
                return;
            default:
                super.serialize(obj, eVar, e6);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0546q(int i) {
        super(0, BigDecimal.class);
        this.i = i;
        switch (i) {
            case 1:
                super(0, Object.class);
                break;
            default:
                break;
        }
    }
}
