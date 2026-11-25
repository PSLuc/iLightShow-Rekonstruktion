package c5;

import B.AbstractC0013g0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: renamed from: c5.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0476a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5.g[] f7426a = new a5.g[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y4.a[] f7427b = new Y4.a[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7428c = new Object();

    public static final F a(Y4.a aVar, String str) {
        return new F(str, new G(aVar));
    }

    public static final Set b(a5.g gVar) {
        E4.k.f("<this>", gVar);
        if (gVar instanceof InterfaceC0490k) {
            return ((InterfaceC0490k) gVar).h();
        }
        HashSet hashSet = new HashSet(gVar.e());
        int iE = gVar.e();
        for (int i = 0; i < iE; i++) {
            hashSet.add(gVar.f(i));
        }
        return hashSet;
    }

    public static final a5.g[] c(List list) {
        a5.g[] gVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (gVarArr = (a5.g[]) list.toArray(new a5.g[0])) == null) ? f7426a : gVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    public static final Y4.a d(K4.b bVar, Y4.a... aVarArr) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        Y4.a aVar;
        Class<?> cls;
        Object obj2;
        Y4.a aVarF;
        Field field;
        Y4.d dVar;
        E4.k.f("<this>", bVar);
        E4.k.f("args", aVarArr);
        Class clsS = p020d2.n.s(bVar);
        Y4.a[] aVarArr2 = (Y4.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        E4.k.f("args", aVarArr2);
        if (clsS.isEnum() && clsS.getAnnotation(Y4.d.class) == null && clsS.getAnnotation(Y4.b.class) == null) {
            Object[] enumConstants = clsS.getEnumConstants();
            String canonicalName = clsS.getCanonicalName();
            E4.k.e("getCanonicalName(...)", canonicalName);
            E4.k.d("null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>", enumConstants);
            return new C0503y(canonicalName, (Enum[]) enumConstants);
        }
        Y4.a[] aVarArr3 = (Y4.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length);
        Y4.c cVar = null;
        try {
            Field declaredField = clsS.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        Y4.a aVarF2 = obj == null ? null : f(obj, (Y4.a[]) Arrays.copyOf(aVarArr3, aVarArr3.length));
        if (aVarF2 != null) {
            return aVarF2;
        }
        String canonicalName2 = clsS.getCanonicalName();
        if (canonicalName2 == null || M4.s.W(canonicalName2, "java.", false) || M4.s.W(canonicalName2, "kotlin.", false)) {
            aVar = null;
        } else {
            Field[] declaredFields = clsS.getDeclaredFields();
            E4.k.e("getDeclaredFields(...)", declaredFields);
            int length = declaredFields.length;
            int i = 0;
            boolean z5 = false;
            Field field2 = null;
            while (true) {
                if (i >= length) {
                    if (!z5) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i];
                if (E4.k.a(field3.getName(), "INSTANCE") && E4.k.a(field3.getType(), clsS) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z5) {
                        z5 = true;
                        field2 = field3;
                    }
                }
                i++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                aVar = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = clsS.getMethods();
                E4.k.e("getMethods(...)", methods);
                int length2 = methods.length;
                int i3 = 0;
                boolean z6 = false;
                Method method = null;
                while (true) {
                    if (i3 >= length2) {
                        if (!z6) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i3];
                    if (E4.k.a(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        E4.k.e("getParameterTypes(...)", parameterTypes);
                        if (parameterTypes.length == 0 && E4.k.a(method2.getReturnType(), Y4.a.class)) {
                            if (!z6) {
                                z6 = true;
                                method = method2;
                            }
                        }
                    }
                    i3++;
                    method = null;
                    break;
                }
                if (method == null) {
                    aVar = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof Y4.a) {
                        aVar = (Y4.a) objInvoke;
                    } else {
                        aVar = null;
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        Y4.a[] aVarArr4 = (Y4.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length);
        Class<?>[] declaredClasses = clsS.getDeclaredClasses();
        E4.k.e("getDeclaredClasses(...)", declaredClasses);
        int length3 = declaredClasses.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i6];
            if (cls.getAnnotation(U.class) != null) {
                break;
            }
            i6++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = clsS.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (aVarF = f(obj2, (Y4.a[]) Arrays.copyOf(aVarArr4, aVarArr4.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = clsS.getDeclaredClasses();
                E4.k.e("getDeclaredClasses(...)", declaredClasses2);
                int length4 = declaredClasses2.length;
                Class<?> cls2 = null;
                int i7 = 0;
                boolean z7 = false;
                while (true) {
                    if (i7 < length4) {
                        Class<?> cls3 = declaredClasses2[i7];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z7) {
                                z7 = true;
                                cls2 = cls3;
                            }
                        }
                        i7++;
                    } else if (!z7) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                aVarF = obj4 instanceof Y4.a ? (Y4.a) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (aVarF != null) {
            return aVarF;
        }
        if (clsS.getAnnotation(Y4.b.class) != null || ((dVar = (Y4.d) clsS.getAnnotation(Y4.d.class)) != null && E4.x.a(dVar.with()).equals(E4.x.a(Y4.c.class)))) {
            cVar = new Y4.c(E4.x.a(clsS));
        }
        return cVar;
    }

    public static final int e(a5.g gVar, a5.g[] gVarArr) {
        E4.k.f("<this>", gVar);
        E4.k.f("typeParams", gVarArr);
        int iHashCode = (gVar.b().hashCode() * 31) + Arrays.hashCode(gVarArr);
        int iE = gVar.e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i3 = iE - 1;
            int i6 = i * 31;
            String strB = gVar.k(gVar.e() - iE).b();
            if (strB != null) {
                iHashCode2 = strB.hashCode();
            }
            i = i6 + iHashCode2;
            iE = i3;
        }
        int iE2 = gVar.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i7 = iE2 - 1;
            int i8 = iHashCode3 * 31;
            S1.h0 h0VarC = gVar.k(gVar.e() - iE2).c();
            iHashCode3 = i8 + (h0VarC != null ? h0VarC.hashCode() : 0);
            iE2 = i7;
        }
    }

    public static final Y4.a f(Object obj, Y4.a... aVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (aVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = aVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = Y4.a.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(aVarArr, aVarArr.length));
            if (objInvoke instanceof Y4.a) {
                return (Y4.a) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause == null) {
                throw e6;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e6.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean g(K4.b bVar) {
        E4.k.f("<this>", bVar);
        return p020d2.n.s(bVar).isInterface();
    }

    public static final K4.b h(K k3) {
        K4.b bVarB = k3.f7402a.f7402a.b();
        if (bVarB instanceof K4.b) {
            return bVarB;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + bVarB);
    }

    public static final void i(K4.b bVar) {
        E4.k.f("<this>", bVar);
        String strB = ((E4.f) bVar).b();
        if (strB == null) {
            strB = "<local class name not available>";
        }
        throw new SerializationException(AbstractC0013g0.i("Serializer for class '", strB, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void j(int i, int i3, a5.g gVar) {
        E4.k.f("descriptor", gVar);
        ArrayList arrayList = new ArrayList();
        int i6 = (~i) & i3;
        for (int i7 = 0; i7 < 32; i7++) {
            if ((i6 & 1) != 0) {
                arrayList.add(gVar.f(i7));
            }
            i6 >>>= 1;
        }
        String strB = gVar.b();
        E4.k.f("serialName", strB);
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strB + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strB + "', but they were missing", null);
    }

    public static final void k(String str, K4.b bVar) {
        String string;
        E4.k.f("baseClass", bVar);
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        E4.f fVar = (E4.f) bVar;
        sb.append(fVar.b());
        sb.append('\'');
        String string2 = sb.toString();
        if (str == null) {
            string = "Class discriminator was missing and no default serializers were registered " + string2 + '.';
        } else {
            StringBuilder sbO = AbstractC0013g0.o("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            AbstractC0013g0.t(sbO, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbO.append(fVar.b());
            sbO.append("' has to be sealed and '@Serializable'.");
            string = sbO.toString();
        }
        throw new SerializationException(string);
    }
}
