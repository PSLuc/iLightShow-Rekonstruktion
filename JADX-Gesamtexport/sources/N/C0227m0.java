package N;

import java.util.ArrayList;
import java.util.Iterator;
import p058l0.C0827j;
import p058l0.C0828k;
import p096s.AbstractC0924q;

/* JADX INFO: renamed from: N.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0227m0 implements p096s.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f3729h;

    public C0227m0(float f6, float f7, AbstractC0924q abstractC0924q) {
        J4.d dVarD0 = p081p0.c.D0(0, abstractC0924q.b());
        ArrayList arrayList = new ArrayList(p089q4.n.P(dVarD0, 10));
        Iterator it = dVarD0.iterator();
        while (((J4.c) it).f1944j) {
            arrayList.add(new p096s.B(f6, f7, abstractC0924q.a(((p089q4.y) it).a())));
        }
        this.f3729h = arrayList;
    }

    public void a(int i) {
        ArrayList arrayList = this.f3729h;
        if (arrayList.isEmpty() || !(((Number) arrayList.get(0)).intValue() == i || ((Number) arrayList.get(arrayList.size() - 1)).intValue() == i)) {
            int size = arrayList.size();
            arrayList.add(Integer.valueOf(i));
            while (size > 0) {
                int i3 = ((size + 1) >>> 1) - 1;
                int iIntValue = ((Number) arrayList.get(i3)).intValue();
                if (i <= iIntValue) {
                    break;
                }
                arrayList.set(size, Integer.valueOf(iIntValue));
                size = i3;
            }
            arrayList.set(size, Integer.valueOf(i));
        }
    }

    public void b() {
        this.f3729h.add(C0827j.f10318c);
    }

    public void c(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f3729h.add(new C0828k(f6, f7, f8, f9, f10, f11));
    }

    public void d(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f3729h.add(new p058l0.s(f6, f7, f8, f9, f10, f11));
    }

    public void e(float f6) {
        this.f3729h.add(new p058l0.l(f6));
    }

    public void f(float f6) {
        this.f3729h.add(new p058l0.t(f6));
    }

    public void g(float f6, float f7) {
        this.f3729h.add(new p058l0.m(f6, f7));
    }

    @Override // p096s.r
    public p096s.A get(int i) {
        return (p096s.B) this.f3729h.get(i);
    }

    public void h(float f6, float f7) {
        this.f3729h.add(new p058l0.u(f6, f7));
    }

    public void i(float f6, float f7) {
        this.f3729h.add(new p058l0.n(f6, f7));
    }

    public void j(float f6, float f7, float f8, float f9) {
        this.f3729h.add(new p058l0.p(f6, f7, f8, f9));
    }

    public void k(float f6, float f7, float f8, float f9) {
        this.f3729h.add(new p058l0.x(f6, f7, f8, f9));
    }

    public int l() {
        int iIntValue;
        ArrayList arrayList = this.f3729h;
        if (arrayList.size() <= 0) {
            C0208d.w("Set is empty");
            throw null;
        }
        int iIntValue2 = ((Number) arrayList.get(0)).intValue();
        while (!arrayList.isEmpty() && ((Number) arrayList.get(0)).intValue() == iIntValue2) {
            arrayList.set(0, p089q4.l.f0(arrayList));
            arrayList.remove(arrayList.size() - 1);
            int size = arrayList.size();
            int size2 = arrayList.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int iIntValue3 = ((Number) arrayList.get(i)).intValue();
                int i3 = (i + 1) * 2;
                int i6 = i3 - 1;
                int iIntValue4 = ((Number) arrayList.get(i6)).intValue();
                if (i3 < size && (iIntValue = ((Number) arrayList.get(i3)).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    arrayList.set(i, Integer.valueOf(iIntValue));
                    arrayList.set(i3, Integer.valueOf(iIntValue3));
                    i = i3;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    arrayList.set(i, Integer.valueOf(iIntValue4));
                    arrayList.set(i6, Integer.valueOf(iIntValue3));
                    i = i6;
                }
            }
        }
        return iIntValue2;
    }

    public void m(float f6) {
        this.f3729h.add(new p058l0.A(f6));
    }

    public void n(float f6) {
        this.f3729h.add(new p058l0.z(f6));
    }

    public C0227m0(int i) {
        switch (i) {
            case 1:
                this.f3729h = new ArrayList();
                break;
            case 2:
                this.f3729h = new ArrayList(32);
                break;
            default:
                this.f3729h = new ArrayList();
                break;
        }
    }
}
