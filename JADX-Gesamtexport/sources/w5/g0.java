package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q f13594c = new Q(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L f13595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13596b;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13595a.f13510h);
        byteBuffer.putInt(this.f13596b);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 5;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f13595a == g0Var.f13595a && this.f13596b == g0Var.f13596b) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateService : service:" + this.f13595a + ", port:" + this.f13596b + ", ";
    }
}
