package p117w;

import N.InterfaceC0203a0;
import S4.InterfaceC0369f;
import java.util.ArrayList;
import p084p4.x;
import p111u4.d;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC0369f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13383h;
    public final /* synthetic */ ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f13384j;

    public /* synthetic */ g(ArrayList arrayList, InterfaceC0203a0 interfaceC0203a0, int i) {
        this.f13383h = i;
        this.i = arrayList;
        this.f13384j = interfaceC0203a0;
    }

    @Override // S4.InterfaceC0369f
    public final Object m(Object obj, d dVar) {
        switch (this.f13383h) {
            case 0:
                l lVar = (l) obj;
                boolean z5 = lVar instanceof e;
                ArrayList arrayList = this.i;
                if (z5) {
                    arrayList.add(lVar);
                } else if (lVar instanceof f) {
                    arrayList.remove(((f) lVar).f13382a);
                }
                this.f13384j.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                l lVar2 = (l) obj;
                boolean z6 = lVar2 instanceof i;
                ArrayList arrayList2 = this.i;
                if (z6) {
                    arrayList2.add(lVar2);
                } else if (lVar2 instanceof j) {
                    arrayList2.remove(((j) lVar2).f13388a);
                }
                this.f13384j.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
            default:
                l lVar3 = (l) obj;
                boolean z7 = lVar3 instanceof o;
                ArrayList arrayList3 = this.i;
                if (z7) {
                    arrayList3.add(lVar3);
                } else if (lVar3 instanceof p) {
                    arrayList3.remove(((p) lVar3).f13395a);
                } else if (lVar3 instanceof n) {
                    arrayList3.remove(((n) lVar3).f13393a);
                }
                this.f13384j.setValue(Boolean.valueOf(!arrayList3.isEmpty()));
                break;
        }
        return x.f10867a;
    }
}
