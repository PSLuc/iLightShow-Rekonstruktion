package p095r4;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import p085q.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11786h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f11788k;

    public e() {
        if (b.i == null) {
            b.i = new b(11);
        }
    }

    public int a(int i) {
        if (i < this.f11787j) {
            return ((ByteBuffer) this.f11788k).getShort(this.i + i);
        }
        return 0;
    }

    public void b() {
        if (((f) this.f11788k).f11796o != this.f11787j) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.f11786h;
            f fVar = (f) this.f11788k;
            if (i >= fVar.f11794m || fVar.f11791j[i] >= 0) {
                return;
            } else {
                this.f11786h = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f11786h < ((f) this.f11788k).f11794m;
    }

    public void remove() {
        b();
        if (this.i == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        f fVar = (f) this.f11788k;
        fVar.b();
        fVar.l(this.i);
        this.i = -1;
        this.f11787j = fVar.f11796o;
    }
}
