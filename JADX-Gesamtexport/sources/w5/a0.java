package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f13563d = new Q(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13566c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.f13564a);
        byteBuffer.putLong(this.f13565b);
        byteBuffer.putLong(this.f13566c);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 24;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 35;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f13564a == a0Var.f13564a && this.f13565b == a0Var.f13565b && this.f13566c == a0Var.f13566c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateInfo : time:" + this.f13564a + ", uptime:" + this.f13565b + ", downtime:" + this.f13566c + ", ";
    }
}
