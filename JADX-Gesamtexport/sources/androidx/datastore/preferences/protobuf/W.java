package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f6827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f6828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f6829c;

    static {
        Class<?> cls;
        Class<?> cls2;
        S s6 = S.f6818c;
        b0 b0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f6827a = cls;
        try {
            S s7 = S.f6818c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                b0Var = (b0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f6828b = b0Var;
        f6829c = new d0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i = 0; i < size; i++) {
            iW += C0427l.W(((Integer) list.get(i)).intValue());
        }
        return iW;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0427l.U(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0427l.U(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i = 0; i < size; i++) {
            iW += C0427l.W(((Integer) list.get(i)).intValue());
        }
        return iW;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i = 0; i < size; i++) {
            iW += C0427l.W(((Long) list.get(i)).longValue());
        }
        return iW;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iV += C0427l.V((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iV;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iW += C0427l.W((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iW;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i = 0; i < size; i++) {
            iV += C0427l.V(((Integer) list.get(i)).intValue());
        }
        return iV;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i = 0; i < size; i++) {
            iW += C0427l.W(((Long) list.get(i)).longValue());
        }
        return iW;
    }

    public static Object j(Object obj, int i, InterfaceC0437w interfaceC0437w, Object obj2, b0 b0Var) {
        return obj2;
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
    public static void k(b0 b0Var, Object obj, Object obj2) {
        ((d0) b0Var).getClass();
        AbstractC0436v abstractC0436v = (AbstractC0436v) obj;
        c0 c0Var = abstractC0436v.unknownFields;
        c0 c0Var2 = ((AbstractC0436v) obj2).unknownFields;
        c0 c0Var3 = c0.f6844f;
        if (!c0Var3.equals(c0Var2)) {
            if (c0Var3.equals(c0Var)) {
                int i = c0Var.f6845a + c0Var2.f6845a;
                int[] iArrCopyOf = Arrays.copyOf(c0Var.f6846b, i);
                System.arraycopy(c0Var2.f6846b, 0, iArrCopyOf, c0Var.f6845a, c0Var2.f6845a);
                Object[] objArrCopyOf = Arrays.copyOf(c0Var.f6847c, i);
                System.arraycopy(c0Var2.f6847c, 0, objArrCopyOf, c0Var.f6845a, c0Var2.f6845a);
                c0Var = new c0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c0Var.getClass();
                if (!c0Var2.equals(c0Var3)) {
                    if (!c0Var.f6849e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = c0Var.f6845a + c0Var2.f6845a;
                    c0Var.a(i3);
                    System.arraycopy(c0Var2.f6846b, 0, c0Var.f6846b, c0Var.f6845a, c0Var2.f6845a);
                    System.arraycopy(c0Var2.f6847c, 0, c0Var.f6847c, c0Var.f6845a, c0Var2.f6845a);
                    c0Var.f6845a = i3;
                }
            }
        }
        abstractC0436v.unknownFields = c0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0427l.b0(i, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            Logger logger = C0427l.f6888r;
            i6++;
        }
        c0427l.p0(i6);
        while (i3 < list.size()) {
            c0427l.Z(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public static void n(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                double dDoubleValue = ((Double) list.get(i3)).doubleValue();
                c0427l.getClass();
                c0427l.g0(i, Double.doubleToRawLongBits(dDoubleValue));
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            Logger logger = C0427l.f6888r;
            i6 += 8;
        }
        c0427l.p0(i6);
        while (i3 < list.size()) {
            c0427l.h0(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static void o(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0427l.i0(i, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int iW = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iW += C0427l.W(((Integer) list.get(i6)).intValue());
        }
        c0427l.p0(iW);
        while (i3 < list.size()) {
            c0427l.j0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void p(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0427l.e0(i, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0427l.f6888r;
            i6 += 4;
        }
        c0427l.p0(i6);
        while (i3 < list.size()) {
            c0427l.f0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void q(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0427l.g0(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0427l.f6888r;
            i6 += 8;
        }
        c0427l.p0(i6);
        while (i3 < list.size()) {
            c0427l.h0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void r(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                float fFloatValue = ((Float) list.get(i3)).floatValue();
                c0427l.getClass();
                c0427l.e0(i, Float.floatToRawIntBits(fFloatValue));
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            Logger logger = C0427l.f6888r;
            i6 += 4;
        }
        c0427l.p0(i6);
        while (i3 < list.size()) {
            c0427l.f0(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static void s(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0427l.i0(i, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int iW = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iW += C0427l.W(((Integer) list.get(i6)).intValue());
        }
        c0427l.p0(iW);
        while (i3 < list.size()) {
            c0427l.j0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void t(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0427l.q0(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int iW = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iW += C0427l.W(((Long) list.get(i6)).longValue());
        }
        c0427l.p0(iW);
        while (i3 < list.size()) {
            c0427l.r0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void u(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0427l.e0(i, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0427l.f6888r;
            i6 += 4;
        }
        c0427l.p0(i6);
        while (i3 < list.size()) {
            c0427l.f0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void v(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0427l.g0(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0427l.f6888r;
            i6 += 8;
        }
        c0427l.p0(i6);
        while (i3 < list.size()) {
            c0427l.h0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void w(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                c0427l.o0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int iV = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int iIntValue2 = ((Integer) list.get(i6)).intValue();
            iV += C0427l.V((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0427l.p0(iV);
        while (i3 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i3)).intValue();
            c0427l.p0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i3++;
        }
    }

    public static void x(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                long jLongValue = ((Long) list.get(i3)).longValue();
                c0427l.q0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int iW = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long jLongValue2 = ((Long) list.get(i6)).longValue();
            iW += C0427l.W((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0427l.p0(iW);
        while (i3 < list.size()) {
            long jLongValue3 = ((Long) list.get(i3)).longValue();
            c0427l.r0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i3++;
        }
    }

    public static void y(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0427l.o0(i, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int iV = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iV += C0427l.V(((Integer) list.get(i6)).intValue());
        }
        c0427l.p0(iV);
        while (i3 < list.size()) {
            c0427l.p0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void z(int i, List list, D d6, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0427l c0427l = (C0427l) d6.f6789a;
        int i3 = 0;
        if (!z5) {
            while (i3 < list.size()) {
                c0427l.q0(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0427l.n0(i, 2);
        int iW = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iW += C0427l.W(((Long) list.get(i6)).longValue());
        }
        c0427l.p0(iW);
        while (i3 < list.size()) {
            c0427l.r0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }
}
