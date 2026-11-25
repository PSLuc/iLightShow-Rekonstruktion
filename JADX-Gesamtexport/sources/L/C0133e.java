package L;

import B.C0017i0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: L.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0133e implements p113v0.F {
    public static final void b(ArrayList arrayList, E4.u uVar, p113v0.H h6, ArrayList arrayList2, ArrayList arrayList3, E4.u uVar2, ArrayList arrayList4, E4.u uVar3, E4.u uVar4) {
        float f6 = AbstractC0151k.f2808b;
        if (!arrayList.isEmpty()) {
            uVar.f1072h = h6.H(f6) + uVar.f1072h;
        }
        arrayList.add(0, p089q4.l.s0(arrayList2));
        arrayList3.add(Integer.valueOf(uVar2.f1072h));
        arrayList4.add(Integer.valueOf(uVar.f1072h));
        uVar.f1072h += uVar2.f1072h;
        uVar3.f1072h = Math.max(uVar3.f1072h, uVar4.f1072h);
        arrayList2.clear();
        uVar4.f1072h = 0;
        uVar2.f1072h = 0;
    }

    @Override // p113v0.F
    public final p113v0.G c(p113v0.H h6, List list, long j4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        E4.u uVar = new E4.u();
        E4.u uVar2 = new E4.u();
        ArrayList arrayList4 = new ArrayList();
        E4.u uVar3 = new E4.u();
        E4.u uVar4 = new E4.u();
        int size = list.size();
        int i = 0;
        while (i < size) {
            p113v0.N nC = ((p113v0.E) list.get(i)).c(j4);
            boolean zIsEmpty = arrayList4.isEmpty();
            int i3 = size;
            float f6 = AbstractC0151k.f2807a;
            if (!zIsEmpty) {
                ArrayList arrayList5 = arrayList;
                if (h6.H(f6) + uVar3.f1072h + nC.f13137h <= S0.a.h(j4)) {
                    arrayList = arrayList5;
                } else {
                    float f7 = AbstractC0151k.f2807a;
                    arrayList = arrayList5;
                    b(arrayList, uVar2, h6, arrayList4, arrayList2, uVar4, arrayList3, uVar, uVar3);
                }
            }
            if (!arrayList4.isEmpty()) {
                uVar3.f1072h = h6.H(f6) + uVar3.f1072h;
            }
            arrayList4.add(nC);
            uVar3.f1072h += nC.f13137h;
            uVar4.f1072h = Math.max(uVar4.f1072h, nC.i);
            i++;
            size = i3;
        }
        if (!arrayList4.isEmpty()) {
            float f8 = AbstractC0151k.f2807a;
            b(arrayList, uVar2, h6, arrayList4, arrayList2, uVar4, arrayList3, uVar, uVar3);
        }
        int iMax = Math.max(uVar.f1072h, S0.a.j(j4));
        int iMax2 = Math.max(uVar2.f1072h, S0.a.i(j4));
        float f9 = AbstractC0151k.f2807a;
        return h6.u(iMax, iMax2, p089q4.v.f11238h, new C0017i0(arrayList, h6, iMax, arrayList3));
    }
}
