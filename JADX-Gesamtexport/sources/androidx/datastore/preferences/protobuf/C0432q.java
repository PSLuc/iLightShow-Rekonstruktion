package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0432q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6901c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f6902a = X.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6903b;

    static {
        new C0432q(0);
    }

    public C0432q() {
    }

    public static void b(C0427l c0427l, q0 q0Var, int i, Object obj) {
        if (q0Var == q0.f6905k) {
            c0427l.n0(i, 3);
            ((AbstractC0416a) obj).b(c0427l);
            c0427l.n0(i, 4);
        }
        c0427l.n0(i, q0Var.i);
        switch (q0Var.ordinal()) {
            case 0:
                c0427l.h0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0427l.f0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0427l.r0(((Long) obj).longValue());
                break;
            case 3:
                c0427l.r0(((Long) obj).longValue());
                break;
            case 4:
                c0427l.j0(((Integer) obj).intValue());
                break;
            case 5:
                c0427l.h0(((Long) obj).longValue());
                break;
            case 6:
                c0427l.f0(((Integer) obj).intValue());
                break;
            case 7:
                c0427l.Z(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0422g)) {
                    c0427l.m0((String) obj);
                } else {
                    c0427l.d0((C0422g) obj);
                }
                break;
            case 9:
                ((AbstractC0416a) obj).b(c0427l);
                break;
            case 10:
                AbstractC0416a abstractC0416a = (AbstractC0416a) obj;
                c0427l.getClass();
                c0427l.p0(((AbstractC0436v) abstractC0416a).a(null));
                abstractC0416a.b(c0427l);
                break;
            case 11:
                if (!(obj instanceof C0422g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0427l.p0(length);
                    c0427l.a0(bArr, 0, length);
                } else {
                    c0427l.d0((C0422g) obj);
                }
                break;
            case 12:
                c0427l.p0(((Integer) obj).intValue());
                break;
            case 13:
                c0427l.j0(((Integer) obj).intValue());
                break;
            case 14:
                c0427l.f0(((Integer) obj).intValue());
                break;
            case 15:
                c0427l.h0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0427l.p0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                c0427l.r0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f6903b) {
            return;
        }
        X x6 = this.f6902a;
        int size = x6.f6831h.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = x6.c(i);
            if (entryC.getValue() instanceof AbstractC0436v) {
                AbstractC0436v abstractC0436v = (AbstractC0436v) entryC.getValue();
                abstractC0436v.getClass();
                S s6 = S.f6818c;
                s6.getClass();
                s6.a(abstractC0436v.getClass()).b(abstractC0436v);
                abstractC0436v.h();
            }
        }
        if (!x6.f6832j) {
            if (x6.f6831h.size() > 0) {
                x6.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = x6.e().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!x6.f6832j) {
            x6.i = x6.i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x6.i);
            x6.f6834l = x6.f6834l.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x6.f6834l);
            x6.f6832j = true;
        }
        this.f6903b = true;
    }

    public final Object clone() {
        C0432q c0432q = new C0432q();
        X x6 = this.f6902a;
        if (x6.f6831h.size() > 0) {
            Map.Entry entryC = x6.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = x6.e().iterator();
        if (!it.hasNext()) {
            return c0432q;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0432q) {
            return this.f6902a.equals(((C0432q) obj).f6902a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6902a.hashCode();
    }

    public C0432q(int i) {
        a();
        a();
    }
}
