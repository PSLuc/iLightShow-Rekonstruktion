package N3;

import N.InterfaceC0203a0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import c5.C0502x;
import c5.C0503y;
import com.nanjoran.ilightshow.Views.LightDetailsRoute;
import com.nanjoran.ilightshow.Views.MicrophoneRoute;
import com.nanjoran.ilightshow.Views.PaywallViewRoute;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.json.internal.JsonException;
import w5.C1063v;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A0 implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3919h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3920j;

    public /* synthetic */ A0(D3.j jVar, F1.I i) {
        this.f3919h = 1;
        this.f3920j = jVar;
        this.i = i;
    }

    @Override // D4.a
    public final Object invoke() {
        F1.I i;
        String[] strArrNames;
        int i3 = 3;
        E4.g gVar = null;
        boolean z5 = false;
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj = this.f3920j;
        Object obj2 = this.i;
        switch (this.f3919h) {
            case 0:
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) obj;
                F1.I i6 = (F1.I) obj2;
                if (i6 != null) {
                    F1.I.k(i6, new PaywallViewRoute(z5, z5, i3, gVar));
                }
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 1:
                D3.j jVar = (D3.j) obj;
                E4.k.f("$light", jVar);
                String str = jVar.f799a;
                if (str != null && (i = (F1.I) obj2) != null) {
                    F1.I.k(i, new LightDetailsRoute(str));
                }
                return xVar;
            case 2:
                defpackage.t tVar = (defpackage.t) obj;
                F1.I i7 = (F1.I) obj2;
                if (i7 != null) {
                    F1.I.k(i7, MicrophoneRoute.INSTANCE);
                }
                tVar.b(P0.f4082a[3], Boolean.TRUE);
                return xVar;
            case 3:
                String str2 = (String) obj2;
                E4.k.f("$supportEmail", str2);
                Context context = (Context) obj;
                E4.k.f("$context", context);
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mailto:".concat(str2))));
                return xVar;
            case 4:
                C0503y c0503y = (C0503y) obj2;
                c0503y.getClass();
                Enum[] enumArr = c0503y.f7510a;
                C0502x c0502x = new C0502x((String) obj, enumArr.length);
                for (Enum r6 : enumArr) {
                    c0502x.m(r6.name(), false);
                }
                return c0502x;
            case 5:
                return S1.V.r((String) obj2, a5.j.f6377m, new a5.g[0], new M0(5, (c5.Y) obj));
            case 6:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                d5.c cVar = (d5.c) obj;
                d5.i iVar = cVar.f8595a;
                a5.g gVar2 = (a5.g) obj2;
                e5.h.i(gVar2, cVar);
                int iE = gVar2.e();
                for (int i8 = 0; i8 < iE; i8++) {
                    List listJ = gVar2.j(i8);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listJ) {
                        if (obj3 instanceof d5.q) {
                            arrayList.add(obj3);
                        }
                    }
                    d5.q qVar = (d5.q) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (qVar != null && (strArrNames = qVar.names()) != null) {
                        for (String str3 : strArrNames) {
                            String str4 = E4.k.a(gVar2.c(), a5.i.f6373k) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str3)) {
                                String str5 = "The suggested name '" + str3 + "' for " + str4 + ' ' + gVar2.f(i8) + " is already one of the names for " + str4 + ' ' + gVar2.f(((Number) p089q4.z.R(str3, linkedHashMap)).intValue()) + " in " + gVar2;
                                E4.k.f("message", str5);
                                throw new JsonException(str5);
                            }
                            linkedHashMap.put(str3, Integer.valueOf(i8));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? p089q4.v.f11238h : linkedHashMap;
            default:
                v5.k kVar = (v5.k) obj2;
                E4.k.f("$light", kVar);
                v5.l[] lVarArr = v5.l.f13347h;
                kVar.f13335o.put(v5.n.i, Long.valueOf(new Date().getTime()));
                kVar.f13341u.l(kVar, v5.k.f13326E[2], (C1063v) obj);
                return xVar;
        }
    }

    public /* synthetic */ A0(Object obj, int i, Object obj2) {
        this.f3919h = i;
        this.i = obj;
        this.f3920j = obj2;
    }
}
