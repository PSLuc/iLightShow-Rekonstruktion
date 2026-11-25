package p096s;

import E4.k;

/* JADX INFO: renamed from: s.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0910d0 implements y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f11972h;
    public final long i;

    public C0910d0(y0 y0Var, long j4) {
        this.f11972h = y0Var;
        this.i = j4;
    }

    @Override // p096s.y0
    public final boolean a() {
        return this.f11972h.a();
    }

    @Override // p096s.y0
    public final long b(AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return this.f11972h.b(abstractC0924q, abstractC0924q2, abstractC0924q3) + this.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0910d0)) {
            return false;
        }
        C0910d0 c0910d0 = (C0910d0) obj;
        return c0910d0.i == this.i && k.a(c0910d0.f11972h, this.f11972h);
    }

    @Override // p096s.y0
    public final AbstractC0924q f(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        long j6 = this.i;
        return j4 < j6 ? abstractC0924q : this.f11972h.f(j4 - j6, abstractC0924q, abstractC0924q2, abstractC0924q3);
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + (this.f11972h.hashCode() * 31);
    }

    @Override // p096s.y0
    public final AbstractC0924q k(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        long j6 = this.i;
        return j4 < j6 ? abstractC0924q3 : this.f11972h.k(j4 - j6, abstractC0924q, abstractC0924q2, abstractC0924q3);
    }
}
