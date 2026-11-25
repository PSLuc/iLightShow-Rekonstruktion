package T1;

import B.AbstractC0013g0;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Closeable, AutoCloseable {
    public static final W4.i i = W4.i.a(o.values());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5214h = c.f5159p;

    public String A0() {
        if (B0() == k.VALUE_STRING) {
            return i0();
        }
        return null;
    }

    public abstract k B0();

    public abstract BigInteger C();

    public abstract int C0(a aVar, p109u2.f fVar);

    public abstract byte[] D(a aVar);

    public boolean D0() {
        return false;
    }

    public void E0(Object obj) {
        j jVarF0 = f0();
        if (jVarF0 != null) {
            jVarF0.g(obj);
        }
    }

    public abstract i F0();

    public boolean G() throws JsonParseException {
        k kVarS = s();
        if (kVarS == k.VALUE_TRUE) {
            return true;
        }
        if (kVarS == k.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, "Current token (" + kVarS + ") not of boolean type");
    }

    public byte J() throws InputCoercionException {
        int iZ = Z();
        if (iZ >= -128 && iZ <= 255) {
            return (byte) iZ;
        }
        String strI = AbstractC0013g0.i("Numeric value (", i0(), ") out of range of Java byte");
        k kVar = k.NOT_AVAILABLE;
        throw new InputCoercionException(this, strI);
    }

    public abstract l L();

    public abstract f M();

    public abstract String Q();

    public abstract BigDecimal T();

    public abstract double V();

    public Object X() {
        return null;
    }

    public abstract float Y();

    public abstract int Z();

    public abstract long a0();

    public boolean b() {
        return false;
    }

    public abstract h b0();

    public boolean c() {
        return false;
    }

    public abstract Number c0();

    public Number d0() {
        return c0();
    }

    public Object e0() {
        return null;
    }

    public abstract j f0();

    public abstract W4.i g0();

    public short h0() throws InputCoercionException {
        int iZ = Z();
        if (iZ >= -32768 && iZ <= 32767) {
            return (short) iZ;
        }
        String strI = AbstractC0013g0.i("Numeric value (", i0(), ") out of range of Java short");
        k kVar = k.NOT_AVAILABLE;
        throw new InputCoercionException(this, strI);
    }

    public abstract String i0();

    public abstract char[] j0();

    public abstract void k();

    public abstract int k0();

    public abstract int l0();

    public abstract f m0();

    public Object n0() {
        return null;
    }

    public String o() {
        return Q();
    }

    public abstract int o0();

    public abstract long p0();

    public abstract String q0();

    public abstract boolean r0();

    public abstract k s();

    public abstract boolean s0(k kVar);

    public abstract boolean t0();

    public final boolean u0(p pVar) {
        return pVar.f5246j.a(this.f5214h);
    }

    public abstract int v();

    public abstract boolean v0();

    public abstract boolean w0();

    public abstract boolean x0();

    public abstract boolean y0();

    public String z0() {
        if (B0() == k.FIELD_NAME) {
            return Q();
        }
        return null;
    }
}
