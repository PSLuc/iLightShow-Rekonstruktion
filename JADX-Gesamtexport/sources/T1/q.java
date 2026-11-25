package T1;

/* JADX INFO: loaded from: classes.dex */
public enum q implements p009b2.i {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5249h = 1 << ordinal();

    q() {
    }

    @Override // p009b2.i
    public final boolean a() {
        return false;
    }

    @Override // p009b2.i
    public final int b() {
        return this.f5249h;
    }
}
