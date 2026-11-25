package E0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;
import p089q4.u;
import p113v0.U;
import p124x0.AbstractC1098f;
import p124x0.D;
import p124x0.InterfaceC1104l;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z.n f944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f950g;

    public l(Z.n nVar, boolean z5, D d6, h hVar) {
        this.f944a = nVar;
        this.f945b = z5;
        this.f946c = d6;
        this.f947d = hVar;
        this.f950g = d6.i;
    }

    public static /* synthetic */ List h(l lVar, int i) {
        return lVar.g((i & 1) != 0 ? !lVar.f945b : false, (i & 2) == 0);
    }

    public final l a(e eVar, D4.c cVar) {
        h hVar = new h();
        hVar.i = false;
        hVar.f940j = false;
        cVar.invoke(hVar);
        l lVar = new l(new k(cVar), false, new D(true, this.f950g + (eVar != null ? Http2Connection.DEGRADED_PONG_TIMEOUT_NS : 2000000000)), hVar);
        lVar.f948e = true;
        lVar.f949f = this;
        return lVar;
    }

    public final void b(D d6, ArrayList arrayList) {
        P.d dVarT = d6.t();
        int i = dVarT.f4583j;
        if (i > 0) {
            Object[] objArr = dVarT.f4582h;
            int i3 = 0;
            do {
                D d7 = (D) objArr[i3];
                if (d7.D() && !d7.f13832K) {
                    if (d7.f13828C.f(8)) {
                        arrayList.add(p020d2.n.g(d7, this.f945b));
                    } else {
                        b(d7, arrayList);
                    }
                }
                i3++;
            } while (i3 < i);
        }
    }

    public final Y c() {
        if (this.f948e) {
            l lVarJ = j();
            if (lVarJ != null) {
                return lVarJ.c();
            }
            return null;
        }
        InterfaceC1104l interfaceC1104lW = p020d2.n.w(this.f946c);
        if (interfaceC1104lW == null) {
            interfaceC1104lW = this.f944a;
        }
        return AbstractC1098f.q(interfaceC1104lW, 8);
    }

    public final void d(ArrayList arrayList) {
        List listO = o(false);
        int size = listO.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) listO.get(i);
            if (lVar.l()) {
                arrayList.add(lVar);
            } else if (!lVar.f947d.f940j) {
                lVar.d(arrayList);
            }
        }
    }

    public final p030f0.d e() {
        Y yC = c();
        if (yC != null) {
            if (!yC.M0().f5969t) {
                yC = null;
            }
            if (yC != null) {
                return U.f(yC).o(yC, true);
            }
        }
        return p030f0.d.f8838e;
    }

    public final p030f0.d f() {
        Y yC = c();
        if (yC != null) {
            if (!yC.M0().f5969t) {
                yC = null;
            }
            if (yC != null) {
                return U.e(yC);
            }
        }
        return p030f0.d.f8838e;
    }

    public final List g(boolean z5, boolean z6) {
        if (!z5 && this.f947d.f940j) {
            return u.f11237h;
        }
        if (!l()) {
            return o(z6);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final h i() {
        boolean zL = l();
        h hVar = this.f947d;
        if (!zL) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.i = hVar.i;
        hVar2.f940j = hVar.f940j;
        hVar2.f939h.putAll(hVar.f939h);
        n(hVar2);
        return hVar2;
    }

    public final l j() {
        D dR;
        l lVar = this.f949f;
        if (lVar != null) {
            return lVar;
        }
        D d6 = this.f946c;
        boolean z5 = this.f945b;
        if (!z5) {
            dR = null;
            break;
        }
        dR = d6.r();
        while (true) {
            if (dR == null) {
                dR = null;
                break;
            }
            h hVarN = dR.n();
            if (hVarN != null && hVarN.i) {
                break;
            }
            dR = dR.r();
        }
        if (dR == null) {
            for (D dR2 = d6.r(); dR2 != null; dR2 = dR2.r()) {
                if (dR2.f13828C.f(8)) {
                    dR = dR2;
                }
            }
            dR = null;
        }
        if (dR == null) {
            return null;
        }
        return p020d2.n.g(dR, z5);
    }

    public final h k() {
        return this.f947d;
    }

    public final boolean l() {
        return this.f945b && this.f947d.i;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean m() {
        if (this.f948e || !h(this, 4).isEmpty()) {
            return false;
        }
        D dR = this.f946c.r();
        while (dR != null) {
            h hVarN = dR.n();
            if (hVarN != null && hVarN.i) {
                if (dR == null) {
                    return true;
                }
                return false;
            }
            dR = dR.r();
        }
        dR = null;
        if (dR == null) {
            return true;
        }
        return false;
    }

    public final void n(h hVar) {
        if (this.f947d.f940j) {
            return;
        }
        List listO = o(false);
        int size = listO.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) listO.get(i);
            if (!lVar.l()) {
                for (Map.Entry entry : lVar.f947d.f939h.entrySet()) {
                    r rVar = (r) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = hVar.f939h;
                    Object obj = linkedHashMap.get(rVar);
                    E4.k.d("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>", rVar);
                    Object objD = rVar.f999b.d(obj, value);
                    if (objD != null) {
                        linkedHashMap.put(rVar, objD);
                    }
                }
                lVar.n(hVar);
            }
        }
    }

    public final List o(boolean z5) {
        if (this.f948e) {
            return u.f11237h;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f946c, arrayList);
        if (z5) {
            r rVar = o.f988s;
            h hVar = this.f947d;
            LinkedHashMap linkedHashMap = hVar.f939h;
            Object obj = linkedHashMap.get(rVar);
            if (obj == null) {
                obj = null;
            }
            e eVar = (e) obj;
            if (eVar != null && hVar.i && !arrayList.isEmpty()) {
                arrayList.add(a(eVar, new A2.e(7, eVar)));
            }
            r rVar2 = o.f971a;
            if (linkedHashMap.containsKey(rVar2) && !arrayList.isEmpty() && hVar.i) {
                Object obj2 = linkedHashMap.get(rVar2);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) p089q4.l.Z(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new j(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
