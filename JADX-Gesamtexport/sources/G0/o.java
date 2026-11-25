package G0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1521h;
    public final /* synthetic */ p i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i) {
        super(0);
        this.f1521h = i;
        this.i = pVar;
    }

    @Override // D4.a
    public final Object invoke() {
        Object obj;
        Object obj2;
        switch (this.f1521h) {
            case 0:
                ArrayList arrayList = (ArrayList) this.i.i;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float fB = ((r) obj3).f1534a.f4399p.b();
                    int iL = p089q4.m.L(arrayList);
                    int i = 1;
                    if (1 <= iL) {
                        while (true) {
                            Object obj4 = arrayList.get(i);
                            float fB2 = ((r) obj4).f1534a.f4399p.b();
                            if (Float.compare(fB, fB2) < 0) {
                                obj3 = obj4;
                                fB = fB2;
                            }
                            if (i != iL) {
                                i++;
                            }
                        }
                    }
                    obj = obj3;
                }
                r rVar = (r) obj;
                return Float.valueOf(rVar != null ? rVar.f1534a.f4399p.b() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.i.i;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float fA = ((r) obj5).f1534a.a();
                    int iL2 = p089q4.m.L(arrayList2);
                    int i3 = 1;
                    if (1 <= iL2) {
                        while (true) {
                            Object obj6 = arrayList2.get(i3);
                            float fA2 = ((r) obj6).f1534a.a();
                            if (Float.compare(fA, fA2) < 0) {
                                obj5 = obj6;
                                fA = fA2;
                            }
                            if (i3 != iL2) {
                                i3++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                r rVar2 = (r) obj2;
                return Float.valueOf(rVar2 != null ? rVar2.f1534a.a() : 0.0f);
        }
    }
}
