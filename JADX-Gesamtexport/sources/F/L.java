package F;

import B.C0025m0;
import F1.C0099p;
import O1.C0308a;
import P4.AbstractC0336x;
import P4.i0;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0454n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import p035g0.C0715p;
import p5.EnumC0857w;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1107d;

    public L(C0025m0 c0025m0, W2.c[] cVarArr, boolean z5) {
        this.f1104a = 2;
        this.f1107d = c0025m0;
        this.f1106c = cVarArr;
        boolean z6 = false;
        if (cVarArr != null && z5) {
            z6 = true;
        }
        this.f1105b = z6;
    }

    public static final void a(L l6) {
        ((p080p.x) l6.f1106c).a();
        int i = 0;
        l6.f1105b = false;
        P.d dVar = (P.d) l6.f1107d;
        int i3 = dVar.f4583j;
        if (i3 > 0) {
            Object[] objArr = dVar.f4582h;
            do {
                ((D4.a) objArr[i]).invoke();
                i++;
            } while (i < i3);
        }
        dVar.i();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[LOOP:0: B:5:0x000f->B:19:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[SYNTHETIC] */
    public static final void b(L l6) {
        p080p.x xVar = (p080p.x) l6.f1106c;
        Object[] objArr = xVar.f10797b;
        long[] jArr = xVar.f10796a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i3; i6++) {
                        if ((255 & j4) < 128) {
                            p024e0.r rVar = (p024e0.r) objArr[(i << 3) + i6];
                            rVar.getClass();
                            p024e0.q qVar = (p024e0.q) ((p080p.x) p024e0.d.E(rVar).f1106c).e(rVar);
                            if (qVar == null) {
                                p027e3.a.z0("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            rVar.f8675w = qVar;
                        }
                        j4 >>= 8;
                    }
                    if (i3 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        xVar.a();
        l6.f1105b = false;
        ((P.d) l6.f1107d).i();
    }

    public static String d(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static String k(EnumC0857w enumC0857w, p5.P p6) {
        if (p6 == null) {
            return enumC0857w.name();
        }
        return enumC0857w.name() + "/" + p6.name();
    }

    public static String l(p5.B b6) {
        return b6 instanceof p5.O ? k(EnumC0857w.HANDSHAKE, ((p5.O) b6).u()) : b6.g().name();
    }

    public void c() {
        ((R4.b) this.f1106c).g(new CancellationException("onBack cancelled"), true);
        ((i0) this.f1107d).c(null);
    }

    public void e(X2.a aVar, p060l3.b bVar) {
        IInterface iInterface;
        C0025m0 c0025m0 = (C0025m0) ((C0025m0) this.f1107d).i;
        c0025m0.getClass();
        p010b3.d dVar = (p010b3.d) aVar;
        synchronized (dVar.f7787f) {
            if (dVar.f7793m == 5) {
                throw new DeadObjectException();
            }
            if (!dVar.isConnected()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = dVar.f7790j;
            Z2.n.c("Client is connected but service is null", iInterface);
        }
        p010b3.a aVar2 = (p010b3.a) iInterface;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar2.f7095b);
        int i = p038g3.a.f9179a;
        Z2.h hVar = (Z2.h) c0025m0.i;
        if (hVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            hVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar2.f7094a.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            bVar.f10375a.j();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public p116v3.m f(p132y3.a aVar) {
        p116v3.e eVar;
        String str;
        p116v3.m c0308a;
        int i = 7;
        int i3 = 6;
        int i6 = 5;
        int i7 = 4;
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        Map map = (Map) this.f1106c;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(rawType) != null) {
            throw new ClassCastException();
        }
        p116v3.m nVar = null;
        if (EnumSet.class.isAssignableFrom(rawType)) {
            eVar = new p116v3.e(type, 0);
        } else {
            eVar = rawType == EnumMap.class ? new p116v3.e(type, 1) : null;
        }
        if (eVar != null) {
            return eVar;
        }
        p116v3.d.f((List) this.f1107d);
        if (Modifier.isAbstract(rawType.getModifiers())) {
            c0308a = null;
        } else {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
                p027e3.a aVar2 = p127x3.c.f14144a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e6) {
                    str = "Failed making constructor '" + p127x3.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e6.getMessage() + p127x3.c.e(e6);
                }
                c0308a = str != null ? new C0308a(str, 12) : new C0715p(29, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                c0308a = null;
            }
        }
        if (c0308a != null) {
            return c0308a;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                nVar = new q5.n(3);
            } else if (Set.class.isAssignableFrom(rawType)) {
                nVar = new p085q.b(i7);
            } else {
                nVar = Queue.class.isAssignableFrom(rawType) ? new q5.n(i7) : new p085q.b(i6);
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                nVar = new q5.n(i6);
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                nVar = new p085q.b(i3);
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                nVar = new q5.n(i3);
            } else {
                nVar = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(p132y3.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new q5.n(i) : new p085q.b(i);
            }
        }
        if (nVar != null) {
            return nVar;
        }
        String strD = d(rawType);
        if (strD != null) {
            return new C0308a(strD, 11);
        }
        if (this.f1105b) {
            return new C0715p(28, rawType);
        }
        String str2 = "Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (rawType.getDeclaredConstructors().length == 0) {
            str2 = str2 + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new C0308a(str2, 10);
    }

    public int g() {
        C0071m c0071m = (C0071m) this.f1107d;
        int i = c0071m.f1189b;
        int i3 = c0071m.f1190c;
        if (i < i3) {
            return 2;
        }
        return i > i3 ? 1 : 3;
    }

    public void h() {
        J1.f fVar = (J1.f) this.f1106c;
        C0460u c0460uF = fVar.f();
        if (c0460uF.f7001c != EnumC0454n.i) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0460uF.a(new J1.b(0, fVar));
        J1.e eVar = (J1.e) this.f1107d;
        eVar.getClass();
        if (eVar.f1898b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0460uF.a(new C0099p(1, eVar));
        eVar.f1898b = true;
        this.f1105b = true;
    }

    public void i(Bundle bundle) {
        if (!this.f1105b) {
            h();
        }
        C0460u c0460uF = ((J1.f) this.f1106c).f();
        if (c0460uF.f7001c.compareTo(EnumC0454n.f6993k) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0460uF.f7001c).toString());
        }
        J1.e eVar = (J1.e) this.f1107d;
        if (!eVar.f1898b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (eVar.f1899c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eVar.f1902f = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f1899c = true;
    }

    public void j(Bundle bundle) {
        J1.e eVar = (J1.e) this.f1107d;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) eVar.f1902f;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        p068n.f fVar = (p068n.f) eVar.f1901e;
        fVar.getClass();
        p068n.d dVar = new p068n.d(fVar);
        fVar.f10507j.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((J1.d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void m(K.y yVar) {
        p060l3.d dVar;
        synchronized (this.f1106c) {
            if (((ArrayDeque) this.f1107d) != null && !this.f1105b) {
                this.f1105b = true;
                while (true) {
                    synchronized (this.f1106c) {
                        try {
                            dVar = (p060l3.d) ((ArrayDeque) this.f1107d).poll();
                            if (dVar == null) {
                                this.f1105b = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    synchronized (dVar.f10378b) {
                    }
                    dVar.f10377a.execute(new O1.n(14, (Object) dVar, (Object) yVar, false));
                }
            }
        }
    }

    public String toString() {
        String str;
        switch (this.f1104a) {
            case 0:
                StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
                sb.append(this.f1105b);
                sb.append(", crossed=");
                int iG = g();
                if (iG == 1) {
                    str = "CROSSED";
                } else if (iG != 2) {
                    str = iG != 3 ? "null" : "COLLAPSED";
                } else {
                    str = "NOT_CROSSED";
                }
                sb.append(str);
                sb.append(", info=\n\t");
                sb.append((C0071m) this.f1107d);
                sb.append(')');
                return sb.toString();
            case 6:
                return k((EnumC0857w) this.f1106c, (p5.P) this.f1107d);
            case 7:
                return ((Map) this.f1106c).toString();
            default:
                return super.toString();
        }
    }

    public L(J1.f fVar) {
        this.f1104a = 1;
        this.f1106c = fVar;
        this.f1107d = new J1.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(int i) {
        this(EnumC0857w.CHANGE_CIPHER_SPEC, (p5.P) null, false);
        this.f1104a = i;
        switch (i) {
            case 5:
                this.f1106c = new Object();
                break;
            case 6:
                break;
            default:
                long[] jArr = p080p.C.f10714a;
                this.f1106c = new p080p.x();
                this.f1107d = new P.d(new D4.a[16]);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(p5.P p6) {
        this(EnumC0857w.HANDSHAKE, p6, false);
        this.f1104a = 6;
    }

    public L(Map map, boolean z5, List list) {
        this.f1104a = 7;
        this.f1106c = map;
        this.f1105b = z5;
        this.f1107d = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(p5.P p6, int i) {
        this(EnumC0857w.HANDSHAKE, p6, true);
        this.f1104a = 6;
    }

    public L(EnumC0857w enumC0857w, p5.P p6, boolean z5) {
        this.f1104a = 6;
        this.f1106c = enumC0857w;
        this.f1107d = p6;
        this.f1105b = z5;
    }

    public L(U4.d dVar, boolean z5, D4.e eVar, p018d.i iVar) {
        this.f1104a = 3;
        this.f1105b = z5;
        this.f1106c = R4.i.a(-2, 1, 4);
        this.f1107d = AbstractC0336x.o(dVar, null, new p018d.h(iVar, eVar, this, null), 3);
    }

    public L(boolean z5, C0073o c0073o, C0071m c0071m) {
        this.f1104a = 0;
        this.f1105b = z5;
        this.f1106c = c0073o;
        this.f1107d = c0071m;
    }
}
