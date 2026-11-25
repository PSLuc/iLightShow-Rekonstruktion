package A;

import S0.k;
import p020d2.n;
import p030f0.f;
import p035g0.C;
import p035g0.D;
import p035g0.E;
import p035g0.M;

/* JADX INFO: loaded from: classes.dex */
public final class d implements M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f3h;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f4j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f5k;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f3h = aVar;
        this.i = aVar2;
        this.f4j = aVar3;
        this.f5k = aVar4;
    }

    public static d b(d dVar, b bVar, b bVar2, b bVar3, int i) {
        a aVar = bVar;
        if ((i & 1) != 0) {
            aVar = dVar.f3h;
        }
        a aVar2 = dVar.i;
        a aVar3 = bVar2;
        if ((i & 4) != 0) {
            aVar3 = dVar.f4j;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, bVar3);
    }

    @Override // p035g0.M
    public final E a(long j4, k kVar, S0.b bVar) {
        float fA = this.f3h.a(j4, bVar);
        float fA2 = this.i.a(j4, bVar);
        float fA3 = this.f4j.a(j4, bVar);
        float fA4 = this.f5k.a(j4, bVar);
        float fC = f.c(j4);
        float f6 = fA + fA4;
        if (f6 > fC) {
            float f7 = fC / f6;
            fA *= f7;
            fA4 *= f7;
        }
        float f8 = fA2 + fA3;
        if (f8 > fC) {
            float f9 = fC / f8;
            fA2 *= f9;
            fA3 *= f9;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new C(G4.a.e(0L, j4));
        }
        p030f0.d dVarE = G4.a.e(0L, j4);
        k kVar2 = k.f4897h;
        float f10 = kVar == kVar2 ? fA : fA2;
        long jA = n.a(f10, f10);
        if (kVar == kVar2) {
            fA = fA2;
        }
        long jA2 = n.a(fA, fA);
        float f11 = kVar == kVar2 ? fA3 : fA4;
        long jA3 = n.a(f11, f11);
        if (kVar != kVar2) {
            fA4 = fA3;
        }
        return new D(new p030f0.e(dVarE.f8839a, dVarE.f8840b, dVarE.f8841c, dVarE.f8842d, jA, jA2, jA3, n.a(fA4, fA4)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!E4.k.a(this.f3h, dVar.f3h)) {
            return false;
        }
        if (!E4.k.a(this.i, dVar.i)) {
            return false;
        }
        if (E4.k.a(this.f4j, dVar.f4j)) {
            return E4.k.a(this.f5k, dVar.f5k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5k.hashCode() + ((this.f4j.hashCode() + ((this.i.hashCode() + (this.f3h.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f3h + ", topEnd = " + this.i + ", bottomEnd = " + this.f4j + ", bottomStart = " + this.f5k + ')';
    }
}
