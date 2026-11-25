package e5;

import O1.B;

/* JADX INFO: loaded from: classes.dex */
public final class e extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8760c;

    public e(K3.e eVar, boolean z5) {
        super(eVar);
        this.f8760c = z5;
    }

    @Override // O1.B
    public final void c(byte b6) {
        if (this.f8760c) {
            i(String.valueOf(b6 & 255));
        } else {
            g(String.valueOf(b6 & 255));
        }
    }

    @Override // O1.B
    public final void e(int i) {
        boolean z5 = this.f8760c;
        String unsignedString = Integer.toUnsignedString(i);
        if (z5) {
            i(unsignedString);
        } else {
            g(unsignedString);
        }
    }

    @Override // O1.B
    public final void f(long j4) {
        boolean z5 = this.f8760c;
        String unsignedString = Long.toUnsignedString(j4);
        if (z5) {
            i(unsignedString);
        } else {
            g(unsignedString);
        }
    }

    @Override // O1.B
    public final void h(short s6) {
        if (this.f8760c) {
            i(String.valueOf(s6 & 65535));
        } else {
            g(String.valueOf(s6 & 65535));
        }
    }
}
