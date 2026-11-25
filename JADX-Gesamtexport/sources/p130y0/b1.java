package p130y0;

import N.C0239t;
import N.InterfaceC0232p;
import V.a;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;
import com.nanjoran.ilightshow.R;
import p090r.C0870i;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements InterfaceC0232p, InterfaceC0457q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f14355h;
    public final C0239t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0460u f14357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f14358l = AbstractC1120a0.f14345a;

    public b1(r rVar, C0239t c0239t) {
        this.f14355h = rVar;
        this.i = c0239t;
    }

    public final void a() {
        if (!this.f14356j) {
            this.f14356j = true;
            this.f14355h.getView().setTag(R.id.wrapped_composition_tag, null);
            C0460u c0460u = this.f14357k;
            if (c0460u != null) {
                c0460u.f(this);
            }
        }
        this.i.l();
    }

    @Override // androidx.lifecycle.InterfaceC0457q
    public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
        if (enumC0453m == EnumC0453m.ON_DESTROY) {
            a();
        } else {
            if (enumC0453m != EnumC0453m.ON_CREATE || this.f14356j) {
                return;
            }
            d(this.f14358l);
        }
    }

    public final void d(a aVar) {
        this.f14355h.setOnViewTreeOwnersAvailable(new C0870i(this, 22, aVar));
    }
}
