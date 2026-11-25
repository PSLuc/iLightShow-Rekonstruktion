package androidx.compose.foundation;

import D4.f;
import E4.l;
import N.C0222k;
import N.C0230o;
import Z.o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p101t.AbstractC0956y;
import p101t.C0946n;
import p101t.j0;
import p101t.k0;
import p101t.l0;
import p101t.m0;
import p101t.s0;
import p112v.W;
import p117w.m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0 f6590h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s0 s0Var) {
        super(3);
        this.f6590h = s0Var;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        m0 m0Var;
        C0230o c0230o = (C0230o) obj2;
        ((Number) obj3).intValue();
        c0230o.V(1478351300);
        s0 s0Var = this.f6590h;
        ScrollSemanticsElement scrollSemanticsElement = new ScrollSemanticsElement(s0Var);
        W w6 = W.f12920h;
        m mVar = s0Var.f12419c;
        Context context = (Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b);
        k0 k0Var = (k0) c0230o.k(l0.f12374a);
        if (k0Var != null) {
            c0230o.V(1586021609);
            boolean zF = c0230o.f(context) | c0230o.f(k0Var);
            Object objK = c0230o.K();
            if (zF || objK == C0222k.f3714a) {
                objK = new C0946n(context, k0Var);
                c0230o.f0(objK);
            }
            m0Var = (C0946n) objK;
            c0230o.p(false);
        } else {
            c0230o.V(1586120933);
            c0230o.p(false);
            m0Var = j0.f12361j;
        }
        o oVarK = scrollSemanticsElement.k(AbstractC0956y.f12442b).k(m0Var.c());
        o oVarK2 = androidx.compose.foundation.gestures.a.b(oVarK, s0Var, w6, m0Var, true, true, mVar).k(new ScrollingLayoutElement(s0Var));
        c0230o.p(false);
        return oVarK2;
    }
}
