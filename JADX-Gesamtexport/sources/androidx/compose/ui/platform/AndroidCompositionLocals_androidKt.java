package androidx.compose.ui.platform;

import B1.b;
import C0.d;
import D4.c;
import E4.k;
import J1.e;
import J1.f;
import N.AbstractC0231o0;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0233p0;
import N.C0235q0;
import N.C0247x;
import N.InterfaceC0203a0;
import N.U;
import N.W0;
import V.a;
import W.i;
import W.j;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.F;
import com.nanjoran.ilightshow.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p084p4.x;
import p090r.C0870i;
import p090r.v;
import p130y0.AbstractC1124c0;
import p130y0.C1128e0;
import p130y0.C1130f0;
import p130y0.C1139k;
import p130y0.C1141l;
import p130y0.I;
import p130y0.J;
import p130y0.K;
import p130y0.T;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0247x f6729a = new C0247x(I.i);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W0 f6730b = new W0(I.f14227j);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W0 f6731c = new W0(I.f14228k);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W0 f6732d = new W0(I.f14229l);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W0 f6733e = new W0(I.f14230m);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W0 f6734f = new W0(I.f14231n);

    public static final void a(r rVar, a aVar, C0230o c0230o, int i) {
        InterfaceC0203a0 interfaceC0203a0;
        LinkedHashMap linkedHashMap;
        boolean z5;
        int i3 = 4;
        c0230o.X(1396852028);
        if ((((c0230o.h(rVar) ? 4 : 2) | i | (c0230o.h(aVar) ? 32 : 16)) & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            Context context = rVar.getContext();
            Object objK = c0230o.K();
            Object obj = C0222k.f3714a;
            if (objK == obj) {
                objK = C0208d.K(new Configuration(context.getResources().getConfiguration()), U.f3673m);
                c0230o.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a1 = (InterfaceC0203a0) objK;
            Object objK2 = c0230o.K();
            if (objK2 == obj) {
                objK2 = new B.r(i3, interfaceC0203a1);
                c0230o.f0(objK2);
            }
            rVar.setConfigurationChangeObserver((c) objK2);
            Object objK3 = c0230o.K();
            if (objK3 == obj) {
                objK3 = new T(context);
                c0230o.f0(objK3);
            }
            T t6 = (T) objK3;
            C1139k viewTreeOwners = rVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objK4 = c0230o.K();
            f fVar = viewTreeOwners.f14403b;
            if (objK4 == obj) {
                Object parent = rVar.getParent();
                k.d("null cannot be cast to non-null type android.view.View", parent);
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = i.class.getSimpleName() + ':' + strValueOf;
                e eVarB = fVar.b();
                Bundle bundleB = eVarB.b(str);
                if (bundleB != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleB.keySet()) {
                        ArrayList parcelableArrayList = bundleB.getParcelableArrayList(str2);
                        k.d("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }", parcelableArrayList);
                        linkedHashMap.put(str2, parcelableArrayList);
                        interfaceC0203a1 = interfaceC0203a1;
                    }
                } else {
                    linkedHashMap = null;
                }
                interfaceC0203a0 = interfaceC0203a1;
                C1141l c1141l = C1141l.f14408l;
                W0 w6 = W.k.f5537a;
                j jVar = new j(linkedHashMap, c1141l);
                try {
                    eVarB.d(str, new F(2, jVar));
                    z5 = true;
                } catch (IllegalArgumentException unused) {
                    z5 = false;
                }
                Object c1128e0 = new C1128e0(jVar, new C1130f0(z5, eVarB, str));
                c0230o.f0(c1128e0);
                objK4 = c1128e0;
            } else {
                interfaceC0203a0 = interfaceC0203a1;
            }
            Object obj2 = (C1128e0) objK4;
            x xVar = x.f10867a;
            boolean zH = c0230o.h(obj2);
            Object objK5 = c0230o.K();
            if (zH || objK5 == obj) {
                objK5 = new v(15, obj2);
                c0230o.f0(objK5);
            }
            C0208d.c(xVar, (c) objK5, c0230o);
            Configuration configuration = (Configuration) interfaceC0203a0.getValue();
            Object objK6 = c0230o.K();
            if (objK6 == obj) {
                objK6 = new C0.c();
                c0230o.f0(objK6);
            }
            C0.c cVar = (C0.c) objK6;
            Object objK7 = c0230o.K();
            Object obj3 = objK7;
            if (objK7 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0230o.f0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objK8 = c0230o.K();
            if (objK8 == obj) {
                objK8 = new J(configuration3, cVar);
                c0230o.f0(objK8);
            }
            J j4 = (J) objK8;
            boolean zH2 = c0230o.h(context);
            Object objK9 = c0230o.K();
            if (zH2 || objK9 == obj) {
                objK9 = new C0870i(context, 16, j4);
                c0230o.f0(objK9);
            }
            C0208d.c(cVar, (c) objK9, c0230o);
            Object objK10 = c0230o.K();
            if (objK10 == obj) {
                objK10 = new d();
                c0230o.f0(objK10);
            }
            d dVar = (d) objK10;
            Object objK11 = c0230o.K();
            if (objK11 == obj) {
                objK11 = new K(dVar);
                c0230o.f0(objK11);
            }
            K k3 = (K) objK11;
            boolean zH3 = c0230o.h(context);
            Object objK12 = c0230o.K();
            if (zH3 || objK12 == obj) {
                objK12 = new C0870i(context, 17, k3);
                c0230o.f0(objK12);
            }
            C0208d.c(dVar, (c) objK12, c0230o);
            AbstractC0231o0 abstractC0231o0 = AbstractC1124c0.f14380t;
            C0208d.b(new C0233p0[]{f6729a.a((Configuration) interfaceC0203a0.getValue()), f6730b.a(context), b.f488a.a(viewTreeOwners.f14402a), f6733e.a(fVar), W.k.f5537a.a(obj2), f6734f.a(rVar.getView()), f6731c.a(cVar), f6732d.a(dVar), abstractC0231o0.a(Boolean.valueOf(((Boolean) c0230o.k(abstractC0231o0)).booleanValue() | rVar.getScrollCaptureInProgress$ui_release()))}, V.b.c(1471621628, new B.U(rVar, t6, aVar, 4), c0230o), c0230o, 56);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new A2.d(i, 18, rVar, aVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0231o0 getLocalLifecycleOwner() {
        return b.f488a;
    }
}
