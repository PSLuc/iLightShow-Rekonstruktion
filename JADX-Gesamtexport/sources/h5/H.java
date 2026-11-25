package h5;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H f9326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public H f9327g;

    public H() {
        this.f9321a = new byte[8192];
        this.f9325e = true;
        this.f9324d = false;
    }

    public final H a() {
        H h6 = this.f9326f;
        if (h6 == this) {
            h6 = null;
        }
        H h7 = this.f9327g;
        E4.k.c(h7);
        h7.f9326f = this.f9326f;
        H h8 = this.f9326f;
        E4.k.c(h8);
        h8.f9327g = this.f9327g;
        this.f9326f = null;
        this.f9327g = null;
        return h6;
    }

    public final void b(H h6) {
        E4.k.f("segment", h6);
        h6.f9327g = this;
        h6.f9326f = this.f9326f;
        H h7 = this.f9326f;
        E4.k.c(h7);
        h7.f9327g = h6;
        this.f9326f = h6;
    }

    public final H c() {
        this.f9324d = true;
        return new H(this.f9321a, this.f9322b, this.f9323c, true, false);
    }

    public final void d(H h6, int i) {
        E4.k.f("sink", h6);
        if (!h6.f9325e) {
            throw new IllegalStateException("only owner can write");
        }
        int i3 = h6.f9323c;
        int i6 = i3 + i;
        byte[] bArr = h6.f9321a;
        if (i6 > 8192) {
            if (h6.f9324d) {
                throw new IllegalArgumentException();
            }
            int i7 = h6.f9322b;
            if (i6 - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            p089q4.k.b0(0, i7, i3, bArr, bArr);
            h6.f9323c -= h6.f9322b;
            h6.f9322b = 0;
        }
        int i8 = h6.f9323c;
        int i9 = this.f9322b;
        p089q4.k.b0(i8, i9, i9 + i, this.f9321a, bArr);
        h6.f9323c += i;
        this.f9322b += i;
    }

    public H(byte[] bArr, int i, int i3, boolean z5, boolean z6) {
        E4.k.f("data", bArr);
        this.f9321a = bArr;
        this.f9322b = i;
        this.f9323c = i3;
        this.f9324d = z5;
        this.f9325e = z6;
    }
}
