package M4;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f3537d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f3539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f3540c;

    static {
        e eVar = e.f3534a;
        f fVar = f.f3535b;
        f3537d = new g(false, eVar, fVar);
        new g(true, eVar, fVar);
    }

    public g(boolean z5, e eVar, f fVar) {
        E4.k.f("bytes", eVar);
        E4.k.f("number", fVar);
        this.f3538a = z5;
        this.f3539b = eVar;
        this.f3540c = fVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.f3538a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.f3539b.a(sb, "        ");
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f3540c.a(sb, "        ");
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        String string = sb.toString();
        E4.k.e("toString(...)", string);
        return string;
    }
}
