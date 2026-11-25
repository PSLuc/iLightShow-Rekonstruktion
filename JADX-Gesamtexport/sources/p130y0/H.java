package p130y0;

import D4.c;
import E0.a;
import E0.g;
import E0.h;
import E0.l;
import E0.m;
import E0.o;
import E0.r;
import G0.G;
import N.U;
import S0.k;
import X.q;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p020d2.n;
import p030f0.b;
import p030f0.d;
import p030f0.f;
import p035g0.B;
import p035g0.C;
import p035g0.C0706g;
import p035g0.E;
import p035g0.F;
import p080p.i;
import p084p4.e;
import p113v0.InterfaceC1033p;
import p124x0.AbstractC1098f;
import p124x0.D;
import p124x0.InterfaceC1104l;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public abstract class H implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class[] f14218a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f14219b = new d(0.0f, 0.0f, 10.0f, 10.0f);

    public static void A(View view) {
        try {
            if (!I0.f14249z) {
                I0.f14249z = true;
                I0.f14247x = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                I0.f14248y = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                Method method = I0.f14247x;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = I0.f14248y;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = I0.f14248y;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = I0.f14247x;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            I0.f14245A = true;
        }
    }

    public static final boolean l(l lVar) {
        return !lVar.i().f939h.containsKey(o.i);
    }

    public static final boolean m(l lVar) {
        return lVar.f946c.f13851y == k.i;
    }

    public static final boolean n(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (qVar.e() == U.f3670j || qVar.e() == U.f3673m || qVar.e() == U.f3671k) {
                Object value = qVar.getValue();
                if (value == null) {
                    return true;
                }
                return n(value);
            }
        } else {
            if ((obj instanceof e) && (obj instanceof Serializable)) {
                return false;
            }
            Class[] clsArr = f14218a;
            for (int i = 0; i < 7; i++) {
                if (clsArr[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float o(float[] fArr, int i, float[] fArr2, int i3) {
        int i6 = i * 4;
        return (fArr[i6 + 3] * fArr2[12 + i3]) + (fArr[i6 + 2] * fArr2[8 + i3]) + (fArr[i6 + 1] * fArr2[4 + i3]) + (fArr[i6] * fArr2[i3]);
    }

    public static final p080p.q p(m mVar) {
        l lVarA = mVar.a();
        p080p.q qVar = i.f10737a;
        p080p.q qVar2 = new p080p.q();
        D d6 = lVarA.f946c;
        if (d6.E() && d6.D()) {
            d dVarE = lVarA.e();
            q(new Region(Math.round(dVarE.f8839a), Math.round(dVarE.f8840b), Math.round(dVarE.f8841c), Math.round(dVarE.f8842d)), lVarA, qVar2, lVarA, new Region());
        }
        return qVar2;
    }

    public static final void q(Region region, l lVar, p080p.q qVar, l lVar2, Region region2) {
        D d6;
        InterfaceC1104l interfaceC1104lW;
        boolean zE = lVar2.f946c.E();
        D d7 = lVar2.f946c;
        boolean z5 = (zE && d7.D()) ? false : true;
        boolean zIsEmpty = region.isEmpty();
        int i = lVar.f950g;
        int i3 = lVar2.f950g;
        if (!zIsEmpty || i3 == i) {
            if (!z5 || lVar2.f948e) {
                h hVar = lVar2.f947d;
                boolean z6 = hVar.i;
                InterfaceC1104l interfaceC1104l = lVar2.f944a;
                if (z6 && (interfaceC1104lW = n.w(d7)) != null) {
                    interfaceC1104l = interfaceC1104lW;
                }
                Z.n nVar = ((Z.n) interfaceC1104l).f5958h;
                Object obj = hVar.f939h.get(g.f915b);
                if (obj == null) {
                    obj = null;
                }
                boolean z7 = obj != null;
                boolean z8 = nVar.f5958h.f5969t;
                d dVar = d.f8838e;
                if (z8) {
                    if (z7) {
                        Y yQ = AbstractC1098f.q(nVar, 8);
                        if (yQ.M0().f5969t) {
                            InterfaceC1033p interfaceC1033pF = p113v0.U.f(yQ);
                            b bVar = yQ.f13987F;
                            if (bVar == null) {
                                bVar = new b();
                                bVar.f8833a = 0.0f;
                                bVar.f8834b = 0.0f;
                                bVar.f8835c = 0.0f;
                                bVar.f8836d = 0.0f;
                                yQ.f13987F = bVar;
                            }
                            long jC0 = yQ.C0(yQ.L0());
                            bVar.f8833a = -f.d(jC0);
                            bVar.f8834b = -f.b(jC0);
                            bVar.f8835c = f.d(jC0) + yQ.f0();
                            bVar.f8836d = f.b(jC0) + ((int) (yQ.f13138j & 4294967295L));
                            while (true) {
                                if (yQ == interfaceC1033pF) {
                                    dVar = new d(bVar.f8833a, bVar.f8834b, bVar.f8835c, bVar.f8836d);
                                    break;
                                }
                                yQ.a1(bVar, false, true);
                                if (bVar.b()) {
                                    break;
                                }
                                yQ = yQ.f13991u;
                                E4.k.c(yQ);
                            }
                        }
                    } else {
                        Y yQ2 = AbstractC1098f.q(nVar, 8);
                        dVar = p113v0.U.f(yQ2).o(yQ2, true);
                    }
                }
                int iRound = Math.round(dVar.f8839a);
                int iRound2 = Math.round(dVar.f8840b);
                int iRound3 = Math.round(dVar.f8841c);
                int iRound4 = Math.round(dVar.f8842d);
                region2.set(iRound, iRound2, iRound3, iRound4);
                if (i3 == i) {
                    i3 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (lVar2.f948e) {
                        l lVarJ = lVar2.j();
                        d dVarE = (lVarJ == null || (d6 = lVarJ.f946c) == null || !d6.E()) ? f14219b : lVarJ.e();
                        qVar.i(i3, new B0(lVar2, new Rect(Math.round(dVarE.f8839a), Math.round(dVarE.f8840b), Math.round(dVarE.f8841c), Math.round(dVarE.f8842d))));
                        return;
                    } else {
                        if (i3 == -1) {
                            qVar.i(i3, new B0(lVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                qVar.i(i3, new B0(lVar2, region2.getBounds()));
                List listH = l.h(lVar2, 4);
                for (int size = listH.size() - 1; -1 < size; size--) {
                    q(region, lVar, qVar, (l) listH.get(size), region2);
                }
                if (t(lVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final G r(h hVar) {
        c cVar;
        ArrayList arrayList = new ArrayList();
        Object obj = hVar.f939h.get(g.f914a);
        if (obj == null) {
            obj = null;
        }
        a aVar = (a) obj;
        if (aVar == null || (cVar = (c) aVar.f903b) == null || !((Boolean) cVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (G) arrayList.get(0);
    }

    public static final boolean s(float[] fArr, float[] fArr2) {
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[11];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[14];
        float f21 = fArr[15];
        float f22 = (f6 * f11) - (f7 * f10);
        float f23 = (f6 * f12) - (f8 * f10);
        float f24 = (f6 * f13) - (f9 * f10);
        float f25 = (f7 * f12) - (f8 * f11);
        float f26 = (f7 * f13) - (f9 * f11);
        float f27 = (f8 * f13) - (f9 * f12);
        float f28 = (f14 * f19) - (f15 * f18);
        float f29 = (f14 * f20) - (f16 * f18);
        float f30 = (f14 * f21) - (f17 * f18);
        float f31 = (f15 * f20) - (f16 * f19);
        float f32 = (f15 * f21) - (f17 * f19);
        float f33 = (f16 * f21) - (f17 * f20);
        float f34 = (f27 * f28) + (((f25 * f30) + ((f24 * f31) + ((f22 * f33) - (f23 * f32)))) - (f26 * f29));
        if (f34 == 0.0f) {
            return false;
        }
        float f35 = 1.0f / f34;
        fArr2[0] = ((f13 * f31) + ((f11 * f33) - (f12 * f32))) * f35;
        fArr2[1] = (((f8 * f32) + ((-f7) * f33)) - (f9 * f31)) * f35;
        fArr2[2] = ((f21 * f25) + ((f19 * f27) - (f20 * f26))) * f35;
        fArr2[3] = (((f16 * f26) + ((-f15) * f27)) - (f17 * f25)) * f35;
        float f36 = -f10;
        fArr2[4] = (((f12 * f30) + (f36 * f33)) - (f13 * f29)) * f35;
        fArr2[5] = ((f9 * f29) + ((f33 * f6) - (f8 * f30))) * f35;
        float f37 = -f18;
        fArr2[6] = (((f20 * f24) + (f37 * f27)) - (f21 * f23)) * f35;
        fArr2[7] = ((f17 * f23) + ((f27 * f14) - (f16 * f24))) * f35;
        fArr2[8] = ((f13 * f28) + ((f10 * f32) - (f11 * f30))) * f35;
        fArr2[9] = (((f30 * f7) + ((-f6) * f32)) - (f9 * f28)) * f35;
        fArr2[10] = ((f21 * f22) + ((f18 * f26) - (f19 * f24))) * f35;
        fArr2[11] = (((f24 * f15) + ((-f14) * f26)) - (f17 * f22)) * f35;
        fArr2[12] = (((f11 * f29) + (f36 * f31)) - (f12 * f28)) * f35;
        fArr2[13] = ((f8 * f28) + ((f6 * f31) - (f7 * f29))) * f35;
        fArr2[14] = (((f19 * f23) + (f37 * f25)) - (f20 * f22)) * f35;
        fArr2[15] = ((f16 * f22) + ((f14 * f25) - (f15 * f23))) * f35;
        return true;
    }

    public static final boolean t(l lVar) {
        h hVar = lVar.f947d;
        if (hVar.i) {
            return true;
        }
        Set setKeySet = hVar.f939h.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((r) it.next()).f1000c) {
                return true;
            }
        }
        return false;
    }

    public static final boolean u(E e6, float f6, float f7) {
        if (e6 instanceof C) {
            d dVar = ((C) e6).f9010a;
            return dVar.f8839a <= f6 && f6 < dVar.f8841c && dVar.f8840b <= f7 && f7 < dVar.f8842d;
        }
        if (!(e6 instanceof p035g0.D)) {
            if (e6 instanceof B) {
                return v(((B) e6).f9009a, f6, f7);
            }
            throw new NoWhenBranchMatchedException();
        }
        p030f0.e eVar = ((p035g0.D) e6).f9011a;
        float f8 = eVar.f8843a;
        if (f6 < f8) {
            return false;
        }
        float f9 = eVar.f8845c;
        if (f6 >= f9) {
            return false;
        }
        float f10 = eVar.f8844b;
        if (f7 < f10) {
            return false;
        }
        float f11 = eVar.f8846d;
        if (f7 >= f11) {
            return false;
        }
        long j4 = eVar.f8847e;
        float fB = p030f0.a.b(j4);
        long j6 = eVar.f8848f;
        if (p030f0.a.b(j6) + fB <= eVar.b()) {
            long j7 = eVar.f8850h;
            float fB2 = p030f0.a.b(j7);
            long j8 = eVar.f8849g;
            if (p030f0.a.b(j8) + fB2 <= eVar.b()) {
                if (p030f0.a.c(j7) + p030f0.a.c(j4) <= eVar.a()) {
                    if (p030f0.a.c(j8) + p030f0.a.c(j6) <= eVar.a()) {
                        float fB3 = p030f0.a.b(j4) + f8;
                        float fC = p030f0.a.c(j4) + f10;
                        float fB4 = f9 - p030f0.a.b(j6);
                        float fC2 = p030f0.a.c(j6) + f10;
                        float fB5 = f9 - p030f0.a.b(j8);
                        float fC3 = f11 - p030f0.a.c(j8);
                        float fC4 = f11 - p030f0.a.c(j7);
                        float fB6 = p030f0.a.b(j7) + f8;
                        if (f6 < fB3 && f7 < fC) {
                            return w(f6, f7, eVar.f8847e, fB3, fC);
                        }
                        if (f6 < fB6 && f7 > fC4) {
                            return w(f6, f7, eVar.f8850h, fB6, fC4);
                        }
                        if (f6 > fB4 && f7 < fC2) {
                            return w(f6, f7, eVar.f8848f, fB4, fC2);
                        }
                        if (f6 <= fB5 || f7 <= fC3) {
                            return true;
                        }
                        return w(f6, f7, eVar.f8849g, fB5, fC3);
                    }
                }
            }
        }
        C0706g c0706gH = p035g0.H.h();
        F.b(c0706gH, eVar);
        return v(c0706gH, f6, f7);
    }

    public static final boolean v(F f6, float f7, float f8) {
        d dVar = new d(f7 - 0.005f, f8 - 0.005f, f7 + 0.005f, f8 + 0.005f);
        C0706g c0706gH = p035g0.H.h();
        F.a(c0706gH, dVar);
        C0706g c0706gH2 = p035g0.H.h();
        c0706gH2.d(f6, c0706gH, 1);
        boolean zIsEmpty = c0706gH2.f9063a.isEmpty();
        c0706gH2.e();
        c0706gH.e();
        return !zIsEmpty;
    }

    public static final boolean w(float f6, float f7, long j4, float f8, float f9) {
        float f10 = f6 - f8;
        float f11 = f7 - f9;
        float fB = p030f0.a.b(j4);
        float fC = p030f0.a.c(j4);
        return ((f11 * f11) / (fC * fC)) + ((f10 * f10) / (fB * fB)) <= 1.0f;
    }

    public static final void x(W w6, int i) {
        Object next;
        Iterator<T> it = w6.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((D) ((Map.Entry) next).getKey()).i != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && entry.getValue() != null) {
            throw new ClassCastException();
        }
    }

    public static final String y(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String z(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
