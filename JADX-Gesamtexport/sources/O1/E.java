package O1;

import S1.EnumC0363z;
import android.content.Context;
import com.nanjoran.ilightshow.Services.D0;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p046i2.AbstractC0771g;
import p046i2.C0766b;
import p046i2.I;
import p109u2.InterfaceC0963b;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4449f;

    public E(Y2.c cVar, X2.a aVar, Y2.a aVar2) {
        this.f4449f = cVar;
        this.f4447d = null;
        this.f4448e = null;
        this.f4444a = false;
        this.f4445b = aVar;
        this.f4446c = aVar2;
    }

    public static void d(p015c2.h hVar, ArrayList arrayList, boolean z5) {
        int length;
        Class cls = hVar.f7281k;
        if (z5) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((p015c2.h) arrayList.get(i)).f7281k == cls) {
                    return;
                }
            }
            arrayList.add(hVar);
            if (cls == List.class || cls == Map.class) {
                return;
            }
        }
        p015c2.h[] hVarArr = ((p104t2.j) hVar).f12514q;
        List listAsList = (hVarArr == null || (length = hVarArr.length) == 0) ? Collections.EMPTY_LIST : length != 1 ? Arrays.asList(hVarArr) : Collections.singletonList(hVarArr[0]);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            d((p015c2.h) it.next(), arrayList, true);
        }
    }

    public static void e(p015c2.h hVar, ArrayList arrayList, boolean z5) {
        int length;
        Class cls = hVar.f7281k;
        if (cls == Object.class || cls == Enum.class) {
            return;
        }
        if (z5) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((p015c2.h) arrayList.get(i)).f7281k == cls) {
                    return;
                }
            }
            arrayList.add(hVar);
        }
        p015c2.h[] hVarArr = ((p104t2.j) hVar).f12514q;
        List listAsList = (hVarArr == null || (length = hVarArr.length) == 0) ? Collections.EMPTY_LIST : length != 1 ? Arrays.asList(hVarArr) : Collections.singletonList(hVarArr[0]);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            d((p015c2.h) it.next(), arrayList, true);
        }
        p015c2.h hVarD0 = hVar.d0();
        if (hVarD0 != null) {
            e(hVarD0, arrayList, true);
        }
    }

    public static C0766b i(p026e2.n nVar, Class cls) {
        if (cls.isArray() && (nVar == null || ((p026e2.o) nVar).f8720j.a(cls) == null)) {
            return new C0766b(cls);
        }
        E e6 = new E(nVar, cls, nVar);
        List list = Collections.EMPTY_LIST;
        InterfaceC0963b interfaceC0963bH = e6.h(list);
        p104t2.n nVar2 = nVar.i.f8680h;
        return new C0766b(null, cls, list, (Class) e6.f4449f, interfaceC0963bH, (p104t2.m) e6.f4447d, (p015c2.B) e6.f4445b, nVar, nVar2, e6.f4444a);
    }

    public p046i2.q a(p046i2.q qVar, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!qVar.i(annotation)) {
                    qVar = qVar.a(annotation);
                    if (((p015c2.B) this.f4445b).l0(annotation)) {
                        qVar = c(qVar, annotation);
                    }
                }
            }
        }
        return qVar;
    }

    public p046i2.q b(p046i2.q qVar, Class cls, Class cls2) {
        if (cls2 != null) {
            qVar = a(qVar, p109u2.i.j(cls2));
            int i = 0;
            ArrayList arrayListL = p109u2.i.l(cls2, cls, false);
            int size = arrayListL.size();
            while (i < size) {
                Object obj = arrayListL.get(i);
                i++;
                qVar = a(qVar, p109u2.i.j((Class) obj));
            }
        }
        return qVar;
    }

    public p046i2.q c(p046i2.q qVar, Annotation annotation) {
        for (Annotation annotation2 : p109u2.i.j(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !qVar.i(annotation2)) {
                qVar = qVar.a(annotation2);
                if (((p015c2.B) this.f4445b).l0(annotation2)) {
                    qVar = c(qVar, annotation2);
                }
            }
        }
        return qVar;
    }

    public p015c2.h f(AbstractC0771g abstractC0771g, boolean z5, p015c2.h hVar) {
        p015c2.B b6 = (p015c2.B) this.f4447d;
        p015c2.h hVarP0 = b6.p0((p015c2.C) this.f4445b, abstractC0771g, hVar);
        if (hVarP0 != hVar) {
            Class<?> cls = hVarP0.f7281k;
            Class<?> cls2 = hVar.f7281k;
            if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + abstractC0771g.getName() + "': class " + cls.getName() + " not a super-type of (declared) class " + cls2.getName());
            }
            hVar = hVarP0;
            z5 = true;
        }
        p020d2.i iVarT = b6.T(abstractC0771g);
        if (iVarT != null && iVarT != p020d2.i.f8583j) {
            z5 = iVarT == p020d2.i.i;
        }
        if (z5) {
            return hVar.u0();
        }
        return null;
    }

    public void g(W2.a aVar) {
        ((Y2.c) this.f4449f).f5886m.post(new n(8, (Object) this, (Object) aVar, false));
    }

    public InterfaceC0963b h(List list) {
        boolean z5;
        p009b2.l lVar = p046i2.q.f9560h;
        if (((p015c2.B) this.f4445b) != null) {
            p046i2.u uVar = (p046i2.u) this.f4446c;
            if (uVar == null) {
                z5 = false;
            } else if (uVar instanceof I) {
                ((I) uVar).getClass();
                z5 = false;
            } else {
                z5 = true;
            }
            boolean z6 = this.f4444a;
            if (z5 || z6) {
                p046i2.q qVarB = p046i2.n.i;
                Class cls = (Class) this.f4448e;
                Class cls2 = (Class) this.f4449f;
                if (cls2 != null) {
                    qVarB = b(qVarB, cls, cls2);
                }
                if (z6) {
                    qVarB = a(qVarB, p109u2.i.j(cls));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    p015c2.h hVar = (p015c2.h) it.next();
                    if (z5) {
                        Class cls3 = hVar.f7281k;
                        qVarB = b(qVarB, cls3, uVar.a(cls3));
                    }
                    if (z6) {
                        qVarB = a(qVarB, p109u2.i.j(hVar.f7281k));
                    }
                }
                if (z5) {
                    qVarB = b(qVarB, Object.class, uVar.a(Object.class));
                }
                return qVarB.d();
            }
        }
        return lVar;
    }

    public void j(W2.a aVar) {
        Y2.h hVar = (Y2.h) ((Y2.c) this.f4449f).f5883j.get((Y2.a) this.f4446c);
        if (hVar != null) {
            Z2.n.a(hVar.f5901k.f5886m);
            X2.a aVar2 = hVar.f5893b;
            aVar2.c("onSignInFailed for " + aVar2.getClass().getName() + " with " + String.valueOf(aVar));
            hVar.o(aVar, null);
        }
    }

    public E(Context context, D0 d1, D.x xVar) {
        this.f4445b = context;
        this.f4446c = d1;
        this.f4447d = xVar;
        this.f4448e = new D(this, true);
        this.f4449f = new D(this, false);
    }

    public E(p026e2.n nVar, p015c2.h hVar, p046i2.u uVar) {
        Class cls = hVar.f7281k;
        this.f4448e = cls;
        this.f4446c = uVar;
        this.f4447d = hVar.X();
        nVar.getClass();
        p015c2.B bD = nVar.k(p015c2.r.USE_ANNOTATIONS) ? nVar.d() : null;
        this.f4445b = bD;
        this.f4449f = uVar != null ? uVar.a(cls) : null;
        this.f4444a = (bD == null || (p109u2.i.u(cls) && hVar.k0())) ? false : true;
    }

    public E(p015c2.C c6, p046i2.r rVar) {
        this.f4445b = c6;
        this.f4446c = rVar;
        S1.A a6 = S1.A.f4905l;
        p015c2.B b6 = rVar.f9565d;
        S1.A a7 = b6 != null ? a6.a(b6.J(rVar.f9566e)) : a6;
        c6.e(rVar.f9562a.f7281k);
        S1.A a8 = a7.a(a6);
        c6.f8724n.getClass();
        this.f4449f = a6.a(a8);
        this.f4444a = a8.f4906h == EnumC0363z.f4985k;
        this.f4447d = c6.d();
    }

    public E(p026e2.n nVar, Class cls, p026e2.n nVar2) {
        this.f4448e = cls;
        this.f4446c = nVar2;
        this.f4447d = p104t2.m.f12529n;
        if (nVar == null) {
            this.f4445b = null;
            this.f4449f = null;
        } else {
            this.f4445b = nVar.k(p015c2.r.USE_ANNOTATIONS) ? nVar.d() : null;
            this.f4449f = nVar2 != null ? ((p026e2.o) nVar2).f8720j.a(cls) : null;
        }
        this.f4444a = ((p015c2.B) this.f4445b) != null;
    }
}
