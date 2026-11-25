package S;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4881k;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4881k) {
            case 0:
                int i = this.f4880j;
                this.f4880j = i + 2;
                Object[] objArr = this.f4879h;
                return new a(objArr[i], objArr[i + 1]);
            case 1:
                int i3 = this.f4880j;
                this.f4880j = i3 + 2;
                return this.f4879h[i3];
            default:
                int i6 = this.f4880j;
                this.f4880j = i6 + 2;
                return this.f4879h[i6 + 1];
        }
    }
}
