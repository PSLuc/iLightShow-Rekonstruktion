package p037g2;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9170b;

    public y(y yVar, Object obj) {
        this.f9169a = yVar;
        this.f9170b = obj;
    }

    public abstract void a(Object obj);

    public abstract int[] b(int i);

    public int[] c(int i, int i3) {
        if (i < 0 || i3 < 0 || i == i3) {
            return null;
        }
        int[] iArr = (int[]) this.f9170b;
        iArr[0] = i;
        iArr[1] = i3;
        return iArr;
    }

    public String d() {
        String str = (String) this.f9169a;
        if (str != null) {
            return str;
        }
        k.m("text");
        throw null;
    }

    public abstract int[] e(int i);

    public y() {
        this.f9170b = new int[2];
    }
}
