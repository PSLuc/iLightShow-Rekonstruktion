package R;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f4722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f4724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4725m;

    public h(f fVar, int i) {
        super(i, fVar.f4719o);
        this.f4722j = fVar;
        this.f4723k = fVar.k();
        this.f4725m = -1;
        b();
    }

    public final void a() {
        if (this.f4723k != this.f4722j.k()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // R.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.f4706h;
        f fVar = this.f4722j;
        fVar.add(i, obj);
        this.f4706h++;
        this.i = fVar.c();
        this.f4723k = fVar.k();
        this.f4725m = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        f fVar = this.f4722j;
        Object[] objArr = fVar.f4717m;
        if (objArr == null) {
            this.f4724l = null;
            return;
        }
        int i = (fVar.f4719o - 1) & (-32);
        int i3 = this.f4706h;
        if (i3 > i) {
            i3 = i;
        }
        int i6 = (fVar.f4715k / 5) + 1;
        j jVar = this.f4724l;
        if (jVar == null) {
            this.f4724l = new j(objArr, i3, i, i6);
            return;
        }
        jVar.f4706h = i3;
        jVar.i = i;
        jVar.f4727j = i6;
        if (jVar.f4728k.length < i6) {
            jVar.f4728k = new Object[i6];
        }
        jVar.f4728k[0] = objArr;
        ?? r6 = i3 == i ? 1 : 0;
        jVar.f4729l = r6;
        jVar.b(i3 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f4706h;
        this.f4725m = i;
        j jVar = this.f4724l;
        f fVar = this.f4722j;
        if (jVar == null) {
            Object[] objArr = fVar.f4718n;
            this.f4706h = i + 1;
            return objArr[i];
        }
        if (jVar.hasNext()) {
            this.f4706h++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f4718n;
        int i3 = this.f4706h;
        this.f4706h = i3 + 1;
        return objArr2[i3 - jVar.i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f4706h;
        this.f4725m = i - 1;
        j jVar = this.f4724l;
        f fVar = this.f4722j;
        if (jVar == null) {
            Object[] objArr = fVar.f4718n;
            int i3 = i - 1;
            this.f4706h = i3;
            return objArr[i3];
        }
        int i6 = jVar.i;
        if (i <= i6) {
            this.f4706h = i - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f4718n;
        int i7 = i - 1;
        this.f4706h = i7;
        return objArr2[i7 - i6];
    }

    @Override // R.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.f4725m;
        if (i == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f4722j;
        fVar.g(i);
        int i3 = this.f4725m;
        if (i3 < this.f4706h) {
            this.f4706h = i3;
        }
        this.i = fVar.c();
        this.f4723k = fVar.k();
        this.f4725m = -1;
        b();
    }

    @Override // R.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.f4725m;
        if (i == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f4722j;
        fVar.set(i, obj);
        this.f4723k = fVar.k();
        b();
    }
}
