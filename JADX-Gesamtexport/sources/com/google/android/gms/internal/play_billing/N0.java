package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0573i0 f7889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0601w0 f7890b;

    public N0(C0601w0 c0601w0, AbstractC0573i0 abstractC0573i0) {
        C0601w0 c0601w1 = AbstractC0593s0.f7999a;
        this.f7890b = c0601w0;
        this.f7889a = abstractC0573i0;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void a(Object obj) {
        this.f7890b.getClass();
        V0 v6 = ((AbstractC0605y0) obj).zzc;
        if (v6.f7923e) {
            v6.f7923e = false;
        }
        C0601w0 c0601w0 = AbstractC0593s0.f7999a;
        throw p012c.k.p(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void b(Object obj, Object obj2) {
        T0.q(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void c(Object obj, byte[] bArr, int i, int i3, C0580l0 c0580l0) {
        AbstractC0605y0 abstractC0605y0 = (AbstractC0605y0) obj;
        if (abstractC0605y0.zzc == V0.f7918f) {
            abstractC0605y0.zzc = V0.b();
        }
        throw p012c.k.p(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final AbstractC0605y0 d() {
        AbstractC0573i0 abstractC0573i0 = this.f7889a;
        return abstractC0573i0 instanceof AbstractC0605y0 ? (AbstractC0605y0) ((AbstractC0605y0) abstractC0573i0).h(4) : ((AbstractC0603x0) ((AbstractC0605y0) abstractC0573i0).h(5)).b();
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final int e(AbstractC0605y0 abstractC0605y0) {
        V0 v6 = abstractC0605y0.zzc;
        int i = v6.f7922d;
        if (i != -1) {
            return i;
        }
        int iJ = 0;
        for (int i3 = 0; i3 < v6.f7919a; i3++) {
            int i6 = v6.f7920b[i3] >>> 3;
            AbstractC0586o0 abstractC0586o0 = (AbstractC0586o0) v6.f7921c[i3];
            int iH0 = C0590q0.h0(8);
            int iH1 = C0590q0.h0(i6) + C0590q0.h0(16);
            int iH2 = C0590q0.h0(24);
            int i7 = abstractC0586o0.i();
            iJ += iH0 + iH0 + iH1 + p012c.k.j(i7, i7, iH2);
        }
        v6.f7922d = iJ;
        return iJ;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void f(Object obj, H0 h1) {
        throw p012c.k.p(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final int g(AbstractC0605y0 abstractC0605y0) {
        return abstractC0605y0.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final boolean h(Object obj) {
        throw p012c.k.p(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final boolean i(AbstractC0605y0 abstractC0605y0, AbstractC0605y0 abstractC0605y1) {
        return abstractC0605y0.zzc.equals(abstractC0605y1.zzc);
    }
}
