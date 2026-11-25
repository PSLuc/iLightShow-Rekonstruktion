package p032f2;

import A0.b;
import B.C0031p0;
import S1.C0340b;
import S1.EnumC0348j;
import S1.N;
import S1.V;
import S1.b0;
import c5.C0495p;
import com.fasterxml.jackson.databind.deser.std.C0505a;
import com.fasterxml.jackson.databind.deser.std.C0513i;
import com.fasterxml.jackson.databind.deser.std.C0521q;
import com.fasterxml.jackson.databind.deser.std.f0;
import com.fasterxml.jackson.databind.deser.std.o0;
import com.fasterxml.jackson.databind.deser.std.q0;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import p015c2.A;
import p015c2.AbstractC0473d;
import p015c2.B;
import p015c2.C0474e;
import p015c2.f;
import p015c2.h;
import p015c2.j;
import p015c2.r;
import p015c2.z;
import p026e2.g;
import p026e2.k;
import p037g2.C0720d;
import p037g2.C0721e;
import p046i2.AbstractC0771g;
import p046i2.C0766b;
import p046i2.C0767c;
import p046i2.C0772h;
import p046i2.C0776l;
import p046i2.H;
import p046i2.L;
import p046i2.m;
import p046i2.q;
import p046i2.t;
import p050j2.a;
import p071n2.d;
import p104t2.e;
import p109u2.C0965d;
import p109u2.i;
import p109u2.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends AbstractC0473d implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f8878j;

    static {
        new A("@JsonUnwrapped", null);
    }

    public c(k kVar) {
        this.f8878j = kVar;
    }

    public static boolean d0(B b6, m mVar, t tVar) {
        String name;
        if ((tVar == null || !tVar.z()) && b6.p(mVar.x(0)) == null) {
            return (tVar == null || (name = tVar.getName()) == null || name.isEmpty() || !tVar.g()) ? false : true;
        }
        return true;
    }

    public static void f0(C0721e c0721e, m mVar, boolean z5, boolean z6) {
        Class clsA = mVar.A(0);
        if (clsA == String.class || clsA == CharSequence.class) {
            if (z5 || z6) {
                c0721e.e(mVar, 1, z5);
                return;
            }
            return;
        }
        if (clsA == Integer.TYPE || clsA == Integer.class) {
            if (z5 || z6) {
                c0721e.e(mVar, 2, z5);
                return;
            }
            return;
        }
        if (clsA == Long.TYPE || clsA == Long.class) {
            if (z5 || z6) {
                c0721e.e(mVar, 3, z5);
                return;
            }
            return;
        }
        if (clsA == Double.TYPE || clsA == Double.class) {
            if (z5 || z6) {
                c0721e.e(mVar, 5, z5);
                return;
            }
            return;
        }
        if (clsA == Boolean.TYPE || clsA == Boolean.class) {
            if (z5 || z6) {
                c0721e.e(mVar, 7, z5);
                return;
            }
            return;
        }
        if (clsA == BigInteger.class && (z5 || z6)) {
            c0721e.e(mVar, 4, z5);
        }
        if (clsA == BigDecimal.class && (z5 || z6)) {
            c0721e.e(mVar, 6, z5);
        }
        if (z5) {
            c0721e.b(mVar, z5, null, 0);
        }
    }

    public static boolean g0(f fVar, m mVar) {
        EnumC0348j enumC0348jE = fVar.f7249l.d().e(fVar.f7249l, mVar);
        return (enumC0348jE == null || enumC0348jE == EnumC0348j.f4952k) ? false : true;
    }

    public static p109u2.m i0(Class cls, C0474e c0474e, AbstractC0771g abstractC0771g) {
        if (abstractC0771g != null) {
            c0474e.getClass();
            if (c0474e.k(r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                i.e(abstractC0771g.p(), c0474e.k(r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            B bD = c0474e.d();
            boolean zK = c0474e.k(r.ACCEPT_CASE_INSENSITIVE_ENUMS);
            Enum[] enumArrA = p109u2.m.a(cls);
            HashMap map = new HashMap();
            int length = enumArrA.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                Enum r6 = enumArrA[length];
                try {
                    Object objQ = abstractC0771g.q(r6);
                    if (objQ != null) {
                        map.put(objQ.toString(), r6);
                    }
                } catch (Exception e6) {
                    throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + r6 + ": " + e6.getMessage());
                }
            }
            Enum enumG = bD.g(cls);
            Class clsG = abstractC0771g.g();
            if (clsG.isPrimitive()) {
                clsG = i.G(clsG);
            }
            return new p109u2.m(cls, enumArrA, map, enumG, zK, clsG == Long.class || clsG == Integer.class || clsG == Short.class || clsG == Byte.class);
        }
        B bD2 = c0474e.d();
        boolean zK2 = c0474e.k(r.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum[] enumArrA2 = p109u2.m.a(cls);
        String[] strArrL = bD2.l(cls, enumArrA2, new String[enumArrA2.length]);
        String[][] strArr = new String[strArrL.length][];
        bD2.k(cls, enumArrA2, strArr);
        HashMap map2 = new HashMap();
        int length2 = enumArrA2.length;
        for (int i = 0; i < length2; i++) {
            Enum r7 = enumArrA2[i];
            String strName = strArrL[i];
            if (strName == null) {
                strName = r7.name();
            }
            map2.put(strName, r7);
            String[] strArr2 = strArr[i];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!map2.containsKey(str)) {
                        map2.put(str, r7);
                    }
                }
            }
        }
        return new p109u2.m(cls, enumArrA2, map2, bD2.g(cls), zK2, false);
    }

    public static j k0(f fVar, q qVar) {
        Object objJ = fVar.f7249l.d().j(qVar);
        if (objJ != null) {
            return fVar.c0(objJ);
        }
        return null;
    }

    public static p015c2.q l0(f fVar, q qVar) {
        Object objR = fVar.f7249l.d().r(qVar);
        if (objR != null) {
            return fVar.C0(objR);
        }
        return null;
    }

    public final void a0(f fVar, p046i2.r rVar, C0721e c0721e, C0720d c0720d, g gVar) throws InvalidDefinitionException {
        int i = 0;
        C0031p0[] c0031p0Arr = c0720d.f9124d;
        int i3 = c0720d.f9123c;
        if (1 != i3) {
            gVar.getClass();
            int i6 = -1;
            int i7 = -1;
            while (true) {
                if (i >= i3) {
                    i6 = i7;
                    break;
                }
                if (((C0340b) c0031p0Arr[i].f395k) == null) {
                    if (i7 >= 0) {
                        break;
                    } else {
                        i7 = i;
                    }
                }
                i++;
            }
            if (i6 < 0 || c0720d.c(i6) != null) {
                c0(fVar, rVar, c0721e, c0720d);
                return;
            } else {
                b0(fVar, rVar, c0721e, c0720d);
                return;
            }
        }
        C0031p0 c0031p0 = c0031p0Arr[0];
        C0776l c0776l = (C0776l) c0031p0.i;
        C0340b c0340b = (C0340b) c0031p0.f395k;
        gVar.getClass();
        t tVarD = c0720d.d(0);
        t tVar = (t) c0031p0Arr[0].f394j;
        A a6 = (tVar == null || !tVar.z()) ? null : tVar.a();
        boolean z5 = (a6 == null && c0340b == null) ? false : true;
        if (!z5 && tVarD != null) {
            a6 = c0720d.c(0);
            z5 = a6 != null && tVarD.g();
        }
        A a7 = a6;
        m mVar = c0720d.f9122b;
        if (z5) {
            c0721e.c(mVar, true, new r[]{h0(fVar, rVar, a7, 0, c0776l, c0340b)});
            return;
        }
        f0(c0721e, mVar, true, true);
        t tVarD2 = c0720d.d(0);
        if (tVarD2 != null) {
            ((H) tVarD2).f9508o = null;
        }
    }

    public final void b0(f fVar, p046i2.r rVar, C0721e c0721e, C0720d c0720d) throws InvalidDefinitionException {
        f fVar2;
        p046i2.r rVar2;
        c cVar;
        int i = c0720d.f9123c;
        r[] rVarArr = new r[i];
        int i3 = -1;
        int i6 = 0;
        while (i6 < i) {
            C0031p0 c0031p0 = c0720d.f9124d[i6];
            C0776l c0776l = (C0776l) c0031p0.i;
            C0340b c0340b = (C0340b) c0031p0.f395k;
            if (c0340b != null) {
                c cVar2 = this;
                fVar2 = fVar;
                rVar2 = rVar;
                cVar = cVar2;
                rVarArr[i6] = cVar2.h0(fVar2, rVar2, null, i6, c0776l, c0340b);
            } else {
                fVar2 = fVar;
                rVar2 = rVar;
                cVar = this;
                if (i3 >= 0) {
                    fVar2.H0(rVar2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i3), Integer.valueOf(i6), c0720d);
                    throw null;
                }
                i3 = i6;
            }
            i6++;
            this = cVar;
            fVar = fVar2;
            rVar = rVar2;
        }
        f fVar3 = fVar;
        p046i2.r rVar3 = rVar;
        if (i3 < 0) {
            fVar3.H0(rVar3, "No argument left as delegating for Creator %s: exactly one required", c0720d);
            throw null;
        }
        m mVar = c0720d.f9122b;
        if (i != 1) {
            c0721e.b(mVar, true, rVarArr, i3);
            return;
        }
        f0(c0721e, mVar, true, true);
        t tVarD = c0720d.d(0);
        if (tVarD != null) {
            ((H) tVarD).f9508o = null;
        }
    }

    public final void c0(f fVar, p046i2.r rVar, C0721e c0721e, C0720d c0720d) throws InvalidDefinitionException {
        A a6;
        int i = c0720d.f9123c;
        r[] rVarArr = new r[i];
        int i3 = 0;
        while (i3 < i) {
            C0031p0 c0031p0 = c0720d.f9124d[i3];
            C0340b c0340b = (C0340b) c0031p0.f395k;
            C0776l c0776l = (C0776l) c0031p0.i;
            A aC = c0720d.c(i3);
            if (aC != null) {
                a6 = aC;
            } else {
                if (fVar.f7249l.d().Z(c0776l) != null) {
                    fVar.H0(rVar, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(c0776l.f9557m));
                    throw null;
                }
                c0720d.b(i3);
                if (c0340b == null) {
                    fVar.H0(rVar, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i3), c0720d);
                    throw null;
                }
                a6 = null;
            }
            rVarArr[i3] = this.h0(fVar, rVar, a6, i3, c0776l, c0340b);
            i3++;
            this = this;
            fVar = fVar;
            rVar = rVar;
        }
        c0721e.c(c0720d.f9122b, true, rVarArr);
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0369  */
    /* JADX WARN: Code duplicated, block: B:321:0x0756  */
    /* JADX WARN: Code duplicated, block: B:323:0x075c  */
    /* JADX WARN: Code duplicated, block: B:324:0x075e  */
    /* JADX WARN: Code duplicated, block: B:327:0x0766  */
    /* JADX WARN: Code duplicated, block: B:328:0x0769  */
    /* JADX WARN: Code duplicated, block: B:333:0x078e  */
    /* JADX WARN: Code duplicated, block: B:335:0x079a  */
    /* JADX WARN: Code duplicated, block: B:336:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:338:0x07b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:349:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:351:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:352:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:354:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:359:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:360:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:395:0x0729 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x074c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0746 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x07bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x07fb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x0734 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x070e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x070e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x07b6 A[SYNTHETIC] */
    public final o0 e0(f fVar, p046i2.r rVar) {
        EnumC0348j enumC0348j;
        g gVar;
        boolean z5;
        boolean z6;
        m[] mVarArr;
        p046i2.r rVar2;
        String str;
        int i;
        B bD;
        Iterator it;
        C0720d c0720d;
        int i3;
        m mVar;
        t[] tVarArr;
        t tVarD;
        r[] rVarArr;
        C0776l c0776l;
        int i6;
        int i7;
        int i8;
        r[] rVarArr2;
        C0776l c0776l2;
        int i9;
        C0776l c0776lX;
        t tVar;
        C0340b c0340bP;
        A a6;
        Iterator it2;
        A a7;
        r[] rVarArr3;
        L l6;
        C0776l c0776l3;
        f fVar2;
        String str2;
        B b6;
        A a8;
        String str3;
        Iterator it3;
        C0721e c0721e;
        LinkedList linkedList;
        int i10;
        C0474e c0474e;
        String str4;
        f fVar3;
        p046i2.r rVar3;
        LinkedList linkedList2;
        C0474e c0474e2;
        m mVar2;
        int i11;
        int i12;
        r[] rVarArr4;
        C0721e c0721e2;
        C0721e c0721e3;
        f fVar4;
        g gVar2;
        boolean z7;
        C0495p[] c0495pArr;
        int i13;
        C0767c c0767c;
        C0767c c0767c2;
        f fVar5;
        C0721e c0721e4;
        p046i2.r rVar4;
        f fVar6 = fVar;
        p046i2.r rVar5 = rVar;
        C0474e c0474e3 = fVar6.f7249l;
        h hVar = rVar5.f9562a;
        Class cls = hVar.f7281k;
        C0766b c0766b = rVar5.f9566e;
        L lG = c0474e3.g(cls, c0766b);
        C0721e c0721e5 = new C0721e(rVar5, c0474e3);
        Map linkedHashMap = Collections.EMPTY_MAP;
        for (t tVar2 : rVar5.b()) {
            Iterator itN = tVar2.n();
            while (itN.hasNext()) {
                C0776l c0776l4 = (C0776l) itN.next();
                m mVar3 = c0776l4.f9555k;
                t[] tVarArr2 = (t[]) linkedHashMap.get(mVar3);
                int i14 = c0776l4.f9557m;
                if (tVarArr2 == null) {
                    if (linkedHashMap.isEmpty()) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    tVarArr2 = new t[mVar3.y()];
                    linkedHashMap.put(mVar3, tVarArr2);
                } else if (tVarArr2[i14] != null) {
                    fVar6.H0(rVar5, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(i14), mVar3, tVarArr2[i14], tVar2);
                    throw null;
                }
                tVarArr2[i14] = tVar2;
            }
        }
        C0474e c0474e4 = fVar6.f7249l;
        B bD2 = c0474e4.d();
        Iterator it4 = rVar5.g().iterator();
        LinkedList linkedList3 = null;
        int i15 = 0;
        while (true) {
            boolean zHasNext = it4.hasNext();
            enumC0348j = EnumC0348j.f4952k;
            gVar = g.f8698h;
            z5 = c0721e5.f9128c;
            z6 = c0721e5.f9127b;
            mVarArr = c0721e5.f9129d;
            if (!zHasNext) {
                break;
            }
            C0772h c0772h = (C0772h) it4.next();
            EnumC0348j enumC0348jE = bD2.e(c0474e4, c0772h);
            int parameterCount = c0772h.f9547l.getParameterCount();
            if (enumC0348jE == null) {
                if (parameterCount == 1) {
                    lG.getClass();
                    if (lG.f9520k.a(c0772h.f9547l)) {
                        C0720d c0720dA = C0720d.a(bD2, c0772h, null);
                        LinkedList linkedList4 = linkedList3 == null ? new LinkedList() : linkedList3;
                        linkedList4.add(c0720dA);
                        rVar5 = rVar;
                        linkedList3 = linkedList4;
                        fVar6 = fVar;
                    }
                }
            } else if (enumC0348jE != enumC0348j) {
                if (parameterCount == 0) {
                    if (z6) {
                        i.e((Member) c0772h.e(), z5);
                    }
                    mVarArr[0] = c0772h;
                } else {
                    int iOrdinal = enumC0348jE.ordinal();
                    if (iOrdinal == 1) {
                        fVar5 = fVar;
                        c0721e4 = c0721e5;
                        rVar4 = rVar;
                        b0(fVar5, rVar4, c0721e4, C0720d.a(bD2, c0772h, null));
                    } else if (iOrdinal != 2) {
                        a0(fVar, rVar, c0721e5, C0720d.a(bD2, c0772h, (t[]) linkedHashMap.get(c0772h)), gVar);
                        c0721e4 = c0721e5;
                        rVar4 = rVar;
                        fVar5 = fVar;
                    } else {
                        fVar5 = fVar;
                        c0721e4 = c0721e5;
                        rVar4 = rVar;
                        c0(fVar5, rVar4, c0721e4, C0720d.a(bD2, c0772h, (t[]) linkedHashMap.get(c0772h)));
                    }
                    i15++;
                    fVar6 = fVar5;
                    rVar5 = rVar4;
                    c0721e5 = c0721e4;
                }
            }
            fVar6 = fVar;
            rVar5 = rVar;
        }
        C0721e c0721e6 = c0721e5;
        p046i2.r rVar6 = rVar5;
        f fVar7 = fVar6;
        String str5 = "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported";
        if (hVar.j0()) {
            Class cls2 = hVar.f7281k;
            if (i.x(cls2)) {
                ArrayList arrayList = new ArrayList();
                b bVar = new b();
                bVar.f8a = rVar6;
                bVar.f10c = fVar7.f7249l.d();
                bVar.f9b = fVar7.f7249l;
                RuntimeException runtimeException = a.f9713e;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                a aVar = a.f9712d;
                Class cls3 = rVar6.f9562a.f7281k;
                Object[] objArrA = aVar.a(cls3);
                if (objArrA == null) {
                    c0495pArr = null;
                } else {
                    C0495p[] c0495pArr2 = new C0495p[objArrA.length];
                    int i16 = 0;
                    while (i16 < objArrA.length) {
                        try {
                            i13 = i16;
                            try {
                                String str6 = str5;
                                try {
                                    a aVar2 = aVar;
                                    c0495pArr2[i13] = new C0495p((Class) aVar.f9716c.invoke(objArrA[i13], null), 10, (String) aVar.f9715b.invoke(objArrA[i13], null));
                                    i16 = i13 + 1;
                                    str5 = str6;
                                    aVar = aVar2;
                                } catch (Exception e6) {
                                    throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", Integer.valueOf(i13), Integer.valueOf(objArrA.length), i.z(cls3)), e6);
                                }
                            } catch (Exception e7) {
                                e = e7;
                                throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i13), Integer.valueOf(objArrA.length), i.z(cls3)), e);
                            }
                        } catch (Exception e8) {
                            e = e8;
                            i13 = i16;
                        }
                    }
                    c0495pArr = c0495pArr2;
                }
                str2 = str5;
                bVar.f13f = c0495pArr;
                if (c0495pArr == null) {
                    bVar.f11d = (List) rVar6.f9566e.m().f394j;
                    bVar.f12e = null;
                } else {
                    int length = c0495pArr.length;
                    if (length != 0) {
                        List list = (List) rVar6.f9566e.m().f394j;
                        bVar.f11d = list;
                        Iterator it5 = list.iterator();
                        loop14: while (true) {
                            if (!it5.hasNext()) {
                                c0767c = null;
                                break;
                            }
                            C0767c c0767c3 = (C0767c) it5.next();
                            if (c0767c3.f9538l.getParameterCount() == length) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= length) {
                                        c0767c = c0767c3;
                                        break loop14;
                                    }
                                    int i18 = length;
                                    if (!c0767c3.A(i17).equals((Class) ((C0495p[]) bVar.f13f)[i17].i)) {
                                        length = i18;
                                        break;
                                    }
                                    i17++;
                                    length = i18;
                                }
                            }
                        }
                    } else {
                        c0767c = (C0767c) rVar6.f9566e.m().i;
                        bVar.f11d = Collections.singletonList(c0767c);
                    }
                    if (c0767c == null) {
                        throw new IllegalArgumentException("Failed to find the canonical Record constructor of type " + i.r(((p046i2.r) bVar.f8a).f9562a));
                    }
                    bVar.f12e = c0767c;
                }
                Iterator it6 = ((List) bVar.f11d).iterator();
                while (true) {
                    boolean zHasNext2 = it6.hasNext();
                    C0767c c0767c4 = (C0767c) bVar.f12e;
                    if (!zHasNext2) {
                        C0495p[] c0495pArr3 = (C0495p[]) bVar.f13f;
                        if (c0495pArr3 != null) {
                            for (C0495p c0495p : c0495pArr3) {
                                arrayList.add((String) c0495p.f7476j);
                            }
                            c0767c2 = c0767c4;
                            break;
                        }
                        break;
                    }
                    C0767c c0767c5 = (C0767c) it6.next();
                    EnumC0348j enumC0348jE2 = ((B) bVar.f10c).e((C0474e) bVar.f9b, c0767c5);
                    if (enumC0348jE2 == null || enumC0348j == enumC0348jE2 || (EnumC0348j.i != enumC0348jE2 && c0767c5 == c0767c4)) {
                    }
                    c0767c2 = null;
                    break;
                }
                if (c0767c2 != null) {
                    int parameterCount2 = c0767c2.f9538l.getParameterCount();
                    B bD3 = c0474e4.d();
                    r[] rVarArr5 = new r[parameterCount2];
                    int i19 = 0;
                    while (i19 < parameterCount2) {
                        C0776l c0776lX2 = c0767c2.x(i19);
                        C0340b c0340bP2 = bD3.p(c0776lX2);
                        A aU = bD3.u(c0776lX2);
                        if (aU == null || aU.c()) {
                            aU = A.a((String) arrayList.get(i19));
                        }
                        ArrayList arrayList2 = arrayList;
                        rVarArr5[i19] = h0(fVar, rVar6, aU, i19, c0776lX2, c0340bP2);
                        i19++;
                        rVar6 = rVar;
                        arrayList = arrayList2;
                    }
                    c0721e6.c(c0767c2, false, rVarArr5);
                    return c0721e6.d(fVar);
                }
                fVar2 = fVar;
            } else {
                fVar2 = fVar7;
                mVarArr = mVarArr;
                str2 = "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported";
            }
            Boolean boolValueOf = c0766b.f9537v;
            if (boolValueOf == null) {
                Annotation[] annotationArr = i.f12697a;
                Class cls4 = c0766b.f9525j;
                if (Modifier.isStatic(cls4.getModifiers())) {
                    z7 = false;
                } else if ((i.w(cls4) ? null : cls4.getEnclosingClass()) != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolValueOf = Boolean.valueOf(z7);
                c0766b.f9537v = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                rVar2 = rVar;
                str = str2;
            } else {
                boolean z8 = !i.u(cls2) || Throwable.class.isAssignableFrom(cls2);
                B bD4 = c0474e4.d();
                C0767c c0767c6 = (C0767c) c0766b.m().i;
                if (c0767c6 != null && (mVarArr[0] == null || g0(fVar2, c0767c6))) {
                    if (z6) {
                        i.e((Member) c0767c6.e(), z5);
                    }
                    mVarArr[0] = c0767c6;
                }
                int i20 = 0;
                LinkedList linkedList5 = null;
                for (C0767c c0767c7 : (List) c0766b.m().f394j) {
                    EnumC0348j enumC0348jE3 = bD4.e(c0474e4, c0767c7);
                    if (enumC0348j != enumC0348jE3) {
                        if (enumC0348jE3 != null) {
                            int iOrdinal2 = enumC0348jE3.ordinal();
                            if (iOrdinal2 == 1) {
                                c0721e3 = c0721e6;
                                fVar4 = fVar2;
                                gVar2 = gVar;
                                b0(fVar4, rVar, c0721e3, C0720d.a(bD4, c0767c7, null));
                            } else if (iOrdinal2 != 2) {
                                C0721e c0721e7 = c0721e6;
                                gVar2 = gVar;
                                a0(fVar2, rVar, c0721e7, C0720d.a(bD4, c0767c7, (t[]) linkedHashMap.get(c0767c7)), gVar2);
                                c0721e3 = c0721e7;
                                fVar4 = fVar2;
                            } else {
                                c0721e3 = c0721e6;
                                fVar4 = fVar2;
                                gVar2 = gVar;
                                c0(fVar4, rVar, c0721e3, C0720d.a(bD4, c0767c7, (t[]) linkedHashMap.get(c0767c7)));
                            }
                            i20++;
                            c0721e6 = c0721e3;
                            enumC0348j = enumC0348j;
                            fVar2 = fVar4;
                            gVar = gVar2;
                        } else if (z8) {
                            lG.getClass();
                            if (lG.f9520k.a(c0767c7.p())) {
                                C0720d c0720dA2 = C0720d.a(bD4, c0767c7, (t[]) linkedHashMap.get(c0767c7));
                                if (linkedList5 == null) {
                                    linkedList5 = new LinkedList();
                                }
                                linkedList5.add(c0720dA2);
                            }
                        }
                    }
                }
                p046i2.r rVar7 = rVar;
                f fVar8 = fVar2;
                C0721e c0721e8 = c0721e6;
                if (linkedList5 == null || i20 > 0) {
                    rVar2 = rVar7;
                    c0721e6 = c0721e8;
                    i = i20;
                    c0474e4 = c0474e4;
                    str = str2;
                } else {
                    B bD5 = c0474e4.d();
                    Iterator it7 = linkedList5.iterator();
                    LinkedList linkedList6 = null;
                    while (it7.hasNext()) {
                        C0720d c0720d2 = (C0720d) it7.next();
                        int i21 = c0720d2.f9123c;
                        m mVar4 = c0720d2.f9122b;
                        if (i21 == 1) {
                            t tVarD2 = c0720d2.d(0);
                            if (d0(bD5, mVar4, tVarD2)) {
                                C0031p0[] c0031p0Arr = c0720d2.f9124d;
                                C0340b c0340b = (C0340b) c0031p0Arr[0].f395k;
                                A aC = c0720d2.c(0);
                                if (aC == null) {
                                    c0720d2.b(0);
                                    if (c0340b == null) {
                                        fVar3 = fVar8;
                                        rVar3 = rVar7;
                                        it3 = it7;
                                        linkedList = linkedList6;
                                        i10 = i20;
                                        c0474e = c0474e4;
                                        str4 = str2;
                                        c0721e = c0721e8;
                                    } else {
                                        aC = null;
                                    }
                                }
                                c0721e2 = c0721e8;
                                it3 = it7;
                                c0721e2.c(mVar4, false, new r[]{h0(fVar8, rVar7, aC, 0, (C0776l) c0031p0Arr[0].i, c0340b)});
                            } else {
                                c0721e2 = c0721e8;
                                it3 = it7;
                                lG.getClass();
                                f0(c0721e2, mVar4, false, lG.f9520k.a(mVar4.p()));
                                if (tVarD2 != null) {
                                    ((H) tVarD2).f9508o = null;
                                }
                            }
                            fVar3 = fVar;
                            rVar3 = rVar;
                            linkedList = linkedList6;
                            i10 = i20;
                            c0474e = c0474e4;
                            c0721e = c0721e2;
                            str4 = str2;
                        } else {
                            it3 = it7;
                            c0721e = c0721e8;
                            r[] rVarArr6 = new r[i21];
                            int i22 = -1;
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            while (i23 < i21) {
                                C0776l c0776lX3 = mVar4.x(i23);
                                t tVarD3 = c0720d2.d(i23);
                                C0340b c0340bP3 = bD5.p(c0776lX3);
                                A a9 = tVarD3 == null ? null : tVarD3.a();
                                if (tVarD3 == null || !tVarD3.z()) {
                                    linkedList2 = linkedList6;
                                    c0474e2 = c0474e4;
                                    A a10 = a9;
                                    mVar2 = mVar4;
                                    i11 = i22;
                                    i12 = i20;
                                    rVarArr4 = rVarArr6;
                                    if (c0340bP3 != null) {
                                        i25++;
                                        rVarArr4[i23] = h0(fVar, rVar, a10, i23, c0776lX3, c0340bP3);
                                    } else {
                                        if (bD5.Z(c0776lX3) != null) {
                                            fVar.H0(rVar, str2, Integer.valueOf(c0776lX3.f9557m));
                                            throw null;
                                        }
                                        if (i11 < 0) {
                                            i11 = i23;
                                        }
                                    }
                                } else {
                                    i24++;
                                    linkedList2 = linkedList6;
                                    c0474e2 = c0474e4;
                                    A a11 = a9;
                                    mVar2 = mVar4;
                                    i11 = i22;
                                    i12 = i20;
                                    rVarArr4 = rVarArr6;
                                    rVarArr4[i23] = h0(fVar, rVar, a11, i23, c0776lX3, c0340bP3);
                                }
                                i23++;
                                mVar4 = mVar2;
                                rVarArr6 = rVarArr4;
                                i22 = i11;
                                i20 = i12;
                                linkedList6 = linkedList2;
                                c0474e4 = c0474e2;
                            }
                            linkedList = linkedList6;
                            i10 = i20;
                            c0474e = c0474e4;
                            str4 = str2;
                            m mVar5 = mVar4;
                            r[] rVarArr7 = rVarArr6;
                            int i26 = i22;
                            fVar3 = fVar;
                            rVar3 = rVar;
                            if (i24 <= 0 && i25 <= 0) {
                                if (mVarArr[0] != null) {
                                    linkedList6 = linkedList;
                                } else {
                                    LinkedList linkedList7 = linkedList == null ? new LinkedList() : linkedList;
                                    linkedList7.add(mVar5);
                                    linkedList6 = linkedList7;
                                }
                                str2 = str4;
                                c0721e8 = c0721e;
                                it7 = it3;
                                i20 = i10;
                            } else if (i24 + i25 == i21) {
                                c0721e.c(mVar5, false, rVarArr7);
                            } else {
                                if (i24 != 0 || i25 + 1 != i21) {
                                    c0720d2.b(i26);
                                    fVar3.H0(rVar3, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i26), mVar5);
                                    throw null;
                                }
                                c0721e.b(mVar5, false, rVarArr7, 0);
                            }
                            c0474e4 = c0474e;
                            rVar7 = rVar3;
                            fVar8 = fVar3;
                        }
                        str2 = str4;
                        c0721e8 = c0721e;
                        it7 = it3;
                        i20 = i10;
                        linkedList6 = linkedList;
                        c0474e4 = c0474e;
                        rVar7 = rVar3;
                        fVar8 = fVar3;
                    }
                    fVar = fVar8;
                    rVar2 = rVar7;
                    c0721e6 = c0721e8;
                    LinkedList linkedList8 = linkedList6;
                    i = i20;
                    c0474e4 = c0474e4;
                    String str7 = str2;
                    if (linkedList8 != null && mVarArr[8] == null && mVarArr[9] == null) {
                        Iterator it8 = linkedList8.iterator();
                        m mVar6 = null;
                        r[] rVarArr8 = null;
                        while (true) {
                            if (!it8.hasNext()) {
                                str = str7;
                                break;
                            }
                            m mVar7 = (m) it8.next();
                            lG.getClass();
                            if (lG.f9520k.a(mVar7.p())) {
                                int iY = mVar7.y();
                                r[] rVarArr9 = new r[iY];
                                int i27 = 0;
                                while (true) {
                                    if (i27 >= iY) {
                                        r[] rVarArr10 = rVarArr9;
                                        b6 = bD5;
                                        str = str7;
                                        if (mVar6 == null) {
                                            str7 = str;
                                            mVar6 = mVar7;
                                            rVarArr8 = rVarArr10;
                                            break;
                                        }
                                        mVar6 = null;
                                        break;
                                    }
                                    C0776l c0776lX4 = mVar7.x(i27);
                                    A aU2 = bD5.u(c0776lX4);
                                    if (aU2 == null || aU2.c()) {
                                        bD5.o(c0776lX4);
                                        a8 = null;
                                    } else {
                                        a8 = aU2;
                                    }
                                    if (a8 == null || a8.c()) {
                                        b6 = bD5;
                                        str3 = str7;
                                    } else {
                                        int i28 = i27;
                                        r[] rVarArr11 = rVarArr9;
                                        rVarArr11[i28] = h0(fVar, rVar2, a8, c0776lX4.f9557m, c0776lX4, null);
                                        i27 = i28 + 1;
                                        fVar = fVar;
                                        str7 = str7;
                                        rVarArr9 = rVarArr11;
                                        bD5 = bD5;
                                    }
                                }
                                bD5 = b6;
                            } else {
                                b6 = bD5;
                                str3 = str7;
                            }
                            str7 = str3;
                            bD5 = b6;
                        }
                        if (mVar6 != null) {
                            c0721e6.c(mVar6, false, rVarArr8);
                            for (r rVar8 : rVarArr8) {
                                A a12 = rVar8.f8933j;
                                if (!rVar2.h(a12)) {
                                    w wVar = new w(c0474e4.d(), rVar8.e(), a12, null, t.f9574h);
                                    if (!rVar2.h(a12)) {
                                        rVar2.b().add(wVar);
                                    }
                                }
                            }
                        }
                    } else {
                        str = str7;
                    }
                }
            }
            if (linkedList3 != null && i15 <= 0 && i <= 0) {
                bD = c0474e4.d();
                it = linkedList3.iterator();
                while (it.hasNext()) {
                    c0720d = (C0720d) it.next();
                    i3 = c0720d.f9123c;
                    mVar = c0720d.f9122b;
                    tVarArr = (t[]) linkedHashMap.get(mVar);
                    if (i3 != 1) {
                        tVarD = c0720d.d(0);
                        if (d0(bD, mVar, tVarD)) {
                            rVarArr = new r[i3];
                            c0776l = null;
                            i6 = 0;
                            i7 = 0;
                            i8 = 0;
                            while (i6 < i3) {
                                c0776lX = mVar.x(i6);
                                if (tVarArr == null) {
                                    tVar = null;
                                } else {
                                    tVar = tVarArr[i6];
                                }
                                c0340bP = bD.p(c0776lX);
                                if (tVar == null) {
                                    a6 = null;
                                } else {
                                    a6 = tVar.a();
                                }
                                if (tVar == null && tVar.z()) {
                                    i7++;
                                    it2 = it;
                                    A a13 = a6;
                                    rVarArr3 = rVarArr;
                                    l6 = lG;
                                    c0776l3 = c0776l;
                                    rVarArr3[i6] = h0(fVar, rVar2, a13, i6, c0776lX, c0340bP);
                                    rVar2 = rVar;
                                } else {
                                    it2 = it;
                                    a7 = a6;
                                    rVarArr3 = rVarArr;
                                    l6 = lG;
                                    c0776l3 = c0776l;
                                    if (c0340bP != null) {
                                        i8++;
                                        rVar2 = rVar;
                                        rVarArr3[i6] = h0(fVar, rVar2, a7, i6, c0776lX, c0340bP);
                                    } else {
                                        rVar2 = rVar;
                                        if (bD.Z(c0776lX) != null) {
                                            fVar.H0(rVar2, str, Integer.valueOf(c0776lX.f9557m));
                                            throw null;
                                        }
                                        if (c0776l3 == null) {
                                            c0776l3 = c0776lX;
                                        }
                                    }
                                }
                                i6++;
                                rVarArr = rVarArr3;
                                c0776l = c0776l3;
                                lG = l6;
                                it = it2;
                            }
                            Iterator it9 = it;
                            L l7 = lG;
                            rVarArr2 = rVarArr;
                            c0776l2 = c0776l;
                            if (i7 > 0 || i8 > 0) {
                                if (i7 + i8 == i3) {
                                    c0721e6.c(mVar, false, rVarArr2);
                                } else {
                                    if (i7 == 0 || i8 + 1 != i3) {
                                        break;
                                        if (c0776l2 == null) {
                                            i9 = -1;
                                        } else {
                                            i9 = c0776l2.f9557m;
                                        }
                                        fVar.H0(rVar2, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i9), mVar);
                                        throw null;
                                    }
                                    c0721e6.b(mVar, false, rVarArr2, 0);
                                }
                                lG = l7;
                                it = it9;
                            }
                            lG = l7;
                            it = it9;
                        } else {
                            lG.getClass();
                            f0(c0721e6, mVar, false, lG.f9520k.a(mVar.p()));
                            if (tVarD != null) {
                                ((H) tVarD).f9508o = null;
                            }
                        }
                    }
                }
            }
            return c0721e6.d(fVar);
        }
        rVar2 = rVar6;
        str = "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported";
        i = 0;
        if (linkedList3 != null) {
            bD = c0474e4.d();
            it = linkedList3.iterator();
            while (true) {
                c0720d = (C0720d) it.next();
                i3 = c0720d.f9123c;
                mVar = c0720d.f9122b;
                tVarArr = (t[]) linkedHashMap.get(mVar);
                if (i3 != 1) {
                    tVarD = c0720d.d(0);
                    if (d0(bD, mVar, tVarD)) {
                        lG.getClass();
                        f0(c0721e6, mVar, false, lG.f9520k.a(mVar.p()));
                        if (tVarD != null) {
                            ((H) tVarD).f9508o = null;
                        }
                    } else {
                        rVarArr = new r[i3];
                        c0776l = null;
                        i6 = 0;
                        i7 = 0;
                        i8 = 0;
                        while (i6 < i3) {
                            c0776lX = mVar.x(i6);
                            if (tVarArr == null) {
                                tVar = null;
                            } else {
                                tVar = tVarArr[i6];
                            }
                            c0340bP = bD.p(c0776lX);
                            if (tVar == null) {
                                a6 = null;
                            } else {
                                a6 = tVar.a();
                            }
                            if (tVar == null) {
                                it2 = it;
                                a7 = a6;
                                rVarArr3 = rVarArr;
                                l6 = lG;
                                c0776l3 = c0776l;
                                if (c0340bP != null) {
                                    i8++;
                                    rVar2 = rVar;
                                    rVarArr3[i6] = h0(fVar, rVar2, a7, i6, c0776lX, c0340bP);
                                } else {
                                    rVar2 = rVar;
                                    if (bD.Z(c0776lX) != null) {
                                        fVar.H0(rVar2, str, Integer.valueOf(c0776lX.f9557m));
                                        throw null;
                                    }
                                    if (c0776l3 == null) {
                                        c0776l3 = c0776lX;
                                    }
                                }
                            } else {
                                it2 = it;
                                a7 = a6;
                                rVarArr3 = rVarArr;
                                l6 = lG;
                                c0776l3 = c0776l;
                                if (c0340bP != null) {
                                    i8++;
                                    rVar2 = rVar;
                                    rVarArr3[i6] = h0(fVar, rVar2, a7, i6, c0776lX, c0340bP);
                                } else {
                                    rVar2 = rVar;
                                    if (bD.Z(c0776lX) != null) {
                                        fVar.H0(rVar2, str, Integer.valueOf(c0776lX.f9557m));
                                        throw null;
                                    }
                                    if (c0776l3 == null) {
                                        c0776l3 = c0776lX;
                                    }
                                }
                            }
                            i6++;
                            rVarArr = rVarArr3;
                            c0776l = c0776l3;
                            lG = l6;
                            it = it2;
                        }
                        Iterator it10 = it;
                        L l8 = lG;
                        rVarArr2 = rVarArr;
                        c0776l2 = c0776l;
                        if (i7 > 0) {
                            if (i7 + i8 == i3) {
                                if (i7 == 0) {
                                    break;
                                    break;
                                }
                            } else {
                                c0721e6.c(mVar, false, rVarArr2);
                            }
                        } else if (i7 + i8 == i3) {
                            if (i7 == 0) {
                                break;
                            }
                        } else {
                            c0721e6.c(mVar, false, rVarArr2);
                        }
                        lG = l8;
                        it = it10;
                    }
                }
            }
            if (c0776l2 == null) {
                i9 = -1;
            } else {
                i9 = c0776l2.f9557m;
            }
            fVar.H0(rVar2, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i9), mVar);
            throw null;
        }
        return c0721e6.d(fVar);
    }

    public final j h0(f fVar, p046i2.r rVar, A a6, int i, C0776l c0776l, C0340b c0340b) throws InvalidDefinitionException {
        z zVar;
        C0474e c0474e = fVar.f7249l;
        B bD = c0474e.d();
        z zVarA = z.a(bD.k0(c0776l), bD.G(c0776l), bD.L(c0776l), bD.F(c0776l));
        h hVarP0 = p0(fVar, c0776l, c0776l.f9556l);
        d dVarM0 = (d) hVarP0.f7284n;
        if (dVarM0 == null) {
            dVarM0 = m0(c0474e, hVarP0);
        }
        C0474e c0474e2 = fVar.f7249l;
        N nV = c0474e2.d().V(c0776l);
        b0 b0Var = b0.f4930k;
        b0 b0Var2 = nV.f4912h;
        if (b0Var2 == b0Var) {
            b0Var2 = null;
        }
        b0 b0Var3 = nV.i;
        if (b0Var3 == b0Var) {
            b0Var3 = null;
        }
        c0474e2.e(hVarP0.f7281k);
        c0474e2.f8724n.getClass();
        b0 b0Var4 = b0Var2 == null ? null : b0Var2;
        b0 b0Var5 = b0Var3 == null ? null : b0Var3;
        if (b0Var4 == null && b0Var5 == null) {
            zVar = zVarA;
        } else {
            zVar = new z(zVarA.f7340h, zVarA.i, zVarA.f7341j, zVarA.f7342k, zVarA.f7343l, b0Var4, b0Var5);
        }
        j jVar = new j(a6, hVarP0, dVarM0, rVar.f9566e.f9533r, c0776l, i, c0340b, zVar);
        j jVarK0 = k0(fVar, c0776l);
        if (jVarK0 == null) {
            jVarK0 = (j) hVarP0.f7283m;
        }
        return jVarK0 != null ? (j) jVar.E(fVar.p0(jVarK0, jVar, hVarP0)) : jVar;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0175  */
    public final j j0(f fVar, p104t2.c cVar, p046i2.r rVar) {
        p037g2.m mVar;
        h hVar = cVar.f12491t;
        j jVar = (j) hVar.f7283m;
        C0474e c0474e = fVar.f7249l;
        d dVarM0 = (d) hVar.f7284n;
        if (dVarM0 == null) {
            dVarM0 = m0(c0474e, hVar);
        }
        k kVar = this.f8878j;
        C0965d c0965dB = kVar.b();
        if (c0965dB.hasNext()) {
            throw p012c.k.q(c0965dB);
        }
        f0 f0Var = null;
        Class cls = cVar.f7281k;
        j c0521q = (jVar == null && EnumSet.class.isAssignableFrom(cls)) ? new C0521q(hVar) : null;
        if (c0521q == null) {
            if (cls.isInterface() || cVar.i0()) {
                Class cls2 = (Class) b.f8876a.get(cls.getName());
                p104t2.c cVar2 = cls2 != null ? (p104t2.c) c0474e.i.f8680h.i(cVar, cls2, true) : null;
                if (cVar2 != null) {
                    rVar = c0474e.o(cVar2);
                    cVar = cVar2;
                } else {
                    if (cVar.f7284n == null) {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + cVar);
                    }
                    c0521q = new a(rVar);
                }
            }
            if (c0521q == null) {
                t tVarN0 = n0(fVar, rVar);
                if (!tVarN0.j()) {
                    if (cVar.h0(ArrayBlockingQueue.class)) {
                        return new C0505a(cVar, jVar, dVarM0, tVarN0);
                    }
                    String name = cVar.f7281k.getName();
                    if (name.startsWith("java.util.")) {
                        String strSubstring = name.startsWith("java.util.Collections$") ? name.substring(22) : null;
                        if (strSubstring != null) {
                            String strSubstring2 = strSubstring.startsWith("Unmodifiable") ? strSubstring.substring(12) : null;
                            if (strSubstring2 == null) {
                                String strSubstring3 = strSubstring.startsWith("Singleton") ? strSubstring.substring(9) : null;
                                if (strSubstring3 == null) {
                                    String strSubstring4 = strSubstring.startsWith("Synchronized") ? strSubstring.substring(12) : null;
                                    if (strSubstring4 == null) {
                                        mVar = null;
                                    } else if (strSubstring4.endsWith("Set")) {
                                        mVar = new p037g2.m(7, cVar.W(Set.class));
                                    } else if (strSubstring4.endsWith("List")) {
                                        mVar = new p037g2.m(9, cVar.W(List.class));
                                    } else if (strSubstring4.endsWith("Collection")) {
                                        mVar = new p037g2.m(8, cVar.W(Collection.class));
                                    } else {
                                        mVar = null;
                                    }
                                } else if (strSubstring3.endsWith("Set")) {
                                    mVar = new p037g2.m(1, cVar.W(Set.class));
                                } else if (strSubstring3.endsWith("List")) {
                                    mVar = new p037g2.m(2, cVar.W(List.class));
                                } else {
                                    mVar = null;
                                }
                            } else if (strSubstring2.endsWith("Set")) {
                                mVar = new p037g2.m(4, cVar.W(Set.class));
                            } else if (strSubstring2.endsWith("List")) {
                                mVar = new p037g2.m(5, cVar.W(List.class));
                            } else {
                                mVar = null;
                            }
                            if (mVar != null) {
                                f0Var = new f0(mVar);
                            }
                        } else {
                            String strSubstring5 = name.startsWith("java.util.Arrays$") ? name.substring(17) : null;
                            if (strSubstring5 == null) {
                                String strSubstring6 = name.startsWith("java.util.ImmutableCollections$") ? name.substring(31) : null;
                                if (strSubstring6 != null) {
                                    if (strSubstring6.contains("List")) {
                                        f0Var = new f0(new p037g2.m(11, cVar.W(List.class)));
                                    } else if (strSubstring6.contains("Set")) {
                                        f0Var = new f0(new p037g2.m(4, cVar.W(Set.class)));
                                    }
                                }
                            } else if (strSubstring5.contains("List")) {
                                f0Var = new f0(new p037g2.m(11, cVar.W(List.class)));
                            }
                        }
                    }
                    if (f0Var != null) {
                        return f0Var;
                    }
                }
                c0521q = hVar.h0(String.class) ? new q0(cVar, tVarN0, null, jVar, jVar, null) : new C0513i(cVar, jVar, dVarM0, tVarN0);
            }
        }
        if (kVar.c()) {
            C0965d c0965dA = kVar.a();
            if (c0965dA.hasNext()) {
                throw p012c.k.q(c0965dA);
            }
        }
        return c0521q;
    }

    public final p077o2.a m0(C0474e c0474e, h hVar) {
        p046i2.r rVarJ = c0474e.j(hVar.f7281k);
        B bD = c0474e.d();
        C0766b c0766b = rVarJ.f9566e;
        p077o2.m mVarY = bD.Y(hVar, c0474e, c0766b);
        if (mVarY == null) {
            c0474e.i.getClass();
            return null;
        }
        ArrayList arrayListV = c0474e.f8721k.V(c0474e, c0766b);
        if (mVarY.f10651e == null && hVar.i0()) {
            o0(hVar);
            Class cls = hVar.f7281k;
            if (!hVar.h0(cls) && mVarY.f10651e != cls) {
                i.F(mVarY, p077o2.m.class, "withDefaultImpl");
                p077o2.m mVar = new p077o2.m();
                mVar.f10650d = false;
                mVar.f10647a = mVarY.f10647a;
                mVar.f10648b = mVarY.f10648b;
                mVar.f10649c = mVarY.f10649c;
                mVar.f10650d = mVarY.f10650d;
                mVar.f10652f = mVarY.f10652f;
                mVar.f10651e = cls;
                mVarY = mVar;
            }
        }
        try {
            return mVarY.a(c0474e, hVar, arrayListV);
        } catch (IllegalArgumentException | IllegalStateException e6) {
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(null, i.i(e6));
            invalidDefinitionException.initCause(e6);
            throw invalidDefinitionException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    public final t n0(f fVar, p046i2.r rVar) {
        t tVarA0;
        C0474e c0474e = fVar.f7249l;
        Object objA0 = c0474e.d().a0(rVar.f9566e);
        if (objA0 == null) {
            tVarA0 = null;
        } else if (objA0 instanceof t) {
            tVarA0 = (t) objA0;
        } else {
            Class cls = (Class) objA0;
            if (i.t(cls)) {
                tVarA0 = null;
            } else {
                if (!t.class.isAssignableFrom(cls)) {
                    throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
                }
                c0474e.h();
                tVarA0 = (t) i.h(cls, c0474e.k(r.CAN_OVERRIDE_ACCESS_MODIFIERS));
            }
        }
        if (tVarA0 == null && (tVarA0 = p027e3.a.a0(rVar.f9562a.f7281k)) == null) {
            tVarA0 = e0(fVar, rVar);
        }
        AbstractC0599v0[] abstractC0599v0Arr = this.f8878j.f8712l;
        if (abstractC0599v0Arr.length <= 0 || abstractC0599v0Arr.length <= 0) {
            return tVarA0;
        }
        if (abstractC0599v0Arr.length <= 0) {
            throw new NoSuchElementException();
        }
        AbstractC0599v0 abstractC0599v0 = abstractC0599v0Arr[0];
        throw null;
    }

    public final h o0(h hVar) {
        Class cls = hVar.f7281k;
        V[] vArr = this.f8878j.f8711k;
        if (vArr.length <= 0) {
            return hVar;
        }
        if (!(vArr.length > 0)) {
            return hVar;
        }
        if (vArr.length <= 0) {
            throw new NoSuchElementException();
        }
        vArr[0].getClass();
        throw new ClassCastException();
    }

    public final h p0(f fVar, AbstractC0771g abstractC0771g, h hVar) throws InvalidDefinitionException {
        p077o2.a aVarA;
        p015c2.q qVarC0;
        B bD = fVar.f7249l.d();
        hVar.getClass();
        if ((hVar instanceof e) && hVar.b0() != null && (qVarC0 = fVar.C0(bD.r(abstractC0771g))) != null) {
            e eVar = (e) hVar;
            hVar = new e(eVar.f7281k, eVar.f12515r, eVar.f12513p, eVar.f12514q, eVar.f12505t.w0(qVarC0), eVar.f12506u, eVar.f7283m, eVar.f7284n, eVar.f7285o);
        }
        boolean zE0 = hVar.e0();
        C0474e c0474e = fVar.f7249l;
        if (zE0) {
            j jVarC0 = fVar.c0(bD.c(abstractC0771g));
            if (jVarC0 != null) {
                hVar = hVar.s0(jVarC0);
            }
            p077o2.m mVarE = c0474e.d().E(c0474e, abstractC0771g, hVar);
            h hVarY = hVar.Y();
            p077o2.a aVarM0 = mVarE == null ? m0(c0474e, hVarY) : mVarE.a(c0474e, hVarY, c0474e.f8721k.W(c0474e, abstractC0771g, hVarY));
            if (aVarM0 != null) {
                hVar = hVar.r0(aVarM0);
            }
        }
        p077o2.m mVarM = c0474e.d().M(c0474e, abstractC0771g, hVar);
        if (mVarM == null) {
            aVarA = m0(c0474e, hVar);
        } else {
            try {
                aVarA = mVarM.a(c0474e, hVar, c0474e.f8721k.W(c0474e, abstractC0771g, hVar));
            } catch (IllegalArgumentException | IllegalStateException e6) {
                InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(null, i.i(e6));
                invalidDefinitionException.initCause(e6);
                throw invalidDefinitionException;
            }
        }
        if (aVarA != null) {
            hVar = hVar.v0(aVarA);
        }
        return bD.o0(c0474e, abstractC0771g, hVar);
    }
}
