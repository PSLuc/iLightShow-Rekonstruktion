package T1;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.Closeable;
import java.io.Flushable;
import java.math.BigDecimal;
import java.math.BigInteger;
import p096s.AbstractC0916i;
import p109u2.C0966e;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Closeable, Flushable, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f5181h;

    static {
        W4.i.a(q.values());
        int i = q.CAN_WRITE_FORMATTED_NUMBERS.f5249h;
        int i3 = q.CAN_WRITE_BINARY_NATIVELY.f5249h;
    }

    public static void c(int i, int i3) {
        if (i3 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", 0, Integer.valueOf(i3), Integer.valueOf(i)));
        }
    }

    public void C(Object obj) {
        Y1.d dVarS = s();
        if (dVarS != null) {
            dVarS.f5834g = obj;
        }
    }

    public abstract int D(a aVar, C0966e c0966e, int i);

    public abstract void G(a aVar, byte[] bArr, int i, int i3);

    public abstract void J(boolean z5);

    public abstract void L();

    public abstract void M();

    public abstract void Q(n nVar);

    public abstract void T(String str);

    public abstract void V();

    public abstract void X(double d6);

    public abstract void Y(float f6);

    public abstract void Z(int i);

    public abstract void a0(long j4);

    public final void b(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public abstract void b0(String str);

    public abstract void c0(BigDecimal bigDecimal);

    public abstract void d0(BigInteger bigInteger);

    public abstract void e0(short s6);

    public abstract void f0(Object obj);

    @Override // java.io.Flushable
    public abstract void flush();

    public void g0(String str) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public abstract void h0(n nVar);

    public abstract void i0(String str);

    public void j0(n nVar) {
        k0(((V1.h) nVar).f5505h);
    }

    public boolean k() {
        return false;
    }

    public abstract void k0(String str);

    public abstract void l0();

    public abstract void m0(Object obj);

    public abstract void n0(Object obj);

    public boolean o() {
        return false;
    }

    public abstract void o0();

    public abstract void p0(Object obj);

    public abstract void q0(Object obj);

    public abstract void r0(n nVar);

    public abstract Y1.d s();

    public abstract void s0(String str);

    public abstract void t0(char[] cArr, int i, int i3);

    public void u0(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public abstract boolean v(d dVar);

    public final void v0(p003a2.a aVar) throws JsonGenerationException {
        Object obj = aVar.f6159c;
        boolean zO = o();
        k kVar = aVar.f6162f;
        if (zO) {
            aVar.f6163g = false;
            u0(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            aVar.f6163g = true;
            int i = aVar.f6161e;
            if (kVar != k.START_OBJECT) {
                if (i == 0) {
                    throw null;
                }
                if (i == 3 || i == 4) {
                    aVar.f6161e = 1;
                    i = 1;
                }
            }
            int iD = AbstractC0916i.d(i);
            if (iD == 1) {
                o0();
                T(strValueOf);
            } else if (iD == 2) {
                p0(aVar.f6157a);
                T(aVar.f6160d);
                s0(strValueOf);
                return;
            } else if (iD != 3 && iD != 4) {
                l0();
                s0(strValueOf);
            }
        }
        if (kVar == k.START_OBJECT) {
            p0(aVar.f6157a);
        } else if (kVar == k.START_ARRAY) {
            l0();
        }
    }

    public final void w0(p003a2.a aVar) {
        k kVar = aVar.f6162f;
        if (kVar == k.START_OBJECT) {
            M();
        } else if (kVar == k.START_ARRAY) {
            L();
        }
        if (aVar.f6163g) {
            int iD = AbstractC0916i.d(aVar.f6161e);
            if (iD == 0) {
                L();
                return;
            }
            if (iD == 2 || iD == 3) {
                return;
            }
            if (iD != 4) {
                M();
                return;
            }
            Object obj = aVar.f6159c;
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            T(aVar.f6160d);
            s0(strValueOf);
        }
    }
}
