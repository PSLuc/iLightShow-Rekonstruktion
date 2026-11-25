package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f7845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H1 f7846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I1 f7847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7848d;

    public final void a(Object obj) {
        this.f7848d = true;
        H1 h1 = this.f7846b;
        if (h1 != null) {
            G1 g6 = h1.f7857b;
            g6.getClass();
            if (obj == null) {
                obj = E1.f7839g;
            }
            if (E1.f7838f.N0(g6, null, obj)) {
                E1.b(g6);
                this.f7845a = null;
                this.f7846b = null;
                this.f7847c = null;
            }
        }
    }

    public final void finalize() {
        I1 i3;
        H1 h1 = this.f7846b;
        if (h1 != null) {
            G1 g6 = h1.f7857b;
            if (!g6.isDone()) {
                if (E1.f7838f.N0(g6, null, new G0(new C0597u0("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f7845a)), 1)))) {
                    E1.b(g6);
                }
            }
        }
        if (this.f7848d || (i3 = this.f7847c) == null) {
            return;
        }
        i3.g(null);
    }
}
