package B;

import java.util.ArrayList;

/* JADX INFO: renamed from: B.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0014h extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f324h;
    public final /* synthetic */ ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0014h(int i, ArrayList arrayList) {
        super(1);
        this.f324h = i;
        this.i = arrayList;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f324h) {
            case 0:
                p113v0.M m6 = (p113v0.M) obj;
                ArrayList arrayList = this.i;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    p113v0.M.f(m6, (p113v0.N) arrayList.get(i), 0, 0);
                }
                break;
            case 1:
                String str = (String) obj;
                E4.k.f("it", str);
                this.i.add(str);
                break;
            case 2:
                p113v0.M m7 = (p113v0.M) obj;
                ArrayList arrayList2 = this.i;
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    p113v0.M.d(m7, (p113v0.N) arrayList2.get(i3), 0, 0);
                }
                break;
            case 3:
                p113v0.M m8 = (p113v0.M) obj;
                ArrayList arrayList3 = this.i;
                int size3 = arrayList3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    p113v0.M.f(m8, (p113v0.N) arrayList3.get(i6), 0, 0);
                }
                break;
            case 4:
                p113v0.M m9 = (p113v0.M) obj;
                ArrayList arrayList4 = this.i;
                int iL = p089q4.m.L(arrayList4);
                if (iL >= 0) {
                    int i7 = 0;
                    while (true) {
                        p113v0.M.f(m9, (p113v0.N) arrayList4.get(i7), 0, 0);
                        if (i7 != iL) {
                            i7++;
                        }
                    }
                }
                break;
            case 5:
                p113v0.M m10 = (p113v0.M) obj;
                ArrayList arrayList5 = this.i;
                int size4 = arrayList5.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    p113v0.M.d(m10, (p113v0.N) arrayList5.get(i8), 0, 0);
                }
                break;
            default:
                p113v0.M m11 = (p113v0.M) obj;
                ArrayList arrayList6 = this.i;
                int size5 = arrayList6.size();
                for (int i9 = 0; i9 < size5; i9++) {
                    p113v0.M.g(m11, (p113v0.N) arrayList6.get(i9), 0, 0);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
