package p130y0;

import D4.e;
import E4.l;
import F4.f;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.E0;
import N.G0;
import N.U;
import V.a;
import Y.b;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.nanjoran.ilightshow.R;
import java.util.Set;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends l implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14346h;
    public final /* synthetic */ b1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f14347j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(b1 b1Var, a aVar, int i) {
        super(2);
        this.f14346h = i;
        this.i = b1Var;
        this.f14347j = aVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) throws Throwable {
        switch (this.f14346h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    AndroidCompositionLocals_androidKt.a(this.i.f14355h, this.f14347j, c0230o, 0);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    b1 b1Var = this.i;
                    Object tag = b1Var.f14355h.getTag(R.id.inspection_slot_table_set);
                    Set set = (tag instanceof Set) && (!(tag instanceof F4.a) || (tag instanceof f)) ? (Set) tag : null;
                    r rVar = b1Var.f14355h;
                    if (set == null) {
                        Object parent = rVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof F4.a) && !(tag2 instanceof f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c0230o2.f3747c);
                        c0230o2.f3759p = true;
                        c0230o2.f3734B = true;
                        c0230o2.f3747c.g();
                        c0230o2.G.g();
                        G0 g6 = c0230o2.H;
                        E0 e6 = g6.f3589a;
                        g6.f3593e = e6.f3585p;
                        g6.f3594f = e6.f3586q;
                    }
                    boolean zH = c0230o2.h(b1Var);
                    Object objK = c0230o2.K();
                    U u6 = C0222k.f3714a;
                    if (zH || objK == u6) {
                        objK = new Y0(b1Var, null);
                        c0230o2.f0(objK);
                    }
                    C0208d.e((e) objK, c0230o2, rVar);
                    boolean zH2 = c0230o2.h(b1Var);
                    Object objK2 = c0230o2.K();
                    if (zH2 || objK2 == u6) {
                        objK2 = new Z0(b1Var, null);
                        c0230o2.f0(objK2);
                    }
                    C0208d.e((e) objK2, c0230o2, rVar);
                    C0208d.a(b.f5788a.a(set), V.b.c(-1193460702, new a1(b1Var, this.f14347j, 0), c0230o2), c0230o2, 56);
                }
                break;
        }
        return x.f10867a;
    }
}
