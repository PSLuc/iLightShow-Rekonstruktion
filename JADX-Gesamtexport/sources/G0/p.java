package G0;

import B.C0031p0;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Base64;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Closeable;
import java.lang.annotation.Annotation;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p implements s, N2.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1522h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f1523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f1524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f1525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f1526m;

    public p(p079o4.a aVar, p079o4.a aVar2, C0031p0 c0031p0, p079o4.a aVar3, p079o4.a aVar4) {
        this.f1522h = 2;
        this.f1523j = aVar;
        this.f1524k = aVar2;
        this.f1525l = c0031p0;
        this.f1526m = aVar3;
        this.i = aVar4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p4.f] */
    @Override // G0.s
    public float a() {
        return ((Number) this.f1525l.getValue()).floatValue();
    }

    @Override // G0.s
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((r) arrayList.get(i)).f1534a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p4.f] */
    @Override // G0.s
    public float c() {
        return ((Number) this.f1526m.getValue()).floatValue();
    }

    public void d(T1.i iVar, p015c2.f fVar, Object obj, int i, String str) throws MismatchedInputException {
        if (str == null) {
            fVar.getClass();
            throw new MismatchedInputException(fVar.f7252o, "Internal error in external Type Id handling: `null` type id passed");
        }
        p109u2.y yVarG0 = ((p109u2.A[]) this.i)[i].G0(iVar);
        T1.k kVarB0 = yVarG0.B0();
        T1.k kVar = T1.k.VALUE_NULL;
        p037g2.g[] gVarArr = (p037g2.g[]) this.f1524k;
        if (kVarB0 == kVar) {
            gVarArr[i].f9135a.z(obj, null);
            return;
        }
        p109u2.A aA0 = fVar.a0(iVar);
        aA0.l0();
        aA0.s0(str);
        aA0.I0(yVarG0);
        aA0.L();
        p109u2.y yVarG1 = aA0.G0(iVar);
        yVarG1.B0();
        gVarArr[i].f9135a.j(yVarG1, fVar, obj);
    }

    public boolean e(T1.i iVar, p015c2.f fVar, String str, Object obj, String str2, int i) throws MismatchedInputException {
        if (!str.equals(((p037g2.g[]) this.f1524k)[i].f9137c)) {
            return false;
        }
        if (obj != null) {
            p109u2.A[] aArr = (p109u2.A[]) this.i;
            if (aArr[i] != null) {
                d(iVar, fVar, obj, i, str2);
                aArr[i] = null;
                return true;
            }
        }
        ((String[]) this.f1526m)[i] = str2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi f(int i) {
        Bidi bidi;
        boolean[] zArr = (boolean[]) this.f1525l;
        boolean z5 = zArr[i];
        ArrayList arrayList = (ArrayList) this.f1524k;
        if (z5) {
            return (Bidi) arrayList.get(i);
        }
        ArrayList arrayList2 = (ArrayList) this.i;
        int iIntValue = i == 0 ? 0 : ((Number) arrayList2.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList2.get(i)).intValue();
        int i3 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f1526m;
        if (cArr == null || cArr.length < i3) {
            cArr = new char[i3];
        }
        char[] cArr2 = cArr;
        Layout layout = (Layout) this.f1523j;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i3)) {
            bidi = new Bidi(cArr2, 0, null, 0, i3, layout.getParagraphDirection(layout.getLineForOffset(l(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f1526m;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f1526m = cArr2;
        return bidi;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[SYNTHETIC] */
    public Object g(T1.i iVar, p015c2.f fVar, p037g2.z zVar, O1.u uVar) throws MismatchedInputException {
        p109u2.A a6;
        String str;
        Class cls;
        MismatchedInputException mismatchedInputException;
        p032f2.r rVar;
        p032f2.r rVar2;
        p109u2.y yVarG0;
        p037g2.g[] gVarArr = (p037g2.g[]) this.f1524k;
        int length = gVarArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            String str2 = ((String[]) this.f1526m)[i];
            p037g2.g gVar = gVarArr[i];
            Object objI = null;
            p015c2.h hVar = (p015c2.h) this.f1523j;
            p109u2.A[] aArr = (p109u2.A[]) this.i;
            String strC = str2;
            if (str2 != null) {
                a6 = aArr[i];
                if (a6 != null) {
                    yVarG0 = a6.G0(iVar);
                    if (yVarG0.B0() != T1.k.VALUE_NULL) {
                        p109u2.A aA0 = fVar.a0(iVar);
                        aA0.l0();
                        aA0.s0(strC);
                        aA0.I0(yVarG0);
                        aA0.L();
                        p109u2.y yVarG1 = aA0.G0(iVar);
                        yVarG1.B0();
                        objI = gVarArr[i].f9135a.i(yVarG1, fVar);
                    }
                    objArr[i] = objI;
                } else {
                    if (!fVar.B0(p015c2.g.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                        str = gVar.f9135a.f8933j.f7195h;
                        Object[] objArr2 = {str, gVarArr[i].f9137c};
                        cls = hVar.f7281k;
                        mismatchedInputException = new MismatchedInputException((Closeable) fVar.f7252o, String.format("Missing property '%s' for external type id '%s'", objArr2));
                        if (str != null) {
                            throw mismatchedInputException;
                        }
                        mismatchedInputException.e(str, cls);
                        throw mismatchedInputException;
                    }
                    p109u2.A aA1 = fVar.a0(iVar);
                    aA1.l0();
                    aA1.s0(strC);
                    aA1.L();
                    p109u2.y yVarG2 = aA1.G0(iVar);
                    yVarG2.B0();
                    objArr[i] = gVarArr[i].f9135a.i(yVarG2, fVar);
                }
                rVar = gVar.f9135a;
                if (rVar.n() >= 0) {
                    zVar.b(rVar, objArr[i]);
                    rVar2 = gVar.f9138d;
                    if (rVar2 == null && rVar2.n() >= 0) {
                        Object objDeserialize = strC;
                        if (!rVar2.f8934k.h0(String.class)) {
                            p109u2.A aA2 = fVar.a0(iVar);
                            aA2.s0(strC);
                            p015c2.j jVarR = rVar2.r();
                            p109u2.y yVarH0 = aA2.H0(aA2.i);
                            yVarH0.B0();
                            objDeserialize = jVarR.deserialize(yVarH0, fVar);
                        }
                        zVar.b(rVar2, objDeserialize);
                    }
                }
            } else {
                p109u2.A a7 = aArr[i];
                if (a7 != null && a7.f12661p.c(0) != T1.k.VALUE_NULL) {
                    p071n2.d dVar = gVar.f9136b;
                    if (((p077o2.a) dVar).f10628k == null) {
                        String str3 = gVar.f9135a.f8933j.f7195h;
                        Object[] objArr3 = {gVar.f9137c};
                        fVar.getClass();
                        Class cls2 = hVar.f7281k;
                        MismatchedInputException mismatchedInputException2 = new MismatchedInputException((Closeable) fVar.f7252o, String.format("Missing external type id property '%s'", objArr3));
                        if (str3 == null) {
                            throw mismatchedInputException2;
                        }
                        mismatchedInputException2.e(str3, cls2);
                        throw mismatchedInputException2;
                    }
                    p077o2.a aVar = (p077o2.a) dVar;
                    Annotation[] annotationArr = p109u2.i.f12697a;
                    p015c2.h hVar2 = aVar.f10628k;
                    Class cls3 = hVar2 == null ? null : hVar2.f7281k;
                    strC = cls3 == null ? null : aVar.f10626h.c(cls3, null);
                    a6 = aArr[i];
                    if (a6 != null) {
                        yVarG0 = a6.G0(iVar);
                        if (yVarG0.B0() != T1.k.VALUE_NULL) {
                            p109u2.A aA3 = fVar.a0(iVar);
                            aA3.l0();
                            aA3.s0(strC);
                            aA3.I0(yVarG0);
                            aA3.L();
                            p109u2.y yVarG3 = aA3.G0(iVar);
                            yVarG3.B0();
                            objI = gVarArr[i].f9135a.i(yVarG3, fVar);
                        }
                        objArr[i] = objI;
                    } else {
                        if (!fVar.B0(p015c2.g.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                            str = gVar.f9135a.f8933j.f7195h;
                            Object[] objArr4 = {str, gVarArr[i].f9137c};
                            cls = hVar.f7281k;
                            mismatchedInputException = new MismatchedInputException((Closeable) fVar.f7252o, String.format("Missing property '%s' for external type id '%s'", objArr4));
                            if (str != null) {
                                throw mismatchedInputException;
                            }
                            mismatchedInputException.e(str, cls);
                            throw mismatchedInputException;
                        }
                        p109u2.A aA4 = fVar.a0(iVar);
                        aA4.l0();
                        aA4.s0(strC);
                        aA4.L();
                        p109u2.y yVarG4 = aA4.G0(iVar);
                        yVarG4.B0();
                        objArr[i] = gVarArr[i].f9135a.i(yVarG4, fVar);
                    }
                    rVar = gVar.f9135a;
                    if (rVar.n() >= 0) {
                        zVar.b(rVar, objArr[i]);
                        rVar2 = gVar.f9138d;
                        if (rVar2 == null) {
                        }
                    }
                }
            }
        }
        Object objD = uVar.d(fVar, zVar);
        for (int i3 = 0; i3 < length; i3++) {
            p032f2.r rVar3 = gVarArr[i3].f9135a;
            if (rVar3.n() < 0) {
                rVar3.z(objD, objArr[i3]);
            }
        }
        return objD;
    }

    @Override // p079o4.a
    public Object get() {
        return new Q2.b((Executor) ((p079o4.a) this.f1523j).get(), (M2.f) ((p079o4.a) this.f1524k).get(), (R2.d) ((C0031p0) this.f1525l).get(), (S2.d) ((p079o4.a) this.f1526m).get(), (T2.b) ((p079o4.a) this.i).get());
    }

    public void h(T1.i iVar, p015c2.f fVar, Object obj) throws MismatchedInputException {
        T1.i iVar2;
        p015c2.f fVar2;
        Object obj2;
        p pVar;
        p037g2.g[] gVarArr = (p037g2.g[]) this.f1524k;
        int length = gVarArr.length;
        int i = 0;
        while (i < length) {
            String strC = ((String[]) this.f1526m)[i];
            p037g2.g gVar = gVarArr[i];
            p109u2.A[] aArr = (p109u2.A[]) this.i;
            if (strC == null) {
                p109u2.A a6 = aArr[i];
                if (a6 != null) {
                    if (a6.f12661p.c(0).f5237o) {
                        p109u2.y yVarG0 = a6.G0(iVar);
                        yVarG0.B0();
                        p032f2.r rVar = gVar.f9135a;
                        Object objA = p071n2.d.a(yVarG0, rVar.f8934k);
                        if (objA != null) {
                            rVar.z(obj, objA);
                        }
                    }
                    p071n2.d dVar = gVar.f9136b;
                    boolean z5 = ((p077o2.a) dVar).f10628k != null;
                    p032f2.r rVar2 = gVar.f9135a;
                    p015c2.h hVar = (p015c2.h) this.f1523j;
                    String str = gVar.f9137c;
                    p015c2.A a7 = rVar2.f8933j;
                    if (!z5) {
                        String str2 = a7.f7195h;
                        fVar.getClass();
                        Class cls = hVar.f7281k;
                        MismatchedInputException mismatchedInputException = new MismatchedInputException((Closeable) fVar.f7252o, String.format("Missing external type id property '%s' (and no 'defaultImpl' specified)", str));
                        if (str2 == null) {
                            throw mismatchedInputException;
                        }
                        mismatchedInputException.e(str2, cls);
                        throw mismatchedInputException;
                    }
                    p077o2.a aVar = (p077o2.a) dVar;
                    Annotation[] annotationArr = p109u2.i.f12697a;
                    p015c2.h hVar2 = aVar.f10628k;
                    Class cls2 = hVar2 == null ? null : hVar2.f7281k;
                    strC = cls2 == null ? null : aVar.f10626h.c(cls2, null);
                    if (strC == null) {
                        String str3 = a7.f7195h;
                        fVar.getClass();
                        Class cls3 = hVar.f7281k;
                        MismatchedInputException mismatchedInputException2 = new MismatchedInputException((Closeable) fVar.f7252o, String.format("Invalid default type id for property '%s': `null` returned by TypeIdResolver", str));
                        if (str3 == null) {
                            throw mismatchedInputException2;
                        }
                        mismatchedInputException2.e(str3, cls3);
                        throw mismatchedInputException2;
                    }
                }
                pVar = this;
                iVar2 = iVar;
                fVar2 = fVar;
                obj2 = obj;
                i++;
                this = pVar;
                iVar = iVar2;
                fVar = fVar2;
                obj = obj2;
            } else if (aArr[i] == null) {
                p032f2.r rVar3 = gVar.f9135a;
                if (rVar3.d() || fVar.B0(p015c2.g.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    Class<?> cls4 = obj.getClass();
                    String str4 = rVar3.f8933j.f7195h;
                    Object[] objArr = {str4, gVar.f9137c};
                    fVar.getClass();
                    MismatchedInputException mismatchedInputException3 = new MismatchedInputException((Closeable) fVar.f7252o, String.format("Missing property '%s' for external type id '%s'", objArr));
                    if (str4 == null) {
                        throw mismatchedInputException3;
                    }
                    mismatchedInputException3.e(str4, cls4);
                    throw mismatchedInputException3;
                }
                return;
            }
            iVar2 = iVar;
            fVar2 = fVar;
            obj2 = obj;
            String str5 = strC;
            pVar = this;
            pVar.d(iVar2, fVar2, obj2, i, str5);
            i++;
            this = pVar;
            iVar = iVar2;
            fVar = fVar2;
            obj = obj2;
        }
    }

    public float i(int i, boolean z5) {
        Layout layout = (Layout) this.f1523j;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z5 ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float j(int i, boolean z5, boolean z6) {
        int i3;
        int i6;
        if (!z6) {
            return i(i, z5);
        }
        Layout layout = (Layout) this.f1523j;
        int iC = H0.t.c(layout, i, z6);
        int lineStart = layout.getLineStart(iC);
        int lineEnd = layout.getLineEnd(iC);
        if (i != lineStart && i != lineEnd) {
            return i(i, z5);
        }
        if (i == 0 || i == layout.getText().length()) {
            return i(i, z5);
        }
        int iK = k(i, z6);
        boolean z7 = layout.getParagraphDirection(layout.getLineForOffset(l(iK))) == -1;
        int iO = o(lineEnd, lineStart);
        int iL = l(iK);
        int i7 = lineStart - iL;
        int i8 = iO - iL;
        Bidi bidiF = f(iK);
        Bidi bidiCreateLineBidi = bidiF != null ? bidiF.createLineBidi(i7, i8) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z5 || z7 == zIsRtlCharAt) {
                z7 = !z7;
            }
            return i == lineStart ? z7 : !z7 ? layout.getLineLeft(iC) : layout.getLineRight(iC);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        H0.m[] mVarArr = new H0.m[runCount];
        for (int i9 = 0; i9 < runCount; i9++) {
            mVarArr[i9] = new H0.m(bidiCreateLineBidi.getRunLevel(i9) % 2 == 1, bidiCreateLineBidi.getRunStart(i9) + lineStart, bidiCreateLineBidi.getRunLimit(i9) + lineStart);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i10 = 0; i10 < runCount2; i10++) {
            bArr[i10] = (byte) bidiCreateLineBidi.getRunLevel(i10);
        }
        Bidi.reorderVisually(bArr, 0, mVarArr, 0, runCount);
        if (i == lineStart) {
            int i11 = 0;
            while (true) {
                if (i11 >= runCount) {
                    i6 = -1;
                    break;
                }
                if (mVarArr[i11].f1702a == i) {
                    i6 = i11;
                    break;
                }
                i11++;
            }
            boolean z8 = (z5 || z7 == mVarArr[i6].f1704c) ? !z7 : z7;
            if (i6 == 0 && z8) {
                return layout.getLineLeft(iC);
            }
            if (i6 != runCount - 1 || z8) {
                return z8 ? layout.getPrimaryHorizontal(mVarArr[i6 - 1].f1702a) : layout.getPrimaryHorizontal(mVarArr[i6 + 1].f1702a);
            }
            return layout.getLineRight(iC);
        }
        int iO2 = i > iO ? o(i, lineStart) : i;
        int i12 = 0;
        while (true) {
            if (i12 >= runCount) {
                i3 = -1;
                break;
            }
            if (mVarArr[i12].f1703b == iO2) {
                i3 = i12;
                break;
            }
            i12++;
        }
        boolean z9 = (z5 || z7 == mVarArr[i3].f1704c) ? z7 : !z7;
        if (i3 == 0 && z9) {
            return layout.getLineLeft(iC);
        }
        if (i3 != runCount - 1 || z9) {
            return z9 ? layout.getPrimaryHorizontal(mVarArr[i3 - 1].f1703b) : layout.getPrimaryHorizontal(mVarArr[i3 + 1].f1703b);
        }
        return layout.getLineRight(iC);
    }

    public int k(int i, boolean z5) {
        ArrayList arrayList = (ArrayList) this.i;
        int iK = p089q4.m.K(arrayList, Integer.valueOf(i));
        int i3 = iK < 0 ? -(iK + 1) : iK + 1;
        if (z5 && i3 > 0) {
            int i6 = i3 - 1;
            if (i == ((Number) arrayList.get(i6)).intValue()) {
                return i6;
            }
        }
        return i3;
    }

    public int l(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.i).get(i - 1)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    public boolean m(T1.i iVar, p015c2.f fVar, Object obj, String str) throws MismatchedInputException {
        Object obj2 = ((HashMap) this.f1525l).get(str);
        if (obj2 == null) {
            return false;
        }
        boolean z5 = obj2 instanceof List;
        p037g2.g[] gVarArr = (p037g2.g[]) this.f1524k;
        p109u2.A[] aArr = (p109u2.A[]) this.i;
        String[] strArr = (String[]) this.f1526m;
        if (z5) {
            Iterator it = ((List) obj2).iterator();
            Integer num = (Integer) it.next();
            if (str.equals(gVarArr[num.intValue()].f9137c)) {
                String strI0 = iVar.i0();
                iVar.F0();
                strArr[num.intValue()] = strI0;
                while (it.hasNext()) {
                    strArr[((Integer) it.next()).intValue()] = strI0;
                }
            } else {
                p109u2.A aA0 = fVar.a0(iVar);
                aA0.I0(iVar);
                aArr[num.intValue()] = aA0;
                while (it.hasNext()) {
                    aArr[((Integer) it.next()).intValue()] = aA0;
                }
            }
        } else {
            int iIntValue = ((Integer) obj2).intValue();
            if (str.equals(gVarArr[iIntValue].f9137c)) {
                strArr[iIntValue] = iVar.q0();
                iVar.F0();
                if (obj != null && aArr[iIntValue] != null) {
                    String str2 = strArr[iIntValue];
                    strArr[iIntValue] = null;
                    d(iVar, fVar, obj, iIntValue, str2);
                    aArr[iIntValue] = null;
                }
            } else {
                p109u2.A aA1 = fVar.a0(iVar);
                aA1.I0(iVar);
                aArr[iIntValue] = aA1;
                if (obj != null && strArr[iIntValue] != null) {
                    String str3 = strArr[iIntValue];
                    strArr[iIntValue] = null;
                    d(iVar, fVar, obj, iIntValue, str3);
                    aArr[iIntValue] = null;
                }
            }
        }
        return true;
    }

    public void n(T1.i iVar, p015c2.f fVar, Object obj, String str) throws MismatchedInputException {
        Object obj2 = ((HashMap) this.f1525l).get(str);
        if (obj2 == null) {
            return;
        }
        String strI0 = iVar.i0();
        if (!(obj2 instanceof List)) {
            e(iVar, fVar, str, obj, strI0, ((Integer) obj2).intValue());
            return;
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            p pVar = this;
            T1.i iVar2 = iVar;
            p015c2.f fVar2 = fVar;
            Object obj3 = obj;
            String str2 = str;
            pVar.e(iVar2, fVar2, str2, obj3, strI0, ((Integer) it.next()).intValue());
            this = pVar;
            iVar = iVar2;
            fVar = fVar2;
            str = str2;
            obj = obj3;
        }
    }

    public int o(int i, int i3) {
        while (i > i3) {
            char cCharAt = ((Layout) this.f1523j).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((E4.k.h(cCharAt, 8192) < 0 || E4.k.h(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public String toString() {
        switch (this.f1522h) {
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f1523j) + ", mProviderPackage: " + ((String) this.f1525l) + ", mQuery: " + ((String) this.f1526m) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f1524k;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
                break;
            default:
                return super.toString();
        }
    }

    public p(Layout layout) {
        this.f1522h = 1;
        this.f1523j = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iF0 = M4.l.f0(((Layout) this.f1523j).getText(), '\n', length, 4);
            length = iF0 < 0 ? ((Layout) this.f1523j).getText().length() : iF0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f1523j).getText().length());
        this.i = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.f1524k = arrayList2;
        this.f1525l = new boolean[((ArrayList) this.i).size()];
        ((ArrayList) this.i).size();
    }

    public p(p015c2.h hVar, p037g2.g[] gVarArr, HashMap map) {
        this.f1522h = 4;
        this.f1523j = hVar;
        this.f1524k = gVarArr;
        this.f1525l = map;
        this.f1526m = null;
        this.i = null;
    }

    public p(C0110f c0110f, J j4, List list, S0.b bVar, L0.d dVar) {
        t tVar;
        String strSubstring;
        int i;
        int i3;
        C0110f c0110f2 = c0110f;
        J j6 = j4;
        int i6 = 1;
        this.f1522h = 0;
        this.f1523j = c0110f2;
        this.f1524k = list;
        p084p4.g gVar = p084p4.g.i;
        this.f1525l = G4.a.y(gVar, new o(this, i6));
        this.f1526m = G4.a.y(gVar, new o(this, 0));
        C0110f c0110f3 = AbstractC0111g.f1497a;
        int length = c0110f2.f1494h.length();
        List list2 = c0110f2.f1495j;
        list2 = list2 == null ? p089q4.u.f11237h : list2;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            tVar = j6.f1473b;
            if (i7 >= size) {
                break;
            }
            C0108d c0108d = (C0108d) list2.get(i7);
            t tVar2 = (t) c0108d.f1490a;
            int i9 = c0108d.f1491b;
            if (i9 != i8) {
                arrayList.add(new C0108d(i8, i9, tVar));
            }
            t tVarA = tVar.a(tVar2);
            int i10 = c0108d.f1492c;
            arrayList.add(new C0108d(i9, i10, tVarA));
            i7++;
            i8 = i10;
        }
        if (i8 != length) {
            arrayList.add(new C0108d(i8, length, tVar));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C0108d(0, 0, tVar));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            C0108d c0108d2 = (C0108d) arrayList.get(i11);
            int i12 = c0108d2.f1491b;
            int i13 = c0108d2.f1492c;
            if (i12 != i13) {
                strSubstring = c0110f2.f1494h.substring(i12, i13);
                E4.k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
            } else {
                strSubstring = "";
            }
            C0110f c0110f4 = new C0110f(strSubstring, AbstractC0111g.b(c0110f2, i12, i13), null, null);
            t tVar3 = (t) c0108d2.f1490a;
            int i14 = i6;
            J j7 = new J(j6.f1472a, tVar.a(tVar3.f1538b == Integer.MIN_VALUE ? new t(tVar3.f1537a, tVar.f1538b, tVar3.f1539c, tVar3.f1540d, tVar3.f1541e, tVar3.f1542f, tVar3.f1543g, tVar3.f1544h, tVar3.i) : tVar3));
            List listB = c0110f4.b();
            List list3 = (List) this.f1524k;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            int i15 = 0;
            while (true) {
                i = c0108d2.f1491b;
                if (i15 >= size3) {
                    break;
                }
                J j8 = j7;
                Object obj = list3.get(i15);
                List list4 = list3;
                C0108d c0108d3 = (C0108d) obj;
                int i16 = size2;
                if (AbstractC0111g.c(i, i13, c0108d3.f1491b, c0108d3.f1492c)) {
                    arrayList3.add(obj);
                }
                i15++;
                list3 = list4;
                j7 = j8;
                size2 = i16;
            }
            J j9 = j7;
            int i17 = size2;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int i18 = 0;
            for (int size4 = arrayList3.size(); i18 < size4; size4 = size4) {
                C0108d c0108d4 = (C0108d) arrayList3.get(i18);
                int i19 = c0108d4.f1491b;
                if (i <= i19 && (i3 = c0108d4.f1492c) <= i13) {
                    arrayList4.add(new C0108d(i19 - i, i3 - i, c0108d4.f1490a));
                    i18++;
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
            }
            arrayList2.add(new r(new O0.d(strSubstring, j9, listB, arrayList4, dVar, bVar), i, i13));
            i11++;
            c0110f2 = c0110f;
            j6 = j4;
            i6 = i14;
            size2 = i17;
        }
        this.i = arrayList2;
    }

    public p(p pVar) {
        this.f1522h = 4;
        this.f1523j = (p015c2.h) pVar.f1523j;
        p037g2.g[] gVarArr = (p037g2.g[]) pVar.f1524k;
        this.f1524k = gVarArr;
        this.f1525l = (HashMap) pVar.f1525l;
        int length = gVarArr.length;
        this.f1526m = new String[length];
        this.i = new p109u2.A[length];
    }

    public p(String str, String str2, String str3, List list) {
        this.f1522h = 3;
        str.getClass();
        this.f1523j = str;
        str2.getClass();
        this.f1525l = str2;
        this.f1526m = str3;
        list.getClass();
        this.f1524k = list;
        this.i = str + "-" + str2 + "-" + str3;
    }
}
