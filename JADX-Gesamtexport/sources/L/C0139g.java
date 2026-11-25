package L;

import N.C0230o;

/* JADX INFO: renamed from: L.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0139g extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2735h;
    public final /* synthetic */ V.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.a f2736j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0139g(V.a aVar, V.a aVar2, int i) {
        super(2);
        this.f2735h = i;
        this.i = aVar;
        this.f2736j = aVar2;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        p084p4.x xVar = p084p4.x.f10867a;
        int i = 0;
        V.a aVar = this.i;
        V.a aVar2 = this.f2736j;
        switch (this.f2735h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    c0230o.W(-1969500671);
                    if (aVar != null) {
                        aVar.d(c0230o, 0);
                    }
                    c0230o.p(false);
                    aVar2.d(c0230o, 0);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    float f6 = AbstractC0151k.f2807a;
                    AbstractC0136f.b(V.b.b(c0230o2, -909933713, new C0139g(aVar, aVar2, i)), c0230o2, 438);
                }
                break;
        }
        return xVar;
    }
}
