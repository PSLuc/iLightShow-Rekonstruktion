package com.google.android.gms.internal.play_billing;

import N.C0208d;
import N.C0227m0;
import N.C0230o;
import N.C0235q0;
import N3.C0253a;
import N3.C0257c;
import P4.AbstractC0336x;
import P4.C0327n;
import android.content.Context;
import android.graphics.Paint;
import android.text.Layout;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.C0495p;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.google.protobuf.AbstractC0640h;
import com.google.protobuf.AbstractC0650s;
import com.google.protobuf.InterfaceC0651t;
import com.google.protobuf.InvalidProtocolBufferException;
import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.ws.WebSocketProtocol;
import p015c2.InterfaceC0472c;
import p058l0.C0822e;
import p058l0.C0823f;
import p113v0.InterfaceC1033p;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0599v0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static C0823f f8008h;
    public static C0823f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static C0823f f8009j;

    public static final String A(String str, C0230o c0230o) {
        E4.k.f("intensity", str);
        c0230o.V(231885334);
        FXOpt fXOpt = FXOpt.INSTANCE;
        if (str.equals(fXOpt.getIntensityMax())) {
            c0230o.V(1018322448);
            String strK = K(R.string.intensity_high, c0230o);
            c0230o.p(false);
            c0230o.p(false);
            return strK;
        }
        if (str.equals(fXOpt.getIntensityNormal())) {
            c0230o.V(1018425678);
            String strK2 = K(R.string.intensity_normal, c0230o);
            c0230o.p(false);
            c0230o.p(false);
            return strK2;
        }
        if (!str.equals(fXOpt.getIntensityChill())) {
            c0230o.V(1018603990);
            c0230o.p(false);
            c0230o.p(false);
            return "";
        }
        c0230o.V(1018529807);
        String strK3 = K(R.string.intensity_chill, c0230o);
        c0230o.p(false);
        c0230o.p(false);
        return strK3;
    }

    public static final Y4.a B(Y4.a aVar) {
        E4.k.f("<this>", aVar);
        return aVar.getDescriptor().i() ? aVar : new c5.X(aVar);
    }

    public static final Object C(E0.h hVar, E0.r rVar) {
        Object obj = hVar.f939h.get(rVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static int D(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 4) {
            return 2;
        }
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 32) {
            return 5;
        }
        if (i3 == 64) {
            return 6;
        }
        if (i3 == 128) {
            return 7;
        }
        if (i3 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(p012c.k.r(i3, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static boolean E(p126x2.s sVar) {
        Boolean bool = (Boolean) p126x2.t.f14110j.get(sVar);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int F(Object obj, com.google.protobuf.S s6, byte[] bArr, int i3, int i6, J2.c cVar) throws InvalidProtocolBufferException {
        int iP = i3 + 1;
        int i7 = bArr[i3];
        if (i7 < 0) {
            iP = p(i7, bArr, iP, cVar);
            i7 = cVar.f1912a;
        }
        int i8 = iP;
        if (i7 < 0 || i7 > i6 - i8) {
            throw InvalidProtocolBufferException.d();
        }
        int i9 = i8 + i7;
        s6.f(obj, bArr, i8, i9, cVar);
        cVar.f1914c = obj;
        return i9;
    }

    public static final Z.o H(Z.o oVar, float f6) {
        return (f6 == 1.0f && f6 == 1.0f) ? oVar : androidx.compose.ui.graphics.a.b(oVar, f6, f6, 0.0f, 0.0f, 0.0f, null, false, 131068);
    }

    public static final Object J(U4.q qVar, U4.q qVar2, D4.e eVar) throws Throwable {
        Object c0327n;
        Object objS;
        try {
            E4.z.d(2, eVar);
            c0327n = eVar.d(qVar2, qVar);
        } catch (Throwable th) {
            c0327n = new C0327n(th, false);
        }
        v4.a aVar = v4.a.f13292h;
        if (c0327n == aVar || (objS = qVar.S(c0327n)) == AbstractC0336x.f4676e) {
            return aVar;
        }
        if (objS instanceof C0327n) {
            throw ((C0327n) objS).f4664a;
        }
        return AbstractC0336x.t(objS);
    }

    public static final String K(int i3, C0230o c0230o) {
        c0230o.k(AndroidCompositionLocals_androidKt.f6729a);
        return ((Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b)).getResources().getString(i3);
    }

    public static final String L(int i3, Object[] objArr, C0230o c0230o) {
        c0230o.k(AndroidCompositionLocals_androidKt.f6729a);
        return ((Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b)).getResources().getString(i3, Arrays.copyOf(objArr, objArr.length));
    }

    public static final ExtractedText N(M0.w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f3453a.f1494h;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j4 = wVar.f3454b;
        extractedText.selectionStart = G0.I.e(j4);
        extractedText.selectionEnd = G0.I.d(j4);
        extractedText.flags = !M4.l.Z(wVar.f3453a.f1494h, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final p030f0.d O(InterfaceC1033p interfaceC1033p) {
        p030f0.d dVarE = p113v0.U.e(interfaceC1033p);
        long jE = interfaceC1033p.e(p081p0.c.y(dVarE.f8839a, dVarE.f8840b));
        long jE2 = interfaceC1033p.e(p081p0.c.y(dVarE.f8841c, dVarE.f8842d));
        return new p030f0.d(p030f0.c.d(jE), p030f0.c.e(jE), p030f0.c.d(jE2), p030f0.c.e(jE2));
    }

    public static void P(Object[] objArr, int i3) {
        for (int i6 = 0; i6 < i3; i6++) {
            if (objArr[i6] == null) {
                throw new NullPointerException(p012c.k.r(i6, "at index "));
            }
        }
    }

    public static AbstractC0591r0 Q() {
        ClassLoader classLoader = AbstractC0599v0.class.getClassLoader();
        if (AbstractC0591r0.class.equals(AbstractC0591r0.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e6) {
                    throw new IllegalStateException(e6);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new AbstractC0599v0[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e7) {
                    Logger.getLogger(C0590q0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(AbstractC0591r0.class.getSimpleName()), (Throwable) e7);
                }
            }
            if (arrayList.size() == 1) {
                return (AbstractC0591r0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (AbstractC0591r0) AbstractC0591r0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e8) {
                throw new IllegalStateException(e8);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final void b(final D4.a aVar, Z.o oVar, long j4, final V.a aVar2, C0230o c0230o, final int i3, final int i6) {
        int i7;
        Z.o oVar2;
        int i8;
        final Z.o oVar3;
        final long j6;
        E4.k.f("onClick", aVar);
        c0230o.X(103720359);
        if ((i3 & 14) == 0) {
            i7 = i3 | (c0230o.h(aVar) ? 4 : 2);
        } else {
            i7 = i3;
        }
        int i9 = i6 & 2;
        if (i9 != 0) {
            i8 = i7 | 48;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            i8 = i7 | (c0230o.f(oVar2) ? 32 : 16);
        }
        int i10 = i8 | 384;
        if ((i10 & 5851) == 1170 && c0230o.B()) {
            c0230o.P();
            oVar3 = oVar2;
            j6 = j4;
        } else {
            Z.o oVar4 = i9 != 0 ? Z.l.f5957a : oVar2;
            long j7 = p035g0.r.f9084k;
            int i11 = (i10 & WebSocketProtocol.PAYLOAD_SHORT) | 24576;
            Z.o oVar5 = oVar4;
            L.A1.b(aVar, oVar5, false, null, j7, 0L, 0.0f, 0.0f, null, aVar2, c0230o, i11, 1004);
            oVar3 = oVar5;
            j6 = j7;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new D4.e() { // from class: N3.i
                @Override // D4.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    D4.a aVar3 = aVar;
                    E4.k.f("$onClick", aVar3);
                    V.a aVar4 = aVar2;
                    int iV = C0208d.V(i3 | 1);
                    long j8 = j6;
                    AbstractC0599v0.b(aVar3, oVar3, j8, aVar4, (C0230o) obj, iV, i6);
                    return p084p4.x.f10867a;
                }
            };
        }
    }

    public static final void c(int i3, C0230o c0230o) {
        c0230o.X(403842636);
        if (i3 == 0 && c0230o.B()) {
            c0230o.P();
        } else {
            F1.I i6 = (F1.I) c0230o.k(N3.P0.f4083b);
            C0208d.c(p084p4.x.f10867a, new defpackage.d(8), c0230o);
            L.J0.b(null, V.b.c(-689507312, new C0257c(i6, 10), c0230o), null, null, null, 0, 0L, 0L, null, N3.H.f3961c, c0230o, 805306416, 509);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0253a(i3, 7);
        }
    }

    public static final long d(int i3, int i6) {
        if (i3 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i3 + ", end: " + i6 + ']').toString());
        }
        if (i6 >= 0) {
            long j4 = (((long) i6) & 4294967295L) | (((long) i3) << 32);
            int i7 = G0.I.f1469c;
            return j4;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i3 + ", end: " + i6 + ']').toString());
    }

    public static final long e(float f6, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0034 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0053
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(p091r0.y r8, p122w4.a r9) {
        /*
            boolean r0 = r9 instanceof p107u.b
            if (r0 == 0) goto L13
            r0 = r9
            u.b r0 = (p107u.b) r0
            int r1 = r0.f12614m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12614m = r1
            goto L18
        L13:
            u.b r0 = new u.b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f12613l
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f12614m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            r0.y r8 = r0.f12612k
            S1.V.O(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            S1.V.O(r9)
        L34:
            r0.f12612k = r8
            r0.f12614m = r3
            r0.j r9 = p091r0.j.i
            java.lang.Object r9 = r8.b(r9, r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            r0.i r9 = (p091r0.i) r9
            int r2 = r9.f11495b
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.lang.Object r9 = r9.f11494a
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L51:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r9.get(r5)
            r0.q r6 = (p091r0.q) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L34
            boolean r7 = r6.f11515h
            if (r7 != 0) goto L34
            boolean r6 = r6.f11511d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L51
        L6a:
            java.lang.Object r8 = r9.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC0599v0.f(r0.y, w4.a):java.lang.Object");
    }

    public static final long g(Map map, v5.n nVar) {
        Long l6 = (Long) map.get(nVar);
        if (l6 == null) {
            l6 = 0L;
        }
        return l6.longValue();
    }

    public static final long h(int i3, long j4) {
        int i6 = G0.I.f1469c;
        int i7 = (int) (j4 >> 32);
        int iO = p081p0.c.O(i7, 0, i3);
        int i8 = (int) (4294967295L & j4);
        int iO2 = p081p0.c.O(i8, 0, i3);
        return (iO == i7 && iO2 == i8) ? j4 : d(iO, iO2);
    }

    public static String i(p126x2.s sVar, Collection collection) {
        E4.k.f("values", collection);
        Collection collection2 = collection;
        String str = (String) p126x2.t.f14111k.get(sVar);
        if (str == null) {
            str = ", ";
        }
        return p089q4.l.e0(collection2, str, null, null, null, 62);
    }

    public static int j(byte[] bArr, int i3, J2.c cVar) throws InvalidProtocolBufferException {
        int iQ = q(bArr, i3, cVar);
        int i6 = cVar.f1912a;
        if (i6 < 0) {
            throw InvalidProtocolBufferException.b();
        }
        if (i6 > bArr.length - iQ) {
            throw InvalidProtocolBufferException.d();
        }
        if (i6 == 0) {
            cVar.f1914c = AbstractC0640h.i;
            return iQ;
        }
        cVar.f1914c = AbstractC0640h.g(bArr, iQ, i6);
        return iQ + i6;
    }

    public static int k(int i3, byte[] bArr) {
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public static long l(int i3, byte[] bArr) {
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    public static int m(com.google.protobuf.S s6, int i3, byte[] bArr, int i6, int i7, InterfaceC0651t interfaceC0651t, J2.c cVar) throws InvalidProtocolBufferException {
        com.google.protobuf.r rVarD = s6.d();
        com.google.protobuf.S s7 = s6;
        byte[] bArr2 = bArr;
        int i8 = i7;
        J2.c cVar2 = cVar;
        int iF = F(rVarD, s7, bArr2, i6, i8, cVar2);
        s7.b(rVarD);
        cVar2.f1914c = rVarD;
        interfaceC0651t.add(rVarD);
        while (iF < i8) {
            J2.c cVar3 = cVar2;
            int i9 = i8;
            int iQ = q(bArr2, iF, cVar3);
            if (i3 != cVar3.f1912a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.protobuf.S s8 = s7;
            com.google.protobuf.r rVarD2 = s8.d();
            iF = F(rVarD2, s8, bArr3, iQ, i9, cVar3);
            s7 = s8;
            bArr2 = bArr3;
            i8 = i9;
            cVar2 = cVar3;
            s7.b(rVarD2);
            cVar2.f1914c = rVarD2;
            interfaceC0651t.add(rVarD2);
        }
        return iF;
    }

    public static int n(int i3, byte[] bArr, int i6, int i7, com.google.protobuf.V v6, J2.c cVar) throws InvalidProtocolBufferException {
        if ((i3 >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i8 = i3 & 7;
        if (i8 == 0) {
            int iS = s(bArr, i6, cVar);
            v6.c(i3, Long.valueOf(cVar.f1913b));
            return iS;
        }
        if (i8 == 1) {
            v6.c(i3, Long.valueOf(l(i6, bArr)));
            return i6 + 8;
        }
        if (i8 == 2) {
            int iQ = q(bArr, i6, cVar);
            int i9 = cVar.f1912a;
            if (i9 < 0) {
                throw InvalidProtocolBufferException.b();
            }
            if (i9 > bArr.length - iQ) {
                throw InvalidProtocolBufferException.d();
            }
            if (i9 == 0) {
                v6.c(i3, AbstractC0640h.i);
            } else {
                v6.c(i3, AbstractC0640h.g(bArr, iQ, i9));
            }
            return iQ + i9;
        }
        if (i8 != 3) {
            if (i8 != 5) {
                throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
            }
            v6.c(i3, Integer.valueOf(k(i6, bArr)));
            return i6 + 4;
        }
        com.google.protobuf.V vB = com.google.protobuf.V.b();
        int i10 = (i3 & (-8)) | 4;
        int i11 = 0;
        while (i6 < i7) {
            int iQ2 = q(bArr, i6, cVar);
            int i12 = cVar.f1912a;
            if (i12 == i10) {
                i11 = i12;
                i6 = iQ2;
                break;
            }
            i6 = n(i12, bArr, iQ2, i7, vB, cVar);
            i11 = i12;
        }
        if (i6 > i7 || i11 != i10) {
            throw InvalidProtocolBufferException.c();
        }
        v6.c(i3, vB);
        return i6;
    }

    public static int p(int i3, byte[] bArr, int i6, J2.c cVar) {
        int i7 = i3 & 127;
        int i8 = i6 + 1;
        byte b6 = bArr[i6];
        if (b6 >= 0) {
            cVar.f1912a = i7 | (b6 << 7);
            return i8;
        }
        int i9 = i7 | ((b6 & 127) << 7);
        int i10 = i6 + 2;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            cVar.f1912a = i9 | (b7 << 14);
            return i10;
        }
        int i11 = i9 | ((b7 & 127) << 14);
        int i12 = i6 + 3;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            cVar.f1912a = i11 | (b8 << 21);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 21);
        int i14 = i6 + 4;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            cVar.f1912a = i13 | (b9 << 28);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 28);
        while (true) {
            int i16 = i14 + 1;
            if (bArr[i14] >= 0) {
                cVar.f1912a = i15;
                return i16;
            }
            i14 = i16;
        }
    }

    public static int q(byte[] bArr, int i3, J2.c cVar) {
        int i6 = i3 + 1;
        byte b6 = bArr[i3];
        if (b6 < 0) {
            return p(b6, bArr, i6, cVar);
        }
        cVar.f1912a = b6;
        return i6;
    }

    public static int r(int i3, byte[] bArr, int i6, int i7, InterfaceC0651t interfaceC0651t, J2.c cVar) {
        AbstractC0650s abstractC0650s = (AbstractC0650s) interfaceC0651t;
        int iQ = q(bArr, i6, cVar);
        abstractC0650s.d(cVar.f1912a);
        while (iQ < i7) {
            int iQ2 = q(bArr, iQ, cVar);
            if (i3 != cVar.f1912a) {
                break;
            }
            iQ = q(bArr, iQ2, cVar);
            abstractC0650s.d(cVar.f1912a);
        }
        return iQ;
    }

    public static int s(byte[] bArr, int i3, J2.c cVar) {
        int i6 = i3 + 1;
        long j4 = bArr[i3];
        if (j4 >= 0) {
            cVar.f1913b = j4;
            return i6;
        }
        int i7 = i3 + 2;
        byte b6 = bArr[i6];
        long j6 = (j4 & 127) | (((long) (b6 & 127)) << 7);
        int i8 = 7;
        while (b6 < 0) {
            int i9 = i7 + 1;
            byte b7 = bArr[i7];
            i8 += 7;
            j6 |= ((long) (b7 & 127)) << i8;
            b6 = b7;
            i7 = i9;
        }
        cVar.f1913b = j6;
        return i7;
    }

    public static p126x2.t v(List list) {
        p126x2.t tVar = new p126x2.t();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p084p4.h hVar = (p084p4.h) it.next();
            String str = (String) hVar.f10849h;
            if (str == null) {
                str = "";
            }
            if (M4.l.i0(str)) {
                str = null;
            }
            if (str != null) {
                Object obj = hVar.i;
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    Collection collection2 = collection.isEmpty() ? null : collection;
                    if (collection2 != null) {
                        Collection collection3 = collection2;
                        ArrayList arrayList = new ArrayList(p089q4.n.P(collection3, 10));
                        Iterator it2 = collection3.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(String.valueOf(it2.next()));
                        }
                        Collection collection4 = (Collection) tVar.get(str);
                        ArrayList arrayList2 = new ArrayList(p089q4.n.P(arrayList, 10));
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj2 = arrayList.get(i3);
                            i3++;
                            arrayList2.add(String.valueOf(obj2));
                        }
                        tVar.put(str, p089q4.l.j0(collection4, arrayList2));
                    }
                } else {
                    String string = obj.toString();
                    E4.k.f("value", string);
                    Map map = p126x2.t.i;
                    boolean zE = E(new p126x2.s(str));
                    if (zE) {
                        String string2 = string.toString();
                        E4.k.f("value", string2);
                        tVar.put(str, com.fasterxml.jackson.databind.deser.std.d0.v(string2));
                    } else {
                        if (zE) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tVar.put(str, p089q4.l.k0((Collection) tVar.get(str), string.toString()));
                    }
                }
            }
        }
        return tVar;
    }

    public static p126x2.t w(Map map) {
        E4.k.f("source", map);
        Set<Map.Entry> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(p089q4.n.P(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new p084p4.h(entry.getKey(), entry.getValue()));
        }
        return v(arrayList);
    }

    public static final C0823f x() {
        C0823f c0823f = f8008h;
        if (c0823f != null) {
            return c0823f;
        }
        C0822e c0822e = new C0822e("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i3 = p058l0.G.f10217a;
        p035g0.O o6 = new p035g0.O(p035g0.r.f9076b);
        C0227m0 c0227m0 = new C0227m0(2);
        c0227m0.i(19.0f, 13.0f);
        c0227m0.f(-6.0f);
        c0227m0.n(6.0f);
        c0227m0.f(-2.0f);
        c0227m0.n(-6.0f);
        c0227m0.e(5.0f);
        c0227m0.n(-2.0f);
        c0227m0.f(6.0f);
        c0227m0.m(5.0f);
        c0227m0.f(2.0f);
        c0227m0.n(6.0f);
        c0227m0.f(6.0f);
        c0227m0.n(2.0f);
        c0227m0.b();
        C0822e.a(c0822e, c0227m0.f3729h, o6);
        C0823f c0823fB = c0822e.b();
        f8008h = c0823fB;
        return c0823fB;
    }

    public static final float y(Layout layout, int i3, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i3);
        H0.x xVar = H0.z.f1745a;
        if (layout.getEllipsisCount(i3) <= 0 || layout.getParagraphDirection(i3) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment == null ? -1 : J0.d.f1871a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float z(Layout layout, int i3, Paint paint) {
        float width;
        float width2;
        H0.x xVar = H0.z.f1745a;
        if (layout.getEllipsisCount(i3) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i3) != -1 || layout.getWidth() >= layout.getLineRight(i3)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i3) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment != null ? J0.d.f1871a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public abstract AbstractC0599v0 G(Class cls, p015c2.o oVar);

    public abstract p015c2.o I(Class cls);

    public abstract void M(R3.m mVar);

    public abstract String o(byte[] bArr, int i3, int i6);

    public abstract int t(int i3, int i6, String str, byte[] bArr);

    public C0495p u(p015c2.h hVar, p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        p015c2.o oVarH0 = e6.h0(hVar, interfaceC0472c);
        return new C0495p(oVarH0, 22, G(hVar.f7281k, oVarH0));
    }
}
