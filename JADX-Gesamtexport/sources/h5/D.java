package h5;

/* JADX INFO: loaded from: classes.dex */
public final class D implements M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0734l f9311h;
    public final C0732j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H f9312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9315m;

    public D(InterfaceC0734l interfaceC0734l) {
        this.f9311h = interfaceC0734l;
        C0732j c0732jA = interfaceC0734l.a();
        this.i = c0732jA;
        H h6 = c0732jA.f9351h;
        this.f9312j = h6;
        this.f9313k = h6 != null ? h6.f9322b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9314l = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f9322b) goto L15;
     */
    @Override // h5.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(h5.C0732j r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            E4.k.f(r0, r9)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f9314l
            if (r3 != 0) goto L63
            h5.H r3 = r8.f9312j
            h5.j r4 = r8.i
            if (r3 == 0) goto L2b
            h5.H r5 = r4.f9351h
            if (r3 != r5) goto L23
            int r3 = r8.f9313k
            E4.k.c(r5)
            int r5 = r5.f9322b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            r8.<init>(r9)
            throw r8
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f9315m
            r2 = 1
            long r0 = r0 + r2
            h5.l r2 = r8.f9311h
            boolean r0 = r2.e(r0)
            if (r0 != 0) goto L3e
            r8 = -1
            return r8
        L3e:
            h5.H r0 = r8.f9312j
            if (r0 != 0) goto L4c
            h5.H r0 = r4.f9351h
            if (r0 == 0) goto L4c
            r8.f9312j = r0
            int r0 = r0.f9322b
            r8.f9313k = r0
        L4c:
            long r0 = r4.i
            long r2 = r8.f9315m
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            h5.j r2 = r8.i
            long r3 = r8.f9315m
            r5 = r9
            r2.k(r3, r5, r6)
            long r9 = r8.f9315m
            long r9 = r9 + r6
            r8.f9315m = r9
            return r6
        L63:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            r8.<init>(r9)
            throw r8
        L6b:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = B.AbstractC0013g0.h(r8, r10)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.D.read(h5.j, long):long");
    }

    @Override // h5.M
    public final P timeout() {
        return this.f9311h.timeout();
    }
}
