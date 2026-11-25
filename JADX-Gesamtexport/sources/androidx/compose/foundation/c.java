package androidx.compose.foundation;

import Z.l;
import Z.n;
import Z.o;
import p101t.G;
import p117w.m;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    static {
        new Q() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // p124x0.Q
            public final n l() {
                return new G();
            }

            @Override // p124x0.Q
            public final /* bridge */ /* synthetic */ void m(n nVar) {
            }
        };
    }

    public static final o a(o oVar, boolean z5, m mVar) {
        return oVar.k(z5 ? new FocusableElement(mVar) : l.f5957a);
    }
}
