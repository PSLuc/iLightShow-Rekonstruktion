package p130y0;

import B.C0025m0;
import E4.s;
import Z.n;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import p013c0.a;
import p013c0.c;
import p013c0.d;
import p080p.C0829a;
import p080p.C0834f;
import p124x0.AbstractC1098f;
import p124x0.Q;
import p124x0.o0;

/* JADX INFO: renamed from: y0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC1132g0 implements View.OnDragListener, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14390a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0834f f14391b = new C0834f(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f14392c = new Q() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.f6735a.f14390a.hashCode();
        }

        @Override // p124x0.Q
        public final n l() {
            return this.f6735a.f14390a;
        }

        @Override // p124x0.Q
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    };

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C0025m0 c0025m0 = new C0025m0(22, dragEvent);
        int action = dragEvent.getAction();
        d dVar = this.f14390a;
        o0 o0Var = o0.f14050h;
        switch (action) {
            case 1:
                s sVar = new s();
                c cVar = new c(c0025m0, dVar, sVar);
                if (cVar.invoke(dVar) == o0Var) {
                    AbstractC1098f.x(dVar, cVar);
                }
                boolean z5 = sVar.f1070h;
                C0834f c0834f = this.f14391b;
                c0834f.getClass();
                C0829a c0829a = new C0829a(c0834f);
                while (c0829a.hasNext()) {
                    ((d) c0829a.next()).C0(c0025m0);
                }
                return z5;
            case 2:
                dVar.B0(c0025m0);
                return false;
            case 3:
                return dVar.y0(c0025m0);
            case 4:
                L4.n nVar = new L4.n(1, c0025m0);
                if (nVar.invoke(dVar) == o0Var) {
                    AbstractC1098f.x(dVar, nVar);
                    return false;
                }
                return false;
            case 5:
                dVar.z0(c0025m0);
                return false;
            case 6:
                dVar.A0(c0025m0);
                return false;
            default:
                return false;
        }
    }
}
