package L;

import S4.InterfaceC0369f;

/* JADX INFO: renamed from: L.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0177t implements InterfaceC0369f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2914h;
    public final /* synthetic */ X.s i;

    public /* synthetic */ C0177t(X.s sVar, int i) {
        this.f2914h = i;
        this.i = sVar;
    }

    @Override // S4.InterfaceC0369f
    public final Object m(Object obj, p111u4.d dVar) {
        switch (this.f2914h) {
            case 0:
                p117w.l lVar = (p117w.l) obj;
                boolean z5 = lVar instanceof p117w.i;
                X.s sVar = this.i;
                if (z5) {
                    sVar.add(lVar);
                } else if (lVar instanceof p117w.j) {
                    sVar.remove(((p117w.j) lVar).f13388a);
                } else if (lVar instanceof p117w.e) {
                    sVar.add(lVar);
                } else if (lVar instanceof p117w.f) {
                    sVar.remove(((p117w.f) lVar).f13382a);
                } else if (lVar instanceof p117w.o) {
                    sVar.add(lVar);
                } else if (lVar instanceof p117w.p) {
                    sVar.remove(((p117w.p) lVar).f13395a);
                } else if (lVar instanceof p117w.n) {
                    sVar.remove(((p117w.n) lVar).f13393a);
                }
                break;
            default:
                p117w.l lVar2 = (p117w.l) obj;
                boolean z6 = lVar2 instanceof p117w.o;
                X.s sVar2 = this.i;
                if (z6) {
                    sVar2.add(lVar2);
                } else if (lVar2 instanceof p117w.p) {
                    sVar2.remove(((p117w.p) lVar2).f13395a);
                } else if (lVar2 instanceof p117w.n) {
                    sVar2.remove(((p117w.n) lVar2).f13393a);
                } else if (lVar2 instanceof p117w.b) {
                    sVar2.add(lVar2);
                } else if (lVar2 instanceof p117w.c) {
                    sVar2.remove(((p117w.c) lVar2).f13381a);
                } else if (lVar2 instanceof p117w.a) {
                    sVar2.remove(((p117w.a) lVar2).f13380a);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
