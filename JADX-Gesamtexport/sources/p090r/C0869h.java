package p090r;

import D4.c;
import E4.l;
import S0.k;
import Z.g;
import p015c2.AbstractC0473d;
import p084p4.x;
import p113v0.M;
import p113v0.N;

/* JADX INFO: renamed from: r.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0869h extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0873l f11404h;
    public final /* synthetic */ N i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f11405j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0869h(C0873l c0873l, N n6, long j4) {
        super(1);
        this.f11404h = c0873l;
        this.i = n6;
        this.f11405j = j4;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        g gVar = this.f11404h.f11413b;
        N n6 = this.i;
        M.e((M) obj, n6, gVar.a(AbstractC0473d.b(n6.f13137h, n6.i), this.f11405j, k.f4897h));
        return x.f10867a;
    }
}
