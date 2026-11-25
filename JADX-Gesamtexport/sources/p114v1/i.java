package p114v1;

import E4.k;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.AbstractC0436v;
import androidx.datastore.preferences.protobuf.AbstractC0438x;
import androidx.datastore.preferences.protobuf.C0422g;
import androidx.datastore.preferences.protobuf.C0427l;
import androidx.datastore.preferences.protobuf.InterfaceC0437w;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.spotify.protocol.types.MotionState;
import h5.C0731i;
import h5.E;
import h5.F;
import h5.G;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import p089q4.l;
import p089q4.z;
import p096s.AbstractC0916i;
import p108u1.c;
import p108u1.e;
import p108u1.f;
import p108u1.g;
import p108u1.h;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f13215a = new i();

    public final b a(G g6) throws CorruptionException {
        byte[] bArr;
        try {
            e eVarO = e.o(new C0731i(g6, 1));
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            k.f("pairs", fVarArr);
            bVar.b();
            if (fVarArr.length > 0) {
                f fVar = fVarArr[0];
                throw null;
            }
            Map mapM = eVarO.m();
            k.e("preferencesProto.preferencesMap", mapM);
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                p108u1.i iVar = (p108u1.i) entry.getValue();
                k.e("name", str);
                k.e("value", iVar);
                int iC = iVar.C();
                switch (iC == 0 ? -1 : h.f13214a[AbstractC0916i.d(iC)]) {
                    case MotionState.UNKNOWN /* -1 */:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        bVar.d(new e(str), Boolean.valueOf(iVar.t()));
                        break;
                    case 2:
                        bVar.d(new e(str), Float.valueOf(iVar.x()));
                        break;
                    case 3:
                        bVar.d(new e(str), Double.valueOf(iVar.w()));
                        break;
                    case 4:
                        bVar.d(new e(str), Integer.valueOf(iVar.y()));
                        break;
                    case 5:
                        bVar.d(new e(str), Long.valueOf(iVar.z()));
                        break;
                    case 6:
                        e eVar = new e(str);
                        String strA = iVar.A();
                        k.e("value.string", strA);
                        bVar.d(eVar, strA);
                        break;
                    case 7:
                        e eVar2 = new e(str);
                        InterfaceC0437w interfaceC0437wN = iVar.B().n();
                        k.e("value.stringSet.stringsList", interfaceC0437wN);
                        bVar.d(eVar2, l.x0(interfaceC0437wN));
                        break;
                    case 8:
                        e eVar3 = new e(str);
                        C0422g c0422gU = iVar.u();
                        int size = c0422gU.size();
                        if (size == 0) {
                            bArr = AbstractC0438x.f6927b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c0422gU.i(size, bArr2);
                            bArr = bArr2;
                        }
                        k.e("value.bytes.toByteArray()", bArr);
                        bVar.d(eVar3, bArr);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new b(z.Y(bVar.a()), true);
        } catch (InvalidProtocolBufferException e6) {
            throw new CorruptionException("Unable to parse preferences proto.", e6);
        }
    }

    public final void b(Object obj, F f6) throws IOException {
        AbstractC0436v abstractC0436vA;
        Map mapA = ((b) obj).a();
        c cVarN = e.n();
        for (Map.Entry entry : mapA.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f13210a;
            if (value instanceof Boolean) {
                h hVarD = p108u1.i.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarD.c();
                p108u1.i.q((p108u1.i) hVarD.i, zBooleanValue);
                abstractC0436vA = hVarD.a();
            } else if (value instanceof Float) {
                h hVarD2 = p108u1.i.D();
                float fFloatValue = ((Number) value).floatValue();
                hVarD2.c();
                p108u1.i.r((p108u1.i) hVarD2.i, fFloatValue);
                abstractC0436vA = hVarD2.a();
            } else if (value instanceof Double) {
                h hVarD3 = p108u1.i.D();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarD3.c();
                p108u1.i.o((p108u1.i) hVarD3.i, dDoubleValue);
                abstractC0436vA = hVarD3.a();
            } else if (value instanceof Integer) {
                h hVarD4 = p108u1.i.D();
                int iIntValue = ((Number) value).intValue();
                hVarD4.c();
                p108u1.i.s((p108u1.i) hVarD4.i, iIntValue);
                abstractC0436vA = hVarD4.a();
            } else if (value instanceof Long) {
                h hVarD5 = p108u1.i.D();
                long jLongValue = ((Number) value).longValue();
                hVarD5.c();
                p108u1.i.l((p108u1.i) hVarD5.i, jLongValue);
                abstractC0436vA = hVarD5.a();
            } else if (value instanceof String) {
                h hVarD6 = p108u1.i.D();
                hVarD6.c();
                p108u1.i.m((p108u1.i) hVarD6.i, (String) value);
                abstractC0436vA = hVarD6.a();
            } else if (value instanceof Set) {
                h hVarD7 = p108u1.i.D();
                f fVarO = g.o();
                k.d("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>", value);
                fVarO.c();
                g.l((g) fVarO.i, (Set) value);
                hVarD7.c();
                p108u1.i.n((p108u1.i) hVarD7.i, (g) fVarO.a());
                abstractC0436vA = hVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                h hVarD8 = p108u1.i.D();
                byte[] bArr = (byte[]) value;
                C0422g c0422g = C0422g.f6857j;
                C0422g c0422gG = C0422g.g(bArr, 0, bArr.length);
                hVarD8.c();
                p108u1.i.p((p108u1.i) hVarD8.i, c0422gG);
                abstractC0436vA = hVarD8.a();
            }
            cVarN.getClass();
            cVarN.c();
            e.l((e) cVarN.i).put(str, (p108u1.i) abstractC0436vA);
        }
        e eVar2 = (e) cVarN.a();
        E e6 = new E(f6);
        int iA = eVar2.a(null);
        Logger logger = C0427l.f6888r;
        if (iA > 4096) {
            iA = 4096;
        }
        C0427l c0427l = new C0427l(e6, iA);
        eVar2.b(c0427l);
        if (c0427l.f6893p > 0) {
            c0427l.X();
        }
    }
}
