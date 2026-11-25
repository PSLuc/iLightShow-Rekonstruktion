package p009b2;

import V1.e;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f7082l = new char[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char[] f7084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f7087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char[] f7090h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public char[] f7092k;

    public m(a aVar) {
        this.f7083a = aVar;
    }

    public final void a(int i, String str, int i3) {
        if (this.f7085c >= 0) {
            p(i3);
        }
        this.f7091j = null;
        this.f7092k = null;
        char[] cArr = this.f7090h;
        int length = cArr.length;
        int i6 = this.i;
        int i7 = length - i6;
        if (i7 >= i3) {
            str.getChars(i, i + i3, cArr, i6);
            this.i += i3;
            return;
        }
        if (i7 > 0) {
            int i8 = i + i7;
            str.getChars(i, i8, cArr, i6);
            i3 -= i7;
            i = i8;
        }
        while (true) {
            i();
            int iMin = Math.min(this.f7090h.length, i3);
            int i9 = i + iMin;
            str.getChars(i, i9, this.f7090h, 0);
            this.i += iMin;
            i3 -= iMin;
            if (i3 <= 0) {
                return;
            } else {
                i = i9;
            }
        }
    }

    public final void b(char[] cArr, int i, int i3) {
        if (this.f7085c >= 0) {
            p(i3);
        }
        this.f7091j = null;
        this.f7092k = null;
        char[] cArr2 = this.f7090h;
        int length = cArr2.length;
        int i6 = this.i;
        int i7 = length - i6;
        if (i7 >= i3) {
            System.arraycopy(cArr, i, cArr2, i6, i3);
            this.i += i3;
            return;
        }
        if (i7 > 0) {
            System.arraycopy(cArr, i, cArr2, i6, i7);
            i += i7;
            i3 -= i7;
        }
        do {
            i();
            int iMin = Math.min(this.f7090h.length, i3);
            System.arraycopy(cArr, i, this.f7090h, 0, iMin);
            this.i += iMin;
            i += iMin;
            i3 -= iMin;
        } while (i3 > 0);
    }

    public final char[] c(int i) {
        a aVar = this.f7083a;
        return aVar != null ? aVar.a(2, i) : new char[Math.max(i, 500)];
    }

    public final void d() {
        this.f7088f = false;
        this.f7087e.clear();
        this.f7089g = 0;
        this.i = 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    public final char[] e() {
        int i;
        char[] cArrCopyOf = this.f7092k;
        if (cArrCopyOf == null) {
            String str = this.f7091j;
            if (str != null) {
                cArrCopyOf = str.toCharArray();
            } else {
                int i3 = this.f7085c;
                char[] cArr = f7082l;
                if (i3 >= 0) {
                    int i6 = this.f7086d;
                    if (i6 < 1) {
                        cArrCopyOf = cArr;
                    } else {
                        cArrCopyOf = i3 == 0 ? Arrays.copyOf(this.f7084b, i6) : Arrays.copyOfRange(this.f7084b, i3, i6 + i3);
                    }
                } else {
                    int iO = o();
                    if (iO < 1) {
                        cArrCopyOf = cArr;
                    } else {
                        cArrCopyOf = new char[iO];
                        ArrayList arrayList = this.f7087e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i = 0;
                            for (int i7 = 0; i7 < size; i7++) {
                                char[] cArr2 = (char[]) this.f7087e.get(i7);
                                int length = cArr2.length;
                                System.arraycopy(cArr2, 0, cArrCopyOf, i, length);
                                i += length;
                            }
                        } else {
                            i = 0;
                        }
                        System.arraycopy(this.f7090h, 0, cArrCopyOf, i, this.i);
                    }
                }
            }
            this.f7092k = cArrCopyOf;
        }
        return cArrCopyOf;
    }

    public final int f(boolean z5) {
        char[] cArr;
        int i = this.f7085c;
        if (i < 0 || (cArr = this.f7084b) == null) {
            return z5 ? -e.f(this.f7090h, 1, this.i - 1) : e.f(this.f7090h, 0, this.i);
        }
        return z5 ? -e.f(cArr, i + 1, this.f7086d - 1) : e.f(cArr, i, this.f7086d);
    }

    public final String g() {
        if (this.f7091j == null) {
            char[] cArr = this.f7092k;
            if (cArr != null) {
                this.f7091j = new String(cArr);
            } else {
                int i = this.f7085c;
                if (i >= 0) {
                    int i3 = this.f7086d;
                    if (i3 < 1) {
                        this.f7091j = "";
                        return "";
                    }
                    this.f7091j = new String(this.f7084b, i, i3);
                } else {
                    int i6 = this.f7089g;
                    int i7 = this.i;
                    if (i6 == 0) {
                        this.f7091j = i7 != 0 ? new String(this.f7090h, 0, i7) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i6 + i7);
                        ArrayList arrayList = this.f7087e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                char[] cArr2 = (char[]) this.f7087e.get(i8);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.f7090h, 0, this.i);
                        this.f7091j = sb.toString();
                    }
                }
            }
        }
        return this.f7091j;
    }

    public final char[] h() {
        this.f7085c = -1;
        this.i = 0;
        this.f7086d = 0;
        this.f7084b = null;
        this.f7091j = null;
        this.f7092k = null;
        if (this.f7088f) {
            d();
        }
        char[] cArr = this.f7090h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrC = c(0);
        this.f7090h = cArrC;
        return cArrC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026 A[PHI: r1
  0x0026: PHI (r1v8 int) = (r1v6 int), (r1v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void i() {
        if (this.f7087e == null) {
            this.f7087e = new ArrayList();
        }
        char[] cArr = this.f7090h;
        this.f7088f = true;
        this.f7087e.add(cArr);
        this.f7089g += cArr.length;
        this.i = 0;
        int length = cArr.length;
        int i = length + (length >> 1);
        int i3 = 500;
        if (i < 500) {
            i = i3;
        } else {
            i3 = 65536;
            if (i > 65536) {
                i = i3;
            }
        }
        this.f7090h = new char[i];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027 A[PHI: r1
  0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public final char[] j() {
        if (this.f7087e == null) {
            this.f7087e = new ArrayList();
        }
        this.f7088f = true;
        this.f7087e.add(this.f7090h);
        int length = this.f7090h.length;
        this.f7089g += length;
        this.i = 0;
        int i = length + (length >> 1);
        int i3 = 500;
        if (i < 500) {
            i = i3;
        } else {
            i3 = 65536;
            if (i > 65536) {
                i = i3;
            }
        }
        char[] cArr = new char[i];
        this.f7090h = cArr;
        return cArr;
    }

    public final char[] k() {
        if (this.f7085c >= 0) {
            p(1);
        } else {
            char[] cArr = this.f7090h;
            if (cArr == null) {
                this.f7090h = c(0);
            } else if (this.i >= cArr.length) {
                i();
            }
        }
        return this.f7090h;
    }

    public final char[] l() {
        if (this.f7085c >= 0) {
            return this.f7084b;
        }
        char[] cArr = this.f7092k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f7091j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f7092k = charArray;
            return charArray;
        }
        if (this.f7088f) {
            return e();
        }
        char[] cArr2 = this.f7090h;
        return cArr2 == null ? f7082l : cArr2;
    }

    public final void m() {
        char[] cArr;
        this.f7085c = -1;
        this.i = 0;
        this.f7086d = 0;
        this.f7084b = null;
        this.f7092k = null;
        if (this.f7088f) {
            d();
        }
        a aVar = this.f7083a;
        if (aVar == null || (cArr = this.f7090h) == null) {
            return;
        }
        this.f7090h = null;
        aVar.f7057b.set(2, cArr);
    }

    public final void n(char[] cArr, int i, int i3) {
        this.f7091j = null;
        this.f7092k = null;
        this.f7084b = cArr;
        this.f7085c = i;
        this.f7086d = i3;
        if (this.f7088f) {
            d();
        }
    }

    public final int o() {
        if (this.f7085c >= 0) {
            return this.f7086d;
        }
        char[] cArr = this.f7092k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f7091j;
        return str != null ? str.length() : this.f7089g + this.i;
    }

    public final void p(int i) {
        int i3 = this.f7086d;
        this.f7086d = 0;
        char[] cArr = this.f7084b;
        this.f7084b = null;
        int i6 = this.f7085c;
        this.f7085c = -1;
        int i7 = i + i3;
        char[] cArr2 = this.f7090h;
        if (cArr2 == null || i7 > cArr2.length) {
            this.f7090h = c(i7);
        }
        if (i3 > 0) {
            System.arraycopy(cArr, i6, this.f7090h, 0, i3);
        }
        this.f7089g = 0;
        this.i = i3;
    }

    public final String toString() {
        return g();
    }

    public m(char[] cArr) {
        this.f7083a = null;
        this.f7090h = cArr;
        this.i = cArr.length;
        this.f7085c = -1;
    }
}
