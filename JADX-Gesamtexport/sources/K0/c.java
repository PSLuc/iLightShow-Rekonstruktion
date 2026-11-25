package K0;

import E4.k;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f2045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f2046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2047c;

    public final int a(int i, Object obj) {
        int i3 = this.f2047c;
        if (i3 == 0) {
            return -1;
        }
        int iA = a.a(i3, i, this.f2045a);
        if (iA < 0 || k.a(obj, this.f2046b[iA << 1])) {
            return iA;
        }
        int i6 = iA + 1;
        while (i6 < i3 && this.f2045a[i6] == i) {
            if (k.a(obj, this.f2046b[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iA - 1; i7 >= 0 && this.f2045a[i7] == i; i7--) {
            if (k.a(obj, this.f2046b[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public final int b() {
        int i = this.f2047c;
        if (i == 0) {
            return -1;
        }
        int iA = a.a(i, 0, this.f2045a);
        if (iA < 0 || this.f2046b[iA << 1] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i && this.f2045a[i3] == 0) {
            if (this.f2046b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f2045a[i6] == 0; i6--) {
            if (this.f2046b[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this != obj) {
            try {
                if (!(obj instanceof c)) {
                    if ((obj instanceof Map) && this.f2047c == ((Map) obj).size()) {
                        int i3 = this.f2047c;
                        for (0; i < i3; i + 1) {
                            Object[] objArr = this.f2046b;
                            int i6 = i << 1;
                            Object obj2 = objArr[i6];
                            Object obj3 = objArr[i6 + 1];
                            Object obj4 = ((Map) obj).get(obj2);
                            if (obj3 == null) {
                                i = (obj4 == null && ((Map) obj).containsKey(obj2)) ? i + 1 : 0;
                            } else if (obj3.equals(obj4)) {
                            }
                        }
                    }
                    return false;
                }
                c cVar = (c) obj;
                int i7 = this.f2047c;
                if (i7 == cVar.f2047c) {
                    for (int i8 = 0; i8 < i7; i8++) {
                        Object[] objArr2 = this.f2046b;
                        int i9 = i8 << 1;
                        Object obj5 = objArr2[i9];
                        Object obj6 = objArr2[i9 + 1];
                        int iB = obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5);
                        Object obj7 = iB >= 0 ? cVar.f2046b[(iB << 1) + 1] : null;
                        if (obj6 == null) {
                            if (obj7 == null) {
                                if ((obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5)) >= 0) {
                                }
                            }
                        } else if (obj6.equals(obj7)) {
                        }
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.f2045a;
        Object[] objArr = this.f2046b;
        int i = this.f2047c;
        int i3 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i3 += 2;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.f2047c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i3 = this.f2047c;
        for (int i6 = 0; i6 < i3; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            int i7 = i6 << 1;
            Object obj = this.f2046b[i7];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f2046b[i7 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
