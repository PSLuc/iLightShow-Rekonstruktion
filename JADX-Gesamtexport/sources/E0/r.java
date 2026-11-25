package E0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D4.e f999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1000c;

    public r(String str, D4.e eVar) {
        this.f998a = str;
        this.f999b = eVar;
    }

    public final void a(h hVar, Object obj) {
        hVar.i(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f998a;
    }

    public /* synthetic */ r(String str) {
        this(str, n.f963t);
    }

    public r(String str, boolean z5, D4.e eVar) {
        this(str, eVar);
        this.f1000c = z5;
    }
}
