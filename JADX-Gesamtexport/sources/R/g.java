package R;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object[] f4720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f4721k;

    public g(Object[] objArr, Object[] objArr2, int i, int i3, int i6) {
        super(i, i3);
        this.f4720j = objArr2;
        int i7 = (i3 - 1) & (-32);
        this.f4721k = new j(objArr, i > i7 ? i7 : i, i7, i6);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f4721k;
        if (jVar.hasNext()) {
            this.f4706h++;
            return jVar.next();
        }
        int i = this.f4706h;
        this.f4706h = i + 1;
        return this.f4720j[i - jVar.i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f4706h;
        j jVar = this.f4721k;
        int i3 = jVar.i;
        if (i <= i3) {
            this.f4706h = i - 1;
            return jVar.previous();
        }
        int i6 = i - 1;
        this.f4706h = i6;
        return this.f4720j[i6 - i3];
    }
}
