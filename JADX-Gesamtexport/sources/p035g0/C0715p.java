package p035g0;

import B.C0031p0;
import E4.k;
import H1.d;
import I3.a;
import N.C0227m0;
import O1.C0308a;
import S1.h0;
import S4.F;
import S4.P;
import T4.b;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import c5.C0495p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import p045i1.C0752m;
import p045i1.e0;
import p049j1.h;
import p052k.e;
import p052k.f;
import p052k.g;
import p052k.j;
import p052k.p;
import p052k.u;
import p057l.AbstractC0801m;
import p057l.C0793i;
import p057l.InterfaceC0778a0;
import p080p.l;
import p091r0.q;
import p091r0.s;
import p092r1.C0881b;
import p092r1.K;
import p092r1.M;
import p092r1.U;
import p092r1.V;
import p096s.A;
import p096s.A0;
import p096s.AbstractC0924q;
import p096s.B;
import p096s.C0925s;
import p096s.r;
import p109u2.InterfaceC0963b;
import p116v3.m;
import p124x0.d0;
import p127x3.c;
import p130y0.C1136i0;
import p131y1.i;

/* JADX INFO: renamed from: g0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0715p implements InterfaceC0963b, InterfaceC0778a0, p, r, A0, m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9074h;
    public Object i;

    public /* synthetic */ C0715p(int i, Object obj) {
        this.f9074h = i;
        this.i = obj;
    }

    public static C0715p u(C0715p c0715p, C0715p c0715p2) {
        HashMap map;
        HashMap map2;
        if (c0715p == null || (map = (HashMap) c0715p.i) == null || map.isEmpty()) {
            return c0715p2;
        }
        if (c0715p2 == null || (map2 = (HashMap) c0715p2.i) == null || map2.isEmpty()) {
            return c0715p;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : ((HashMap) c0715p2.i).values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : ((HashMap) c0715p.i).values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new C0715p(6, map3);
    }

    /* JADX WARN: Code duplicated, block: B:157:0x029a  */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0175, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList v(p035g0.C0715p r40, java.lang.String r41) {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p035g0.C0715p.v(g0.p, java.lang.String):java.util.ArrayList");
    }

    public void A() {
        View viewFindViewById;
        View view = (View) this.i;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new a(12, viewFindViewById));
    }

    public void B(float f6, float f7) {
        ((C0031p0) this.i).f().g(f6, f7);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    public void C(U u6) {
        P p6;
        Object value;
        Object obj;
        k.f("newState", u6);
        do {
            p6 = (P) this.i;
            value = p6.getValue();
            U u7 = (U) value;
            if (u7 instanceof M ? true : k.a(u7, V.f11633b)) {
                obj = u6;
            } else if (u7 instanceof C0881b) {
                int i = u7.f11632a;
                obj = u7;
                if (u6.f11632a > i) {
                    obj = u6;
                }
            } else {
                boolean z5 = u7 instanceof K;
                obj = u7;
                if (!z5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            C0308a c0308a = b.f5258b;
            if (value == null) {
                value = c0308a;
            }
            if (obj == null) {
                obj = c0308a;
            }
        } while (!p6.i(value, obj));
    }

    @Override // p096s.A0, p096s.y0
    public boolean a() {
        ((d) this.i).getClass();
        return false;
    }

    @Override // p096s.y0
    public long b(AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return ((d) this.i).b(abstractC0924q, abstractC0924q2, abstractC0924q3);
    }

    @Override // p052k.p
    public void c(j jVar, boolean z5) {
        if (jVar instanceof u) {
            ((u) jVar).f9924v.j().c(false);
        }
        p pVar = ((C0793i) this.i).f10087l;
        if (pVar != null) {
            pVar.c(jVar, z5);
        }
    }

    @Override // p109u2.InterfaceC0963b
    public Annotation d(Class cls) {
        HashMap map = (HashMap) this.i;
        if (map == null) {
            return null;
        }
        return (Annotation) map.get(cls);
    }

    @Override // p057l.InterfaceC0778a0
    public void e(j jVar, p052k.k kVar) {
        g gVar = (g) this.i;
        gVar.f9828m.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f9830o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (jVar == ((f) arrayList.get(i)).f9817b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i3 = i + 1;
        gVar.f9828m.postAtTime(new e(this, i3 < arrayList.size() ? (f) arrayList.get(i3) : null, kVar, jVar, 0), jVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // p096s.y0
    public AbstractC0924q f(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return ((d) this.i).f(j4, abstractC0924q, abstractC0924q2, abstractC0924q3);
    }

    @Override // p096s.r
    public A get(int i) {
        switch (this.f9074h) {
            case 24:
                return (B) this.i;
            default:
                return (A) this.i;
        }
    }

    @Override // p057l.InterfaceC0778a0
    public void h(j jVar, p052k.k kVar) {
        ((g) this.i).f9828m.removeCallbacksAndMessages(jVar);
    }

    @Override // p052k.p
    public boolean i(j jVar) {
        C0793i c0793i = (C0793i) this.i;
        if (jVar == c0793i.f10085j) {
            return false;
        }
        ((u) jVar).f9925w.getClass();
        c0793i.getClass();
        p pVar = c0793i.f10087l;
        if (pVar != null) {
            return pVar.i(jVar);
        }
        return false;
    }

    @Override // p096s.y0
    public AbstractC0924q k(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return ((d) this.i).k(j4, abstractC0924q, abstractC0924q2, abstractC0924q3);
    }

    @Override // p116v3.m
    public Object l() {
        switch (this.f9074h) {
            case 28:
                Class cls = (Class) this.i;
                try {
                    return p116v3.r.f13291a.a(cls);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e6);
                }
            default:
                Constructor constructor = (Constructor) this.i;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e7) {
                    p027e3.a aVar = c.f14144a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
                } catch (InstantiationException e8) {
                    throw new RuntimeException("Failed to invoke constructor '" + c.b(constructor) + "' with no args", e8);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException("Failed to invoke constructor '" + c.b(constructor) + "' with no args", e9.getCause());
                }
        }
    }

    @Override // p096s.y0
    public AbstractC0924q m(AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return ((d) this.i).m(abstractC0924q, abstractC0924q2, abstractC0924q3);
    }

    public void n(int i, h hVar, String str, Bundle bundle) {
    }

    public h o(int i) {
        return null;
    }

    public h p() {
        return null;
    }

    public U q() {
        return (U) ((P) this.i).getValue();
    }

    public KeyListener r(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((d0) ((C1136i0) this.i).f14396h).getClass();
        if (keyListener instanceof p131y1.d) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new p131y1.d(keyListener);
    }

    public void s() {
        View view = (View) this.i;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // p109u2.InterfaceC0963b
    public int size() {
        HashMap map = (HashMap) this.i;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void t(float f6, float f7, float f8, float f9) {
        C0031p0 c0031p0 = (C0031p0) this.i;
        InterfaceC0714o interfaceC0714oF = c0031p0.f();
        long jF = h0.f(p030f0.f.d(c0031p0.l()) - (f8 + f6), p030f0.f.b(c0031p0.l()) - (f9 + f7));
        if (p030f0.f.d(jF) < 0.0f || p030f0.f.b(jF) < 0.0f) {
            H.q("Width and height must be greater than or equal to zero");
            throw null;
        }
        c0031p0.x(jF);
        interfaceC0714oF.g(f6, f7);
    }

    public String toString() {
        switch (this.f9074h) {
            case 6:
                HashMap map = (HashMap) this.i;
                return map == null ? "[null]" : map.toString();
            default:
                return super.toString();
        }
    }

    public boolean w(int i, int i3, Bundle bundle) {
        return false;
    }

    public C0495p x(C0495p c0495p, p130y0.r rVar) {
        Object obj;
        long jB;
        boolean z5;
        long j4;
        ArrayList arrayList = (ArrayList) c0495p.i;
        l lVar = new l(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            s sVar = (s) arrayList.get(i);
            long j6 = sVar.f11523a;
            l lVar2 = (l) this.i;
            int iB = p085q.a.b(lVar2.i, lVar2.f10742k, j6);
            if (iB < 0 || (obj = lVar2.f10741j[iB]) == p080p.m.f10743a) {
                obj = null;
            }
            p091r0.r rVar2 = (p091r0.r) obj;
            if (rVar2 == null) {
                long j7 = sVar.f11524b;
                jB = sVar.f11526d;
                j4 = j7;
                z5 = false;
            } else {
                jB = rVar.B(rVar2.f11521b);
                long j8 = rVar2.f11520a;
                z5 = rVar2.f11522c;
                j4 = j8;
            }
            long j9 = jB;
            ArrayList arrayList2 = sVar.i;
            long j10 = sVar.f11531j;
            long j11 = sVar.f11532k;
            int i3 = i;
            long j12 = sVar.f11523a;
            ArrayList arrayList3 = arrayList;
            int i6 = size;
            lVar.b(j12, new q(j12, sVar.f11524b, sVar.f11526d, sVar.f11527e, sVar.f11528f, j4, j9, z5, sVar.f11529g, arrayList2, j10, j11));
            long j13 = sVar.f11523a;
            boolean z6 = sVar.f11527e;
            if (z6) {
                lVar2.b(j13, new p091r0.r(sVar.f11524b, sVar.f11525c, z6));
            } else {
                lVar2.c(j13);
            }
            i = i3 + 1;
            arrayList = arrayList3;
            size = i6;
        }
        return new C0495p(lVar, 19, c0495p);
    }

    public void y(float f6, float f7, long j4) {
        InterfaceC0714o interfaceC0714oF = ((C0031p0) this.i).f();
        interfaceC0714oF.g(p030f0.c.d(j4), p030f0.c.e(j4));
        interfaceC0714oF.a(f6, f7);
        interfaceC0714oF.g(-p030f0.c.d(j4), -p030f0.c.e(j4));
    }

    public void z(boolean z5) {
        i iVar = (i) ((d0) ((C1136i0) this.i).f14396h).f14008c;
        if (iVar.f14590j != z5) {
            if (iVar.i != null) {
                p119w1.h hVarA = p119w1.h.a();
                p131y1.h hVar = iVar.i;
                hVarA.getClass();
                G4.a.n("initCallback cannot be null", hVar);
                ReentrantReadWriteLock reentrantReadWriteLock = hVarA.f13417a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    hVarA.f13418b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            iVar.f14590j = z5;
            if (z5) {
                i.a(iVar.f14589h, p119w1.h.a().b());
            }
        }
    }

    public /* synthetic */ C0715p(int i, boolean z5) {
        this.f9074h = i;
    }

    public C0715p(S0.b bVar) {
        this.f9074h = 17;
        this.i = new p090r.K(p090r.P.f11389a, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r11
  0x002a: PHI (r11v1 int) = (r11v0 int), (r11v4 int), (r11v5 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public C0715p(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.f9074h = 22;
        int length = fArr.length - 1;
        C0925s[][] c0925sArr = new C0925s[length][];
        int i3 = 1;
        int i6 = 1;
        int i7 = 0;
        while (i7 < length) {
            int i8 = iArr[i7];
            int i9 = 3;
            if (i8 == 0) {
                i = i9;
            } else if (i8 == 1) {
                i3 = 1;
                i = i3;
            } else {
                if (i8 != 2) {
                    if (i8 != 3) {
                        i9 = 4;
                        if (i8 != 4) {
                            i9 = 5;
                            if (i8 != 5) {
                                i = i6;
                            } else {
                                i = i9;
                            }
                        } else {
                            i = i9;
                        }
                    } else {
                        if (i3 != 1) {
                            i3 = 1;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i7];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            C0925s[] c0925sArr2 = new C0925s[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                int i11 = i10 * 2;
                float f6 = fArr[i7];
                int i12 = i7 + 1;
                float f7 = fArr[i12];
                float[] fArr4 = fArr2[i7];
                float f8 = fArr4[i11];
                int i13 = i11 + 1;
                float f9 = fArr4[i13];
                float[] fArr5 = fArr2[i12];
                c0925sArr2[i10] = new C0925s(i, f6, f7, f8, f9, fArr5[i11], fArr5[i13]);
            }
            c0925sArr[i7] = c0925sArr2;
            i7++;
            i6 = i;
        }
        this.i = c0925sArr;
    }

    public C0715p(int i) {
        this.f9074h = i;
        switch (i) {
            case 8:
                this.i = new p049j1.i(this);
                break;
            case 16:
                this.i = new LinkedHashMap(0, 0.75f, true);
                break;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                this.i = new l((Object) null);
                break;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                this.i = new AtomicInteger(0);
                break;
            case 20:
                this.i = F.b(V.f11633b);
                break;
            default:
                this.i = new C0701b();
                break;
        }
    }

    public C0715p(View view) {
        this.f9074h = 4;
        if (Build.VERSION.SDK_INT >= 30) {
            C0752m c0752m = new C0752m(3, view);
            c0752m.f9460j = view;
            this.i = c0752m;
            return;
        }
        this.i = new C0715p(3, view);
    }

    public C0715p(AbstractC0801m abstractC0801m) {
        this.f9074h = 12;
        C1136i0 c1136i0 = new C1136i0();
        c1136i0.f14396h = new d0(abstractC0801m);
        this.i = c1136i0;
    }

    public C0715p(Runnable runnable) {
        this.f9074h = 2;
        this.i = new CopyOnWriteArrayList();
        new HashMap();
    }

    public C0715p(View view, Window window) {
        this.f9074h = 5;
        if (Build.VERSION.SDK_INT >= 30) {
            this.i = new e0(window);
        } else {
            this.i = new p045i1.d0(window);
        }
    }

    public C0715p(float f6, float f7, AbstractC0924q abstractC0924q) {
        Object c0715p;
        this.f9074h = 26;
        if (abstractC0924q != null) {
            c0715p = new C0227m0(f6, f7, abstractC0924q);
        } else {
            c0715p = new C0715p(f6, f7);
        }
        this.i = new d(c0715p);
    }

    public C0715p(float f6, float f7) {
        this.f9074h = 24;
        this.i = new B(f6, f7, 0.01f);
    }
}
