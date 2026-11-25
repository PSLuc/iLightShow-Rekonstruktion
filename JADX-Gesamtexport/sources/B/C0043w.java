package B;

import G0.C0110f;
import K.C0120a;
import L.C0188w1;
import N.C0217h0;
import N.C0223k0;
import N.C0248x0;
import N.EnumC0236r0;
import P4.C0319f;
import P4.InterfaceC0318e;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import h5.AbstractC0724b;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.CancellationException;
import p096s.C0921n;
import p113v0.InterfaceC1033p;
import p124x0.AbstractC1098f;

/* JADX INFO: renamed from: B.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0043w extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f463h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0043w(int i, Object obj) {
        super(0);
        this.f463h = i;
        this.i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [D4.a, E4.i] */
    /* JADX WARN: Type inference failed for: r0v18, types: [D4.a, E4.l] */
    /* JADX WARN: Type inference failed for: r4v2, types: [N.O, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object[]] */
    @Override // D4.a
    public final Object invoke() throws IllegalAccessException, IOException, InvocationTargetException {
        Long l6;
        InterfaceC0318e interfaceC0318eT;
        Object[] objArr;
        int i;
        int iK0;
        ArrayList arrayList;
        p084p4.h hVar;
        p084p4.h hVar2;
        boolean z5 = false;
        int i3 = 1;
        switch (this.f463h) {
            case 0:
                return (C0110f) this.i;
            case 1:
                ((p107u.l) this.i).f12638a.setValue(p107u.i.f12636a);
                return p084p4.x.f10867a;
            case 2:
                return ((C0036s0) this.i).d();
            case 3:
                return new W0((p112v.W) this.i, 0.0f);
            case 4:
                S0.i iVar = (S0.i) this.i;
                return new S0.h(S1.h0.c(iVar.f4892a, iVar.f4893b));
            case 5:
                ?? r6 = ((B2.e) this.i).f500c;
                if (r6 != 0 && (l6 = (Long) r6.invoke()) != null) {
                    long jLongValue = l6.longValue();
                    if (jLongValue != -1) {
                        return Long.valueOf(jLongValue);
                    }
                }
                return null;
            case 6:
                Object systemService = ((View) ((D.x) this.i).i).getContext().getSystemService("input_method");
                E4.k.d("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager", systemService);
                return (InputMethodManager) systemService;
            case 7:
                return new BaseInputConnection(((D.D) this.i).f645a, false);
            case 8:
                p126x2.m mVar = p126x2.r.f14095p;
                mVar.getClass();
                mVar.getClass();
                return new BufferedInputStream((E2.b) this.i, ((p126x2.r) p126x2.r.f14094o.n(p126x2.m.f14087a[0], mVar)).f14099d);
            case 9:
                Long l7 = (Long) ((E4.w) this.i).f1074h;
                return Long.valueOf(l7 != null ? l7.longValue() : -1L);
            case 10:
                E.h hVar3 = (E.h) this.i;
                hVar3.I = null;
                AbstractC1098f.n(hVar3);
                AbstractC1098f.m(hVar3);
                AbstractC1098f.l(hVar3);
                return Boolean.TRUE;
            case 11:
                E.k kVar = (E.k) this.i;
                kVar.f895E = null;
                AbstractC1098f.n(kVar);
                AbstractC1098f.m(kVar);
                AbstractC1098f.l(kVar);
                return Boolean.TRUE;
            case 12:
                C0921n c0921n = F.H.f1096a;
                return new p030f0.c(((p030f0.c) ((N.V0) this.i).getValue()).f8837a);
            case 13:
                F1.I i6 = (F1.I) this.i;
                i6.getClass();
                E4.k.f("context", i6.f1270a);
                E4.k.f("navigatorProvider", i6.f1290v);
                return new F1.J();
            case 14:
                return new F1.y((String) this.i);
            case 15:
                return G4.a.i((Context) this.i);
            case 16:
                C0120a c0120a = (C0120a) this.i;
                c0120a.f1956p.setValue(Boolean.valueOf(!((Boolean) c0120a.f1956p.getValue()).booleanValue()));
                return p084p4.x.f10867a;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                C0188w1 c0188w1 = (C0188w1) this.i;
                if (!((Boolean) c0188w1.f2961j.getValue()).booleanValue()) {
                    c0188w1.f2954b.invoke();
                }
                return p084p4.x.f10867a;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return this.i;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                Object systemService2 = ((View) ((C0031p0) this.i).i).getContext().getSystemService("input_method");
                E4.k.d("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager", systemService2);
                return (InputMethodManager) systemService2;
            case 20:
                return new BaseInputConnection(((M0.z) this.i).f3462a, false);
            case 21:
                C0223k0 c0223k0 = (C0223k0) this.i;
                p080p.x xVar = new p080p.x(c0223k0.f3715a.size());
                ArrayList arrayList2 = c0223k0.f3715a;
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ?? N5 = (N.O) arrayList2.get(i7);
                    Object obj = N5.f3639b;
                    int i8 = N5.f3638a;
                    Object n6 = obj != null ? new N.N(Integer.valueOf(i8), N5.f3639b) : Integer.valueOf(i8);
                    int iD = xVar.d(n6);
                    boolean z6 = iD < 0;
                    Object obj2 = z6 ? null : xVar.f10798c[iD];
                    if (obj2 != null) {
                        if (!(obj2 instanceof List) || ((obj2 instanceof F4.a) && !(obj2 instanceof F4.c))) {
                            N5 = p089q4.m.N(obj2, N5);
                        } else {
                            List listB = E4.z.b(obj2);
                            listB.add(N5);
                            N5 = listB;
                        }
                    }
                    if (z6) {
                        int i9 = ~iD;
                        xVar.f10797b[i9] = n6;
                        xVar.f10798c[i9] = N5;
                    } else {
                        xVar.f10798c[iD] = N5;
                    }
                }
                return new N.Z(xVar);
            case 22:
                C0248x0 c0248x0 = (C0248x0) this.i;
                synchronized (c0248x0.f3855b) {
                    interfaceC0318eT = c0248x0.t();
                    if (((EnumC0236r0) c0248x0.f3870r.getValue()).compareTo(EnumC0236r0.i) <= 0) {
                        Throwable th = c0248x0.f3857d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (interfaceC0318eT != null) {
                    ((C0319f) interfaceC0318eT).g(p084p4.x.f10867a);
                }
                return p084p4.x.f10867a;
            case 23:
                Q0.b bVar = (Q0.b) this.i;
                if (((p030f0.f) bVar.f4689c.getValue()).f8851a != 9205357640488583168L) {
                    C0217h0 c0217h0 = bVar.f4689c;
                    if (!p030f0.f.e(((p030f0.f) c0217h0.getValue()).f8851a)) {
                        return bVar.f4687a.b(((p030f0.f) c0217h0.getValue()).f8851a);
                    }
                }
                return null;
            case 24:
                V0.y yVar = (V0.y) this.i;
                InterfaceC1033p parentLayoutCoordinates = yVar.getParentLayoutCoordinates();
                return Boolean.valueOf((((parentLayoutCoordinates == null || !parentLayoutCoordinates.K()) ? null : parentLayoutCoordinates) == null || yVar.m0getPopupContentSizebOM6tXw() == null) ? false : true);
            case 25:
                W.b bVar2 = (W.b) this.i;
                W.l lVar = bVar2.f5515h;
                Object obj3 = bVar2.f5517k;
                if (obj3 != null) {
                    return lVar.d(bVar2, obj3);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 26:
                break;
            case 27:
                return androidx.lifecycle.J.h((androidx.lifecycle.V) this.i);
            case 28:
                p018d.c cVar = (p018d.c) this.i;
                cVar.f7179a = true;
                ?? r7 = cVar.f7181c;
                if (r7 != 0) {
                    r7.invoke();
                }
                return p084p4.x.f10867a;
            default:
                h5.C c6 = i5.d.f9600c;
                ClassLoader classLoader = (ClassLoader) this.i;
                Enumeration<URL> resources = classLoader.getResources("");
                E4.k.e("getResources(\"\")", resources);
                ArrayList list = Collections.list(resources);
                E4.k.e("list(this)", list);
                ArrayList arrayList3 = new ArrayList();
                int size2 = list.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj4 = list.get(i10);
                    i10++;
                    URL url = (URL) obj4;
                    h5.C c7 = i5.d.f9600c;
                    E4.k.e("it", url);
                    if (E4.k.a(url.getProtocol(), "file")) {
                        h5.y yVar2 = h5.r.f9368a;
                        String str = h5.C.i;
                        hVar2 = new p084p4.h(yVar2, W2.g.l(new File(url.toURI())));
                    } else {
                        hVar2 = null;
                    }
                    if (hVar2 != null) {
                        arrayList3.add(hVar2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                E4.k.e("getResources(\"META-INF/MANIFEST.MF\")", resources2);
                ArrayList list2 = Collections.list(resources2);
                E4.k.e("list(this)", list2);
                ArrayList arrayList4 = new ArrayList();
                int size3 = list2.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj5 = list2.get(i11);
                    i11 += i3;
                    URL url2 = (URL) obj5;
                    h5.C c8 = i5.d.f9600c;
                    E4.k.e("it", url2);
                    String string = url2.toString();
                    E4.k.e("toString()", string);
                    if (M4.s.W(string, "jar:file:", z5) && (iK0 = M4.l.k0(6, string, "!")) != -1) {
                        String str2 = h5.C.i;
                        String strSubstring = string.substring(4, iK0);
                        E4.k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
                        h5.C cL = W2.g.l(new File(URI.create(strSubstring)));
                        h5.y yVar3 = h5.r.f9368a;
                        E4.k.f("fileSystem", yVar3);
                        h5.x xVarE = yVar3.e(cL);
                        try {
                            long jC = xVarE.c() - ((long) 22);
                            if (jC < 0) {
                                throw new IOException("not a zip: size=" + xVarE.c());
                            }
                            long jMax = Math.max(jC - 65536, 0L);
                            long j4 = 0;
                            long j6 = jC;
                            while (true) {
                                h5.G gC = AbstractC0724b.c(xVarE.k(j6));
                                try {
                                    if (gC.c() == 101010256) {
                                        int iO = gC.o() & 65535;
                                        int iO2 = gC.o() & 65535;
                                        long jO = gC.o() & 65535;
                                        arrayList = list2;
                                        long j7 = j6;
                                        if (jO != (gC.o() & 65535) || iO != 0 || iO2 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        gC.l(4L);
                                        long jC2 = ((long) gC.c()) & 4294967295L;
                                        int iO3 = gC.o() & 65535;
                                        W1.d dVar = new W1.d(jO, jC2, iO3);
                                        gC.s(iO3);
                                        gC.close();
                                        long j8 = j7 - ((long) 20);
                                        if (j8 > 0) {
                                            h5.G gC2 = AbstractC0724b.c(xVarE.k(j8));
                                            try {
                                                if (gC2.c() == 117853008) {
                                                    int iC = gC2.c();
                                                    long jK = gC2.k();
                                                    if (gC2.c() != 1 || iC != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    h5.G gC3 = AbstractC0724b.c(xVarE.k(jK));
                                                    try {
                                                        int iC2 = gC3.c();
                                                        if (iC2 != 101075792) {
                                                            throw new IOException("bad zip: expected " + i5.b.c(101075792) + " but was " + i5.b.c(iC2));
                                                        }
                                                        gC3.l(12L);
                                                        int iC3 = gC3.c();
                                                        int iC4 = gC3.c();
                                                        long jK2 = gC3.k();
                                                        if (jK2 != gC3.k() || iC3 != 0 || iC4 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        gC3.l(8L);
                                                        W1.d dVar2 = new W1.d(jK2, gC3.k(), iO3);
                                                        gC3.close();
                                                        dVar = dVar2;
                                                    } catch (Throwable th2) {
                                                        try {
                                                            throw th2;
                                                        } catch (Throwable th3) {
                                                            S1.h0.i(gC3, th2);
                                                            throw th3;
                                                        }
                                                    }
                                                }
                                                gC2.close();
                                            } catch (Throwable th4) {
                                                try {
                                                    throw th4;
                                                } catch (Throwable th5) {
                                                    S1.h0.i(gC2, th4);
                                                    throw th5;
                                                }
                                            }
                                        }
                                        W1.d dVar3 = dVar;
                                        long j9 = dVar3.f5561b;
                                        ArrayList arrayList5 = new ArrayList();
                                        h5.G gC4 = AbstractC0724b.c(xVarE.k(j9));
                                        try {
                                            long j10 = dVar3.f5560a;
                                            while (j4 < j10) {
                                                i5.e eVarD = i5.b.d(gC4);
                                                long j11 = j10;
                                                if (eVarD.f9606e >= j9) {
                                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                                }
                                                h5.C c9 = i5.d.f9600c;
                                                if (Z2.f.a(eVarD.f9602a)) {
                                                    arrayList5.add(eVarD);
                                                }
                                                j4++;
                                                j10 = j11;
                                            }
                                            gC4.close();
                                            h5.Q q6 = new h5.Q(cL, yVar3, i5.b.b(arrayList5));
                                            xVarE.close();
                                            hVar = new p084p4.h(q6, i5.d.f9600c);
                                        } catch (Throwable th6) {
                                            try {
                                                throw th6;
                                            } catch (Throwable th7) {
                                                S1.h0.i(gC4, th6);
                                                throw th7;
                                            }
                                        }
                                        try {
                                            throw th;
                                        } catch (Throwable th8) {
                                            S1.h0.i(xVarE, th);
                                            throw th8;
                                        }
                                    }
                                    ArrayList arrayList6 = list2;
                                    long j12 = j6;
                                    gC.close();
                                    j6 = j12 - 1;
                                    if (j6 < jMax) {
                                        throw new IOException("not a zip: end of central directory signature not found");
                                    }
                                    list2 = arrayList6;
                                } catch (Throwable th9) {
                                    gC.close();
                                    throw th9;
                                }
                            }
                        } catch (Throwable th10) {
                            throw th10;
                        }
                    } else {
                        arrayList = list2;
                        hVar = null;
                    }
                    if (hVar != null) {
                        arrayList4.add(hVar);
                    }
                    list2 = arrayList;
                    z5 = false;
                    i3 = 1;
                }
                return p089q4.l.j0(arrayList3, arrayList4);
        }
        do {
            X.x xVar2 = (X.x) this.i;
            synchronized (xVar2.f5746f) {
                try {
                    if (!xVar2.f5743c) {
                        xVar2.f5743c = true;
                        try {
                            P.d dVar4 = xVar2.f5746f;
                            int i12 = dVar4.f4583j;
                            if (i12 > 0) {
                                Object[] objArr2 = dVar4.f4582h;
                                int i13 = 0;
                                while (true) {
                                    X.w wVar = (X.w) objArr2[i13];
                                    p080p.A a6 = wVar.f5736g;
                                    Object[] objArr3 = a6.f10709b;
                                    long[] jArr = a6.f10708a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i14 = 0;
                                        while (true) {
                                            long j13 = jArr[i14];
                                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                                int i16 = 0;
                                                while (i16 < i15) {
                                                    if ((j13 & 255) < 128) {
                                                        wVar.f5730a.invoke(objArr3[(i14 << 3) + i16]);
                                                    }
                                                    j13 >>= 8;
                                                    i16++;
                                                    i13 = i13;
                                                    objArr2 = objArr2;
                                                }
                                                objArr = objArr2;
                                                i = i13;
                                                if (i15 == 8) {
                                                }
                                            } else {
                                                objArr = objArr2;
                                                i = i13;
                                            }
                                            if (i14 != length) {
                                                i14++;
                                                i13 = i;
                                                objArr2 = objArr;
                                            }
                                        }
                                    } else {
                                        objArr = objArr2;
                                        i = i13;
                                    }
                                    a6.b();
                                    i13 = i + 1;
                                    if (i13 < i12) {
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            xVar2.f5743c = false;
                        } catch (Throwable th11) {
                            xVar2.f5743c = false;
                            throw th11;
                        }
                    }
                } catch (Throwable th12) {
                    throw th12;
                }
            }
        } while (X.x.a((X.x) this.i));
        return p084p4.x.f10867a;
    }
}
