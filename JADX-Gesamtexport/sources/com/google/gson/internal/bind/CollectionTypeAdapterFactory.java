package com.google.gson.internal.bind;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements p105t3.D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F.L f8029h;

    public CollectionTypeAdapterFactory(F.L l6) {
        this.f8029h = l6;
    }

    @Override // p105t3.D
    public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        p116v3.d.b(Collection.class.isAssignableFrom(rawType));
        Type typeK = p116v3.d.k(type, rawType, p116v3.d.g(type, rawType, Collection.class), new HashMap());
        Type type2 = typeK instanceof ParameterizedType ? ((ParameterizedType) typeK).getActualTypeArguments()[0] : Object.class;
        return new P(mVar, type2, mVar.g(p132y3.a.get(type2)), this.f8029h.f(aVar));
    }
}
