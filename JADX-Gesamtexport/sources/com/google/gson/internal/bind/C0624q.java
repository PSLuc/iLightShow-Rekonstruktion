package com.google.gson.internal.bind;

import com.google.gson.JsonParseException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.gson.internal.bind.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0624q extends AbstractC0621n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f8122e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f8123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f8124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f8125d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f8122e = map;
    }

    public C0624q(Class cls, C0623p c0623p) {
        super(c0623p);
        this.f8125d = new HashMap();
        p027e3.a aVar = p127x3.c.f14144a;
        Constructor constructorE0 = aVar.e0(cls);
        this.f8123b = constructorE0;
        p127x3.c.f(constructorE0);
        String[] strArrI0 = aVar.i0(cls);
        for (int i = 0; i < strArrI0.length; i++) {
            this.f8125d.put(strArrI0[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f8123b.getParameterTypes();
        this.f8124c = new Object[parameterTypes.length];
        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
            this.f8124c[i3] = f8122e.get(parameterTypes[i3]);
        }
    }

    @Override // com.google.gson.internal.bind.AbstractC0621n
    public final Object c() {
        return (Object[]) this.f8124c.clone();
    }

    @Override // com.google.gson.internal.bind.AbstractC0621n
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f8123b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e6) {
            p027e3.a aVar = p127x3.c.f14144a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (IllegalArgumentException | InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + p127x3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Failed to invoke constructor '" + p127x3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e8.getCause());
        }
    }

    @Override // com.google.gson.internal.bind.AbstractC0621n
    public final void e(Object obj, p138z3.a aVar, C0620m c0620m) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f8125d;
        String str = c0620m.f8111c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + p127x3.c.b(this.f8123b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objA = c0620m.f8114f.a(aVar);
        if (objA != null || !c0620m.f8115g) {
            objArr[iIntValue] = objA;
        } else {
            StringBuilder sbW = p012c.k.w("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbW.append(aVar.D());
            throw new JsonParseException(sbW.toString());
        }
    }
}
