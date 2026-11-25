package p130y0;

import E0.l;
import java.util.Comparator;
import p030f0.d;
import p084p4.h;

/* JADX INFO: renamed from: y0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1164x implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1164x f14541b = new C1164x(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1164x f14542c = new C1164x(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1164x f14543d = new C1164x(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14544a;

    public /* synthetic */ C1164x(int i) {
        this.f14544a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14544a) {
            case 0:
                d dVarF = ((l) obj).f();
                d dVarF2 = ((l) obj2).f();
                int iCompare = Float.compare(dVarF.f8839a, dVarF2.f8839a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(dVarF.f8840b, dVarF2.f8840b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(dVarF.f8842d, dVarF2.f8842d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(dVarF.f8841c, dVarF2.f8841c);
            case 1:
                d dVarF3 = ((l) obj).f();
                d dVarF4 = ((l) obj2).f();
                int iCompare4 = Float.compare(dVarF4.f8841c, dVarF3.f8841c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(dVarF3.f8840b, dVarF4.f8840b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(dVarF3.f8842d, dVarF4.f8842d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(dVarF4.f8839a, dVarF3.f8839a);
            default:
                h hVar = (h) obj;
                h hVar2 = (h) obj2;
                int iCompare7 = Float.compare(((d) hVar.f10849h).f8840b, ((d) hVar2.f10849h).f8840b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((d) hVar.f10849h).f8842d, ((d) hVar2.f10849h).f8842d);
        }
    }
}
