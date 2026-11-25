package B2;

import B.C0025m0;
import B.D;
import F.C0068j;
import O1.A;
import O1.C0308a;
import O1.C0310c;
import O1.y;
import S1.V;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import android.util.Log;
import com.github.kittinunf.fuel.core.FuelError;
import com.google.android.gms.internal.play_billing.AbstractC0594t;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.C0548a;
import com.google.android.gms.internal.play_billing.C0600w;
import com.google.android.gms.internal.play_billing.C0601w0;
import com.google.android.gms.internal.play_billing.InterfaceC0554c;
import com.nanjoran.ilightshow.Services.D0;
import com.spotify.sdk.android.auth.LoginActivity;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p126x2.w;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Callable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f519h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f521k;

    public /* synthetic */ m(C0310c c0310c, Object obj, Object obj2, int i) {
        this.f519h = i;
        this.i = c0310c;
        this.f520j = obj;
        this.f521k = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Object objV;
        Bundle bundleC;
        InterfaceC0554c interfaceC0554c;
        InterfaceC0554c interfaceC0554c2;
        C0068j c0068j;
        InterfaceC0554c interfaceC0554c3;
        int i;
        AbstractC0594t abstractC0594t;
        int i3 = 0;
        Exception exc = null;
        int i6 = 107;
        int i7 = 1;
        switch (this.f519h) {
            case 0:
                p120w2.a.f13456b.getClass();
                try {
                    objV = (z) ((Callable) this.i).call();
                    break;
                } catch (Throwable th) {
                    objV = V.v(th);
                }
                if (!(objV instanceof p084p4.j)) {
                    try {
                        objV = (z) objV;
                        D d6 = (D) this.f520j;
                        E4.k.e("it", objV);
                        d6.invoke(objV);
                    } catch (Throwable th2) {
                        objV = V.v(th2);
                    }
                    break;
                }
                Throwable thA = p084p4.k.a(objV);
                if (thA != null) {
                    int i8 = FuelError.i;
                    FuelError fuelErrorB = p126x2.g.b(thA);
                    A2.d dVar = (A2.d) this.f521k;
                    z zVar = fuelErrorB.f7771h;
                    dVar.d(fuelErrorB, zVar);
                    objV = zVar;
                }
                return (z) objV;
            case 1:
                C0310c c0310c = (C0310c) this.i;
                String str = (String) this.f520j;
                String str2 = (String) this.f521k;
                c0310c.getClass();
                try {
                    synchronized (c0310c.f4463a) {
                        interfaceC0554c = c0310c.i;
                        break;
                    }
                    if (interfaceC0554c == null) {
                        return AbstractC0602x.c(A.f4429j, 107);
                    }
                    return ((C0548a) interfaceC0554c).e(c0310c.f4469g.getPackageName(), str, str2);
                } catch (DeadObjectException e6) {
                    O1.g gVar = A.f4429j;
                    String strA = y.a(e6);
                    bundleC = AbstractC0602x.c(gVar, 5);
                    if (strA != null) {
                        bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                    }
                    return bundleC;
                } catch (Exception e7) {
                    O1.g gVar2 = A.f4428h;
                    String strA2 = y.a(e7);
                    bundleC = AbstractC0602x.c(gVar2, 5);
                    if (strA2 != null) {
                        bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                    }
                    return bundleC;
                }
            case 2:
                C0310c c0310c2 = (C0310c) this.i;
                J2.b bVar = (J2.b) this.f520j;
                C0308a c0308a = (C0308a) this.f521k;
                c0310c2.getClass();
                try {
                    if (!c0310c2.n()) {
                        O1.g gVar3 = A.f4429j;
                        c0310c2.z(2, 3, gVar3);
                        bVar.d(gVar3);
                    } else if (TextUtils.isEmpty(c0308a.i)) {
                        int i9 = AbstractC0602x.f8015a;
                        Log.isLoggable("BillingClient", 5);
                        O1.g gVar4 = A.f4427g;
                        c0310c2.z(26, 3, gVar4);
                        bVar.d(gVar4);
                    } else if (c0310c2.f4475n) {
                        synchronized (c0310c2.f4463a) {
                            interfaceC0554c2 = c0310c2.i;
                            break;
                        }
                        if (interfaceC0554c2 == null) {
                            c0310c2.g(bVar, A.f4429j, 107, null);
                        } else {
                            String packageName = c0310c2.f4469g.getPackageName();
                            String str3 = c0308a.i;
                            String str4 = c0310c2.f4465c;
                            String str5 = c0310c2.f4466d;
                            long jLongValue = c0310c2.f4461C.longValue();
                            int i10 = AbstractC0602x.f8015a;
                            Bundle bundle = new Bundle();
                            AbstractC0602x.b(bundle, str4, str5, jLongValue);
                            Bundle bundleD = ((C0548a) interfaceC0554c2).d(packageName, str3, bundle);
                            bVar.d(A.a(AbstractC0602x.a("BillingClient", bundleD), AbstractC0602x.f("BillingClient", bundleD)));
                        }
                    } else {
                        O1.g gVar5 = A.f4421a;
                        c0310c2.z(27, 3, gVar5);
                        bVar.d(gVar5);
                    }
                } catch (DeadObjectException e8) {
                    c0310c2.g(bVar, A.f4429j, 28, e8);
                } catch (Exception e9) {
                    c0310c2.g(bVar, A.f4428h, 28, e9);
                }
                return null;
            default:
                C0310c c0310c3 = (C0310c) this.i;
                D0 d1 = (D0) this.f520j;
                O1.j jVar = (O1.j) this.f521k;
                if (!c0310c3.n()) {
                    O1.g gVar6 = A.f4429j;
                    c0310c3.z(2, 7, gVar6);
                    com.google.android.gms.internal.play_billing.r rVar = AbstractC0594t.i;
                    d1.a(gVar6, new C0025m0(C0600w.f8010l));
                } else {
                    if (c0310c3.f4479r) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        String str6 = ((O1.l) jVar.f4509a.get(0)).f4513b;
                        AbstractC0594t abstractC0594t2 = jVar.f4509a;
                        int size = abstractC0594t2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            int i12 = i11 + 20;
                            ArrayList arrayList3 = new ArrayList(abstractC0594t2.subList(i11, i12 > size ? size : i12));
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            int size2 = arrayList3.size();
                            for (int i13 = i3; i13 < size2; i13 += i7) {
                                arrayList4.add(((O1.l) arrayList3.get(i13)).f4512a);
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList4);
                            String str7 = c0310c3.f4465c;
                            bundle2.putString("playBillingLibraryVersion", str7);
                            try {
                                synchronized (c0310c3.f4463a) {
                                    interfaceC0554c3 = c0310c3.i;
                                    break;
                                }
                                if (interfaceC0554c3 == null) {
                                    c0068j = c0310c3.r(A.f4429j, i6, exc);
                                } else {
                                    if (c0310c3.f4480s) {
                                        c0310c3.f4485x.getClass();
                                    }
                                    c0310c3.v();
                                    c0310c3.v();
                                    c0310c3.v();
                                    c0310c3.v();
                                    int i14 = i7;
                                    int i15 = i12;
                                    Bundle bundleI = ((C0548a) interfaceC0554c3).i(i7 != c0310c3.f4481t ? 17 : 20, c0310c3.f4469g.getPackageName(), str6, bundle2, AbstractC0602x.d(str7, c0310c3.f4466d, arrayList3, new C0601w0(i7), c0310c3.f4461C.longValue()));
                                    if (bundleI == null) {
                                        c0068j = c0310c3.r(A.f4435p, 44, null);
                                    } else if (bundleI.containsKey("DETAILS_LIST")) {
                                        ArrayList<String> stringArrayList = bundleI.getStringArrayList("DETAILS_LIST");
                                        if (stringArrayList == null) {
                                            c0068j = c0310c3.r(A.f4435p, 46, null);
                                        } else {
                                            ArrayList arrayList5 = new ArrayList();
                                            int size3 = stringArrayList.size();
                                            int i16 = 0;
                                            while (i16 < size3) {
                                                try {
                                                    O1.i iVar = new O1.i(stringArrayList.get(i16));
                                                    AbstractC0602x.g("BillingClient", "Got product details: ".concat(iVar.toString()));
                                                    arrayList5.add(iVar);
                                                    i16++;
                                                    i15 = i15;
                                                } catch (JSONException e10) {
                                                    c0068j = c0310c3.r(A.a(6, "Error trying to decode SkuDetails."), 47, e10);
                                                }
                                            }
                                            int i17 = i15;
                                            ArrayList<String> stringArrayList2 = bundleI.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                                            new ArrayList();
                                            try {
                                                ArrayList arrayList6 = new ArrayList();
                                                if (stringArrayList2 != null) {
                                                    int size4 = stringArrayList2.size();
                                                    int i18 = 0;
                                                    while (i18 < size4) {
                                                        String str8 = stringArrayList2.get(i18);
                                                        i18++;
                                                        O1.m mVar = new O1.m(str8);
                                                        AbstractC0602x.g("BillingClient", "Got unfetchedProduct: ".concat(mVar.toString()));
                                                        arrayList6.add(mVar);
                                                    }
                                                } else {
                                                    int size5 = arrayList3.size();
                                                    int i19 = 0;
                                                    while (i19 < size5) {
                                                        Object obj = arrayList3.get(i19);
                                                        i19++;
                                                        O1.l lVar = (O1.l) obj;
                                                        int size6 = arrayList5.size();
                                                        int i20 = 0;
                                                        while (true) {
                                                            if (i20 >= size6) {
                                                                i = size5;
                                                                abstractC0594t = abstractC0594t2;
                                                                arrayList6.add(new O1.m(new JSONObject().put("productId", lVar.f4512a).put("type", lVar.f4513b).put("statusCode", 0).toString()));
                                                            }
                                                            Object obj2 = arrayList5.get(i20);
                                                            i20++;
                                                            O1.i iVar2 = (O1.i) obj2;
                                                            i = size5;
                                                            abstractC0594t = abstractC0594t2;
                                                            if (lVar.f4512a.equals(iVar2.f4503c) && lVar.f4513b.equals(iVar2.f4504d)) {
                                                            }
                                                            size5 = i;
                                                            abstractC0594t2 = abstractC0594t;
                                                            break;
                                                            break;
                                                        }
                                                        size5 = i;
                                                        abstractC0594t2 = abstractC0594t;
                                                    }
                                                }
                                                AbstractC0594t abstractC0594t3 = abstractC0594t2;
                                                arrayList.addAll(arrayList5);
                                                arrayList2.addAll(arrayList6);
                                                i11 = i17;
                                                abstractC0594t2 = abstractC0594t3;
                                                i7 = i14;
                                                i3 = 0;
                                                exc = null;
                                                i6 = 107;
                                            } catch (JSONException e11) {
                                                c0068j = c0310c3.r(A.a(6, "Error trying to decode SkuDetails."), 47, e11);
                                            }
                                        }
                                    } else {
                                        int iA = AbstractC0602x.a("BillingClient", bundleI);
                                        String strF = AbstractC0602x.f("BillingClient", bundleI);
                                        c0068j = iA != 0 ? c0310c3.r(A.a(iA, strF), 23, null) : c0310c3.r(A.a(6, strF), 45, null);
                                    }
                                }
                            } catch (DeadObjectException e12) {
                                c0068j = c0310c3.r(A.f4429j, 43, e12);
                            } catch (Exception e13) {
                                c0068j = c0310c3.r(A.f4428h, 43, e13);
                            }
                            d1.a(A.a(c0068j.f1182b, (String) c0068j.f1184d), new C0025m0((ArrayList) c0068j.f1183c));
                            return null;
                        }
                        c0068j = new C0068j(0, "", arrayList, arrayList2);
                        d1.a(A.a(c0068j.f1182b, (String) c0068j.f1184d), new C0025m0((ArrayList) c0068j.f1183c));
                        return null;
                    }
                    int i21 = AbstractC0602x.f8015a;
                    Log.isLoggable("BillingClient", 5);
                    O1.g gVar7 = A.f4434o;
                    c0310c3.z(20, 7, gVar7);
                    com.google.android.gms.internal.play_billing.r rVar2 = AbstractC0594t.i;
                    d1.a(gVar7, new C0025m0(C0600w.f8010l));
                }
                return null;
        }
    }

    public m(w wVar, D d6, A2.d dVar) {
        this.f519h = 0;
        E4.k.f("$this$toTask", wVar);
        l lVar = new l(wVar);
        E4.k.f(LoginActivity.REQUEST_KEY, wVar);
        this.i = lVar;
        this.f520j = d6;
        this.f521k = dVar;
    }
}
