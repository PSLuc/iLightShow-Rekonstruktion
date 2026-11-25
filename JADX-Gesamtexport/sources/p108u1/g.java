package p108u1;

import androidx.datastore.preferences.protobuf.AbstractC0417b;
import androidx.datastore.preferences.protobuf.AbstractC0434t;
import androidx.datastore.preferences.protobuf.AbstractC0436v;
import androidx.datastore.preferences.protobuf.AbstractC0438x;
import androidx.datastore.preferences.protobuf.C0422g;
import androidx.datastore.preferences.protobuf.C0435u;
import androidx.datastore.preferences.protobuf.InterfaceC0437w;
import androidx.datastore.preferences.protobuf.InterfaceC0440z;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.U;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0436v {
    private static final g DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0437w strings_ = T.f6821k;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0436v.j(g.class, gVar);
    }

    public static void l(g gVar, Iterable iterable) {
        InterfaceC0437w interfaceC0437w = gVar.strings_;
        if (!((AbstractC0417b) interfaceC0437w).f6841h) {
            T t6 = (T) interfaceC0437w;
            int i = t6.f6822j;
            gVar.strings_ = t6.g(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = AbstractC0438x.f6926a;
        iterable.getClass();
        if (iterable instanceof InterfaceC0440z) {
            List listA = ((InterfaceC0440z) iterable).a();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((T) randomAccess).getClass();
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof C0422g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                C0422g.g(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof Q) {
            ((AbstractC0417b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((T) randomAccess).f6822j);
        }
        T t7 = (T) randomAccess;
        int i3 = t7.f6822j;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (t7.f6822j - i3) + " is null.";
                for (int i6 = t7.f6822j - 1; i6 >= i3; i6--) {
                    t7.remove(i6);
                }
                throw new NullPointerException(str);
            }
            t7.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((AbstractC0434t) DEFAULT_INSTANCE.c(5));
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
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P p6 = PARSER;
                if (p6 != null) {
                    return p6;
                }
                synchronized (g.class) {
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

    public final InterfaceC0437w n() {
        return this.strings_;
    }
}
