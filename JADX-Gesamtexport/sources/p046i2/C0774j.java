package p046i2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p015c2.B;
import p109u2.i;

/* JADX INFO: renamed from: i2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0774j extends v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f9552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9553e;

    public C0774j(B b6, u uVar, boolean z5) {
        super(b6);
        this.f9552d = b6 == null ? null : uVar;
        this.f9553e = z5;
    }

    public static boolean g(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterCount() > 2) ? false : true;
    }

    public final void e(J j4, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        if (cls2 != null) {
            f(j4, cls, linkedHashMap, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : i.n(cls)) {
            if (g(method)) {
                A a6 = new A(method);
                C0773i c0773i = (C0773i) linkedHashMap.get(a6);
                if (c0773i == null) {
                    linkedHashMap.put(a6, new C0773i(j4, method, this.f9577a == null ? n.i : b(method.getDeclaredAnnotations())));
                } else {
                    if (this.f9553e) {
                        c0773i.f9551c = c(c0773i.f9551c, method.getDeclaredAnnotations());
                    }
                    Method method2 = c0773i.f9550b;
                    if (method2 == null) {
                        c0773i.f9550b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        c0773i.f9550b = method;
                        c0773i.f9549a = j4;
                    }
                }
            }
        }
    }

    public final void f(J j4, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        List list;
        if (this.f9577a == null) {
            return;
        }
        Annotation[] annotationArr = i.f12697a;
        if (cls2 == null || cls2 == cls || cls2 == Object.class) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(8);
            i.a(cls2, cls, arrayList);
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (g(method)) {
                    A a6 = new A(method);
                    C0773i c0773i = (C0773i) linkedHashMap.get(a6);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (c0773i == null) {
                        linkedHashMap.put(a6, new C0773i(j4, null, b(declaredAnnotations)));
                    } else {
                        c0773i.f9551c = c(c0773i.f9551c, declaredAnnotations);
                    }
                }
            }
        }
    }
}
