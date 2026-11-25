package com.nanjoran.ilightshow.Services;

import B.C0025m0;
import com.android.billingclient.api.Purchase;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f8247a;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.List] */
    public void a(O1.g gVar, C0025m0 c0025m0) {
        E0 e6 = this.f8247a;
        E4.k.f("this$0", e6);
        E4.k.f("billingResult1", gVar);
        if (gVar.f4493a == 0) {
            for (O1.i iVar : (AbstractCollection) c0025m0.i) {
                boolean zA = E4.k.a(iVar.f4503c, "starter_pack");
                E0 e7 = E0.f8249o;
                if (zA) {
                    e7.getClass();
                } else {
                    String str = iVar.f4503c;
                    if (E4.k.a(str, "pro_2020")) {
                        e7.getClass();
                    } else if (E4.k.a(str, "starter_to_pro_2020")) {
                        e7.getClass();
                    } else if (E4.k.a(str, "advanced_pack")) {
                        e7.f8250h = iVar;
                    }
                }
            }
            e6.f();
        }
    }

    public void b(O1.g gVar, List list) {
        E0 e6 = this.f8247a;
        E4.k.f("this$0", e6);
        E4.k.f("billingResult", gVar);
        if (gVar.f4493a != 0 || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            E4.k.c(purchase);
            e6.b(purchase);
        }
    }

    public void c(O1.g gVar, List list) {
        E0 e6 = this.f8247a;
        E4.k.f("this$0", e6);
        E4.k.f("billingResult", gVar);
        E4.k.f("purchases", list);
        if (gVar.f4493a == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                E4.k.c(purchase);
                e6.b(purchase);
            }
        }
    }
}
