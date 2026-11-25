package B4;

import E4.k;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f578h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f579j;

    public a(b bVar) {
        this.f579j = bVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f578h == null && !this.i) {
            String line = ((BufferedReader) this.f579j.f581b).readLine();
            this.f578h = line;
            if (line == null) {
                this.i = true;
            }
        }
        return this.f578h != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f578h;
        this.f578h = null;
        k.c(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
