package p109u2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f12700k = new j(1, 0, new Object[4]);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12701h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object[] f12702j;

    public j(int i, int i3, Object[] objArr) {
        this.f12701h = i;
        this.i = i3;
        this.f12702j = objArr;
    }

    public final Object a(String str) {
        int iHashCode = str.hashCode();
        int i = this.f12701h;
        int i3 = iHashCode & i;
        int i6 = i3 << 1;
        Object[] objArr = this.f12702j;
        Object obj = objArr[i6];
        if (obj == str || str.equals(obj)) {
            return objArr[i6 + 1];
        }
        if (obj == null) {
            return null;
        }
        int i7 = i + 1;
        int i8 = ((i3 >> 1) + i7) << 1;
        Object obj2 = objArr[i8];
        if (str.equals(obj2)) {
            return objArr[i8 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i9 = (i7 + (i7 >> 1)) << 1;
        int i10 = this.i + i9;
        while (i9 < i10) {
            Object obj3 = objArr[i9];
            if (obj3 == str || str.equals(obj3)) {
                return objArr[i9 + 1];
            }
            i9 += 2;
        }
        return null;
    }
}
