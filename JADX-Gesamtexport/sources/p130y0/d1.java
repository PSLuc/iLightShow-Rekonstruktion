package p130y0;

import E4.k;
import N.AbstractC0234q;
import N.C0239t;
import P4.AbstractC0336x;
import R4.b;
import R4.i;
import V.a;
import X.o;
import android.view.View;
import android.view.ViewGroup;
import com.nanjoran.ilightshow.R;
import p089q4.l;
import p090r.v;
import p091r0.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f14384a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection] */
    public static final b1 a(AbstractC1119a abstractC1119a, AbstractC0234q abstractC0234q, a aVar) {
        r rVar;
        C0239t c0239t;
        b1 b1Var;
        if (AbstractC1140k0.f14404a.compareAndSet(false, true)) {
            b bVarA = i.a(1, 0, 6);
            AbstractC0336x.o(AbstractC0336x.a((p111u4.i) S.f14289t.getValue()), null, new C1138j0(bVarA, null), 3);
            v vVar = new v(16, bVarA);
            synchronized (o.f5709b) {
                o.f5715h = l.k0(o.f5715h, vVar);
            }
            o.a();
        }
        if (abstractC1119a.getChildCount() > 0) {
            View childAt = abstractC1119a.getChildAt(0);
            if (childAt instanceof r) {
                rVar = (r) childAt;
            }
            if (rVar == null) {
                rVar = new r(abstractC1119a.getContext(), abstractC0234q.h());
                abstractC1119a.addView(rVar.getView(), f14384a);
            }
            c0239t = new C0239t(abstractC0234q, new d(rVar.getRoot()));
            Object tag = rVar.getView().getTag(R.id.wrapped_composition_tag);
            b1Var = tag instanceof b1 ? (b1) tag : null;
            if (b1Var == null) {
                b1Var = new b1(rVar, c0239t);
                rVar.getView().setTag(R.id.wrapped_composition_tag, b1Var);
            }
            b1Var.d(aVar);
            if (!k.a(rVar.getCoroutineContext(), abstractC0234q.h())) {
                rVar.setCoroutineContext(abstractC0234q.h());
            }
            return b1Var;
        }
        abstractC1119a.removeAllViews();
        rVar = null;
        if (rVar == null) {
            rVar = new r(abstractC1119a.getContext(), abstractC0234q.h());
            abstractC1119a.addView(rVar.getView(), f14384a);
        }
        c0239t = new C0239t(abstractC0234q, new d(rVar.getRoot()));
        Object tag2 = rVar.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof b1) {
        }
        if (b1Var == null) {
            b1Var = new b1(rVar, c0239t);
            rVar.getView().setTag(R.id.wrapped_composition_tag, b1Var);
        }
        b1Var.d(aVar);
        if (!k.a(rVar.getCoroutineContext(), abstractC0234q.h())) {
            rVar.setCoroutineContext(abstractC0234q.h());
        }
        return b1Var;
    }
}
