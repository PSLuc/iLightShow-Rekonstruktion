package e5;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f8797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f8798b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + b(i >> 12) + b(i >> 8) + b(i >> 4) + b(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f8797a = strArr;
        byte[] bArr = new byte[93];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr[i3] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f8798b = bArr;
    }

    public static final void a(StringBuilder sb, String str) {
        E4.k.f("value", str);
        sb.append('\"');
        int length = str.length();
        int i = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            String[] strArr = f8797a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) str, i, i3);
                sb.append(strArr[cCharAt]);
                i = i3 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final char b(int i) {
        int i3 = i & 15;
        return (char) (i3 < 10 ? i3 + 48 : i3 + 87);
    }
}
