package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements p105t3.D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F.L f8039h;
    public final p105t3.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Excluder f8040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f8041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f8042l;

    public ReflectiveTypeAdapterFactory(F.L l6, p105t3.h hVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f8039h = l6;
        this.i = hVar;
        this.f8040j = excluder;
        this.f8041k = jsonAdapterAnnotationTypeAdapterFactory;
        this.f8042l = list;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + p127x3.c.c(field) + " and " + p127x3.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // p105t3.D
    public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
        Class rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        p027e3.a aVar2 = p127x3.c.f14144a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new C0619l(0);
        }
        p116v3.d.f(this.f8042l);
        return p127x3.c.f14144a.k0(rawType) ? new C0624q(rawType, c(mVar, aVar, rawType, true)) : new C0622o(this.f8039h.f(aVar), c(mVar, aVar, rawType, false));
    }

    /* JADX WARN: Failed to calculate best type for var: r22v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final com.google.gson.internal.bind.C0623p c(p105t3.m r29, p132y3.a r30, java.lang.Class r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(t3.m, y3.a, java.lang.Class, boolean):com.google.gson.internal.bind.p");
    }

    public final boolean d(Field field, boolean z5) {
        boolean z6;
        p110u3.a aVar;
        Excluder excluder = this.f8040j;
        excluder.getClass();
        if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && ((!excluder.f8027h || ((aVar = (p110u3.a) field.getAnnotation(p110u3.a.class)) != null && (!z5 ? !aVar.deserialize() : !aVar.serialize()))) && !excluder.c(field.getType(), z5))) {
            List list = z5 ? excluder.i : excluder.f8028j;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw p138z3.b.a(it);
                }
            }
            z6 = false;
        } else {
            z6 = true;
        }
        return !z6;
    }
}
