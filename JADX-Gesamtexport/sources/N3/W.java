package N3;

import N.C0208d;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4133h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4134j;

    public /* synthetic */ W(int i, int i3, Object obj, Object obj2) {
        this.f4133h = i3;
        this.i = obj;
        this.f4134j = obj2;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        int i = this.f4133h;
        C0230o c0230o = (C0230o) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                S1.V.j((K3.a) this.i, (D4.a) this.f4134j, c0230o, C0208d.V(57));
                break;
            default:
                D3.l lVar = (D3.l) this.i;
                E4.k.f("$room", lVar);
                p006b.a.g(lVar, (Z.o) this.f4134j, c0230o, C0208d.V(57));
                break;
        }
        return p084p4.x.f10867a;
    }
}
