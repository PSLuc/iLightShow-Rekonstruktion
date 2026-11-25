package M4;

import B.AbstractC0013g0;
import S1.h0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f3534a;

    static {
        e eVar = new e();
        if (!h0.g("  ") && !h0.g("") && !h0.g("")) {
            h0.g("");
        }
        f3534a = eVar;
    }

    public final void a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        AbstractC0013g0.t(sb, str, "bytePrefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        String string = sb.toString();
        E4.k.e("toString(...)", string);
        return string;
    }
}
