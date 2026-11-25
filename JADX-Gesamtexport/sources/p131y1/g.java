package p131y1;

import android.text.InputFilter;
import p057l.A;
import p119w1.h;

/* JADX INFO: loaded from: classes.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f14587a;

    public g(A a6) {
        this.f14587a = new e(a6);
    }

    @Override // p131y1.f
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !h.c() ? inputFilterArr : this.f14587a.a(inputFilterArr);
    }

    @Override // p131y1.f
    public final void d(boolean z5) {
        if (h.c()) {
            this.f14587a.d(z5);
        }
    }

    @Override // p131y1.f
    public final void e(boolean z5) {
        boolean zC = h.c();
        e eVar = this.f14587a;
        if (zC) {
            eVar.e(z5);
        } else {
            eVar.f14586c = z5;
        }
    }
}
