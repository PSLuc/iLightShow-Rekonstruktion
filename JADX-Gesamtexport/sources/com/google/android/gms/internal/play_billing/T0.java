package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0601w0 f7910a;

    static {
        int i = AbstractC0578k0.f7955a;
        f7910a = new C0601w0(7);
    }

    public static void a(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0590q0.W(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        c0590q0.d0(i6);
        while (i3 < list.size()) {
            c0590q0.X(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void b(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1.getClass();
        boolean z6 = list instanceof C0607z0;
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z6) {
            if (!z5) {
                while (i3 < list.size()) {
                    int iIntValue = ((Integer) list.get(i3)).intValue();
                    c0590q0.c0(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i3++;
                }
                return;
            }
            c0590q0.b0(i, 2);
            int iH0 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int iIntValue2 = ((Integer) list.get(i6)).intValue();
                iH0 += C0590q0.h0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            c0590q0.d0(iH0);
            while (i3 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i3)).intValue();
                c0590q0.d0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i3++;
            }
            return;
        }
        C0607z0 c0607z0 = (C0607z0) list;
        if (!z5) {
            while (i3 < c0607z0.f8023j) {
                int iD = c0607z0.d(i3);
                c0590q0.c0(i, (iD >> 31) ^ (iD + iD));
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int iH1 = 0;
        for (int i7 = 0; i7 < c0607z0.f8023j; i7++) {
            int iD2 = c0607z0.d(i7);
            iH1 += C0590q0.h0((iD2 >> 31) ^ (iD2 + iD2));
        }
        c0590q0.d0(iH1);
        while (i3 < c0607z0.f8023j) {
            int iD3 = c0607z0.d(i3);
            c0590q0.d0((iD3 >> 31) ^ (iD3 + iD3));
            i3++;
        }
    }

    public static void c(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                long jLongValue = ((Long) list.get(i3)).longValue();
                c0590q0.e0(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int iR = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long jLongValue2 = ((Long) list.get(i6)).longValue();
            iR += C0590q0.R((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        c0590q0.d0(iR);
        while (i3 < list.size()) {
            long jLongValue3 = ((Long) list.get(i3)).longValue();
            c0590q0.f0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i3++;
        }
    }

    public static void d(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1.getClass();
        boolean z6 = list instanceof C0607z0;
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z6) {
            if (!z5) {
                while (i3 < list.size()) {
                    c0590q0.c0(i, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            c0590q0.b0(i, 2);
            int iH0 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iH0 += C0590q0.h0(((Integer) list.get(i6)).intValue());
            }
            c0590q0.d0(iH0);
            while (i3 < list.size()) {
                c0590q0.d0(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C0607z0 c0607z0 = (C0607z0) list;
        if (!z5) {
            while (i3 < c0607z0.f8023j) {
                c0590q0.c0(i, c0607z0.d(i3));
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int iH1 = 0;
        for (int i7 = 0; i7 < c0607z0.f8023j; i7++) {
            iH1 += C0590q0.h0(c0607z0.d(i7));
        }
        c0590q0.d0(iH1);
        while (i3 < c0607z0.f8023j) {
            c0590q0.d0(c0607z0.d(i3));
            i3++;
        }
    }

    public static void e(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0590q0.e0(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int iR = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iR += C0590q0.R(((Long) list.get(i6)).longValue());
        }
        c0590q0.d0(iR);
        while (i3 < list.size()) {
            c0590q0.f0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0607z0)) {
            int iR = 0;
            while (i < size) {
                iR += C0590q0.R(((Integer) list.get(i)).intValue());
                i++;
            }
            return iR;
        }
        C0607z0 c0607z0 = (C0607z0) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += C0590q0.R(c0607z0.d(i));
            i++;
        }
        return iR2;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0590q0.h0(i << 3) + 4) * size;
    }

    public static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0590q0.h0(i << 3) + 8) * size;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0607z0)) {
            int iR = 0;
            while (i < size) {
                iR += C0590q0.R(((Integer) list.get(i)).intValue());
                i++;
            }
            return iR;
        }
        C0607z0 c0607z0 = (C0607z0) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += C0590q0.R(c0607z0.d(i));
            i++;
        }
        return iR2;
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += C0590q0.R(((Long) list.get(i)).longValue());
        }
        return iR;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0607z0)) {
            int iH0 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iH0 += C0590q0.h0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iH0;
        }
        C0607z0 c0607z0 = (C0607z0) list;
        int iH1 = 0;
        while (i < size) {
            int iD = c0607z0.d(i);
            iH1 += C0590q0.h0((iD >> 31) ^ (iD + iD));
            i++;
        }
        return iH1;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iR += C0590q0.R((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iR;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0607z0)) {
            int iH0 = 0;
            while (i < size) {
                iH0 += C0590q0.h0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iH0;
        }
        C0607z0 c0607z0 = (C0607z0) list;
        int iH1 = 0;
        while (i < size) {
            iH1 += C0590q0.h0(c0607z0.d(i));
            i++;
        }
        return iH1;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += C0590q0.R(((Long) list.get(i)).longValue());
        }
        return iR;
    }

    public static Object p(Object obj, int i, int i3, Object obj2, C0601w0 c0601w0) {
        Object obj3 = obj2;
        if (obj2 == null) {
            c0601w0.getClass();
            AbstractC0605y0 abstractC0605y0 = (AbstractC0605y0) obj;
            V0 v6 = abstractC0605y0.zzc;
            obj3 = v6;
            if (v6 == V0.f7918f) {
                V0 v0B = V0.b();
                abstractC0605y0.zzc = v0B;
                obj3 = v0B;
            }
        }
        ((V0) obj3).c(i << 3, Long.valueOf(i3));
        return obj3;
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
    public static void q(Object obj, Object obj2) {
        AbstractC0605y0 abstractC0605y0 = (AbstractC0605y0) obj;
        V0 v6 = abstractC0605y0.zzc;
        V0 v7 = ((AbstractC0605y0) obj2).zzc;
        V0 v8 = V0.f7918f;
        if (!v8.equals(v7)) {
            if (v8.equals(v6)) {
                int i = v6.f7919a + v7.f7919a;
                int[] iArrCopyOf = Arrays.copyOf(v6.f7920b, i);
                System.arraycopy(v7.f7920b, 0, iArrCopyOf, v6.f7919a, v7.f7919a);
                Object[] objArrCopyOf = Arrays.copyOf(v6.f7921c, i);
                System.arraycopy(v7.f7921c, 0, objArrCopyOf, v6.f7919a, v7.f7919a);
                v6 = new V0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                v6.getClass();
                if (!v7.equals(v8)) {
                    if (!v6.f7923e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = v6.f7919a + v7.f7919a;
                    v6.e(i3);
                    System.arraycopy(v7.f7920b, 0, v6.f7920b, v6.f7919a, v7.f7919a);
                    System.arraycopy(v7.f7921c, 0, v6.f7921c, v6.f7919a, v7.f7919a);
                    v6.f7919a = i3;
                }
            }
        }
        abstractC0605y0.zzc = v6;
    }

    public static void r(int i, List list, H0 h1, boolean z5) throws zzel {
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        if (list == null || list.isEmpty()) {
            return;
        }
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i3)).booleanValue();
                c0590q0.d0(i << 3);
                int i6 = c0590q0.f7988g;
                try {
                    int i7 = i6 + 1;
                    try {
                        c0590q0.f7986e[i6] = bBooleanValue;
                        c0590q0.f7988g = i7;
                        i3++;
                    } catch (IndexOutOfBoundsException e6) {
                        indexOutOfBoundsException = e6;
                        i6 = i7;
                        throw new zzel(i6, c0590q0.f7987f, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException = e7;
                }
            }
            return;
        }
        c0590q0.b0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Boolean) list.get(i9)).getClass();
            i8++;
        }
        c0590q0.d0(i8);
        while (i3 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i3)).booleanValue();
            int i10 = c0590q0.f7988g;
            try {
                int i11 = i10 + 1;
                try {
                    c0590q0.f7986e[i10] = bBooleanValue2;
                    c0590q0.f7988g = i11;
                    i3++;
                } catch (IndexOutOfBoundsException e8) {
                    indexOutOfBoundsException2 = e8;
                    i10 = i11;
                    throw new zzel(i10, c0590q0.f7987f, 1, indexOutOfBoundsException2);
                }
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException2 = e9;
            }
        }
    }

    public static void s(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0590q0.W(i, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            i6 += 8;
        }
        c0590q0.d0(i6);
        while (i3 < list.size()) {
            c0590q0.X(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static void t(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1.getClass();
        boolean z6 = list instanceof C0607z0;
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z6) {
            if (!z5) {
                while (i3 < list.size()) {
                    c0590q0.Y(i, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            c0590q0.b0(i, 2);
            int iR = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iR += C0590q0.R(((Integer) list.get(i6)).intValue());
            }
            c0590q0.d0(iR);
            while (i3 < list.size()) {
                c0590q0.Z(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C0607z0 c0607z0 = (C0607z0) list;
        if (!z5) {
            while (i3 < c0607z0.f8023j) {
                c0590q0.Y(i, c0607z0.d(i3));
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int iR2 = 0;
        for (int i7 = 0; i7 < c0607z0.f8023j; i7++) {
            iR2 += C0590q0.R(c0607z0.d(i7));
        }
        c0590q0.d0(iR2);
        while (i3 < c0607z0.f8023j) {
            c0590q0.Z(c0607z0.d(i3));
            i3++;
        }
    }

    public static void u(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1.getClass();
        boolean z6 = list instanceof C0607z0;
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z6) {
            if (!z5) {
                while (i3 < list.size()) {
                    c0590q0.U(i, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            c0590q0.b0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            c0590q0.d0(i6);
            while (i3 < list.size()) {
                c0590q0.V(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C0607z0 c0607z0 = (C0607z0) list;
        if (!z5) {
            while (i3 < c0607z0.f8023j) {
                c0590q0.U(i, c0607z0.d(i3));
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0607z0.f8023j; i9++) {
            c0607z0.d(i9);
            i8 += 4;
        }
        c0590q0.d0(i8);
        while (i3 < c0607z0.f8023j) {
            c0590q0.V(c0607z0.d(i3));
            i3++;
        }
    }

    public static void v(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0590q0.W(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        c0590q0.d0(i6);
        while (i3 < list.size()) {
            c0590q0.X(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void w(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0590q0.U(i, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            i6 += 4;
        }
        c0590q0.d0(i6);
        while (i3 < list.size()) {
            c0590q0.V(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static void x(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1.getClass();
        boolean z6 = list instanceof C0607z0;
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z6) {
            if (!z5) {
                while (i3 < list.size()) {
                    c0590q0.Y(i, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            c0590q0.b0(i, 2);
            int iR = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iR += C0590q0.R(((Integer) list.get(i6)).intValue());
            }
            c0590q0.d0(iR);
            while (i3 < list.size()) {
                c0590q0.Z(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C0607z0 c0607z0 = (C0607z0) list;
        if (!z5) {
            while (i3 < c0607z0.f8023j) {
                c0590q0.Y(i, c0607z0.d(i3));
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int iR2 = 0;
        for (int i7 = 0; i7 < c0607z0.f8023j; i7++) {
            iR2 += C0590q0.R(c0607z0.d(i7));
        }
        c0590q0.d0(iR2);
        while (i3 < c0607z0.f8023j) {
            c0590q0.Z(c0607z0.d(i3));
            i3++;
        }
    }

    public static void y(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0590q0.e0(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int iR = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iR += C0590q0.R(((Long) list.get(i6)).longValue());
        }
        c0590q0.d0(iR);
        while (i3 < list.size()) {
            c0590q0.f0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void z(int i, List list, H0 h1, boolean z5) throws zzel {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1.getClass();
        boolean z6 = list instanceof C0607z0;
        C0590q0 c0590q0 = (C0590q0) h1.f7855a;
        int i3 = 0;
        if (!z6) {
            if (!z5) {
                while (i3 < list.size()) {
                    c0590q0.U(i, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            c0590q0.b0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            c0590q0.d0(i6);
            while (i3 < list.size()) {
                c0590q0.V(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C0607z0 c0607z0 = (C0607z0) list;
        if (!z5) {
            while (i3 < c0607z0.f8023j) {
                c0590q0.U(i, c0607z0.d(i3));
                i3++;
            }
            return;
        }
        c0590q0.b0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0607z0.f8023j; i9++) {
            c0607z0.d(i9);
            i8 += 4;
        }
        c0590q0.d0(i8);
        while (i3 < c0607z0.f8023j) {
            c0590q0.V(c0607z0.d(i3));
            i3++;
        }
    }
}
