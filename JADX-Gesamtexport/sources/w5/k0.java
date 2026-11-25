package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q f13616e = new Q(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f13620d;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putFloat(this.f13617a);
        byteBuffer.putInt(this.f13618b);
        byteBuffer.putInt(this.f13619c);
        byteBuffer.putShort(this.f13620d);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 14;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 17;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (this.f13617a == k0Var.f13617a && this.f13618b == k0Var.f13618b && this.f13619c == k0Var.f13619c && this.f13620d == k0Var.f13620d) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateWifiInfo : signal:" + this.f13617a + ", tx:" + this.f13618b + ", rx:" + this.f13619c + ", reserved:" + ((int) this.f13620d) + ", ";
    }
}
