package q5;

/* JADX INFO: loaded from: classes.dex */
public enum l {
    MASTER_SECRET_LABEL(48, "master secret"),
    KEY_EXPANSION_LABEL(128, "key expansion"),
    CLIENT_FINISHED_LABEL(12, "client finished"),
    SERVER_FINISHED_LABEL(12, "server finished");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f11312h;
    public final int i;

    l(int i, String str) {
        this.f11312h = str.getBytes(m5.r.f10490a);
        this.i = i;
    }
}
