package p009b2;

import T1.a;
import T1.h;
import T1.i;
import T1.k;
import T1.l;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import p109u2.f;
import p109u2.y;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f7076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i[] f7077k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7079m = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7078l = 1;

    public j(i[] iVarArr) {
        this.f7076j = iVarArr[0];
        this.f7077k = iVarArr;
    }

    public static j H0(y yVar, i iVar) {
        if (!(iVar instanceof j)) {
            return new j(new i[]{yVar, iVar});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(yVar);
        if (iVar instanceof j) {
            ((j) iVar).G0(arrayList);
        } else {
            arrayList.add(iVar);
        }
        return new j((i[]) arrayList.toArray(new i[arrayList.size()]));
    }

    @Override // T1.i
    public final k B0() {
        k kVarB0;
        i iVar = this.f7076j;
        if (iVar == null) {
            return null;
        }
        if (this.f7079m) {
            this.f7079m = false;
            return iVar.s();
        }
        k kVarB1 = iVar.B0();
        if (kVarB1 != null) {
            return kVarB1;
        }
        do {
            int i = this.f7078l;
            i[] iVarArr = this.f7077k;
            if (i >= iVarArr.length) {
                return null;
            }
            this.f7078l = i + 1;
            i iVar2 = iVarArr[i];
            this.f7076j = iVar2;
            kVarB0 = iVar2.B0();
        } while (kVarB0 == null);
        return kVarB0;
    }

    @Override // T1.i
    public final BigInteger C() {
        return this.f7076j.C();
    }

    @Override // T1.i
    public final int C0(a aVar, f fVar) {
        return this.f7076j.C0(aVar, fVar);
    }

    @Override // T1.i
    public final byte[] D(a aVar) {
        return this.f7076j.D(aVar);
    }

    @Override // T1.i
    public final boolean D0() {
        return this.f7076j.D0();
    }

    @Override // T1.i
    public final void E0(Object obj) {
        this.f7076j.E0(obj);
    }

    @Override // T1.i
    public final i F0() {
        if (this.f7076j.s() == k.START_OBJECT || this.f7076j.s() == k.START_ARRAY) {
            int i = 1;
            while (true) {
                k kVarB0 = B0();
                if (kVarB0 == null) {
                    break;
                }
                if (!kVarB0.f5234l) {
                    if (kVarB0.f5235m && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        return this;
    }

    @Override // T1.i
    public final boolean G() {
        return this.f7076j.G();
    }

    public final void G0(ArrayList arrayList) {
        i[] iVarArr = this.f7077k;
        int length = iVarArr.length;
        for (int i = this.f7078l - 1; i < length; i++) {
            i iVar = iVarArr[i];
            if (iVar instanceof j) {
                ((j) iVar).G0(arrayList);
            } else {
                arrayList.add(iVar);
            }
        }
    }

    @Override // T1.i
    public final byte J() {
        return this.f7076j.J();
    }

    @Override // T1.i
    public final l L() {
        return this.f7076j.L();
    }

    @Override // T1.i
    public final T1.f M() {
        return this.f7076j.M();
    }

    @Override // T1.i
    public final String Q() {
        return this.f7076j.Q();
    }

    @Override // T1.i
    public final BigDecimal T() {
        return this.f7076j.T();
    }

    @Override // T1.i
    public final double V() {
        return this.f7076j.V();
    }

    @Override // T1.i
    public final Object X() {
        return this.f7076j.X();
    }

    @Override // T1.i
    public final float Y() {
        return this.f7076j.Y();
    }

    @Override // T1.i
    public final int Z() {
        return this.f7076j.Z();
    }

    @Override // T1.i
    public final long a0() {
        return this.f7076j.a0();
    }

    @Override // T1.i
    public final boolean b() {
        return this.f7076j.b();
    }

    @Override // T1.i
    public final h b0() {
        return this.f7076j.b0();
    }

    @Override // T1.i
    public final boolean c() {
        return this.f7076j.c();
    }

    @Override // T1.i
    public final Number c0() {
        return this.f7076j.c0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            this.f7076j.close();
            int i = this.f7078l;
            i[] iVarArr = this.f7077k;
            if (i >= iVarArr.length) {
                return;
            }
            this.f7078l = i + 1;
            this.f7076j = iVarArr[i];
        }
    }

    @Override // T1.i
    public final Number d0() {
        return this.f7076j.d0();
    }

    @Override // T1.i
    public final Object e0() {
        return this.f7076j.e0();
    }

    @Override // T1.i
    public final T1.j f0() {
        return this.f7076j.f0();
    }

    @Override // T1.i
    public final W4.i g0() {
        return this.f7076j.g0();
    }

    @Override // T1.i
    public final short h0() {
        return this.f7076j.h0();
    }

    @Override // T1.i
    public final String i0() {
        return this.f7076j.i0();
    }

    @Override // T1.i
    public final char[] j0() {
        return this.f7076j.j0();
    }

    @Override // T1.i
    public final void k() {
        this.f7076j.k();
    }

    @Override // T1.i
    public final int k0() {
        return this.f7076j.k0();
    }

    @Override // T1.i
    public final int l0() {
        return this.f7076j.l0();
    }

    @Override // T1.i
    public final T1.f m0() {
        return this.f7076j.m0();
    }

    @Override // T1.i
    public final Object n0() {
        return this.f7076j.n0();
    }

    @Override // T1.i
    public final String o() {
        return this.f7076j.o();
    }

    @Override // T1.i
    public final int o0() {
        return this.f7076j.o0();
    }

    @Override // T1.i
    public final long p0() {
        return this.f7076j.p0();
    }

    @Override // T1.i
    public final String q0() {
        return this.f7076j.q0();
    }

    @Override // T1.i
    public final boolean r0() {
        return this.f7076j.r0();
    }

    @Override // T1.i
    public final k s() {
        return this.f7076j.s();
    }

    @Override // T1.i
    public final boolean s0(k kVar) {
        return this.f7076j.s0(kVar);
    }

    @Override // T1.i
    public final boolean t0() {
        return this.f7076j.t0();
    }

    @Override // T1.i
    public final int v() {
        return this.f7076j.v();
    }

    @Override // T1.i
    public final boolean v0() {
        return this.f7076j.v0();
    }

    @Override // T1.i
    public final boolean w0() {
        return this.f7076j.w0();
    }

    @Override // T1.i
    public final boolean x0() {
        return this.f7076j.x0();
    }

    @Override // T1.i
    public final boolean y0() {
        return this.f7076j.y0();
    }
}
