package com.nanjoran.ilightshow.Services;

import P4.AbstractC0336x;
import c5.C0495p;
import com.android.billingclient.api.Purchase;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f8470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ K4.e[] f8471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final defpackage.t f8472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final defpackage.t f8473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f8474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C0495p f8475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static WeakReference f8476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static P4.i0 f8477h;

    static {
        E4.n nVar = new E4.n(r0.class, "alreadySeenReviewCard", "getAlreadySeenReviewCard()Z", 0);
        E4.x.f1075a.getClass();
        f8471b = new K4.e[]{nVar, new E4.n(r0.class, "buildNumberWithReviewTapped", "getBuildNumberWithReviewTapped()I", 0), new E4.n(r0.class, "totalShowMinutes", "getTotalShowMinutes()I", 0)};
        f8470a = new r0();
        f8472c = new defpackage.t("alreadySeenReviewCard", E4.x.a(Boolean.TYPE), Boolean.FALSE);
        Class cls = Integer.TYPE;
        new defpackage.t("buildNumberWithReviewTapped", E4.x.a(cls), 0);
        f8473d = new defpackage.t("totalShowMinutes", E4.x.a(cls), 0);
        b();
    }

    public static boolean a() {
        Purchase purchase;
        X.v vVar = E0.f8249o.f8252k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : vVar.i) {
            C0691q c0691q = F0.i;
            String str = (String) entry.getKey();
            c0691q.getClass();
            if (C0691q.b(str) == F0.MEMBERSHIP_V3) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                purchase = null;
                break;
            }
            purchase = (Purchase) ((Map.Entry) it.next()).getValue();
        } while (purchase == null);
        if (purchase != null) {
            return ((Number) f8473d.a(f8471b[2])).intValue() > 20 && purchase.f7529c.optLong("purchaseTime") < System.currentTimeMillis() - ((long) 86400000);
        }
        return false;
    }

    public static void b() {
        P4.i0 i0Var = f8477h;
        if (i0Var == null || !i0Var.b()) {
            f8477h = AbstractC0336x.o(AbstractC0336x.a(P4.D.f4604a), null, new q0(2, null), 3);
        }
    }
}
