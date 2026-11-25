package E4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements K4.b, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f1061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f1062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f1063d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f1064a;

    static {
        List listM = p089q4.m.M(D4.a.class, D4.c.class, D4.e.class, D4.f.class, D4.g.class, V.a.class, V.a.class, D4.h.class, V.a.class, V.a.class, V.a.class, V.a.class, D4.b.class, V.a.class, V.a.class, V.a.class, V.a.class, V.a.class, V.a.class, V.a.class, V.a.class, V.a.class, D4.d.class);
        ArrayList arrayList = new ArrayList(p089q4.n.P(listM, 10));
        int i = 0;
        for (Object obj : listM) {
            int i3 = i + 1;
            if (i < 0) {
                p089q4.m.O();
                throw null;
            }
            arrayList.add(new p084p4.h((Class) obj, Integer.valueOf(i)));
            i = i3;
        }
        f1061b = p089q4.z.W(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        k.e("<get-values>(...)", collectionValues);
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            k.c(str);
            sb.append(M4.l.z0(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f1061b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f1062c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p089q4.z.S(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, M4.l.z0(str2, str2));
        }
        f1063d = linkedHashMap;
    }

    public f(Class cls) {
        k.f("jClass", cls);
        this.f1064a = cls;
    }

    @Override // E4.e
    public final Class a() {
        return this.f1064a;
    }

    public final String b() {
        String str;
        Class cls = this.f1064a;
        k.f("jClass", cls);
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f1063d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return M4.l.y0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return M4.l.x0(simpleName, '$', simpleName);
        }
        return M4.l.y0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean c(Object obj) {
        Class clsT = this.f1064a;
        k.f("jClass", clsT);
        Map map = f1061b;
        k.d("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>", map);
        Integer num = (Integer) map.get(clsT);
        if (num != null) {
            return z.e(num.intValue(), obj);
        }
        if (clsT.isPrimitive()) {
            clsT = p020d2.n.t(x.a(clsT));
        }
        return clsT.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && p020d2.n.t(this).equals(p020d2.n.t((K4.b) obj));
    }

    public final int hashCode() {
        return p020d2.n.t(this).hashCode();
    }

    public final String toString() {
        return this.f1064a.toString() + " (Kotlin reflection is not available)";
    }
}
