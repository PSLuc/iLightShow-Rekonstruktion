package T1;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5216b;

    public j(j jVar) {
        this.f5215a = jVar.f5215a;
        this.f5216b = jVar.f5216b;
    }

    public abstract String a();

    public abstract Object b();

    public abstract j c();

    public final boolean d() {
        return this.f5215a == 1;
    }

    public final boolean e() {
        return this.f5215a == 2;
    }

    public final boolean f() {
        return this.f5215a == 0;
    }

    public abstract void g(Object obj);

    public final String h() {
        int i = this.f5215a;
        if (i == 0) {
            return "root";
        }
        if (i != 1) {
            return i != 2 ? "?" : "Object";
        }
        return "Array";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.f5215a;
        if (i != 0) {
            if (i != 1) {
                sb.append('{');
                String strA = a();
                if (strA != null) {
                    sb.append('\"');
                    int[] iArr = V1.b.f5491h;
                    int length = iArr.length;
                    int length2 = strA.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        char cCharAt = strA.charAt(i3);
                        if (cCharAt >= length || iArr[cCharAt] == 0) {
                            sb.append(cCharAt);
                        } else {
                            sb.append('\\');
                            int i6 = iArr[cCharAt];
                            if (i6 < 0) {
                                sb.append("u00");
                                char[] cArr = V1.b.f5484a;
                                sb.append(cArr[cCharAt >> 4]);
                                sb.append(cArr[cCharAt & 15]);
                            } else {
                                sb.append((char) i6);
                            }
                        }
                    }
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                sb.append('}');
            } else {
                sb.append('[');
                int i7 = this.f5216b;
                sb.append(i7 >= 0 ? i7 : 0);
                sb.append(']');
            }
        } else {
            sb.append("/");
        }
        return sb.toString();
    }

    public j(int i) {
        this.f5215a = i;
        this.f5216b = -1;
    }
}
