package com.google.gson.internal.bind;

import com.google.gson.stream.MalformedJsonException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: com.google.gson.internal.bind.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0613f extends p138z3.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0612e f8088A = new C0612e();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Object f8089B = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f8090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String[] f8092y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int[] f8093z;

    @Override // p138z3.a
    public final String D() {
        return q0(false);
    }

    @Override // p138z3.a
    public final String J() {
        return q0(true);
    }

    @Override // p138z3.a
    public final boolean L() {
        int iF0 = f0();
        return (iF0 == 4 || iF0 == 2 || iF0 == 10) ? false : true;
    }

    @Override // p138z3.a
    public final boolean T() {
        p0(8);
        boolean zM = ((p105t3.u) u0()).m();
        int i = this.f8091x;
        if (i > 0) {
            int[] iArr = this.f8093z;
            int i3 = i - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zM;
    }

    @Override // p138z3.a
    public final double V() throws MalformedJsonException {
        int iF0 = f0();
        if (iF0 != 7 && iF0 != 6) {
            throw new IllegalStateException("Expected " + p138z3.b.b(7) + " but was " + p138z3.b.b(iF0) + r0());
        }
        double dN = ((p105t3.u) t0()).n();
        if (this.f14644v != 1 && (Double.isNaN(dN) || Double.isInfinite(dN))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dN);
        }
        u0();
        int i = this.f8091x;
        if (i > 0) {
            int[] iArr = this.f8093z;
            int i3 = i - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dN;
    }

    @Override // p138z3.a
    public final int X() {
        int iF0 = f0();
        if (iF0 != 7 && iF0 != 6) {
            throw new IllegalStateException("Expected " + p138z3.b.b(7) + " but was " + p138z3.b.b(iF0) + r0());
        }
        int iC = ((p105t3.u) t0()).c();
        u0();
        int i = this.f8091x;
        if (i > 0) {
            int[] iArr = this.f8093z;
            int i3 = i - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iC;
    }

    @Override // p138z3.a
    public final long Y() {
        int iF0 = f0();
        if (iF0 != 7 && iF0 != 6) {
            throw new IllegalStateException("Expected " + p138z3.b.b(7) + " but was " + p138z3.b.b(iF0) + r0());
        }
        long j4 = ((p105t3.u) t0()).j();
        u0();
        int i = this.f8091x;
        if (i > 0) {
            int[] iArr = this.f8093z;
            int i3 = i - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return j4;
    }

    @Override // p138z3.a
    public final String Z() {
        return s0(false);
    }

    @Override // p138z3.a
    public final void b() {
        p0(1);
        v0(((p105t3.o) t0()).f12590h.iterator());
        this.f8093z[this.f8091x - 1] = 0;
    }

    @Override // p138z3.a
    public final void b0() {
        p0(9);
        u0();
        int i = this.f8091x;
        if (i > 0) {
            int[] iArr = this.f8093z;
            int i3 = i - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // p138z3.a
    public final void c() {
        p0(3);
        v0(((p116v3.j) ((p105t3.t) t0()).f12592h.entrySet()).iterator());
    }

    @Override // p138z3.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8090w = new Object[]{f8089B};
        this.f8091x = 1;
    }

    @Override // p138z3.a
    public final String d0() {
        int iF0 = f0();
        if (iF0 != 6 && iF0 != 7) {
            throw new IllegalStateException("Expected " + p138z3.b.b(6) + " but was " + p138z3.b.b(iF0) + r0());
        }
        String strK = ((p105t3.u) u0()).k();
        int i = this.f8091x;
        if (i > 0) {
            int[] iArr = this.f8093z;
            int i3 = i - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return strK;
    }

    @Override // p138z3.a
    public final int f0() {
        if (this.f8091x == 0) {
            return 10;
        }
        Object objT0 = t0();
        if (objT0 instanceof Iterator) {
            boolean z5 = this.f8090w[this.f8091x - 2] instanceof p105t3.t;
            Iterator it = (Iterator) objT0;
            if (!it.hasNext()) {
                return z5 ? 4 : 2;
            }
            if (z5) {
                return 5;
            }
            v0(it.next());
            return f0();
        }
        if (objT0 instanceof p105t3.t) {
            return 3;
        }
        if (objT0 instanceof p105t3.o) {
            return 1;
        }
        if (objT0 instanceof p105t3.u) {
            Serializable serializable = ((p105t3.u) objT0).f12593h;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objT0 instanceof p105t3.s) {
            return 9;
        }
        if (objT0 == f8089B) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objT0.getClass().getName() + " is not supported");
    }

    @Override // p138z3.a
    public final void m0() {
        int iD = AbstractC0916i.d(f0());
        if (iD == 1) {
            s();
            return;
        }
        if (iD != 9) {
            if (iD == 3) {
                v();
                return;
            }
            if (iD == 4) {
                s0(true);
                return;
            }
            u0();
            int i = this.f8091x;
            if (i > 0) {
                int[] iArr = this.f8093z;
                int i3 = i - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    public final void p0(int i) {
        if (f0() == i) {
            return;
        }
        throw new IllegalStateException("Expected " + p138z3.b.b(i) + " but was " + p138z3.b.b(f0()) + r0());
    }

    public final String q0(boolean z5) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i3 = this.f8091x;
            if (i >= i3) {
                return sb.toString();
            }
            Object[] objArr = this.f8090w;
            Object obj = objArr[i];
            if (obj instanceof p105t3.o) {
                i++;
                if (i < i3 && (objArr[i] instanceof Iterator)) {
                    int i6 = this.f8093z[i];
                    if (z5 && i6 > 0 && (i == i3 - 1 || i == i3 - 2)) {
                        i6--;
                    }
                    sb.append('[');
                    sb.append(i6);
                    sb.append(']');
                }
            } else if ((obj instanceof p105t3.t) && (i = i + 1) < i3 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.f8092y[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public final String r0() {
        return " at path " + q0(false);
    }

    @Override // p138z3.a
    public final void s() {
        p0(2);
        u0();
        u0();
        int i = this.f8091x;
        if (i > 0) {
            int[] iArr = this.f8093z;
            int i3 = i - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final String s0(boolean z5) {
        p0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) t0()).next();
        String str = (String) entry.getKey();
        this.f8092y[this.f8091x - 1] = z5 ? "<skipped>" : str;
        v0(entry.getValue());
        return str;
    }

    public final Object t0() {
        return this.f8090w[this.f8091x - 1];
    }

    @Override // p138z3.a
    public final String toString() {
        return C0613f.class.getSimpleName() + r0();
    }

    public final Object u0() {
        Object[] objArr = this.f8090w;
        int i = this.f8091x - 1;
        this.f8091x = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // p138z3.a
    public final void v() {
        p0(4);
        this.f8092y[this.f8091x - 1] = null;
        u0();
        u0();
        int i = this.f8091x;
        if (i > 0) {
            int[] iArr = this.f8093z;
            int i3 = i - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final void v0(Object obj) {
        int i = this.f8091x;
        Object[] objArr = this.f8090w;
        if (i == objArr.length) {
            int i3 = i * 2;
            this.f8090w = Arrays.copyOf(objArr, i3);
            this.f8093z = Arrays.copyOf(this.f8093z, i3);
            this.f8092y = (String[]) Arrays.copyOf(this.f8092y, i3);
        }
        Object[] objArr2 = this.f8090w;
        int i6 = this.f8091x;
        this.f8091x = i6 + 1;
        objArr2[i6] = obj;
    }
}
