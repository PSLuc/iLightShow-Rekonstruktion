package p090r;

import D4.c;
import E4.k;
import E4.l;
import S0.h;
import S0.j;
import Z.g;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class D extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11359h;
    public final /* synthetic */ F i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f11360j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(F f6, long j4, int i) {
        super(1);
        this.f11359h = i;
        this.i = f6;
        this.f11360j = j4;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Type inference failed for: r8v14, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r8v20, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r8v32, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r8v35, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r8v4, types: [D4.c, E4.l] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        long jB;
        int iOrdinal;
        switch (this.f11359h) {
            case 0:
                F f6 = this.i;
                int iOrdinal2 = ((x) obj).ordinal();
                long j4 = this.f11360j;
                if (iOrdinal2 == 0) {
                    t tVar = f6.f11372y.f11375a.f11392c;
                    if (tVar != null) {
                        j4 = ((j) tVar.f11434b.invoke(new j(j4))).f4896a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t tVar2 = f6.f11373z.f11378a.f11392c;
                    if (tVar2 != null) {
                        j4 = ((j) tVar2.f11434b.invoke(new j(j4))).f4896a;
                    }
                }
                return new j(j4);
            case 1:
                x xVar = (x) obj;
                F f7 = this.i;
                if (f7.f11365D == null || f7.y0() == null || k.a(f7.f11365D, f7.y0()) || (iOrdinal = xVar.ordinal()) == 0 || iOrdinal == 1) {
                    jB = 0;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t tVar3 = f7.f11373z.f11378a.f11392c;
                    if (tVar3 != null) {
                        long j6 = this.f11360j;
                        long j7 = ((j) tVar3.f11434b.invoke(new j(j6))).f4896a;
                        Z.c cVarY0 = f7.y0();
                        k.c(cVarY0);
                        S0.k kVar = S0.k.f4897h;
                        long jA = ((g) cVarY0).a(j6, j7, kVar);
                        Z.c cVar = f7.f11365D;
                        k.c(cVar);
                        jB = h.b(jA, cVar.a(j6, j7, kVar));
                    } else {
                        jB = 0;
                    }
                }
                return new h(jB);
            default:
                x xVar2 = (x) obj;
                F f8 = this.i;
                O o6 = f8.f11372y.f11375a.f11391b;
                long j8 = this.f11360j;
                long j9 = 0;
                long j10 = o6 != null ? ((h) o6.f11387a.invoke(new j(j8))).f4890a : 0L;
                O o7 = f8.f11373z.f11378a.f11391b;
                long j11 = o7 != null ? ((h) o7.f11387a.invoke(new j(j8))).f4890a : 0L;
                int iOrdinal3 = xVar2.ordinal();
                if (iOrdinal3 == 0) {
                    j9 = j10;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j9 = j11;
                }
                return new h(j9);
        }
    }
}
