package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.gson.internal.bind.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0608a extends p105t3.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p105t3.D f8080c = new p105t3.D() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter$1
        @Override // p105t3.D
        public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
            Type type = aVar.getType();
            boolean z5 = type instanceof GenericArrayType;
            if (!z5 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z5 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new C0608a(mVar, mVar.g(p132y3.a.get(genericComponentType)), p116v3.d.h(genericComponentType));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f8081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0626t f8082b;

    public C0608a(p105t3.m mVar, p105t3.C c6, Class cls) {
        this.f8082b = new C0626t(mVar, c6, cls);
        this.f8081a = cls;
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.L()) {
            arrayList.add(((p105t3.C) this.f8082b.f8136c).a(aVar));
        }
        aVar.s();
        int size = arrayList.size();
        Class cls = this.f8081a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.G();
            return;
        }
        cVar.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f8082b.b(cVar, Array.get(obj, i));
        }
        cVar.s();
    }
}
