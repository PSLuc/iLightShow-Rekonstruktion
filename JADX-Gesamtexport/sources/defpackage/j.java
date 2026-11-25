package defpackage;

import com.google.protobuf.AbstractC0634b;
import com.google.protobuf.AbstractC0640h;
import com.google.protobuf.AbstractC0652u;
import com.google.protobuf.C0649q;
import com.google.protobuf.InterfaceC0651t;
import com.google.protobuf.InterfaceC0654w;
import com.google.protobuf.M;
import com.google.protobuf.N;
import com.google.protobuf.P;
import com.google.protobuf.Q;
import com.google.protobuf.r;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class j extends r {
    public static final int ACOUSTICNESS_FIELD_NUMBER = 9;
    public static final int DANCEABILITY_FIELD_NUMBER = 5;
    private static final j DEFAULT_INSTANCE;
    public static final int ENERGY_FIELD_NUMBER = 6;
    public static final int INSTRUMENTALNESS_FIELD_NUMBER = 10;
    public static final int LIVENESS_FIELD_NUMBER = 11;
    public static final int LOUDNESS_FIELD_NUMBER = 7;
    public static final int MODE_FIELD_NUMBER = 3;
    private static volatile M PARSER = null;
    public static final int SPEECHINESS_FIELD_NUMBER = 8;
    public static final int TATUMS_FIELD_NUMBER = 4;
    public static final int TEMPO_FIELD_NUMBER = 2;
    public static final int VALENCE_FIELD_NUMBER = 12;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int acousticness_;
    private int danceability_;
    private int energy_;
    private int instrumentalness_;
    private int liveness_;
    private int loudness_;
    private int mode_;
    private int speechiness_;
    private InterfaceC0651t tatums_ = P.f8179k;
    private float tempo_;
    private int valence_;
    private int version_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        r.i(j.class, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static void k(j jVar, ArrayList arrayList) {
        InterfaceC0651t interfaceC0651t = jVar.tatums_;
        if (!((AbstractC0634b) interfaceC0651t).f8196h) {
            int size = interfaceC0651t.size();
            jVar.tatums_ = interfaceC0651t.e(size == 0 ? 10 : size * 2);
        }
        List list = jVar.tatums_;
        Charset charset = AbstractC0652u.f8224a;
        if (arrayList instanceof InterfaceC0654w) {
            List listA = ((InterfaceC0654w) arrayList).a();
            InterfaceC0654w interfaceC0654w = (InterfaceC0654w) list;
            int size2 = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC0654w.size() - size2) + " is null.";
                    for (int size3 = interfaceC0654w.size() - 1; size3 >= size2; size3--) {
                        interfaceC0654w.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0640h) {
                    interfaceC0654w.f((AbstractC0640h) obj);
                } else {
                    interfaceC0654w.add((String) obj);
                }
            }
            return;
        }
        if (arrayList instanceof N) {
            list.addAll(arrayList);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size4 = list.size();
        int size5 = arrayList.size();
        int i = 0;
        while (i < size5) {
            Object obj2 = arrayList.get(i);
            i++;
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static void l(j jVar) {
        jVar.getClass();
        jVar.tatums_ = P.f8179k;
    }

    public static void m(j jVar, int i) {
        jVar.loudness_ = i;
    }

    public static j q(byte[] bArr) {
        return (j) r.h(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.r
    public final Object a(int i) {
        M c0649q;
        switch (AbstractC0916i.d(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new Q(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\u000b\u0002\u0001\u0003\u0004\u0004\u001b\u0005\u000b\u0006\u000b\u0007\u000f\b\u000b\t\u000b\n\u000b\u000b\u000b\f\u000b", new Object[]{"version_", "tempo_", "mode_", "tatums_", i.class, "danceability_", "energy_", "loudness_", "speechiness_", "acousticness_", "instrumentalness_", "liveness_", "valence_"});
            case 3:
                return new j();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                M m6 = PARSER;
                if (m6 != null) {
                    return m6;
                }
                synchronized (j.class) {
                    try {
                        c0649q = PARSER;
                        if (c0649q == null) {
                            c0649q = new C0649q();
                            PARSER = c0649q;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0649q;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int n() {
        return this.loudness_;
    }

    public final List o() {
        return this.tatums_;
    }

    public final int p() {
        return this.version_;
    }
}
