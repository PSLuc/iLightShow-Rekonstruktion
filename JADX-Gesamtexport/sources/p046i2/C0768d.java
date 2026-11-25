package p046i2;

import c5.C0495p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p015c2.B;
import p015c2.h;
import p035g0.C0715p;
import p104t2.n;
import p109u2.g;
import p109u2.i;

/* JADX INFO: renamed from: i2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0768d extends v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9541f;

    public C0768d(B b6, n nVar, u uVar, boolean z5) {
        super(b6);
        this.f9540e = nVar;
        this.f9541f = b6 == null ? null : uVar;
        this.f9539d = z5;
    }

    public Map e(J j4, h hVar) {
        u uVar;
        Class clsA;
        C0770f c0770f;
        h hVarD0 = hVar.d0();
        if (hVarD0 == null) {
            return null;
        }
        Map mapE = e(new C0495p((n) this.f9540e, 9, hVarD0.X()), hVarD0);
        Class cls = hVar.f7281k;
        for (Field field : cls.getDeclaredFields()) {
            if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
                if (mapE == null) {
                    mapE = new LinkedHashMap();
                }
                C0770f c0770f2 = new C0770f(j4, field);
                if (this.f9539d) {
                    c0770f2.f9545c = a(n.i, field.getDeclaredAnnotations());
                }
                mapE.put(field.getName(), c0770f2);
            }
        }
        if (mapE != null && (uVar = (u) this.f9541f) != null && (clsA = uVar.a(cls)) != null) {
            ArrayList arrayListL = i.l(clsA, cls, true);
            int size = arrayListL.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListL.get(i);
                i++;
                for (Field field2 : ((Class) obj).getDeclaredFields()) {
                    if (!field2.isSynthetic() && !Modifier.isStatic(field2.getModifiers()) && (c0770f = (C0770f) mapE.get(field2.getName())) != null) {
                        c0770f.f9545c = a(c0770f.f9545c, field2.getDeclaredAnnotations());
                    }
                }
            }
        }
        return mapE;
    }

    public C0715p f(g gVar, g gVar2) {
        if (!this.f9539d) {
            return new C0715p(6, false);
        }
        Annotation[] declaredAnnotations = gVar.f12689b;
        if (declaredAnnotations == null) {
            declaredAnnotations = gVar.f12688a.getDeclaredAnnotations();
            gVar.f12689b = declaredAnnotations;
        }
        q qVarB = b(declaredAnnotations);
        if (gVar2 != null) {
            Annotation[] declaredAnnotations2 = gVar2.f12689b;
            if (declaredAnnotations2 == null) {
                declaredAnnotations2 = gVar2.f12688a.getDeclaredAnnotations();
                gVar2.f12689b = declaredAnnotations2;
            }
            qVarB = a(qVarB, declaredAnnotations2);
        }
        return qVarB.b();
    }

    public C0715p[] g(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.f9539d) {
            return v.f9575b;
        }
        int length = annotationArr.length;
        C0715p[] c0715pArr = new C0715p[length];
        for (int i = 0; i < length; i++) {
            q qVarA = a(n.i, annotationArr[i]);
            if (annotationArr2 != null) {
                qVarA = a(qVarA, annotationArr2[i]);
            }
            c0715pArr[i] = qVarA.b();
        }
        return c0715pArr;
    }

    public C0772h h(Method method, J j4, Method method2) {
        int parameterCount = method.getParameterCount();
        B b6 = this.f9577a;
        C0715p[] c0715pArr = v.f9575b;
        if (b6 == null) {
            C0715p c0715p = new C0715p(6, false);
            if (parameterCount != 0) {
                c0715pArr = new C0715p[parameterCount];
                for (int i = 0; i < parameterCount; i++) {
                    c0715pArr[i] = new C0715p(6, false);
                }
            }
            return new C0772h(j4, method, c0715p, c0715pArr);
        }
        if (parameterCount == 0) {
            q qVarB = b(method.getDeclaredAnnotations());
            if (method2 != null) {
                qVarB = a(qVarB, method2.getDeclaredAnnotations());
            }
            return new C0772h(j4, method, qVarB.b(), c0715pArr);
        }
        q qVarB2 = b(method.getDeclaredAnnotations());
        if (method2 != null) {
            qVarB2 = a(qVarB2, method2.getDeclaredAnnotations());
        }
        return new C0772h(j4, method, qVarB2.b(), g(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    public C0767c i(g gVar, g gVar2) {
        int parameterCount = gVar.f12691d;
        Constructor constructor = gVar.f12688a;
        if (parameterCount < 0) {
            parameterCount = constructor.getParameterCount();
            gVar.f12691d = parameterCount;
        }
        C0766b c0766b = (C0766b) this.f9540e;
        C0715p[] c0715pArr = v.f9575b;
        if (this.f9577a == null) {
            C0715p c0715p = new C0715p(6, false);
            if (parameterCount != 0) {
                c0715pArr = new C0715p[parameterCount];
                for (int i = 0; i < parameterCount; i++) {
                    c0715pArr[i] = new C0715p(6, false);
                }
            }
            return new C0767c(c0766b, constructor, c0715p, c0715pArr);
        }
        if (parameterCount == 0) {
            return new C0767c(c0766b, constructor, f(gVar, gVar2), c0715pArr);
        }
        Annotation[][] parameterAnnotations = gVar.f12690c;
        if (parameterAnnotations == null) {
            parameterAnnotations = constructor.getParameterAnnotations();
            gVar.f12690c = parameterAnnotations;
        }
        Annotation[][] annotationArr = null;
        c0715pArrG = null;
        C0715p[] c0715pArrG = null;
        if (parameterCount != parameterAnnotations.length) {
            Class declaringClass = constructor.getDeclaringClass();
            Annotation[] annotationArr2 = i.f12697a;
            if (Enum.class.isAssignableFrom(declaringClass) && parameterCount == parameterAnnotations.length + 2) {
                Annotation[][] annotationArr3 = new Annotation[parameterAnnotations.length + 2][];
                System.arraycopy(parameterAnnotations, 0, annotationArr3, 2, parameterAnnotations.length);
                c0715pArrG = g(annotationArr3, null);
                parameterAnnotations = annotationArr3;
            } else if (declaringClass.isMemberClass() && parameterCount == parameterAnnotations.length + 1) {
                Annotation[][] annotationArr4 = new Annotation[parameterAnnotations.length + 1][];
                System.arraycopy(parameterAnnotations, 0, annotationArr4, 1, parameterAnnotations.length);
                annotationArr4[0] = v.f9576c;
                c0715pArrG = g(annotationArr4, null);
                parameterAnnotations = annotationArr4;
            }
            if (c0715pArrG == null) {
                throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", constructor.getDeclaringClass().getName(), Integer.valueOf(parameterCount), Integer.valueOf(parameterAnnotations.length)));
            }
        } else {
            if (gVar2 != null) {
                Annotation[][] parameterAnnotations2 = gVar2.f12690c;
                if (parameterAnnotations2 == null) {
                    parameterAnnotations2 = gVar2.f12688a.getParameterAnnotations();
                    gVar2.f12690c = parameterAnnotations2;
                }
                annotationArr = parameterAnnotations2;
            }
            c0715pArrG = g(parameterAnnotations, annotationArr);
        }
        return new C0767c(c0766b, constructor, f(gVar, gVar2), c0715pArrG);
    }

    public C0768d(B b6, C0766b c0766b, boolean z5) {
        super(b6);
        this.f9540e = c0766b;
        this.f9539d = z5;
    }
}
