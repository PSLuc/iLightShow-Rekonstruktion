package M4;

import B.AbstractC0013g0;
import S1.h0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f3535b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3536a = true;

    public f() {
        if (h0.g("")) {
            return;
        }
        h0.g("");
    }

    public final void a(StringBuilder sb, String str) {
        AbstractC0013g0.t(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        String string = sb.toString();
        E4.k.e("toString(...)", string);
        return string;
    }
}
