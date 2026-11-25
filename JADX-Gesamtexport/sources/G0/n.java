package G0;

import F.C0074p;
import S1.h0;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.ArrayList;
import java.util.List;
import p015c2.AbstractC0473d;
import p035g0.AbstractC0712m;
import p035g0.C0713n;
import p035g0.InterfaceC0714o;
import p035g0.O;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f1513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f1519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1520h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public n(p pVar, long j4, int i, boolean z5) {
        boolean z6;
        int iG;
        this.f1513a = pVar;
        this.f1514b = i;
        if (S0.a.j(j4) != 0 || S0.a.i(j4) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) pVar.i;
        int size = arrayList2.size();
        int i3 = 0;
        int i6 = 0;
        float f6 = 0.0f;
        while (true) {
            if (i3 >= size) {
                z6 = false;
                break;
            }
            r rVar = (r) arrayList2.get(i3);
            O0.d dVar = rVar.f1534a;
            int iH = S0.a.h(j4);
            if (S0.a.c(j4)) {
                iG = S0.a.g(j4) - ((int) Math.ceil(f6));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                iG = S0.a.g(j4);
            }
            C0105a c0105a = new C0105a(dVar, this.f1514b - i6, z5, p081p0.c.u(iH, iG, 5));
            float fB = c0105a.b() + f6;
            H0.y yVar = c0105a.f1480d;
            int i7 = i6 + yVar.f1735f;
            arrayList.add(new q(c0105a, rVar.f1535b, rVar.f1536c, i6, i7, f6, fB));
            if (yVar.f1732c || (i7 == this.f1514b && i3 != p089q4.m.L((ArrayList) this.f1513a.i))) {
                z6 = true;
                i6 = i7;
                f6 = fB;
                break;
            } else {
                i3++;
                i6 = i7;
                f6 = fB;
            }
        }
        this.f1517e = f6;
        this.f1518f = i6;
        this.f1515c = z6;
        this.f1520h = arrayList;
        this.f1516d = S0.a.h(j4);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            q qVar = (q) arrayList.get(i8);
            ?? r7 = qVar.f1527a.f1482f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i9 = 0; i9 < size3; i9++) {
                p030f0.d dVar2 = (p030f0.d) r7.get(i9);
                arrayList4.add(dVar2 != null ? dVar2.h(p081p0.c.y(0.0f, qVar.f1532f)) : null);
            }
            p089q4.r.R(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f1513a.f1524k).size()) {
            int size4 = ((List) this.f1513a.f1524k).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList5.add(null);
            }
            arrayList3 = p089q4.l.j0(arrayList3, arrayList5);
        }
        this.f1519g = arrayList3;
    }

    public static void g(n nVar, InterfaceC0714o interfaceC0714o, long j4, p035g0.L l6, R0.j jVar, p044i0.e eVar) {
        interfaceC0714o.l();
        ArrayList arrayList = nVar.f1520h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q qVar = (q) arrayList.get(i);
            qVar.f1527a.f(interfaceC0714o, j4, l6, jVar, eVar);
            interfaceC0714o.g(0.0f, qVar.f1527a.b());
        }
        interfaceC0714o.i();
    }

    public static void h(n nVar, InterfaceC0714o interfaceC0714o, AbstractC0712m abstractC0712m, float f6, p035g0.L l6, R0.j jVar, p044i0.e eVar) {
        interfaceC0714o.l();
        ArrayList arrayList = nVar.f1520h;
        if (arrayList.size() <= 1 || (abstractC0712m instanceof O)) {
            O0.k.a(nVar, interfaceC0714o, abstractC0712m, f6, l6, jVar, eVar);
        } else if (abstractC0712m instanceof p035g0.K) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i = 0; i < size; i++) {
                q qVar = (q) arrayList.get(i);
                fB += qVar.f1527a.b();
                fMax = Math.max(fMax, qVar.f1527a.d());
            }
            Shader shaderB = ((p035g0.K) abstractC0712m).b(h0.f(fMax, fB));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                q qVar2 = (q) arrayList.get(i3);
                qVar2.f1527a.g(interfaceC0714o, new C0713n(shaderB), f6, l6, jVar, eVar);
                C0105a c0105a = qVar2.f1527a;
                interfaceC0714o.g(0.0f, c0105a.b());
                matrix.setTranslate(0.0f, -c0105a.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        interfaceC0714o.i();
    }

    public final void a(long j4, float[] fArr) {
        i(I.e(j4));
        j(I.d(j4));
        E4.u uVar = new E4.u();
        uVar.f1072h = 0;
        AbstractC0473d.v(this.f1520h, j4, new m(j4, fArr, uVar, new E4.t()));
    }

    public final float b(int i) {
        k(i);
        ArrayList arrayList = this.f1520h;
        q qVar = (q) arrayList.get(AbstractC0473d.t(i, arrayList));
        C0105a c0105a = qVar.f1527a;
        return c0105a.f1480d.e(i - qVar.f1530d) + qVar.f1532f;
    }

    public final int c(float f6) {
        ArrayList arrayList = this.f1520h;
        q qVar = (q) arrayList.get(AbstractC0473d.u(arrayList, f6));
        int i = qVar.f1529c - qVar.f1528b;
        int i3 = qVar.f1530d;
        if (i == 0) {
            return i3;
        }
        float f7 = f6 - qVar.f1532f;
        H0.y yVar = qVar.f1527a.f1480d;
        return yVar.f1734e.getLineForVertical(((int) f7) - yVar.f1736g) + i3;
    }

    public final float d(int i) {
        k(i);
        ArrayList arrayList = this.f1520h;
        q qVar = (q) arrayList.get(AbstractC0473d.t(i, arrayList));
        C0105a c0105a = qVar.f1527a;
        return c0105a.f1480d.g(i - qVar.f1530d) + qVar.f1532f;
    }

    public final int e(long j4) {
        ArrayList arrayList = this.f1520h;
        q qVar = (q) arrayList.get(AbstractC0473d.u(arrayList, p030f0.c.e(j4)));
        int i = qVar.f1529c;
        int i3 = qVar.f1528b;
        if (i - i3 == 0) {
            return i3;
        }
        long jY = p081p0.c.y(p030f0.c.d(j4), p030f0.c.e(j4) - qVar.f1532f);
        C0105a c0105a = qVar.f1527a;
        int iE = (int) p030f0.c.e(jY);
        H0.y yVar = c0105a.f1480d;
        int i6 = iE - yVar.f1736g;
        Layout layout = yVar.f1734e;
        int lineForVertical = layout.getLineForVertical(i6);
        return layout.getOffsetForHorizontal(lineForVertical, (yVar.b(lineForVertical) * (-1)) + p030f0.c.d(jY)) + i3;
    }

    public final long f(p030f0.d dVar, int i, C0074p c0074p) {
        long jA;
        long j4;
        ArrayList arrayList = this.f1520h;
        int iU = AbstractC0473d.u(arrayList, dVar.f8840b);
        float f6 = ((q) arrayList.get(iU)).f1533g;
        float f7 = dVar.f8842d;
        if (f6 >= f7 || iU == p089q4.m.L(arrayList)) {
            q qVar = (q) arrayList.get(iU);
            return qVar.a(qVar.f1527a.c(dVar.h(p081p0.c.y(0.0f, -qVar.f1532f)), i, c0074p), true);
        }
        int iU2 = AbstractC0473d.u(arrayList, f7);
        long jA2 = I.f1468b;
        while (true) {
            jA = I.f1468b;
            if (!I.a(jA2, jA) || iU > iU2) {
                break;
            }
            q qVar2 = (q) arrayList.get(iU);
            jA2 = qVar2.a(qVar2.f1527a.c(dVar.h(p081p0.c.y(0.0f, -qVar2.f1532f)), i, c0074p), true);
            iU++;
        }
        if (I.a(jA2, jA)) {
            return jA;
        }
        while (true) {
            j4 = I.f1468b;
            if (!I.a(jA, j4) || iU > iU2) {
                break;
            }
            q qVar3 = (q) arrayList.get(iU2);
            jA = qVar3.a(qVar3.f1527a.c(dVar.h(p081p0.c.y(0.0f, -qVar3.f1532f)), i, c0074p), true);
            iU2--;
        }
        return I.a(jA, j4) ? jA2 : AbstractC0599v0.d((int) (jA2 >> 32), (int) (4294967295L & jA));
    }

    public final void i(int i) {
        p pVar = this.f1513a;
        if (i < 0 || i >= ((C0110f) pVar.f1523j).f1494h.length()) {
            StringBuilder sbV = p012c.k.v(i, "offset(", ") is out of bounds [0, ");
            sbV.append(((C0110f) pVar.f1523j).f1494h.length());
            sbV.append(')');
            throw new IllegalArgumentException(sbV.toString().toString());
        }
    }

    public final void j(int i) {
        p pVar = this.f1513a;
        if (i < 0 || i > ((C0110f) pVar.f1523j).f1494h.length()) {
            StringBuilder sbV = p012c.k.v(i, "offset(", ") is out of bounds [0, ");
            sbV.append(((C0110f) pVar.f1523j).f1494h.length());
            sbV.append(']');
            throw new IllegalArgumentException(sbV.toString().toString());
        }
    }

    public final void k(int i) {
        int i3 = this.f1518f;
        if (i < 0 || i >= i3) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i3 + ')').toString());
        }
    }
}
