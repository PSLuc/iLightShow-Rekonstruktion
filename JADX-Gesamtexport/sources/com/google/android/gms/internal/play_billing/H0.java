package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class H0 implements K0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0601w0 f7854b = new C0601w0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7855a;

    public H0(K0... k0Arr) {
        this.f7855a = k0Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    public R0 a(Class cls) {
        for (int i = 0; i < 2; i++) {
            K0 k3 = ((K0[]) this.f7855a)[i];
            if (k3.b(cls)) {
                return k3.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    public boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((K0[]) this.f7855a)[i].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i, Object obj, S0 s1) throws zzel {
        AbstractC0573i0 abstractC0573i0 = (AbstractC0573i0) obj;
        C0590q0 c0590q0 = (C0590q0) this.f7855a;
        c0590q0.b0(i, 2);
        c0590q0.d0(abstractC0573i0.c(s1));
        s1.f(abstractC0573i0, this);
    }

    public H0() {
        int i = AbstractC0578k0.f7955a;
        H0 h1 = new H0(C0601w0.f8013b, f7854b);
        Charset charset = D0.f7817a;
        this.f7855a = h1;
    }

    public H0(C0590q0 c0590q0) {
        Charset charset = D0.f7817a;
        this.f7855a = c0590q0;
        c0590q0.f7985d = this;
    }
}
