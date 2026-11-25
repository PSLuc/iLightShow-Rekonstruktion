package p123x;

import S0.b;
import S0.k;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: x.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1069b implements InterfaceC1073f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13735a;

    public /* synthetic */ C1069b(int i) {
        this.f13735a = i;
    }

    public static final C1068a c(int i, String str) {
        WeakHashMap weakHashMap = b0.f13736u;
        return new C1068a(i, str);
    }

    public static final Z d(int i, String str) {
        WeakHashMap weakHashMap = b0.f13736u;
        return new Z(new H(0, 0, 0, 0), str);
    }

    @Override // p123x.InterfaceC1073f
    public void b(b bVar, int i, int[] iArr, k kVar, int[] iArr2) {
        switch (this.f13735a) {
            case 0:
                AbstractC1078k.b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC1078k.c(i, iArr, iArr2, false);
                break;
            case 2:
                if (kVar != k.f4897h) {
                    AbstractC1078k.b(iArr, iArr2, true);
                } else {
                    AbstractC1078k.c(i, iArr, iArr2, false);
                }
                break;
            default:
                if (kVar != k.f4897h) {
                    AbstractC1078k.c(i, iArr, iArr2, true);
                } else {
                    AbstractC1078k.b(iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f13735a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
