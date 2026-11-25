package p032f2;

import U1.c;
import com.fasterxml.jackson.databind.deser.std.C0527x;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.math.BigDecimal;
import java.math.BigInteger;
import p015c2.C0474e;
import p015c2.f;
import p015c2.h;
import p046i2.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public m A() {
        return null;
    }

    public h B() {
        return null;
    }

    public r[] C(C0474e c0474e) {
        return null;
    }

    public abstract Class D();

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this instanceof C0527x;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return z() != null;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return j() || k() || i() || g() || h() || e() || f() || d() || c();
    }

    public Object m(f fVar, BigDecimal bigDecimal) throws MismatchedInputException {
        fVar.o0(D(), this, "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)", bigDecimal);
        throw null;
    }

    public Object n(f fVar, BigInteger bigInteger) throws MismatchedInputException {
        fVar.o0(D(), this, "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)", bigInteger);
        throw null;
    }

    public Object o(f fVar, boolean z5) throws MismatchedInputException {
        fVar.o0(D(), this, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z5));
        throw null;
    }

    public Object p(f fVar, double d6) throws MismatchedInputException {
        fVar.o0(D(), this, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d6));
        throw null;
    }

    public Object q(f fVar, int i) throws MismatchedInputException {
        fVar.o0(D(), this, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i));
        throw null;
    }

    public Object r(f fVar, long j4) throws MismatchedInputException {
        fVar.o0(D(), this, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j4));
        throw null;
    }

    public Object s(f fVar, Object[] objArr) {
        fVar.o0(D(), this, "no creator with arguments specified", new Object[0]);
        throw null;
    }

    public Object t(f fVar, String str) throws MismatchedInputException {
        Class clsD = D();
        c cVar = fVar.f7252o;
        fVar.o0(clsD, this, "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
        throw null;
    }

    public Object u(f fVar, Object obj) throws MismatchedInputException {
        fVar.o0(D(), this, "no array delegate creator specified", new Object[0]);
        throw null;
    }

    public Object v(f fVar) throws MismatchedInputException {
        fVar.o0(D(), this, "no default no-arguments constructor found", new Object[0]);
        throw null;
    }

    public Object w(f fVar, Object obj) throws MismatchedInputException {
        fVar.o0(D(), this, "no delegate creator specified", new Object[0]);
        throw null;
    }

    public m x() {
        return null;
    }

    public h y() {
        return null;
    }

    public m z() {
        return null;
    }
}
