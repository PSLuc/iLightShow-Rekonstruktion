package p026e2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f8702a;

    static {
        for (l lVar : l.values()) {
            lVar.getClass();
        }
        int iB = 0;
        for (m mVar : m.values()) {
            mVar.getClass();
            iB |= mVar.b();
        }
        f8702a = new j(0, iB);
    }
}
