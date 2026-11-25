package R;

import E4.k;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object[] f4728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4729l;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i, int i3, int i6) {
        super(i, i3);
        this.f4727j = i6;
        Object[] objArr2 = new Object[i6];
        this.f4728k = objArr2;
        ?? r6 = i == i3 ? 1 : 0;
        this.f4729l = r6;
        objArr2[0] = objArr;
        b(i - r6, 1);
    }

    public final Object a() {
        int i = this.f4706h & 31;
        Object obj = this.f4728k[this.f4727j - 1];
        k.d("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>", obj);
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i3) {
        int i6 = (this.f4727j - i3) * 5;
        while (i3 < this.f4727j) {
            Object[] objArr = this.f4728k;
            Object obj = objArr[i3 - 1];
            k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArr[i3] = ((Object[]) obj)[p006b.a.v(i, i6)];
            i6 -= 5;
            i3++;
        }
    }

    public final void c(int i) {
        int i3 = 0;
        while (p006b.a.v(this.f4706h, i3) == i) {
            i3 += 5;
        }
        if (i3 > 0) {
            b(this.f4706h, ((this.f4727j - 1) - (i3 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i = this.f4706h + 1;
        this.f4706h = i;
        if (i == this.i) {
            this.f4729l = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f4706h--;
        if (this.f4729l) {
            this.f4729l = false;
            return a();
        }
        c(31);
        return a();
    }
}
