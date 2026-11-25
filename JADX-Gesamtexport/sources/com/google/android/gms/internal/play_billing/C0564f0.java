package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0564f0 extends AbstractC0605y0 {
    private static final C0564f0 zzb;
    private C0 zzd = Q0.f7903l;

    static {
        C0564f0 c0564f0 = new C0564f0();
        zzb = c0564f0;
        AbstractC0605y0.n(C0564f0.class, c0564f0);
    }

    public static C0561e0 o() {
        return (C0561e0) zzb.i();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void p(C0564f0 c0564f0, ArrayList arrayList) {
        C0 c6 = c0564f0.zzd;
        if (!((AbstractC0576j0) c6).f7953h) {
            int size = c6.size();
            c0564f0.zzd = c6.b(size + size);
        }
        List list = c0564f0.zzd;
        Charset charset = D0.f7817a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof Q0) {
            Q0 q6 = (Q0) list;
            int i = ((Q0) list).f7904j + size2;
            int length = q6.i.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    q6.i = Arrays.copyOf(q6.i, length);
                } else {
                    q6.i = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            Object obj = arrayList.get(i3);
            if (obj == null) {
                String strF = AbstractC0013g0.f(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(strF);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C0558d0.class});
        }
        if (i3 == 3) {
            return new C0564f0();
        }
        if (i3 == 4) {
            return new C0561e0(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
