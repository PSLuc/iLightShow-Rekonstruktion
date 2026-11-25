package T1;

/* JADX INFO: loaded from: classes.dex */
public enum o implements p009b2.i {
    DUPLICATE_PROPERTIES,
    /* JADX INFO: Fake field, exist only in values array */
    SCALARS_AS_OBJECTS,
    UNTYPED_SCALARS,
    /* JADX INFO: Fake field, exist only in values array */
    EXACT_FLOATS;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5242h = 1 << ordinal();

    o() {
    }

    @Override // p009b2.i
    public final boolean a() {
        return false;
    }

    @Override // p009b2.i
    public final int b() {
        return this.f5242h;
    }
}
