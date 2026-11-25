package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f13611d = new Q(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13614c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.f13612a);
        byteBuffer.putLong(this.f13613b);
        byteBuffer.putInt(this.f13614c);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 20;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 19;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (this.f13612a == j0Var.f13612a && this.f13613b == j0Var.f13613b && this.f13614c == j0Var.f13614c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateWifiFirmware : build:" + this.f13612a + ", reserved:" + this.f13613b + ", version:" + this.f13614c + ", ";
    }
}
