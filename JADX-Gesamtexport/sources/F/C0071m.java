package F;

import B.AbstractC0013g0;
import com.fasterxml.jackson.databind.deser.std.d0;

/* JADX INFO: renamed from: F.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0071m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1192e;

    public void a(S3.b bVar) {
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) this.f1192e;
        int i = this.f1189b;
        int iHashCode = bVar.hashCode() * (-1640531527);
        int i3 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj3 = objArr[i3];
        if (obj3 != null) {
            if (obj3.equals(bVar)) {
                return;
            }
            do {
                i3 = (i3 + 1) & i;
                obj2 = objArr[i3];
                if (obj2 == null) {
                }
            } while (!obj2.equals(bVar));
            return;
        }
        objArr[i3] = bVar;
        int i6 = this.f1190c + 1;
        this.f1190c = i6;
        if (i6 < this.f1191d) {
            return;
        }
        Object[] objArr2 = (Object[]) this.f1192e;
        int length = objArr2.length;
        int i7 = length << 1;
        int i8 = i7 - 1;
        Object[] objArr3 = new Object[i7];
        while (true) {
            int i9 = i6 - 1;
            if (i6 == 0) {
                this.f1189b = i8;
                this.f1191d = (int) (i7 * 0.75f);
                this.f1192e = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i10 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i8;
            if (objArr3[i10] != null) {
                do {
                    i10 = (i10 + 1) & i8;
                } while (objArr3[i10] != null);
            }
            objArr3[i10] = objArr2[length];
            i6 = i9;
        }
    }

    public C0072n b(int i) {
        return new C0072n(d0.r((G0.G) this.f1192e, i), i, 1L);
    }

    public int c() {
        return this.f1191d - this.f1190c;
    }

    public int d(int i) {
        return ((O.D) this.f1192e).f4343l[this.f1190c + i];
    }

    public Object e(int i) {
        return ((O.D) this.f1192e).f4345n[this.f1191d + i];
    }

    public void f(int i, int i3, Object[] objArr) {
        int i6;
        Object obj;
        this.f1190c--;
        while (true) {
            int i7 = i + 1;
            while (true) {
                i6 = i7 & i3;
                obj = objArr[i6];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i8 = (iHashCode ^ (iHashCode >>> 16)) & i3;
                    if (i > i6) {
                        if (i >= i8 && i8 > i6) {
                            break;
                        } else {
                            i7 = i6 + 1;
                        }
                    } else if (i >= i8 || i8 > i6) {
                        break;
                    } else {
                        i7 = i6 + 1;
                    }
                } else {
                    objArr[i] = null;
                    return;
                }
            }
            objArr[i] = obj;
            i = i6;
        }
    }

    public String toString() {
        switch (this.f1188a) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.f1189b;
                sb.append(i);
                sb.append('-');
                G0.G g6 = (G0.G) this.f1192e;
                sb.append(d0.r(g6, i));
                sb.append(',');
                int i3 = this.f1190c;
                sb.append(i3);
                sb.append('-');
                sb.append(d0.r(g6, i3));
                sb.append("), prevOffset=");
                return AbstractC0013g0.k(sb, this.f1191d, ')');
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    public C0071m(O.D d6) {
        this.f1188a = 2;
        this.f1192e = d6;
    }

    public C0071m(int i, int i3, int i6, G0.G g6) {
        this.f1188a = 0;
        this.f1189b = i;
        this.f1190c = i3;
        this.f1191d = i6;
        this.f1192e = g6;
    }
}
