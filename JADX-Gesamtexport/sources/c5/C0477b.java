package c5;

/* JADX INFO: renamed from: c5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0477b extends L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0477b(a5.g gVar, int i) {
        super(gVar);
        this.f7429b = i;
    }

    @Override // a5.g
    public final String b() {
        switch (this.f7429b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
