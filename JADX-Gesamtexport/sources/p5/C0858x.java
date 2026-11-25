package p5;

/* JADX INFO: renamed from: p5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0858x extends AbstractC0859y {
    @Override // p5.AbstractC0859y
    public final byte[] b(i0 i0Var, byte[] bArr) {
        return bArr;
    }

    @Override // p5.AbstractC0859y
    public final byte[] c(i0 i0Var, byte[] bArr) {
        return bArr;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DtlsNullConnectionState:");
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\tCipher suite: ");
        sb.append(this.f11175h);
        sb.append(str);
        sb.append("\tCompression method: ");
        sb.append(this.i);
        return sb.toString();
    }
}
