package c5;

/* JADX INFO: renamed from: c5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0501w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f7499e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.g f7500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e5.f f7501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f7503d;

    public C0501w(a5.g gVar, e5.f fVar) {
        E4.k.f("descriptor", gVar);
        this.f7500a = gVar;
        this.f7501b = fVar;
        int iE = gVar.e();
        if (iE <= 64) {
            this.f7502c = iE != 64 ? (-1) << iE : 0L;
            this.f7503d = f7499e;
            return;
        }
        this.f7502c = 0L;
        int i = (iE - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iE & 63) != 0) {
            jArr[i - 1] = (-1) << iE;
        }
        this.f7503d = jArr;
    }
}
