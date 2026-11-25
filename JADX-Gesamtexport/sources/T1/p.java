package T1;

/* JADX INFO: loaded from: classes.dex */
public enum p implements p009b2.i {
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_SOURCE(g.AUTO_CLOSE_SOURCE),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT_DUPLICATE_DETECTION(g.STRICT_DUPLICATE_DETECTION),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNDEFINED(g.IGNORE_UNDEFINED),
    /* JADX INFO: Fake field, exist only in values array */
    INCLUDE_SOURCE_IN_LOCATION(g.INCLUDE_SOURCE_IN_LOCATION),
    USE_FAST_DOUBLE_PARSER(g.USE_FAST_DOUBLE_PARSER);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5245h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f5246j;

    p(g gVar) {
        this.f5246j = gVar;
        this.i = gVar.i;
        this.f5245h = gVar.f5207h;
    }

    @Override // p009b2.i
    public final boolean a() {
        return this.f5245h;
    }

    @Override // p009b2.i
    public final int b() {
        return this.i;
    }
}
