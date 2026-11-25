package p122w4;

import E4.k;
import S1.V;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p111u4.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d, d, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f13459h;

    public a(d dVar) {
        this.f13459h = dVar;
    }

    public d a() {
        d dVar = this.f13459h;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public d b(Object obj, d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p111u4.d
    public final void g(Object obj) {
        ?? r6 = this;
        while (true) {
            a aVar = (a) r6;
            d dVar = aVar.f13459h;
            k.c(dVar);
            try {
                obj = aVar.o(obj);
                if (obj == v4.a.f13292h) {
                    return;
                }
            } catch (Throwable th) {
                obj = V.v(th);
            }
            aVar.p();
            if (!(dVar instanceof a)) {
                dVar.g(obj);
                return;
            }
            r6 = dVar;
        }
    }

    public StackTraceElement n() {
        int iIntValue;
        String strC;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        p091r0.d dVar = f.f13463b;
        p091r0.d dVar2 = f.f13462a;
        if (dVar == null) {
            try {
                p091r0.d dVar3 = new p091r0.d(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 5);
                f.f13463b = dVar3;
                dVar = dVar3;
            } catch (Exception unused2) {
                f.f13463b = dVar2;
                dVar = dVar2;
            }
        }
        if (dVar != dVar2) {
            Method method = (Method) dVar.f11476b;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = (Method) dVar.f11477c;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = (Method) dVar.f11478d;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i);
    }

    public abstract Object o(Object obj);

    public void p() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objN = n();
        if (objN == null) {
            objN = getClass().getName();
        }
        sb.append(objN);
        return sb.toString();
    }
}
