package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0426k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0425j f6884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6887d = 0;

    public C0426k(AbstractC0425j abstractC0425j) {
        Charset charset = AbstractC0438x.f6926a;
        this.f6884a = abstractC0425j;
        abstractC0425j.f6882b = this;
    }

    public final int a() {
        int i = this.f6887d;
        if (i != 0) {
            this.f6885b = i;
            this.f6887d = 0;
        } else {
            this.f6885b = this.f6884a.u();
        }
        int i3 = this.f6885b;
        if (i3 == 0 || i3 == this.f6886c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public final void b(Object obj, V v6, C0429n c0429n) {
        int i = this.f6886c;
        this.f6886c = ((this.f6885b >>> 3) << 3) | 4;
        try {
            v6.h(obj, this, c0429n);
            if (this.f6885b != this.f6886c) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            this.f6886c = i;
        } catch (Throwable th) {
            this.f6886c = i;
            throw th;
        }
    }

    public final void c(Object obj, V v6, C0429n c0429n) throws InvalidProtocolBufferException {
        AbstractC0425j abstractC0425j = this.f6884a;
        int iV = abstractC0425j.v();
        if (abstractC0425j.f6881a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = abstractC0425j.e(iV);
        abstractC0425j.f6881a++;
        v6.h(obj, this, c0429n);
        abstractC0425j.a(0);
        abstractC0425j.f6881a--;
        abstractC0425j.d(iE);
    }

    public final void d(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 0) {
            do {
                ((T) interfaceC0437w).add(Boolean.valueOf(abstractC0425j.f()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = abstractC0425j.b() + abstractC0425j.v();
        do {
            ((T) interfaceC0437w).add(Boolean.valueOf(abstractC0425j.f()));
        } while (abstractC0425j.b() < iB);
        v(iB);
    }

    public final C0422g e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        w(2);
        return this.f6884a.g();
    }

    public final void f(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iU;
        if ((this.f6885b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((T) interfaceC0437w).add(e());
            AbstractC0425j abstractC0425j = this.f6884a;
            if (abstractC0425j.c()) {
                return;
            } else {
                iU = abstractC0425j.u();
            }
        } while (iU == this.f6885b);
        this.f6887d = iU;
    }

    public final void g(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 1) {
            do {
                ((T) interfaceC0437w).add(Double.valueOf(abstractC0425j.h()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iV = abstractC0425j.v();
        if ((iV & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iB = abstractC0425j.b() + iV;
        do {
            ((T) interfaceC0437w).add(Double.valueOf(abstractC0425j.h()));
        } while (abstractC0425j.b() < iB);
    }

    public final void h(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 0) {
            do {
                ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.i()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = abstractC0425j.b() + abstractC0425j.v();
        do {
            ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.i()));
        } while (abstractC0425j.b() < iB);
        v(iB);
    }

    public final Object i(q0 q0Var, Class cls, C0429n c0429n) throws InvalidProtocolBufferException {
        int iOrdinal = q0Var.ordinal();
        AbstractC0425j abstractC0425j = this.f6884a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC0425j.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0425j.l());
            case 2:
                w(0);
                return Long.valueOf(abstractC0425j.n());
            case 3:
                w(0);
                return Long.valueOf(abstractC0425j.w());
            case 4:
                w(0);
                return Integer.valueOf(abstractC0425j.m());
            case 5:
                w(1);
                return Long.valueOf(abstractC0425j.k());
            case 6:
                w(5);
                return Integer.valueOf(abstractC0425j.j());
            case 7:
                w(0);
                return Boolean.valueOf(abstractC0425j.f());
            case 8:
                w(2);
                return abstractC0425j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                V vA = S.f6818c.a(cls);
                AbstractC0436v abstractC0436vD = vA.d();
                c(abstractC0436vD, vA, c0429n);
                vA.b(abstractC0436vD);
                return abstractC0436vD;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0425j.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0425j.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0425j.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0425j.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0425j.q());
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                w(0);
                return Long.valueOf(abstractC0425j.r());
        }
    }

    public final void j(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 2) {
            int iV = abstractC0425j.v();
            if ((iV & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB = abstractC0425j.b() + iV;
            do {
                ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.j()));
            } while (abstractC0425j.b() < iB);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.j()));
            if (abstractC0425j.c()) {
                return;
            } else {
                iU = abstractC0425j.u();
            }
        } while (iU == this.f6885b);
        this.f6887d = iU;
    }

    public final void k(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 1) {
            do {
                ((T) interfaceC0437w).add(Long.valueOf(abstractC0425j.k()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iV = abstractC0425j.v();
        if ((iV & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iB = abstractC0425j.b() + iV;
        do {
            ((T) interfaceC0437w).add(Long.valueOf(abstractC0425j.k()));
        } while (abstractC0425j.b() < iB);
    }

    public final void l(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 2) {
            int iV = abstractC0425j.v();
            if ((iV & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB = abstractC0425j.b() + iV;
            do {
                ((T) interfaceC0437w).add(Float.valueOf(abstractC0425j.l()));
            } while (abstractC0425j.b() < iB);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((T) interfaceC0437w).add(Float.valueOf(abstractC0425j.l()));
            if (abstractC0425j.c()) {
                return;
            } else {
                iU = abstractC0425j.u();
            }
        } while (iU == this.f6885b);
        this.f6887d = iU;
    }

    public final void m(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 0) {
            do {
                ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.m()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = abstractC0425j.b() + abstractC0425j.v();
        do {
            ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.m()));
        } while (abstractC0425j.b() < iB);
        v(iB);
    }

    public final void n(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 0) {
            do {
                ((T) interfaceC0437w).add(Long.valueOf(abstractC0425j.n()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = abstractC0425j.b() + abstractC0425j.v();
        do {
            ((T) interfaceC0437w).add(Long.valueOf(abstractC0425j.n()));
        } while (abstractC0425j.b() < iB);
        v(iB);
    }

    public final void o(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 2) {
            int iV = abstractC0425j.v();
            if ((iV & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB = abstractC0425j.b() + iV;
            do {
                ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.o()));
            } while (abstractC0425j.b() < iB);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.o()));
            if (abstractC0425j.c()) {
                return;
            } else {
                iU = abstractC0425j.u();
            }
        } while (iU == this.f6885b);
        this.f6887d = iU;
    }

    public final void p(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 1) {
            do {
                ((T) interfaceC0437w).add(Long.valueOf(abstractC0425j.p()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iV = abstractC0425j.v();
        if ((iV & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iB = abstractC0425j.b() + iV;
        do {
            ((T) interfaceC0437w).add(Long.valueOf(abstractC0425j.p()));
        } while (abstractC0425j.b() < iB);
    }

    public final void q(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 0) {
            do {
                ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.q()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = abstractC0425j.b() + abstractC0425j.v();
        do {
            ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.q()));
        } while (abstractC0425j.b() < iB);
        v(iB);
    }

    public final void r(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 0) {
            do {
                ((T) interfaceC0437w).add(Long.valueOf(abstractC0425j.r()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = abstractC0425j.b() + abstractC0425j.v();
        do {
            ((T) interfaceC0437w).add(Long.valueOf(abstractC0425j.r()));
        } while (abstractC0425j.b() < iB);
        v(iB);
    }

    public final void s(InterfaceC0437w interfaceC0437w, boolean z5) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strS;
        int iU;
        if ((this.f6885b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            AbstractC0425j abstractC0425j = this.f6884a;
            if (z5) {
                w(2);
                strS = abstractC0425j.t();
            } else {
                w(2);
                strS = abstractC0425j.s();
            }
            ((T) interfaceC0437w).add(strS);
            if (abstractC0425j.c()) {
                return;
            } else {
                iU = abstractC0425j.u();
            }
        } while (iU == this.f6885b);
        this.f6887d = iU;
    }

    public final void t(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 0) {
            do {
                ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.v()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = abstractC0425j.b() + abstractC0425j.v();
        do {
            ((T) interfaceC0437w).add(Integer.valueOf(abstractC0425j.v()));
        } while (abstractC0425j.b() < iB);
        v(iB);
    }

    public final void u(InterfaceC0437w interfaceC0437w) throws InvalidProtocolBufferException {
        int iU;
        int i = this.f6885b & 7;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (i == 0) {
            do {
                ((T) interfaceC0437w).add(Long.valueOf(abstractC0425j.w()));
                if (abstractC0425j.c()) {
                    return;
                } else {
                    iU = abstractC0425j.u();
                }
            } while (iU == this.f6885b);
            this.f6887d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = abstractC0425j.b() + abstractC0425j.v();
        do {
            ((T) interfaceC0437w).add(Long.valueOf(abstractC0425j.w()));
        } while (abstractC0425j.b() < iB);
        v(iB);
    }

    public final void v(int i) throws InvalidProtocolBufferException {
        if (this.f6884a.b() != i) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void w(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f6885b & 7) != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean x() {
        int i;
        AbstractC0425j abstractC0425j = this.f6884a;
        if (abstractC0425j.c() || (i = this.f6885b) == this.f6886c) {
            return false;
        }
        return abstractC0425j.x(i);
    }
}
