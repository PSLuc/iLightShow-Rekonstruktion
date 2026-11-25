package T1;

import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f5182n = new f(V1.c.f5492j, -1, -1, -1, -1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5183h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V1.c f5186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient String f5187m;

    public f(V1.c cVar, long j4, long j6, int i, int i3) {
        this.f5186l = cVar == null ? V1.c.f5492j : cVar;
        this.f5183h = j4;
        this.i = j6;
        this.f5184j = i;
        this.f5185k = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        V1.c cVar = fVar.f5186l;
        V1.c cVar2 = this.f5186l;
        if (cVar2 == null) {
            if (cVar != null) {
                return false;
            }
        } else if (!cVar2.equals(cVar)) {
            return false;
        }
        return this.f5184j == fVar.f5184j && this.f5185k == fVar.f5185k && this.i == fVar.i && this.f5183h == fVar.f5183h;
    }

    public final int hashCode() {
        return ((((this.f5186l == null ? 1 : 2) ^ this.f5184j) + this.f5185k) ^ ((int) this.i)) + ((int) this.f5183h);
    }

    public final String toString() {
        String str;
        String str2 = this.f5187m;
        V1.c cVar = this.f5186l;
        boolean z5 = cVar.i;
        if (str2 == null) {
            StringBuilder sb = new StringBuilder(200);
            Object obj = cVar.f5493h;
            if (obj == null) {
                sb.append("UNKNOWN");
            } else {
                Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                String name = cls.getName();
                if (name.startsWith("java.")) {
                    name = cls.getSimpleName();
                } else if (obj instanceof byte[]) {
                    name = "byte[]";
                } else if (obj instanceof char[]) {
                    name = "char[]";
                }
                sb.append('(');
                sb.append(name);
                sb.append(')');
                if (z5) {
                    int[] iArr = {-1, -1};
                    String str3 = " chars";
                    if (obj instanceof CharSequence) {
                        CharSequence charSequence = (CharSequence) obj;
                        V1.c.a(iArr, charSequence.length());
                        int i = iArr[0];
                        str = charSequence.subSequence(i, Math.min(iArr[1], 500) + i).toString();
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        V1.c.a(iArr, cArr.length);
                        str = new String(cArr, iArr[0], Math.min(iArr[1], 500));
                    } else if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        V1.c.a(iArr, bArr.length);
                        str3 = " bytes";
                        str = new String(bArr, iArr[0], Math.min(iArr[1], 500), Charset.forName("UTF-8"));
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        sb.append('\"');
                        int length = str.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            char cCharAt = str.charAt(i3);
                            if (!Character.isISOControl(cCharAt) || cCharAt == '\r' || cCharAt == '\n') {
                                sb.append(cCharAt);
                            } else {
                                sb.append("\\u");
                                char[] cArr2 = V1.b.f5484a;
                                sb.append(cArr2[(cCharAt >> '\f') & 15]);
                                sb.append(cArr2[(cCharAt >> '\b') & 15]);
                                sb.append(cArr2[(cCharAt >> 4) & 15]);
                                sb.append(cArr2[cCharAt & 15]);
                            }
                        }
                        sb.append('\"');
                        if (iArr[1] > 500) {
                            sb.append("[truncated ");
                            sb.append(iArr[1] - 500);
                            sb.append(str3);
                            sb.append(']');
                        }
                    }
                } else if (obj instanceof byte[]) {
                    int length2 = ((byte[]) obj).length;
                    sb.append('[');
                    sb.append(length2);
                    sb.append(" bytes]");
                }
            }
            this.f5187m = sb.toString();
        }
        String str4 = this.f5187m;
        StringBuilder sb2 = new StringBuilder(str4.length() + 40);
        sb2.append("[Source: ");
        sb2.append(str4);
        sb2.append("; ");
        int i6 = this.f5185k;
        int i7 = this.f5184j;
        if (z5) {
            sb2.append("line: ");
            if (i7 >= 0) {
                sb2.append(i7);
            } else {
                sb2.append("UNKNOWN");
            }
            sb2.append(", column: ");
            if (i6 >= 0) {
                sb2.append(i6);
            } else {
                sb2.append("UNKNOWN");
            }
        } else if (i7 > 0) {
            sb2.append("line: ");
            sb2.append(i7);
            if (i6 > 0) {
                sb2.append(", column: ");
                sb2.append(i6);
            }
        } else {
            sb2.append("byte offset: #");
            long j4 = this.f5183h;
            if (j4 >= 0) {
                sb2.append(j4);
            } else {
                sb2.append("UNKNOWN");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
