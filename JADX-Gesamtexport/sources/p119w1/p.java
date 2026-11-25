package p119w1;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f13442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f13443b;

    public p(int i) {
        this.f13442a = new SparseArray(i);
    }

    public final void a(s sVar, int i, int i3) {
        int iA = sVar.a(i);
        SparseArray sparseArray = this.f13442a;
        p pVar = sparseArray == null ? null : (p) sparseArray.get(iA);
        if (pVar == null) {
            pVar = new p(1);
            sparseArray.put(sVar.a(i), pVar);
        }
        if (i3 > i) {
            pVar.a(sVar, i + 1, i3);
        } else {
            pVar.f13443b = sVar;
        }
    }
}
