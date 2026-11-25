package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f8185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W f8187c;

    static {
        Class<?> cls;
        Class<?> cls2;
        U u6 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8185a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                u6 = (U) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f8186b = u6;
        f8187c = new W();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void a(U u6, Object obj, Object obj2) {
        ((W) u6).getClass();
        r rVar = (r) obj;
        V v6 = rVar.unknownFields;
        V v7 = ((r) obj2).unknownFields;
        V v8 = V.f8188e;
        if (!v8.equals(v7)) {
            if (v8.equals(v6)) {
                int i = v6.f8189a + v7.f8189a;
                int[] iArrCopyOf = Arrays.copyOf(v6.f8190b, i);
                System.arraycopy(v7.f8190b, 0, iArrCopyOf, v6.f8189a, v7.f8189a);
                Object[] objArrCopyOf = Arrays.copyOf(v6.f8191c, i);
                System.arraycopy(v7.f8191c, 0, objArrCopyOf, v6.f8189a, v7.f8189a);
                v6 = new V(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                v6.getClass();
                if (!v7.equals(v8)) {
                    if (!v6.f8192d) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = v6.f8189a + v7.f8189a;
                    v6.a(i3);
                    System.arraycopy(v7.f8190b, 0, v6.f8190b, v6.f8189a, v7.f8189a);
                    System.arraycopy(v7.f8191c, 0, v6.f8191c, v6.f8189a, v7.f8189a);
                    v6.f8189a = i3;
                }
            }
        }
        rVar.unknownFields = v6;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
