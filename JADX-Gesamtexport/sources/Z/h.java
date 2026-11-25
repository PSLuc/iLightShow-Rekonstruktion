package Z;

/* JADX INFO: loaded from: classes.dex */
public final class h extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f5952h = new h(2);

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        String str = (String) obj;
        m mVar = (m) obj2;
        if (str.length() == 0) {
            return mVar.toString();
        }
        return str + ", " + mVar;
    }
}
