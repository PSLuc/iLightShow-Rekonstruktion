package p020d2;

import B.C0025m0;
import B.C0031p0;
import D.x;
import D4.a;
import D4.c;
import E0.h;
import E4.k;
import F.K;
import F1.I;
import G0.C;
import G0.D;
import G0.J;
import G0.t;
import G0.u;
import J1.f;
import L.AbstractC0190x0;
import L.J0;
import L.e2;
import L0.j;
import N.C0208d;
import N.C0222k;
import N.C0227m0;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0225l0;
import N3.C0272j0;
import N3.C0273k;
import N3.C0293u0;
import N3.P0;
import R0.l;
import R0.o;
import R0.p;
import R0.q;
import S1.V;
import S1.h0;
import W.i;
import W.m;
import W2.g;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.view.View;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.github.kittinunf.fuel.core.FuelError;
import com.google.android.gms.internal.play_billing.C0549a0;
import com.google.android.gms.internal.play_billing.N;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.sdk.android.auth.LoginActivity;
import defpackage.d;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.ws.WebSocketProtocol;
import p035g0.H;
import p035g0.L;
import p035g0.M;
import p035g0.O;
import p035g0.r;
import p044i0.e;
import p058l0.C0822e;
import p058l0.C0823f;
import p058l0.G;
import p059l2.b;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.T;
import p123x.U;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p124x0.InterfaceC1104l;
import p124x0.m0;
import p126x2.A;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static C0823f f8585h;
    public static C0823f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static C0823f f8586j;

    public static final int A(int i3, int i6) {
        return (i3 >> i6) & 31;
    }

    public static MappedByteBuffer E(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final Object H(Object[] objArr, x xVar, a aVar, C0230o c0230o, int i3, int i6) {
        Object[] objArr2;
        Object obj;
        Object objB;
        if ((i6 & 2) != 0) {
            xVar = m.f5538a;
        }
        x xVar2 = xVar;
        int i7 = c0230o.f3744P;
        V.t(36);
        String string = Integer.toString(i7, 36);
        k.e("toString(this, checkRadix(radix))", string);
        k.d("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>", xVar2);
        i iVar = (i) c0230o.k(W.k.f5537a);
        Object objK = c0230o.K();
        Object obj2 = C0222k.f3714a;
        if (objK == obj2) {
            Object objInvoke = (iVar == null || (objB = iVar.b(string)) == null) ? null : ((c) xVar2.f707j).invoke(objB);
            if (objInvoke == null) {
                objInvoke = aVar.invoke();
            }
            objArr2 = objArr;
            Object bVar = new W.b(xVar2, iVar, string, objInvoke, objArr2);
            c0230o.f0(bVar);
            objK = bVar;
        } else {
            objArr2 = objArr;
        }
        W.b bVar2 = (W.b) objK;
        Object objInvoke2 = Arrays.equals(objArr2, bVar2.f5518l) ? bVar2.f5517k : null;
        if (objInvoke2 == null) {
            objInvoke2 = aVar.invoke();
        }
        boolean zH = c0230o.h(bVar2) | c0230o.h(xVar2) | c0230o.h(iVar) | c0230o.f(string) | c0230o.h(objInvoke2) | c0230o.h(objArr2);
        Object objK2 = c0230o.K();
        if (zH || objK2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke2;
            Object aVar2 = new W.a(bVar2, xVar2, iVar, string, obj, objArr3);
            c0230o.f0(aVar2);
            objK2 = aVar2;
        } else {
            obj = objInvoke2;
        }
        C0208d.g((a) objK2, c0230o);
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0174  */
    /* JADX WARN: Code duplicated, block: B:105:0x0176  */
    /* JADX WARN: Code duplicated, block: B:108:0x017b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0161  */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    public static final J I(J j4, S0.k kVar) {
        R0.a aVar;
        R0.n nVar;
        L0.k kVar2;
        int i3;
        int i6;
        long j6;
        p pVar;
        int i7;
        int i8;
        int i9;
        q qVar;
        C c6 = j4.f1472a;
        R0.n nVar2 = D.f1446d;
        R0.n nVar3 = c6.f1428a;
        if (nVar3.equals(l.f4751a)) {
            nVar3 = D.f1446d;
        }
        R0.n nVar4 = nVar3;
        long j7 = c6.f1429b;
        if (d0.u(j7)) {
            j7 = D.f1443a;
        }
        long j8 = j7;
        L0.k kVar3 = c6.f1430c;
        if (kVar3 == null) {
            kVar3 = L0.k.f3025j;
        }
        L0.k kVar4 = kVar3;
        L0.i iVar = c6.f1431d;
        L0.i iVar2 = new L0.i(iVar != null ? iVar.f3023a : 0);
        j jVar = c6.f1432e;
        j jVar2 = new j(jVar != null ? jVar.f3024a : 1);
        L0.p pVar2 = c6.f1433f;
        if (pVar2 == null) {
            pVar2 = L0.p.f3031a;
        }
        L0.p pVar3 = pVar2;
        String str = c6.f1434g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j9 = c6.f1435h;
        if (d0.u(j9)) {
            j9 = D.f1444b;
        }
        R0.a aVar2 = c6.i;
        R0.a aVar3 = new R0.a(aVar2 != null ? aVar2.f4730a : 0.0f);
        o oVar = c6.f1436j;
        if (oVar == null) {
            oVar = o.f4753c;
        }
        o oVar2 = oVar;
        N0.b bVar = c6.f1437k;
        if (bVar == null) {
            N0.b bVar2 = N0.b.f3877j;
            C0031p0 c0031p0 = N0.c.f3879a;
            c0031p0.getClass();
            i3 = 1;
            LocaleList localeList = LocaleList.getDefault();
            aVar = aVar3;
            synchronized (((g) c0031p0.f395k)) {
                nVar = nVar4;
                try {
                    N0.b bVar3 = (N0.b) c0031p0.f394j;
                    if (bVar3 == null || localeList != ((LocaleList) c0031p0.i)) {
                        int size = localeList.size();
                        ArrayList arrayList = new ArrayList(size);
                        int i10 = 0;
                        while (i10 < size) {
                            arrayList.add(new N0.a(localeList.get(i10)));
                            i10++;
                            size = size;
                            kVar4 = kVar4;
                        }
                        kVar2 = kVar4;
                        N0.b bVar4 = new N0.b(arrayList);
                        c0031p0.i = localeList;
                        c0031p0.f394j = bVar4;
                        bVar = bVar4;
                    } else {
                        kVar2 = kVar4;
                        bVar = bVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            aVar = aVar3;
            nVar = nVar4;
            kVar2 = kVar4;
            i3 = 1;
        }
        long j10 = c6.f1438l;
        if (j10 == 16) {
            j10 = D.f1445c;
        }
        R0.j jVar3 = c6.f1439m;
        if (jVar3 == null) {
            jVar3 = R0.j.f4746b;
        }
        L l6 = c6.f1440n;
        if (l6 == null) {
            l6 = L.f9034d;
        }
        e eVar = c6.f1442p;
        if (eVar == null) {
            eVar = p044i0.g.f9389a;
        }
        C c7 = new C(nVar, j8, kVar2, iVar2, jVar2, pVar3, str2, j9, aVar, oVar2, bVar, j10, jVar3, l6, c6.f1441o, eVar);
        int i11 = u.f1546b;
        t tVar = j4.f1473b;
        int i12 = tVar.f1537a;
        int i13 = 5;
        if (i12 == Integer.MIN_VALUE) {
            i12 = 5;
        }
        int i14 = tVar.f1538b;
        if (i14 != 3) {
            i6 = i3;
            if (i14 == Integer.MIN_VALUE) {
                int iOrdinal = kVar.ordinal();
                if (iOrdinal == 0) {
                    i14 = i6;
                } else {
                    if (iOrdinal != i6) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = 2;
                }
            }
            j6 = tVar.f1539c;
            if (d0.u(j6)) {
                j6 = u.f1545a;
            }
            pVar = tVar.f1540d;
            if (pVar == null) {
                pVar = p.f4756c;
            }
            i7 = tVar.f1543g;
            if (i7 == 0) {
                i7 = R0.e.f4735b;
            }
            int i15 = i7;
            i8 = tVar.f1544h;
            if (i8 == Integer.MIN_VALUE) {
                i9 = i6;
            } else {
                i9 = i8;
            }
            qVar = tVar.i;
            if (qVar == null) {
                qVar = q.f4759c;
            }
            return new J(c7, new t(i12, i14, j6, pVar, tVar.f1541e, tVar.f1542f, i15, i9, qVar), j4.f1474c);
        }
        int iOrdinal2 = kVar.ordinal();
        if (iOrdinal2 != 0) {
            i6 = i3;
            if (iOrdinal2 != i6) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i6 = i3;
            i13 = 4;
        }
        i14 = i13;
        j6 = tVar.f1539c;
        if (d0.u(j6)) {
            j6 = u.f1545a;
        }
        pVar = tVar.f1540d;
        if (pVar == null) {
            pVar = p.f4756c;
        }
        i7 = tVar.f1543g;
        if (i7 == 0) {
            i7 = R0.e.f4735b;
        }
        int i16 = i7;
        i8 = tVar.f1544h;
        if (i8 == Integer.MIN_VALUE) {
            i9 = i6;
        } else {
            i9 = i8;
        }
        qVar = tVar.i;
        if (qVar == null) {
            qVar = q.f4759c;
        }
        return new J(c7, new t(i12, i14, j6, pVar, tVar.f1541e, tVar.f1542f, i16, i9, qVar), j4.f1474c);
    }

    public static final void L(O.D d6, int i3, int i6) {
        int i7 = 1 << i3;
        int i8 = d6.f4347p;
        if ((i8 & i7) == 0) {
            d6.f4347p = i7 | i8;
            d6.f4343l[(d6.f4344m - d6.K0().f4339a) + i3] = i6;
        } else {
            C0208d.T("Already pushed argument " + d6.K0().b(i3));
            throw null;
        }
    }

    public static final void M(O.D d6, int i3, Object obj) {
        int i6 = 1 << i3;
        int i7 = d6.f4348q;
        if ((i7 & i6) == 0) {
            d6.f4348q = i6 | i7;
            d6.f4345n[(d6.f4346o - d6.K0().f4340b) + i3] = obj;
        } else {
            C0208d.T("Already pushed argument " + d6.K0().c(i3));
            throw null;
        }
    }

    public static Z.o N(Z.o oVar, float f6, M m6, int i3) {
        boolean z5;
        if ((i3 & 4) != 0) {
            z5 = Float.compare(f6, (float) 0) > 0;
        } else {
            z5 = false;
        }
        long j4 = p035g0.x.f9092a;
        return (Float.compare(f6, (float) 0) > 0 || z5) ? oVar.k(new ShadowGraphicsLayerElement(f6, m6, z5, j4, j4)) : oVar;
    }

    public static final long a(float f6, float f7) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        int i3 = p030f0.a.f8832b;
        return jFloatToRawIntBits;
    }

    public static final long b(int i3) {
        long j4 = (((long) i3) << 32) | (((long) 0) & 4294967295L);
        int i6 = p081p0.a.f10826n;
        return j4;
    }

    public static final void e(D3.j jVar, C0230o c0230o, int i3) {
        c0230o.X(-1003410256);
        I i6 = (I) c0230o.k(P0.f4083b);
        C0208d.c(p084p4.x.f10867a, new d(9), c0230o);
        J0.b(null, V.b.c(1176493420, new C0293u0(jVar, i6, 0), c0230o), null, null, null, 0, 0L, 0L, null, V.b.c(-1728561215, new C0272j0(1, jVar), c0230o), c0230o, 805306416, 509);
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0273k(i3, 2, jVar);
        }
    }

    public static final void f(final String str, boolean z5, a aVar, C0230o c0230o, final int i3) {
        final boolean z6;
        final a aVar2;
        C0230o c0230o2 = c0230o;
        c0230o2.X(1366450304);
        int i6 = i3 | (c0230o2.f(str) ? 4 : 2) | (c0230o2.g(z5) ? 32 : 16) | (c0230o2.h(aVar) ? HueLog.LogComponent.STREAMDTLS : 128);
        if ((i6 & 731) == 146 && c0230o2.B()) {
            c0230o2.P();
            z6 = z5;
            aVar2 = aVar;
        } else {
            Z.l lVar = Z.l.f5957a;
            Z.o oVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f6634a, 0.0f, 4, 0.0f, 0.0f, 13);
            U uA = T.a(AbstractC1078k.f13777a, Z.b.f5942r, c0230o2, 48);
            int i7 = c0230o2.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
            Z.o oVarC = Z.a.c(c0230o2, oVarK);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            c0230o2.Z();
            if (c0230o2.f3743O) {
                c0230o2.l(c1106n);
            } else {
                c0230o2.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o2, uA);
            C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o2.f3743O || !k.a(c0230o2.K(), Integer.valueOf(i7))) {
                p012c.k.y(i7, c0230o2, i7, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o2, oVarC);
            e2.b(str, null, 0L, d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o, (i6 & 14) | 3072, 0, 131062);
            c0230o2 = c0230o;
            AbstractC1070c.b(c0230o2, p123x.V.a(lVar, 1.0f));
            z6 = z5;
            aVar2 = aVar;
            AbstractC0190x0.a(z6, aVar2, null, false, null, null, c0230o2, (i6 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            c0230o2.p(true);
        }
        C0235q0 c0235q0T = c0230o2.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new D4.e(str, z6, aVar2, i3) { // from class: N3.t0

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f4269h;
                public final /* synthetic */ boolean i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ D4.a f4270j;

                @Override // D4.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    String str2 = this.f4269h;
                    E4.k.f("$label", str2);
                    D4.a aVar3 = this.f4270j;
                    int iV = C0208d.V(1);
                    p020d2.n.f(str2, this.i, aVar3, (C0230o) obj, iV);
                    return p084p4.x.f10867a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0066 A[EDGE_INSN: B:40:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    public static final E0.l g(p124x0.D d6, boolean z5) {
        Z.n nVar = (Z.n) d6.f13828C.f3796f;
        InterfaceC1104l interfaceC1104l = null;
        if ((nVar.f5960k & 8) != 0) {
            loop0: while (nVar != null) {
                if ((nVar.f5959j & 8) == 0) {
                    if ((nVar.f5960k & 8) != 0) {
                        break;
                        break;
                    }
                    nVar = nVar.f5962m;
                } else {
                    Z.n nVarE = nVar;
                    P.d dVar = null;
                    while (nVarE != null) {
                        if (nVarE instanceof m0) {
                            interfaceC1104l = nVarE;
                            break loop0;
                        }
                        if ((nVarE.f5959j & 8) != 0 && (nVarE instanceof AbstractC1105m)) {
                            int i3 = 0;
                            for (Z.n nVar2 = ((AbstractC1105m) nVarE).f14046v; nVar2 != null; nVar2 = nVar2.f5962m) {
                                if ((nVar2.f5959j & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        nVarE = nVar2;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new P.d(new Z.n[16]);
                                        }
                                        if (nVarE != null) {
                                            dVar.c(nVarE);
                                            nVarE = null;
                                        }
                                        dVar.c(nVar2);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        nVarE = AbstractC1098f.e(dVar);
                    }
                    if ((nVar.f5960k & 8) != 0) {
                        break;
                    }
                    nVar = nVar.f5962m;
                }
            }
        }
        k.c(interfaceC1104l);
        Z.n nVar3 = ((Z.n) ((m0) interfaceC1104l)).f5958h;
        h hVarN = d6.n();
        k.c(hVarN);
        return new E0.l(nVar3, z5, d6, hVarN);
    }

    public static final void h(Z.o oVar, V.a aVar, C0230o c0230o, int i3) {
        c0230o.X(-2105228848);
        if ((((c0230o.f(oVar) ? 4 : 2) | i3) & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            K k3 = K.f1103a;
            int i6 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            Z.o oVarC = Z.a.c(c0230o, oVar);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, k3);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !k.a(c0230o.K(), Integer.valueOf(i6))) {
                p012c.k.y(i6, c0230o, i6, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            aVar.d(c0230o, 6);
            c0230o.p(true);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new A2.d(i3, 1, oVar, aVar);
        }
    }

    public static final Object[] i(Object[] objArr, int i3, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        p089q4.k.g0(objArr, objArr2, 0, i3, 6);
        p089q4.k.e0(objArr, objArr2, i3 + 2, i3, objArr.length);
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] j(Object[] objArr, int i3) {
        Object[] objArr2 = new Object[objArr.length - 2];
        p089q4.k.g0(objArr, objArr2, 0, i3, 6);
        p089q4.k.e0(objArr, objArr2, i3, i3 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] k(Object[] objArr, int i3) {
        Object[] objArr2 = new Object[objArr.length - 1];
        p089q4.k.g0(objArr, objArr2, 0, i3, 6);
        p089q4.k.e0(objArr, objArr2, i3, i3 + 1, objArr.length);
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int l(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p020d2.n.l(int, int, int, boolean):int");
    }

    public static int n(int i3) {
        return (-(i3 & 1)) ^ (i3 >>> 1);
    }

    public static long o(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public static Object p(A a6, z zVar) throws IllegalAccessException, IOException, InvocationTargetException {
        B2.i iVar;
        k.f(LoginActivity.RESPONSE_KEY, zVar);
        B2.e eVar = zVar.f14139f;
        InputStream inputStream = (InputStream) eVar.f499b.invoke();
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
        eVar.f499b = B2.c.i;
        try {
            Object objDeserialize = a6.deserialize(bufferedInputStream);
            if (objDeserialize == null) {
                objDeserialize = a6.deserialize(new InputStreamReader(bufferedInputStream, M4.a.f3520a));
            }
            if (objDeserialize == null) {
                Long lC = zVar.f14139f.c();
                p058l0.I i3 = new p058l0.I(18, bufferedInputStream);
                if (lC != null) {
                    iVar = new B2.i(1, lC.longValue());
                } else {
                    iVar = null;
                }
                Charset charset = M4.a.f3520a;
                k.f("charset", charset);
                B2.e eVar2 = new B2.e(i3, iVar, charset);
                zVar.f14139f = eVar2;
                objDeserialize = a6.deserialize(eVar2.e());
                if (objDeserialize == null) {
                    objDeserialize = a6.deserialize(new String(zVar.f14139f.e(), charset));
                }
                if (objDeserialize == null) {
                    int i6 = FuelError.i;
                    throw p126x2.g.b(new IllegalStateException("One of deserialize(ByteArray) or deserialize(InputStream) or deserialize(Reader) or deserialize(String) must be implemented"));
                }
            }
            h0.i(bufferedInputStream, null);
            return objDeserialize;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    public static final String q(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final f r(View view) {
        k.f("<this>", view);
        return (f) L4.l.O(L4.l.Q(L4.l.P(view, J1.g.i), J1.g.f1904j));
    }

    public static final Class s(K4.b bVar) {
        k.f("<this>", bVar);
        Class clsA = ((E4.e) bVar).a();
        k.d("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", clsA);
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class t(K4.b bVar) {
        k.f("<this>", bVar);
        Class clsA = ((E4.e) bVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final C0823f u() {
        C0823f c0823f = i;
        if (c0823f != null) {
            return c0823f;
        }
        C0822e c0822e = new C0822e("Filled.Lightbulb", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i3 = G.f10217a;
        O o6 = new O(r.f9076b);
        C0227m0 c0227m0 = new C0227m0(2);
        c0227m0.i(9.0f, 21.0f);
        c0227m0.d(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        c0227m0.f(4.0f);
        c0227m0.d(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        c0227m0.n(-1.0f);
        c0227m0.g(9.0f, 20.0f);
        c0227m0.n(1.0f);
        c0227m0.b();
        c0227m0.i(12.0f, 2.0f);
        c0227m0.c(8.1f, 2.0f, 5.0f, 5.1f, 5.0f, 9.0f);
        c0227m0.d(0.0f, 2.4f, 1.2f, 4.5f, 3.0f, 5.7f);
        c0227m0.g(8.0f, 17.0f);
        c0227m0.d(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        c0227m0.f(6.0f);
        c0227m0.d(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        c0227m0.n(-2.3f);
        c0227m0.d(1.8f, -1.3f, 3.0f, -3.4f, 3.0f, -5.7f);
        c0227m0.d(0.0f, -3.9f, -3.1f, -7.0f, -7.0f, -7.0f);
        c0227m0.b();
        C0822e.a(c0822e, c0227m0.f3729h, o6);
        C0823f c0823fB = c0822e.b();
        i = c0823fB;
        return c0823fB;
    }

    public static final long v() {
        int i3 = r.f9086m;
        return H.d(4294944000L);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c A[LOOP:0: B:4:0x000d->B:37:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x006f A[EDGE_INSN: B:42:0x006f->B:38:0x006f BREAK  A[LOOP:0: B:4:0x000d->B:37:0x006c], SYNTHETIC] */
    public static final m0 w(p124x0.D d6) {
        Z.n nVar = (Z.n) d6.f13828C.f3796f;
        Object obj = null;
        if ((nVar.f5960k & 8) != 0) {
            loop0: while (nVar != null) {
                if ((nVar.f5959j & 8) == 0) {
                    if ((nVar.f5960k & 8) != 0) {
                        break;
                        break;
                    }
                    nVar = nVar.f5962m;
                } else {
                    Z.n nVarE = nVar;
                    P.d dVar = null;
                    while (nVarE != null) {
                        if (nVarE instanceof m0) {
                            if (((m0) nVarE).Z()) {
                                obj = nVarE;
                                break loop0;
                            }
                        } else if ((nVarE.f5959j & 8) != 0 && (nVarE instanceof AbstractC1105m)) {
                            int i3 = 0;
                            for (Z.n nVar2 = ((AbstractC1105m) nVarE).f14046v; nVar2 != null; nVar2 = nVar2.f5962m) {
                                if ((nVar2.f5959j & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        nVarE = nVar2;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new P.d(new Z.n[16]);
                                        }
                                        if (nVarE != null) {
                                            dVar.c(nVarE);
                                            nVarE = null;
                                        }
                                        dVar.c(nVar2);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        nVarE = AbstractC1098f.e(dVar);
                    }
                    if ((nVar.f5960k & 8) != 0) {
                        break;
                    }
                    nVar = nVar.f5962m;
                }
            }
        }
        return (m0) obj;
    }

    public static final byte[] y(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[32];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr[i3] = byteBuffer.get();
        }
        return bArr;
    }

    public abstract boolean B();

    public abstract boolean C();

    public boolean D() {
        return x() != null;
    }

    public abstract Object F(int i3, Intent intent);

    public abstract void G(String str);

    public abstract void J(boolean z5);

    public abstract void K(boolean z5);

    public abstract com.google.android.gms.internal.play_billing.I O(C0549a0 c0549a0);

    public abstract N P(C0549a0 c0549a0);

    public abstract void Q(N n6, N n7);

    public abstract void R(N n6, Thread thread);

    public abstract boolean S(C0549a0 c0549a0, com.google.android.gms.internal.play_billing.I i3, com.google.android.gms.internal.play_billing.I i6);

    public abstract boolean T(com.google.android.gms.internal.play_billing.O o6, Object obj, Object obj2);

    public abstract boolean U(com.google.android.gms.internal.play_billing.O o6, N n6, N n7);

    public abstract Intent m(Context context, Object obj);

    public abstract p015c2.h x();

    public C0025m0 z(Context context, Object obj) {
        k.f("context", context);
        return null;
    }
}
