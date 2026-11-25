package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import p015c2.C0474e;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends p032f2.t implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7624h;
    public final Class i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p046i2.m f7625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p046i2.m f7626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p032f2.r[] f7627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p015c2.h f7628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p046i2.m f7629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p032f2.r[] f7630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p015c2.h f7631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p046i2.m f7632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p032f2.r[] f7633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p046i2.m f7634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p046i2.m f7635t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p046i2.m f7636u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p046i2.m f7637v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p046i2.m f7638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p046i2.m f7639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p046i2.m f7640y;

    public o0(p015c2.h hVar) {
        this.f7624h = hVar == null ? "UNKNOWN TYPE" : hVar.toString();
        this.i = hVar == null ? Object.class : hVar.f7281k;
    }

    @Override // p032f2.t
    public final p046i2.m A() {
        return this.f7629n;
    }

    @Override // p032f2.t
    public final p015c2.h B() {
        return this.f7628m;
    }

    @Override // p032f2.t
    public final p032f2.r[] C(C0474e c0474e) {
        return this.f7627l;
    }

    @Override // p032f2.t
    public final Class D() {
        return this.i;
    }

    public final Object E(p046i2.m mVar, p032f2.r[] rVarArr, p015c2.f fVar, Object obj) throws JsonMappingException {
        if (mVar == null) {
            throw new IllegalStateException("No delegate constructor for " + this.f7624h);
        }
        try {
            if (rVarArr == null) {
                return mVar.w(obj);
            }
            int length = rVarArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                p032f2.r rVar = rVarArr[i];
                if (rVar != null) {
                    fVar.g0(rVar.o());
                    throw null;
                }
                objArr[i] = obj;
            }
            return mVar.v(objArr);
        } catch (Throwable th) {
            throw F(fVar, th);
        }
    }

    public final JsonMappingException F(p015c2.f fVar, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        return th instanceof JsonMappingException ? (JsonMappingException) th : fVar.y0(this.i, th);
    }

    @Override // p032f2.t
    public final boolean a() {
        return this.f7639x != null;
    }

    @Override // p032f2.t
    public final boolean b() {
        return this.f7637v != null;
    }

    @Override // p032f2.t
    public final boolean c() {
        return this.f7640y != null;
    }

    @Override // p032f2.t
    public final boolean d() {
        return this.f7638w != null;
    }

    @Override // p032f2.t
    public final boolean e() {
        return this.f7635t != null;
    }

    @Override // p032f2.t
    public final boolean f() {
        return this.f7636u != null;
    }

    @Override // p032f2.t
    public final boolean g() {
        return this.f7626k != null;
    }

    @Override // p032f2.t
    public final boolean h() {
        return this.f7634s != null;
    }

    @Override // p032f2.t
    public final boolean i() {
        return this.f7631p != null;
    }

    @Override // p032f2.t
    public final boolean j() {
        return this.f7625j != null;
    }

    @Override // p032f2.t
    public final boolean k() {
        return this.f7628m != null;
    }

    @Override // p032f2.t
    public final boolean l() {
        return j() || k() || i() || g() || h() || e() || f() || d() || c();
    }

    @Override // p032f2.t
    public final Object m(p015c2.f fVar, BigDecimal bigDecimal) throws ValueInstantiationException, MismatchedInputException {
        p046i2.m mVar = this.f7639x;
        if (mVar != null) {
            try {
                return mVar.w(bigDecimal);
            } catch (Throwable th) {
                fVar.n0(this.f7639x.n(), F(fVar, th));
                throw null;
            }
        }
        if (this.f7638w != null) {
            double dDoubleValue = bigDecimal.doubleValue();
            Double dValueOf = Double.isInfinite(dDoubleValue) ? null : Double.valueOf(dDoubleValue);
            if (dValueOf != null) {
                try {
                    return this.f7638w.w(dValueOf);
                } catch (Throwable th2) {
                    fVar.n0(this.f7638w.n(), F(fVar, th2));
                    throw null;
                }
            }
        }
        super.m(fVar, bigDecimal);
        throw null;
    }

    @Override // p032f2.t
    public final Object n(p015c2.f fVar, BigInteger bigInteger) throws ValueInstantiationException, MismatchedInputException {
        p046i2.m mVar = this.f7637v;
        if (mVar == null) {
            super.n(fVar, bigInteger);
            throw null;
        }
        try {
            return mVar.w(bigInteger);
        } catch (Throwable th) {
            fVar.n0(this.f7637v.n(), F(fVar, th));
            throw null;
        }
    }

    @Override // p032f2.t
    public final Object o(p015c2.f fVar, boolean z5) throws ValueInstantiationException, MismatchedInputException {
        if (this.f7640y == null) {
            super.o(fVar, z5);
            throw null;
        }
        try {
            return this.f7640y.w(Boolean.valueOf(z5));
        } catch (Throwable th) {
            fVar.n0(this.f7640y.n(), F(fVar, th));
            throw null;
        }
    }

    @Override // p032f2.t
    public final Object p(p015c2.f fVar, double d6) throws ValueInstantiationException, MismatchedInputException {
        if (this.f7638w != null) {
            try {
                return this.f7638w.w(Double.valueOf(d6));
            } catch (Throwable th) {
                fVar.n0(this.f7638w.n(), F(fVar, th));
                throw null;
            }
        }
        if (this.f7639x == null) {
            super.p(fVar, d6);
            throw null;
        }
        try {
            return this.f7639x.w(BigDecimal.valueOf(d6));
        } catch (Throwable th2) {
            fVar.n0(this.f7639x.n(), F(fVar, th2));
            throw null;
        }
    }

    @Override // p032f2.t
    public final Object q(p015c2.f fVar, int i) throws ValueInstantiationException, MismatchedInputException {
        if (this.f7635t != null) {
            try {
                return this.f7635t.w(Integer.valueOf(i));
            } catch (Throwable th) {
                fVar.n0(this.f7635t.n(), F(fVar, th));
                throw null;
            }
        }
        if (this.f7636u != null) {
            try {
                return this.f7636u.w(Long.valueOf(i));
            } catch (Throwable th2) {
                fVar.n0(this.f7636u.n(), F(fVar, th2));
                throw null;
            }
        }
        if (this.f7637v == null) {
            super.q(fVar, i);
            throw null;
        }
        try {
            return this.f7637v.w(BigInteger.valueOf(i));
        } catch (Throwable th3) {
            fVar.n0(this.f7637v.n(), F(fVar, th3));
            throw null;
        }
    }

    @Override // p032f2.t
    public final Object r(p015c2.f fVar, long j4) throws ValueInstantiationException, MismatchedInputException {
        if (this.f7636u != null) {
            try {
                return this.f7636u.w(Long.valueOf(j4));
            } catch (Throwable th) {
                fVar.n0(this.f7636u.n(), F(fVar, th));
                throw null;
            }
        }
        if (this.f7637v == null) {
            super.r(fVar, j4);
            throw null;
        }
        try {
            return this.f7637v.w(BigInteger.valueOf(j4));
        } catch (Throwable th2) {
            fVar.n0(this.f7637v.n(), F(fVar, th2));
            throw null;
        }
    }

    @Override // p032f2.t
    public final Object s(p015c2.f fVar, Object[] objArr) throws ValueInstantiationException {
        p046i2.m mVar = this.f7626k;
        if (mVar == null) {
            super.s(fVar, objArr);
            throw null;
        }
        try {
            return mVar.v(objArr);
        } catch (Exception e6) {
            fVar.n0(this.i, F(fVar, e6));
            throw null;
        }
    }

    @Override // p032f2.t
    public final Object t(p015c2.f fVar, String str) throws ValueInstantiationException, MismatchedInputException {
        p046i2.m mVar = this.f7634s;
        if (mVar == null) {
            super.t(fVar, str);
            throw null;
        }
        try {
            return mVar.w(str);
        } catch (Throwable th) {
            fVar.n0(this.f7634s.n(), F(fVar, th));
            throw null;
        }
    }

    @Override // p032f2.t
    public final Object u(p015c2.f fVar, Object obj) {
        p046i2.m mVar = this.f7632q;
        return (mVar != null || this.f7629n == null) ? E(mVar, this.f7633r, fVar, obj) : w(fVar, obj);
    }

    @Override // p032f2.t
    public final Object v(p015c2.f fVar) throws ValueInstantiationException, MismatchedInputException {
        p046i2.m mVar = this.f7625j;
        if (mVar == null) {
            super.v(fVar);
            throw null;
        }
        try {
            return mVar.u();
        } catch (Exception e6) {
            fVar.n0(this.i, F(fVar, e6));
            throw null;
        }
    }

    @Override // p032f2.t
    public final Object w(p015c2.f fVar, Object obj) {
        p046i2.m mVar;
        p046i2.m mVar2 = this.f7629n;
        return (mVar2 != null || (mVar = this.f7632q) == null) ? E(mVar2, this.f7630o, fVar, obj) : E(mVar, this.f7633r, fVar, obj);
    }

    @Override // p032f2.t
    public final p046i2.m x() {
        return this.f7632q;
    }

    @Override // p032f2.t
    public final p015c2.h y() {
        return this.f7631p;
    }

    @Override // p032f2.t
    public final p046i2.m z() {
        return this.f7625j;
    }
}
