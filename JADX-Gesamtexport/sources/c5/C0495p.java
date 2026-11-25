package c5;

import B.C0025m0;
import N.C0208d;
import N.C0217h0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import com.fasterxml.jackson.databind.deser.std.C0512h;
import java.lang.ref.SoftReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p035g0.AbstractC0703d;
import p035g0.C0715p;
import p057l.InterfaceC0817z;
import p124x0.C1106n;
import p5.EnumC0843h;

/* JADX INFO: renamed from: c5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0495p implements l0, R3.e, p035g0.w, p046i2.J, InterfaceC0817z, p060l3.a, p119w1.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7475h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f7476j;

    public /* synthetic */ C0495p(Object obj, int i, Object obj2) {
        this.f7475h = i;
        this.i = obj;
        this.f7476j = obj2;
    }

    @Override // p119w1.l
    public Object a() {
        return (p119w1.u) this.i;
    }

    @Override // R3.e
    public void b() {
        ((R3.e) this.f7476j).b();
    }

    @Override // p046i2.J
    public p015c2.h c(Type type) {
        return ((p104t2.n) this.i).b(null, type, (p104t2.m) this.f7476j);
    }

    @Override // R3.e, R3.m
    public void d(S3.b bVar) {
        V3.a.c((Y3.a) this.i, bVar);
    }

    @Override // p057l.InterfaceC0817z
    public void e(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // R3.e, R3.m
    public void f(Object obj) {
        ((R3.e) this.f7476j).f(obj);
    }

    @Override // p119w1.l
    public boolean g(CharSequence charSequence, int i, int i3, p119w1.s sVar) {
        if ((sVar.f13449c & 4) > 0) {
            return true;
        }
        if (((p119w1.u) this.i) == null) {
            this.i = new p119w1.u(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((p085q.b) this.f7476j).getClass();
        ((p119w1.u) this.i).setSpan(new p119w1.t(sVar), i, i3, 33);
        return true;
    }

    @Override // p060l3.a
    public void h(K.y yVar) {
        p072n3.i iVar = (p072n3.i) this.i;
        p060l3.b bVar = (p060l3.b) this.f7476j;
        synchronized (iVar.f10554f) {
            iVar.f10553e.remove(bVar);
        }
    }

    @Override // p057l.InterfaceC0817z
    public void i(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // p035g0.w
    public void j(p048j0.b bVar) {
        synchronized (this.f7476j) {
            if (!bVar.f9673q) {
                bVar.f9673q = true;
                bVar.b();
            }
        }
    }

    @Override // p035g0.w
    public p048j0.b k() {
        p048j0.b bVar;
        synchronized (this.f7476j) {
            AbstractC0703d.a((p130y0.r) this.i);
            bVar = new p048j0.b(new p048j0.c());
        }
        return bVar;
    }

    @Override // c5.l0
    public Y4.a l(K4.b bVar) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f7476j;
        Class clsS = p020d2.n.s(bVar);
        Object c0489j = concurrentHashMap.get(clsS);
        if (c0489j == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsS, (c0489j = new C0489j((Y4.a) ((D4.c) this.i).invoke(bVar))))) != null) {
            c0489j = objPutIfAbsent;
        }
        return ((C0489j) c0489j).f7460a;
    }

    public boolean m(long j4) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((C0495p) this.f7476j).i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (p091r0.p.a(((p091r0.s) obj).f11523a, j4)) {
                break;
            }
            i++;
        }
        p091r0.s sVar = (p091r0.s) obj;
        if (sVar != null) {
            return sVar.f11530h;
        }
        return false;
    }

    public void n(Object obj) {
        ArrayList arrayList = (ArrayList) this.f7476j;
        if (arrayList.isEmpty()) {
            ((Collection) this.i).add(obj);
        } else {
            ((C0512h) arrayList.get(arrayList.size() - 1)).f7595e.add(obj);
        }
    }

    public void o(p124x0.D d6) {
        if (d6.D()) {
            ((p124x0.q0) this.f7476j).add(d6);
        } else {
            p027e3.a.y0("DepthSortedSet.add called on an unattached node");
            throw null;
        }
    }

    @Override // R3.e, R3.m
    public void onError(Throwable th) {
        ((R3.e) this.f7476j).onError(th);
    }

    public void p(p124x0.D d6, boolean z5) {
        C0495p c0495p = (C0495p) this.f7476j;
        C0495p c0495p2 = (C0495p) this.i;
        if (z5) {
            c0495p2.o(d6);
            c0495p.o(d6);
        } else {
            if (((p124x0.q0) c0495p2.f7476j).contains(d6)) {
                return;
            }
            c0495p.o(d6);
        }
    }

    public q5.q q(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.i;
        q5.q qVar = (q5.q) concurrentHashMap.get(str);
        if (qVar != null) {
            return qVar;
        }
        concurrentHashMap.putIfAbsent(str, (q5.q) ((q5.r) this.f7476j).f(str));
        return (q5.q) concurrentHashMap.get(str);
    }

    public Object r(K4.b bVar, ArrayList arrayList) {
        Object objV;
        Object objV2;
        Object objPutIfAbsent;
        switch (this.f7475h) {
            case 0:
                Object obj = ((C0496q) this.f7476j).get(p020d2.n.s(bVar));
                E4.k.e("get(...)", obj);
                T t6 = (T) obj;
                Object z5 = t6.f7416a.get();
                if (z5 == null) {
                    synchronized (t6) {
                        z5 = t6.f7416a.get();
                        if (z5 == null) {
                            z5 = new Z();
                            t6.f7416a = new SoftReference(z5);
                        }
                    }
                }
                Z z6 = (Z) z5;
                ArrayList arrayList2 = new ArrayList(p089q4.n.P(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(new K((K) obj2));
                }
                ConcurrentHashMap concurrentHashMap = z6.f7425a;
                Object obj3 = concurrentHashMap.get(arrayList2);
                if (obj3 == null) {
                    try {
                        objV = (Y4.a) ((D4.e) this.i).d(bVar, arrayList);
                    } catch (Throwable th) {
                        objV = S1.V.v(th);
                    }
                    p084p4.k kVar = new p084p4.k(objV);
                    Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, kVar);
                    obj3 = objPutIfAbsent2 == null ? kVar : objPutIfAbsent2;
                    break;
                }
                return ((p084p4.k) obj3).f10851h;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f7476j;
                Class clsS = p020d2.n.s(bVar);
                Object z7 = concurrentHashMap2.get(clsS);
                if (z7 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(clsS, (z7 = new Z()))) != null) {
                    z7 = objPutIfAbsent;
                }
                Z z8 = (Z) z7;
                ArrayList arrayList3 = new ArrayList(p089q4.n.P(arrayList, 10));
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    arrayList3.add(new K((K) obj4));
                }
                ConcurrentHashMap concurrentHashMap3 = z8.f7425a;
                Object obj5 = concurrentHashMap3.get(arrayList3);
                if (obj5 == null) {
                    try {
                        objV2 = (Y4.a) ((D4.e) this.i).d(bVar, arrayList);
                    } catch (Throwable th2) {
                        objV2 = S1.V.v(th2);
                    }
                    p084p4.k kVar2 = new p084p4.k(objV2);
                    Object objPutIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, kVar2);
                    obj5 = objPutIfAbsent3 == null ? kVar2 : objPutIfAbsent3;
                    break;
                }
                return ((p084p4.k) obj5).f10851h;
        }
    }

    public p113v0.F s() {
        return (p113v0.F) ((C0217h0) this.f7476j).getValue();
    }

    public boolean t() {
        return !(((p124x0.q0) ((C0495p) this.f7476j).f7476j).isEmpty() && ((p124x0.q0) ((C0495p) this.i).f7476j).isEmpty());
    }

    public String toString() {
        switch (this.f7475h) {
            case 8:
                return "Bounds{lower=" + ((p008b1.c) this.i) + " upper=" + ((p008b1.c) this.f7476j) + "}";
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return "KeyExgAl=" + ((q5.f) this.i) + ", cert.type=" + ((EnumC0843h) this.f7476j);
            case 26:
                return ((p124x0.q0) this.f7476j).toString();
            default:
                return super.toString();
        }
    }

    public void u(Context context, Uri uri) {
        Intent intent = (Intent) this.i;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.f7476j);
    }

    public void v(p031f1.c cVar) {
        int i = cVar.f8858b;
        Handler handler = (Handler) this.f7476j;
        C0025m0 c0025m0 = (C0025m0) this.i;
        if (i != 0) {
            handler.post(new W3.a(c0025m0, i));
        } else {
            handler.post(new O1.n(c0025m0, 9, cVar.f8857a));
        }
    }

    public void w(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) this.f7476j;
        if (arrayList.isEmpty()) {
            ((Map) this.i).put(obj, obj2);
        } else {
            ((com.fasterxml.jackson.databind.deser.std.B) arrayList.get(arrayList.size() - 1)).f7534e.put(obj, obj2);
        }
    }

    public boolean x(p124x0.D d6) {
        if (d6.D()) {
            return ((p124x0.q0) this.f7476j).remove(d6);
        }
        p027e3.a.y0("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    public p015c2.o y(p015c2.h hVar) {
        p015c2.o oVar;
        synchronized (this) {
            p109u2.n nVar = (p109u2.n) this.i;
            oVar = (p015c2.o) ((p115v2.o) nVar.f12708h).get(new p109u2.C(hVar, false));
        }
        return oVar;
    }

    public p015c2.o z(Class cls) {
        p015c2.o oVar;
        synchronized (this) {
            p109u2.n nVar = (p109u2.n) this.i;
            oVar = (p015c2.o) ((p115v2.o) nVar.f12708h).get(new p109u2.C(cls, false));
        }
        return oVar;
    }

    public C0495p(p066m3.f fVar) {
        this.f7475h = 13;
        this.f7476j = new Handler(Looper.getMainLooper());
        this.i = fVar;
    }

    public C0495p(p124x0.D d6, p113v0.F f6) {
        this.f7475h = 28;
        this.i = d6;
        this.f7476j = C0208d.K(f6, N.U.f3673m);
    }

    public C0495p(p130y0.r rVar) {
        this.f7475h = 7;
        this.i = rVar;
        this.f7476j = new Object();
    }

    public C0495p(q5.f fVar, EnumC0843h enumC0843h) {
        this.f7475h = 17;
        if (fVar == null) {
            throw new NullPointerException("key exchange must not be null!");
        }
        if (enumC0843h != null) {
            this.i = fVar;
            this.f7476j = enumC0843h;
            return;
        }
        throw new NullPointerException("certificate type must not be null!");
    }

    public C0495p(q5.r rVar) {
        this.f7475h = 18;
        this.i = new ConcurrentHashMap();
        this.f7476j = rVar;
    }

    public C0495p(int i) {
        this.f7475h = i;
        switch (i) {
            case 21:
                this.i = new p109u2.n(Math.min(64, 1000), 4000);
                this.f7476j = new AtomicReference();
                break;
            case 26:
                this.i = G4.a.y(p084p4.g.i, C1106n.i);
                this.f7476j = new p124x0.q0(new p124x0.c0(1));
                break;
            case 27:
                this.i = new C0495p(26);
                this.f7476j = new C0495p(26);
                break;
        }
    }

    public C0495p(D4.e eVar, int i) {
        this.f7475h = i;
        switch (i) {
            case 2:
                this.i = eVar;
                this.f7476j = new ConcurrentHashMap();
                break;
            default:
                this.i = eVar;
                this.f7476j = new C0496q();
                break;
        }
    }

    public C0495p(D4.c cVar) {
        this.f7475h = 1;
        this.i = cVar;
        this.f7476j = new ConcurrentHashMap();
    }

    public C0495p(Class cls, Collection collection) {
        this.f7475h = 3;
        this.f7476j = new ArrayList();
        this.i = collection;
    }

    public C0495p(C0715p c0715p) {
        this.f7475h = 24;
        this.i = c0715p;
        this.f7476j = androidx.compose.foundation.gestures.a.f6606b;
    }

    public C0495p(p057l.A a6) {
        this.f7475h = 12;
        this.f7476j = a6;
        this.f7475h = 12;
        this.i = a6;
    }

    public C0495p(Class cls, Map map) {
        this.f7475h = 4;
        this.f7476j = new ArrayList();
        this.i = map;
    }
}
