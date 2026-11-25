package com.google.gson.internal.bind;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements p105t3.D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F.L f8033h;

    public MapTypeAdapterFactory(F.L l6) {
        this.f8033h = l6;
    }

    @Override // p105t3.D
    public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            p116v3.d.b(Map.class.isAssignableFrom(rawType));
            Type typeK = p116v3.d.k(type, rawType, p116v3.d.g(type, rawType, Map.class), new HashMap());
            actualTypeArguments = typeK instanceof ParameterizedType ? ((ParameterizedType) typeK).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new C0616i(this, mVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? Z.f8057c : mVar.g(p132y3.a.get(type2)), actualTypeArguments[1], mVar.g(p132y3.a.get(actualTypeArguments[1])), this.f8033h.f(aVar));
    }
}
