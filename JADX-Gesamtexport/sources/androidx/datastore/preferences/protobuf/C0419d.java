package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC0586o0;
import com.google.protobuf.C0639g;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0419d implements Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6850h = 0;
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6852k;

    public C0419d(AbstractC0586o0 abstractC0586o0) {
        this.f6852k = abstractC0586o0;
        this.f6851j = abstractC0586o0.i();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6850h) {
            case 0:
                return this.i < this.f6851j;
            case 1:
                return this.i < this.f6851j;
            default:
                return this.i < this.f6851j;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6850h) {
            case 0:
                int i = this.i;
                if (i >= this.f6851j) {
                    throw new NoSuchElementException();
                }
                this.i = i + 1;
                return Byte.valueOf(((C0422g) this.f6852k).k(i));
            case 1:
                int i3 = this.i;
                if (i3 >= this.f6851j) {
                    throw new NoSuchElementException();
                }
                this.i = i3 + 1;
                return Byte.valueOf(((AbstractC0586o0) this.f6852k).d(i3));
            default:
                int i6 = this.i;
                if (i6 >= this.f6851j) {
                    throw new NoSuchElementException();
                }
                this.i = i6 + 1;
                return Byte.valueOf(((C0639g) this.f6852k).k(i6));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6850h) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0419d(C0639g c0639g) {
        this.f6852k = c0639g;
        this.f6851j = c0639g.size();
    }

    public C0419d(C0422g c0422g) {
        this.f6852k = c0422g;
        this.f6851j = c0422g.size();
    }
}
