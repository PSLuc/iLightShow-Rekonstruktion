package S;

/* JADX INFO: loaded from: classes.dex */
public final class q extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f4882k;

    public q(h hVar) {
        this.f4882k = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4880j;
        this.f4880j = i + 2;
        Object[] objArr = this.f4879h;
        return new b(this.f4882k, objArr[i], objArr[i + 1]);
    }
}
