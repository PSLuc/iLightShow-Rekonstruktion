package K;

import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p101t.X;
import p101t.Y;

/* JADX INFO: loaded from: classes.dex */
public final class e implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0203a0 f1971c;

    public e(boolean z5, float f6, InterfaceC0203a0 interfaceC0203a0) {
        this.f1969a = z5;
        this.f1970b = f6;
        this.f1971c = interfaceC0203a0;
    }

    @Override // p101t.X
    public final Y a(p117w.m mVar, C0230o c0230o) {
        C1.b bVar;
        c0230o.W(988743187);
        t tVar = (t) c0230o.k(v.f2020a);
        c0230o.W(-1524341038);
        InterfaceC0203a0 interfaceC0203a0 = this.f1971c;
        long jB = ((p035g0.r) interfaceC0203a0.getValue()).f9087a != p035g0.r.f9085l ? ((p035g0.r) interfaceC0203a0.getValue()).f9087a : tVar.b(c0230o);
        c0230o.p(false);
        InterfaceC0203a0 interfaceC0203a0N = C0208d.N(new p035g0.r(jB), c0230o);
        InterfaceC0203a0 interfaceC0203a0N2 = C0208d.N(tVar.a(c0230o), c0230o);
        c0230o.W(331259447);
        c0230o.W(-1737891121);
        Object objK = c0230o.k(AndroidCompositionLocals_androidKt.f6734f);
        while (!(objK instanceof ViewGroup)) {
            Object parent = ((View) objK).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objK + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            objK = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objK;
        c0230o.p(false);
        c0230o.W(1643267293);
        boolean zIsInEditMode = viewGroup.isInEditMode();
        Object obj = C0222k.f3714a;
        boolean z5 = this.f1969a;
        float f6 = this.f1970b;
        if (zIsInEditMode) {
            c0230o.W(511388516);
            boolean zF = c0230o.f(this) | c0230o.f(mVar);
            Object objK2 = c0230o.K();
            if (zF || objK2 == obj) {
                objK2 = new c(z5, f6, interfaceC0203a0N, interfaceC0203a0N2);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            bVar = (c) objK2;
            c0230o.p(false);
            c0230o.p(false);
        } else {
            c0230o.p(false);
            c0230o.W(1618982084);
            boolean zF2 = c0230o.f(this) | c0230o.f(mVar) | c0230o.f(viewGroup);
            Object objK3 = c0230o.K();
            if (zF2 || objK3 == obj) {
                Object c0120a = new C0120a(z5, f6, interfaceC0203a0N, interfaceC0203a0N2, viewGroup);
                c0230o.f0(c0120a);
                objK3 = c0120a;
            }
            c0230o.p(false);
            bVar = (C0120a) objK3;
            c0230o.p(false);
        }
        C0208d.f(bVar, mVar, new f(mVar, bVar, null), c0230o);
        c0230o.p(false);
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1969a == eVar.f1969a && S0.e.a(this.f1970b, eVar.f1970b) && this.f1971c.equals(eVar.f1971c);
    }

    public final int hashCode() {
        return this.f1971c.hashCode() + p012c.k.i(this.f1970b, Boolean.hashCode(this.f1969a) * 31, 31);
    }
}
