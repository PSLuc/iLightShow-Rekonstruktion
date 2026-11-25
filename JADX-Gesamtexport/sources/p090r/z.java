package p090r;

import D4.c;
import E4.l;
import kotlin.NoWhenBranchMatchedException;
import p096s.k0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11457h;
    public final /* synthetic */ G i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H f11458j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(G g6, H h6, int i) {
        super(1);
        this.f11457h = i;
        this.i = g6;
        this.f11458j = h6;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    @Override // D4.c
    public final Object invoke(Object obj) {
        I i;
        switch (this.f11457h) {
            case 0:
                k0 k0Var = (k0) obj;
                x xVar = x.f11448h;
                x xVar2 = x.i;
                if (k0Var.a(xVar, xVar2)) {
                    I i3 = this.i.f11375a.f11390a;
                    return i3 != null ? i3.f11379a : B.f11352b;
                }
                if (k0Var.a(xVar2, x.f11449j) && (i = this.f11458j.f11378a.f11390a) != null) {
                    return i.f11379a;
                }
                return B.f11352b;
            case 1:
                int iOrdinal = ((x) obj).ordinal();
                float f6 = 0.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        f6 = 1.0f;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (this.f11458j.f11378a.f11390a == null) {
                            f6 = 1.0f;
                        }
                    }
                } else if (this.i.f11375a.f11390a == null) {
                    f6 = 1.0f;
                }
                return Float.valueOf(f6);
            case 2:
                k0 k0Var2 = (k0) obj;
                x xVar3 = x.f11448h;
                x xVar4 = x.i;
                if (!k0Var2.a(xVar3, xVar4) && k0Var2.a(xVar4, x.f11449j)) {
                    Q q6 = this.f11458j.f11378a;
                    return B.f11352b;
                }
                return B.f11352b;
            default:
                int iOrdinal2 = ((x) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Q q7 = this.f11458j.f11378a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
