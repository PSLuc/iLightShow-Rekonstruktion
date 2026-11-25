package p104t2;

import B.AbstractC0013g0;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import p015c2.h;
import p091r0.d;
import p109u2.i;
import p115v2.o;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final i f12533A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final i f12534B;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h[] f12535j = new h[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f12536k = new n();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m f12537l = m.f12529n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Class f12538m = String.class;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Class f12539n = Object.class;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Class f12540o = Comparable.class;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Class f12541p = Enum.class;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Class f12542q = JsonNode.class;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Class f12543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Class f12544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Class f12545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final i f12546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f12547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final i f12548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final i f12549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final i f12550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final i f12551z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p109u2.n f12552h = new p109u2.n(16, 200);
    public final p i = new p(this);

    static {
        Class cls = Boolean.TYPE;
        f12543r = cls;
        Class cls2 = Integer.TYPE;
        f12544s = cls2;
        Class cls3 = Long.TYPE;
        f12545t = cls3;
        f12546u = new i(cls);
        f12547v = new i(cls2);
        f12548w = new i(cls3);
        f12549x = new i(String.class);
        f12550y = new i(Object.class);
        f12551z = new i(Comparable.class);
        f12533A = new i(Enum.class);
        f12534B = new i(JsonNode.class);
    }

    public static i a(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == f12543r) {
                return f12546u;
            }
            if (cls == f12544s) {
                return f12547v;
            }
            if (cls == f12545t) {
                return f12548w;
            }
            return null;
        }
        if (cls == f12538m) {
            return f12549x;
        }
        if (cls == f12539n) {
            return f12550y;
        }
        if (cls == f12542q) {
            return f12534B;
        }
        return null;
    }

    public static boolean e(h hVar, h hVar2) {
        if (hVar2 instanceof f) {
            ((f) hVar2).f12508u = hVar;
            return true;
        }
        if (hVar.f7281k == hVar2.f7281k) {
            List listE = hVar.X().e();
            List listE2 = hVar2.X().e();
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                if (e((h) listE.get(i), (h) listE2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static h g(h hVar, Class cls) {
        Class cls2 = hVar.f7281k;
        if (cls2 == cls) {
            return hVar;
        }
        h hVarW = hVar.W(cls);
        if (hVarW != null) {
            return hVarW;
        }
        if (cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), hVar));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), hVar));
    }

    public static Class k(String str) throws ClassNotFoundException {
        Class cls;
        Throwable thQ = null;
        if (str.indexOf(46) < 0) {
            if ("int".equals(str)) {
                cls = Integer.TYPE;
            } else if ("long".equals(str)) {
                cls = Long.TYPE;
            } else if ("float".equals(str)) {
                cls = Float.TYPE;
            } else if ("double".equals(str)) {
                cls = Double.TYPE;
            } else if ("boolean".equals(str)) {
                cls = Boolean.TYPE;
            } else if ("byte".equals(str)) {
                cls = Byte.TYPE;
            } else if ("char".equals(str)) {
                cls = Character.TYPE;
            } else if ("short".equals(str)) {
                cls = Short.TYPE;
            } else {
                cls = "void".equals(str) ? Void.TYPE : null;
            }
            if (cls != null) {
                return cls;
            }
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Exception e6) {
                thQ = i.q(e6);
            }
        }
        try {
            return Class.forName(str);
        } catch (Exception e7) {
            if (thQ == null) {
                thQ = i.q(e7);
            }
            i.E(thQ);
            throw new ClassNotFoundException(thQ.getMessage(), thQ);
        }
    }

    public static h[] l(h hVar, Class cls) {
        h hVarW = hVar.W(cls);
        return hVarW == null ? f12535j : hVarW.X().i;
    }

    public static void m(Class cls) {
        m mVar = f12537l;
        if (!mVar.f() || a(cls) == null) {
            new i(cls, mVar, null, null);
        }
    }

    public static i n() {
        f12536k.getClass();
        return f12550y;
    }

    public final h b(d dVar, Type type, m mVar) {
        h hVar;
        Type[] bounds;
        h hVar2;
        m mVarC;
        if (type instanceof Class) {
            return c(dVar, (Class) type, f12537l);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            if (cls == f12541p) {
                return f12533A;
            }
            if (cls == f12540o) {
                return f12551z;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
            if (length == 0) {
                mVarC = f12537l;
            } else {
                h[] hVarArr = new h[length];
                for (int i = 0; i < length; i++) {
                    hVarArr[i] = b(dVar, actualTypeArguments[i], mVar);
                }
                mVarC = m.c(cls, hVarArr);
            }
            return c(dVar, cls, mVarC);
        }
        if (type instanceof h) {
            return (h) type;
        }
        if (type instanceof GenericArrayType) {
            h hVarB = b(dVar, ((GenericArrayType) type).getGenericComponentType(), mVar);
            int i3 = a.f12486v;
            return new a(hVarB, mVar, Array.newInstance((Class<?>) hVarB.f7281k, 0), null, null, false);
        }
        if (!(type instanceof TypeVariable)) {
            if (type instanceof WildcardType) {
                return b(dVar, ((WildcardType) type).getUpperBounds()[0], mVar);
            }
            StringBuilder sb = new StringBuilder("Unrecognized Type: ");
            sb.append(type == null ? "[null]" : type.toString());
            throw new IllegalArgumentException(sb.toString());
        }
        TypeVariable typeVariable = (TypeVariable) type;
        String name = typeVariable.getName();
        if (mVar == null) {
            throw new IllegalArgumentException(AbstractC0013g0.i("Null `bindings` passed (type variable \"", name, "\")"));
        }
        String[] strArr = mVar.f12530h;
        int length2 = strArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length2) {
                hVar = null;
                break;
            }
            if (name.equals(strArr[i6])) {
                hVar = mVar.i[i6];
                if (!(hVar instanceof h) || (hVar2 = ((h) hVar).f12511t) == null) {
                    break;
                    break;
                }
                hVar = hVar2;
                break;
            }
            i6++;
        }
        if (hVar != null) {
            return hVar;
        }
        String[] strArr2 = mVar.f12531j;
        if (strArr2 != null) {
            int length3 = strArr2.length;
            do {
                length3--;
                if (length3 >= 0) {
                }
            } while (!name.equals(strArr2[length3]));
            return f12550y;
        }
        String[] strArr3 = mVar.f12531j;
        int length4 = strArr3 == null ? 0 : strArr3.length;
        String[] strArr4 = length4 == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr3, 1 + length4);
        strArr4[length4] = name;
        m mVar2 = new m(mVar.f12530h, mVar.i, strArr4);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return b(dVar, bounds[0], mVar2);
    }

    public final h c(d dVar, Class cls, m mVar) {
        d dVar2;
        d dVar3;
        h hVarB;
        h[] hVarArrD;
        h[] hVarArr;
        h hVarP0;
        h hVar;
        m mVar2;
        Class cls2;
        m mVar3;
        Class cls3;
        h hVar2;
        Class cls4 = cls;
        i iVarA = a(cls4);
        if (iVarA != null) {
            return iVarA;
        }
        Object kVar = (mVar == null || mVar.f()) ? cls4 : new k(cls4, mVar.i, mVar.f12532k);
        p109u2.n nVar = this.f12552h;
        h hVar3 = (h) ((o) nVar.f12708h).get(kVar);
        if (hVar3 != null) {
            return hVar3;
        }
        if (dVar == null) {
            dVar3 = new d(null, cls4);
        } else {
            if (((Class) dVar.f11477c) != cls4) {
                Object obj = dVar.f11476b;
                while (true) {
                    d dVar4 = (d) obj;
                    if (dVar4 == null) {
                        dVar2 = null;
                        break;
                    }
                    if (((Class) dVar4.f11477c) == cls4) {
                        dVar2 = dVar4;
                        break;
                    }
                    obj = dVar4.f11476b;
                }
            } else {
                dVar2 = dVar;
            }
            if (dVar2 != null) {
                h hVar4 = new h(cls, f12537l, null, null, 0, null, null, false);
                if (((ArrayList) dVar2.f11478d) == null) {
                    dVar2.f11478d = new ArrayList();
                }
                ((ArrayList) dVar2.f11478d).add(hVar4);
                return hVar4;
            }
            dVar3 = new d(dVar, cls4);
        }
        int i = 0;
        if (cls4.isArray()) {
            h hVarB2 = b(dVar3, cls4.getComponentType(), mVar);
            int i3 = a.f12486v;
            hVarP0 = new a(hVarB2, mVar, Array.newInstance((Class<?>) hVarB2.f7281k, 0), null, null, false);
        } else {
            if (cls4.isInterface()) {
                hVarArrD = d(dVar3, cls4, mVar);
                hVarB = null;
            } else {
                Annotation[] annotationArr = i.f12697a;
                Type genericSuperclass = cls4.getGenericSuperclass();
                hVarB = genericSuperclass == null ? null : b(dVar3, genericSuperclass, mVar);
                hVarArrD = d(dVar3, cls4, mVar);
            }
            h hVar5 = f12549x;
            if (cls4 == Properties.class) {
                hVarArr = hVarArrD;
                hVar = hVarB;
                cls2 = Properties.class;
                hVarP0 = new e(cls4, mVar, hVar, hVarArr, hVar5, hVar5, null, null, false);
                cls4 = cls4;
                mVar2 = mVar;
            } else {
                hVarArr = hVarArrD;
                hVarP0 = hVar3;
                hVar = hVarB;
                mVar2 = mVar;
                cls2 = Properties.class;
                if (hVar != null) {
                    hVarP0 = hVar.p0(cls4, mVar2, hVar, hVarArr);
                }
            }
            if (hVarP0 == null) {
                m mVar4 = mVar2 == null ? f12537l : mVar2;
                h hVar6 = f12550y;
                if (cls4 == Map.class) {
                    if (cls4 == cls2) {
                        hVar6 = hVar5;
                    } else {
                        List listE = mVar4.e();
                        int size = listE.size();
                        if (size == 0) {
                            hVar5 = hVar6;
                        } else {
                            if (size != 2) {
                                throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", i.z(cls4), Integer.valueOf(size), size == 1 ? "" : "s", mVar4));
                            }
                            h hVar7 = (h) listE.get(0);
                            hVar6 = (h) listE.get(1);
                            hVar5 = hVar7;
                        }
                    }
                    mVar3 = mVar2;
                    cls3 = cls;
                    hVarP0 = new e(cls3, mVar4, hVar, hVarArr, hVar5, hVar6, null, null, false);
                } else {
                    mVar3 = mVar2;
                    cls3 = cls4;
                    m mVar5 = mVar4;
                    if (cls3 == Collection.class) {
                        List listE2 = mVar5.e();
                        if (!listE2.isEmpty()) {
                            if (listE2.size() != 1) {
                                throw new IllegalArgumentException("Strange Collection type " + cls3.getName() + ": cannot determine type parameters");
                            }
                            hVar6 = (h) listE2.get(0);
                        }
                        hVarP0 = new c(cls3, mVar5, hVar, hVarArr, hVar6, null, null, false);
                    } else if (cls3 == AtomicReference.class) {
                        List listE3 = mVar5.e();
                        if (!listE3.isEmpty()) {
                            if (listE3.size() != 1) {
                                throw new IllegalArgumentException("Strange Reference type " + cls3.getName() + ": cannot determine type parameters");
                            }
                            hVar6 = (h) listE3.get(0);
                        }
                        hVarP0 = new g(cls3, mVar5, hVar, hVarArr, hVar6, null, null, null, false);
                    } else {
                        hVarP0 = null;
                    }
                }
                if (hVarP0 == null) {
                    int length = hVarArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            hVar2 = null;
                            break;
                        }
                        h hVarP1 = hVarArr[i6].p0(cls3, mVar3, hVar, hVarArr);
                        if (hVarP1 != null) {
                            hVar2 = hVarP1;
                            break;
                        }
                        i6++;
                    }
                    hVarP0 = hVar2 == null ? new i(cls3, mVar3, hVar, hVarArr) : hVar2;
                }
            }
        }
        ArrayList arrayList = (ArrayList) dVar3.f11478d;
        if (arrayList != null) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                h hVar8 = (h) obj2;
                if (hVar8.f12511t != null) {
                    throw new IllegalStateException("Trying to re-set self reference; old value = " + hVar8.f12511t + ", new = " + hVarP0);
                }
                hVar8.f12511t = hVarP0;
            }
        }
        if (!hVarP0.g0()) {
            ((o) nVar.f12708h).g(kVar, hVarP0, true);
        }
        return hVarP0;
    }

    public final h[] d(d dVar, Class cls, m mVar) {
        Annotation[] annotationArr = i.f12697a;
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return f12535j;
        }
        int length = genericInterfaces.length;
        h[] hVarArr = new h[length];
        for (int i = 0; i < length; i++) {
            hVarArr[i] = b(dVar, genericInterfaces[i], mVar);
        }
        return hVarArr;
    }

    public final c f(h hVar, Class cls) {
        m mVar;
        String[] strArr = m.f12527l;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            mVar = m.f12529n;
        } else {
            if (length != 1) {
                throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
            }
            mVar = new m(new String[]{typeParameters[0].getName()}, new h[]{hVar}, null);
        }
        c cVar = (c) c(null, cls, mVar);
        if (mVar.f() && hVar != null) {
            h hVarY = cVar.W(Collection.class).Y();
            if (!hVarY.equals(hVar)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", i.z(cls), hVar, hVarY));
            }
        }
        return cVar;
    }

    public final e h(Class cls, h hVar, h hVar2) {
        m mVar;
        h[] hVarArr = {hVar, hVar2};
        String[] strArr = m.f12527l;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            mVar = m.f12529n;
        } else {
            int length = typeParameters.length;
            String[] strArr2 = new String[length];
            for (int i = 0; i < length; i++) {
                strArr2[i] = typeParameters[i].getName();
            }
            if (length != 2) {
                throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
            }
            mVar = new m(strArr2, hVarArr, null);
        }
        e eVar = (e) c(null, cls, mVar);
        if (mVar.f()) {
            h hVarW = eVar.W(Map.class);
            h hVarB0 = hVarW.b0();
            if (!hVarB0.equals(hVar)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", i.z(cls), hVar, hVarB0));
            }
            h hVarY = hVarW.Y();
            if (!hVarY.equals(hVar2)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", i.z(cls), hVar2, hVarY));
            }
        }
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095 A[LOOP:0: B:45:0x0093->B:46:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0164  */
    /* JADX WARN: Code duplicated, block: B:83:0x016a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:95:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0129 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        if (r3 == java.util.EnumSet.class) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p015c2.h i(p015c2.h r17, java.lang.Class r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p104t2.n.i(c2.h, java.lang.Class, boolean):c2.h");
    }

    public final h j(Type type) {
        return b(null, type, f12537l);
    }
}
