package W4;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5628a;

    public /* synthetic */ i(int i, boolean z5) {
        this.f5628a = i;
    }

    public static i a(p009b2.i[] iVarArr) {
        if (iVarArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", iVarArr[0].getClass().getName(), Integer.valueOf(iVarArr.length)));
        }
        int iB = 0;
        for (p009b2.i iVar : iVarArr) {
            if (iVar.a()) {
                iB |= iVar.b();
            }
        }
        return new i(iB, false);
    }

    public i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("cid length must not be less than 0 bytes!");
        }
        this.f5628a = i;
    }
}
