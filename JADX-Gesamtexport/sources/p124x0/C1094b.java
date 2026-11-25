package p124x0;

import D4.a;
import E4.k;
import E4.l;
import Z.m;
import p084p4.x;
import p118w0.c;

/* JADX INFO: renamed from: x0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1094b extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13998h;
    public final /* synthetic */ C1095c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1094b(C1095c c1095c, int i) {
        super(0);
        this.f13998h = i;
        this.i = c1095c;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f13998h) {
            case 0:
                this.i.A0();
                break;
            default:
                C1095c c1095c = this.i;
                m mVar = c1095c.f14000u;
                k.d("null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer", mVar);
                ((c) mVar).g(c1095c);
                break;
        }
        return x.f10867a;
    }
}
