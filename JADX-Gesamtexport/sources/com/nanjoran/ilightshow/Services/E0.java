package com.nanjoran.ilightshow.Services;

import N.C0208d;
import N.C0217h0;
import N3.R0;
import O1.C0308a;
import O1.C0310c;
import O1.InterfaceC0311d;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.AbstractC0594t;
import com.google.android.gms.internal.play_billing.C0600w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class E0 implements InterfaceC0311d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final E0 f8249o = new E0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public O1.i f8250h;
    public Timer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0310c f8251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final X.v f8252k = new X.v();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0217h0 f8253l = C0208d.K(Boolean.FALSE, N.U.f3673m);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N.D f8254m = C0208d.C(new R0(5, this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D0 f8255n = new D0(this);

    public static boolean d() {
        EntitlementsConfig entitlements;
        BetaEntitlementConfig beta;
        AppConfigWrapper appConfigWrapperA = AbstractC0697x.a();
        AppConfig config = appConfigWrapperA != null ? appConfigWrapperA.getConfig() : null;
        if (config == null || (entitlements = config.getEntitlements()) == null || (beta = entitlements.getBeta()) == null || !beta.grantsFxPlus("android")) {
            if (!(config != null ? E4.k.a(config.getFreeBeta(), Boolean.TRUE) : false)) {
                return false;
            }
        }
        return true;
    }

    public final F0 a() {
        return (F0) this.f8254m.getValue();
    }

    public final void b(Purchase purchase) {
        JSONObject jSONObject = purchase.f7529c;
        if (jSONObject.optInt("purchaseState", 1) != 4) {
            if (!jSONObject.optBoolean("acknowledged", true)) {
                String strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                if (strOptString == null) {
                    throw new IllegalArgumentException("Purchase token must be set");
                }
                C0308a c0308a = new C0308a();
                c0308a.i = strOptString;
                C0310c c0310c = this.f8251j;
                if (c0310c != null) {
                    c0310c.a(c0308a, new J2.b(7, purchase));
                }
            }
            ArrayList arrayListA = purchase.a();
            int size = arrayListA.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA.get(i);
                i++;
                this.f8252k.put((String) obj, purchase);
            }
        }
    }

    @Override // O1.InterfaceC0311d
    public final void c(O1.g gVar) {
        E4.k.f("billingResult", gVar);
        if (gVar.f4493a != 0) {
            return;
        }
        O1.k kVar = new O1.k();
        kVar.f4510a = "starter_pack";
        kVar.f4511b = "inapp";
        O1.l lVarA = kVar.a();
        O1.k kVar2 = new O1.k();
        kVar2.f4510a = "pro_2020";
        kVar2.f4511b = "inapp";
        O1.l lVarA2 = kVar2.a();
        O1.k kVar3 = new O1.k();
        kVar3.f4510a = "starter_to_pro_2020";
        kVar3.f4511b = "inapp";
        O1.l lVarA3 = kVar3.a();
        O1.k kVar4 = new O1.k();
        kVar4.f4510a = "advanced_pack";
        kVar4.f4511b = "inapp";
        List<O1.l> listM = p089q4.m.M(lVarA, lVarA2, lVarA3, kVar4.a());
        O1.j jVar = new O1.j();
        if (listM.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        for (O1.l lVar : listM) {
            if (!"play_pass_subs".equals(lVar.f4513b)) {
                hashSet.add(lVar.f4513b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        AbstractC0594t abstractC0594tN = AbstractC0594t.n(listM);
        jVar.f4509a = abstractC0594tN;
        if (abstractC0594tN == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        O1.j jVar2 = new O1.j();
        jVar2.f4509a = jVar.f4509a;
        C0310c c0310c = this.f8251j;
        if (c0310c != null) {
            c0310c.c(jVar2, new D0(this));
        }
    }

    @Override // O1.InterfaceC0311d
    public final void e() {
    }

    public final void f() {
        C0310c c0310c = this.f8251j;
        if (c0310c != null) {
            if (c0310c.f4486y ? true : c0310c.o()) {
                D0 d1 = new D0(this);
                if (C0310c.f(new O1.p(c0310c, d1), 30000L, new O1.n(c0310c, 4, d1), c0310c.q(), c0310c.e()) == null) {
                    O1.g gVarT = c0310c.t();
                    c0310c.z(25, 9, gVarT);
                    com.google.android.gms.internal.play_billing.r rVar = AbstractC0594t.i;
                    d1.c(gVarT, C0600w.f8010l);
                    return;
                }
                return;
            }
        }
        if (c0310c != null) {
            c0310c.d(this);
        }
    }
}
