package p113v0;

import java.util.ArrayList;
import java.util.List;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public interface F {
    default int a(InterfaceC1030m interfaceC1030m, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            int i6 = 1;
            arrayList.add(new C1027j((E) list.get(i3), i6, i6, 0));
        }
        return c(new C1032o(interfaceC1030m, interfaceC1030m.getLayoutDirection()), arrayList, c.u(0, i, 7)).f();
    }

    G c(H h6, List list, long j4);

    default int e(InterfaceC1030m interfaceC1030m, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C1027j((E) list.get(i3), 2, 1, 0));
        }
        return c(new C1032o(interfaceC1030m, interfaceC1030m.getLayoutDirection()), arrayList, c.u(0, i, 7)).f();
    }

    default int g(InterfaceC1030m interfaceC1030m, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            int i6 = 2;
            arrayList.add(new C1027j((E) list.get(i3), i6, i6, 0));
        }
        return c(new C1032o(interfaceC1030m, interfaceC1030m.getLayoutDirection()), arrayList, c.u(i, 0, 13)).d();
    }

    default int i(InterfaceC1030m interfaceC1030m, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C1027j((E) list.get(i3), 1, 2, 0));
        }
        return c(new C1032o(interfaceC1030m, interfaceC1030m.getLayoutDirection()), arrayList, c.u(i, 0, 13)).d();
    }
}
