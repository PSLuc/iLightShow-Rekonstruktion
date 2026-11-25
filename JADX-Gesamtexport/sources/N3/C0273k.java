package N3;

import N.C0208d;
import N.C0230o;
import com.nanjoran.ilightshow.Views.PaletteEditorRoute;

/* JADX INFO: renamed from: N3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0273k implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4205h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C0273k(int i, int i3, Object obj) {
        this.f4205h = i3;
        this.i = obj;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        int i = this.f4205h;
        C0230o c0230o = (C0230o) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                p027e3.a.E((Z.o) this.i, c0230o, C0208d.V(7));
                break;
            case 1:
                K3.a aVar = (K3.a) this.i;
                E4.k.f("$device", aVar);
                S1.V.a(aVar, c0230o, C0208d.V(9));
                break;
            case 2:
                p020d2.n.e((D3.j) this.i, c0230o, C0208d.V(9));
                break;
            case 3:
                p123x.O o6 = (p123x.O) this.i;
                E4.k.f("$contentPadding", o6);
                P0.a(o6, c0230o, C0208d.V(1));
                break;
            default:
                PaletteEditorRoute paletteEditorRoute = (PaletteEditorRoute) this.i;
                E4.k.f("$paletteRoute", paletteEditorRoute);
                S1.V.k(paletteEditorRoute, c0230o, C0208d.V(1));
                break;
        }
        return p084p4.x.f10867a;
    }
}
