package L4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator, F4.a {
    public final Iterator i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f3107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f3108l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3105h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3106j = -1;

    public g(B4.b bVar) {
        this.f3108l = bVar;
        this.i = new p((i) bVar.f581b);
    }

    public void a() {
        boolean z5;
        Object next;
        do {
            Iterator it = this.i;
            z5 = false;
            if (!it.hasNext()) {
                this.f3106j = 0;
                return;
            }
            next = it.next();
            ((B4.b) this.f3108l).getClass();
            if (next == null) {
                z5 = true;
            }
        } while (z5);
        this.f3107k = next;
        this.f3106j = 1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [D4.c, E4.l] */
    public void b() {
        Iterator it = this.i;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((E4.l) ((i) this.f3108l).f3113b).invoke(next)).booleanValue()) {
                this.f3106j = 1;
                this.f3107k = next;
                return;
            }
        }
        this.f3106j = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3105h) {
            case 0:
                if (this.f3106j == -1) {
                    a();
                }
                return this.f3106j == 1;
            default:
                if (this.f3106j == -1) {
                    b();
                }
                return this.f3106j == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3105h) {
            case 0:
                if (this.f3106j == -1) {
                    a();
                }
                if (this.f3106j == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f3107k;
                this.f3107k = null;
                this.f3106j = -1;
                return obj;
            default:
                if (this.f3106j == -1) {
                    b();
                }
                if (this.f3106j == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f3107k;
                this.f3107k = null;
                this.f3106j = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3105h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(i iVar) {
        this.f3108l = iVar;
        this.i = ((j) iVar.f3114c).iterator();
    }
}
