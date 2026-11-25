package p109u2;

import T1.a;
import T1.e;
import T1.i;
import T1.j;
import T1.k;
import T1.l;
import T1.n;
import V1.h;
import Y1.d;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class A extends e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f12654w;
    public l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f12655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z f12661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z f12662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f12664s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f12665t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12666u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f12667v;

    static {
        int i = 0;
        for (T1.d dVar : T1.d.values()) {
            if (dVar.f5180h) {
                i |= dVar.i;
            }
        }
        f12654w = i;
    }

    public final void A0(k kVar) {
        z zVarA;
        this.f12667v.l();
        if (this.f12666u) {
            z zVar = this.f12662q;
            int i = this.f12663r;
            Object obj = this.f12665t;
            Object obj2 = this.f12664s;
            zVar.getClass();
            if (i < 16) {
                long jOrdinal = kVar.ordinal();
                if (i > 0) {
                    jOrdinal <<= i << 2;
                }
                zVar.f12743b = jOrdinal | zVar.f12743b;
                zVar.b(obj, i, obj2);
                zVarA = null;
            } else {
                z zVar2 = new z();
                zVar.f12742a = zVar2;
                zVar2.f12743b = ((long) kVar.ordinal()) | zVar2.f12743b;
                zVar2.b(obj, 0, obj2);
                zVarA = zVar.f12742a;
            }
        } else {
            zVarA = this.f12662q.a(this.f12663r, kVar);
        }
        if (zVarA == null) {
            this.f12663r++;
        } else {
            this.f12662q = zVarA;
            this.f12663r = 1;
        }
    }

    public final void B0(k kVar, Object obj) {
        this.f12667v.l();
        z zVar = null;
        if (this.f12666u) {
            z zVar2 = this.f12662q;
            int i = this.f12663r;
            Object obj2 = this.f12665t;
            Object obj3 = this.f12664s;
            if (i < 16) {
                zVar2.f12744c[i] = obj;
                long jOrdinal = kVar.ordinal();
                if (i > 0) {
                    jOrdinal <<= i << 2;
                }
                zVar2.f12743b = jOrdinal | zVar2.f12743b;
                zVar2.b(obj2, i, obj3);
            } else {
                zVar2.getClass();
                z zVar3 = new z();
                zVar2.f12742a = zVar3;
                zVar3.f12744c[0] = obj;
                zVar3.f12743b = ((long) kVar.ordinal()) | zVar3.f12743b;
                zVar3.b(obj2, 0, obj3);
                zVar = zVar2.f12742a;
            }
        } else {
            z zVar4 = this.f12662q;
            int i3 = this.f12663r;
            if (i3 < 16) {
                zVar4.f12744c[i3] = obj;
                long jOrdinal2 = kVar.ordinal();
                if (i3 > 0) {
                    jOrdinal2 <<= i3 << 2;
                }
                zVar4.f12743b = jOrdinal2 | zVar4.f12743b;
            } else {
                zVar4.getClass();
                z zVar5 = new z();
                zVar4.f12742a = zVar5;
                zVar5.f12744c[0] = obj;
                zVar5.f12743b = ((long) kVar.ordinal()) | zVar5.f12743b;
                zVar = zVar4.f12742a;
            }
        }
        if (zVar == null) {
            this.f12663r++;
        } else {
            this.f12662q = zVar;
            this.f12663r = 1;
        }
    }

    public final void C0(i iVar) {
        Object objN0 = iVar.n0();
        this.f12664s = objN0;
        if (objN0 != null) {
            this.f12666u = true;
        }
        Object objE0 = iVar.e0();
        this.f12665t = objE0;
        if (objE0 != null) {
            this.f12666u = true;
        }
    }

    @Override // T1.e
    public final int D(a aVar, C0966e c0966e, int i) {
        throw new UnsupportedOperationException();
    }

    public final void D0(i iVar) {
        int i = 1;
        while (true) {
            k kVarB0 = iVar.B0();
            if (kVarB0 == null) {
                return;
            }
            int iOrdinal = kVarB0.ordinal();
            if (iOrdinal == 1) {
                if (this.f12659n) {
                    C0(iVar);
                }
                o0();
            } else if (iOrdinal == 2) {
                M();
                i--;
                if (i == 0) {
                    return;
                }
            } else if (iOrdinal == 3) {
                if (this.f12659n) {
                    C0(iVar);
                }
                l0();
            } else if (iOrdinal == 4) {
                L();
                i--;
                if (i == 0) {
                    return;
                }
            } else if (iOrdinal != 5) {
                E0(iVar, kVarB0);
            } else {
                if (this.f12659n) {
                    C0(iVar);
                }
                T(iVar.o());
            }
            i++;
        }
    }

    public final void E0(i iVar, k kVar) {
        if (this.f12659n) {
            C0(iVar);
        }
        switch (kVar.ordinal()) {
            case 6:
                f0(iVar.X());
                return;
            case 7:
                if (iVar.r0()) {
                    t0(iVar.j0(), iVar.l0(), iVar.k0());
                    return;
                } else {
                    s0(iVar.i0());
                    return;
                }
            case 8:
                int iOrdinal = iVar.b0().ordinal();
                if (iOrdinal == 0) {
                    Z(iVar.Z());
                    return;
                } else if (iOrdinal != 2) {
                    a0(iVar.a0());
                    return;
                } else {
                    d0(iVar.C());
                    return;
                }
            case 9:
                if (this.f12660o) {
                    c0(iVar.T());
                    return;
                } else {
                    B0(k.VALUE_NUMBER_FLOAT, iVar.d0());
                    return;
                }
            case 10:
                J(true);
                return;
            case 11:
                J(false);
                return;
            case 12:
                V();
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + kVar);
        }
    }

    public final void F0(A a6) {
        if (!this.f12657l) {
            this.f12657l = a6.f12657l;
        }
        if (!this.f12658m) {
            this.f12658m = a6.f12658m;
        }
        this.f12659n = this.f12657l || this.f12658m;
        y yVarH0 = a6.H0(a6.i);
        while (yVarH0.B0() != null) {
            I0(yVarH0);
        }
    }

    @Override // T1.e
    public final void G(a aVar, byte[] bArr, int i, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        f0(bArr2);
    }

    public final y G0(i iVar) {
        y yVar = new y(this.f12661p, iVar.L(), this.f12657l, this.f12658m, this.f12655j);
        yVar.f12732A = iVar.m0();
        return yVar;
    }

    public final y H0(l lVar) {
        return new y(this.f12661p, lVar, this.f12657l, this.f12658m, this.f12655j);
    }

    public final void I0(i iVar) {
        k kVarS = iVar.s();
        if (kVarS == k.FIELD_NAME) {
            if (this.f12659n) {
                C0(iVar);
            }
            T(iVar.o());
            kVarS = iVar.B0();
        } else if (kVarS == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int iOrdinal = kVarS.ordinal();
        if (iOrdinal == 1) {
            if (this.f12659n) {
                C0(iVar);
            }
            o0();
            D0(iVar);
            return;
        }
        if (iOrdinal == 2) {
            M();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                E0(iVar, kVarS);
                return;
            } else {
                L();
                return;
            }
        }
        if (this.f12659n) {
            C0(iVar);
        }
        l0();
        D0(iVar);
    }

    @Override // T1.e
    public final void J(boolean z5) {
        A0(z5 ? k.VALUE_TRUE : k.VALUE_FALSE);
    }

    @Override // T1.e
    public final void L() {
        z zVarA = this.f12662q.a(this.f12663r, k.END_ARRAY);
        if (zVarA == null) {
            this.f12663r++;
        } else {
            this.f12662q = zVarA;
            this.f12663r = 1;
        }
        d dVar = this.f12667v.f5830c;
        if (dVar != null) {
            this.f12667v = dVar;
        }
    }

    @Override // T1.e
    public final void M() {
        z zVarA = this.f12662q.a(this.f12663r, k.END_OBJECT);
        if (zVarA == null) {
            this.f12663r++;
        } else {
            this.f12662q = zVarA;
            this.f12663r = 1;
        }
        d dVar = this.f12667v.f5830c;
        if (dVar != null) {
            this.f12667v = dVar;
        }
    }

    @Override // T1.e
    public final void Q(n nVar) {
        this.f12667v.k(((h) nVar).f5505h);
        x0(nVar);
    }

    @Override // T1.e
    public final void T(String str) {
        this.f12667v.k(str);
        x0(str);
    }

    @Override // T1.e
    public final void V() {
        A0(k.VALUE_NULL);
    }

    @Override // T1.e
    public final void X(double d6) {
        B0(k.VALUE_NUMBER_FLOAT, Double.valueOf(d6));
    }

    @Override // T1.e
    public final void Y(float f6) {
        B0(k.VALUE_NUMBER_FLOAT, Float.valueOf(f6));
    }

    @Override // T1.e
    public final void Z(int i) {
        B0(k.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    @Override // T1.e
    public final void a0(long j4) {
        B0(k.VALUE_NUMBER_INT, Long.valueOf(j4));
    }

    @Override // T1.e
    public final void b0(String str) {
        B0(k.VALUE_NUMBER_FLOAT, str);
    }

    @Override // T1.e
    public final void c0(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            V();
        } else {
            B0(k.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // T1.e
    public final void d0(BigInteger bigInteger) {
        if (bigInteger == null) {
            V();
        } else {
            B0(k.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // T1.e
    public final void e0(short s6) {
        B0(k.VALUE_NUMBER_INT, Short.valueOf(s6));
    }

    @Override // T1.e
    public final void f0(Object obj) {
        if (obj == null) {
            V();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof v)) {
            B0(k.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        l lVar = this.i;
        if (lVar == null) {
            B0(k.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            lVar.a(this, obj);
        }
    }

    @Override // T1.e, java.io.Flushable
    public final void flush() {
    }

    @Override // T1.e
    public final void g0(String str) {
        this.f12665t = str;
        this.f12666u = true;
    }

    @Override // T1.e
    public final void h0(n nVar) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // T1.e
    public final void i0(String str) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // T1.e
    public final boolean k() {
        return this.f12658m;
    }

    @Override // T1.e
    public final void k0(String str) {
        k kVar = k.VALUE_EMBEDDED_OBJECT;
        v vVar = new v();
        vVar.f12714h = str;
        B0(kVar, vVar);
    }

    @Override // T1.e
    public final void l0() {
        this.f12667v.l();
        z0(k.START_ARRAY);
        d dVar = this.f12667v;
        d dVar2 = dVar.f5832e;
        if (dVar2 == null) {
            H1.d dVar3 = dVar.f5831d;
            dVar2 = new d(1, dVar, dVar3 != null ? dVar3.d() : null);
            dVar.f5832e = dVar2;
        } else {
            dVar2.f5215a = 1;
            dVar2.f5216b = -1;
            dVar2.f5833f = null;
            dVar2.f5835h = false;
            dVar2.f5834g = null;
            H1.d dVar4 = dVar2.f5831d;
            if (dVar4 != null) {
                dVar4.f1757h = null;
                dVar4.f1758j = null;
                dVar4.f1759k = null;
            }
        }
        this.f12667v = dVar2;
    }

    @Override // T1.e
    public final void m0(Object obj) {
        this.f12667v.l();
        z0(k.START_ARRAY);
        this.f12667v = this.f12667v.i(obj);
    }

    @Override // T1.e
    public final void n0(Object obj) {
        this.f12667v.l();
        z0(k.START_ARRAY);
        this.f12667v = this.f12667v.i(obj);
    }

    @Override // T1.e
    public final boolean o() {
        return this.f12657l;
    }

    @Override // T1.e
    public final void o0() {
        this.f12667v.l();
        z0(k.START_OBJECT);
        d dVar = this.f12667v;
        d dVar2 = dVar.f5832e;
        if (dVar2 == null) {
            H1.d dVar3 = dVar.f5831d;
            dVar2 = new d(2, dVar, dVar3 != null ? dVar3.d() : null);
            dVar.f5832e = dVar2;
        } else {
            dVar2.f5215a = 2;
            dVar2.f5216b = -1;
            dVar2.f5833f = null;
            dVar2.f5835h = false;
            dVar2.f5834g = null;
            H1.d dVar4 = dVar2.f5831d;
            if (dVar4 != null) {
                dVar4.f1757h = null;
                dVar4.f1758j = null;
                dVar4.f1759k = null;
            }
        }
        this.f12667v = dVar2;
    }

    @Override // T1.e
    public final void p0(Object obj) {
        this.f12667v.l();
        z0(k.START_OBJECT);
        this.f12667v = this.f12667v.j(obj);
    }

    @Override // T1.e
    public final void q0(Object obj) {
        this.f12667v.l();
        z0(k.START_OBJECT);
        this.f12667v = this.f12667v.j(obj);
    }

    @Override // T1.e
    public final void r0(n nVar) {
        if (nVar == null) {
            V();
        } else {
            B0(k.VALUE_STRING, nVar);
        }
    }

    @Override // T1.e
    public final d s() {
        return this.f12667v;
    }

    @Override // T1.e
    public final void s0(String str) {
        if (str == null) {
            V();
        } else {
            B0(k.VALUE_STRING, str);
        }
    }

    @Override // T1.e
    public final void t0(char[] cArr, int i, int i3) {
        s0(new String(cArr, i, i3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        y yVarH0 = H0(this.i);
        int i = 0;
        boolean z5 = this.f12657l || this.f12658m;
        while (true) {
            try {
                k kVarB0 = yVarH0.B0();
                if (kVarB0 == null) {
                    break;
                }
                if (z5) {
                    y0(sb);
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(kVarB0.toString());
                    if (kVarB0 == k.FIELD_NAME) {
                        sb.append('(');
                        sb.append(yVarH0.o());
                        sb.append(')');
                    }
                }
                i++;
            } catch (IOException e6) {
                throw new IllegalStateException(e6);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i - 100);
            sb.append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // T1.e
    public final void u0(Object obj) {
        this.f12664s = obj;
        this.f12666u = true;
    }

    @Override // T1.e
    public final boolean v(T1.d dVar) {
        return (this.f12656k & dVar.i) != 0;
    }

    public final void x0(Object obj) {
        z zVar = null;
        if (this.f12666u) {
            z zVar2 = this.f12662q;
            int i = this.f12663r;
            k kVar = k.FIELD_NAME;
            Object obj2 = this.f12665t;
            Object obj3 = this.f12664s;
            if (i < 16) {
                zVar2.f12744c[i] = obj;
                long jOrdinal = kVar.ordinal();
                if (i > 0) {
                    jOrdinal <<= i << 2;
                }
                zVar2.f12743b = jOrdinal | zVar2.f12743b;
                zVar2.b(obj2, i, obj3);
            } else {
                zVar2.getClass();
                z zVar3 = new z();
                zVar2.f12742a = zVar3;
                zVar3.f12744c[0] = obj;
                zVar3.f12743b = ((long) kVar.ordinal()) | zVar3.f12743b;
                zVar3.b(obj2, 0, obj3);
                zVar = zVar2.f12742a;
            }
        } else {
            z zVar4 = this.f12662q;
            int i3 = this.f12663r;
            k kVar2 = k.FIELD_NAME;
            if (i3 < 16) {
                zVar4.f12744c[i3] = obj;
                long jOrdinal2 = kVar2.ordinal();
                if (i3 > 0) {
                    jOrdinal2 <<= i3 << 2;
                }
                zVar4.f12743b |= jOrdinal2;
            } else {
                zVar4.getClass();
                z zVar5 = new z();
                zVar4.f12742a = zVar5;
                zVar5.f12744c[0] = obj;
                zVar5.f12743b = ((long) kVar2.ordinal()) | zVar5.f12743b;
                zVar = zVar4.f12742a;
            }
        }
        if (zVar == null) {
            this.f12663r++;
        } else {
            this.f12662q = zVar;
            this.f12663r = 1;
        }
    }

    public final void y0(StringBuilder sb) {
        z zVar = this.f12662q;
        int i = this.f12663r - 1;
        TreeMap treeMap = zVar.f12745d;
        Object obj = treeMap == null ? null : treeMap.get(Integer.valueOf(i + i + 1));
        if (obj != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(obj));
            sb.append(']');
        }
        z zVar2 = this.f12662q;
        int i3 = this.f12663r - 1;
        TreeMap treeMap2 = zVar2.f12745d;
        Object obj2 = treeMap2 != null ? treeMap2.get(Integer.valueOf(i3 + i3)) : null;
        if (obj2 != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(obj2));
            sb.append(']');
        }
    }

    public final void z0(k kVar) {
        z zVarA;
        if (this.f12666u) {
            z zVar = this.f12662q;
            int i = this.f12663r;
            Object obj = this.f12665t;
            Object obj2 = this.f12664s;
            zVar.getClass();
            if (i < 16) {
                long jOrdinal = kVar.ordinal();
                if (i > 0) {
                    jOrdinal <<= i << 2;
                }
                zVar.f12743b = jOrdinal | zVar.f12743b;
                zVar.b(obj, i, obj2);
                zVarA = null;
            } else {
                z zVar2 = new z();
                zVar.f12742a = zVar2;
                zVar2.f12743b = ((long) kVar.ordinal()) | zVar2.f12743b;
                zVar2.b(obj, 0, obj2);
                zVarA = zVar.f12742a;
            }
        } else {
            zVarA = this.f12662q.a(this.f12663r, kVar);
        }
        if (zVarA == null) {
            this.f12663r++;
        } else {
            this.f12662q = zVarA;
            this.f12663r = 1;
        }
    }
}
