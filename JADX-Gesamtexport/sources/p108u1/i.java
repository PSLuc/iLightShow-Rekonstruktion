package p108u1;

import androidx.datastore.preferences.protobuf.AbstractC0434t;
import androidx.datastore.preferences.protobuf.AbstractC0436v;
import androidx.datastore.preferences.protobuf.C0422g;
import androidx.datastore.preferences.protobuf.C0435u;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.U;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0436v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile P PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        AbstractC0436v.j(i.class, iVar);
    }

    public static h D() {
        return (h) ((AbstractC0434t) DEFAULT_INSTANCE.c(5));
    }

    public static void l(i iVar, long j4) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j4);
    }

    public static void m(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void n(i iVar, g gVar) {
        iVar.getClass();
        iVar.value_ = gVar;
        iVar.valueCase_ = 6;
    }

    public static void o(i iVar, double d6) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d6);
    }

    public static void p(i iVar, C0422g c0422g) {
        iVar.getClass();
        iVar.valueCase_ = 8;
        iVar.value_ = c0422g;
    }

    public static void q(i iVar, boolean z5) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z5);
    }

    public static void r(i iVar, float f6) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f6);
    }

    public static void s(i iVar, int i) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i);
    }

    public static i v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final g B() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0436v
    public final Object c(int i) {
        P c0435u;
        switch (AbstractC0916i.d(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new U(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 3:
                return new i();
            case 4:
                return new h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P p6 = PARSER;
                if (p6 != null) {
                    return p6;
                }
                synchronized (i.class) {
                    try {
                        c0435u = PARSER;
                        if (c0435u == null) {
                            c0435u = new C0435u();
                            PARSER = c0435u;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0435u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0422g u() {
        return this.valueCase_ == 8 ? (C0422g) this.value_ : C0422g.f6857j;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
