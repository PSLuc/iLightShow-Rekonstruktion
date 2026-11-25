package U1;

import T1.d;
import T1.e;
import T1.n;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p015c2.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f5304m = (d.WRITE_NUMBERS_AS_STRINGS.i | d.ESCAPE_NON_ASCII.i) | d.STRICT_DUPLICATE_DETECTION.i;
    public u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Y1.d f5307l;

    @Override // T1.e
    public final void C(Object obj) {
        Y1.d dVar = this.f5307l;
        if (dVar != null) {
            dVar.f5834g = obj;
        }
    }

    @Override // T1.e
    public final void f0(Object obj) throws IOException {
        if (obj == null) {
            V();
            return;
        }
        u uVar = this.i;
        if (uVar != null) {
            uVar.a(this, obj);
            return;
        }
        if (obj instanceof String) {
            s0((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                Z(number.intValue());
                return;
            }
            if (number instanceof Long) {
                a0(number.longValue());
                return;
            }
            if (number instanceof Double) {
                X(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                Y(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                e0(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                e0(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                d0((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                c0((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                Z(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                a0(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            G(T1.b.f5157a, bArr, 0, bArr.length);
            return;
        } else if (obj instanceof Boolean) {
            J(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            J(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    @Override // T1.e
    public final void j0(n nVar) {
        y0("write raw value");
        h0(nVar);
    }

    @Override // T1.e
    public final void k0(String str) {
        y0("write raw value");
        i0(str);
    }

    @Override // T1.e
    public void q0(Object obj) {
        p0(obj);
    }

    @Override // T1.e
    public final Y1.d s() {
        return this.f5307l;
    }

    @Override // T1.e
    public final boolean v(d dVar) {
        return (this.f5305j & dVar.i) != 0;
    }

    public final String x0(BigDecimal bigDecimal) throws JsonGenerationException {
        if (!d.WRITE_BIGDECIMAL_AS_PLAIN.a(this.f5305j)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale >= -9999 && iScale <= 9999) {
            return bigDecimal.toPlainString();
        }
        b(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        throw null;
    }

    public abstract void y0(String str);
}
