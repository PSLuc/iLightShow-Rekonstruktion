package p013c0;

import B.C0025m0;
import E4.l;
import E4.s;
import p091r0.k;
import p112v.C0972c0;
import p124x0.o0;
import p124x0.p0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7191h;
    public final /* synthetic */ s i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0025m0 c0025m0, d dVar, s sVar) {
        super(1);
        this.f7191h = 0;
        this.i = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    @Override // D4.c
    public final Object invoke(Object obj) {
        boolean z5;
        switch (this.f7191h) {
            case 0:
                if (!((d) obj).f5969t) {
                    return o0.i;
                }
                s sVar = this.i;
                sVar.f1070h = sVar.f1070h;
                return o0.f14050h;
            case 1:
                if (!((k) obj).f11501v) {
                    return o0.f14050h;
                }
                this.i.f1070h = false;
                return o0.f14051j;
            default:
                p0 p0Var = (p0) obj;
                s sVar2 = this.i;
                if (sVar2.f1070h) {
                    z5 = true;
                } else {
                    E4.k.d("null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode", p0Var);
                    if (((C0972c0) p0Var).f12966u) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                sVar2.f1070h = z5;
                return Boolean.valueOf(!z5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(s sVar, int i) {
        super(1);
        this.f7191h = i;
        this.i = sVar;
    }
}
