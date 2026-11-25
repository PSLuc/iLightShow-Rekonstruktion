package p046i2;

import B.C0031p0;
import c5.C0495p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p015c2.B;
import p015c2.h;
import p035g0.C0715p;
import p104t2.m;
import p104t2.n;
import p109u2.InterfaceC0963b;
import p109u2.g;
import p109u2.i;

/* JADX INFO: renamed from: i2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0766b extends q implements J {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0031p0 f9524w;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Class f9525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f9526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f9527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final B f9528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f9529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u f9530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Class f9531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f9532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0963b f9533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0031p0 f9534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0775k f9535t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f9536u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient Boolean f9537v;

    static {
        List list = Collections.EMPTY_LIST;
        f9524w = new C0031p0((Object) null, list, list, 25);
    }

    public C0766b(h hVar, Class cls, List list, Class cls2, InterfaceC0963b interfaceC0963b, m mVar, B b6, u uVar, n nVar, boolean z5) {
        this.i = hVar;
        this.f9525j = cls;
        this.f9527l = list;
        this.f9531p = cls2;
        this.f9533r = interfaceC0963b;
        this.f9526k = mVar;
        this.f9528m = b6;
        this.f9530o = uVar;
        this.f9529n = nVar;
        this.f9532q = z5;
    }

    @Override // p046i2.J
    public final h c(Type type) {
        return this.f9529n.b(null, type, this.f9526k);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return i.s(C0766b.class, obj) && ((C0766b) obj).f9525j == this.f9525j;
    }

    @Override // p046i2.q
    public final Annotation f(Class cls) {
        return this.f9533r.d(cls);
    }

    @Override // p046i2.q
    public final Class g() {
        return this.f9525j;
    }

    @Override // p046i2.q
    public final String getName() {
        return this.f9525j.getName();
    }

    @Override // p046i2.q
    public final h h() {
        return this.i;
    }

    public final int hashCode() {
        return this.f9525j.getName().hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b7 A[LOOP:6: B:105:0x01b5->B:106:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e7 A[LOOP:7: B:108:0x01cf->B:112:0x01e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:122:0x020f  */
    /* JADX WARN: Code duplicated, block: B:125:0x021a A[PHI: r2 r3 r8
  0x021a: PHI (r2v37 int) = (r2v22 int), (r2v22 int), (r2v28 int) binds: [B:124:0x0218, B:129:0x022d, B:241:0x021a] A[DONT_GENERATE, DONT_INLINE]
  0x021a: PHI (r3v29 java.util.ArrayList) = (r3v6 java.util.ArrayList), (r3v6 java.util.ArrayList), (r3v12 java.util.ArrayList) binds: [B:124:0x0218, B:129:0x022d, B:241:0x021a] A[DONT_GENERATE, DONT_INLINE]
  0x021a: PHI (r8v19 java.lang.Class) = (r8v1 java.lang.Class), (r8v1 java.lang.Class), (r8v5 java.lang.Class) binds: [B:124:0x0218, B:129:0x022d, B:241:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x0313  */
    /* JADX WARN: Code duplicated, block: B:186:0x0316  */
    /* JADX WARN: Code duplicated, block: B:188:0x0328  */
    /* JADX WARN: Code duplicated, block: B:193:0x033d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0358  */
    /* JADX WARN: Code duplicated, block: B:207:0x0372  */
    /* JADX WARN: Code duplicated, block: B:219:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0368 A[EDGE_INSN: B:220:0x0368->B:204:0x0368 BREAK  A[LOOP:2: B:199:0x0352->B:222:0x0352], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0382 A[EDGE_INSN: B:226:0x0382->B:210:0x0382 BREAK  A[LOOP:3: B:205:0x036e->B:227:0x036e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x014f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0163  */
    /* JADX WARN: Code duplicated, block: B:83:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0169  */
    /* JADX WARN: Code duplicated, block: B:88:0x0176  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0186 A[LOOP:4: B:90:0x0184->B:91:0x0186, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x018f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0198  */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x018f, please report this as an issue */
    public final C0031p0 m() {
        g gVar;
        ArrayList arrayList;
        int i;
        List list;
        h hVar;
        Class cls;
        Class cls2;
        ArrayList arrayList2;
        int i3;
        int size;
        ArrayList arrayList3;
        int i6;
        int i7;
        List list2;
        int i8;
        ArrayList arrayList4;
        Class cls3;
        TypeVariable<Method>[] typeParameters;
        m mVar;
        J c0495p;
        TypeVariable<Method> typeVariable;
        A[] aArr;
        int i9;
        boolean z5;
        A a6;
        int i10;
        int i11;
        C0767c c0767c;
        B b6;
        int size2;
        int size3;
        boolean z6;
        C0031p0 c0031p0 = this.f9534s;
        if (c0031p0 == null) {
            h hVar2 = this.i;
            if (hVar2 == null) {
                c0031p0 = f9524w;
            } else {
                Class cls4 = this.f9531p;
                C0768d c0768d = new C0768d(this.f9528m, this, (cls4 != null) | this.f9532q);
                boolean zL0 = hVar2.l0();
                Class cls5 = hVar2.f7281k;
                if (zL0) {
                    gVar = null;
                    arrayList = null;
                } else {
                    gVar = null;
                    arrayList = null;
                    for (g gVar2 : i.o(cls5)) {
                        if (!gVar2.f12688a.isSynthetic()) {
                            int parameterCount = gVar2.f12691d;
                            if (parameterCount < 0) {
                                parameterCount = gVar2.f12688a.getParameterCount();
                                gVar2.f12691d = parameterCount;
                            }
                            if (parameterCount == 0) {
                                gVar = gVar2;
                            } else {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(gVar2);
                            }
                        }
                    }
                }
                C0766b c0766b = (C0766b) c0768d.f9540e;
                if (arrayList == null) {
                    list = Collections.EMPTY_LIST;
                    if (gVar == null) {
                        hVar = hVar2;
                        cls = cls4;
                    } else {
                        i = 0;
                    }
                    arrayList2 = null;
                    for (Method method : i.n(cls5)) {
                        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic()) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (z6) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(method);
                        }
                    }
                    if (arrayList2 == null) {
                        list2 = Collections.EMPTY_LIST;
                    } else {
                        size = arrayList2.size();
                        arrayList3 = new ArrayList(size);
                        for (i6 = 0; i6 < size; i6++) {
                            arrayList3.add(null);
                        }
                        if (cls != null) {
                            aArr = null;
                            for (Method method2 : cls.getDeclaredMethods()) {
                                if (Modifier.isStatic(method2.getModifiers()) || method2.isSynthetic()) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (z5) {
                                    if (aArr == null) {
                                        aArr = new A[size];
                                        for (i11 = 0; i11 < size; i11++) {
                                            aArr[i11] = new A((Method) arrayList2.get(i11));
                                        }
                                    }
                                    a6 = new A(method2);
                                    for (i10 = 0; i10 < size; i10++) {
                                        if (a6.equals(aArr[i10])) {
                                            arrayList3.set(i10, c0768d.h((Method) arrayList2.get(i10), c0766b, method2));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        i7 = 0;
                        while (i7 < size) {
                            if (((C0772h) arrayList3.get(i7)) == null) {
                                Method method3 = (Method) arrayList2.get(i7);
                                typeParameters = method3.getTypeParameters();
                                if (typeParameters.length != 0 || hVar.X().f()) {
                                    i8 = size;
                                } else {
                                    Type genericReturnType = method3.getGenericReturnType();
                                    if (genericReturnType instanceof ParameterizedType) {
                                        ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
                                        if (cls5.equals(parameterizedType.getRawType())) {
                                            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                            ArrayList arrayList5 = new ArrayList(typeParameters.length);
                                            ArrayList arrayList6 = new ArrayList(typeParameters.length);
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < actualTypeArguments.length) {
                                                    TypeVariable typeVariableK = q.k(actualTypeArguments[i12]);
                                                    if (typeVariableK != null) {
                                                        String name = typeVariableK.getName();
                                                        if (name == null) {
                                                            i8 = size;
                                                        } else {
                                                            i8 = size;
                                                            h hVarD = hVar.X().d(i12);
                                                            if (hVarD != null) {
                                                                arrayList4 = arrayList2;
                                                                int length = typeParameters.length;
                                                                cls3 = cls5;
                                                                int i13 = 0;
                                                                while (true) {
                                                                    if (i13 >= length) {
                                                                        typeVariable = null;
                                                                        break;
                                                                    }
                                                                    typeVariable = typeParameters[i13];
                                                                    int i14 = length;
                                                                    if (name.equals(typeVariable.getName())) {
                                                                        break;
                                                                    }
                                                                    i13++;
                                                                    length = i14;
                                                                }
                                                                if (typeVariable != null) {
                                                                    Type[] bounds = typeVariable.getBounds();
                                                                    int length2 = bounds.length;
                                                                    int i15 = 0;
                                                                    while (true) {
                                                                        if (i15 >= length2) {
                                                                            int iIndexOf = arrayList5.indexOf(name);
                                                                            if (iIndexOf != -1) {
                                                                                h hVar3 = (h) arrayList6.get(iIndexOf);
                                                                                if (hVarD.equals(hVar3)) {
                                                                                    continue;
                                                                                } else {
                                                                                    boolean zN0 = hVar3.n0(hVarD.f7281k);
                                                                                    boolean zN1 = hVarD.n0(hVar3.f7281k);
                                                                                    if (zN0 || zN1) {
                                                                                        if ((zN0 ^ zN1) && zN1) {
                                                                                            arrayList6.set(iIndexOf, hVarD);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList5.add(name);
                                                                                arrayList6.add(hVarD);
                                                                            }
                                                                        } else {
                                                                            int i16 = i15;
                                                                            if (q.l(c0766b, hVarD, bounds[i16])) {
                                                                                i15 = i16 + 1;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i8 = size;
                                                        arrayList4 = arrayList2;
                                                        cls3 = cls5;
                                                    }
                                                    i12++;
                                                    size = i8;
                                                    arrayList2 = arrayList4;
                                                    cls5 = cls3;
                                                } else {
                                                    i8 = size;
                                                    arrayList4 = arrayList2;
                                                    cls3 = cls5;
                                                    if (!arrayList5.isEmpty()) {
                                                        mVar = (arrayList5.isEmpty() || arrayList6.isEmpty()) ? m.f12529n : new m((String[]) arrayList5.toArray(m.f12527l), (h[]) arrayList6.toArray(m.f12528m), null);
                                                    }
                                                }
                                                mVar = null;
                                            }
                                        } else {
                                            i8 = size;
                                        }
                                    } else {
                                        i8 = size;
                                    }
                                    if (mVar == null) {
                                        c0495p = c0766b;
                                    } else {
                                        c0495p = new C0495p(this.f9529n, 9, mVar);
                                    }
                                    arrayList3.set(i7, c0768d.h(method3, c0495p, null));
                                }
                                arrayList4 = arrayList2;
                                cls3 = cls5;
                                mVar = null;
                                if (mVar == null) {
                                    c0495p = c0766b;
                                } else {
                                    c0495p = new C0495p(this.f9529n, 9, mVar);
                                }
                                arrayList3.set(i7, c0768d.h(method3, c0495p, null));
                            } else {
                                i8 = size;
                                arrayList4 = arrayList2;
                                cls3 = cls5;
                            }
                            i7++;
                            size = i8;
                            arrayList2 = arrayList4;
                            cls5 = cls3;
                        }
                        list2 = arrayList3;
                    }
                    if (c0768d.f9539d) {
                        c0767c = (C0767c) c0768d.f9541f;
                        b6 = c0768d.f9577a;
                        if (c0767c != null && b6.j0(c0767c)) {
                            c0768d.f9541f = null;
                        }
                        size2 = list.size();
                        while (true) {
                            size2--;
                            if (size2 >= 0) {
                                break;
                            }
                            if (b6.j0((AbstractC0771g) list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        size3 = list2.size();
                        while (true) {
                            size3--;
                            if (size3 >= 0) {
                                break;
                            }
                            if (b6.j0((AbstractC0771g) list2.get(size3))) {
                                list2.remove(size3);
                            }
                        }
                    }
                    c0031p0 = new C0031p0((C0767c) c0768d.f9541f, list, list2, 25);
                } else {
                    int size4 = arrayList.size();
                    ArrayList arrayList7 = new ArrayList(size4);
                    for (int i17 = 0; i17 < size4; i17++) {
                        arrayList7.add(null);
                    }
                    i = size4;
                    list = arrayList7;
                }
                C0715p[] c0715pArr = v.f9575b;
                if (cls4 != null) {
                    g[] gVarArrO = i.o(cls4);
                    int length3 = gVarArrO.length;
                    A[] aArr2 = null;
                    int i18 = 0;
                    while (i18 < length3) {
                        g gVar3 = gVarArrO[i18];
                        int parameterCount2 = gVar3.f12691d;
                        h hVar4 = hVar2;
                        Constructor constructor = gVar3.f12688a;
                        if (parameterCount2 < 0) {
                            parameterCount2 = constructor.getParameterCount();
                            gVar3.f12691d = parameterCount2;
                        }
                        if (parameterCount2 == 0) {
                            if (gVar != null) {
                                c0768d.f9541f = new C0767c(c0766b, gVar.f12688a, c0768d.f(gVar, gVar3), c0715pArr);
                                i18 = i18;
                                cls2 = cls4;
                                gVar = null;
                            } else {
                                i18 = i18;
                                cls2 = cls4;
                            }
                        } else if (arrayList != null) {
                            if (aArr2 == null) {
                                A[] aArr3 = new A[i];
                                int i19 = 0;
                                while (i19 < i) {
                                    int i20 = i19;
                                    aArr3[i20] = new A(((g) arrayList.get(i19)).f12688a);
                                    i19 = i20 + 1;
                                    cls4 = cls4;
                                }
                                aArr2 = aArr3;
                            }
                            cls2 = cls4;
                            A a7 = new A(constructor);
                            for (int i21 = 0; i21 < i; i21++) {
                                if (a7.equals(aArr2[i21])) {
                                    list.set(i21, c0768d.i((g) arrayList.get(i21), gVar3));
                                    break;
                                }
                            }
                        } else {
                            i18 = i18;
                            cls2 = cls4;
                        }
                        i18++;
                        hVar2 = hVar4;
                        cls4 = cls2;
                    }
                }
                hVar = hVar2;
                cls = cls4;
                if (gVar != null) {
                    c0768d.f9541f = new C0767c(c0766b, gVar.f12688a, c0768d.f(gVar, null), c0715pArr);
                }
                for (int i22 = 0; i22 < i; i22++) {
                    if (((C0767c) list.get(i22)) == null) {
                        list.set(i22, c0768d.i((g) arrayList.get(i22), null));
                    }
                }
                arrayList2 = null;
                while (i3 < r2) {
                    if (Modifier.isStatic(method.getModifiers())) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(method);
                    }
                }
                if (arrayList2 == null) {
                    list2 = Collections.EMPTY_LIST;
                } else {
                    size = arrayList2.size();
                    arrayList3 = new ArrayList(size);
                    while (i6 < size) {
                        arrayList3.add(null);
                    }
                    if (cls != null) {
                        aArr = null;
                        while (i9 < r10) {
                            if (Modifier.isStatic(method2.getModifiers())) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                if (aArr == null) {
                                    aArr = new A[size];
                                    while (i11 < size) {
                                        aArr[i11] = new A((Method) arrayList2.get(i11));
                                    }
                                }
                                a6 = new A(method2);
                                while (i10 < size) {
                                    if (a6.equals(aArr[i10])) {
                                        arrayList3.set(i10, c0768d.h((Method) arrayList2.get(i10), c0766b, method2));
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    i7 = 0;
                    while (i7 < size) {
                        if (((C0772h) arrayList3.get(i7)) == null) {
                            Method method4 = (Method) arrayList2.get(i7);
                            typeParameters = method4.getTypeParameters();
                            if (typeParameters.length != 0) {
                                i8 = size;
                                arrayList4 = arrayList2;
                                cls3 = cls5;
                                mVar = null;
                            } else {
                                i8 = size;
                                arrayList4 = arrayList2;
                                cls3 = cls5;
                                mVar = null;
                            }
                            if (mVar == null) {
                                c0495p = c0766b;
                            } else {
                                c0495p = new C0495p(this.f9529n, 9, mVar);
                            }
                            arrayList3.set(i7, c0768d.h(method4, c0495p, null));
                        } else {
                            i8 = size;
                            arrayList4 = arrayList2;
                            cls3 = cls5;
                        }
                        i7++;
                        size = i8;
                        arrayList2 = arrayList4;
                        cls5 = cls3;
                    }
                    list2 = arrayList3;
                }
                if (c0768d.f9539d) {
                    c0767c = (C0767c) c0768d.f9541f;
                    b6 = c0768d.f9577a;
                    if (c0767c != null) {
                        c0768d.f9541f = null;
                    }
                    size2 = list.size();
                    while (true) {
                        size2--;
                        if (size2 >= 0) {
                            break;
                            break;
                        }
                        if (b6.j0((AbstractC0771g) list.get(size2))) {
                            list.remove(size2);
                        }
                    }
                    size3 = list2.size();
                    while (true) {
                        size3--;
                        if (size3 >= 0) {
                            break;
                            break;
                        }
                        if (b6.j0((AbstractC0771g) list2.get(size3))) {
                            list2.remove(size3);
                        }
                    }
                }
                c0031p0 = new C0031p0((C0767c) c0768d.f9541f, list, list2, 25);
            }
            this.f9534s = c0031p0;
        }
        return c0031p0;
    }

    public final C0775k n() {
        u uVar;
        Class clsA;
        C0775k c0775k = this.f9535t;
        if (c0775k == null) {
            h hVar = this.i;
            if (hVar == null) {
                c0775k = new C0775k();
            } else {
                C0774j c0774j = new C0774j(this.f9528m, this.f9530o, this.f9532q);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Class cls = this.f9531p;
                Class cls2 = hVar.f7281k;
                c0774j.e(this, cls2, linkedHashMap, cls);
                Iterator it = this.f9527l.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    uVar = c0774j.f9552d;
                    Class clsA2 = null;
                    if (!zHasNext) {
                        break;
                    }
                    h hVar2 = (h) it.next();
                    if (uVar != null) {
                        clsA2 = uVar.a(hVar2.f7281k);
                    }
                    c0774j.e(new C0495p(this.f9529n, 9, hVar2.X()), hVar2.f7281k, linkedHashMap, clsA2);
                }
                if (uVar != null && (clsA = uVar.a(Object.class)) != null) {
                    c0774j.f(this, cls2, linkedHashMap, clsA);
                    if (c0774j.f9577a != null && !linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            A a6 = (A) entry.getKey();
                            if ("hashCode".equals(a6.f9472a) && a6.f9473b.length == 0) {
                                try {
                                    Method declaredMethod = Object.class.getDeclaredMethod(a6.f9472a, null);
                                    if (declaredMethod != null) {
                                        C0773i c0773i = (C0773i) entry.getValue();
                                        c0773i.f9551c = c0774j.c(c0773i.f9551c, declaredMethod.getDeclaredAnnotations());
                                        c0773i.f9550b = declaredMethod;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    c0775k = new C0775k();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        C0773i c0773i2 = (C0773i) entry2.getValue();
                        Method method = c0773i2.f9550b;
                        C0772h c0772h = method == null ? null : new C0772h(c0773i2.f9549a, method, c0773i2.f9551c.b(), null);
                        if (c0772h != null) {
                            linkedHashMap2.put(entry2.getKey(), c0772h);
                        }
                    }
                    C0775k c0775k2 = new C0775k();
                    c0775k2.f9554h = linkedHashMap2;
                    c0775k = c0775k2;
                }
            }
            this.f9535t = c0775k;
        }
        return c0775k;
    }

    public final List o() {
        Map mapE;
        List list = this.f9536u;
        if (list == null) {
            h hVar = this.i;
            if (hVar == null || (mapE = new C0768d(this.f9528m, this.f9529n, this.f9530o, this.f9532q).e(this, hVar)) == null) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList(mapE.size());
                for (C0770f c0770f : mapE.values()) {
                    arrayList.add(new C0769e(c0770f.f9543a, c0770f.f9544b, c0770f.f9545c.b()));
                }
                list = arrayList;
            }
            this.f9536u = list;
        }
        return list;
    }

    public final String toString() {
        return "[AnnotedClass " + this.f9525j.getName() + "]";
    }

    public C0766b(Class cls) {
        this.i = null;
        this.f9525j = cls;
        this.f9527l = Collections.EMPTY_LIST;
        this.f9531p = null;
        this.f9533r = q.f9560h;
        this.f9526k = m.f12529n;
        this.f9528m = null;
        this.f9530o = null;
        this.f9529n = null;
        this.f9532q = false;
    }
}
