package N3;

import N.C0208d;
import N.C0230o;
import c5.K;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: N3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0253a implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4149h;

    public /* synthetic */ C0253a(int i) {
        this.f4149h = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4149h) {
            case 0:
                ((Integer) obj2).getClass();
                com.fasterxml.jackson.databind.deser.std.d0.a(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 1:
                ((Integer) obj2).getClass();
                com.fasterxml.jackson.databind.deser.std.d0.a(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 2:
                ((Integer) obj2).getClass();
                p081p0.c.v(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 3:
                ((Integer) obj2).getClass();
                G4.a.b(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 4:
                ((Integer) obj2).getClass();
                S1.V.b(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 5:
                ((Integer) obj2).getClass();
                S1.h0.b(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 6:
                ((Integer) obj2).getClass();
                p006b.a.b(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC0599v0.c(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 8:
                ((Integer) obj2).getClass();
                p027e3.a.I(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 9:
                ((Integer) obj2).getClass();
                P0.b(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 10:
                ((Integer) obj2).getClass();
                p081p0.c.x(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 11:
                ((Integer) obj2).getClass();
                G4.a.d(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 12:
                ((Integer) obj2).getClass();
                S1.V.l(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 13:
                ((Integer) obj2).getClass();
                m1.b(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 14:
                ((Integer) obj2).getClass();
                m1.a(C0208d.V(1), (C0230o) obj);
                return p084p4.x.f10867a;
            case 15:
                K4.b bVar = (K4.b) obj;
                final List list = (List) obj2;
                E4.k.f("clazz", bVar);
                E4.k.f("types", list);
                ArrayList arrayListE = p006b.a.E(f5.a.f9006a, list, true);
                E4.k.c(arrayListE);
                final int i = 0;
                return p006b.a.x(bVar, arrayListE, new D4.a() { // from class: Y4.e
                    @Override // D4.a
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                break;
                        }
                        return ((K) list.get(0)).f7402a.b();
                    }
                });
            default:
                K4.b bVar2 = (K4.b) obj;
                final List list2 = (List) obj2;
                E4.k.f("clazz", bVar2);
                E4.k.f("types", list2);
                ArrayList arrayListE2 = p006b.a.E(f5.a.f9006a, list2, true);
                E4.k.c(arrayListE2);
                final int i3 = 1;
                Y4.a aVarX = p006b.a.x(bVar2, arrayListE2, new D4.a() { // from class: Y4.e
                    @Override // D4.a
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                break;
                        }
                        return ((K) list2.get(0)).f7402a.b();
                    }
                });
                if (aVarX != null) {
                    return AbstractC0599v0.B(aVarX);
                }
                return null;
        }
    }

    public /* synthetic */ C0253a(int i, int i3) {
        this.f4149h = i3;
    }
}
