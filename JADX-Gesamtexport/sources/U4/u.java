package U4;

import P4.k0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends E4.l implements D4.e {
    public static final u i = new u(2, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u f5380j = new u(2, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u f5381k = new u(2, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5382h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i3, int i6) {
        super(i3);
        this.f5382h = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f5382h) {
            case 0:
                p111u4.g gVar = (p111u4.g) obj2;
                if (!(gVar instanceof k0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 1:
                k0 k0Var = (k0) obj;
                p111u4.g gVar2 = (p111u4.g) obj2;
                if (k0Var != null) {
                    return k0Var;
                }
                if (gVar2 instanceof k0) {
                    return (k0) gVar2;
                }
                return null;
            default:
                return (w) obj;
        }
    }
}
