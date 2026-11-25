package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f13622d = new Q(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f13624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1063v f13625c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13623a);
        byteBuffer.put(this.f13624b);
        this.f13625c.a(byteBuffer);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 10;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 503;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (this.f13623a == l0Var.f13623a && this.f13624b == l0Var.f13624b && E4.k.a(this.f13625c, l0Var.f13625c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateZone : count:" + ((int) this.f13623a) + ", index:" + ((int) this.f13624b) + ", color:" + this.f13625c + ", ";
    }
}
