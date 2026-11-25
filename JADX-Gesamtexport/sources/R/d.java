package R;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4708j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f4709k;

    public d(int i, int i3, Object[] objArr) {
        super(i, i3);
        this.f4709k = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f4708j) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f4706h;
                this.f4706h = i + 1;
                return ((Object[]) this.f4709k)[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f4706h++;
                return this.f4709k;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f4708j) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i = this.f4706h - 1;
                this.f4706h = i;
                return ((Object[]) this.f4709k)[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f4706h--;
                return this.f4709k;
        }
    }

    public d(int i, Object obj) {
        super(i, 1);
        this.f4709k = obj;
    }
}
