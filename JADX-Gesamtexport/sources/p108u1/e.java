package p108u1;

import androidx.datastore.preferences.protobuf.AbstractC0434t;
import androidx.datastore.preferences.protobuf.AbstractC0436v;
import androidx.datastore.preferences.protobuf.C0424i;
import androidx.datastore.preferences.protobuf.C0426k;
import androidx.datastore.preferences.protobuf.C0429n;
import androidx.datastore.preferences.protobuf.C0435u;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.V;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0436v {
    private static final e DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private G preferences_ = G.i;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0436v.j(e.class, eVar);
    }

    public static G l(e eVar) {
        G g6 = eVar.preferences_;
        if (!g6.f6794h) {
            eVar.preferences_ = g6.b();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((AbstractC0434t) DEFAULT_INSTANCE.c(5));
    }

    public static e o(InputStream inputStream) {
        e eVar = DEFAULT_INSTANCE;
        C0424i c0424i = new C0424i(inputStream);
        C0429n c0429nA = C0429n.a();
        AbstractC0436v abstractC0436vI = eVar.i();
        try {
            S s6 = S.f6818c;
            s6.getClass();
            V vA = s6.a(abstractC0436vI.getClass());
            C0426k c0426k = (C0426k) c0424i.f6882b;
            if (c0426k == null) {
                c0426k = new C0426k(c0424i);
            }
            vA.h(abstractC0436vI, c0426k, c0429nA);
            vA.b(abstractC0436vI);
            if (AbstractC0436v.f(abstractC0436vI, true)) {
                return (e) abstractC0436vI;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e6) {
            if (e6.f6797h) {
                throw new InvalidProtocolBufferException(e6.getMessage(), e6);
            }
            throw e6;
        } catch (UninitializedMessageException e7) {
            throw new InvalidProtocolBufferException(e7.getMessage());
        } catch (IOException e8) {
            if (e8.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e8.getCause());
            }
            throw new InvalidProtocolBufferException(e8.getMessage(), e8);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e9.getCause());
            }
            throw e9;
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
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f12653a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P p6 = PARSER;
                if (p6 != null) {
                    return p6;
                }
                synchronized (e.class) {
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

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
