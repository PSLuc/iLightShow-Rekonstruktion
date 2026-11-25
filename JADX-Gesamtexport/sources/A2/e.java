package A2;

import B.C0005c0;
import B.EnumC0009e0;
import B.W0;
import B.f1;
import D.F;
import E0.h;
import E0.q;
import E4.k;
import E4.l;
import F.A;
import F.B;
import F.InterfaceC0070l;
import F1.C0091h;
import F1.C0096m;
import F1.C0098o;
import F1.C0100q;
import F1.I;
import G0.G;
import L.A0;
import M0.i;
import N.C0209d0;
import N.C0211e0;
import N.C0213f0;
import N.C0217h0;
import N.C0239t;
import N.C0248x0;
import N.EnumC0236r0;
import P4.T;
import S4.P;
import W2.g;
import X.w;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import com.nanjoran.ilightshow.Views.HomeScreenRoute;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p035g0.J;
import p035g0.N;
import p058l0.C;
import p058l0.C0820c;
import p080p.v;
import p084p4.x;
import p089q4.AbstractC0861a;
import p089q4.j;
import p089q4.z;
import p113v0.InterfaceC1033p;
import p113v0.U;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj) {
        super(1);
        this.f22h = i;
        this.i = obj;
    }

    /* JADX WARN: Type inference failed for: r11v89, types: [D4.c, E4.l] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        int i = 0;
        boolean z5 = true;
        switch (this.f22h) {
            case 0:
                D4.e eVar = (D4.e) obj;
                k.f("next", eVar);
                return new d(this, i, eVar);
            case 1:
                ((h) obj).i(B.f1082c, new A(EnumC0009e0.f307h, ((InterfaceC0070l) this.i).a(), 2, true));
                return x.f10867a;
            case 2:
                G g6 = (G) obj;
                f1 f1Var = (f1) this.i;
                if (f1Var != null) {
                    f1Var.f316b.setValue(g6);
                }
                return x.f10867a;
            case 3:
                float[] fArr = ((p035g0.A) obj).f9008a;
                InterfaceC1033p interfaceC1033p = (InterfaceC1033p) this.i;
                if (interfaceC1033p.K()) {
                    U.f(interfaceC1033p).g(interfaceC1033p, fArr);
                }
                return x.f10867a;
            case 4:
                float fFloatValue = ((Number) obj).floatValue();
                W0 w6 = (W0) this.i;
                float fH = w6.f252a.h() + fFloatValue;
                C0209d0 c0209d0 = w6.f253b;
                float fH2 = c0209d0.h();
                C0209d0 c0209d1 = w6.f252a;
                if (fH > fH2) {
                    fFloatValue = c0209d0.h() - c0209d1.h();
                } else if (fH < 0.0f) {
                    fFloatValue = -c0209d1.h();
                }
                c0209d1.j(c0209d1.h() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 5:
                ((F) this.i).a((i) obj);
                return x.f10867a;
            case 6:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.i).cancel();
                }
                return x.f10867a;
            case 7:
                q.g((h) obj, ((E0.e) this.i).f911a);
                return x.f10867a;
            case 8:
                F1.B b6 = (F1.B) obj;
                k.f("startDestination", b6);
                Map mapX = z.X(b6.f1246l);
                LinkedHashMap linkedHashMap = new LinkedHashMap(z.S(mapX.size()));
                for (Map.Entry entry : mapX.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((C0091h) entry.getValue()).f1344a);
                }
                return H1.c.d((HomeScreenRoute) this.i, linkedHashMap);
            case 9:
                C0096m c0096m = (C0096m) obj;
                k.f("backStackEntry", c0096m);
                F1.B b7 = c0096m.i;
                if (b7 == null) {
                    b7 = null;
                }
                if (b7 == null) {
                    return null;
                }
                c0096m.g();
                F1.U u6 = (F1.U) this.i;
                F1.B bC = u6.c(b7);
                if (bC == null) {
                    return null;
                }
                if (bC.equals(b7)) {
                    return c0096m;
                }
                C0100q c0100qB = u6.b();
                Bundle bundleC = bC.c(c0096m.g());
                I i3 = c0100qB.f1376h;
                return g.h(i3.f1270a, bC, bundleC, i3.g(), i3.f1284p);
            case 10:
                Bundle bundle = (Bundle) obj;
                I i6 = G4.a.i((Context) this.i);
                if (bundle != null) {
                    bundle.setClassLoader(i6.f1270a.getClassLoader());
                    i6.f1273d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    i6.f1274e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap2 = i6.f1282n;
                    linkedHashMap2.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < length) {
                            i6.f1281m.put(Integer.valueOf(intArray[i7]), stringArrayList.get(i8));
                            i7++;
                            i8++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        int size = stringArrayList2.size();
                        while (i < size) {
                            String str = stringArrayList2.get(i);
                            i++;
                            String str2 = str;
                            Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str2);
                            if (parcelableArray != null) {
                                k.e(AuthorizationClient.PlayStoreParams.ID, str2);
                                j jVar = new j(parcelableArray.length);
                                E4.b bVarJ = k.j(parcelableArray);
                                while (bVarJ.hasNext()) {
                                    Parcelable parcelable = (Parcelable) bVarJ.next();
                                    k.d("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState", parcelable);
                                    jVar.addLast((C0098o) parcelable);
                                }
                                linkedHashMap2.put(str2, jVar);
                            }
                        }
                    }
                    i6.f1275f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return i6;
            case 11:
                k.f("$this$DisposableEffect", (N.G) obj);
                return new B.A(z5 ? 1 : 0, (G2.a) this.i);
            case 12:
                ((Boolean) obj).getClass();
                ((A0) this.i).f2145b.invoke();
                return x.f10867a;
            case 13:
                L0.q qVar = (L0.q) obj;
                return ((L0.e) this.i).a(new L0.q(null, qVar.f3034b, qVar.f3035c, qVar.f3036d, qVar.f3037e)).f3038h;
            case 14:
                N.B.i.removeFrameCallback((N.A) this.i);
                return x.f10867a;
            case 15:
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                C0248x0 c0248x0 = (C0248x0) this.i;
                synchronized (c0248x0.f3855b) {
                    try {
                        T t6 = c0248x0.f3856c;
                        if (t6 != null) {
                            P p6 = c0248x0.f3870r;
                            EnumC0236r0 enumC0236r0 = EnumC0236r0.i;
                            p6.getClass();
                            p6.i(null, enumC0236r0);
                            P p7 = C0248x0.f3852v;
                            t6.c(cancellationException);
                            c0248x0.f3867o = null;
                            t6.Q(new C0005c0(c0248x0, 22, th));
                        } else {
                            c0248x0.f3857d = cancellationException;
                            P p8 = c0248x0.f3870r;
                            EnumC0236r0 enumC0236r1 = EnumC0236r0.f3785h;
                            p8.getClass();
                            p8.i(null, enumC0236r1);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return x.f10867a;
            case 16:
                ((C0239t) this.i).v(obj);
                return x.f10867a;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                ((C0209d0) this.i).j(((Number) obj).floatValue());
                return x.f10867a;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                ((C0211e0) this.i).j(((Number) obj).intValue());
                return x.f10867a;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                ((C0213f0) this.i).j(((Number) obj).longValue());
                return x.f10867a;
            case 20:
                ((C0217h0) this.i).setValue(obj);
                return x.f10867a;
            case 21:
                W.i iVar = ((W.g) this.i).f5531c;
                return Boolean.valueOf(iVar != null ? iVar.a(obj) : true);
            case 22:
                X.x xVar = (X.x) this.i;
                xVar.getClass();
                synchronized (xVar.f5746f) {
                    w wVar = xVar.f5748h;
                    k.c(wVar);
                    Object obj2 = wVar.f5731b;
                    k.c(obj2);
                    int i9 = wVar.f5733d;
                    v vVar = wVar.f5732c;
                    if (vVar == null) {
                        vVar = new v();
                        wVar.f5732c = vVar;
                        wVar.f5735f.i(obj2, vVar);
                    }
                    wVar.c(obj, i9, obj2, vVar);
                }
                return x.f10867a;
            case 23:
                ((X4.h) this.i).b();
                return x.f10867a;
            case 24:
                J j4 = (J) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.i;
                j4.h(j4.a() * shadowGraphicsLayerElement.f6689a);
                j4.i(shadowGraphicsLayerElement.f6690b);
                j4.d(shadowGraphicsLayerElement.f6691c);
                j4.c(shadowGraphicsLayerElement.f6692d);
                j4.j(shadowGraphicsLayerElement.f6693e);
                return x.f10867a;
            case 25:
                J j6 = (J) obj;
                N n6 = (N) this.i;
                j6.e(n6.f9044u);
                j6.g(n6.f9045v);
                j6.b(n6.f9046w);
                j6.h(n6.f9047x);
                float f6 = n6.f9048y;
                if (j6.f9023o != f6) {
                    j6.f9017h |= 1024;
                    j6.f9023o = f6;
                }
                float f7 = n6.f9049z;
                if (j6.f9024p != f7) {
                    j6.f9017h |= 2048;
                    j6.f9024p = f7;
                }
                j6.k(n6.f9038A);
                j6.i(n6.f9039B);
                j6.d(n6.f9040C);
                j6.c(n6.f9041D);
                j6.j(n6.f9042E);
                return x.f10867a;
            case 26:
                C c6 = (C) obj;
                C0820c c0820c = (C0820c) this.i;
                c0820c.g(c6);
                ?? r11 = c0820c.i;
                if (r11 != 0) {
                    r11.invoke(c6);
                }
                return x.f10867a;
            case 27:
                return obj == ((p080p.w) this.i) ? "(this)" : String.valueOf(obj);
            case 28:
                return obj == ((AbstractC0861a) this.i) ? "(this Collection)" : String.valueOf(obj);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                k.f("it", entry2);
                p089q4.e eVar2 = (p089q4.e) this.i;
                StringBuilder sb = new StringBuilder();
                Object key = entry2.getKey();
                sb.append(key == eVar2 ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry2.getValue();
                sb.append(value != eVar2 ? String.valueOf(value) : "(this Map)");
                return sb.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i, Object obj2) {
        super(1);
        this.f22h = i;
        this.i = obj;
    }
}
