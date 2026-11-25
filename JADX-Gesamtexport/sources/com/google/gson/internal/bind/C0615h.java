package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.gson.internal.bind.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0615h extends p138z3.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0614g f8094y = new C0614g();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p105t3.u f8095z = new p105t3.u("closed");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f8096v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f8097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p105t3.r f8098x;

    public C0615h() {
        super(f8094y);
        this.f8096v = new ArrayList();
        this.f8098x = p105t3.s.f12591h;
    }

    @Override // p138z3.c
    public final void C(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f8096v.isEmpty() || this.f8097w != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(c0() instanceof p105t3.t)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f8097w = str;
    }

    @Override // p138z3.c
    public final p138z3.c G() {
        d0(p105t3.s.f12591h);
        return this;
    }

    @Override // p138z3.c
    public final void T(double d6) {
        if (this.f14654o == 1 || (!Double.isNaN(d6) && !Double.isInfinite(d6))) {
            d0(new p105t3.u(Double.valueOf(d6)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d6);
        }
    }

    @Override // p138z3.c
    public final void V(long j4) {
        d0(new p105t3.u(Long.valueOf(j4)));
    }

    @Override // p138z3.c
    public final void X(Boolean bool) {
        if (bool == null) {
            d0(p105t3.s.f12591h);
        } else {
            d0(new p105t3.u(bool));
        }
    }

    @Override // p138z3.c
    public final void Y(Number number) {
        if (number == null) {
            d0(p105t3.s.f12591h);
            return;
        }
        if (this.f14654o != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        d0(new p105t3.u(number));
    }

    @Override // p138z3.c
    public final void Z(String str) {
        if (str == null) {
            d0(p105t3.s.f12591h);
        } else {
            d0(new p105t3.u(str));
        }
    }

    @Override // p138z3.c
    public final void a0(boolean z5) {
        d0(new p105t3.u(Boolean.valueOf(z5)));
    }

    @Override // p138z3.c
    public final void c() {
        p105t3.o oVar = new p105t3.o();
        d0(oVar);
        this.f8096v.add(oVar);
    }

    public final p105t3.r c0() {
        ArrayList arrayList = this.f8096v;
        return (p105t3.r) arrayList.get(arrayList.size() - 1);
    }

    @Override // p138z3.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f8096v;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f8095z);
    }

    public final void d0(p105t3.r rVar) {
        if (this.f8097w != null) {
            if (!(rVar instanceof p105t3.s) || this.f14657r) {
                p105t3.t tVar = (p105t3.t) c0();
                tVar.f12592h.put(this.f8097w, rVar);
            }
            this.f8097w = null;
            return;
        }
        if (this.f8096v.isEmpty()) {
            this.f8098x = rVar;
            return;
        }
        p105t3.r rVarC0 = c0();
        if (!(rVarC0 instanceof p105t3.o)) {
            throw new IllegalStateException();
        }
        ((p105t3.o) rVarC0).f12590h.add(rVar);
    }

    @Override // p138z3.c, java.io.Flushable
    public final void flush() {
    }

    @Override // p138z3.c
    public final void k() {
        p105t3.t tVar = new p105t3.t();
        d0(tVar);
        this.f8096v.add(tVar);
    }

    @Override // p138z3.c
    public final void s() {
        ArrayList arrayList = this.f8096v;
        if (arrayList.isEmpty() || this.f8097w != null) {
            throw new IllegalStateException();
        }
        if (!(c0() instanceof p105t3.o)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // p138z3.c
    public final void v() {
        ArrayList arrayList = this.f8096v;
        if (arrayList.isEmpty() || this.f8097w != null) {
            throw new IllegalStateException();
        }
        if (!(c0() instanceof p105t3.t)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
